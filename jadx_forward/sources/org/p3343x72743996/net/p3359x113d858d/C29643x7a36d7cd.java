package org.p3343x72743996.net.p3359x113d858d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.urlconnection.CronetInputStream */
/* loaded from: classes13.dex */
public class C29643x7a36d7cd extends java.io.InputStream {

    /* renamed from: READ_BUFFER_SIZE */
    private static final int f74915x4ce52f77 = 32768;

    /* renamed from: mBuffer */
    private java.nio.ByteBuffer f74916xfd47bb0d;

    /* renamed from: mException */
    private java.io.IOException f74917xd3071a62;

    /* renamed from: mHttpURLConnection */
    private final org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8 f74918x45542918;

    /* renamed from: mResponseDataCompleted */
    private boolean f74919xe6f0b893;

    public C29643x7a36d7cd(org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8 c29641x19eeafa8) {
        this.f74918x45542918 = c29641x19eeafa8;
    }

    /* renamed from: getMoreDataIfNeeded */
    private void m154321xea636067() {
        if (this.f74919xe6f0b893) {
            java.io.IOException iOException = this.f74917xd3071a62;
            if (iOException != null) {
                throw iOException;
            }
        } else {
            if (m154322x5053de33()) {
                return;
            }
            if (this.f74916xfd47bb0d == null) {
                this.f74916xfd47bb0d = java.nio.ByteBuffer.allocateDirect(32768);
            }
            this.f74918x45542918.m154317x6ec62a15(this.f74916xfd47bb0d);
            java.io.IOException iOException2 = this.f74917xd3071a62;
            if (iOException2 != null) {
                throw iOException2;
            }
            java.nio.ByteBuffer byteBuffer = this.f74916xfd47bb0d;
            if (byteBuffer != null) {
            }
        }
    }

    /* renamed from: hasUnreadData */
    private boolean m154322x5053de33() {
        java.nio.ByteBuffer byteBuffer = this.f74916xfd47bb0d;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }

    @Override // java.io.InputStream
    public int available() {
        if (!this.f74919xe6f0b893) {
            if (m154322x5053de33()) {
                return this.f74916xfd47bb0d.remaining();
            }
            return 0;
        }
        java.io.IOException iOException = this.f74917xd3071a62;
        if (iOException == null) {
            return 0;
        }
        throw iOException;
    }

    @Override // java.io.InputStream
    public int read() {
        m154321xea636067();
        if (m154322x5053de33()) {
            return this.f74916xfd47bb0d.get() & 255;
        }
        return -1;
    }

    /* renamed from: setResponseDataCompleted */
    public void m154323xedd77be(java.io.IOException iOException) {
        this.f74917xd3071a62 = iOException;
        this.f74919xe6f0b893 = true;
        this.f74916xfd47bb0d = null;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i17, int i18) {
        if (i17 < 0 || i18 < 0 || i17 + i18 > bArr.length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i18 == 0) {
            return 0;
        }
        m154321xea636067();
        if (!m154322x5053de33()) {
            return -1;
        }
        int min = java.lang.Math.min(this.f74916xfd47bb0d.limit() - this.f74916xfd47bb0d.position(), i18);
        this.f74916xfd47bb0d.get(bArr, i17, min);
        return min;
    }
}

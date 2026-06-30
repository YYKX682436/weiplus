package org.p3343x72743996.net.p3359x113d858d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.urlconnection.CronetBufferedOutputStream */
/* loaded from: classes13.dex */
public final class C29638xbfcf49dd extends org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e {

    /* renamed from: INITIAL_BUFFER_SIZE */
    private static final int f74875x7607dc05 = 16384;

    /* renamed from: mBuffer */
    private java.nio.ByteBuffer f74876xfd47bb0d;

    /* renamed from: mConnected */
    private boolean f74877x58313d1c;

    /* renamed from: mConnection */
    private final org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8 f74878xadf6772b;

    /* renamed from: mInitialContentLength */
    private final int f74879xe037dfe8;

    /* renamed from: mUploadDataProvider */
    private final org.p3343x72743996.net.AbstractC29560x8cb1347c f74880x1e3cd3a9 = new org.p3343x72743996.net.p3359x113d858d.C29638xbfcf49dd.UploadDataProviderImpl();

    /* renamed from: org.chromium.net.urlconnection.CronetBufferedOutputStream$UploadDataProviderImpl */
    /* loaded from: classes13.dex */
    public class UploadDataProviderImpl extends org.p3343x72743996.net.AbstractC29560x8cb1347c {
        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: getLength */
        public long mo153654x23255ddc() {
            if (org.p3343x72743996.net.p3359x113d858d.C29638xbfcf49dd.this.f74879xe037dfe8 == -1) {
                return org.p3343x72743996.net.p3359x113d858d.C29638xbfcf49dd.this.f74877x58313d1c ? org.p3343x72743996.net.p3359x113d858d.C29638xbfcf49dd.this.f74876xfd47bb0d.limit() : org.p3343x72743996.net.p3359x113d858d.C29638xbfcf49dd.this.f74876xfd47bb0d.position();
            }
            return org.p3343x72743996.net.p3359x113d858d.C29638xbfcf49dd.this.f74879xe037dfe8;
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: read */
        public void mo153655x355996(org.p3343x72743996.net.AbstractC29562xf1e0a9e abstractC29562xf1e0a9e, java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (remaining < org.p3343x72743996.net.p3359x113d858d.C29638xbfcf49dd.this.f74876xfd47bb0d.remaining()) {
                byteBuffer.put(org.p3343x72743996.net.p3359x113d858d.C29638xbfcf49dd.this.f74876xfd47bb0d.array(), org.p3343x72743996.net.p3359x113d858d.C29638xbfcf49dd.this.f74876xfd47bb0d.position(), remaining);
            } else {
                byteBuffer.put(org.p3343x72743996.net.p3359x113d858d.C29638xbfcf49dd.this.f74876xfd47bb0d);
            }
            abstractC29562xf1e0a9e.mo153663xf9a6d5cc(false);
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: rewind */
        public void mo153656xc84f6cbb(org.p3343x72743996.net.AbstractC29562xf1e0a9e abstractC29562xf1e0a9e) {
            abstractC29562xf1e0a9e.mo153665xe8a7e807();
        }

        private UploadDataProviderImpl() {
        }
    }

    public C29638xbfcf49dd(org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8 c29641x19eeafa8, long j17) {
        if (c29641x19eeafa8 == null) {
            throw new java.lang.NullPointerException("Argument connection cannot be null.");
        }
        if (j17 > 2147483647L) {
            throw new java.lang.IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        if (j17 >= 0) {
            this.f74878xadf6772b = c29641x19eeafa8;
            int i17 = (int) j17;
            this.f74879xe037dfe8 = i17;
            this.f74876xfd47bb0d = java.nio.ByteBuffer.allocate(i17);
            return;
        }
        throw new java.lang.IllegalArgumentException("Content length < 0.");
    }

    /* renamed from: ensureCanWrite */
    private void m154290x5db42c4d(int i17) {
        if (this.f74879xe037dfe8 != -1 && this.f74876xfd47bb0d.position() + i17 > this.f74879xe037dfe8) {
            throw new java.net.ProtocolException("exceeded content-length limit of " + this.f74879xe037dfe8 + " bytes");
        }
        if (this.f74877x58313d1c) {
            throw new java.lang.IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        }
        if (this.f74879xe037dfe8 == -1 && this.f74876xfd47bb0d.limit() - this.f74876xfd47bb0d.position() <= i17) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(java.lang.Math.max(this.f74876xfd47bb0d.capacity() * 2, this.f74876xfd47bb0d.capacity() + i17));
            allocate.put(this.f74876xfd47bb0d);
            this.f74876xfd47bb0d = allocate;
        }
    }

    @Override // org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e
    /* renamed from: checkReceivedEnoughContent */
    public void mo154291x45140060() {
    }

    @Override // org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e
    /* renamed from: getUploadDataProvider */
    public org.p3343x72743996.net.AbstractC29560x8cb1347c mo154292x3249da52() {
        return this.f74880x1e3cd3a9;
    }

    @Override // org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e
    /* renamed from: setConnected */
    public void mo154293x393b24c7() {
        this.f74877x58313d1c = true;
        if (this.f74876xfd47bb0d.position() < this.f74879xe037dfe8) {
            throw new java.net.ProtocolException("Content received is less than Content-Length");
        }
    }

    @Override // java.io.OutputStream
    public void write(int i17) {
        m154325x9e8331f7();
        m154290x5db42c4d(1);
        this.f74876xfd47bb0d.put((byte) i17);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        m154325x9e8331f7();
        m154290x5db42c4d(i18);
        this.f74876xfd47bb0d.put(bArr, i17, i18);
    }

    public C29638xbfcf49dd(org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8 c29641x19eeafa8) {
        c29641x19eeafa8.getClass();
        this.f74878xadf6772b = c29641x19eeafa8;
        this.f74879xe037dfe8 = -1;
        this.f74876xfd47bb0d = java.nio.ByteBuffer.allocate(16384);
    }
}

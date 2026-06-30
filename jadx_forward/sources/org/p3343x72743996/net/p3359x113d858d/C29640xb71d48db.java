package org.p3343x72743996.net.p3359x113d858d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.urlconnection.CronetFixedModeOutputStream */
/* loaded from: classes13.dex */
public final class C29640xb71d48db extends org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e {

    /* renamed from: sDefaultBufferLength */
    private static int f74888xc95870b4 = 16384;

    /* renamed from: mBuffer */
    private final java.nio.ByteBuffer f74889xfd47bb0d;

    /* renamed from: mBytesWritten */
    private long f74890x86e1d339;

    /* renamed from: mConnection */
    private final org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8 f74891xadf6772b;

    /* renamed from: mContentLength */
    private final long f74892x3ad36552;

    /* renamed from: mMessageLoop */
    private final org.p3343x72743996.net.p3359x113d858d.ExecutorC29646x2f5b872b f74893x75fef09e;

    /* renamed from: mUploadDataProvider */
    private final org.p3343x72743996.net.AbstractC29560x8cb1347c f74894x1e3cd3a9 = new org.p3343x72743996.net.p3359x113d858d.C29640xb71d48db.UploadDataProviderImpl();

    /* renamed from: org.chromium.net.urlconnection.CronetFixedModeOutputStream$UploadDataProviderImpl */
    /* loaded from: classes13.dex */
    public class UploadDataProviderImpl extends org.p3343x72743996.net.AbstractC29560x8cb1347c {
        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: getLength */
        public long mo153654x23255ddc() {
            return org.p3343x72743996.net.p3359x113d858d.C29640xb71d48db.this.f74892x3ad36552;
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: read */
        public void mo153655x355996(org.p3343x72743996.net.AbstractC29562xf1e0a9e abstractC29562xf1e0a9e, java.nio.ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= org.p3343x72743996.net.p3359x113d858d.C29640xb71d48db.this.f74889xfd47bb0d.remaining()) {
                byteBuffer.put(org.p3343x72743996.net.p3359x113d858d.C29640xb71d48db.this.f74889xfd47bb0d);
                abstractC29562xf1e0a9e.mo153663xf9a6d5cc(false);
                org.p3343x72743996.net.p3359x113d858d.C29640xb71d48db.this.f74893x75fef09e.m154333x35224f();
                return;
            }
            int limit = org.p3343x72743996.net.p3359x113d858d.C29640xb71d48db.this.f74889xfd47bb0d.limit();
            byteBuffer.put(org.p3343x72743996.net.p3359x113d858d.C29640xb71d48db.this.f74889xfd47bb0d);
            abstractC29562xf1e0a9e.mo153663xf9a6d5cc(false);
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: rewind */
        public void mo153656xc84f6cbb(org.p3343x72743996.net.AbstractC29562xf1e0a9e abstractC29562xf1e0a9e) {
            abstractC29562xf1e0a9e.mo153664xbc1ebaae(new java.net.HttpRetryException("Cannot retry streamed Http body", -1));
        }

        private UploadDataProviderImpl() {
        }
    }

    public C29640xb71d48db(org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8 c29641x19eeafa8, long j17, org.p3343x72743996.net.p3359x113d858d.ExecutorC29646x2f5b872b executorC29646x2f5b872b) {
        c29641x19eeafa8.getClass();
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
        }
        this.f74892x3ad36552 = j17;
        this.f74889xfd47bb0d = java.nio.ByteBuffer.allocate((int) java.lang.Math.min(j17, f74888xc95870b4));
        this.f74891xadf6772b = c29641x19eeafa8;
        this.f74893x75fef09e = executorC29646x2f5b872b;
        this.f74890x86e1d339 = 0L;
    }

    /* renamed from: checkNotExceedContentLength */
    private void m154296x729156c0(int i17) {
        if (this.f74890x86e1d339 + i17 <= this.f74892x3ad36552) {
            return;
        }
        throw new java.net.ProtocolException("expected " + (this.f74892x3ad36552 - this.f74890x86e1d339) + " bytes but received " + i17);
    }

    /* renamed from: ensureBufferHasRemaining */
    private void m154297x50bc15ba() {
        if (this.f74889xfd47bb0d.hasRemaining()) {
            return;
        }
        m154299x7ef3437e();
    }

    /* renamed from: setDefaultBufferLengthForTesting */
    public static void m154298x8f01534c(int i17) {
        f74888xc95870b4 = i17;
    }

    /* renamed from: uploadBufferInternal */
    private void m154299x7ef3437e() {
        m154325x9e8331f7();
        this.f74893x75fef09e.m154331x32c6a4();
        m154324x66409966();
    }

    /* renamed from: uploadIfComplete */
    private void m154300xcc045257() {
        if (this.f74890x86e1d339 == this.f74892x3ad36552) {
            m154299x7ef3437e();
        }
    }

    @Override // org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e
    /* renamed from: checkReceivedEnoughContent */
    public void mo154291x45140060() {
        if (this.f74890x86e1d339 < this.f74892x3ad36552) {
            throw new java.net.ProtocolException("Content received is less than Content-Length.");
        }
    }

    @Override // org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e
    /* renamed from: getUploadDataProvider */
    public org.p3343x72743996.net.AbstractC29560x8cb1347c mo154292x3249da52() {
        return this.f74894x1e3cd3a9;
    }

    @Override // org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e
    /* renamed from: setConnected */
    public void mo154293x393b24c7() {
    }

    @Override // java.io.OutputStream
    public void write(int i17) {
        m154325x9e8331f7();
        m154296x729156c0(1);
        m154297x50bc15ba();
        this.f74889xfd47bb0d.put((byte) i17);
        this.f74890x86e1d339++;
        m154300xcc045257();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        m154325x9e8331f7();
        if (bArr.length - i17 >= i18 && i17 >= 0 && i18 >= 0) {
            m154296x729156c0(i18);
            int i19 = i18;
            while (i19 > 0) {
                m154297x50bc15ba();
                int min = java.lang.Math.min(i19, this.f74889xfd47bb0d.remaining());
                this.f74889xfd47bb0d.put(bArr, (i17 + i18) - i19, min);
                i19 -= min;
            }
            this.f74890x86e1d339 += i18;
            m154300xcc045257();
            return;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }
}

package org.p3343x72743996.net.p3359x113d858d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.net.urlconnection.CronetChunkedOutputStream */
/* loaded from: classes13.dex */
public final class C29639x9914ab0 extends org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e {

    /* renamed from: mBuffer */
    private final java.nio.ByteBuffer f74882xfd47bb0d;

    /* renamed from: mConnection */
    private final org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8 f74883xadf6772b;

    /* renamed from: mLastChunk */
    private boolean f74884xf128178a;

    /* renamed from: mMessageLoop */
    private final org.p3343x72743996.net.p3359x113d858d.ExecutorC29646x2f5b872b f74885x75fef09e;

    /* renamed from: mUploadDataProvider */
    private final org.p3343x72743996.net.AbstractC29560x8cb1347c f74886x1e3cd3a9 = new org.p3343x72743996.net.p3359x113d858d.C29639x9914ab0.UploadDataProviderImpl();

    /* renamed from: org.chromium.net.urlconnection.CronetChunkedOutputStream$UploadDataProviderImpl */
    /* loaded from: classes13.dex */
    public class UploadDataProviderImpl extends org.p3343x72743996.net.AbstractC29560x8cb1347c {
        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: getLength */
        public long mo153654x23255ddc() {
            return -1L;
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: read */
        public void mo153655x355996(org.p3343x72743996.net.AbstractC29562xf1e0a9e abstractC29562xf1e0a9e, java.nio.ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() < org.p3343x72743996.net.p3359x113d858d.C29639x9914ab0.this.f74882xfd47bb0d.remaining()) {
                int limit = org.p3343x72743996.net.p3359x113d858d.C29639x9914ab0.this.f74882xfd47bb0d.limit();
                byteBuffer.put(org.p3343x72743996.net.p3359x113d858d.C29639x9914ab0.this.f74882xfd47bb0d);
                abstractC29562xf1e0a9e.mo153663xf9a6d5cc(false);
                return;
            }
            byteBuffer.put(org.p3343x72743996.net.p3359x113d858d.C29639x9914ab0.this.f74882xfd47bb0d);
            abstractC29562xf1e0a9e.mo153663xf9a6d5cc(org.p3343x72743996.net.p3359x113d858d.C29639x9914ab0.this.f74884xf128178a);
            if (org.p3343x72743996.net.p3359x113d858d.C29639x9914ab0.this.f74884xf128178a) {
                return;
            }
            org.p3343x72743996.net.p3359x113d858d.C29639x9914ab0.this.f74885x75fef09e.m154333x35224f();
        }

        @Override // org.p3343x72743996.net.AbstractC29560x8cb1347c
        /* renamed from: rewind */
        public void mo153656xc84f6cbb(org.p3343x72743996.net.AbstractC29562xf1e0a9e abstractC29562xf1e0a9e) {
            abstractC29562xf1e0a9e.mo153664xbc1ebaae(new java.net.HttpRetryException("Cannot retry streamed Http body", -1));
        }

        private UploadDataProviderImpl() {
        }
    }

    public C29639x9914ab0(org.p3343x72743996.net.p3359x113d858d.C29641x19eeafa8 c29641x19eeafa8, int i17, org.p3343x72743996.net.p3359x113d858d.ExecutorC29646x2f5b872b executorC29646x2f5b872b) {
        c29641x19eeafa8.getClass();
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("chunkLength should be greater than 0");
        }
        this.f74882xfd47bb0d = java.nio.ByteBuffer.allocate(i17);
        this.f74883xadf6772b = c29641x19eeafa8;
        this.f74885x75fef09e = executorC29646x2f5b872b;
    }

    /* renamed from: ensureBufferHasRemaining */
    private void m154294x50bc15ba() {
        if (this.f74882xfd47bb0d.hasRemaining()) {
            return;
        }
        m154295x7ef3437e();
    }

    /* renamed from: uploadBufferInternal */
    private void m154295x7ef3437e() {
        m154325x9e8331f7();
        this.f74885x75fef09e.m154331x32c6a4();
        m154324x66409966();
    }

    @Override // org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e
    /* renamed from: checkReceivedEnoughContent */
    public void mo154291x45140060() {
    }

    @Override // org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        if (this.f74884xf128178a) {
            return;
        }
        this.f74884xf128178a = true;
    }

    @Override // org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e
    /* renamed from: getUploadDataProvider */
    public org.p3343x72743996.net.AbstractC29560x8cb1347c mo154292x3249da52() {
        return this.f74886x1e3cd3a9;
    }

    @Override // org.p3343x72743996.net.p3359x113d858d.AbstractC29644xfa3f885e
    /* renamed from: setConnected */
    public void mo154293x393b24c7() {
    }

    @Override // java.io.OutputStream
    public void write(int i17) {
        m154294x50bc15ba();
        this.f74882xfd47bb0d.put((byte) i17);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i17, int i18) {
        m154325x9e8331f7();
        if (bArr.length - i17 < i18 || i17 < 0 || i18 < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        int i19 = i18;
        while (i19 > 0) {
            int min = java.lang.Math.min(i19, this.f74882xfd47bb0d.remaining());
            this.f74882xfd47bb0d.put(bArr, (i17 + i18) - i19, min);
            i19 -= min;
            m154294x50bc15ba();
        }
    }
}

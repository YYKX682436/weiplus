package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.MediaCodecWrapperFactoryImpl */
/* loaded from: classes13.dex */
class C29811x50f01a09 implements org.p3371xd0ce3e8d.InterfaceC29810xa7909049 {

    /* renamed from: org.webrtc.MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl */
    /* loaded from: classes13.dex */
    public static class MediaCodecWrapperImpl implements org.p3371xd0ce3e8d.InterfaceC29809xcbb53581 {

        /* renamed from: mediaCodec */
        private final android.media.MediaCodec f75548x7212fe92;

        public MediaCodecWrapperImpl(android.media.MediaCodec mediaCodec) {
            this.f75548x7212fe92 = mediaCodec;
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29809xcbb53581
        /* renamed from: configure */
        public void mo155703xd00d62e6(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
            this.f75548x7212fe92.configure(mediaFormat, surface, mediaCrypto, i17);
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29809xcbb53581
        /* renamed from: createInputSurface */
        public android.view.Surface mo155704x4310109f() {
            return this.f75548x7212fe92.createInputSurface();
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29809xcbb53581
        /* renamed from: dequeueInputBuffer */
        public int mo155705x9a572d5a(long j17) {
            return this.f75548x7212fe92.dequeueInputBuffer(j17);
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29809xcbb53581
        /* renamed from: dequeueOutputBuffer */
        public int mo155706x436dd5f1(android.media.MediaCodec.BufferInfo bufferInfo, long j17) {
            return this.f75548x7212fe92.dequeueOutputBuffer(bufferInfo, j17);
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29809xcbb53581
        /* renamed from: flush */
        public void mo155707x5d03b04() {
            this.f75548x7212fe92.flush();
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29809xcbb53581
        /* renamed from: getInputBuffers */
        public java.nio.ByteBuffer[] mo155708xa9544f7f() {
            return this.f75548x7212fe92.getInputBuffers();
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29809xcbb53581
        /* renamed from: getOutputBuffers */
        public java.nio.ByteBuffer[] mo155709x4a413c3c() {
            return this.f75548x7212fe92.getOutputBuffers();
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29809xcbb53581
        /* renamed from: getOutputFormat */
        public android.media.MediaFormat mo155710x42b80ace() {
            return this.f75548x7212fe92.getOutputFormat();
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29809xcbb53581
        /* renamed from: queueInputBuffer */
        public void mo155711xfe5642d9(int i17, int i18, int i19, long j17, int i27) {
            this.f75548x7212fe92.queueInputBuffer(i17, i18, i19, j17, i27);
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29809xcbb53581
        /* renamed from: release */
        public void mo155712x41012807() {
            this.f75548x7212fe92.release();
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29809xcbb53581
        /* renamed from: releaseOutputBuffer */
        public void mo155713xab26be48(int i17, boolean z17) {
            this.f75548x7212fe92.releaseOutputBuffer(i17, z17);
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29809xcbb53581
        /* renamed from: setParameters */
        public void mo155714x37bcc7ec(android.os.Bundle bundle) {
            this.f75548x7212fe92.setParameters(bundle);
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29809xcbb53581
        /* renamed from: start */
        public void mo155715x68ac462() {
            this.f75548x7212fe92.start();
        }

        @Override // org.p3371xd0ce3e8d.InterfaceC29809xcbb53581
        /* renamed from: stop */
        public void mo155716x360802() {
            this.f75548x7212fe92.stop();
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29810xa7909049
    /* renamed from: createByCodecName */
    public org.p3371xd0ce3e8d.InterfaceC29809xcbb53581 mo155717xd7cdda8e(java.lang.String str) {
        return new org.p3371xd0ce3e8d.C29811x50f01a09.MediaCodecWrapperImpl(android.media.MediaCodec.createByCodecName(str));
    }
}

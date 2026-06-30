package com.tencent.liteav.videobase.frame;

/* loaded from: classes14.dex */
public final class e extends com.tencent.liteav.videobase.frame.a<com.tencent.liteav.videobase.frame.d> {

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f46763a = new java.util.concurrent.atomic.AtomicInteger();

    /* loaded from: classes14.dex */
    public static class a extends com.tencent.liteav.videobase.frame.d {

        /* renamed from: a, reason: collision with root package name */
        int f46764a;

        /* renamed from: b, reason: collision with root package name */
        final int f46765b;

        /* renamed from: c, reason: collision with root package name */
        final int f46766c;

        /* renamed from: d, reason: collision with root package name */
        private com.tencent.liteav.videobase.frame.FrameMetaData f46767d;

        /* renamed from: e, reason: collision with root package name */
        private com.tencent.liteav.videobase.utils.ProducerChainTimestamp f46768e;

        /* renamed from: f, reason: collision with root package name */
        private com.tencent.liteav.videobase.utils.ConsumerChainTimestamp f46769f;

        public /* synthetic */ a(com.tencent.liteav.videobase.frame.g gVar, int i17, int i18, byte b17) {
            this(gVar, i17, i18);
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final int a() {
            return this.f46764a;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final int b() {
            return this.f46765b;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final int c() {
            return this.f46766c;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final com.tencent.liteav.videobase.frame.FrameMetaData d() {
            return this.f46767d;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final void e() {
            this.f46767d = null;
            this.f46768e = null;
            this.f46769f = null;
        }

        @Override // com.tencent.liteav.videobase.frame.i
        public final void release() {
            super.release();
        }

        private a(com.tencent.liteav.videobase.frame.g<com.tencent.liteav.videobase.frame.d> gVar, int i17, int i18) {
            super(gVar);
            this.f46764a = -1;
            this.f46765b = i17;
            this.f46766c = i18;
        }

        @Override // com.tencent.liteav.videobase.frame.d
        public final com.tencent.liteav.videobase.frame.PixelFrame a(java.lang.Object obj) {
            com.tencent.liteav.videobase.frame.e.b bVar = new com.tencent.liteav.videobase.frame.e.b(this, obj, (byte) 0);
            bVar.retain();
            return bVar;
        }
    }

    /* loaded from: classes14.dex */
    public static class b extends com.tencent.liteav.videobase.frame.PixelFrame {

        /* renamed from: b, reason: collision with root package name */
        private static final com.tencent.liteav.videobase.frame.g<com.tencent.liteav.videobase.frame.e.b> f46770b = com.tencent.liteav.videobase.frame.f.a();

        /* renamed from: a, reason: collision with root package name */
        private final com.tencent.liteav.videobase.frame.d f46771a;

        public /* synthetic */ b(com.tencent.liteav.videobase.frame.d dVar, java.lang.Object obj, byte b17) {
            this(dVar, obj);
        }

        @Override // com.tencent.liteav.videobase.frame.PixelFrame
        public final void setTextureId(int i17) {
            throw new java.lang.UnsupportedOperationException("Object is allocated by pool, can't change its Buffer");
        }

        private b(com.tencent.liteav.videobase.frame.d dVar, java.lang.Object obj) {
            super(f46770b);
            dVar.retain();
            this.mWidth = dVar.b();
            this.mHeight = dVar.c();
            this.f46771a = dVar;
            this.mTextureId = dVar.a();
            this.mGLContext = obj;
            this.mPixelBufferType = com.tencent.liteav.videobase.base.GLConstants.a.TEXTURE_2D;
            this.mPixelFormatType = com.tencent.liteav.videobase.base.GLConstants.PixelFormatType.RGBA;
            this.mMetaData = dVar.d();
        }
    }

    /* loaded from: classes14.dex */
    public static class c implements com.tencent.liteav.videobase.frame.a.InterfaceC0011a {

        /* renamed from: a, reason: collision with root package name */
        final int f46772a;

        /* renamed from: b, reason: collision with root package name */
        final int f46773b;

        public c(int i17, int i18) {
            this.f46772a = i17;
            this.f46773b = i18;
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj.getClass() != com.tencent.liteav.videobase.frame.e.c.class) {
                return false;
            }
            com.tencent.liteav.videobase.frame.e.c cVar = (com.tencent.liteav.videobase.frame.e.c) obj;
            return this.f46772a == cVar.f46772a && this.f46773b == cVar.f46773b;
        }

        public final int hashCode() {
            return (this.f46772a * 37213) + this.f46773b;
        }
    }

    @Override // com.tencent.liteav.videobase.frame.a
    public final /* synthetic */ void a(com.tencent.liteav.videobase.frame.d dVar) {
        com.tencent.liteav.videobase.frame.e.a aVar = (com.tencent.liteav.videobase.frame.e.a) dVar;
        com.tencent.liteav.videobase.utils.OpenGlUtils.deleteTexture(aVar.f46764a);
        aVar.f46764a = -1;
        f46763a.getAndDecrement();
    }

    @Override // com.tencent.liteav.videobase.frame.a
    public final /* synthetic */ com.tencent.liteav.videobase.frame.a.InterfaceC0011a b(com.tencent.liteav.videobase.frame.d dVar) {
        com.tencent.liteav.videobase.frame.d dVar2 = dVar;
        return new com.tencent.liteav.videobase.frame.e.c(dVar2.b(), dVar2.c());
    }

    @Override // com.tencent.liteav.videobase.frame.a
    public final void b() {
        super.b();
    }

    public final com.tencent.liteav.videobase.frame.d a(int i17, int i18) {
        com.tencent.liteav.videobase.frame.d dVar = (com.tencent.liteav.videobase.frame.d) super.a(new com.tencent.liteav.videobase.frame.e.c(i17, i18));
        dVar.e();
        return dVar;
    }

    @Override // com.tencent.liteav.videobase.frame.a
    public final void a() {
        super.a();
    }

    @Override // com.tencent.liteav.videobase.frame.a
    public final /* synthetic */ com.tencent.liteav.videobase.frame.d a(com.tencent.liteav.videobase.frame.g<com.tencent.liteav.videobase.frame.d> gVar, com.tencent.liteav.videobase.frame.a.InterfaceC0011a interfaceC0011a) {
        com.tencent.liteav.videobase.frame.e.c cVar = (com.tencent.liteav.videobase.frame.e.c) interfaceC0011a;
        com.tencent.liteav.videobase.frame.e.a aVar = new com.tencent.liteav.videobase.frame.e.a(gVar, cVar.f46772a, cVar.f46773b, (byte) 0);
        aVar.f46764a = com.tencent.liteav.videobase.utils.OpenGlUtils.createTexture(aVar.f46765b, aVar.f46766c, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA);
        f46763a.incrementAndGet();
        return aVar;
    }
}

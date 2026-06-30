package fs0;

/* loaded from: classes10.dex */
public final class o extends fs0.g {
    public volatile boolean A;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f347804x;

    /* renamed from: y, reason: collision with root package name */
    public final android.os.HandlerThread f347805y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f347806z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j17, long j18, hs0.a mediaExtractorWrapper, android.view.Surface surface, int i17, boolean z17, yz5.l lVar) {
        super(j17, j18, mediaExtractorWrapper, surface, i17, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaExtractorWrapper, "mediaExtractorWrapper");
        this.f347804x = "MicroMsg.MediaCodecTransDecoderAsync";
        int i18 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("MediaCodecTransDecoderAsync_decodeThread", 5);
        this.f347805y = a17;
        fs0.n nVar = new fs0.n(this, mediaExtractorWrapper);
        try {
            this.f347770g = mediaExtractorWrapper.f366084e;
            java.lang.String b17 = mediaExtractorWrapper.b();
            if (r26.i0.p("video/dolby-vision", b17, true) && !ph3.f.f()) {
                b17 = "video/hevc";
            }
            this.f347769f = wo.i1.c(b17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecTransDecoderAsync", "mediaExtractorWrapper.getVideoMIME() :" + mediaExtractorWrapper.b());
            if (fp.h.c(23)) {
                a17.start();
                android.os.Handler handler = new android.os.Handler(a17.getLooper());
                wo.i1 i1Var = this.f347769f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var);
                i1Var.f529252a.setCallback(nVar, handler);
            } else {
                wo.i1 i1Var2 = this.f347769f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var2);
                i1Var2.f529252a.setCallback(nVar);
            }
            wo.i1 i1Var3 = this.f347769f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var3);
            i1Var3.a(this.f347770g, surface, null, 0);
            if (lVar != null) {
                lVar.mo146xb9724478(this);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f347804x, e17, "create decoder error:" + e17.getMessage(), new java.lang.Object[0]);
            throw new java.lang.IllegalStateException("init decoder error");
        }
    }

    @Override // fs0.g
    public void c() {
        super.c();
        try {
            this.f347805y.quit();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f347804x, e17, "releaseDecoder error:" + e17.getMessage(), new java.lang.Object[0]);
        }
    }

    @Override // fs0.g
    public void e() {
        try {
            wo.i1 i1Var = this.f347769f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var);
            i1Var.x();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f347804x, e17, "startDecode error", new java.lang.Object[0]);
        }
    }
}

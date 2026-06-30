package dd4;

/* loaded from: classes4.dex */
public final class s implements xd4.g0, ok4.d {

    /* renamed from: k, reason: collision with root package name */
    public static final dd4.r f310578k = new dd4.r(null);

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.HashMap f310579l = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ok4.w f310580a;

    /* renamed from: b, reason: collision with root package name */
    public final ok4.c f310581b;

    /* renamed from: c, reason: collision with root package name */
    public int f310582c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f310583d;

    /* renamed from: e, reason: collision with root package name */
    public long f310584e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f310585f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f310586g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo f310587h;

    /* renamed from: i, reason: collision with root package name */
    public int f310588i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f310589j;

    public s(r45.jj4 jj4Var, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f310583d = "";
        this.f310584e = -1L;
        this.f310585f = "";
        this.f310586g = "";
        this.f310589j = "";
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc();
        c6953x6177b4fc.P = 1L;
        ok4.w wVar = new ok4.w(c6953x6177b4fc, currentTimeMillis, 2);
        this.f310580a = wVar;
        this.f310581b = new ok4.c(currentTimeMillis);
        java.lang.String str = jj4Var.f459388d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TPPlayerReporter", "markMediaId media id:" + str);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc2 = wVar.f427577a;
        c6953x6177b4fc2.f142586g = c6953x6177b4fc2.b("MediaId", str, true);
    }

    public static final /* synthetic */ java.util.HashMap d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getReporterMap$cp", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        java.util.HashMap hashMap = f310579l;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getReporterMap$cp", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        return hashMap;
    }

    @Override // ok4.d
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onProgress", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f310580a.getClass();
        this.f310581b.a(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onProgress", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // xd4.g0
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.VideoRptStruct b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("provideUiReport", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.VideoRptStruct videoRptStruct = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17987x1533a9b.VideoRptStruct();
        videoRptStruct.f248089c = this.f310582c;
        videoRptStruct.f248088b = this.f310583d;
        videoRptStruct.f248087a = this.f310584e;
        videoRptStruct.f248090d = this.f310585f;
        videoRptStruct.f248092f = this.f310586g;
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo = this.f310587h;
        if (videoInfo != null) {
            videoRptStruct.f248093g = videoInfo != null ? videoInfo.f18113x4486869b : null;
            videoRptStruct.f248094h = videoInfo != null ? videoInfo.f18114x9330627b : null;
        }
        videoRptStruct.f248097k = this.f310588i;
        videoRptStruct.f248098l = this.f310589j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("provideUiReport", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        return videoRptStruct;
    }

    @Override // xd4.g0
    public long c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        return 0L;
    }

    @Override // ok4.d
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBufferingStarted", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f310580a.e();
        this.f310581b.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBufferingStarted", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void g(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeek", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f310580a.g(i17, i18);
        this.f310581b.g(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeek", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBufferingStopped", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f310580a.h();
        this.f310581b.h();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBufferingStopped", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void l(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPrepared", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPrepared", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    /* renamed from: onCompleted */
    public void mo123988xaa8b332c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCompleted", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f310580a.mo123988xaa8b332c();
        this.f310581b.mo123988xaa8b332c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCompleted", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    /* renamed from: onError */
    public void mo123989xaf8aa769(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f310580a.mo123989xaf8aa769(i17, i18);
        this.f310581b.mo123989xaf8aa769(i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    /* renamed from: onPause */
    public void mo123990xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f310580a.mo123990xb01dfb57();
        this.f310581b.mo123990xb01dfb57();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    /* renamed from: onStart */
    public void mo123991xb05099c3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f310580a.mo123991xb05099c3();
        this.f310581b.mo123991xb05099c3();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    /* renamed from: onStop */
    public void mo123992xc39f8281() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f310580a.mo123992xc39f8281();
        this.f310581b.mo123992xc39f8281();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeekCompleted", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f310580a.q();
        this.f310581b.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeekCompleted", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void s() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFirstVideoFrame", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f310580a.s();
        this.f310581b.s();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFirstVideoFrame", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void t(int i17, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInfo", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f310580a.t(i17, j17, j18);
        this.f310581b.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInfo", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }
}

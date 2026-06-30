package e64;

/* loaded from: classes7.dex */
public final class h extends hq0.i0 {
    public hq0.e0 A;

    /* renamed from: x, reason: collision with root package name */
    public bf3.p f331359x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.FrameLayout f331360y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.ref.Reference f331361z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.app.Activity activity) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f331361z = new java.lang.ref.WeakReference(activity);
    }

    @Override // hq0.i0
    public void A1(hq0.e0 root) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        super.A1(root);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("provideActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        android.app.Activity activity = (android.app.Activity) this.f331361z.get();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("provideActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        return activity;
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findContainerDelegate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerTag, "containerTag");
        tp0.l lVar = new tp0.l();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findContainerDelegate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        return lVar;
    }

    public final void J1(fq0.x xVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addCustomViewToMgr", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = xVar.f347021l;
        if (c10867x3e50a04d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdMB", "sclView empty, addCustomView error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCustomViewToMgr", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            return;
        }
        if (xVar.f347025p == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c10867x3e50a04d);
            int C0 = C0(c10867x3e50a04d);
            xVar.f347025p = C0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdMB", "viewId is assigned:" + C0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdMB", "viewId is already assigned:" + xVar.f347025p);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCustomViewToMgr", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    public final void N1(android.widget.FrameLayout frameLayout) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launch", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        if (frameLayout != null) {
            this.f331360y = frameLayout;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4 d4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class);
            android.content.Context context = frameLayout.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            bf3.p Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) d4Var).Di(context);
            Di.a(frameLayout);
            this.f331359x = Di;
        }
        X0();
        mo123044x68ac462();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1997, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launch", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBizName", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBizName", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        return "MagicAdLandPage";
    }

    @Override // hq0.i0
    public void X0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.X0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("provideSnsAdJsApis", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiFactory");
        java.util.HashSet d17 = kz5.p1.d(new f64.a(), new f64.b(), new f64.c(), new f64.n(), new f64.d(), new f64.e(), new f64.f(), new f64.g(), new f64.h(), new f64.i(), new f64.j(), new f64.k(), new f64.l(), new f64.m(), new f64.o(), new f64.p(), new f64.q(), new f64.r(), new f64.s(), new f64.t(), new f64.u(), new f64.v(), new f64.w(), new f64.x(), new f64.y());
        d17.addAll(((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4.class))).Ni("MagicAdLandPage"));
        java.util.HashSet hashSet = new java.util.HashSet();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("provideSnsAdJsApis", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiFactory");
        jc3.y0 wi6 = ((com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.v) ((xj.j) i95.n0.c(xj.j.class))).wi("MagicAdLandPage");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
        c16416x87606a7b.f229367x = this;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMbJsApiSet", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiGroup");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMbJsApiSet", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiGroup");
        c16416x87606a7b.a(kz5.n0.t0(kz5.n0.t0(d17, wi6.f380545a), kz5.c0.i(new lq0.g(), new lq0.d(), new lq0.e())));
        java.util.HashSet hashSet2 = new java.util.HashSet();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppBrandJsApi", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiGroup");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppBrandJsApi", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdJsApiGroup");
        hashSet2.addAll(hashSet);
        hashSet2.addAll(wi6.f380546b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.y4.a(c16416x87606a7b, hashSet2);
        bf3.p pVar = this.f331359x;
        if (pVar != null) {
            c16416x87606a7b.f229364u = pVar;
        }
        I1(c16416x87606a7b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    /* renamed from: destroy */
    public void mo123041x5cd39ffa() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        pm0.v.X(new e64.f(this));
        super.mo123041x5cd39ffa();
        hq0.e0 e0Var = this.A;
        if (e0Var != null) {
            e0Var.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1997, 2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMainScriptInjected", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.n();
        if (this.f331360y != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("evaluate$plugin_sns_release", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            jc3.j0 j0Var = this.f364528g;
            if (j0Var != null) {
                jc3.j0.d(j0Var, "mb.switchVConsole(true);", null, 2, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("evaluate$plugin_sns_release", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMainScriptInjected", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0, jc3.u
    /* renamed from: onCreated */
    public void mo123042x8cf48009() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreated", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.mo123042x8cf48009();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreated", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0, jc3.u
    /* renamed from: onDestroy */
    public void mo123043xac79a11b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.mo123043xac79a11b(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0, jc3.u
    /* renamed from: onPause */
    public void mo127084xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.mo127084xb01dfb57();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0, jc3.u
    /* renamed from: onResume */
    public void mo127085x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        super.mo127085x57429eec();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    public void s1(hq0.e0 root, fq0.x frameSet, java.lang.String info) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBind", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        J1(frameSet);
        super.s1(root, frameSet, info);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdMB", "onBind:: info is ".concat(info));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBind", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    public void t1(fq0.r appContext) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appContext, "appContext");
        super.t1(appContext);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdMB", "the magic brush scl app context created");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    public void v1(hq0.e0 root) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        super.v1(root);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    public void w1(hq0.e0 root) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        super.w1(root);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    public void x1(hq0.e0 root, fq0.x frameSet) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInit", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        J1(frameSet);
        super.x1(root, frameSet);
        frameSet.f347017h = new e64.g(frameSet);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInit", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }

    @Override // hq0.i0
    public void y1(hq0.e0 root) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        super.y1(root);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
    }
}

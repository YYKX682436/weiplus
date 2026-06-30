package w03;

/* loaded from: classes14.dex */
public final class c extends io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f523408f = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f523409d;

    /* renamed from: e, reason: collision with root package name */
    public w03.a f523410e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18916xbd02f08a activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: attachToEngineAutomatically */
    public boolean mo136989x169db8c1() {
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28544xb8b8dbb3
    /* renamed from: configureFlutterEngine */
    public void mo29003xab73cc38(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e flutterEngine) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterEngine, "flutterEngine");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40, hq4.a
    /* renamed from: dealContentView */
    public void mo8717x2105eeb2(android.view.View view) {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40, hq4.a
    /* renamed from: finish */
    public void mo8718xb4098c93() {
        this.f70739xf8b181a5.U6();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getBackCallbackState */
    public boolean mo136995x590b38ef() {
        return false;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: getCachedEngineId */
    public java.lang.String mo136998xd9afab35() {
        java.lang.String mo136998xd9afab35 = super.mo136998xd9afab35();
        if (mo136998xd9afab35 == null || io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28582x3d2c20c4.m137465x9cf0d20b().get(mo136998xd9afab35) == null) {
            this.f523409d = false;
            return null;
        }
        this.f523409d = true;
        return mo136998xd9afab35;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40, hq4.a
    /* renamed from: getForceOrientation */
    public int mo8720x663c095b() {
        return 1;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40, hq4.a
    /* renamed from: getLayoutId */
    public int mo8721x2ee31f5b() {
        return -1;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40, hq4.a
    /* renamed from: importUIComponents */
    public void mo8722xa59964ef(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40, hq4.a
    /* renamed from: onBackPressed */
    public boolean mo8724xbdc3c5dc() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
        if (Bi == null || Bi.f258092b == null) {
            return true;
        }
        c13.b0 b0Var = c13.b0.f119393d;
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e = c13.b0.f119394e;
        if (c24132x9b57f23e == null) {
            return true;
        }
        c24132x9b57f23e.m89491x2ef4ca67(c13.l.f119420d);
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40, hq4.a
    /* renamed from: onConfigurationChanged */
    public void mo8725x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        mo137361xdbc81d79(newConfig);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CachedFlutterActivity", "onConfigurationChanged: " + newConfig);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40, hq4.a
    /* renamed from: onCreate */
    public void mo8726x3e5a77bb(android.os.Bundle bundle) {
        super.mo8726x3e5a77bb(bundle);
        java.lang.String mo136998xd9afab35 = super.mo136998xd9afab35();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CachedFlutterActivity", "onCreate: cachedEngineId=" + mo136998xd9afab35);
        if (mo136998xd9afab35 == null) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_flutter_voip_finish_if_invalid_intent, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CachedFlutterActivity", "finish activity because null cachedEngineId");
                this.f70739xf8b181a5.U6();
                return;
            }
        }
        if (mo136998xd9afab35 != null && io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28582x3d2c20c4.m137465x9cf0d20b().get(mo136998xd9afab35) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CachedFlutterActivity", "launch with cached engine id " + mo136998xd9afab35 + ", but it has been destroyed");
            this.f70739xf8b181a5.U6();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
        if (Bi != null) {
            jq4.c1 c1Var = Bi.f258114x;
            c1Var.getClass();
            jq4.z0.c(c1Var, false, false, false, 7, null);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40, hq4.a
    /* renamed from: onKeyDown */
    public boolean mo8728x1f03f0c2(int i17, android.view.KeyEvent event) {
        b13.m mVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        w03.a aVar = this.f523410e;
        if (aVar == null || (mVar = ((a13.k) aVar).f82088a.f82110m) == null) {
            return false;
        }
        if (i17 != 25) {
            if (i17 == 24 && mVar.f257920r && !gq4.v.Bi().x()) {
                ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).tj();
            }
            return wo.v1.f529355b.f529194f != 1 ? false : false;
        }
        if (!gq4.v.Bi().x() && mVar.f257920r) {
            ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).sj();
        }
        if (wo.v1.f529355b.f529194f != 1 && i17 == 700) {
            mVar.I0();
        }
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40, hq4.a
    /* renamed from: onResume */
    public void mo8733x57429eec() {
        super.mo8733x57429eec();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40, hq4.a
    /* renamed from: onSwipeBackFinish */
    public void mo8736xe4dc1f55() {
        gq4.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
        if (Bi == null || (aVar = Bi.f258092b) == null) {
            return;
        }
        b13.m mVar = (b13.m) aVar;
        c13.b0 b0Var = c13.b0.f119393d;
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e = c13.b0.f119394e;
        if (c24132x9b57f23e != null) {
            c24132x9b57f23e.m89491x2ef4ca67(c13.l.f119420d);
        }
        mVar.o0(17);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40, hq4.a
    /* renamed from: provideCustomActivityContentView */
    public android.view.View mo8739xa334195d() {
        return null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: provideSensitiveContentPlugin */
    public io.p3284xd2ae381c.p3301xc5476f33.p3309x373aa5.C28747xd0ac0236 mo137020xc304b217(android.app.Activity activity, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e flutterEngine) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterEngine, "flutterEngine");
        if (activity != null) {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3309x373aa5.C28747xd0ac0236(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40.f70736x5ad2abb2, activity, flutterEngine.m137444xa36cda4a());
        }
        return null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40
    /* renamed from: setupConfiguration */
    public void mo137361xdbc81d79(android.content.res.Configuration configuration) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configuration, "configuration");
        configuration.uiMode = com.p314xaae8f345.mm.ui.bk.C() ? 32 : 16;
        configuration.fontScale = i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        if (!(d17 == null || d17.length() == 0)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
            java.util.List e07 = r26.n0.e0(d17, new char[]{'_'}, false, 0, 6, null);
            java.util.Locale locale = new java.util.Locale((java.lang.String) e07.get(0), e07.size() > 1 ? (java.lang.String) e07.get(1) : "", "");
            android.os.LocaleList locales = configuration.getLocales();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locales, "getLocales(...)");
            e06.k m17 = e06.p.m(0, locales.size());
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
            java.util.Iterator it = m17.iterator();
            while (((e06.j) it).hasNext()) {
                arrayList.add(locales.get(((kz5.x0) it).b()));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                java.util.Locale locale2 = (java.util.Locale) next;
                if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(locale2.getLanguage(), locale.getLanguage()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(locale2.getCountry(), locale.getCountry())) ? false : true) {
                    arrayList2.add(next);
                }
            }
            java.util.Locale[] localeArr = (java.util.Locale[]) arrayList2.toArray(new java.util.Locale[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.l0 l0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.l0(2);
            l0Var.a(locale);
            l0Var.b(localeArr);
            configuration.setLocales(new android.os.LocaleList((java.util.Locale[]) l0Var.d(new java.util.Locale[l0Var.c()])));
        }
        this.f70739xf8b181a5.getResources().getDisplayMetrics().setTo(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.AbstractC28567x8491fc40, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28541x438282c1.Host
    /* renamed from: shouldDestroyEngineWithHost */
    public boolean mo137026x3ea0a97() {
        java.lang.String mo136998xd9afab35 = super.mo136998xd9afab35();
        if (!this.f523409d) {
            return true;
        }
        if (mo136998xd9afab35 == null || io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28582x3d2c20c4.m137465x9cf0d20b().get(mo136998xd9afab35) != null) {
            return super.mo137026x3ea0a97();
        }
        return false;
    }
}

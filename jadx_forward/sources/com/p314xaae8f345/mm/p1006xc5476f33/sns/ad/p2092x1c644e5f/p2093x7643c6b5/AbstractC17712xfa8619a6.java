package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.p2093x7643c6b5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenOpenAppHelper;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onUIPause", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper */
/* loaded from: classes4.dex */
public abstract class AbstractC17712xfa8619a6 implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f244213d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f244214e = "AdOpenAppHalfScreenHelper";

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f244215f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f244216g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f244217h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f244218i;

    /* renamed from: m, reason: collision with root package name */
    public h44.c f244219m;

    /* renamed from: n, reason: collision with root package name */
    public ca4.d f244220n;

    public AbstractC17712xfa8619a6(android.content.Context context) {
        this.f244213d = context;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addObserver", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        java.lang.Object obj = this.f244213d;
        if (obj instanceof p012xc85e97e9.p093xedfae76a.y) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            ((p012xc85e97e9.p093xedfae76a.y) obj).mo273xed6858b4().a(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "addObserver");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addObserver", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
    }

    public final ca4.d b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdConversionOnlineParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        ca4.d dVar = this.f244220n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdConversionOnlineParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        return dVar;
    }

    public abstract int c();

    public final h44.c d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMAdOpenAppParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        h44.c cVar = this.f244219m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMAdOpenAppParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        return cVar;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = this.f244215f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        return c22628xfde5d61d;
    }

    public final android.view.View f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMContentView", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        android.view.View view = this.f244218i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMContentView", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        return view;
    }

    public final android.content.Context g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMContext", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMContext", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        return this.f244213d;
    }

    public final android.widget.Button h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMOpenAppBtn", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        android.widget.Button button = this.f244217h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMOpenAppBtn", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        return button;
    }

    public java.lang.String i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        return this.f244214e;
    }

    public abstract void j();

    public final void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initContentView", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        android.view.View inflate = android.view.LayoutInflater.from(this.f244213d).inflate(c(), (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f244215f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564761a15);
        this.f244216g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a1o);
        this.f244217h = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.kim);
        this.f244218i = inflate;
        l();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initContentView", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
    }

    public void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initOpenAppBtnClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        android.widget.Button button = this.f244217h;
        if (button != null) {
            button.setOnClickListener(new j44.k(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initOpenAppBtnClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
    }

    public void m(h44.c adOpenAppParams) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initParamsAndReport", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adOpenAppParams, "adOpenAppParams");
        this.f244219m = adOpenAppParams;
        i64.p0 d17 = adOpenAppParams.d();
        if (d17 != null) {
            d17.f370813j = 106;
        }
        i64.p0 d18 = adOpenAppParams.d();
        java.lang.String str = d18 != null ? d18.f370804a : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        java.lang.String str2 = adOpenAppParams.f360459a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        i64.p0 d19 = adOpenAppParams.d();
        java.lang.String str3 = d19 != null ? d19.f370805b : null;
        i64.p0 d27 = adOpenAppParams.d();
        java.lang.String str4 = d27 != null ? d27.f370806c : null;
        i64.p0 d28 = adOpenAppParams.d();
        boolean z17 = false;
        ca4.c0.f(str, str2, 0, 2, str3, str4, d28 != null ? d28.f370807d : 0, 1);
        i64.p0 d29 = adOpenAppParams.d();
        java.lang.String str5 = d29 != null ? d29.f370805b : null;
        i64.p0 d37 = adOpenAppParams.d();
        java.lang.String str6 = d37 != null ? d37.f370808e : null;
        i64.p0 d38 = adOpenAppParams.d();
        int i17 = d38 != null ? d38.f370809f : 0;
        i64.p0 d39 = adOpenAppParams.d();
        java.lang.String str7 = d39 != null ? d39.f370806c : null;
        i64.p0 d47 = adOpenAppParams.d();
        java.lang.String str8 = d47 != null ? d47.f370810g : null;
        i64.p0 d48 = adOpenAppParams.d();
        java.lang.String str9 = d48 != null ? d48.f370811h : null;
        i64.p0 d49 = adOpenAppParams.d();
        ca4.d dVar = new ca4.d(str5, str6, i17, str7, str8, str9, d49 != null ? d49.f370812i : null);
        this.f244220n = dVar;
        dVar.c(106);
        i64.p0 d57 = adOpenAppParams.d();
        if (d57 != null && d57.f370807d == 1) {
            z17 = true;
        }
        if (z17) {
            ca4.d dVar2 = this.f244220n;
            if (dVar2 != null) {
                dVar2.b(4);
            }
        } else {
            ca4.d dVar3 = this.f244220n;
            if (dVar3 != null) {
                dVar3.b(1);
            }
        }
        l44.z.k(this.f244220n);
        l44.z.j(this.f244220n);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initParamsAndReport", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
    }

    public void n() {
        java.lang.String str;
        java.lang.String str2;
        android.widget.Button button;
        k44.h b17;
        k44.h b18;
        android.widget.TextView textView;
        k44.h b19;
        k44.h b27;
        java.lang.String str3;
        k44.h b28;
        k44.h b29;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        h44.c cVar = this.f244219m;
        java.lang.String str4 = null;
        if (cVar == null || (b29 = cVar.b()) == null) {
            str = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            str = b29.f385619a;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            h44.c cVar2 = this.f244219m;
            if (cVar2 == null || (b28 = cVar2.b()) == null) {
                str3 = null;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
                str3 = b28.f385619a;
            }
            a84.z.c(str3, this.f244215f);
        }
        h44.c cVar3 = this.f244219m;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((cVar3 == null || (b27 = cVar3.b()) == null) ? null : b27.a()) && (textView = this.f244216g) != null) {
            h44.c cVar4 = this.f244219m;
            textView.setText((cVar4 == null || (b19 = cVar4.b()) == null) ? null : b19.a());
        }
        h44.c cVar5 = this.f244219m;
        if (cVar5 == null || (b18 = cVar5.b()) == null) {
            str2 = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBtnTitle", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBtnTitle", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            str2 = b18.f385621c;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (button = this.f244217h) != null) {
            h44.c cVar6 = this.f244219m;
            if (cVar6 != null && (b17 = cVar6.b()) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBtnTitle", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBtnTitle", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
                str4 = b17.f385621c;
            }
            button.setText(str4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
    }

    public final void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeObserver", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        java.lang.Object obj = this.f244213d;
        if (obj instanceof p012xc85e97e9.p093xedfae76a.y) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            ((p012xc85e97e9.p093xedfae76a.y) obj).mo273xed6858b4().c(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "removeObserver");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeObserver", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onUIPause */
    public final void m69347xfe061103() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUIPause", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        j();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "onUIPause");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUIPause", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
    }
}

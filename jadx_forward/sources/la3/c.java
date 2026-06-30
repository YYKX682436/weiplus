package la3;

/* loaded from: classes7.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1 implements com.p314xaae8f345.p3210x3857dc.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final la3.d f399045a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f399046b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f399047c;

    /* renamed from: d, reason: collision with root package name */
    public int f399048d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f399049e;

    public c(la3.d webViewData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webViewData, "webViewData");
        this.f399045a = webViewData;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public boolean a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        this.f399048d = i29;
        if (!this.f399049e) {
            return false;
        }
        this.f399045a.a("disableSwipeGesture", kz5.b1.e(new jz5.l(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0, (i19 > 0 || i28 > 0) ? (i28 <= 0 || i19 < i28 - 1) ? i19 <= 1 ? "right" : com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc : "left" : com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18)));
        return false;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void b(int i17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        char c17 = (i27 != 0 || i18 <= 0) ? (i27 <= 0 || i18 != 0) ? (char) 0 : (char) 2 : (char) 1;
        la3.d dVar = this.f399045a;
        if (c17 > 0) {
            dVar.a("scrolled", kz5.b1.e(new jz5.l("scrolled", java.lang.Boolean.valueOf(c17 == 1))));
        }
        dVar.a("disableSwipeGesture", kz5.b1.e(new jz5.l(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc)));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        kz5.q0 q0Var = kz5.q0.f395534d;
        la3.d dVar = this.f399045a;
        if (z18 && i18 <= 0 && !this.f399046b) {
            dVar.a("scrollToUpper", q0Var);
            this.f399046b = true;
        } else if (i18 > 0 && this.f399046b) {
            this.f399046b = false;
        }
        int i19 = this.f399048d - i18;
        if (z18 && i19 <= 0 && !this.f399047c) {
            dVar.a("scrollToLower", q0Var);
            this.f399047c = true;
        } else {
            if (i19 <= 0 || !this.f399047c) {
                return;
            }
            this.f399047c = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void g(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        this.f399049e = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteApp.WebViewClientListener", "onPageFinished url=" + str + " isPageLoaded=true");
        if (str == null) {
            str = "";
        }
        this.f399045a.a("finished", kz5.b1.e(new jz5.l("url", str)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void h(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        this.f399049e = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteApp.WebViewClientListener", "onPageStarted url=" + str + " isPageLoaded=false");
        if (str == null) {
            str = "";
        }
        this.f399045a.a("started", kz5.b1.e(new jz5.l("url", str)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteApp.WebViewClientListener", "onPageLoadError, url is " + str2);
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, java.lang.Integer.valueOf(i17));
        if (str == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("description", str);
        java.util.Map k17 = kz5.c1.k(lVarArr);
        jz5.l[] lVarArr2 = new jz5.l[2];
        if (str2 == null) {
            str2 = "";
        }
        lVarArr2[0] = new jz5.l("url", str2);
        lVarArr2[1] = new jz5.l("error", k17);
        this.f399045a.a("error", kz5.c1.k(lVarArr2));
    }
}

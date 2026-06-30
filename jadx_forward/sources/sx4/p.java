package sx4;

/* loaded from: classes8.dex */
public class p extends sx4.t {
    public final /* synthetic */ sx4.q C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(sx4.q qVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59) {
        super(c22633x83752a59);
        this.C = qVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3
    public java.lang.String F() {
        sx4.s0 s0Var = this.C.f495174e;
        return sx4.s0.f495190a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x3 G() {
        return this.C.f495185p;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3
    public boolean K(java.lang.String str) {
        return ((vz4.x) this.C.f495177h).d(str);
    }

    @Override // sx4.t, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3
    public void L() {
        this.C.f495180k.D = java.lang.System.currentTimeMillis();
        try {
            this.f269084d.Ua(this.f269095o, true, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameFloatWebViewClient", "postBinded, jumpToActivity, ex = " + e17.getMessage());
        }
        if (I(this.f269095o)) {
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(this.f269095o);
        if (parse.getScheme() == null) {
            java.lang.String str = this.f269095o + "http://";
            this.f269095o = str;
            parse = android.net.Uri.parse(str);
        }
        boolean startsWith = parse.getScheme().startsWith("http");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f269082b;
        if (!startsWith) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.r3.a(this.f269095o)) {
                c22633x83752a59.mo32265x141096a9(this.f269095o);
                return;
            } else {
                T(this.f269095o);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebViewClient", "uri scheme not startwith http, scheme = " + parse.getScheme());
        this.f269093m = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.q3(this.f269101u ? "" : this.f269095o);
        this.f269101u = false;
        if (!this.f269089i && !this.f269085e.e(this.f269095o)) {
            if (K(this.f269095o)) {
                M(this.f269095o);
                this.f269096p = this.f269095o;
            }
            X(this.f269095o, false);
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.r3.a(this.f269095o)) {
            if (K(this.f269095o)) {
                M(this.f269095o);
                return;
            } else {
                c22633x83752a59.mo32265x141096a9(this.f269095o);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.GameFloatWebViewClient", "loadInitialUrl, canLoadUrl fail, url = " + this.f269095o);
        T(this.f269095o);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3
    public void M(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda = ((vz4.x) this.C.f495177h).f523291f;
        if (c19543x781c5eda == null || !c19543x781c5eda.f269911h) {
            this.f269082b.mo32265x141096a9(str);
        } else {
            super.M(str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3
    public void N() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f269082b;
        c22633x83752a59.mo120173x7af55728("MicroMsg");
        c22633x83752a59.mo120173x7af55728("JsApi");
        try {
            c22633x83752a59.mo81410x6fd49b97(null);
            c22633x83752a59.mo74800x23d27c02(null);
            c22633x83752a59.setOnTouchListener(null);
            c22633x83752a59.setOnLongClickListener(null);
            c22633x83752a59.setVisibility(8);
            c22633x83752a59.removeAllViews();
            c22633x83752a59.mo120135xb4407692();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameFloatWebView", "onDestroy, set web infos to null,  ex = %s", e17.getMessage());
        }
        try {
            c22633x83752a59.mo52095x5cd39ffa();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameFloatWebView", "onDestroy, viewWV destroy, ex = %s", e18.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3
    public void O(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "onPageFinished opt, url = %s, now = %d", str, java.lang.Long.valueOf(currentTimeMillis));
        sx4.q qVar = this.C;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = qVar.f495180k;
        if (c10723x8ab106bc.F == 0) {
            c10723x8ab106bc.F = currentTimeMillis;
        }
        sx4.d0 d0Var = qVar.f495181l;
        if (d0Var.f495119e == 0) {
            d0Var.f495119e = currentTimeMillis;
        }
        if (c10723x8ab106bc.f149726z == 0) {
            c10723x8ab106bc.f149726z = currentTimeMillis;
            qVar.f495182m = currentTimeMillis;
        }
        this.f269082b.setVisibility(0);
        ((vz4.x) qVar.f495177h).h(c27816xac2547f9, str);
        sx4.u uVar = qVar.f495184o.f495199f;
        uVar.getClass();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        sx4.v vVar = uVar.f495193a;
        vVar.f495196c = currentTimeMillis2;
        vVar.f495197d = java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3
    public void P(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, android.graphics.Bitmap bitmap) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "onPageStarted opt, url = %s, now = %d", str, java.lang.Long.valueOf(currentTimeMillis));
        sx4.q qVar = this.C;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = qVar.f495180k;
        if (c10723x8ab106bc.E == 0) {
            c10723x8ab106bc.E = currentTimeMillis;
        }
        sx4.d0 d0Var = qVar.f495181l;
        if (d0Var.f495118d == 0) {
            d0Var.f495118d = currentTimeMillis;
        }
        sx4.v vVar = qVar.f495184o.f495199f.f495193a;
        vVar.f495198e = null;
        vVar.f495195b = 0L;
        vVar.f495196c = 0L;
        vVar.f495197d = 0L;
        vz4.x xVar = (vz4.x) qVar.f495177h;
        xVar.getClass();
        xVar.f523287b = java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3
    public void Q(nw4.n nVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "jsapi ready");
        this.C.f495176g = nVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3
    public void R(nw4.v2 v2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "jsloader ready");
        this.C.getClass();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3
    public void S(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar) {
        this.C.f495175f = v0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3
    public void T(java.lang.String str) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "onURLFilteredOut url:%s", str);
            this.C.f495173d.removeView(this.f269082b);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3
    public boolean V(android.os.Bundle bundle) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sx4.q qVar = this.C;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = qVar.f495180k;
        if (c10723x8ab106bc.H == 0) {
            c10723x8ab106bc.H = currentTimeMillis;
        }
        sx4.d0 d0Var = qVar.f495181l;
        if (d0Var.f495121g == 0) {
            d0Var.f495121g = currentTimeMillis;
        }
        return super.V(bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3
    public void X(java.lang.String str, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sx4.q qVar = this.C;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = qVar.f495180k;
        if (c10723x8ab106bc.G == 0) {
            c10723x8ab106bc.G = currentTimeMillis;
        }
        sx4.d0 d0Var = qVar.f495181l;
        if (d0Var.f495120f == 0) {
            d0Var.f495120f = currentTimeMillis;
        }
        Y(str, z17, 0);
    }

    @Override // sx4.t, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3
    public boolean Z(java.lang.String str) {
        return super.Z(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3, com.p314xaae8f345.p3210x3857dc.h1
    public com.p314xaae8f345.p3210x3857dc.y0 x(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var) {
        if (x0Var == null || x0Var.mo120512xb5887639() == null) {
            return super.x(c27816xac2547f9, x0Var);
        }
        com.p314xaae8f345.p3210x3857dc.y0 i17 = ((vz4.x) this.C.f495177h).i(c27816xac2547f9, x0Var.mo120512xb5887639().toString(), x0Var);
        return i17 != null ? i17 : super.x(c27816xac2547f9, x0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3, com.p314xaae8f345.p3210x3857dc.h1
    public com.p314xaae8f345.p3210x3857dc.y0 y(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var, android.os.Bundle bundle) {
        if (x0Var == null || x0Var.mo120512xb5887639() == null) {
            return super.x(c27816xac2547f9, x0Var);
        }
        com.p314xaae8f345.p3210x3857dc.y0 i17 = ((vz4.x) this.C.f495177h).i(c27816xac2547f9, x0Var.mo120512xb5887639().toString(), x0Var);
        return i17 != null ? i17 : super.y(c27816xac2547f9, x0Var, bundle);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public com.p314xaae8f345.p3210x3857dc.y0 z(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p3210x3857dc.y0 i17 = ((vz4.x) this.C.f495177h).i(c27816xac2547f9, str, null);
        if (i17 != null) {
            return i17;
        }
        return null;
    }
}

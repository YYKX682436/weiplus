package ku1;

/* loaded from: classes15.dex */
public abstract class i extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f393626b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.x3 f393627c;

    /* renamed from: d, reason: collision with root package name */
    public tt1.j f393628d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f393629e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f393630f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f393631g;

    /* renamed from: h, reason: collision with root package name */
    public ku1.l0 f393632h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f393633i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.ViewStub f393634j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f393635k = new ku1.h(this);

    @Override // ku1.m
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s4 s4Var = this.f393665a;
        this.f393626b = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).f176469e;
        this.f393627c = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).C;
        tt1.j jVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) s4Var).E;
        this.f393628d = jVar;
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseCodeView", "initView failure! cardInfo is null!");
            return;
        }
        int i17 = jVar.i0().f466723p;
        if (i17 == 0) {
            this.f393632h = i();
        } else if (i17 == 1) {
            this.f393632h = g();
        } else if (i17 != 2) {
            this.f393632h = j();
        } else {
            this.f393632h = j();
        }
        if (this.f393632h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseCodeView", "iniView failure! codeContainer is null!");
            return;
        }
        int i18 = this.f393628d.i0().f466723p;
        if (i18 != 0) {
            if (i18 != 1) {
                if (i18 != 2) {
                    if (this.f393634j == null) {
                        this.f393634j = (android.view.ViewStub) b(com.p314xaae8f345.mm.R.id.bbl);
                    }
                } else if (this.f393634j == null) {
                    this.f393634j = (android.view.ViewStub) b(com.p314xaae8f345.mm.R.id.bbl);
                }
            } else if (this.f393634j == null) {
                this.f393634j = (android.view.ViewStub) b(com.p314xaae8f345.mm.R.id.f565093b83);
            }
        } else if (this.f393634j == null) {
            this.f393634j = (android.view.ViewStub) b(com.p314xaae8f345.mm.R.id.f565098b92);
        }
        if (this.f393634j == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseCodeView", "initTargetView failure! viewStub is null!");
        } else {
            ku1.l0 l0Var = this.f393632h;
            if (l0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseCodeView", "iniView failure! codeContainer is null!");
            } else if (l0Var.mo144393x2ee31f5b() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseCodeView", "initTargetView failure! codeContainer.getLayoutId()  is 0!");
            } else {
                this.f393634j.setLayoutResource(this.f393632h.mo144393x2ee31f5b());
                if (this.f393631g == null) {
                    this.f393631g = (android.view.ViewGroup) this.f393634j.inflate();
                }
            }
        }
        if (this.f393631g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseCodeView", "iniView failure! targetView is null!");
        }
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.ViewGroup viewGroup = this.f393631g;
        if (viewGroup != null) {
            viewGroup.setVisibility(i17);
        }
    }

    @Override // ku1.m
    public void e() {
        if (this.f393628d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseCodeView", "update  failure! mCardInfo is null!");
            return;
        }
        if (this.f393632h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseCodeView", "update failure! codeContainer is null!");
            return;
        }
        if (this.f393631g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseCodeView", "update failure! targetView is null!");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.x3 x3Var = this.f393627c;
        if (x3Var.f176984o < 0.8f) {
            android.view.WindowManager.LayoutParams attributes = x3Var.f176970a.getWindow().getAttributes();
            attributes.screenBrightness = 0.8f;
            x3Var.f176970a.getWindow().setAttributes(attributes);
        }
        l(lu1.e.CARDCODEREFRESHACTION_ENTERCHANGE);
        this.f393632h.a(this.f393631g, this.f393628d);
    }

    public void f() {
        this.f393665a = null;
        this.f393626b = null;
        this.f393627c = null;
        this.f393628d = null;
        this.f393631g = null;
        this.f393632h = null;
        lu1.a0.F(this.f393629e);
        lu1.a0.F(this.f393630f);
    }

    public abstract ku1.l0 g();

    public abstract java.lang.String h(lu1.e eVar);

    public abstract ku1.l0 i();

    public abstract ku1.l0 j();

    public abstract boolean k(tt1.j jVar);

    public void l(lu1.e eVar) {
        tt1.j jVar;
        android.view.ViewGroup viewGroup;
        tt1.j jVar2 = this.f393628d;
        if (jVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseCodeView", "updateCodeView getCode mCardInfo  is null ! cannot show code view");
            return;
        }
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseCodeView", "updateCodeView failure!refreshReason is null!");
            return;
        }
        boolean d17 = this.f393632h.d(jVar2);
        int i17 = eVar.f402870d;
        if (!d17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseCodeView", "updateCodeView failure! can not get qrcode! refreshReason = %s", java.lang.Integer.valueOf(i17));
            ku1.l0 l0Var = this.f393632h;
            if (l0Var == null || (jVar = this.f393628d) == null || (viewGroup = this.f393631g) == null) {
                return;
            }
            l0Var.b(viewGroup, jVar);
            return;
        }
        this.f393632h.c(this.f393631g, this.f393628d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardBaseCodeView", "updateCodeView from refreshReason = %s", java.lang.Integer.valueOf(i17));
        java.lang.String h17 = h(eVar);
        this.f393633i = h17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardBaseCodeView", "updateCodeView getCode is empty! cannot show code view");
            return;
        }
        int i18 = this.f393628d.i0().f466723p;
        int i19 = 1;
        if (i18 == 0) {
            android.view.ViewGroup viewGroup2 = this.f393631g;
            java.lang.String str = this.f393633i;
            android.widget.TextView textView = (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.c0u);
            textView.setText(lu1.g0.a(4, str, true));
            textView.setOnLongClickListener(this.f393635k);
            java.lang.String str2 = this.f393628d.s0().f470088p;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                textView.setTextColor(lu1.a0.d(str2));
            }
            if (str.length() <= 12) {
                textView.setTextSize(1, 33.0f);
                return;
            }
            if (str.length() > 12 && str.length() <= 16) {
                textView.setTextSize(1, 30.0f);
                return;
            }
            if (str.length() > 16 && str.length() <= 20) {
                textView.setTextSize(1, 24.0f);
                return;
            }
            if (str.length() > 20 && str.length() <= 40) {
                textView.setTextSize(1, 18.0f);
                return;
            } else {
                if (str.length() > 40) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (i18 == 1) {
            android.view.ViewGroup viewGroup3 = this.f393631g;
            java.lang.String str3 = this.f393633i;
            try {
                android.widget.ImageView imageView = (android.widget.ImageView) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.f565310c06);
                lu1.a0.F(this.f393630f);
                if (str3 != null && str3.length() > 0) {
                    this.f393630f = ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Bi(this.f393626b, str3, 5, 0);
                }
                android.graphics.Bitmap bitmap = this.f393630f;
                if (imageView != null && bitmap != null) {
                    imageView.setImageBitmap(bitmap);
                }
                imageView.setOnClickListener(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).X);
                this.f393627c.f176973d = this.f393630f;
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardBaseCodeView", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        if (i18 != 2) {
            return;
        }
        android.view.ViewGroup viewGroup4 = this.f393631g;
        java.lang.String str4 = this.f393633i;
        try {
            android.widget.ImageView imageView2 = (android.widget.ImageView) viewGroup4.findViewById(com.p314xaae8f345.mm.R.id.c0m);
            lu1.a0.F(this.f393629e);
            tt1.j jVar3 = this.f393628d;
            if (jVar3 != null && jVar3.s0() != null) {
                i19 = this.f393628d.s0().f470102y0;
            }
            android.graphics.Bitmap Bi = ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Bi(this.f393626b, str4, 12, i19);
            this.f393629e = Bi;
            if (imageView2 != null && Bi != null) {
                imageView2.setImageBitmap(Bi);
            }
            imageView2.setOnClickListener(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).X);
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.x3 x3Var = this.f393627c;
            x3Var.f176972c = this.f393629e;
            db5.d5 d5Var = x3Var.f176975f;
            if (d5Var == null || !d5Var.isShowing()) {
                return;
            }
            x3Var.f176977h.setImageBitmap(x3Var.f176972c);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardBaseCodeView", e18, "", new java.lang.Object[0]);
        }
    }
}

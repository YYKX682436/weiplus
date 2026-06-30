package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class i8 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216246d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216247e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216248f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216249g;

    /* renamed from: h, reason: collision with root package name */
    public int f216250h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 f216251i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f216252m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f216246d = "";
        this.f216247e = "";
        this.f216248f = "";
        this.f216249g = "";
        this.f216250h = 15;
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i8 i8Var, int i17) {
        i8Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "sendEvent :" + i17);
        i8Var.f216252m = true;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5462x48e46092 c5462x48e46092 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5462x48e46092();
        c5462x48e46092.f135801g.f89981a = i17;
        c5462x48e46092.e();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (m158359x1e885992().getIntExtra("create_account_style", 0) == 0) {
            android.app.Activity m80379x76847179 = m80379x76847179();
            java.lang.String stringExtra = m158359x1e885992().getStringExtra("param_extra_info");
            cl0.g gVar = (stringExtra == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) ? null : new cl0.g(stringExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "showCreateContactDialog");
            if (gVar != null) {
                cl0.g b17 = gVar.b("tipsWording");
                if (b17 == null) {
                    java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("tipsWording");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo15082x48bce8a4)) {
                        b17 = new cl0.g(mo15082x48bce8a4);
                    }
                }
                if (b17 != null) {
                    java.lang.String mo15082x48bce8a42 = b17.mo15082x48bce8a4(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a42, "optString(...)");
                    this.f216246d = mo15082x48bce8a42;
                    java.lang.String mo15082x48bce8a43 = b17.mo15082x48bce8a4("tip");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a43, "optString(...)");
                    this.f216247e = mo15082x48bce8a43;
                    java.lang.String mo15082x48bce8a44 = b17.mo15082x48bce8a4("cancelWording");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a44, "optString(...)");
                    this.f216248f = mo15082x48bce8a44;
                    java.lang.String mo15082x48bce8a45 = b17.mo15082x48bce8a4("confirmWording");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a45, "optString(...)");
                    this.f216249g = mo15082x48bce8a45;
                }
                this.f216250h = gVar.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
            }
            if (this.f216247e.length() == 0) {
                java.lang.String string = m80379x76847179.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572862cr5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                this.f216247e = string;
            }
            if (this.f216248f.length() == 0) {
                java.lang.String string2 = m80379x76847179.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572860cr3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                this.f216248f = string2;
            }
            if (this.f216249g.length() == 0) {
                java.lang.String string3 = m80379x76847179.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572861cr4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                this.f216249g = string3;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = this.f216251i;
            if (e3Var != null) {
                if (e3Var.e()) {
                    return;
                }
                e3Var.i();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(m80379x76847179);
            this.f216251i = e3Var2;
            e3Var2.f(com.p314xaae8f345.mm.R.C30864xbddafb2a.akn);
            android.widget.TextView textView = (android.widget.TextView) e3Var2.f213492f.findViewById(com.p314xaae8f345.mm.R.id.e8l);
            if (textView != null) {
                if (this.f216246d.length() > 0) {
                    textView.setText(this.f216246d);
                    com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
            android.widget.TextView textView2 = (android.widget.TextView) e3Var2.f213492f.findViewById(com.p314xaae8f345.mm.R.id.e8f);
            if (textView2 != null) {
                textView2.setText(this.f216247e);
                com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
            }
            android.widget.TextView textView3 = (android.widget.TextView) e3Var2.f213492f.findViewById(com.p314xaae8f345.mm.R.id.ei_);
            if (textView3 != null) {
                textView3.setText(this.f216248f);
                com.p314xaae8f345.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
                textView3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f8(e3Var2));
            }
            android.widget.TextView textView4 = (android.widget.TextView) e3Var2.f213492f.findViewById(com.p314xaae8f345.mm.R.id.eia);
            if (textView4 != null) {
                textView4.setText(this.f216249g);
                com.p314xaae8f345.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
            }
            if (textView4 != null) {
                textView4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g8(m80379x76847179, this, e3Var2));
            }
            e3Var2.f213501r = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h8(this);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var3 = this.f216251i;
            if (e3Var3 != null) {
                e3Var3.i();
            }
        }
    }
}

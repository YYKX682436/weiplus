package com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI;", "Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateBaseActivity;", "<init>", "()V", "rt1/r0", "rt1/s0", "rt1/t0", "rt1/u0", "plugin-car-license-plate_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI */
/* loaded from: classes7.dex */
public final class ActivityC13030x3e5b0a3b extends com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.AbstractActivityC13027x671e30c9 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e f176149e;

    /* renamed from: f, reason: collision with root package name */
    public rt1.z0 f176150f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 f176151g;

    /* renamed from: h, reason: collision with root package name */
    public rt1.r0 f176152h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f176153i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f176154m;

    /* renamed from: n, reason: collision with root package name */
    public final rt1.y0 f176155n = new rt1.y0(this);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e c13032x6313e41e = this.f176149e;
        if (c13032x6313e41e != null) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7 c13026x8642c3d7 = c13032x6313e41e.f176156d;
            intent.putExtra("RESULT_KEY_UPDATED_LIST", c13026x8642c3d7 != null ? c13026x8642c3d7.f176137d : null);
            setResult(-1, intent);
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity
    public void onPostCreate(android.os.Bundle bundle) {
        super.onPostCreate(bundle);
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572313ar2));
        mo64405x4dab7448(b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo74406x9c8c0d33(new rt1.v0(this), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        m78559x68e5fd88(com.p314xaae8f345.mm.R.C30859x5a72f63.f560132bx);
        m78513xc2a54588().setBackgroundColor(b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78514x143f1b92().E0(b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        getIntent().setExtrasClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e.class.getClassLoader());
        this.f176149e = (com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e) getIntent().getParcelableExtra("INTENT_KEY_VIEW_MODEL");
        rt1.p1 p1Var = new rt1.p1(qt1.g.f448058f);
        this.f176150f = p1Var;
        rt1.y0 y0Var = this.f176155n;
        y0Var.getClass();
        final com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13030x3e5b0a3b activityC13030x3e5b0a3b = y0Var.f481031a;
        android.view.View m78513xc2a54588 = activityC13030x3e5b0a3b.m78513xc2a54588();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m78513xc2a54588, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) m78513xc2a54588;
        android.view.LayoutInflater.from(activityC13030x3e5b0a3b).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569799ok, viewGroup, true);
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.b6w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        activityC13030x3e5b0a3b.f176153i = findViewById;
        findViewById.findViewById(com.p314xaae8f345.mm.R.id.azw).setOnClickListener(new rt1.w0(activityC13030x3e5b0a3b));
        android.view.LayoutInflater.from(activityC13030x3e5b0a3b).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569802on, viewGroup, true);
        android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.b6x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        activityC13030x3e5b0a3b.f176154m = findViewById2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13033x79d6bc15 c13033x79d6bc15 = new com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13033x79d6bc15(activityC13030x3e5b0a3b);
        viewGroup.addView(c13033x79d6bc15, new android.view.ViewGroup.LayoutParams(-1, -1));
        c13033x79d6bc15.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(activityC13030x3e5b0a3b) { // from class: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$viewCallback$1$init$1$2$1
            {
                super(activityC13030x3e5b0a3b, 1, false);
            }

            @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
            /* renamed from: scrollVerticallyBy */
            public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
                try {
                    return super.mo7922xd8d712a7(i17, z2Var, h3Var);
                } catch (java.lang.IndexOutOfBoundsException unused) {
                    return 0;
                }
            }

            @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
            /* renamed from: supportsPredictiveItemAnimations */
            public boolean mo7924x9f0306c5() {
                return false;
            }
        });
        c13033x79d6bc15.setPadding(0, c13033x79d6bc15.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 0, 0);
        android.view.View inflate = android.view.LayoutInflater.from(activityC13030x3e5b0a3b).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569800ol, (android.view.ViewGroup) c13033x79d6bc15, false);
        inflate.setOnClickListener(new rt1.x0(activityC13030x3e5b0a3b));
        c13033x79d6bc15.mo53680x55dede61(inflate);
        activityC13030x3e5b0a3b.f176151g = c13033x79d6bc15;
        c13033x79d6bc15.m7964x8d4ad49c(new rt1.t0(activityC13030x3e5b0a3b));
        rt1.r0 r0Var = new rt1.r0(activityC13030x3e5b0a3b);
        r0Var.mo8164xbbdced85(true);
        activityC13030x3e5b0a3b.f176152h = r0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 c12809xaf47a071 = activityC13030x3e5b0a3b.f176151g;
        if (c12809xaf47a071 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c12809xaf47a071.mo7960x6cab2c8d(r0Var);
        android.view.View view = activityC13030x3e5b0a3b.f176153i;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 c12809xaf47a0712 = activityC13030x3e5b0a3b.f176151g;
        if (c12809xaf47a0712 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c12809xaf47a0712.setVisibility(8);
        p1Var.f481006b = y0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e c13032x6313e41e = this.f176149e;
        if (c13032x6313e41e != null) {
            rt1.z0 z0Var = this.f176150f;
            if (z0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            ((rt1.p1) z0Var).c(c13032x6313e41e);
        } else {
            rt1.z0 z0Var2 = this.f176150f;
            if (z0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            ((rt1.p1) z0Var2).c(new com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e(null, false, null, false));
        }
        rt1.z0 z0Var3 = this.f176150f;
        if (z0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        this.f176149e = ((rt1.p1) z0Var3).b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPostCreate, viewModel.callbackAfterCreated:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e c13032x6313e41e2 = this.f176149e;
        sb6.append(c13032x6313e41e2 != null && c13032x6313e41e2.f176157e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CarLicensePlateListUI", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: provideCustomActivityContentView */
    public android.view.View mo44294xa334195d() {
        return new com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583(this);
    }
}

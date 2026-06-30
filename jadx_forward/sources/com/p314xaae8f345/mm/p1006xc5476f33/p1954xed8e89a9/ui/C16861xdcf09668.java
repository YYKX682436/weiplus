package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference */
/* loaded from: classes11.dex */
public class C16861xdcf09668 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb implements l75.q0 {
    public android.widget.Button A1;
    public android.widget.Button B1;
    public android.widget.Button C1;
    public android.widget.Button D1;
    public android.widget.Button E1;
    public android.widget.Button F1;
    public android.widget.Button G1;
    public android.widget.TextView H1;
    public boolean I1;
    public int J1;
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf K1;
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 L;
    public java.lang.String L1;
    public boolean M;
    public final l75.v0 M1;
    public int N;
    public int P;
    public boolean Q;
    public boolean R;
    public long S;
    public java.lang.String T;
    public java.lang.String U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.Button f235264l1;

    /* renamed from: p0, reason: collision with root package name */
    public hr3.va f235265p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.Button f235266p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f235267x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.View f235268x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.Button f235269y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.Button f235270y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.View f235271z1;

    public C16861xdcf09668(android.content.Context context) {
        super(context);
        this.Q = false;
        this.S = 0L;
        this.T = "";
        this.U = "";
        this.V = false;
        this.Y = false;
        this.Z = false;
        this.I1 = false;
        this.J1 = 0;
        this.L1 = null;
        this.M1 = new hr3.v9(this);
        this.K1 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.X = false;
        this.f235265p0 = null;
    }

    public void M() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
        am.y00 y00Var = c6231x4f3054ba.f136478g;
        y00Var.f89948b = 5;
        y00Var.f89951e = this.L.d1();
        y00Var.f89950d = this.K1;
        y00Var.f89952f = 4;
        c6231x4f3054ba.e();
    }

    public void N() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
        am.y00 y00Var = c6231x4f3054ba.f136478g;
        y00Var.f89948b = 5;
        y00Var.f89951e = this.L.d1();
        y00Var.f89950d = this.K1;
        y00Var.f89952f = 2;
        c6231x4f3054ba.e();
    }

    public final void O() {
        if (this.X && this.L != null) {
            hr3.va vaVar = this.f235265p0;
            if (vaVar != null) {
                vaVar.h();
            }
            Q();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NormalUserFooterPreference", "iniView : bindView = " + this.X + " contact = " + this.L);
        hr3.va vaVar2 = this.f235265p0;
        if (vaVar2 != null) {
            try {
                vaVar2.g();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public boolean Q() {
        if (this.I1 && this.L.r2()) {
            this.G1.setVisibility(0);
            return true;
        }
        this.G1.setVisibility(8);
        return false;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).length() > 0 && (z3Var = this.L) != null) {
            if (str.equals(z3Var.d1()) || str.equals(this.L.J0())) {
                this.L = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.L.d1(), true);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new hr3.w9(this));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        android.widget.Button button;
        view.toString();
        this.f235267x0 = view.findViewById(com.p314xaae8f345.mm.R.id.cdh);
        this.f235269y0 = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.ce6);
        this.f235264l1 = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.ccq);
        this.f235270y1 = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.ce8);
        this.f235268x1 = view.findViewById(com.p314xaae8f345.mm.R.id.ce9);
        this.f235266p1 = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.ce7);
        this.C1 = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.cau);
        this.f235271z1 = view.findViewById(com.p314xaae8f345.mm.R.id.cdn);
        this.A1 = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.cdm);
        this.B1 = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.cdo);
        this.D1 = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.cdp);
        this.G1 = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.cdd);
        this.E1 = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.ce_);
        this.F1 = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.ccm);
        this.H1 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cde);
        this.X = true;
        O();
        super.t(view);
        if (!this.K1.getIntent().getBooleanExtra("Accept_NewFriend_FromOutside", false) || (button = this.f235269y0) == null) {
            return;
        }
        button.performClick();
    }

    public C16861xdcf09668(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = false;
        this.S = 0L;
        this.T = "";
        this.U = "";
        this.V = false;
        this.Y = false;
        this.Z = false;
        this.I1 = false;
        this.J1 = 0;
        this.L1 = null;
        this.M1 = new hr3.v9(this);
        this.K1 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.X = false;
        this.f235265p0 = null;
    }

    public C16861xdcf09668(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.Q = false;
        this.S = 0L;
        this.T = "";
        this.U = "";
        this.V = false;
        this.Y = false;
        this.Z = false;
        this.I1 = false;
        this.J1 = 0;
        this.L1 = null;
        this.M1 = new hr3.v9(this);
        this.K1 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.X = false;
        this.f235265p0 = null;
    }
}

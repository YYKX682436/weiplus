package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.BizInfoHeaderPreference */
/* loaded from: classes9.dex */
public class C16837x22373da9 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb implements kv.e0, l75.z0 {
    public android.widget.ImageView L;
    public android.widget.ImageView M;
    public android.view.View N;
    public android.widget.TextView P;
    public android.widget.TextView Q;
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 R;
    public java.lang.String S;
    public qk.o T;
    public boolean U;
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf V;
    public final cs3.a W;
    public final cs3.g X;

    public C16837x22373da9(android.content.Context context) {
        super(context);
        this.U = false;
        this.W = new cs3.a(this);
        this.X = new cs3.g(this);
        this.V = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.U = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16837x22373da9.M():void");
    }

    public void N(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.lang.String str, qk.o oVar) {
        this.S = str;
        this.T = oVar;
        O();
        ((l75.a1) c01.d9.b().q()).a(this.X);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().f152112a.a(this.W, android.os.Looper.getMainLooper());
        this.R = z3Var;
        java.lang.String d17 = z3Var.d1();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (d17 == null) {
            d17 = "";
        }
        iz5.a.g("initView: contact username is null", d17.length() > 0);
        M();
    }

    public void O() {
        ((l75.a1) c01.d9.b().q()).e(this.X);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().f152112a.j(this.W);
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        if (!(this.U && this.R != null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfoHeaderPreference", "initView : bindView = " + this.U + "contact = " + this.R);
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((str == null ? "" : str).length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfoHeaderPreference", "notifyChanged: user = " + str);
        } else if (str.equals(this.R.d1())) {
            M();
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        if (obj == null || !(obj instanceof java.lang.String)) {
            return;
        }
        if (!(this.U && this.R != null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizInfoHeaderPreference", "initView : bindView = " + this.U + "contact = " + this.R);
            return;
        }
        java.lang.String str = (java.lang.String) obj;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str.length() > 0 && (z3Var = this.R) != null && z3Var.d1().equals(str)) {
            this.R = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        this.P = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cdf);
        this.Q = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565432ce4);
        this.M = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f564927ak2);
        this.L = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.cav);
        this.N = view.findViewById(com.p314xaae8f345.mm.R.id.caw);
        this.U = true;
        M();
        super.t(view);
    }

    public C16837x22373da9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = false;
        this.W = new cs3.a(this);
        this.X = new cs3.g(this);
        this.V = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.U = false;
    }

    public C16837x22373da9(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.U = false;
        this.W = new cs3.a(this);
        this.X = new cs3.g(this);
        this.V = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.U = false;
    }
}

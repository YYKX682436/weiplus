package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui;

/* renamed from: com.tencent.mm.plugin.account.security.ui.SafeDeviceListPreference */
/* loaded from: classes15.dex */
public class C11393x5bd9875c extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public final android.content.Context L;
    public e71.h M;
    public int N;
    public android.app.ProgressDialog P;
    public boolean Q;
    public android.widget.Button R;
    public android.widget.TextView S;
    public h71.a0 T;
    public h71.b0 U;

    public C11393x5bd9875c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void M() {
        if (this.Q) {
            if (this.S == null || !ot5.h.f430410a.a(this.M.f69210x4b6e878b, wo.w0.k(), "SafeDeviceListPreference", false)) {
                this.S.setVisibility(8);
            } else {
                this.S.setVisibility(0);
                this.S.setText(com.p314xaae8f345.mm.R.C30867xcad56011.is9);
            }
            int i17 = this.N;
            if (i17 == -2) {
                this.H = 0;
                E(0);
            } else {
                if (i17 != 1) {
                    this.H = 0;
                    E(0);
                    return;
                }
                this.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.a3p;
                android.widget.Button button = this.R;
                if (button != null) {
                    button.setOnClickListener(new h71.z(this));
                }
                E(8);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        gm0.j1.d().q(362, this);
        android.app.ProgressDialog progressDialog = this.P;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.P.dismiss();
            this.P = null;
        }
        if (i18 == 0 && i18 == 0) {
            e71.k.wi().mo9951xb06685ab(this.M, new java.lang.String[0]);
            h71.b0 b0Var = this.U;
            if (b0Var != null) {
                java.lang.String str2 = this.f279313q;
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11392x4c96dbc1 activityC11392x4c96dbc1 = ((h71.v) b0Var).f360944a;
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC11392x4c96dbc1.f154743d).w(str2);
                activityC11392x4c96dbc1.f154754r.mo50305x3d8a09a2(0);
                activityC11392x4c96dbc1.mo78491xd9193382(0, activityC11392x4c96dbc1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7q), activityC11392x4c96dbc1.f154753q);
                activityC11392x4c96dbc1.f154744e = ~activityC11392x4c96dbc1.f154744e;
                activityC11392x4c96dbc1.W6();
                return;
            }
            return;
        }
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        android.content.Context context = this.L;
        if (com.p314xaae8f345.mm.ui.pc.a(context, i17, i18, str, 4)) {
            return;
        }
        dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i7j, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        if (this.T != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MySafeDeviceListUI", "delete safedevice failed" + this.M.f69210x4b6e878b);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        this.Q = true;
        this.R = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.csc);
        this.S = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.h0_);
        M();
        super.t(view);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.L.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570825c06, viewGroup2);
        }
        return u17;
    }

    public C11393x5bd9875c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = -2;
        this.Q = false;
        this.L = context;
    }
}

package com.tencent.mm.plugin.account.security.ui;

/* loaded from: classes15.dex */
public class SafeDeviceListPreference extends com.tencent.mm.ui.base.preference.Preference implements com.tencent.mm.modelbase.u0 {
    public final android.content.Context L;
    public e71.h M;
    public int N;
    public android.app.ProgressDialog P;
    public boolean Q;
    public android.widget.Button R;
    public android.widget.TextView S;
    public h71.a0 T;
    public h71.b0 U;

    public SafeDeviceListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void M() {
        if (this.Q) {
            if (this.S == null || !ot5.h.f348877a.a(this.M.field_uid, wo.w0.k(), "SafeDeviceListPreference", false)) {
                this.S.setVisibility(8);
            } else {
                this.S.setVisibility(0);
                this.S.setText(com.tencent.mm.R.string.is9);
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
                this.H = com.tencent.mm.R.layout.a3p;
                android.widget.Button button = this.R;
                if (button != null) {
                    button.setOnClickListener(new h71.z(this));
                }
                E(8);
            }
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.d().q(362, this);
        android.app.ProgressDialog progressDialog = this.P;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.P.dismiss();
            this.P = null;
        }
        if (i18 == 0 && i18 == 0) {
            e71.k.wi().delete(this.M, new java.lang.String[0]);
            h71.b0 b0Var = this.U;
            if (b0Var != null) {
                java.lang.String str2 = this.f197780q;
                com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI mySafeDeviceListUI = ((h71.v) b0Var).f279411a;
                ((com.tencent.mm.ui.base.preference.h0) mySafeDeviceListUI.f73210d).w(str2);
                mySafeDeviceListUI.f73221r.sendEmptyMessage(0);
                mySafeDeviceListUI.addTextOptionMenu(0, mySafeDeviceListUI.getString(com.tencent.mm.R.string.i7q), mySafeDeviceListUI.f73220q);
                mySafeDeviceListUI.f73211e = ~mySafeDeviceListUI.f73211e;
                mySafeDeviceListUI.W6();
                return;
            }
            return;
        }
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        android.content.Context context = this.L;
        if (com.tencent.mm.ui.pc.a(context, i17, i18, str, 4)) {
            return;
        }
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.i7j, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        if (this.T != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MySafeDeviceListUI", "delete safedevice failed" + this.M.field_uid);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        this.Q = true;
        this.R = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.csc);
        this.S = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.h0_);
        M();
        super.t(view);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.L.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            layoutInflater.inflate(com.tencent.mm.R.layout.f489292c06, viewGroup2);
        }
        return u17;
    }

    public SafeDeviceListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = -2;
        this.Q = false;
        this.L = context;
    }
}

package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.ZonePreference */
/* loaded from: classes15.dex */
public class C22560xff26e1c7 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 L;
    public java.lang.CharSequence M;
    public android.widget.TextView N;

    public C22560xff26e1c7(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void H(java.lang.CharSequence charSequence) {
        this.M = charSequence;
        M();
    }

    public final void M() {
        if (this.N == null) {
            return;
        }
        java.lang.CharSequence charSequence = this.M;
        if (charSequence == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence.toString())) {
            this.N.setVisibility(8);
        } else {
            this.N.setVisibility(0);
        }
        this.N.setText(this.M);
    }

    public void N(com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f5) {
        if (c21050xe4d9f0f5 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21050xe4d9f0f5.m77921xfb82e301()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21050xe4d9f0f5.m77919xfb7e1663())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ZonePreference", "setZoneItem item = null");
            return;
        }
        C(c21050xe4d9f0f5.m77919xfb7e1663() + c21050xe4d9f0f5.m77924xb9a175b5());
        this.L = c21050xe4d9f0f5;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        if (this.L == null) {
            return;
        }
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.pte)).setText(this.L.m77921xfb82e301());
        this.N = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nsi);
        M();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570820c01, viewGroup2);
        return u17;
    }

    public C22560xff26e1c7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}

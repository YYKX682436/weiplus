package com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui;

/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailHeaderPreference */
/* loaded from: classes.dex */
public class C19555x3c04b1ec extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final android.view.LayoutInflater L;
    public android.widget.TextView M;
    public android.widget.TextView N;

    public C19555x3c04b1ec(android.content.Context context) {
        this(context, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.N = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.pfl);
        this.M = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.pfs);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        this.L.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d8s, viewGroup2);
        return u17;
    }

    public C19555x3c04b1ec(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19555x3c04b1ec(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}

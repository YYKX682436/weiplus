package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsArtistPreference */
/* loaded from: classes.dex */
public final class C18012xe37424fa extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final java.lang.String L;
    public java.lang.String M;
    public final int N;
    public final int P;
    public android.widget.TextView Q;
    public java.lang.String R;
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf S;

    public C18012xe37424fa(android.content.Context context) {
        this(context, null);
        this.S = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
    }

    public void M() {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateArtistName", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        if (this.Q != null && (str = this.R) != null && !str.equals("") && (abstractActivityC21394xb3d2c0cf = this.S) != null) {
            this.Q.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iye, this.R));
            this.Q.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateArtistName", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindView", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        super.t(view);
        this.Q = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a59);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564453rt);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getmTitle", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        java.lang.String str = this.M;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getmTitle", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        textView.setText(str);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o58);
        if (textView2 != null) {
            textView2.setVisibility(this.P);
            textView2.setText(this.L);
            int i17 = this.N;
            if (i17 != -1) {
                textView2.setBackgroundDrawable(i65.a.i(this.S, i17));
            }
        }
        M();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindView", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateView", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        this.M = this.S.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iyg);
        layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.byx, viewGroup2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateView", "com.tencent.mm.plugin.sns.ui.SnsArtistPreference");
        return u17;
    }

    public C18012xe37424fa(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.S = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
    }

    public C18012xe37424fa(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = "";
        this.N = -1;
        this.P = 8;
        this.Q = null;
        this.R = "";
        this.S = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}

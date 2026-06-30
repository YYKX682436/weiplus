package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1038xa8fcbcdb;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.preference.AppBrandAuthPreference */
/* loaded from: classes3.dex */
public class C11742x9bb9c049 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public boolean L;
    public java.lang.String M;
    public android.widget.TextView N;
    public android.widget.CheckBox P;

    public C11742x9bb9c049(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void M(boolean z17) {
        this.L = z17;
        android.widget.CheckBox checkBox = this.P;
        if (checkBox != null) {
            checkBox.setChecked(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.btf);
        this.P = checkBox;
        if (checkBox != null) {
            checkBox.setChecked(this.L);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a7v);
        this.N = textView;
        if (textView != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.M)) {
            this.N.setText(this.M);
        }
        E(8);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        ((android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569601fz, viewGroup2);
        return u17;
    }

    public C11742x9bb9c049(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = false;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}

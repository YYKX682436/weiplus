package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactMobileInfoPreference */
/* loaded from: classes.dex */
public class C16842x1232058b extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.TextView L;
    public android.widget.TextView M;

    public C16842x1232058b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        this.L = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.M = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.jmo);
        android.widget.TextView textView = this.L;
        if (textView != null) {
            textView.setText((java.lang.CharSequence) null);
        }
        android.widget.TextView textView2 = this.M;
        if (textView2 != null) {
            textView2.setText((java.lang.CharSequence) null);
        }
        super.t(view);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bzo, viewGroup2);
        return u17;
    }

    public C16842x1232058b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}

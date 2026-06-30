package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* renamed from: com.tencent.mm.plugin.address.ui.RcptPreference */
/* loaded from: classes.dex */
public class C11493x8ade0ad0 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.p1019x633fb29.C11485x80cda4c8 L;

    public C11493x8ade0ad0(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        if (this.L == null) {
            return;
        }
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.pte)).setText(this.L.f155904d);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bzv, viewGroup2);
        return u17;
    }

    public C11493x8ade0ad0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}

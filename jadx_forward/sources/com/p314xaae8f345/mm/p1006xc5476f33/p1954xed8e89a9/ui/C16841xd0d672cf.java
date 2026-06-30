package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactLabelPreference */
/* loaded from: classes3.dex */
public class C16841xd0d672cf extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21513x4f979dda L;
    public android.widget.TextView M;
    public final java.util.ArrayList N;

    public C16841xd0d672cf(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        java.util.ArrayList arrayList;
        this.M = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21513x4f979dda c21513x4f979dda = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21513x4f979dda) view.findViewById(com.p314xaae8f345.mm.R.id.cee);
        this.L = c21513x4f979dda;
        c21513x4f979dda.m79110x52d64a5e(true);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21513x4f979dda c21513x4f979dda2 = this.L;
        c21513x4f979dda2.f279114m = false;
        c21513x4f979dda2.k(false);
        android.widget.TextView textView = this.M;
        if (textView != null) {
            textView.setText((java.lang.CharSequence) null);
        }
        if (this.L != null && (arrayList = this.N) != null && arrayList.size() > 0) {
            this.L.r(arrayList, arrayList);
        }
        super.t(view);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bzm, viewGroup2);
        return u17;
    }

    public C16841xd0d672cf(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = new java.util.ArrayList();
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}

package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.HeadImgPreference */
/* loaded from: classes.dex */
public final class C19707x46ebc6de extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final int L;
    public android.widget.ImageView M;

    public C19707x46ebc6de(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        if (this.M == null) {
            this.M = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9k);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.jlx);
        int i17 = this.L;
        if (i17 != -1) {
            linearLayout.setMinimumHeight(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.bzg, viewGroup2);
        this.M = (android.widget.ImageView) u17.findViewById(com.p314xaae8f345.mm.R.id.h9k);
        return u17;
    }

    public C19707x46ebc6de(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = -1;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}

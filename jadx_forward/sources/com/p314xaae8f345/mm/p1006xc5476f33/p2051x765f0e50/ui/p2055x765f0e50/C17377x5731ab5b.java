package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.PersonalPreference */
/* loaded from: classes.dex */
public class C17377x5731ab5b extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.ImageView L;
    public int M;
    public java.lang.String N;

    public C17377x5731ab5b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = null;
        this.M = -1;
        this.N = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        if (this.L == null) {
            this.L = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9o);
        }
        int i17 = this.M;
        if (i17 > 0) {
            this.L.setImageResource(i17);
        } else if (this.N != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.L, this.N, null);
        }
        this.L.setOnClickListener(null);
        super.t(view);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.bzr, viewGroup2);
        return u17;
    }

    public C17377x5731ab5b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = null;
        this.M = -1;
        this.N = null;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
        this.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570827c10;
    }
}

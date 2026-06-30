package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* renamed from: com.tencent.mm.plugin.shake.ui.TVThumbPreference */
/* loaded from: classes9.dex */
public class C17682xe4b6906f extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb implements x51.r0 {
    public android.widget.ImageView L;
    public android.widget.ImageView M;
    public android.widget.ImageView N;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r P;
    public java.util.List Q;

    public C17682xe4b6906f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.Q = null;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.d2i;
        this.H = 0;
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (str == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        android.widget.ImageView imageView = this.L;
        if (imageView != null && imageView.getTag() != null && str.equals((java.lang.String) this.L.getTag())) {
            this.L.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.o1(this, bitmap));
            return;
        }
        android.widget.ImageView imageView2 = this.M;
        if (imageView2 != null && imageView2.getTag() != null && str.equals((java.lang.String) this.M.getTag())) {
            this.M.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.p1(this, bitmap));
            return;
        }
        android.widget.ImageView imageView3 = this.N;
        if (imageView3 == null || imageView3.getTag() == null || !str.equals((java.lang.String) this.N.getTag())) {
            return;
        }
        this.N.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.q1(this, bitmap));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.L = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.o6u);
        this.M = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.o6v);
        this.N = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.o6w);
        java.util.List list = this.Q;
        if (list == null || list.size() <= 0) {
            return;
        }
        j34.h hVar = new j34.h((java.lang.String) this.Q.get(0));
        this.L.setTag(hVar.c());
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(hVar);
        if (d17 != null && !d17.isRecycled()) {
            this.L.setImageBitmap(d17);
        }
        this.L.setVisibility(0);
        if (1 >= this.Q.size()) {
            return;
        }
        j34.h hVar2 = new j34.h((java.lang.String) this.Q.get(1));
        this.M.setTag(hVar2.c());
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        android.graphics.Bitmap d18 = x51.w0.d(hVar2);
        if (d18 != null && !d18.isRecycled()) {
            this.M.setImageBitmap(d18);
        }
        this.M.setVisibility(0);
        if (2 >= this.Q.size()) {
            return;
        }
        j34.h hVar3 = new j34.h((java.lang.String) this.Q.get(2));
        this.N.setTag(hVar3.c());
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        android.graphics.Bitmap d19 = x51.w0.d(hVar3);
        if (d19 != null && !d19.isRecycled()) {
            this.N.setImageBitmap(d19);
        }
        this.N.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        return super.u(viewGroup);
    }

    public C17682xe4b6906f(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

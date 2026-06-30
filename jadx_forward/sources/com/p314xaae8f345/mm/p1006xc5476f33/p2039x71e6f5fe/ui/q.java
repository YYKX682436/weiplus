package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes9.dex */
public class q extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb implements y60.e {
    public android.view.View L;
    public android.widget.ImageView M;
    public java.lang.String N;
    public final android.content.Context P;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r Q;

    public q(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = null;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.cae;
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
        this.P = context;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals(this.N) || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p(this, bitmap));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View p(android.view.View view, android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            this.L = u(viewGroup);
        }
        t(this.L);
        return this.L;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.M = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.jec);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.N)) {
            return;
        }
        e04.s3 s3Var = new e04.s3(this.N);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(s3Var);
        if (d17 == null || d17.isRecycled()) {
            this.M.setBackgroundColor(this.P.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560754t9));
            this.M.setImageBitmap(null);
        } else {
            this.M.setImageBitmap(d17);
            this.M.setBackgroundColor(0);
        }
        ((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.je7)).setVisibility(0);
    }
}

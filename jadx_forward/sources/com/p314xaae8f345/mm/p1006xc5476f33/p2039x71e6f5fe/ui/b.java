package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb implements y60.e {
    public android.view.View L;
    public android.widget.TextView M;
    public android.widget.ImageView N;
    public java.lang.String P;
    public java.lang.String Q;

    public b(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = null;
        this.Q = null;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.chz;
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals(this.P) || bitmap == null || bitmap.isRecycled() || this.N == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.a(this, bitmap));
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
        this.M = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565628d02);
        this.N = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f564082hh);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.Q)) {
            this.M.setVisibility(8);
        } else {
            this.M.setText(this.Q);
            this.M.setVisibility(0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.P)) {
            return;
        }
        e04.s3 s3Var = new e04.s3(this.P);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(s3Var);
        if (d17 == null || d17.isRecycled()) {
            return;
        }
        this.N.setImageBitmap(d17);
        this.N.setVisibility(0);
    }
}

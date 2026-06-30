package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes9.dex */
public class h extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb implements y60.e {
    public android.view.View L;
    public android.widget.ImageView M;
    public android.widget.TextView N;
    public android.widget.TextView P;
    public java.lang.String Q;
    public java.lang.String R;
    public java.lang.String S;

    public h(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = null;
        this.N = null;
        this.P = null;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570895ca3;
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals(this.Q) || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.M.setImageBitmap(bitmap);
        this.M.setBackgroundColor(0);
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
        this.M = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.c6k);
        this.N = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.c7q);
        this.P = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.c6p);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.Q)) {
            this.M.setVisibility(8);
        } else {
            e04.s3 s3Var = new e04.s3(this.Q);
            ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
            android.graphics.Bitmap d17 = x51.w0.d(s3Var);
            if (d17 == null || d17.isRecycled()) {
                try {
                    this.M.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null)));
                } catch (java.io.IOException unused) {
                    this.M.setImageBitmap(null);
                }
            } else {
                this.M.setImageBitmap(d17);
                this.M.setBackgroundColor(0);
            }
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.S);
        android.content.Context context = this.f279303d;
        if (K0) {
            this.N.setVisibility(8);
        } else {
            android.widget.TextView textView = this.N;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = this.S;
            float textSize = this.N.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.R)) {
            this.P.setVisibility(8);
        } else {
            this.P.setText(this.R);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.S) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.Q)) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.c6o);
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.height = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a7v);
            linearLayout.setPadding(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 9.0f), 0, 0, 0);
            linearLayout.setLayoutParams(layoutParams);
        }
    }
}

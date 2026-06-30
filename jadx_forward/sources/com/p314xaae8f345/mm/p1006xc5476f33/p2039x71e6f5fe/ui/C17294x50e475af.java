package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* renamed from: com.tencent.mm.plugin.scanner.ui.CategoryWithTitlePreference */
/* loaded from: classes9.dex */
public final class C17294x50e475af extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb implements y60.e {
    public final android.content.Context L;
    public android.widget.TextView M;
    public android.widget.ImageView N;
    public java.lang.String P;
    public final int Q;
    public final int R;

    public C17294x50e475af(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void J(int i17) {
        if (this.M != null) {
            android.content.Context context = this.L;
            if (context != null) {
                this.P = context.getString(i17);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.P)) {
                this.M.setVisibility(8);
            } else {
                this.M.setVisibility(0);
                this.M.setText(this.P);
            }
        }
        super.J(i17);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals(null) || bitmap == null || bitmap.isRecycled() || this.N == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.g(this, bitmap));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void L(java.lang.CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0) {
            android.widget.TextView textView = this.M;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            this.P = charSequence.toString();
            android.widget.TextView textView2 = this.M;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.M.setText(charSequence);
                java.util.Objects.toString(this.M.getText());
            }
        }
        super.L(charSequence);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public java.lang.CharSequence o() {
        return this.P;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        android.widget.TextView textView;
        super.t(view);
        this.M = (android.widget.TextView) view.findViewById(android.R.id.title);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        this.N = imageView;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        float f17 = this.Q / 2;
        android.content.Context context = this.L;
        layoutParams.width = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, f17);
        layoutParams.height = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, this.R / 2);
        this.N.setLayoutParams(layoutParams);
        java.lang.String str = this.P;
        if (str != null && str.length() > 0 && (textView = this.M) != null) {
            textView.setVisibility(0);
            this.M.setText(this.P);
            java.util.Objects.toString(this.M.getText());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            return;
        }
        e04.s3 s3Var = new e04.s3(null);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(s3Var);
        if (d17 == null || d17.isRecycled()) {
            return;
        }
        this.N.setImageBitmap(d17);
        this.N.setVisibility(0);
    }

    public C17294x50e475af(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.P = "";
        this.Q = 34;
        this.R = 34;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570813bz0;
        this.L = context;
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
    }
}

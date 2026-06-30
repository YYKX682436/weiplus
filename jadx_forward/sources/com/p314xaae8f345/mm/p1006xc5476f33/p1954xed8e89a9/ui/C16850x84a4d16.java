package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactSocialInfoPreference */
/* loaded from: classes.dex */
public class C16850x84a4d16 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.ImageView L;
    public android.widget.ImageView M;
    public android.widget.ImageView N;
    public android.widget.ImageView P;
    public android.widget.ImageView Q;
    public android.widget.ImageView R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public android.widget.TextView Y;

    public C16850x84a4d16(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S = 8;
        this.T = 8;
        this.U = 8;
        this.V = 8;
        this.W = 8;
        this.X = 8;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        this.L = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h_3);
        this.M = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h_9);
        this.N = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9x);
        this.P = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9_);
        this.Q = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9i);
        this.R = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f566849ha0);
        this.Y = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
        android.widget.ImageView imageView = this.L;
        if (imageView != null) {
            imageView.setVisibility(this.S);
        }
        android.widget.ImageView imageView2 = this.M;
        if (imageView2 != null) {
            imageView2.setVisibility(this.T);
        }
        android.widget.ImageView imageView3 = this.N;
        if (imageView3 != null) {
            imageView3.setVisibility(this.U);
        }
        android.widget.ImageView imageView4 = this.P;
        if (imageView4 != null) {
            imageView4.setVisibility(this.V);
        }
        android.widget.ImageView imageView5 = this.Q;
        if (imageView5 != null) {
            imageView5.setVisibility(this.W);
        }
        android.widget.TextView textView = this.Y;
        if (textView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = i65.a.h(this.f279303d, com.p314xaae8f345.mm.R.C30860x5b28f31.f561319f7);
            this.Y.setLayoutParams(layoutParams);
        }
        android.widget.ImageView imageView6 = this.R;
        if (imageView6 != null) {
            imageView6.setVisibility(this.X);
        }
        super.t(view);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570819c00, viewGroup2);
        return u17;
    }

    public C16850x84a4d16(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.S = 8;
        this.T = 8;
        this.U = 8;
        this.V = 8;
        this.W = 8;
        this.X = 8;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}

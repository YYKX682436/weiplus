package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.ButtonPreference */
/* loaded from: classes11.dex */
public class C21540x14db2dcd extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;
    public android.widget.ImageView M;
    public android.widget.TextView N;
    public int P;
    public int Q;
    public java.lang.String R;
    public android.graphics.drawable.Drawable S;
    public android.content.Context T;
    public boolean U;
    public int V;

    public C21540x14db2dcd(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.U = true;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
        M(context, attributeSet);
    }

    public final void M(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.T = context;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544627a);
        this.P = obtainStyledAttributes.getColor(2, 0);
        this.Q = obtainStyledAttributes.getColor(3, 0);
        this.R = context.getString(obtainStyledAttributes.getResourceId(1, 0));
        this.S = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    public void N(int i17) {
        android.view.View view = this.L;
        if (view != null) {
            view.setBackground(this.T.getResources().getDrawable(i17));
        }
    }

    public void O(java.lang.String str, int i17) {
        this.R = str;
        this.Q = i17;
        android.widget.TextView textView = this.N;
        if (textView != null) {
            textView.setText(str);
            this.N.setTextColor(i17);
            if (this.U) {
                com.p314xaae8f345.mm.ui.bk.r0(this.N.getPaint(), 0.8f);
            }
        }
    }

    public void Q(boolean z17) {
        this.U = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        int i17;
        super.t(view);
        this.M = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        this.N = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o3b);
        android.widget.ImageView imageView = this.M;
        if (imageView != null && this.S != null) {
            imageView.setVisibility(0);
            android.widget.ImageView imageView2 = this.M;
            android.graphics.drawable.Drawable drawable = this.S;
            com.p314xaae8f345.mm.ui.uk.f(drawable, this.P);
            imageView2.setImageDrawable(drawable);
        }
        android.widget.TextView textView = this.N;
        if (textView != null) {
            textView.setText(this.R);
            this.N.setTextColor(this.Q);
            if (this.U) {
                com.p314xaae8f345.mm.ui.bk.r0(this.N.getPaint(), 0.8f);
            }
        }
        android.view.View view2 = this.L;
        if (view2 == null || (i17 = this.V) == 0) {
            return;
        }
        view2.setId(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f279303d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c_e, (android.view.ViewGroup) null);
        this.L = inflate;
        return inflate;
    }

    public C21540x14db2dcd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = true;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
        M(context, attributeSet);
    }
}

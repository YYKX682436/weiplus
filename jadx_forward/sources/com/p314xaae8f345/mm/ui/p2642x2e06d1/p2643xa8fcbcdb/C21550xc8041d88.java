package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.IconSummaryPreference */
/* loaded from: classes11.dex */
public class C21550xc8041d88 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public java.lang.String L;
    public int M;
    public int N;
    public final int P;
    public final int Q;
    public final int R;
    public int S;
    public android.widget.ImageView T;
    public android.view.ViewGroup U;
    public android.view.View V;
    public android.widget.TextView W;
    public final int X;
    public final int Y;
    public final android.content.Context Z;

    public C21550xc8041d88(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void G(int i17) {
        java.lang.CharSequence charSequence;
        super.G(i17);
        if (this.W == null || (charSequence = this.f279309m) == null || charSequence.length() <= 0) {
            return;
        }
        this.W.setText(this.f279309m);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void H(java.lang.CharSequence charSequence) {
        java.lang.CharSequence charSequence2;
        super.H(charSequence);
        if (this.W == null || (charSequence2 = this.f279309m) == null || charSequence2.length() <= 0) {
            return;
        }
        this.W.setText(this.f279309m);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        int i17;
        java.lang.CharSequence charSequence;
        super.t(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9o);
        if (imageView != null) {
            imageView.setVisibility(8);
            android.graphics.drawable.Drawable drawable = this.f279312p;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
            } else {
                int i18 = this.f279310n;
                if (i18 != 0) {
                    imageView.setImageResource(i18);
                    imageView.setVisibility(0);
                }
            }
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.jlx);
        int i19 = this.Y;
        if (i19 != -1) {
            linearLayout.setMinimumHeight(i19);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o58);
        if (textView != null) {
            textView.setVisibility(this.N);
            textView.setText(this.L);
            int i27 = this.M;
            if (i27 != -1) {
                textView.setBackgroundDrawable(i65.a.i(this.Z, i27));
            }
        }
        if (this.T == null) {
            this.T = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h_s);
        }
        if (this.U == null) {
            this.U = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.m4_);
        }
        if (this.V == null) {
            this.V = view.findViewById(com.p314xaae8f345.mm.R.id.m47);
        }
        android.view.View view2 = this.V;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.R));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/base/preference/IconSummaryPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/base/preference/IconSummaryPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i28 = this.P;
        if (i28 != -1) {
            this.T.setImageResource(i28);
        }
        this.T.setVisibility(this.Q);
        this.U.setVisibility(0);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.m4g);
        this.W = textView2;
        if (textView2 != null && (charSequence = this.f279309m) != null && charSequence.length() > 0) {
            this.W.setText(this.f279309m);
            this.W.setVisibility(this.S);
        }
        android.widget.TextView textView3 = this.W;
        if (textView3 == null || (i17 = this.X) == -1) {
            return;
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(i17, 0, 0, 0);
        this.W.setCompoundDrawablePadding(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(this.f279303d, 2.0f));
        this.W.setVisibility(this.S);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.bzj, viewGroup2);
        return u17;
    }

    public C21550xc8041d88(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = -1;
        this.N = 8;
        this.P = -1;
        this.Q = 8;
        this.R = 8;
        this.S = 8;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = -1;
        this.Y = -1;
        this.Z = context;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}

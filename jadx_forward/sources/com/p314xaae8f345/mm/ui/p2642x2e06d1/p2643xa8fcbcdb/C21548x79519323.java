package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.IconMsgPreference */
/* loaded from: classes.dex */
public class C21548x79519323 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final java.lang.String L;
    public final int M;
    public final int N;
    public final int P;
    public final int Q;
    public final android.content.Context R;
    public final java.lang.String S;

    public C21548x79519323(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9o);
        if (imageView != null) {
            int i17 = this.f279310n;
            if (i17 != 0) {
                imageView.setImageResource(i17);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.jlx);
        int i18 = this.Q;
        if (i18 != -1) {
            linearLayout.setMinimumHeight(i18);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o58);
        if (textView != null) {
            textView.setVisibility(this.N);
            textView.setText(this.L);
            int i19 = this.M;
            if (i19 != -1) {
                textView.setBackgroundDrawable(i65.a.i(this.R, i19));
            }
        }
        ((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.o4r)).setVisibility(this.P);
        ((android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.m4_)).setVisibility(0);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o59);
        java.lang.String str = this.S;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.c09, viewGroup2);
        u17.setMinimumHeight(u17.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561456j2));
        return u17;
    }

    public C21548x79519323(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = -1;
        this.N = 8;
        this.P = 8;
        this.Q = -1;
        this.S = "";
        this.R = context;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}

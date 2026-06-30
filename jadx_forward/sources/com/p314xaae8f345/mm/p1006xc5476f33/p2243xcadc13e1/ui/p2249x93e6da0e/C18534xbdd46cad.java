package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2249x93e6da0e;

/* renamed from: com.tencent.mm.plugin.subapp.ui.pluginapp.AddFriendItemPreference */
/* loaded from: classes11.dex */
public class C18534xbdd46cad extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final java.lang.String L;
    public final int M;
    public int N;
    public final int P;
    public final android.content.Context Q;

    public C18534xbdd46cad(android.content.Context context) {
        this(context, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0 = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) view.findViewById(com.p314xaae8f345.mm.R.id.h9o);
        if (c21405x85fc1ce0 != null) {
            c21405x85fc1ce0.setVisibility(8);
            android.graphics.drawable.Drawable drawable = this.f279312p;
            if (drawable != null) {
                c21405x85fc1ce0.setImageDrawable(drawable);
                c21405x85fc1ce0.setVisibility(0);
            } else {
                int i17 = this.f279310n;
                if (i17 != 0) {
                    c21405x85fc1ce0.setImageResource(i17);
                    c21405x85fc1ce0.setVisibility(0);
                }
            }
            int i18 = this.f279311o;
            if (i18 != 0) {
                c21405x85fc1ce0.getDrawable().setColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP);
            } else if (c21405x85fc1ce0.getDrawable() != null) {
                c21405x85fc1ce0.getDrawable().clearColorFilter();
            }
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.jlx);
        int i19 = this.P;
        if (i19 != -1) {
            linearLayout.setMinimumHeight(i19);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o58);
        if (textView != null) {
            textView.setVisibility(this.N);
            textView.setText(this.L);
            int i27 = this.M;
            if (i27 != -1) {
                textView.setBackgroundDrawable(i65.a.i(this.Q, i27));
            }
        }
    }

    public C18534xbdd46cad(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C18534xbdd46cad(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = -1;
        this.N = 8;
        this.P = -1;
        this.Q = context;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.bz8;
    }
}

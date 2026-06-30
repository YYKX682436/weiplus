package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.BizInfoPayInfoIconPreference */
/* loaded from: classes3.dex */
public class C16838xe3695389 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final android.view.LayoutInflater L;
    public android.widget.LinearLayout M;
    public java.util.List N;
    public int P;

    public C16838xe3695389(android.content.Context context) {
        this(context, null);
    }

    public final void M(int i17) {
        android.widget.ImageView imageView = (android.widget.ImageView) this.L.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570214a14, (android.view.ViewGroup) null);
        android.content.Context context = this.f279303d;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.b(context, 20), i65.a.b(context, 20));
        layoutParams.rightMargin = i65.a.b(context, 6);
        imageView.setImageResource(i17);
        this.M.addView(imageView, layoutParams);
    }

    public void N(int i17) {
        if (i17 == this.P) {
            return;
        }
        this.P = i17;
        Q();
    }

    public void O(java.util.List list) {
        this.N = list;
        Q();
    }

    public final void Q() {
        android.widget.LinearLayout linearLayout = this.M;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        int i17 = this.P;
        if (i17 >= 0) {
            for (int i18 = 0; i18 < 5; i18++) {
                if (i17 <= 0) {
                    M(com.p314xaae8f345.mm.R.raw.f78631xa8753512);
                } else {
                    if (i17 <= 10) {
                        M(com.p314xaae8f345.mm.R.raw.f78629xd251830a);
                    } else if (i17 <= 20) {
                        M(com.p314xaae8f345.mm.R.raw.f78630xf0a4fad8);
                    } else {
                        M(com.p314xaae8f345.mm.R.raw.f78630xf0a4fad8);
                    }
                    i17 -= 20;
                }
            }
            return;
        }
        java.util.List<java.lang.String> list = this.N;
        if (list != null) {
            for (java.lang.String str : list) {
                android.content.Context context = this.f279303d;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913(context, null);
                c19659x677e0913.m75396xca029dad(str);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.b(context, 20), i65.a.b(context, 20));
                layoutParams.rightMargin = i65.a.b(context, 6);
                this.M.addView(c19659x677e0913, layoutParams);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.M = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.ns9);
        Q();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        this.L.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a27, viewGroup2);
        return u17;
    }

    public C16838xe3695389(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C16838xe3695389(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.P = -1;
        this.L = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}

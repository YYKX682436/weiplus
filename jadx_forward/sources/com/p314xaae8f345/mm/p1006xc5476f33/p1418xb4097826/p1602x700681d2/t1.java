package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f203992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1 f203993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f203994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f203995g;

    public t1(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1 w1Var, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f203992d = view;
        this.f203993e = w1Var;
        this.f203994f = textView;
        this.f203995g = textView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i18 = a17.f278668a;
        if (!z17 && i18 > (i17 = a17.f278669b)) {
            i18 = i17;
        }
        int a18 = a06.d.a(i18 * 0.6d);
        android.view.View view = this.f203992d;
        int measuredWidth = view.getMeasuredWidth() <= a18 ? view.getMeasuredWidth() : a18;
        if (measuredWidth != view.getMeasuredWidth()) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = measuredWidth;
            view.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.w1 w1Var = this.f203993e;
        int dimensionPixelOffset = measuredWidth - w1Var.m80379x76847179().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        android.widget.TextView textView = this.f203994f;
        float measureText = textView.getPaint().measureText(textView.getText().toString());
        android.widget.TextView textView2 = this.f203995g;
        float measureText2 = textView2.getPaint().measureText(textView2.getText().toString());
        int dimensionPixelOffset2 = w1Var.m80379x76847179().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        if (measuredWidth >= a18) {
            float f17 = dimensionPixelOffset2;
            float f18 = dimensionPixelOffset;
            if (measureText + measureText2 + f17 > f18) {
                textView.setText(android.text.TextUtils.ellipsize(textView.getText(), textView.getPaint(), ((f18 - measureText2) - f17) - textView.getPaint().measureText("…"), android.text.TextUtils.TruncateAt.END));
            }
        }
    }
}

package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes3.dex */
public class ga extends android.widget.LinearLayout implements vj5.k {

    /* renamed from: d, reason: collision with root package name */
    public final ze.n f89737d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.ea[] f89738e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f89739f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f89740g;

    /* renamed from: h, reason: collision with root package name */
    public int f89741h;

    public ga(android.content.Context context, ze.n nVar) {
        super(context);
        this.f89737d = nVar;
        this.f89739f = new java.util.HashMap();
        this.f89740g = new android.util.SparseArray();
        this.f89738e = new com.tencent.mm.plugin.appbrand.ui.ea[4];
        setClickable(false);
        int i17 = getContext().getResources().getDisplayMetrics().widthPixels;
        int b17 = i65.a.b(getContext(), 10);
        int b18 = i65.a.b(getContext(), 4);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((i17 * 3) / 5, -2);
        layoutParams.gravity = 53;
        setLayoutParams(layoutParams);
        a();
        setPadding(b17, b17, b17, b17);
        setOrientation(1);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(b18);
        gradientDrawable.setColor(-652403418);
        setBackground(gradientDrawable);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, 2);
        android.widget.TextView textView = new android.widget.TextView(getContext());
        android.view.View view = new android.view.View(getContext());
        textView.setTextColor(-1);
        textView.setLayoutParams(layoutParams2);
        textView.setTextSize(1, 14.0f);
        textView.setText(getContext().getString(com.tencent.mm.R.string.f490236ow));
        addView(textView);
        layoutParams3.setMargins(0, i65.a.b(getContext(), 10), 0, 0);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(1728053247);
        addView(view);
        for (int i18 = 0; i18 < 4; i18++) {
            com.tencent.mm.plugin.appbrand.ui.ea eaVar = new com.tencent.mm.plugin.appbrand.ui.ea(this, getContext());
            eaVar.setText(getContext().getString(com.tencent.mm.plugin.appbrand.performance.n.f87367a[i18]));
            this.f89738e[i18] = eaVar;
            addView(eaVar);
        }
        vj5.n.b((android.app.Activity) getContext()).d(this);
    }

    public final void a() {
        if (getLayoutParams() == null || !(getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return;
        }
        ((android.view.ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = com.tencent.mm.plugin.appbrand.widget.b.a(getContext()) + this.f89741h;
        requestLayout();
    }

    @Override // vj5.k
    public void n6(int i17) {
        this.f89741h = i17;
        a();
    }
}

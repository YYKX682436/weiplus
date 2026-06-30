package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes3.dex */
public class ga extends android.widget.LinearLayout implements vj5.k {

    /* renamed from: d, reason: collision with root package name */
    public final ze.n f171270d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ea[] f171271e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f171272f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f171273g;

    /* renamed from: h, reason: collision with root package name */
    public int f171274h;

    public ga(android.content.Context context, ze.n nVar) {
        super(context);
        this.f171270d = nVar;
        this.f171272f = new java.util.HashMap();
        this.f171273g = new android.util.SparseArray();
        this.f171271e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ea[4];
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
        textView.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571769ow));
        addView(textView);
        layoutParams3.setMargins(0, i65.a.b(getContext(), 10), 0, 0);
        view.setLayoutParams(layoutParams3);
        view.setBackgroundColor(1728053247);
        addView(view);
        for (int i18 = 0; i18 < 4; i18++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ea eaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ea(this, getContext());
            eaVar.setText(getContext().getString(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.n.f168900a[i18]));
            this.f171271e[i18] = eaVar;
            addView(eaVar);
        }
        vj5.n.b((android.app.Activity) getContext()).d(this);
    }

    public final void a() {
        if (getLayoutParams() == null || !(getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return;
        }
        ((android.view.ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.b.a(getContext()) + this.f171274h;
        requestLayout();
    }

    @Override // vj5.k
    public void n6(int i17) {
        this.f171274h = i17;
        a();
    }
}

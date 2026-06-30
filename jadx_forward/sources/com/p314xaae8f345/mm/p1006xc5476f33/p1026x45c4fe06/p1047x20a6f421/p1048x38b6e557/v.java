package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557;

/* loaded from: classes8.dex */
public final class v extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f159247d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f159248e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f159249f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.f0 f159250g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, yz5.a aVar, yz5.a aVar2) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f159247d = aVar;
        this.f159248e = aVar2;
        setOrientation(1);
        setBackgroundColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        setVisibility(4);
        post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.q(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.f0 f0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.f0(context);
        addView(f0Var, new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.f159250g = f0Var;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setGravity(17);
        int f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        textView.setPadding(0, f17, 0, f17);
        textView.setTextColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        textView.setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561452iy));
        textView.setText("Clear");
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.r(this));
        linearLayout.addView(textView, new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
        android.view.View view = new android.view.View(context);
        int f18 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        view.setPadding(0, f18, 0, f18);
        view.setBackgroundColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
        linearLayout.addView(view, new android.widget.LinearLayout.LayoutParams(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh), -1));
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setGravity(17);
        int f19 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        textView2.setPadding(0, f19, 0, f19);
        textView2.setTextColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        textView2.setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561452iy));
        textView2.setText("Hide");
        textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.s(this));
        linearLayout.addView(textView2, new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
        addView(linearLayout, -1, -2);
    }

    public final void a() {
        float translationY = getTranslationY();
        boolean z17 = this.f159249f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConsolePrintPanel", "hide, curTranslationY: " + translationY + ", curIsAnimating: " + z17);
        if ((((float) getMeasuredHeight()) == translationY) || z17) {
            return;
        }
        this.f159249f = true;
        animate().translationY(getMeasuredHeight()).setDuration(300L).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.t(this));
    }

    public final void b() {
        float translationY = getTranslationY();
        boolean z17 = this.f159249f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConsolePrintPanel", "show, curTranslationY: " + translationY + ", curIsAnimating: " + z17);
        if ((0.0f == translationY) || z17) {
            return;
        }
        this.f159249f = true;
        animate().translationY(0.0f).setDuration(300L).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.u(this));
    }

    /* renamed from: getPrinter */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.f0 m50185x2b0b03e4() {
        return this.f159250g;
    }
}

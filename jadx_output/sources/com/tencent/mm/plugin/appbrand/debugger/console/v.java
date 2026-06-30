package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes8.dex */
public final class v extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f77714d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f77715e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f77716f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.debugger.console.f0 f77717g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, yz5.a aVar, yz5.a aVar2) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f77714d = aVar;
        this.f77715e = aVar2;
        setOrientation(1);
        setBackgroundColor(b3.l.getColor(context, com.tencent.mm.R.color.f478489a));
        setVisibility(4);
        post(new com.tencent.mm.plugin.appbrand.debugger.console.q(this));
        com.tencent.mm.plugin.appbrand.debugger.console.f0 f0Var = new com.tencent.mm.plugin.appbrand.debugger.console.f0(context);
        addView(f0Var, new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.f77717g = f0Var;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundColor(b3.l.getColor(context, com.tencent.mm.R.color.f478492d));
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setGravity(17);
        int f17 = i65.a.f(context, com.tencent.mm.R.dimen.f479672c9);
        textView.setPadding(0, f17, 0, f17);
        textView.setTextColor(b3.l.getColor(context, com.tencent.mm.R.color.FG_0));
        textView.setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479919iy));
        textView.setText("Clear");
        textView.setOnClickListener(new com.tencent.mm.plugin.appbrand.debugger.console.r(this));
        linearLayout.addView(textView, new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
        android.view.View view = new android.view.View(context);
        int f18 = i65.a.f(context, com.tencent.mm.R.dimen.f479646bl);
        view.setPadding(0, f18, 0, f18);
        view.setBackgroundColor(b3.l.getColor(context, com.tencent.mm.R.color.FG_3));
        linearLayout.addView(view, new android.widget.LinearLayout.LayoutParams(i65.a.f(context, com.tencent.mm.R.dimen.f479642bh), -1));
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setGravity(17);
        int f19 = i65.a.f(context, com.tencent.mm.R.dimen.f479672c9);
        textView2.setPadding(0, f19, 0, f19);
        textView2.setTextColor(b3.l.getColor(context, com.tencent.mm.R.color.FG_0));
        textView2.setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479919iy));
        textView2.setText("Hide");
        textView2.setOnClickListener(new com.tencent.mm.plugin.appbrand.debugger.console.s(this));
        linearLayout.addView(textView2, new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
        addView(linearLayout, -1, -2);
    }

    public final void a() {
        float translationY = getTranslationY();
        boolean z17 = this.f77716f;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintPanel", "hide, curTranslationY: " + translationY + ", curIsAnimating: " + z17);
        if ((((float) getMeasuredHeight()) == translationY) || z17) {
            return;
        }
        this.f77716f = true;
        animate().translationY(getMeasuredHeight()).setDuration(300L).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(new com.tencent.mm.plugin.appbrand.debugger.console.t(this));
    }

    public final void b() {
        float translationY = getTranslationY();
        boolean z17 = this.f77716f;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintPanel", "show, curTranslationY: " + translationY + ", curIsAnimating: " + z17);
        if ((0.0f == translationY) || z17) {
            return;
        }
        this.f77716f = true;
        animate().translationY(0.0f).setDuration(300L).setInterpolator(new android.view.animation.DecelerateInterpolator()).setListener(new com.tencent.mm.plugin.appbrand.debugger.console.u(this));
    }

    public final com.tencent.mm.plugin.appbrand.debugger.console.f0 getPrinter() {
        return this.f77717g;
    }
}

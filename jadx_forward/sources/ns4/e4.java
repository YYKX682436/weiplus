package ns4;

/* loaded from: classes8.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f421046a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f421047b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f421048c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f421049d;

    public e4(android.content.Context context, pr4.e parameter, yz5.a onBack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onBack, "onBack");
        this.f421046a = onBack;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
        this.f421047b = y1Var;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.dds, null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.aa9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f421048c = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.o_w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f421049d = (android.widget.LinearLayout) findViewById2;
        y1Var.k(inflate);
        y1Var.f293570s = new ns4.c4(this);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        java.util.List<java.lang.String> list = parameter.f439525f;
        int i17 = 0;
        for (java.lang.String str : list) {
            int i18 = i17 + 1;
            android.widget.LinearLayout linearLayout = this.f421049d;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tips");
                throw null;
            }
            android.view.View inflate2 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ddr, (android.view.ViewGroup) linearLayout, false);
            android.view.View findViewById3 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.o_1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            android.widget.TextView textView = (android.widget.TextView) findViewById3;
            if (i17 != kz5.c0.h(list)) {
                android.view.ViewGroup.LayoutParams layoutParams = inflate2.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((android.widget.LinearLayout.LayoutParams) layoutParams).bottomMargin = i65.a.b(context, 8);
            }
            os4.h.b(textView, str);
            android.widget.LinearLayout linearLayout2 = this.f421049d;
            if (linearLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tips");
                throw null;
            }
            linearLayout2.addView(inflate2);
            i17 = i18;
        }
        android.view.View view = this.f421048c;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("back_button");
            throw null;
        }
        view.setOnClickListener(new ns4.d4(this));
    }
}

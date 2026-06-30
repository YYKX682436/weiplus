package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingPriceView;", "Landroid/widget/RelativeLayout;", "Los5/w;", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "getSellPrice", "()Landroid/widget/TextView;", "sellPrice", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "xt2/i5", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView */
/* loaded from: classes3.dex */
public final class C14981x40ea4ed4 extends android.widget.RelativeLayout implements os5.w {

    /* renamed from: i, reason: collision with root package name */
    public static final float f207856i;

    /* renamed from: m, reason: collision with root package name */
    public static final float f207857m;

    /* renamed from: n, reason: collision with root package name */
    public static final float f207858n;

    /* renamed from: o, reason: collision with root package name */
    public static final xt2.i5 f207859o;

    /* renamed from: p, reason: collision with root package name */
    public static final xt2.i5 f207860p;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f207861d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f207862e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f207863f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f207864g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final android.widget.TextView sellPrice;

    static {
        float a17 = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 17.0f);
        f207856i = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 15.0f);
        f207857m = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 14.0f);
        float a18 = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12.0f);
        f207858n = a18;
        f207859o = new xt2.i5(a17, a18, a18, a18, true, true, a18, true, i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), false, false, false, 3584, null);
        f207860p = new xt2.i5(a18, 0.0f, 0.0f, 0.0f, false, false, 0.0f, false, i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), false, false, false, 3584, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14981x40ea4ed4(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.azj, (android.view.ViewGroup) this, false);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        addView(inflate, layoutParams);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f567947l51);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.l7g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.sellPrice = textView;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.dio);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f207861d = textView2;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.qw6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        this.f207864g = textView3;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.kme);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById5;
        this.f207862e = textView4;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.l7h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView5 = (android.widget.TextView) findViewById6;
        this.f207863f = textView5;
        com.p314xaae8f345.mm.ui.fk.a(textView5);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView3);
        hc2.o.a(textView, false);
        hc2.o.b(textView4);
        textView4.getPaint().setFlags(16);
    }

    public final xt2.i5 a(android.content.Context context, cm2.m0 item, float f17, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, float f18) {
        float f19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14981x40ea4ed4 c14981x40ea4ed4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14981x40ea4ed4(context);
        float f27 = f18 * 0.75f;
        xt2.i5 i5Var = new xt2.i5(f18, f27, f27, f27, z17, z18, f27, z19, f17, z27, z28, false, 2048, null);
        c14981x40ea4ed4.b(0, item, i5Var);
        c14981x40ea4ed4.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        if (c14981x40ea4ed4.getMeasuredWidth() <= f17) {
            return i5Var;
        }
        if (z28) {
            item.f124901v.m75945x2fec8307(1);
            return a(context, item, f17, z17, z18, z19, z27, false, f18);
        }
        if (z19) {
            item.f124901v.m75945x2fec8307(1);
            return a(context, item, f17, z17, z18, false, z27, false, f18);
        }
        if (z17) {
            item.f124901v.m75945x2fec8307(1);
            return a(context, item, f17, false, false, false, z27, false, f18);
        }
        float f28 = f207858n;
        if (f18 <= f28) {
            item.f124901v.m75945x2fec8307(1);
            return new xt2.i5(f18, 0.0f, 0.0f, 0.0f, i5Var.f538328e, z18, 0.0f, i5Var.f538331h, f17, false, false, false, 2048, null);
        }
        float f29 = f207856i;
        if (f18 > f29) {
            item.f124901v.m75945x2fec8307(1);
        } else {
            f29 = f207857m;
            if (f18 <= f29) {
                item.f124901v.m75945x2fec8307(1);
                f19 = f28;
                return a(context, item, f17, false, false, false, z27, false, f19);
            }
            item.f124901v.m75945x2fec8307(1);
        }
        f19 = f29;
        return a(context, item, f17, false, false, false, z27, false, f19);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r17, cm2.m0 r18, xt2.i5 r19) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14981x40ea4ed4.b(int, cm2.m0, xt2.i5):void");
    }

    public final android.widget.TextView getSellPrice() {
        return this.sellPrice;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14981x40ea4ed4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.azj, (android.view.ViewGroup) this, false);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        addView(inflate, layoutParams);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f567947l51);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.l7g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.sellPrice = textView;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.dio);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f207861d = textView2;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.qw6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        this.f207864g = textView3;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.kme);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById5;
        this.f207862e = textView4;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.l7h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView5 = (android.widget.TextView) findViewById6;
        this.f207863f = textView5;
        com.p314xaae8f345.mm.ui.fk.a(textView5);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView3);
        hc2.o.a(textView, false);
        hc2.o.b(textView4);
        textView4.getPaint().setFlags(16);
    }
}

package com.tencent.mm.feature.ecs.card.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/feature/ecs/card/view/EcsPriceView;", "Landroid/widget/RelativeLayout;", "Landroid/widget/TextView;", "Ljz5/f0;", "setPriceTypeFaceRegular", "h", "Landroid/widget/TextView;", "getSellPrice", "()Landroid/widget/TextView;", "sellPrice", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "f00/e", "f00/f", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsPriceView extends android.widget.RelativeLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final f00.e f65581i = new f00.e(null);

    /* renamed from: m, reason: collision with root package name */
    public static final float f65582m = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 17.0f);

    /* renamed from: n, reason: collision with root package name */
    public static final float f65583n = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 15.0f);

    /* renamed from: o, reason: collision with root package name */
    public static final float f65584o = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 14.0f);

    /* renamed from: p, reason: collision with root package name */
    public static final float f65585p = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12.0f);

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f65586d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f65587e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f65588f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f65589g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final android.widget.TextView sellPrice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsPriceView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.e4g, (android.view.ViewGroup) this, false);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        addView(inflate, layoutParams);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486414l51);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.l7g);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.sellPrice = textView;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.dio);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f65586d = textView2;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.qw6);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        this.f65589g = textView3;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.kme);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById5;
        this.f65587e = textView4;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.l7h);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView5 = (android.widget.TextView) findViewById6;
        this.f65588f = textView5;
        com.tencent.mm.ui.fk.a(textView5);
        com.tencent.mm.ui.fk.a(textView2);
        com.tencent.mm.ui.fk.a(textView3);
        b(textView, false);
        setPriceTypeFaceRegular(textView4);
        textView4.getPaint().setFlags(16);
    }

    public final f00.f a(android.content.Context context, bw5.u8 item, float f17, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, float f18) {
        float f19;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.feature.ecs.card.view.EcsPriceView ecsPriceView = new com.tencent.mm.feature.ecs.card.view.EcsPriceView(context);
        float f27 = f18 * 0.75f;
        f00.f fVar = new f00.f(f18, f27, f27, f27, z17, z18, f27, z19, f17, z27, z28, false, 2048, null);
        ecsPriceView.c(0, item, fVar);
        ecsPriceView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        if (ecsPriceView.getMeasuredWidth() <= f17) {
            return fVar;
        }
        if (z28) {
            item.i();
            return a(context, item, f17, z17, z18, z19, z27, false, f18);
        }
        if (z19) {
            item.i();
            return a(context, item, f17, z17, z18, false, z27, false, f18);
        }
        if (z17) {
            item.i();
            return a(context, item, f17, false, false, false, z27, false, f18);
        }
        float f28 = f65585p;
        if (f18 <= f28) {
            item.i();
            return new f00.f(f18, 0.0f, 0.0f, 0.0f, z17, z18, 0.0f, z19, f17, false, false, false, 2048, null);
        }
        float f29 = f65583n;
        if (f18 > f29) {
            item.i();
        } else {
            f29 = f65584o;
            if (f18 <= f29) {
                item.i();
                f19 = f28;
                return a(context, item, f17, false, false, false, z27, false, f19);
            }
            item.i();
        }
        f19 = f29;
        return a(context, item, f17, false, false, false, z27, false, f19);
    }

    public final void b(android.widget.TextView textView, boolean z17) {
        kotlin.jvm.internal.o.g(textView, "<this>");
        try {
            textView.setTypeface(android.graphics.Typeface.createFromAsset(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), z17 ? "fonts/WeChatSansSS-Medium.ttf" : "fonts/WeChatSansStd-Medium.ttf"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveShoppingPriceView", "setTypeface() Exception:" + e17.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r10, bw5.u8 r11, f00.f r12) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.ecs.card.view.EcsPriceView.c(int, bw5.u8, f00.f):void");
    }

    public final void d(bw5.u8 shareObject, float f17, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(shareObject, "shareObject");
        float q17 = i65.a.q(getContext());
        float f18 = z17 ? f65585p : f65582m;
        if (z18 && q17 > 1.0f) {
            f18 *= q17;
        }
        float f19 = f18;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        boolean z19 = shareObject.f33785q > 0;
        boolean z27 = shareObject.H;
        java.lang.String g17 = shareObject.g();
        f00.f a17 = a(context, shareObject, f17, true, true, z19, z27, !(g17 == null || g17.length() == 0), f19);
        a17.f258307l = false;
        c(4, shareObject, a17);
    }

    public final android.widget.TextView getSellPrice() {
        return this.sellPrice;
    }

    public final void setPriceTypeFaceRegular(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<this>");
        try {
            textView.setTypeface(android.graphics.Typeface.createFromAsset(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), "fonts/WeChatSansStd-Regular.ttf"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveShoppingPriceView", "setTypeface() Exception:" + e17.getMessage());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsPriceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.e4g, (android.view.ViewGroup) this, false);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        addView(inflate, layoutParams);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486414l51);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.l7g);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.sellPrice = textView;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.dio);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f65586d = textView2;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.qw6);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        this.f65589g = textView3;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.kme);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById5;
        this.f65587e = textView4;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.l7h);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView5 = (android.widget.TextView) findViewById6;
        this.f65588f = textView5;
        com.tencent.mm.ui.fk.a(textView5);
        com.tencent.mm.ui.fk.a(textView2);
        com.tencent.mm.ui.fk.a(textView3);
        b(textView, false);
        setPriceTypeFaceRegular(textView4);
        textView4.getPaint().setFlags(16);
    }
}

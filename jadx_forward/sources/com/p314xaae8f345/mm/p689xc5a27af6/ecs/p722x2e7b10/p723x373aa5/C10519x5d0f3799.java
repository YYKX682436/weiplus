package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/feature/ecs/card/view/EcsPriceView;", "Landroid/widget/RelativeLayout;", "Landroid/widget/TextView;", "Ljz5/f0;", "setPriceTypeFaceRegular", "h", "Landroid/widget/TextView;", "getSellPrice", "()Landroid/widget/TextView;", "sellPrice", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "f00/e", "f00/f", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.card.view.EcsPriceView */
/* loaded from: classes9.dex */
public final class C10519x5d0f3799 extends android.widget.RelativeLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final f00.e f147114i = new f00.e(null);

    /* renamed from: m, reason: collision with root package name */
    public static final float f147115m = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 17.0f);

    /* renamed from: n, reason: collision with root package name */
    public static final float f147116n = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 15.0f);

    /* renamed from: o, reason: collision with root package name */
    public static final float f147117o = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 14.0f);

    /* renamed from: p, reason: collision with root package name */
    public static final float f147118p = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12.0f);

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f147119d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f147120e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f147121f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f147122g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final android.widget.TextView sellPrice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10519x5d0f3799(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e4g, (android.view.ViewGroup) this, false);
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
        this.f147119d = textView2;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.qw6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        this.f147122g = textView3;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.kme);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById5;
        this.f147120e = textView4;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.l7h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView5 = (android.widget.TextView) findViewById6;
        this.f147121f = textView5;
        com.p314xaae8f345.mm.ui.fk.a(textView5);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView3);
        b(textView, false);
        m44175xc1c0b5de(textView4);
        textView4.getPaint().setFlags(16);
    }

    public final f00.f a(android.content.Context context, bw5.u8 item, float f17, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, float f18) {
        float f19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10519x5d0f3799 c10519x5d0f3799 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10519x5d0f3799(context);
        float f27 = f18 * 0.75f;
        f00.f fVar = new f00.f(f18, f27, f27, f27, z17, z18, f27, z19, f17, z27, z28, false, 2048, null);
        c10519x5d0f3799.c(0, item, fVar);
        c10519x5d0f3799.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        if (c10519x5d0f3799.getMeasuredWidth() <= f17) {
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
        float f28 = f147118p;
        if (f18 <= f28) {
            item.i();
            return new f00.f(f18, 0.0f, 0.0f, 0.0f, z17, z18, 0.0f, z19, f17, false, false, false, 2048, null);
        }
        float f29 = f147116n;
        if (f18 > f29) {
            item.i();
        } else {
            f29 = f147117o;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        try {
            textView.setTypeface(android.graphics.Typeface.createFromAsset(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets(), z17 ? "fonts/WeChatSansSS-Medium.ttf" : "fonts/WeChatSansStd-Medium.ttf"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveShoppingPriceView", "setTypeface() Exception:" + e17.getMessage());
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10519x5d0f3799.c(int, bw5.u8, f00.f):void");
    }

    public final void d(bw5.u8 shareObject, float f17, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObject, "shareObject");
        float q17 = i65.a.q(getContext());
        float f18 = z17 ? f147118p : f147115m;
        if (z18 && q17 > 1.0f) {
            f18 *= q17;
        }
        float f19 = f18;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        boolean z19 = shareObject.f115318q > 0;
        boolean z27 = shareObject.H;
        java.lang.String g17 = shareObject.g();
        f00.f a17 = a(context, shareObject, f17, true, true, z19, z27, !(g17 == null || g17.length() == 0), f19);
        a17.f339840l = false;
        c(4, shareObject, a17);
    }

    public final android.widget.TextView getSellPrice() {
        return this.sellPrice;
    }

    /* renamed from: setPriceTypeFaceRegular */
    public final void m44175xc1c0b5de(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        try {
            textView.setTypeface(android.graphics.Typeface.createFromAsset(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets(), "fonts/WeChatSansStd-Regular.ttf"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveShoppingPriceView", "setTypeface() Exception:" + e17.getMessage());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10519x5d0f3799(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e4g, (android.view.ViewGroup) this, false);
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
        this.f147119d = textView2;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.qw6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        this.f147122g = textView3;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.kme);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById5;
        this.f147120e = textView4;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.l7h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView5 = (android.widget.TextView) findViewById6;
        this.f147121f = textView5;
        com.p314xaae8f345.mm.ui.fk.a(textView5);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView3);
        b(textView, false);
        m44175xc1c0b5de(textView4);
        textView4.getPaint().setFlags(16);
    }
}

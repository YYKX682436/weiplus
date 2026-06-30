package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderExtendReadingEditView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView */
/* loaded from: classes5.dex */
public final class C15280xb0aa035b extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f212569d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f212570e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f212571f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f212572g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f212573h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f212574i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f212575m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f212576n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f212577o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f212578p;

    public C15280xb0aa035b(android.content.Context context) {
        super(context);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.agp, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.ecq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f212571f = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.eco);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f212572g = textView;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f212573h = textView2;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ecn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f212578p = (android.widget.LinearLayout) findViewById4;
        d92.f fVar = d92.f.f309003a;
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        textView2.setTextSize(1, fVar.d(context2, 15.0f, false));
        android.content.Context context3 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        textView.setTextSize(1, fVar.d(context3, 16.0f, false));
        dq4.c cVar = dq4.c.f323902a;
        cVar.f(textView2);
        cVar.f(textView);
        cVar.f(findViewById);
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.ljs);
        findViewById5.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c9(findViewById5, this));
        findViewById5.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d9.f213416d);
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ecr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById6;
        this.f212574i = c22621x7603e017;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ecs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f212575m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ecp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f212576n = findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ect);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f212577o = (android.widget.TextView) findViewById9;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e9(this));
        findViewById8.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f9(this));
        c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g9(this));
        b();
        a();
    }

    public final void a() {
        java.lang.String obj = this.f212574i.getText().toString();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj);
        android.widget.TextView textView = this.f212572g;
        if (K0) {
            textView.setOnClickListener(null);
            textView.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560520mq));
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563088wh);
        } else {
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h9(this, obj));
            textView.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563090wj);
        }
    }

    public final void b() {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("");
        android.widget.TextView textView = this.f212577o;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f212574i;
        android.widget.TextView textView2 = this.f212575m;
        if (K0 || !(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(""))) {
            textView2.setVisibility(8);
            if (c22621x7603e017.getVisibility() == 0) {
                textView.setVisibility(0);
                return;
            }
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c22621x7603e017.getText().toString(), "")) {
            textView2.setVisibility(8);
            return;
        }
        if (getVisibility() == 0) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
        }
        textView2.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cu8, ""));
        textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.i9(this, ""));
    }

    public C15280xb0aa035b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.agp, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.ecq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f212571f = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.eco);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f212572g = textView;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f212573h = textView2;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ecn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f212578p = (android.widget.LinearLayout) findViewById4;
        d92.f fVar = d92.f.f309003a;
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        textView2.setTextSize(1, fVar.d(context2, 15.0f, false));
        android.content.Context context3 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        textView.setTextSize(1, fVar.d(context3, 16.0f, false));
        dq4.c cVar = dq4.c.f323902a;
        cVar.f(textView2);
        cVar.f(textView);
        cVar.f(findViewById);
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.ljs);
        findViewById5.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c9(findViewById5, this));
        findViewById5.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d9.f213416d);
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ecr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById6;
        this.f212574i = c22621x7603e017;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ecs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f212575m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ecp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f212576n = findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ect);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f212577o = (android.widget.TextView) findViewById9;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e9(this));
        findViewById8.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f9(this));
        c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g9(this));
        b();
        a();
    }

    public C15280xb0aa035b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.agp, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.ecq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f212571f = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.eco);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f212572g = textView;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f212573h = textView2;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ecn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f212578p = (android.widget.LinearLayout) findViewById4;
        d92.f fVar = d92.f.f309003a;
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        textView2.setTextSize(1, fVar.d(context2, 15.0f, false));
        android.content.Context context3 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        textView.setTextSize(1, fVar.d(context3, 16.0f, false));
        dq4.c cVar = dq4.c.f323902a;
        cVar.f(textView2);
        cVar.f(textView);
        cVar.f(findViewById);
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.ljs);
        findViewById5.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c9(findViewById5, this));
        findViewById5.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.d9.f213416d);
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ecr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById6;
        this.f212574i = c22621x7603e017;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ecs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f212575m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ecp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f212576n = findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ect);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f212577o = (android.widget.TextView) findViewById9;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e9(this));
        findViewById8.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f9(this));
        c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g9(this));
        b();
        a();
    }
}

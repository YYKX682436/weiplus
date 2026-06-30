package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderHighLightTopicEditView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderHighLightTopicEditView */
/* loaded from: classes5.dex */
public final class C15295xb55935d0 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f212659d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f212660e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f212661f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f212662g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f212663h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f212664i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f212665m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f212666n;

    public C15295xb55935d0(android.content.Context context) {
        super(context);
        this.f212666n = "";
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dlp, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.qsb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f212659d = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qse);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f212660e = textView;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qsg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
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
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qsd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById4;
        this.f212661f = c22621x7603e017;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qsc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f212662g = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qsa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f212663h = findViewById6;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.va(this));
        findViewById6.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wa(this));
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xa(this));
        c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ya(this));
    }

    public C15295xb55935d0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f212666n = "";
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dlp, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.qsb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f212659d = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qse);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f212660e = textView;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qsg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
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
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qsd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById4;
        this.f212661f = c22621x7603e017;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qsc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f212662g = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qsa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f212663h = findViewById6;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.va(this));
        findViewById6.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wa(this));
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xa(this));
        c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ya(this));
    }

    public C15295xb55935d0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f212666n = "";
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dlp, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.qsb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f212659d = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qse);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f212660e = textView;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qsg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
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
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qsd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById4;
        this.f212661f = c22621x7603e017;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qsc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f212662g = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qsa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f212663h = findViewById6;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.va(this));
        findViewById6.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wa(this));
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xa(this));
        c22621x7603e017.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ya(this));
    }
}

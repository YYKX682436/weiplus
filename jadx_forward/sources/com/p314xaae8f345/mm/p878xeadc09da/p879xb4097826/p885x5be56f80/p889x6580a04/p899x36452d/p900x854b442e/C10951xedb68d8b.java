package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView;", "Landroid/widget/FrameLayout;", "Lrw0/a;", "callback", "Ljz5/f0;", "setCaptionCallback", "Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/timeline/CaptionTimelineView;", "d", "Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/timeline/CaptionTimelineView;", "getTimelineView", "()Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/timeline/CaptionTimelineView;", "timelineView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vw0/g", "vw0/h", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView */
/* loaded from: classes5.dex */
public final class C10951xedb68d8b extends android.widget.FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f150852s = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c timelineView;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f150854e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f150855f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f150856g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f150857h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10995xef1b87fd f150858i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f150859m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f150860n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f150861o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f150862p;

    /* renamed from: q, reason: collision with root package name */
    public final int f150863q;

    /* renamed from: r, reason: collision with root package name */
    public rw0.a f150864r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10951xedb68d8b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static final boolean a(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b c10951xedb68d8b, fv0.a aVar) {
        c10951xedb68d8b.getClass();
        rv0.a7 a7Var = rv0.b7.f481475d;
        android.view.View findViewWithTag = c10951xedb68d8b.f150862p.findViewWithTag(aVar);
        a7Var.getClass();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.a(findViewWithTag != null ? java.lang.Float.valueOf(findViewWithTag.getAlpha()) : null, 1.0f);
    }

    public final void b(android.view.View view, boolean z17) {
        float f17;
        if (z17) {
            rv0.a7 a7Var = rv0.b7.f481475d;
            f17 = 1.0f;
        } else {
            rv0.a7 a7Var2 = rv0.b7.f481475d;
            f17 = 0.3f;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "setEditItemEnabled", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "setEditItemEnabled", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setEnabled(z17);
    }

    public final void c(float f17) {
        int i17 = (int) (f17 * 100);
        this.f150858i.m47416x3ae760af(i17);
        this.f150857h.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m_a, java.lang.Integer.valueOf(i17)));
    }

    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c getTimelineView() {
        return this.timelineView;
    }

    /* renamed from: setCaptionCallback */
    public final void m47165xf2914389(rw0.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f150864r = callback;
    }

    public /* synthetic */ C10951xedb68d8b(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10951xedb68d8b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f150863q = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 40);
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.doi, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.qbw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.timelineView = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.r9a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f150854e = textView;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.r5a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f150855f = findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.r7f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f150856g = findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.r97);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f150857h = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.r7c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10995xef1b87fd c10995xef1b87fd = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10995xef1b87fd) findViewById6;
        this.f150858i = c10995xef1b87fd;
        c10995xef1b87fd.m47417x7d38f3f4(com.p314xaae8f345.mm.R.C30859x5a72f63.ac8);
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.f568955r95);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f150859m = findViewById7;
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.r7g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f150860n = findViewById8;
        android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.r7h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f150861o = findViewById9;
        android.view.View findViewById10 = findViewById(com.p314xaae8f345.mm.R.id.r5g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById10;
        this.f150862p = viewGroup;
        by0.v vVar = by0.v.f117884a;
        viewGroup.addView(vVar.a(viewGroup, fv0.a.f348469e, com.p314xaae8f345.mm.R.C30867xcad56011.ll8, com.p314xaae8f345.mm.R.C30861xcebc809e.cmv, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new vw0.a(this)));
        android.view.View view = new android.view.View(context);
        view.setTag(vw0.h.f522313d);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams layoutParams = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(-1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.1f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        viewGroup.addView(view);
        viewGroup.addView(vVar.a(viewGroup, fv0.a.f348482u, com.p314xaae8f345.mm.R.C30867xcad56011.f574045hk, com.p314xaae8f345.mm.R.C30861xcebc809e.f562568lr, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new vw0.b(this)));
        viewGroup.addView(vVar.a(viewGroup, fv0.a.f348483v, com.p314xaae8f345.mm.R.C30867xcad56011.f574046iu, com.p314xaae8f345.mm.R.C30861xcebc809e.f562566n3, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new vw0.c(this)));
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 != null) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams3 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams2;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = vVar.b(this) + j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562087ag2);
            viewGroup.setLayoutParams(layoutParams3);
            textView.setOnClickListener(new vw0.d(this));
            findViewById7.setOnClickListener(new vw0.e(this));
            findViewById3.setOnClickListener(new vw0.f(this));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}

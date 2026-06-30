package com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView;", "Landroid/widget/FrameLayout;", "Lrw0/a;", "callback", "Ljz5/f0;", "setCaptionCallback", "Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/timeline/CaptionTimelineView;", "d", "Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/timeline/CaptionTimelineView;", "getTimelineView", "()Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/timeline/CaptionTimelineView;", "timelineView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vw0/g", "vw0/h", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CaptionView extends android.widget.FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f69319s = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView timelineView;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f69321e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f69322f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f69323g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f69324h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.mj_publisher.finder.widgets.MCProgressImageView f69325i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f69326m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f69327n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f69328o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f69329p;

    /* renamed from: q, reason: collision with root package name */
    public final int f69330q;

    /* renamed from: r, reason: collision with root package name */
    public rw0.a f69331r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CaptionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final boolean a(com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView captionView, fv0.a aVar) {
        captionView.getClass();
        rv0.a7 a7Var = rv0.b7.f399942d;
        android.view.View findViewWithTag = captionView.f69329p.findViewWithTag(aVar);
        a7Var.getClass();
        return kotlin.jvm.internal.o.a(findViewWithTag != null ? java.lang.Float.valueOf(findViewWithTag.getAlpha()) : null, 1.0f);
    }

    public final void b(android.view.View view, boolean z17) {
        float f17;
        if (z17) {
            rv0.a7 a7Var = rv0.b7.f399942d;
            f17 = 1.0f;
        } else {
            rv0.a7 a7Var2 = rv0.b7.f399942d;
            f17 = 0.3f;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "setEditItemEnabled", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "setEditItemEnabled", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setEnabled(z17);
    }

    public final void c(float f17) {
        int i17 = (int) (f17 * 100);
        this.f69325i.setProgress(i17);
        this.f69324h.setText(getContext().getString(com.tencent.mm.R.string.m_a, java.lang.Integer.valueOf(i17)));
    }

    public final com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView getTimelineView() {
        return this.timelineView;
    }

    public final void setCaptionCallback(rw0.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f69331r = callback;
    }

    public /* synthetic */ CaptionView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f69330q = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 40);
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.doi, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qbw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.timelineView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.timeline.CaptionTimelineView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.r9a);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f69321e = textView;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.r5a);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f69322f = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.r7f);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f69323g = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.r97);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f69324h = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.r7c);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.mj_publisher.finder.widgets.MCProgressImageView mCProgressImageView = (com.tencent.mm.mj_publisher.finder.widgets.MCProgressImageView) findViewById6;
        this.f69325i = mCProgressImageView;
        mCProgressImageView.setProgressColor(com.tencent.mm.R.color.ac8);
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.f487422r95);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f69326m = findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.r7g);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f69327n = findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.r7h);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f69328o = findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.r5g);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById10;
        this.f69329p = viewGroup;
        by0.v vVar = by0.v.f36351a;
        viewGroup.addView(vVar.a(viewGroup, fv0.a.f266936e, com.tencent.mm.R.string.ll8, com.tencent.mm.R.drawable.cmv, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new vw0.a(this)));
        android.view.View view = new android.view.View(context);
        view.setTag(vw0.h.f440780d);
        androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = new androidx.appcompat.widget.LinearLayoutCompat.LayoutParams(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479642bh), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs));
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479671c8);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(-1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.1f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        viewGroup.addView(view);
        viewGroup.addView(vVar.a(viewGroup, fv0.a.f266949u, com.tencent.mm.R.string.f492512hk, com.tencent.mm.R.drawable.f481035lr, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new vw0.b(this)));
        viewGroup.addView(vVar.a(viewGroup, fv0.a.f266950v, com.tencent.mm.R.string.f492513iu, com.tencent.mm.R.drawable.f481033n3, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new vw0.c(this)));
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 != null) {
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams2;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = vVar.b(this) + j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f480554ag2);
            viewGroup.setLayoutParams(layoutParams3);
            textView.setOnClickListener(new vw0.d(this));
            findViewById7.setOnClickListener(new vw0.e(this));
            findViewById3.setOnClickListener(new vw0.f(this));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}

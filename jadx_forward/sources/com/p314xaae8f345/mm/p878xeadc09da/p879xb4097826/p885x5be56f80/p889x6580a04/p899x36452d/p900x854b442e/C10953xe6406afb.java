package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetTitleView;", "Landroid/widget/FrameLayout;", "Lrw0/e;", "callback", "Ljz5/f0;", "setTitleClickCallback", "", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "setTitle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetTitleView */
/* loaded from: classes5.dex */
public final class C10953xe6406afb extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public rw0.e f150870d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f150871e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f150872f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10953xe6406afb(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setTitle */
    public final void m47173x53bfe316(java.lang.String title) {
        float f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f150871e.setText(title);
        this.f150872f.setVisibility(title.length() > 0 ? 0 : 8);
        boolean z17 = title.length() > 0;
        if (z17) {
            rv0.a7 a7Var = rv0.b7.f481475d;
            f17 = 1.0f;
        } else {
            rv0.a7 a7Var2 = rv0.b7.f481475d;
            f17 = 0.3f;
        }
        fv0.a aVar = fv0.a.f348484w;
        android.view.View findViewWithTag = findViewWithTag(aVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewWithTag, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetTitleView", "setTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewWithTag.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(findViewWithTag, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetTitleView", "setTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewWithTag(aVar).setEnabled(z17);
        fv0.a aVar2 = fv0.a.f348483v;
        android.view.View findViewWithTag2 = findViewWithTag(aVar2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewWithTag2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetTitleView", "setTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewWithTag2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(findViewWithTag2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetTitleView", "setTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewWithTag(aVar2).setEnabled(z17);
    }

    /* renamed from: setTitleClickCallback */
    public final void m47174x3519c277(rw0.e callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f150870d = callback;
    }

    public /* synthetic */ C10953xe6406afb(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10953xe6406afb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dgd, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.qb7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f150871e = textView;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.q7u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f150872f = imageView;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f568874ps);
        by0.v vVar = by0.v.f117884a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        viewGroup.addView(vVar.a(viewGroup, fv0.a.f348483v, com.p314xaae8f345.mm.R.C30867xcad56011.f574046iu, com.p314xaae8f345.mm.R.C30861xcebc809e.f562566n3, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new vw0.t(this)));
        viewGroup.addView(vVar.a(viewGroup, fv0.a.f348484w, com.p314xaae8f345.mm.R.C30867xcad56011.f574047l7, com.p314xaae8f345.mm.R.C30861xcebc809e.a8e, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), new vw0.u(this)));
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = vVar.b(this) + j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562087ag2);
            viewGroup.setLayoutParams(layoutParams2);
            textView.setOnClickListener(new vw0.v(this));
            imageView.setOnClickListener(new vw0.w(this));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}

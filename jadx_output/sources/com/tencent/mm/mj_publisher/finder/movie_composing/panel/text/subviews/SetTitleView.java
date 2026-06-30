package com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetTitleView;", "Landroid/widget/FrameLayout;", "Lrw0/e;", "callback", "Ljz5/f0;", "setTitleClickCallback", "", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "setTitle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SetTitleView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public rw0.e f69337d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f69338e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f69339f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SetTitleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void setTitle(java.lang.String title) {
        float f17;
        kotlin.jvm.internal.o.g(title, "title");
        this.f69338e.setText(title);
        this.f69339f.setVisibility(title.length() > 0 ? 0 : 8);
        boolean z17 = title.length() > 0;
        if (z17) {
            rv0.a7 a7Var = rv0.b7.f399942d;
            f17 = 1.0f;
        } else {
            rv0.a7 a7Var2 = rv0.b7.f399942d;
            f17 = 0.3f;
        }
        fv0.a aVar = fv0.a.f266951w;
        android.view.View findViewWithTag = findViewWithTag(aVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewWithTag, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetTitleView", "setTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewWithTag.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(findViewWithTag, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetTitleView", "setTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewWithTag(aVar).setEnabled(z17);
        fv0.a aVar2 = fv0.a.f266950v;
        android.view.View findViewWithTag2 = findViewWithTag(aVar2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewWithTag2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetTitleView", "setTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewWithTag2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(findViewWithTag2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetTitleView", "setTitle", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewWithTag(aVar2).setEnabled(z17);
    }

    public final void setTitleClickCallback(rw0.e callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f69337d = callback;
    }

    public /* synthetic */ SetTitleView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTitleView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dgd, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qb7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f69338e = textView;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.q7u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f69339f = imageView;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f487341ps);
        by0.v vVar = by0.v.f36351a;
        kotlin.jvm.internal.o.d(viewGroup);
        viewGroup.addView(vVar.a(viewGroup, fv0.a.f266950v, com.tencent.mm.R.string.f492513iu, com.tencent.mm.R.drawable.f481033n3, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new vw0.t(this)));
        viewGroup.addView(vVar.a(viewGroup, fv0.a.f266951w, com.tencent.mm.R.string.f492514l7, com.tencent.mm.R.drawable.a8e, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), new vw0.u(this)));
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = vVar.b(this) + j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.f480554ag2);
            viewGroup.setLayoutParams(layoutParams2);
            textView.setOnClickListener(new vw0.v(this));
            imageView.setOnClickListener(new vw0.w(this));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}

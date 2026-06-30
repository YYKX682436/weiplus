package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f109816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f109817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f109818f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.view.View view, float f17, android.view.View view2) {
        super(0);
        this.f109816d = view;
        this.f109817e = f17;
        this.f109818f = view2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f109816d;
        view.setTranslationY(this.f109817e);
        this.f109818f.setTranslationY(0.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI$OnPageChangeCallback$hideBottomEdu$1$1$onComplete$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI$OnPageChangeCallback$hideBottomEdu$1$1$onComplete$1", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return view;
    }
}

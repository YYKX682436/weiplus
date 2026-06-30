package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class z2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f111224d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(0);
        this.f111224d = a7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        yw2.a0 a0Var = this.f111224d.f106216o;
        if (a0Var != null) {
            view = a0Var.f466624w;
            if (view == null) {
                kotlin.jvm.internal.o.o("headerErrTip");
                throw null;
            }
        } else {
            view = null;
        }
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentErrorListener$1$callback$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentErrorListener$1$callback$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}

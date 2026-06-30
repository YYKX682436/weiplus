package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class y2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f111140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderCommentErrorEvent f111141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.tencent.mm.plugin.finder.feed.a7 a7Var, com.tencent.mm.autogen.events.FinderCommentErrorEvent finderCommentErrorEvent) {
        super(0);
        this.f111140d = a7Var;
        this.f111141e = finderCommentErrorEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        android.widget.TextView textView;
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f111140d;
        yw2.a0 a0Var = a7Var.f106216o;
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
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentErrorListener$1$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentErrorListener$1$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yw2.a0 a0Var2 = a7Var.f106216o;
        if (a0Var2 != null) {
            textView = a0Var2.f466625x;
            if (textView == null) {
                kotlin.jvm.internal.o.o("headerErrTv");
                throw null;
            }
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(this.f111141e.f54264g.f8069b);
        }
        yw2.a0 a0Var3 = a7Var.f106216o;
        if (a0Var3 != null) {
            android.view.View view2 = a0Var3.f466624w;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("headerErrTip");
                throw null;
            }
            view2.setOnClickListener(new com.tencent.mm.plugin.finder.feed.x2(a7Var));
        }
        return jz5.f0.f302826a;
    }
}

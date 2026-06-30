package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f107167d;

    public k4(android.view.View view) {
        this.f107167d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f107167d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onClickCommentImage$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onClickCommentImage$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}

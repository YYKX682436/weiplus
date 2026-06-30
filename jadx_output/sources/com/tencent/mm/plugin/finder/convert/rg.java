package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class rg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104473d;

    public rg(android.view.View view) {
        this.f104473d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f104473d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert$checkShowShareToMoreTips$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullVideoConvert$checkShowShareToMoreTips$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

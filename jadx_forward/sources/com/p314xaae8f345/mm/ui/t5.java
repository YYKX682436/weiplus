package com.p314xaae8f345.mm.ui;

/* loaded from: classes3.dex */
public class t5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f291413e;

    public t5(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb, android.view.View view) {
        this.f291413e = c21357x5e7365bb;
        this.f291412d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f291412d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/FindMoreFriendsUI$39", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/FindMoreFriendsUI$39", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f291412d.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this.f291413e.mo7438x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559317bd));
    }
}

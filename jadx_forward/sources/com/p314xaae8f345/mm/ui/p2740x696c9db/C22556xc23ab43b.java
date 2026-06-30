package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.ShowVideoUI$$m */
/* loaded from: classes3.dex */
public final /* synthetic */ class C22556xc23ab43b implements w82.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291792a;

    public final void a(boolean z17) {
        android.view.View view = this.f291792a;
        int i17 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72.M;
        int i18 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowVideoUI", "lambda$initJumpChat$8", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/tools/ShowVideoUI", "lambda$initJumpChat$8", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

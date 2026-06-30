package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class dc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 f291893e;

    public dc(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72, android.view.View view) {
        this.f291893e = activityC22543x95896a72;
        this.f291892d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = this.f291893e;
        activityC22543x95896a72.F = true;
        this.f291892d.setBackgroundColor(activityC22543x95896a72.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        android.view.View view = this.f291892d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowVideoUI$18", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/tools/ShowVideoUI$18", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        activityC22543x95896a72.U6(activityC22543x95896a72.getWindow(), true, false);
        new n3.m3(activityC22543x95896a72.getWindow(), activityC22543x95896a72.getWindow().getDecorView()).f415907a.g(2);
    }
}

package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class gc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 f291980f;

    public gc(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72, android.view.View view, android.view.View view2) {
        this.f291980f = activityC22543x95896a72;
        this.f291978d = view;
        this.f291979e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = this.f291980f;
        activityC22543x95896a72.F = false;
        this.f291978d.setBackgroundColor(activityC22543x95896a72.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        android.view.View view = this.f291978d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowVideoUI$20", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/tools/ShowVideoUI$20", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f291979e.setBackgroundColor(activityC22543x95896a72.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
        activityC22543x95896a72.U6(activityC22543x95896a72.getWindow(), true, true);
        new n3.m3(activityC22543x95896a72.getWindow(), activityC22543x95896a72.getWindow().getDecorView()).a(2);
    }
}

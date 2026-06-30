package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class sa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 f292272f;

    public sa(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752, android.view.View view, android.view.View view2) {
        this.f292272f = activityC22534xec824752;
        this.f292270d = view;
        this.f292271e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752 = this.f292272f;
        activityC22534xec824752.f291733p = true;
        this.f292270d.setBackgroundColor(activityC22534xec824752.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        android.view.View view = this.f292270d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowImageUI$15", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/tools/ShowImageUI$15", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        activityC22534xec824752.f291735r.setAlpha(1.0f);
        this.f292271e.setBackgroundColor(activityC22534xec824752.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
        activityC22534xec824752.U6(activityC22534xec824752.getWindow(), true, false);
        new n3.m3(activityC22534xec824752.getWindow(), activityC22534xec824752.getWindow().getDecorView()).f415907a.g(2);
    }
}

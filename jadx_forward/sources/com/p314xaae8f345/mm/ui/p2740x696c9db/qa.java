package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class qa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 f292194f;

    public qa(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752, android.view.View view, android.view.View view2) {
        this.f292194f = activityC22534xec824752;
        this.f292192d = view;
        this.f292193e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752 = this.f292194f;
        activityC22534xec824752.f291733p = false;
        this.f292192d.setBackgroundColor(activityC22534xec824752.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        android.view.View view = this.f292192d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowImageUI$13", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/tools/ShowImageUI$13", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        activityC22534xec824752.f291735r.setAlpha(0.0f);
        this.f292193e.setBackgroundColor(activityC22534xec824752.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
        activityC22534xec824752.U6(activityC22534xec824752.getWindow(), true, true);
        new n3.m3(activityC22534xec824752.getWindow(), activityC22534xec824752.getWindow().getDecorView()).a(2);
    }
}

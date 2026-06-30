package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06;

/* loaded from: classes11.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b21.r f232466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce f232467e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce, b21.r rVar, int i17) {
        this.f232467e = activityC16662x5873ebce;
        this.f232466d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce.H;
        b21.r rVar = this.f232466d;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce = this.f232467e;
        activityC16662x5873ebce.U6(rVar, false);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_not_add_floatball_exit", true);
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16662x5873ebce.mo55332x76847179();
        bw5.ar0 ar0Var = bw5.ar0.TingScene_Shake;
        ((rk4.k8) aj6).z(mo55332x76847179, false, null, null, null, bundle, ar0Var, null);
        if (activityC16662x5873ebce.f232441n != null) {
            qk.e9 e9Var = (qk.e9) i95.n0.c(qk.e9.class);
            bw5.lp0 lp0Var = activityC16662x5873ebce.f232441n;
            rk4.p6 p6Var = (rk4.p6) e9Var;
            p6Var.getClass();
            ar0Var.toString();
            if (lp0Var != null) {
                p6Var.Zi(new rk4.l6(lp0Var, ar0Var));
            }
        }
        activityC16662x5873ebce.f232446s = true;
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

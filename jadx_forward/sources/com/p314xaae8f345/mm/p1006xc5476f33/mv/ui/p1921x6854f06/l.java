package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06;

/* loaded from: classes11.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce f232485d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce) {
        this.f232485d = activityC16662x5873ebce;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce = this.f232485d;
        activityC16662x5873ebce.D = true;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.d0.f232473a;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.d0.f232474b.f141854q = 0L;
        d0Var.a(252);
        if (activityC16662x5873ebce.f232440m != null) {
            if (!((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).oj(activityC16662x5873ebce.f232440m.f98879e)) {
                activityC16662x5873ebce.U6(activityC16662x5873ebce.f232440m, false);
            }
        }
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16662x5873ebce.mo55332x76847179();
        bw5.ar0 ar0Var = bw5.ar0.TingScene_Shake;
        ((rk4.k8) aj6).z(mo55332x76847179, false, null, null, null, null, ar0Var, null);
        if (activityC16662x5873ebce.f232441n != null) {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ri(activityC16662x5873ebce.f232441n, ar0Var);
        }
        activityC16662x5873ebce.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

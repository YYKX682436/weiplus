package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes.dex */
public class tm extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea f243116d;

    public tm(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea) {
        this.f243116d = activityC17463xb337a9ea;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSwitchAccountUI", "up animation end");
        com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea = this.f243116d;
        android.content.Intent b17 = y7Var.b(activityC17463xb337a9ea);
        b17.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea2 = this.f243116d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC17463xb337a9ea2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17463xb337a9ea2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC17463xb337a9ea2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17463xb337a9ea.finish();
        db5.f.k(activityC17463xb337a9ea);
    }
}

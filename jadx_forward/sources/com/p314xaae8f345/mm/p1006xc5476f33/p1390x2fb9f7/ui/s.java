package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui;

/* loaded from: classes.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptHitDebugUI f181382d;

    public s(com.tencent.mm.plugin.expt.ui.ExptHitDebugUI exptHitDebugUI) {
        this.f181382d = exptHitDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/ExptHitDebugUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        h62.d.vj().Gj(1);
        h62.d.vj().Hj(3);
        com.tencent.mm.plugin.expt.ui.ExptHitDebugUI exptHitDebugUI = this.f181382d;
        dp.a.m125854x26a183b(exptHitDebugUI.mo55332x76847179(), "start req expt", 0).show();
        int i17 = com.tencent.mm.plugin.expt.ui.ExptHitDebugUI.q;
        exptHitDebugUI.V6(0);
        h62.d.vj().getClass();
        j62.e g17 = j62.e.g();
        g17.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("expt_debug_hit_exptid", 0);
        g17.f379433c = 0;
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptHitDebugUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

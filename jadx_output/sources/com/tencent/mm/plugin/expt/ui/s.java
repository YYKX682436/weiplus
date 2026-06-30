package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptHitDebugUI f99849d;

    public s(com.tencent.mm.plugin.expt.ui.ExptHitDebugUI exptHitDebugUI) {
        this.f99849d = exptHitDebugUI;
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
        com.tencent.mm.plugin.expt.ui.ExptHitDebugUI exptHitDebugUI = this.f99849d;
        dp.a.makeText(exptHitDebugUI.getContext(), "start req expt", 0).show();
        int i17 = com.tencent.mm.plugin.expt.ui.ExptHitDebugUI.q;
        exptHitDebugUI.V6(0);
        h62.d.vj().getClass();
        j62.e g17 = j62.e.g();
        g17.getClass();
        com.tencent.mm.sdk.platformtools.o4.L().putInt("expt_debug_hit_exptid", 0);
        g17.f297900c = 0;
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptHitDebugUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

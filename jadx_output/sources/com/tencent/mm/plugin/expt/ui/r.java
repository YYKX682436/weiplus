package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptHitDebugUI f99848d;

    public r(com.tencent.mm.plugin.expt.ui.ExptHitDebugUI exptHitDebugUI) {
        this.f99848d = exptHitDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/ExptHitDebugUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.expt.ui.ExptHitDebugUI exptHitDebugUI = this.f99848d;
        exptHitDebugUI.U6(com.tencent.mm.sdk.platformtools.t8.P(exptHitDebugUI.d.getText().toString().trim(), 0));
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptHitDebugUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

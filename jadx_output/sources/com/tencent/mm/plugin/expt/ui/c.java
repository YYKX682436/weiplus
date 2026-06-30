package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.ExptAppDebugUI f99827d;

    public c(com.tencent.mm.plugin.expt.ui.ExptAppDebugUI exptAppDebugUI) {
        this.f99827d = exptAppDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.expt.ui.ExptAppDebugUI exptAppDebugUI = this.f99827d;
        com.tencent.mm.plugin.expt.ui.ExptAppDebugUI.U6(exptAppDebugUI, com.tencent.mm.sdk.platformtools.t8.P(exptAppDebugUI.d.getText().toString().trim(), 0));
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/ExptAppDebugUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

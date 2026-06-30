package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.KvInfoUI f99833d;

    public e0(com.tencent.mm.plugin.expt.ui.KvInfoUI kvInfoUI) {
        this.f99833d = kvInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/KvInfoUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.expt.ui.KvInfoUI kvInfoUI = this.f99833d;
        kvInfoUI.U6(kvInfoUI.d.getText().toString().trim());
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/KvInfoUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

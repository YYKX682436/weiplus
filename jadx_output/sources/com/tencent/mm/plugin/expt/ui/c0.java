package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes.dex */
public class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.KvInfoUI f99828d;

    public c0(com.tencent.mm.plugin.expt.ui.KvInfoUI kvInfoUI) {
        this.f99828d = kvInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/KvInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.HashMap hashMap = g62.b.wi().f269076f;
        if (hashMap != null && hashMap.size() > 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(hashMap.keySet());
            com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(this.f99828d.getContext(), arrayList2);
            c0Var.i(0);
            c0Var.f212259t = new com.tencent.mm.plugin.expt.ui.b0(this, c0Var, arrayList2);
            c0Var.l();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/KvInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

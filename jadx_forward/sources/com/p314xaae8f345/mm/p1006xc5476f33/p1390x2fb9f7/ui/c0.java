package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui;

/* loaded from: classes.dex */
public class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.KvInfoUI f181361d;

    public c0(com.tencent.mm.plugin.expt.ui.KvInfoUI kvInfoUI) {
        this.f181361d = kvInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/ui/KvInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.HashMap hashMap = g62.b.wi().f350609f;
        if (hashMap != null && hashMap.size() > 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(hashMap.keySet());
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(this.f181361d.mo55332x76847179(), arrayList2);
            c0Var.i(0);
            c0Var.f293792t = new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui.b0(this, c0Var, arrayList2);
            c0Var.l();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/expt/ui/KvInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

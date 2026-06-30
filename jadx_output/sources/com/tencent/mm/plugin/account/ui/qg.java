package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class qg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f74148d;

    public qg(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI) {
        this.f74148d = regSetInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegSetInfoUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.account.ui.RegSetInfoUI.V;
        com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI = this.f74148d;
        regSetInfoUI.getClass();
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ui(regSetInfoUI);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegSetInfoUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes3.dex */
public class d implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAEntranceUI f72597a;

    public d(com.tencent.mm.plugin.aa.ui.AAEntranceUI aAEntranceUI) {
        this.f72597a = aAEntranceUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        android.content.Intent intent = new android.content.Intent(this.f72597a.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.aa.ui.AAQueryListUI.class);
        com.tencent.mm.plugin.aa.ui.AAEntranceUI aAEntranceUI = this.f72597a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(aAEntranceUI, arrayList.toArray(), "com/tencent/mm/plugin/aa/ui/AAEntranceUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        aAEntranceUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(aAEntranceUI, "com/tencent/mm/plugin/aa/ui/AAEntranceUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}

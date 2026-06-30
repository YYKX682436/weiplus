package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class ei implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.SimpleLoginUI f73829d;

    public ei(com.tencent.mm.plugin.account.ui.SimpleLoginUI simpleLoginUI) {
        this.f73829d = simpleLoginUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/SimpleLoginUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.ui.SimpleLoginUI simpleLoginUI = this.f73829d;
        if (simpleLoginUI.f73671r.f73194x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/SimpleLoginUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            simpleLoginUI.Z6();
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/SimpleLoginUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}

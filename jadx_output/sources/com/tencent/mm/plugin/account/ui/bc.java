package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class bc implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileInputUI f73748d;

    public bc(com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI) {
        this.f73748d = mobileInputUI;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MobileInputUI$8", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (66 != i17 || keyEvent.getAction() != 0) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/account/ui/MobileInputUI$8", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        boolean U6 = this.f73748d.U6();
        yj0.a.i(U6, this, "com/tencent/mm/plugin/account/ui/MobileInputUI$8", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return U6;
    }
}

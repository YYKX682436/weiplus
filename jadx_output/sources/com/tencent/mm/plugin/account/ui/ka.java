package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ka implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.la f73982d;

    public ka(com.tencent.mm.plugin.account.ui.la laVar) {
        this.f73982d = laVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MobileInputLoginLogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean c17 = fp.h.c(31);
        com.tencent.mm.plugin.account.ui.la laVar = this.f73982d;
        if (c17) {
            android.view.View decorView = laVar.f74008d.getWindow().getDecorView();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.b1.a(decorView).f(8)) {
                laVar.f74008d.hideVKB();
                laVar.f74010f = true;
                yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        laVar.c();
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

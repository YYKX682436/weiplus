package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class ka implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.la f155515d;

    public ka(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.la laVar) {
        this.f155515d = laVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MobileInputLoginLogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean c17 = fp.h.c(31);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.la laVar = this.f155515d;
        if (c17) {
            android.view.View decorView = laVar.f155541d.getWindow().getDecorView();
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.b1.a(decorView).f(8)) {
                laVar.f155541d.mo48674x36654fab();
                laVar.f155543f = true;
                yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        laVar.c();
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

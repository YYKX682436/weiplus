package com.tencent.mm.plugin.card.ui;

/* loaded from: classes5.dex */
public class v3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.x3 f95232d;

    public v3(com.tencent.mm.plugin.card.ui.x3 x3Var) {
        this.f95232d = x3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardPopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.x3 x3Var = this.f95232d;
        db5.d5 d5Var = x3Var.f95442f;
        if (d5Var != null && d5Var.isShowing()) {
            x3Var.f95442f.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardPopupWindow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

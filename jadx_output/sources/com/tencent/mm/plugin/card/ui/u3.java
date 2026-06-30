package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.x3 f95178d;

    public u3(com.tencent.mm.plugin.card.ui.x3 x3Var) {
        this.f95178d = x3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.kzh || view.getId() == com.tencent.mm.R.id.kzd) {
            com.tencent.mm.plugin.card.ui.x3 x3Var = this.f95178d;
            db5.d5 d5Var = x3Var.f95442f;
            if (d5Var != null && d5Var.isShowing()) {
                x3Var.f95442f.dismiss();
            }
            if (!x3Var.f95453q.X()) {
                float f17 = x3Var.f95451o;
                android.view.WindowManager.LayoutParams attributes = x3Var.f95437a.getWindow().getAttributes();
                attributes.screenBrightness = f17;
                x3Var.f95437a.getWindow().setAttributes(attributes);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

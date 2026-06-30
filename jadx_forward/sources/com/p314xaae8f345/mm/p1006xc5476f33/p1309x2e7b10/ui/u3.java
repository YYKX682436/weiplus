package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.x3 f176711d;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.x3 x3Var) {
        this.f176711d = x3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.kzh || view.getId() == com.p314xaae8f345.mm.R.id.kzd) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.x3 x3Var = this.f176711d;
            db5.d5 d5Var = x3Var.f176975f;
            if (d5Var != null && d5Var.isShowing()) {
                x3Var.f176975f.dismiss();
            }
            if (!x3Var.f176986q.X()) {
                float f17 = x3Var.f176984o;
                android.view.WindowManager.LayoutParams attributes = x3Var.f176970a.getWindow().getAttributes();
                attributes.screenBrightness = f17;
                x3Var.f176970a.getWindow().setAttributes(attributes);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

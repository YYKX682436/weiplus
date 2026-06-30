package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes14.dex */
public class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f2 f224283d;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f2 f2Var) {
        this.f224283d = f2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e2 e2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e2) view.getTag();
        if (e2Var.f224325c) {
            e2Var.f224325c = false;
        } else {
            e2Var.f224325c = true;
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f2 f2Var = this.f224283d;
        f2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e2 e2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e2) textView.getTag();
        textView.setTextSize(0, f2Var.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561949xb) * i65.a.q(f2Var.getContext()));
        boolean z17 = e2Var2.f224325c;
        android.content.Context context = f2Var.f224342h;
        if (z17) {
            textView.setBackgroundResource(f2Var.K);
            textView.setTextColor(context.getResources().getColor(f2Var.L));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            textView.setBackgroundResource(f2Var.I);
            textView.setTextColor(context.getResources().getColor(f2Var.f224337J));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

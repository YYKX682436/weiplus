package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes3.dex */
public class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f260348d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3, android.widget.CheckBox checkBox) {
        this.f260348d = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f260348d.setChecked(!r7.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$29", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

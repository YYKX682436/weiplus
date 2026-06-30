package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckedTextView f260310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckedTextView f260311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 f260312f;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3, android.widget.CheckedTextView checkedTextView, android.widget.CheckedTextView checkedTextView2) {
        this.f260312f = activityC19036x32c728a3;
        this.f260310d = checkedTextView;
        this.f260311e = checkedTextView2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f260310d.setChecked(true);
        this.f260311e.setChecked(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3 = this.f260312f;
        activityC19036x32c728a3.R = false;
        activityC19036x32c728a3.t7();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

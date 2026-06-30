package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes3.dex */
public class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f259832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.du4 f259833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f259834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b f259835g;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b, org.json.JSONObject jSONObject, r45.du4 du4Var, android.view.ViewGroup viewGroup) {
        this.f259835g = activityC19013x23c3e97b;
        this.f259832d = jSONObject;
        this.f259833e = du4Var;
        this.f259834f = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtDetailUI", "go to lqt plan home");
        org.json.JSONObject jSONObject = this.f259832d;
        android.view.ViewGroup viewGroup = this.f259834f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b = this.f259835g;
        r45.du4 du4Var = this.f259833e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b.U6(activityC19013x23c3e97b, jSONObject, du4Var, viewGroup);
        android.content.Intent intent = new android.content.Intent(activityC19013x23c3e97b.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19015x36b35eb1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b2 = this.f259835g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC19013x23c3e97b2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC19013x23c3e97b2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC19013x23c3e97b2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16807, 2, 1, "", "", java.lang.Integer.valueOf(du4Var.f454284g));
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

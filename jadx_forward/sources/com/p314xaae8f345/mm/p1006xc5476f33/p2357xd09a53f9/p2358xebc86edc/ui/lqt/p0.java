package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes3.dex */
public class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f259844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.du4 f259845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f259846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b f259847g;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b, org.json.JSONObject jSONObject, r45.du4 du4Var, android.view.ViewGroup viewGroup) {
        this.f259847g = activityC19013x23c3e97b;
        this.f259844d = jSONObject;
        this.f259845e = du4Var;
        this.f259846f = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        org.json.JSONObject jSONObject = this.f259844d;
        android.view.ViewGroup viewGroup = this.f259846f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b = this.f259847g;
        r45.du4 du4Var = this.f259845e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b.U6(activityC19013x23c3e97b, jSONObject, du4Var, viewGroup);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(du4Var.f454286i, du4Var.f454283f, 0, 1061);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16807, 2, 2, du4Var.f454283f, du4Var.f454286i);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

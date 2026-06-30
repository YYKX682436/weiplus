package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr4.b1 f236742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.q f236743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.r f236744f;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.r rVar, vr4.b1 b1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.q qVar) {
        this.f236744f = rVar;
        this.f236742d = b1Var;
        this.f236743e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/PhoneRechargeAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.r rVar = this.f236744f;
        if (rVar.f236753e != null) {
            java.util.List list = rVar.f236754f;
            vr4.b1 b1Var = this.f236742d;
            if (!((java.util.ArrayList) list).contains(b1Var.f521237u)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeAdapter", "mark recommendid: %s", b1Var.f521237u);
                java.lang.String str = b1Var.f521237u;
                if (str != null) {
                    ((java.util.ArrayList) rVar.f236754f).add(str);
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PHONE_RECHARGE_RECOMMENDED_LIST_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(rVar.f236754f, ","));
                    this.f236743e.f236750d.setVisibility(8);
                }
            }
            rVar.f236753e.a(b1Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

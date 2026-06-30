package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes8.dex */
public class t implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.y55 f230017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.u f230018b;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.u uVar, r45.y55 y55Var) {
        this.f230018b = uVar;
        this.f230017a = y55Var;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public void mo2289xd6191dc1(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        r45.y55 y55Var = this.f230017a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallFunctionSettingsUI", "click switch: %s, id: %s", valueOf, y55Var.f472335d);
        if (z17) {
            y55Var.f472336e = 0;
        } else {
            y55Var.f472336e = 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.u uVar = this.f230018b;
        if (z17) {
            uVar.f230032f.announceForAccessibility(uVar.f230034h.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gar));
        } else {
            uVar.f230032f.announceForAccessibility(uVar.f230034h.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gaw));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(y55Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16472xf5823d43 activityC16472xf5823d43 = uVar.f230034h;
        activityC16472xf5823d43.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallFunctionSettingsUI", "do batch function operate");
        ef3.a aVar = new ef3.a(linkedList, activityC16472xf5823d43.f229768i, 0);
        aVar.l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.q(activityC16472xf5823d43, aVar));
    }
}

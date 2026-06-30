package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class r2 extends lu1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13055xa00cb92b f176680a;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13055xa00cb92b activityC13055xa00cb92b) {
        this.f176680a = activityC13055xa00cb92b;
    }

    @Override // lu1.p, lu1.q
    public void a() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13055xa00cb92b.f176404w;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13055xa00cb92b activityC13055xa00cb92b = this.f176680a;
        activityC13055xa00cb92b.f176170m = true;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i18 = 0; i18 < activityC13055xa00cb92b.f176165e.getCount(); i18++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) activityC13055xa00cb92b.f176172o.mo54455xfb80e389(i18);
            if (c13038x357affe != null) {
                linkedList.add(c13038x357affe.f67736x95970a65);
            }
        }
        activityC13055xa00cb92b.j7(true);
        gm0.j1.n().f354821b.g(new xt1.z(linkedList));
    }
}

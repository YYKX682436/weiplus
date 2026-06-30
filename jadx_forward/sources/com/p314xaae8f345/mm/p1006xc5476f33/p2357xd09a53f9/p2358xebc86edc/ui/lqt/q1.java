package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class q1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.t1 f259865d;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.t1 t1Var) {
        this.f259865d = t1Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.t1 t1Var = this.f259865d;
        java.util.LinkedList linkedList = t1Var.f259904d.f259485f.U;
        if (linkedList != null && linkedList.size() > 0) {
            java.util.Iterator it = t1Var.f259904d.f259485f.U.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                r45.du4 du4Var = (r45.du4) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du4Var.f454281d)) {
                    g4Var.f(i17, du4Var.f454281d);
                }
                i17++;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19013x23c3e97b activityC19013x23c3e97b = t1Var.f259904d;
        if (activityC19013x23c3e97b.f259485f.B) {
            return;
        }
        g4Var.d(-1, activityC19013x23c3e97b.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac), t1Var.f259904d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kox));
    }
}

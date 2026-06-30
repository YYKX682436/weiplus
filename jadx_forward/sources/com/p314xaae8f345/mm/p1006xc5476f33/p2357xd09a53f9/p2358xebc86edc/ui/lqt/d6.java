package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class d6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.f6 f259682d;

    public d6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.f6 f6Var) {
        this.f259682d = f6Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        java.util.Iterator it = this.f259682d.f259707a.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            g4Var.add(0, i17, 0, ((java.lang.String) it.next()).split("\\|\\|")[0]);
            i17++;
        }
    }
}

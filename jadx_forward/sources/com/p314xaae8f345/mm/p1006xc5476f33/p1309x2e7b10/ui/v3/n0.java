package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class n0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 f176882d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8) {
        this.f176882d = activityC13072x745567c8;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        r45.ru ruVar = this.f176882d.C;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ruVar);
        java.util.Iterator it = ruVar.f466742d.iterator();
        while (it.hasNext()) {
            r45.qu quVar = (r45.qu) it.next();
            g4Var.add(0, quVar.f465792d, 1, quVar.f465794f);
        }
    }
}

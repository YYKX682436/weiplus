package iu1;

/* loaded from: classes9.dex */
public final class b0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376373d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76) {
        this.f376373d = activityC13064xaf775f76;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        java.util.Iterator it = this.f376373d.F.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            g4Var.add(0, i17, 1, ((r45.qu) it.next()).f465794f);
            i17++;
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class l4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m4 f231225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.n4 f231227c;

    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.n4 n4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m4 m4Var, java.lang.String str) {
        this.f231227c = n4Var;
        this.f231225a = m4Var;
        this.f231226b = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        if (i17 != 0 || i18 != 0 || (fVar = oVar.f152244b.f152233a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkSessionMgr", "hy: get sessionkey fail,errType:" + i17 + ",errCode:" + i18);
            this.f231227c.a(i17, i18, str, null, false, this.f231225a);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.j4 j4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.j4();
        j4Var.f231198a = ((r45.n07) fVar).f462513d.i();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        j4Var.f231200c = android.os.SystemClock.elapsedRealtime();
        j4Var.f231199b = 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkSessionMgr", "hy: getSession sessionKey: %s", j4Var);
        ((java.util.concurrent.ConcurrentHashMap) this.f231227c.f231266a).put(this.f231226b, j4Var);
        this.f231227c.a(0, 0, "", j4Var, true, this.f231225a);
    }
}

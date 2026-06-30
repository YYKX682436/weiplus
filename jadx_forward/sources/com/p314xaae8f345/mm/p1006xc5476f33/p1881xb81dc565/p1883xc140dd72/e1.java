package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.f1 f231092d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.f1 f1Var) {
        this.f231092d = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.f1 f1Var = this.f231092d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f1Var.f231109a.f231174p)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = f1Var.f231109a;
            if (i4Var.f231170n != 1) {
                i4Var.f231152d.b(i4Var.f231174p);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = f1Var.f231109a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.n4 n4Var = i4Var2.f231152d;
                java.lang.String str = i4Var2.f231174p;
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.d1 d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.d1(this);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) n4Var.f231266a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.j4 j4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.j4) concurrentHashMap.get(str);
                if (j4Var != null && j4Var.a()) {
                    n4Var.a(0, 0, "", j4Var, false, d1Var);
                    return;
                }
                concurrentHashMap.remove(str);
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152197a = new r45.m07();
                lVar.f152198b = new r45.n07();
                lVar.f152200d = 3773;
                lVar.f152199c = "/cgi-bin/micromsg-bin/voipmtgensession";
                lVar.f152201e = 0;
                lVar.f152202f = 0;
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                ((r45.m07) a17.f152243a.f152217a).f461586e = str;
                ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.l4(n4Var, d1Var, str));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Multitalk.ILinkService", "hy: not in room now");
    }
}

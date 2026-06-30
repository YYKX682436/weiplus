package np3;

/* loaded from: classes5.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f420334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.p0 f420335e;

    public i(np3.j jVar, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        this.f420334d = map;
        this.f420335e = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f420334d;
        java.lang.String str = (java.lang.String) map.get(".sysmsg.pat.fromusername");
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.pat.chatusername");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.pat.pattedusername");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.pat.template");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PatMsgListener", "fromUser: %s, chatUser: %s, pattedUser: %s, template:%s", str, str2, str3, str4);
        if (((lp3.r) i95.n0.c(lp3.r.class)).Di()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
            com.p314xaae8f345.mm.p944x882e457a.p0 p0Var = this.f420335e;
            if (cj6.X9(p0Var.f152259a.f459101r)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("PatMsgListener", "ignore insert, msg %d should be deleted!", java.lang.Long.valueOf(p0Var.f152259a.f459101r));
                return;
            }
            lp3.l lVar = (lp3.l) i95.n0.c(lp3.l.class);
            r45.j4 j4Var = p0Var.f152259a;
            lVar.fj(str2, str, str3, str4, j4Var.f459098o, j4Var.f459101r);
        }
    }
}

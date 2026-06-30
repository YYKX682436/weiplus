package i53;

/* loaded from: classes8.dex */
public class b0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f370055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c0 f370056b;

    public b0(i53.c0 c0Var, long j17) {
        this.f370056b = c0Var;
        this.f370055a = j17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishImpl", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        i53.c0 c0Var = this.f370056b;
        c0Var.f370061d.put("costtime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f370055a));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((p33.x) oVar.f152244b.f152233a).f433199g);
        java.util.Map map = c0Var.f370061d;
        map.put("topicid", valueOf);
        int i19 = c0Var.f370066i;
        m33.m1 m1Var = c0Var.f370064g;
        i53.d0 d0Var = c0Var.f370067m;
        java.lang.String str2 = c0Var.f370063f;
        if (i17 != 0 || i18 != 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().W0(str2, 1);
            if (m1Var.f404848a) {
                m33.i1 i1Var = g53.f.f350444a;
                if (i1Var != null) {
                    i1Var.a("publish error");
                    g53.f.f350444a = null;
                }
                i53.d0.wi(d0Var, false, m1Var.f404849b);
            }
            d0Var.Bi(str2, i18 > 0 ? -i18 : i18);
            map.put("failid", java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8765, 0, 56, c0Var.f370065h, lj0.a.a(i19, map));
            return;
        }
        i53.g0 Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai();
        Ai.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str2);
        Ai.y0(linkedList);
        if (m1Var.f404848a) {
            java.lang.String str3 = m1Var.f404849b;
            if (m1Var.f404850c && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                i53.d0.wi(d0Var, true, str3);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str3);
                ((p43.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi()).z0(arrayList);
            }
            m33.i1 i1Var2 = g53.f.f350444a;
            if (i1Var2 != null) {
                i1Var2.mo74226xe05b4124();
                g53.f.f350444a = null;
            }
        }
        d0Var.Bi(str2, 0);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8765, 0, 48, c0Var.f370065h, lj0.a.a(i19, map));
    }
}

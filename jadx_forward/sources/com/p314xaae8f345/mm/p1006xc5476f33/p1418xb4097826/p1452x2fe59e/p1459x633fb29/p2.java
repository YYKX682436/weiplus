package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class p2 implements eb2.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s2 f189775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13865x4e81e68a f189776b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 f189777c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.r f189778d;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s2 s2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13865x4e81e68a c13865x4e81e68a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 n0Var, fp0.r rVar) {
        this.f189775a = s2Var;
        this.f189776b = c13865x4e81e68a;
        this.f189777c = n0Var;
        this.f189778d = rVar;
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n2 response) {
        r45.gk2 gk2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s2 s2Var = this.f189775a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s2Var.m56464xb5886c64(), "[call] onFetchDone... pullType=" + response.getPullType());
        if (response.getPullType() != 2) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.List m56409x97891cf7 = response.m56409x97891cf7();
            if (m56409x97891cf7 != null) {
                java.util.Iterator it = m56409x97891cf7.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ja0 ja0Var = ((so2.k) it.next()).f491984d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.o90 o90Var = ja0Var.f208526b;
                    if ((o90Var != null ? o90Var.f208831a : null) != null) {
                        long j17 = ja0Var.f208531g;
                        if (o90Var == null || (gk2Var = o90Var.f208831a) == null) {
                            gk2Var = new r45.gk2();
                        }
                        linkedList.add(new bu2.m0(0, j17, 1, gk2Var));
                    }
                }
            }
            if (linkedList.size() > 0) {
                bu2.e0.f106031a.a(9, xy2.c.f(this.f189776b.m56354xfe9224be()), linkedList);
                com.p314xaae8f345.mm.p2495xc50a8b8b.g lastBuffer = response.getLastBuffer();
                java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(lastBuffer != null ? lastBuffer.g() : null);
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_LBS_SECTION_LASTBUF_STRING_SYNC, l17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s2Var.m56464xb5886c64(), "save firstPage and lastBuffer, size:" + linkedList.size() + ", lastBuffer:" + l17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s2Var.m56464xb5886c64(), "lxl FinderLbsLoader FinderPage size: " + linkedList.size());
        }
        this.f189777c.mo55587xb461ee3d(response);
        this.f189778d.b(fp0.u.f346823f);
    }
}

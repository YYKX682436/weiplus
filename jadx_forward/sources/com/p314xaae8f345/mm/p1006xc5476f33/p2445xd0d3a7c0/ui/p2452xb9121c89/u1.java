package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.o1 f269812d;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.o1 o1Var) {
        this.f269812d = o1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.o1 o1Var = this.f269812d;
        o1Var.f269780d.f269777d.f269680m.a();
        iz4.a aVar = new iz4.a();
        aVar.f377637b = false;
        aVar.f377643h = false;
        o1Var.f269780d.f269777d.J1.b(aVar, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = o1Var.f269780d.f269777d;
        mz4.j0 j0Var = activityC19519x7af4daf3.f269680m;
        int i17 = j0Var.f414842q;
        j0Var.f414842q = 3;
        java.lang.String p17 = activityC19519x7af4daf3.J1.p(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf32 = o1Var.f269780d.f269777d;
        hz4.t tVar = activityC19519x7af4daf32.K1;
        r45.bq0 n17 = activityC19519x7af4daf32.J1.n(p17);
        tVar.f367987a = p17;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (n17 == null || n17.f452497f.size() <= 1) {
            linkedList = null;
        } else {
            java.util.Iterator it = n17.f452497f.iterator();
            while (it.hasNext()) {
                r45.gp0 gp0Var = (r45.gp0) it.next();
                java.lang.String c17 = hz4.l.c(gp0Var);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17) && gp0Var.I == 2 && com.p314xaae8f345.mm.vfs.w6.j(c17)) {
                    r45.xp0 xp0Var = new r45.xp0();
                    xp0Var.f471838d = gp0Var.M;
                    xp0Var.f471839e = gp0Var.f456971u;
                    xp0Var.f471840f = gp0Var.f456967s;
                    linkedList2.add(xp0Var);
                }
            }
            linkedList = linkedList2;
        }
        c01.d9.e().g(new hz4.e(i17, 1, tVar.f367987a, linkedList, null));
    }
}

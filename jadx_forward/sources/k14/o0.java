package k14;

/* loaded from: classes11.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.x0 f384901d;

    public o0(k14.x0 x0Var) {
        this.f384901d = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        k14.x0 x0Var = this.f384901d;
        x0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("tmessage");
        arrayList.add("officialaccounts");
        arrayList.add("filehelper");
        arrayList.add("helper_entry");
        arrayList.add(c01.z1.r());
        com.p314xaae8f345.mm.p2621x8fb0427b.ja m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ka) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0("@t.qq.com");
        if (m07 != null) {
            arrayList.add(m07.f276591b);
        }
        arrayList.add("blogapp");
        android.database.Cursor A = Bi.A("@all.contact.without.chatroom", null, arrayList, null, false, false);
        if (A != null) {
            A.moveToFirst();
            while (!A.isAfterLast()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.mo9015xbf5d97fd(A);
                linkedList.add(z3Var.d1());
                A.moveToNext();
            }
            A.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactEngine", "[getQuery] cost:%sms list size:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(linkedList.size()));
        if (x0Var.f384936b) {
            k14.w0 w0Var = new k14.w0(x0Var, x0Var.f384946l, x0Var.f384938d);
            x0Var.f384945k = w0Var;
            w0Var.f384931g = java.lang.System.currentTimeMillis();
            gm0.j1.d().a(292, w0Var);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5620x496bfda4 c5620x496bfda4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5620x496bfda4();
            c5620x496bfda4.f135946g.f89065a = 3;
            c5620x496bfda4.e();
        }
        if (x0Var.f384935a) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                hashSet.add((java.lang.String) it.next());
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - 15552000000L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactEngine", "[getHalfYearNotChatInfo] timestamp:%s size:%s", java.lang.Long.valueOf(currentTimeMillis2), java.lang.Integer.valueOf(hashSet.size()));
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            p13.u uVar = new p13.u();
            uVar.f432673b = 9;
            uVar.f432674c = java.lang.String.valueOf(currentTimeMillis2);
            uVar.f432684m = new k14.s0(x0Var, hashSet, currentTimeMillis2, currentTimeMillis3);
            uVar.f432685n = x0Var.f384939e;
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
        }
        if (x0Var.f384937c) {
            x0Var.a(linkedList, 0);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        k14.r0 r0Var = new k14.r0(x0Var);
        x0Var.f384948n = r0Var;
        ((ku5.t0) u0Var).g(r0Var);
    }
}

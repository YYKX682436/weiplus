package nv;

/* loaded from: classes12.dex */
public class p2 implements java.lang.Runnable {
    public p2(nv.r2 r2Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        mn1.e j17 = mn1.d.i().j();
        j17.getClass();
        xn1.c.a("Type", 7);
        xn1.b.f536987a.a(7, 1, qn1.c.o().f446502i);
        synchronized (j17.f411380j) {
            ln1.x xVar = j17.f411371a;
            if (xVar != null && xVar.f401382c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveRecoverServer", "startMerge hasStartMerge, return.");
                return;
            }
            if (xVar != null) {
                ((ku5.t0) ku5.t0.f394148d).g(new mn1.f(j17, xVar));
            }
            java.util.HashSet hashSet = j17.f411386p;
            if (hashSet != null && hashSet.size() > 0) {
                i17 = j17.f411386p.size();
                mn1.d.i().e().f391142a = 26;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                mn1.d.i().e().f391145d = 0;
                j17.a(26);
                tn1.f.f().c();
                j17.f411388r = java.lang.System.currentTimeMillis();
                ln1.x xVar2 = new ln1.x(mn1.d.i(), 2, j17, i17, false, new java.util.LinkedList(), new java.util.LinkedList());
                j17.f411371a = xVar2;
                xVar2.g(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(485L, 46L, 1L, false);
            }
            android.database.Cursor B = c01.d9.b().h().f276721d.B("SELECT COUNT(DISTINCT sessionName) FROM BackupRecoverMsgListDataId ", null);
            int i18 = B.moveToLast() ? B.getInt(0) : 0;
            B.close();
            i17 = i18;
            mn1.d.i().e().f391142a = 26;
            boolean z172 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            mn1.d.i().e().f391145d = 0;
            j17.a(26);
            tn1.f.f().c();
            j17.f411388r = java.lang.System.currentTimeMillis();
            ln1.x xVar22 = new ln1.x(mn1.d.i(), 2, j17, i17, false, new java.util.LinkedList(), new java.util.LinkedList());
            j17.f411371a = xVar22;
            xVar22.g(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(485L, 46L, 1L, false);
        }
    }
}

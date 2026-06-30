package c01;

/* loaded from: classes11.dex */
public class z9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f119112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.aa f119113e;

    public z9(c01.aa aaVar, java.util.Map map) {
        this.f119113e = aaVar;
        this.f119112d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        c01.z9 z9Var = this;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = 0;
        int i17 = 0;
        for (java.util.Map.Entry entry : z9Var.f119112d.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            long longValue = ((java.lang.Long) entry.getValue()).longValue();
            while (true) {
                c01.aa aaVar = z9Var.f119113e;
                int i18 = aaVar.f118589d;
                if (i18 < 200 && i18 > 30) {
                    aaVar.f118589d = j18 > 500 ? i18 - 5 : i18 + 5;
                }
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                android.database.Cursor Y2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Y2(str, aaVar.f118589d, longValue);
                long j19 = 0;
                long j27 = 0;
                while (Y2.moveToNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var.mo9015xbf5d97fd(Y2);
                    if (j19 < f9Var.mo78012x3fdd41df()) {
                        j19 = f9Var.mo78012x3fdd41df();
                    }
                    j27++;
                    c01.w9.e(f9Var, true);
                }
                Y2.close();
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                if (j19 > 0 && j27 > 0) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().L0(str, j19);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.r3) ((c01.j8) i95.n0.c(c01.j8.class))).Ai(str, j19);
                }
                j17 = currentTimeMillis;
                i17 = (int) (i17 + j27);
                long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                j18 = currentTimeMillis4 - currentTimeMillis2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker:%s delCnt:%d curCnt:%d msgTimeDiff:%d(%d) run:[%d,%d,%d](%d)", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(longValue - j19), java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(currentTimeMillis4 - currentTimeMillis3), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis4 - j17), java.lang.Integer.valueOf(aaVar.f118589d));
                if (j27 <= 0) {
                    break;
                }
                z9Var = this;
                currentTimeMillis = j17;
            }
            kz5.h hVar = (kz5.h) bm5.v.f104285r;
            hVar.getClass();
            kz5.e eVar = new kz5.e(hVar);
            while (eVar.hasNext()) {
                bm5.v vVar = (bm5.v) eVar.next();
                if (vVar != bm5.v.f104283p) {
                    bm5.c0 c0Var = bm5.c0.f104083a;
                    c0Var.c(c0Var.n(vVar, str, false, false), true);
                    c0Var.c(c0Var.n(vVar, str, true, false), true);
                }
            }
            ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).u0(str, 0L);
            z9Var = this;
            currentTimeMillis = j17;
        }
    }
}

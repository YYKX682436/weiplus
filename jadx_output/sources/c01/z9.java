package c01;

/* loaded from: classes11.dex */
public class z9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f37579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.aa f37580e;

    public z9(c01.aa aaVar, java.util.Map map) {
        this.f37580e = aaVar;
        this.f37579d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        c01.z9 z9Var = this;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = 0;
        int i17 = 0;
        for (java.util.Map.Entry entry : z9Var.f37579d.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            long longValue = ((java.lang.Long) entry.getValue()).longValue();
            while (true) {
                c01.aa aaVar = z9Var.f37580e;
                int i18 = aaVar.f37056d;
                if (i18 < 200 && i18 > 30) {
                    aaVar.f37056d = j18 > 500 ? i18 - 5 : i18 + 5;
                }
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                android.database.Cursor Y2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Y2(str, aaVar.f37056d, longValue);
                long j19 = 0;
                long j27 = 0;
                while (Y2.moveToNext()) {
                    com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                    f9Var.convertFrom(Y2);
                    if (j19 < f9Var.getCreateTime()) {
                        j19 = f9Var.getCreateTime();
                    }
                    j27++;
                    c01.w9.e(f9Var, true);
                }
                Y2.close();
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                if (j19 > 0 && j27 > 0) {
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().L0(str, j19);
                    ((com.tencent.mm.plugin.fts.logic.r3) ((c01.j8) i95.n0.c(c01.j8.class))).Ai(str, j19);
                }
                j17 = currentTimeMillis;
                i17 = (int) (i17 + j27);
                long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                j18 = currentTimeMillis4 - currentTimeMillis2;
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker:%s delCnt:%d curCnt:%d msgTimeDiff:%d(%d) run:[%d,%d,%d](%d)", com.tencent.mm.sdk.platformtools.t8.G1(str), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(longValue - j19), java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(currentTimeMillis4 - currentTimeMillis3), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis4 - j17), java.lang.Integer.valueOf(aaVar.f37056d));
                if (j27 <= 0) {
                    break;
                }
                z9Var = this;
                currentTimeMillis = j17;
            }
            kz5.h hVar = (kz5.h) bm5.v.f22752r;
            hVar.getClass();
            kz5.e eVar = new kz5.e(hVar);
            while (eVar.hasNext()) {
                bm5.v vVar = (bm5.v) eVar.next();
                if (vVar != bm5.v.f22750p) {
                    bm5.c0 c0Var = bm5.c0.f22550a;
                    c0Var.c(c0Var.n(vVar, str, false, false), true);
                    c0Var.c(c0Var.n(vVar, str, true, false), true);
                }
            }
            ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).u0(str, 0L);
            z9Var = this;
            currentTimeMillis = j17;
        }
    }
}

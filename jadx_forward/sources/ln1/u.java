package ln1;

/* loaded from: classes12.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln1.x f401376d;

    public u(ln1.x xVar, boolean z17) {
        this.f401376d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ln1.x xVar = this.f401376d;
        xVar.getClass();
        while (on1.c.f428339a) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "waitWildCleaning...");
                java.lang.Thread.sleep(500L);
                jx3.f.INSTANCE.d(21019, 0, 0, -6666);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupRecoverMerger", "waitWildCleaning failed : " + th6.getMessage());
            }
        }
        xVar.f401400u.clear();
        xVar.f401401v.clear();
        xVar.f401402w.clear();
        xVar.f401403x.clear();
        xVar.f401393n = 1;
        int i17 = xVar.f401390k;
        if (i17 == 1) {
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BACKUP_PC_MERGERING_BOOLEAN, java.lang.Boolean.TRUE);
        } else if (i17 == 2) {
            c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BACKUP_MOVE_MERGERING_BOOLEAN, java.lang.Boolean.TRUE);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = xVar.f401394o;
        o4Var.A("MMKV_BACKUP_TRY_TIME", o4Var.getInt("MMKV_BACKUP_TRY_TIME", 0) + 1);
        xVar.f401394o.G("MMKV_BACKUP_NEED_REPORT", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "startMergeImpl start, mergeState[%d], totalMsgList[%d], msgListDataIdHashMap[%d]", java.lang.Integer.valueOf(xVar.f401393n), java.lang.Long.valueOf(xVar.f401386g), java.lang.Integer.valueOf(xVar.f401383d.size()));
        if (xVar.f401399t == null) {
            xVar.f401399t = java.util.concurrent.Executors.newFixedThreadPool(ln1.x.C);
        }
        java.lang.String str = (java.lang.String) tn1.f.f().e().b().l(2, null);
        ((ku5.t0) ku5.t0.f394148d).r(fo1.i.f346410d, "RoamBackup.MediaPullObserver");
        java.util.Iterator it = xVar.f401383d.keySet().iterator();
        while (it.hasNext()) {
            xVar.f401399t.execute(new ln1.v(xVar, (java.lang.String) it.next(), str));
        }
        xVar.f401399t.shutdown();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "awaitTermination awaitRet = " + xVar.f401399t.awaitTermination(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, java.util.concurrent.TimeUnit.MICROSECONDS));
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupRecoverMerger", "awaitTermination error = " + e17.getMessage());
        }
        synchronized (xVar.f401388i) {
            if (!xVar.f401380a) {
                xVar.h();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRecoverMerger", "Merge completed, build message FTS search index");
                ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).Di(2);
            }
        }
    }
}

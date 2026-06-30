package c01;

/* loaded from: classes11.dex */
public class x9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f37563d = 100;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f37564e;

    public x9(java.util.Map map) {
        this.f37564e = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it;
        java.lang.Class<vg3.x3> cls;
        long j17;
        c01.w9.f37540c = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfoStorageLogic", "summerdel checkUnfinishedDeleteMsgTask run currentThread[%s, %d] talkers size:%s", java.lang.Thread.currentThread().getName(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Integer.valueOf(this.f37564e.size()));
        java.lang.Class<vg3.x3> cls2 = vg3.x3.class;
        long j18 = 0;
        if (this.f37564e.containsKey("")) {
            c01.w9.b(((java.lang.Long) this.f37564e.get("")).longValue(), 2);
            this.f37564e.remove("");
            ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls2))).Ni()).u0("", 0L);
        }
        java.util.Iterator it6 = this.f37564e.entrySet().iterator();
        while (it6.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            long longValue = ((java.lang.Long) entry.getValue()).longValue();
            if (longValue > j18) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j19 = j18;
                int i17 = 0;
                while (true) {
                    int i18 = this.f37563d;
                    if (i18 < 200 && i18 > 30) {
                        this.f37563d = j19 > 500 ? i18 - 5 : i18 + 5;
                    }
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    android.database.Cursor Y2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls2))).cj().Y2(str, this.f37563d, longValue);
                    long j27 = 0;
                    long j28 = 0;
                    while (Y2.moveToNext()) {
                        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                        f9Var.convertFrom(Y2);
                        if (j27 < f9Var.getCreateTime()) {
                            j27 = f9Var.getCreateTime();
                        }
                        j28++;
                        c01.w9.e(f9Var, false);
                        it6 = it6;
                    }
                    it = it6;
                    Y2.close();
                    long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                    if (j27 > 0 && j28 > 0) {
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls2))).cj().L0(str, j27);
                        ((com.tencent.mm.plugin.fts.logic.r3) ((c01.j8) i95.n0.c(c01.j8.class))).Ai(str, j27);
                    }
                    cls = cls2;
                    i17 = (int) (i17 + j28);
                    long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                    long j29 = currentTimeMillis4 - currentTimeMillis2;
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfoStorageLogic", "summerdel checkUnfinishedDeleteMsgTask:%s delCnt:%d curCnt:%d msgTimeDiff:%d(%d) run:[%d,%d,%d](%d)", com.tencent.mm.sdk.platformtools.t8.G1(str), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(longValue - j27), java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(currentTimeMillis4 - currentTimeMillis3), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(currentTimeMillis4 - currentTimeMillis), java.lang.Integer.valueOf(this.f37563d));
                    j17 = 0;
                    if (j28 <= 0) {
                        break;
                    }
                    j19 = j29;
                    cls2 = cls;
                    it6 = it;
                }
                ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls))).Ni()).u0(str, 0L);
            } else {
                it = it6;
                cls = cls2;
                j17 = j18;
            }
            cls2 = cls;
            j18 = j17;
            it6 = it;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfoStorageLogic", "Done checkUnfinishedDeleteMsgTask");
        c01.w9.f37540c = false;
    }
}

package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.b2 f277828d;

    public w1(com.p314xaae8f345.mm.p2621x8fb0427b.b2 b2Var) {
        this.f277828d = b2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.b2 b2Var = this.f277828d;
        android.database.Cursor B = b2Var.f275296d.B("SELECT count(*) FROM BizTimeLineInfo", null);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        if (i17 > 0) {
            int i18 = b2Var.f275298f;
            b2Var.f275298f = i18 - 1;
            if (i18 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorage", "deleteTable start");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorage", "deleteTable end ret=%b", java.lang.Boolean.valueOf(b2Var.f275296d.A("BizTimeLineInfo", java.lang.String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", "BizTimeLineInfo", "orderFlag", "orderFlag", "BizTimeLineInfo", "orderFlag", 100))));
                ((ku5.t0) ku5.t0.f394148d).l(new com.p314xaae8f345.mm.p2621x8fb0427b.w1(b2Var), 10L, "BizTimeLineInfoStorageDeleteThread");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineInfoStorage", "deleteTable count: %d", java.lang.Integer.valueOf(i17));
    }
}

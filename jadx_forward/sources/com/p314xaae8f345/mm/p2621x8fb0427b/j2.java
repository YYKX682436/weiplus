package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.h2 f276573d;

    public j2(com.p314xaae8f345.mm.p2621x8fb0427b.h2 h2Var) {
        this.f276573d = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.h2 h2Var = this.f276573d;
        int mo78086x7444f759 = h2Var.mo78086x7444f759();
        if (mo78086x7444f759 > 0) {
            int i17 = h2Var.f276528f;
            h2Var.f276528f = i17 - 1;
            if (i17 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineSingleMsgStorage", "deleteTable start");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineSingleMsgStorage", "deleteTable end ret=%b", java.lang.Boolean.valueOf(h2Var.f276526d.A("BizTimeLineSingleMsgInfo", java.lang.String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", "BizTimeLineSingleMsgInfo", "msgSvrId", "msgSvrId", "BizTimeLineSingleMsgInfo", "createTime", 100))));
                ((ku5.t0) ku5.t0.f394148d).l(new com.p314xaae8f345.mm.p2621x8fb0427b.j2(h2Var), 10L, "BizTimeLineInfoStorageDeleteThread");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineSingleMsgStorage", "deleteTable count: %d", java.lang.Integer.valueOf(mo78086x7444f759));
    }
}

package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.h2 f276599d;

    public k2(com.p314xaae8f345.mm.p2621x8fb0427b.h2 h2Var) {
        this.f276599d = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.h2 h2Var = this.f276599d;
        h2Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int mo78086x7444f759 = h2Var.mo78086x7444f759();
        if (mo78086x7444f759 > 2000) {
            h2Var.f276526d.A("BizTimeLineSingleMsgInfo", java.lang.String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", "BizTimeLineSingleMsgInfo", "msgSvrId", "msgSvrId", "BizTimeLineSingleMsgInfo", "createTime", 100));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineSingleMsgStorage", "deleteTooOldData delete cost: %d, count: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(mo78086x7444f759));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineSingleMsgStorage", "deleteTooOldData count: %d", java.lang.Integer.valueOf(mo78086x7444f759));
        }
        h2Var.f276529g = false;
    }
}

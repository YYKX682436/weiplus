package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f1 f275386d;

    public e1(com.p314xaae8f345.mm.p2621x8fb0427b.f1 f1Var) {
        this.f275386d = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f1 f1Var = this.f275386d;
        f1Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int mo78086x7444f759 = f1Var.mo78086x7444f759();
        if (mo78086x7444f759 > 2000) {
            f1Var.f275442d.A("BizPhotoSingleMsgInfo", java.lang.String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", "BizPhotoSingleMsgInfo", "msgSvrId", "msgSvrId", "BizPhotoSingleMsgInfo", "createTime", 100));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPhotoSingleMsgStorage", "deleteTooOldData delete cost: %d, count: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(mo78086x7444f759));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPhotoSingleMsgStorage", "deleteTooOldData count: %d", java.lang.Integer.valueOf(mo78086x7444f759));
        }
        f1Var.f275444f = false;
    }
}

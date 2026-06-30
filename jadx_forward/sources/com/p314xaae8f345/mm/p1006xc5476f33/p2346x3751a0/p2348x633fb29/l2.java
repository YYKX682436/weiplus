package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class l2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 f258273d;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 h2Var) {
        this.f258273d = h2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 h2Var = this.f258273d;
        if (h2Var.f258109s == null) {
            h2Var.f258110t = 0L;
            h2Var.C.d();
            return false;
        }
        if (!com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 h2Var2 = this.f258273d;
            if (currentTimeMillis - h2Var2.f258110t < 60000) {
                return true;
            }
            h2Var2.f258109s = null;
            h2Var2.f258110t = 0L;
            h2Var2.C.d();
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 h2Var3 = this.f258273d;
        r45.r27 r27Var = h2Var3.f258109s;
        h2Var3.B(r27Var.f466022d, r27Var.f466023e, r27Var.f466028m == 0, r27Var.f466027i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipService", "steve:voip callin in mRepeatCheckHandler, roomid:%d, roomkey:%s, time:%d", java.lang.Integer.valueOf(this.f258273d.f258109s.f466022d), java.lang.Long.valueOf(this.f258273d.f258109s.f466023e), java.lang.Integer.valueOf(this.f258273d.f258109s.f466024f));
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 h2Var4 = this.f258273d;
        h2Var4.h(h2Var4.f258109s);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 h2Var5 = this.f258273d;
        h2Var5.f258109s = null;
        h2Var5.f258110t = 0L;
        h2Var5.C.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 5L, 1L, false);
        return false;
    }
}

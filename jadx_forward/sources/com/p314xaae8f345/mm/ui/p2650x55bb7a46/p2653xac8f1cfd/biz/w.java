package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes8.dex */
public class w implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f280352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.x f280353b;

    public w(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.x xVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f280353b = xVar;
        this.f280352a = u3Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "request usebizmuteflag from server errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        if (i17 == 0 || i18 == 0) {
            ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.u(this), "process_biz_mute_contact");
            return null;
        }
        c01.z1.S(false);
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.v(this));
        return null;
    }
}

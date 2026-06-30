package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public final class u extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f276875e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.r.f276785r, "BizAdInfo")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f276876f = {"CREATE  INDEX IF NOT EXISTS biz_exposeTime_index ON BizAdInfo ( exposeTime ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f276877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p2621x8fb0427b.r.f276785r, "BizAdInfo", f276876f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f276877d = db6;
    }

    public final void y0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAdInfoStorage", "deleteTable start");
        this.f276877d.A("BizAdInfo", "delete from BizAdInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAdInfoStorage", "deleteTable end");
    }

    public final boolean z0(com.p314xaae8f345.mm.p2621x8fb0427b.r info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (get(info, new java.lang.String[0])) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAdInfoStorage", "insertOrUpdate exist");
            return false;
        }
        boolean mo51731x24249762 = super.mo51731x24249762(info, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAdInfoStorage", "insertOrUpdate ret=" + mo51731x24249762);
        pm0.v.K(null, new com.p314xaae8f345.mm.p2621x8fb0427b.s(this));
        return mo51731x24249762;
    }
}

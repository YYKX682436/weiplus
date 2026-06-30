package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class t8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.u8 f189906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa f189907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f189908f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0 f189909g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f189910h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 f189911i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f189912m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.u8 u8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0 y0Var, ym5.s3 s3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158, yz5.l lVar) {
        super(0);
        this.f189906d = u8Var;
        this.f189907e = c13924x37151faa;
        this.f189908f = z17;
        this.f189909g = y0Var;
        this.f189910h = s3Var;
        this.f189911i = c13917xbf9dc158;
        this.f189912m = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.u8 u8Var = this.f189906d;
        u8Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa = this.f189907e;
        java.util.List m56409x97891cf7 = c13924x37151faa.m56409x97891cf7();
        if (m56409x97891cf7 != null && (!m56409x97891cf7.isEmpty())) {
            boolean z17 = false;
            so2.j5 j5Var = (so2.j5) m56409x97891cf7.get(0);
            if (this.f189908f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158 = u8Var.f189933b;
                eb2.f0 f0Var = c13917xbf9dc158.f189183f;
                if (f0Var != null && j5Var.mo2128x1ed62e84() == f0Var.f332278d) {
                    z17 = true;
                }
                if (!z17) {
                    if (!c13917xbf9dc158.m56387xe6796cde().isEmpty()) {
                        c13917xbf9dc158.m56387xe6796cde().clear();
                        c13917xbf9dc158.getDispatcher().a();
                    }
                    eb2.f0 f0Var2 = c13917xbf9dc158.f189183f;
                    long j17 = f0Var2 != null ? f0Var2.f332278d : 0L;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13917xbf9dc158.getF204960d(), "finder stream no return share feed feedId=" + j17);
                    pm0.z.b(xy2.b.f539688b, "ShareFeedNoReturnError", false, null, null, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p8(j17), 60, null);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0 y0Var = this.f189909g;
        ym5.s3 s3Var = this.f189910h;
        u8Var.m56450x8edc3bb3(y0Var, s3Var);
        this.f189911i.getDispatcher().g(s3Var);
        yz5.l lVar = this.f189912m;
        if (lVar != null) {
            lVar.mo146xb9724478(c13924x37151faa);
        }
        return jz5.f0.f384359a;
    }
}

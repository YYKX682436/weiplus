package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes10.dex */
public final class w implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f206942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dy1.r f206943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x f206944c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206945d;

    public w(in5.s0 s0Var, dy1.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x xVar, java.lang.String str) {
        this.f206942a = s0Var;
        this.f206943b = rVar;
        this.f206944c = xVar;
        this.f206945d = str;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var;
        so2.y0 y0Var = (so2.y0) this.f206942a.f374658i;
        boolean z17 = false;
        if (y0Var != null && (yj0Var = y0Var.f492236d) != null && yj0Var.i1()) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x xVar = this.f206944c;
            ((cy1.a) this.f206943b).Bj(xVar.f206957e, str, kz5.c1.k(new jz5.l("feed_id", this.f206945d), new jz5.l("expose_time_ms", java.lang.Long.valueOf(j17 - xVar.f206956d)), new jz5.l("promotion_buffer", xVar.f206958f)), 1, false);
        }
    }
}

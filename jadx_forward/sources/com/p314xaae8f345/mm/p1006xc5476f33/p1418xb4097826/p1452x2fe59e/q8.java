package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class q8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8 f190334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f190335b;

    public q8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8 t8Var, yz5.a aVar) {
        this.f190334a = t8Var;
        this.f190335b = aVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.wj4 wj4Var;
        r45.wj4 wj4Var2;
        r45.wj4 wj4Var3;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        java.lang.String str = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8 t8Var = this.f190334a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.oj4 oj4Var = (r45.oj4) ((r45.tj4) fVar.f152151d).m75936x14adae67(1);
            long j17 = 0;
            if (((oj4Var == null || (wj4Var3 = (r45.wj4) oj4Var.m75936x14adae67(18)) == null) ? 0L : wj4Var3.m75942xfb822ef2(0)) != 0) {
                r45.oj4 oj4Var2 = (r45.oj4) ((r45.tj4) fVar.f152151d).m75936x14adae67(1);
                if (oj4Var2 != null && (wj4Var2 = (r45.wj4) oj4Var2.m75936x14adae67(18)) != null) {
                    j17 = wj4Var2.m75942xfb822ef2(0);
                }
                t8Var.C = j17;
                t8Var.D = null;
                r45.oj4 oj4Var3 = (r45.oj4) ((r45.tj4) fVar.f152151d).m75936x14adae67(1);
                if (oj4Var3 != null && (wj4Var = (r45.wj4) oj4Var3.m75936x14adae67(18)) != null) {
                    str = wj4Var.m75945x2fec8307(1);
                }
                if (str == null) {
                    str = "";
                }
                t8Var.E = str;
                t8Var.Z(this.f190335b);
                return jz5.f0.f384359a;
            }
        }
        yz5.p pVar = t8Var.I;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.w(t8Var.f187960m, null);
        return jz5.f0.f384359a;
    }
}

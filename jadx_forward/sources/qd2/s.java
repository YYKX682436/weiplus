package qd2;

/* loaded from: classes2.dex */
public final class s implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qd2.x f443348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f443349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f443350c;

    public s(qd2.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f443348a = xVar;
        this.f443349b = c14994x9b99c079;
        this.f443350c = qVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderModifyFeedHelper", "[doModFeedCgi] errType:" + fVar.f152148a + " errCode:" + fVar.f152149b + " errMsg:" + fVar.f152150c);
        int i17 = fVar.f152148a;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f443350c;
        if (i17 == 0 && fVar.f152149b == 0) {
            this.f443348a.getClass();
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f443349b;
            ((c61.p2) ybVar).wi(c14994x9b99c079.m59251x5db1b11(), c14994x9b99c079.m59229xb5af1dd5()).l().K(new qd2.u(c14994x9b99c079));
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.TRUE, fVar.f152150c)));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.FALSE, fVar.f152150c)));
        }
        return jz5.f0.f384359a;
    }
}

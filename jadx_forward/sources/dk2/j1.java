package dk2;

/* loaded from: classes3.dex */
public final class j1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f315164b;

    public j1(dk2.r4 r4Var, yz5.p pVar) {
        this.f315163a = r4Var;
        this.f315164b = pVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        dk2.r4 r4Var = this.f315163a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "doGetGiftList errType:" + i17 + ", errCode:" + i18);
        jz5.f0 f0Var = jz5.f0.f384359a;
        yz5.p pVar = this.f315164b;
        if (i17 == 0 && i18 == 0) {
            dk2.ef efVar = dk2.ef.f314905a;
            dk2.ef.N = ((r45.d81) fVar.f152151d).m75934xbce7f2f(2);
            dk2.ef.P = ((r45.d81) fVar.f152151d).m75939xb282bd08(3);
            dk2.ef.Q = ((r45.d81) fVar.f152151d).m75939xb282bd08(4);
            if (zl2.r4.f555483a.w1()) {
                r45.aq1 aq1Var = new r45.aq1();
                aq1Var.set(1, db2.t4.f309704a.a(11250));
                aq1Var.set(2, xy2.c.f(r4Var.f315541c));
                pq5.g l17 = aq1Var.d().l();
                l17.K(new dk2.i1(pVar, i18, r4Var));
                if (r4Var.M() == null || !(r4Var.M() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
                    return l17;
                }
                android.content.Context M = r4Var.M();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) M);
                return l17;
            }
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i18));
                return f0Var;
            }
        } else if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i18));
            return f0Var;
        }
        return null;
    }
}

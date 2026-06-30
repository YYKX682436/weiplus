package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class q5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f148408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5 f148409b;

    public q5(p3325xe03a0797.p3326xc267989b.q qVar, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5 z5Var) {
        this.f148408a = qVar;
        this.f148409b = z5Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean z17 = fVar != null && fVar.f152148a == 0;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f148408a;
        r45.wa1 wa1Var = null;
        if (z17 && fVar.f152149b == 0) {
            r45.wa1 wa1Var2 = new r45.wa1();
            r45.nd2 nd2Var = (r45.nd2) fVar.f152151d;
            byte[] g17 = (nd2Var == null || (m75934xbce7f2f = nd2Var.m75934xbce7f2f(1)) == null) ? null : m75934xbce7f2f.g();
            if (g17 != null) {
                try {
                    wa1Var2.mo11468x92b714fd(g17);
                    wa1Var = wa1Var2;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(wa1Var));
        } else {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f148409b.f148590d, "FinderGetWindowProductProfileCardInfo Request Fail!");
        }
        return jz5.f0.f384359a;
    }
}

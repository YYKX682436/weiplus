package ls4;

/* loaded from: classes8.dex */
public final class t implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.u f402631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.fc5 f402632b;

    public t(ls4.u uVar, r45.fc5 fc5Var) {
        this.f402631a = uVar;
        this.f402632b = fc5Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.ns5 ns5Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinConsumeLogic", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
        r45.m80 m80Var = (r45.m80) fVar.f152151d;
        boolean g17 = os4.h.g(fVar);
        jz5.f0 f0Var = jz5.f0.f384359a;
        ls4.u uVar = this.f402631a;
        if (!g17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 74);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinConsumeLogic", "success, balance: %s", java.lang.Long.valueOf(m80Var.f461761d));
            os4.h.l(m80Var.f461761d);
            long j17 = m80Var.f461761d;
            uVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinConsumeLogic", ya.b.f77504xbb80cbe3);
            uVar.e();
            uVar.f402633a.f439555c.mo146xb9724478(new pr4.b(j17));
            return f0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 75);
        int i17 = fVar.f152149b;
        if (i17 == 10001 && m80Var != null && (ns5Var = m80Var.f461762e) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeCoinConsumeLogic", "retry, retry time: %s", java.lang.Integer.valueOf(ns5Var.f463185d));
            return p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new ls4.s(m80Var, uVar, this.f402632b, null), 3, null);
        }
        if (i17 == 10003) {
            uVar.d(new pr4.a(pr4.j.f439546e));
            return f0Var;
        }
        uVar.d(new pr4.a(pr4.j.f439545d));
        return f0Var;
    }
}

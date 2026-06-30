package ms4;

/* loaded from: classes8.dex */
public final class m0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.o0 f412599a;

    public m0(ms4.o0 o0Var) {
        this.f412599a = o0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinRechargeViewModel", "getWecoinPageInfoRequest errorType: " + fVar.f152148a + ", errorCode: " + fVar.f152149b + ", errorMsg: " + fVar.f152150c);
        boolean h17 = os4.h.h(fVar);
        ms4.o0 o0Var = this.f412599a;
        if (h17) {
            if (o0Var.f412626o == null) {
                o0Var.f412624m.mo7808x76db6cb1(new ms4.a(fVar.f152148a, fVar.f152149b, fVar.f152150c, null, 8, null));
            }
            o0Var.N6(3, fVar.f152149b, fVar.f152150c);
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            if (fVar2 == null) {
                if (o0Var.f412626o == null) {
                    o0Var.f412624m.mo7808x76db6cb1(new ms4.a(3, -1, "", null, 8, null));
                }
                o0Var.N6(3, 3, "callback resp is null");
            } else {
                r45.hs3 hs3Var = (r45.hs3) fVar2;
                os4.h.k("MicroMsg.WeCoinRechargeViewModel", hs3Var);
                o0Var.f412620f.mo7808x76db6cb1(new ms4.j(hs3Var.f457953h, hs3Var.f457950e));
                o0Var.f412619e.mo7808x76db6cb1(java.lang.Long.valueOf(hs3Var.f457949d));
                o0Var.f412621g.mo7808x76db6cb1(hs3Var.f457954i);
                o0Var.f412622h.mo7808x76db6cb1(hs3Var.f457951f);
                o0Var.f412623i.mo7808x76db6cb1(hs3Var.f457955m);
                o0Var.f412625n.mo7808x76db6cb1(new ms4.k0(hs3Var.f457956n, hs3Var.f457957o));
                o0Var.f412630s.mo7808x76db6cb1(hs3Var.f457958p);
                o0Var.f412626o = hs3Var;
                os4.h.l(hs3Var.f457949d);
                o0Var.f412627p.mo7808x76db6cb1(java.lang.Boolean.valueOf(((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).c()));
                o0Var.N6(3, 0, "");
            }
        }
        return jz5.f0.f384359a;
    }
}

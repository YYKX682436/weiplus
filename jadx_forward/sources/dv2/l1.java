package dv2;

/* loaded from: classes8.dex */
public final class l1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv2.o1 f325422a;

    public l1(dv2.o1 o1Var) {
        this.f325422a = o1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSafePreCheckUIC", "[checkRealName] end, errType:" + fVar.f152148a + " errCode:" + fVar.f152149b + " last_verify_result:" + ((r45.js2) fVar.f152151d).m75939xb282bd08(2));
        dv2.o1 o1Var = this.f325422a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = o1Var.f325457n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        o1Var.f325457n = null;
        boolean z17 = ((r45.js2) fVar.f152151d).m75939xb282bd08(2) == 1;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9 h9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9(true, false, null, 6, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 m8Var = o1Var.f325454h;
            if (m8Var == null) {
                return null;
            }
            o1Var.f325455i = h9Var;
            m8Var.c(h9Var);
        } else {
            db5.t7.g(o1Var.m80379x76847179(), o1Var.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ewm));
        }
        return f0Var;
    }
}

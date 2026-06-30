package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class g1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf f176856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176857b;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf, java.lang.String str) {
        this.f176856a = activityC13074xfcf8fabf;
        this.f176857b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf = this.f176856a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.hd0 hd0Var = (r45.hd0) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "retCode: %s", java.lang.Integer.valueOf(hd0Var.f457595d));
            if (hd0Var.f457595d == 0) {
                java.util.Iterator it = activityC13074xfcf8fabf.f176812v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0 t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0) it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(t0Var.a().f468298d, this.f176857b)) {
                        activityC13074xfcf8fabf.f176812v.remove(t0Var);
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = activityC13074xfcf8fabf.f176811u;
                        if (c22848x6ddd90cf == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVipCardListAdapter");
                            throw null;
                        }
                        c22848x6ddd90cf.m8146xced61ae5();
                    }
                }
            } else {
                lu1.a0.r(activityC13074xfcf8fabf, hd0Var.f457596e);
            }
        } else {
            lu1.a0.q(activityC13074xfcf8fabf, "");
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf.S;
        activityC13074xfcf8fabf.a7(bool);
        return jz5.f0.f384359a;
    }
}

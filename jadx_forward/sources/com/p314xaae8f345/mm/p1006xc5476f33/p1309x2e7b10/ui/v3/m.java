package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f f176876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f176877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f, boolean z17) {
        super(1);
        this.f176876d = activityC13069x47bc6a4f;
        this.f176877e = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean z17 = this.f176877e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f = this.f176876d;
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13069x47bc6a4f.f176767d, "errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b + ", errMsg: " + fVar.f152150c);
            if (fVar.f152148a == 0 && fVar.f152149b == 0) {
                r45.ti3 ti3Var = (r45.ti3) fVar.f152151d;
                if (ti3Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13069x47bc6a4f.f176767d, "retcode: " + ti3Var.f467997d + ", retmsg: " + ti3Var.f467998e);
                    if (ti3Var.f467997d == 0) {
                        activityC13069x47bc6a4f.f176776p = ti3Var.f468000g;
                        activityC13069x47bc6a4f.f176777q = ti3Var.f468001h >= 1;
                        activityC13069x47bc6a4f.f176779s = true;
                        activityC13069x47bc6a4f.Z6(ti3Var.f468004n);
                        activityC13069x47bc6a4f.X6(ti3Var.f467999f);
                        if (z17) {
                            activityC13069x47bc6a4f.f176775o.clear();
                        }
                        activityC13069x47bc6a4f.V6(ti3Var.f468002i);
                        activityC13069x47bc6a4f.W6(ti3Var.f468003m);
                    } else {
                        lu1.a0.r(activityC13069x47bc6a4f.mo55332x76847179(), ti3Var.f467998e);
                    }
                }
            } else {
                lu1.a0.q(activityC13069x47bc6a4f.mo55332x76847179(), "");
            }
        }
        activityC13069x47bc6a4f.f176778r = false;
        if (!z17) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = activityC13069x47bc6a4f.f176769f;
            if (c22801x87cbdc00 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
                throw null;
            }
            c22801x87cbdc00.N(0);
        }
        return jz5.f0.f384359a;
    }
}

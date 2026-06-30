package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class o extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 f260981c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a f260982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f260982d = aVar;
    }

    @Override // np5.g
    public void b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "onActivityResult: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 1 || i18 != -1 || intent == null || intent.getExtras() == null) {
            return;
        }
        java.lang.String string = intent.getExtras().getString("token");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar = this.f260982d;
        aVar.f295334c.putString("realname_verify_process_face_token", string);
        aVar.o(this.f420366a, 0, aVar.f295334c);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar = this.f260982d;
        aVar.a("onNext", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71) objArr[0];
        this.f260981c = c19090x75920c71;
        c19090x75920c71.f261075d = aVar.G();
        this.f420367b.d(new rs4.a(this.f260981c, "", aVar.f295334c.getString("key_realname_sessionid")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof rs4.a;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar = this.f260982d;
            if (z17) {
                rs4.a aVar2 = (rs4.a) m1Var;
                if (aVar2.f480878f == null) {
                    aVar.f295334c.putString("kreq_token", aVar2.f480877e);
                    if (aVar.t(abstractActivityC21394xb3d2c0cf, aVar.f295334c)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "need update bankcardlist");
                        this.f420367b.a(new ss4.e0(null, 12), true);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "not need update bankcardlist");
                        aVar.o(abstractActivityC21394xb3d2c0cf, 0, aVar.f295334c);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "NetSceneTenpayBindBankcard show juveniles dialog");
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f420366a;
                    at4.y0 y0Var = aVar2.f480878f;
                    db5.e1.A(abstractActivityC21394xb3d2c0cf2, y0Var.f95546a, "", y0Var.f95548c, y0Var.f95547b, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.m(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.n(this));
                }
                return true;
            }
            if (m1Var instanceof ss4.e0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "update bankcardlist success!");
                aVar.o(abstractActivityC21394xb3d2c0cf, 0, aVar.f295334c);
                return true;
            }
        }
        return false;
    }
}

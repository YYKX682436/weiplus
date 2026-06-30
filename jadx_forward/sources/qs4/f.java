package qs4;

/* loaded from: classes9.dex */
public class f extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 f447949c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs4.j f447950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qs4.j jVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f447950d = jVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        qs4.j jVar = this.f447950d;
        jVar.a("onNext", objArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "onNext, do bind bank card!");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71) objArr[0];
        this.f447949c = c19090x75920c71;
        c19090x75920c71.f261075d = jVar.G();
        this.f420367b.d(new rs4.a(this.f447949c, "", ""), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof rs4.a;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
            qs4.j jVar = this.f447950d;
            if (z17) {
                rs4.a aVar = (rs4.a) m1Var;
                if (aVar.f480878f == null) {
                    jVar.f295334c.putString("kreq_token", aVar.f480877e);
                    if (jVar.t(abstractActivityC21394xb3d2c0cf, jVar.f295334c)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "need update bankcardlist");
                        this.f420367b.a(new ss4.e0(null, 12), false);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "not need update bankcardlist");
                        jVar.o(abstractActivityC21394xb3d2c0cf, 0, jVar.f295334c);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "NetSceneTenpayBindBankcard show juveniles dialog");
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f420366a;
                    at4.y0 y0Var = aVar.f480878f;
                    db5.e1.A(abstractActivityC21394xb3d2c0cf2, y0Var.f95546a, "", y0Var.f95548c, y0Var.f95547b, new qs4.d(this), new qs4.e(this));
                }
                return true;
            }
            if (m1Var instanceof ss4.e0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "update bankcardlist success!");
                jVar.o(abstractActivityC21394xb3d2c0cf, 0, jVar.f295334c);
                return true;
            }
        }
        return false;
    }
}

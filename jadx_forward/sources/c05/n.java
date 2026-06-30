package c05;

/* loaded from: classes9.dex */
public class n extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 f119243c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c05.q f119244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c05.q qVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f119244d = qVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71();
        this.f119243c = c19090x75920c71;
        c19090x75920c71.f261084p = (java.lang.String) objArr[0];
        c19090x75920c71.f261078g = (java.lang.String) objArr[1];
        c19090x75920c71.f261083o = (java.lang.String) objArr[2];
        c05.q qVar = this.f119244d;
        qVar.f295334c.putString("key_bank_phone", (java.lang.String) objArr[3]);
        this.f119243c.f261075d = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() ? 2 : 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c712 = this.f119243c;
        c19090x75920c712.f261082n = 1;
        c19090x75920c712.f261090v = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) qVar.f295334c.getParcelable("key_pay_info");
        this.f119243c.f261077f = qVar.f295334c.getString("key_pwd1");
        if (!qVar.f295334c.getBoolean("key_has_indentity_info", false)) {
            this.f119243c.f261080i = qVar.f295334c.getString("key_name");
            this.f119243c.f261081m = qVar.f295334c.getString("key_indentity");
        }
        qVar.f295334c.putString("key_mobile", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.e0(this.f119243c.f261083o));
        qVar.f295334c.putBoolean("key_is_oversea", false);
        this.f420367b.d(new rs4.a(this.f119243c, "", ""), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof rs4.a)) {
            return false;
        }
        rs4.a aVar = (rs4.a) m1Var;
        if (aVar.f480878f == null) {
            c05.q qVar = this.f119244d;
            qVar.f295334c.putString("kreq_token", aVar.f480877e);
            qVar.o(this.f420366a, 0, qVar.f295334c);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenWXCreditProcess", "NetSceneTenpayBindBankcard show juveniles dialog");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        at4.y0 y0Var = aVar.f480878f;
        db5.e1.A(abstractActivityC21394xb3d2c0cf, y0Var.f95546a, "", y0Var.f95548c, y0Var.f95547b, new c05.l(this), new c05.m(this));
        return true;
    }

    @Override // np5.g
    public boolean f(java.lang.Object... objArr) {
        this.f420367b.d(new ss4.z("", (java.lang.String) objArr[0], (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) this.f119244d.f295334c.getParcelable("key_pay_info")), true);
        return true;
    }
}

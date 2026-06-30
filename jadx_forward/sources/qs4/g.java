package qs4;

/* loaded from: classes9.dex */
public class g extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qs4.j f447951c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qs4.j jVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f447951c = jVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        return this.f420366a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0h);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        qs4.j jVar = this.f447951c;
        jVar.a("WalletVerifyCodeUI onNext", objArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "onNext, do bind verify!");
        at4.z0 z0Var = (at4.z0) objArr[1];
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            z0Var.f95555a = "2";
        } else {
            z0Var.f95555a = "1";
        }
        boolean equals = "realname_verify_process".equals(jVar.e());
        np5.b0 b0Var = this.f420367b;
        if (equals) {
            b0Var.d(new ss4.w(z0Var, jVar.f295334c.getInt("entry_scene", -1), jVar.f295334c.getString("key_realname_sessionid")), true);
        } else {
            b0Var.d(new ss4.w(z0Var), true);
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof rs4.a;
        qs4.j jVar = this.f447951c;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindCardProcess", "verify code success!");
            jVar.f295334c.putString("kreq_token", ((rs4.a) m1Var).f480877e);
            return true;
        }
        if (!(m1Var instanceof ss4.w)) {
            return m1Var instanceof ys4.l;
        }
        jVar.F(this.f420367b);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641 c19093x748e2641 = ((ss4.w) m1Var).f493671d;
        if (c19093x748e2641 == null) {
            return false;
        }
        jVar.f295334c.putParcelable("key_bindcard_value_result", c19093x748e2641);
        return false;
    }
}

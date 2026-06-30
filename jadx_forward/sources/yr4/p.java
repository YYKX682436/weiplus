package yr4;

/* loaded from: classes9.dex */
public class p extends yr4.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yr4.u f546641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(yr4.u uVar, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, np5.b0 b0Var) {
        super(uVar, abstractActivityC22902xe37969e, b0Var);
        this.f546641c = uVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        at4.z0 z0Var = (at4.z0) objArr[1];
        yr4.u uVar = this.f546641c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) uVar.f295334c.getParcelable("key_orders");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", "WalletVerifyCodeUI onNext pay_flag : " + uVar.f295334c.getInt("key_pay_flag", 0));
        boolean z17 = uVar.f295334c.getBoolean("key_is_changing_balance_phone_num");
        int i17 = uVar.f295334c.getInt("key_pay_flag", 0);
        np5.b0 b0Var = this.f420367b;
        if (i17 == 1) {
            z0Var.f95555a = "1";
            if (z17) {
                b0Var.d(zr4.a.c(z0Var, c19099x8d444f05), true);
            } else {
                ds4.g d17 = zr4.a.d(z0Var, c19099x8d444f05);
                if (d17 != null) {
                    b0Var.d(d17, true);
                }
            }
            return true;
        }
        if (i17 == 2) {
            if (uVar.r()) {
                z0Var.f95555a = "5";
            } else {
                z0Var.f95555a = "2";
            }
            if (z17) {
                b0Var.d(zr4.a.c(z0Var, c19099x8d444f05), true);
            } else {
                ds4.g d18 = zr4.a.d(z0Var, c19099x8d444f05);
                if (d18 != null) {
                    b0Var.d(d18, true);
                }
            }
            return true;
        }
        if (i17 != 3) {
            return false;
        }
        if (uVar.r()) {
            z0Var.f95555a = "6";
        } else {
            z0Var.f95555a = "3";
        }
        if (z17) {
            b0Var.d(zr4.a.c(z0Var, c19099x8d444f05), true);
        } else {
            ds4.g d19 = zr4.a.d(z0Var, c19099x8d444f05);
            if (d19 != null) {
                b0Var.d(d19, true);
            }
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        if (!(m1Var instanceof ds4.g) && !(m1Var instanceof ds4.b)) {
            return m1Var instanceof as4.b;
        }
        ds4.g gVar = (ds4.g) m1Var;
        boolean z17 = gVar.f39883x9cd69705;
        yr4.u uVar = this.f546641c;
        if (z17) {
            uVar.f295334c.putParcelable("key_orders", gVar.f324459x);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = gVar.f295594s;
        if (c19088xa4b300c1 != null) {
            uVar.f295334c.putParcelable("key_realname_guide_helper", c19088xa4b300c1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10707, 1, java.lang.Integer.valueOf((int) ((java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.f262386a) / 1000)));
        return false;
    }

    @Override // np5.g
    public boolean f(java.lang.Object... objArr) {
        yr4.u uVar = this.f546641c;
        as4.b bVar = uVar.f546644e;
        if (bVar == null) {
            return false;
        }
        bVar.mo8969xc84d8c3b();
        this.f420367b.a(uVar.f546644e, false);
        return true;
    }
}

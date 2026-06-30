package yr4;

/* loaded from: classes9.dex */
public class o extends yr4.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yr4.u f546640c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yr4.u uVar, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, np5.b0 b0Var) {
        super(uVar, abstractActivityC22902xe37969e, b0Var);
        this.f546640c = uVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71) objArr[0];
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) objArr[1];
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WalletCardElementUI onNext pay_flag : ");
        yr4.u uVar = this.f546640c;
        sb6.append(uVar.f295334c.getInt("key_pay_flag", 0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayProcess", sb6.toString());
        int i17 = uVar.f295334c.getInt("key_pay_flag", 0);
        np5.b0 b0Var = this.f420367b;
        if (i17 == 1) {
            if (uVar.r()) {
                c19090x75920c71.f261075d = 4;
            } else {
                c19090x75920c71.f261075d = 1;
            }
            b0Var.d(new as4.b(c19090x75920c71, c19099x8d444f05, false), true);
            return true;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return false;
            }
            if (uVar.r()) {
                c19090x75920c71.f261075d = 6;
            } else {
                c19090x75920c71.f261075d = 3;
            }
            b0Var.d(new as4.b(c19090x75920c71, c19099x8d444f05, false), true);
            return true;
        }
        if (uVar.r()) {
            c19090x75920c71.f261075d = 5;
        } else {
            c19090x75920c71.f261075d = 2;
        }
        if (uVar.f295334c.getBoolean("key_is_changing_balance_phone_num", false)) {
            b0Var.d(zr4.a.b(c19090x75920c71, c19099x8d444f05, uVar.f295334c.getBoolean("key_isbalance", false)), true);
        } else {
            b0Var.d(new as4.b(c19090x75920c71, c19099x8d444f05, false), true);
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56;
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof as4.b;
        yr4.u uVar = this.f546640c;
        if (z17) {
            as4.b bVar = (as4.b) m1Var;
            uVar.f546644e = bVar;
            uVar.f295334c.putString("kreq_token", bVar.C);
            if (bVar.f39883x9cd69705) {
                uVar.f295334c.putParcelable("key_orders", bVar.A);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = bVar.f295594s;
            if (c19088xa4b300c1 != null) {
                uVar.f295334c.putParcelable("key_realname_guide_helper", c19088xa4b300c1);
            }
        } else if (m1Var instanceof as4.c) {
            as4.c cVar = (as4.c) m1Var;
            uVar.f546644e = cVar;
            uVar.f295334c.putString("kreq_token", cVar.C);
            if (cVar.f39883x9cd69705) {
                uVar.f295334c.putParcelable("key_orders", cVar.A);
            }
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        if (!uVar.t(abstractActivityC21394xb3d2c0cf, null)) {
            if (!z17 || !((as4.b) m1Var).f95081x) {
                uVar.o(abstractActivityC21394xb3d2c0cf, 0, uVar.f295334c);
            }
            return true;
        }
        android.os.Bundle bundle = uVar.f295334c;
        java.lang.String str2 = "";
        if (bundle != null && (c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) bundle.getParcelable("key_pay_info")) != null) {
            str2 = c19760x34448d56.f273647m;
        }
        this.f420367b.d(new ss4.e0(str2, 13), true);
        return true;
    }
}

package kt4;

/* loaded from: classes9.dex */
public class p extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kt4.r f393579c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kt4.r rVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f393579c = rVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        ((java.lang.Integer) objArr[0]).intValue();
        java.lang.String str = (java.lang.String) objArr[1];
        np5.b0 b0Var = this.f420367b;
        b0Var.c(2996);
        b0Var.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.f3(kt4.r.F(this.f393579c), str), true);
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.d dVar;
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.f3)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "openLqbAccount scene end, errType: %s, errCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.f3 f3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.f3) m1Var;
        android.os.Bundle bundle = new android.os.Bundle();
        kt4.r rVar = this.f393579c;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        if (i17 == 0 && i18 == 0) {
            r45.p15 p15Var = f3Var.f259165d;
            r45.ce4 ce4Var = p15Var.f464196f;
            if (ce4Var != null && (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19165x6de109a8) && (dVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19165x6de109a8) abstractActivityC21394xb3d2c0cf).f262569d) != null) {
                dVar.a(ce4Var, null);
            }
            if (p15Var.f464194d == 0) {
                rVar.f295334c.putBoolean("key_goto_lqt_detail", true);
                bundle.putInt("key_process_result_code", -1);
            } else if (p15Var.f464196f == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "toast: %s", p15Var.f464195e);
                dp.a.m125854x26a183b(abstractActivityC21394xb3d2c0cf, p15Var.f464195e, 1).show();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenECardProcess", "net error: %s", m1Var);
            db5.e1.F(abstractActivityC21394xb3d2c0cf, jt4.f.a(abstractActivityC21394xb3d2c0cf, str), "", false);
        }
        rVar.f(abstractActivityC21394xb3d2c0cf, bundle);
        return true;
    }
}

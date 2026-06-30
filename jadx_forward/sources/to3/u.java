package to3;

/* loaded from: classes9.dex */
public class u extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ to3.v f502516c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(to3.v vVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f502516c = vVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        return i17 != 0 ? i17 != 1 ? "" : abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575052kk4) : abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575053kk5);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        to3.v vVar = this.f502516c;
        vVar.f295334c.putString("key_pwd1", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c d17 = yo3.m.d(true);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflineProcess", "no support bank car for offline");
            ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().getClass();
            d17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().k(null, null, true, true);
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletUserInfoManger", "defaultBankcards == null");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = d17;
        if (c19091x9511676c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflineProcess", "no any bank car for offline");
            return false;
        }
        java.lang.String string = vVar.f295334c.getString("oper");
        boolean k17 = yo3.m.k();
        np5.b0 b0Var = this.f420367b;
        if (!k17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineProcess", "Offline is not Create ");
            b0Var.d(new wo3.k(c19091x9511676c, (java.lang.String) objArr[0], vVar.f295334c.getInt("offline_chg_fee", 0)), true);
        } else if (string != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineProcess", "oper == ".concat(string));
            if (string.equals("create")) {
                b0Var.d(new wo3.k(c19091x9511676c, (java.lang.String) objArr[0], vVar.f295334c.getInt("offline_chg_fee", 0)), true);
            } else if (string.equals("clr")) {
                b0Var.d(new wo3.i(c19091x9511676c, str, "clr", 0, ""), true);
            } else if (string.equals("changeto")) {
                b0Var.d(new wo3.i(c19091x9511676c, str, "changeto", vVar.f295334c.getInt("offline_chg_fee"), ""), true);
            } else {
                if (!string.equals("freeze")) {
                    return false;
                }
                b0Var.d(new wo3.o(str), true);
            }
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof wo3.k) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineProcess", "Offline Create is failed!");
                wo3.k kVar = (wo3.k) m1Var;
                if (i18 == 410) {
                    db5.e1.A(abstractActivityC21394xb3d2c0cf, str, "", abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575122kv1), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new to3.s(this, abstractActivityC21394xb3d2c0cf, kVar.f529714s), new to3.t(this, abstractActivityC21394xb3d2c0cf));
                    return true;
                }
            }
            return false;
        }
        boolean z17 = m1Var instanceof wo3.k;
        np5.b0 b0Var = this.f420367b;
        to3.v vVar = this.f502516c;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineProcess", "Offline is Create ");
            b0Var.d(new wo3.p(vVar.f295334c.getInt("offline_from_scene", -1), null, 8, 0, ""), true);
            vVar.f295334c.putBoolean("is_offline_create", true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22805, 3);
        } else if ((m1Var instanceof wo3.m) || (m1Var instanceof wo3.p)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineProcess", "OfflineQueryUser is ok ");
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf).m83134x2b33b77f(false);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184();
            c6243x5c461184.f136491g.f88748a = 8;
            c6243x5c461184.f136492h.f88825a = new to3.r(this);
            c6243x5c461184.e();
        } else if (m1Var instanceof wo3.i) {
            wo3.i iVar = (wo3.i) m1Var;
            if ("1".equals(iVar.f529699d)) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("key_authen", new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71());
                bundle.putString("key_pwd1", vVar.f295334c.getString("key_pwd1"));
                bundle.putString("key_mobile", iVar.f529700e);
                bundle.putInt("verify_scene", 1);
                bundle.putInt("offline_add_fee", vVar.f295334c.getInt("offline_chg_fee", 0));
                com.p314xaae8f345.mm.p2802xd031a825.a.j(abstractActivityC21394xb3d2c0cf, to3.f0.class, bundle, null);
                vVar.o(abstractActivityC21394xb3d2c0cf, 0, vVar.f295334c);
            } else {
                vVar.f295334c.putBoolean("back_to_coin_purse_ui", true);
                b0Var.d(new wo3.m("" + java.lang.System.currentTimeMillis(), vVar.f295334c.getInt("offline_from_scene", -1)), false);
            }
        } else if (m1Var instanceof wo3.o) {
            to3.c0.Ai().Vi(196631, "");
            to3.c0.Ai().Ri().f529678b = null;
            vVar.o(abstractActivityC21394xb3d2c0cf, 0, vVar.f295334c);
        }
        return true;
    }
}

package kt4;

/* loaded from: classes9.dex */
public class q extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kt4.r f393580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kt4.r rVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f393580c = rVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        return this.f420366a.getIntent().getStringExtra("key_open_card_verify_msg_desc");
    }

    @Override // np5.g
    public void b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "reqCode: %s, resCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f393580c.f(this.f420366a, new android.os.Bundle());
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        kt4.r rVar = this.f393580c;
        java.lang.String string = rVar.f295334c.getString("key_pwd1");
        java.lang.String string2 = rVar.f295334c.getString("key_verify_code");
        java.lang.String H = rVar.H();
        int i17 = rVar.f295334c.getInt("key_open_scene");
        jt4.g gVar = new jt4.g(kt4.r.F(rVar), H, string2, this.f420366a.getIntent().getStringExtra("key_open_card_bind_token"), string, i17);
        np5.b0 b0Var = this.f420367b;
        b0Var.c(1986);
        b0Var.e(gVar, true, 3, 0);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = m1Var instanceof jt4.g;
        np5.b0 b0Var = this.f420367b;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        if (z17) {
            b0Var.i(1986);
            jt4.g gVar = (jt4.g) m1Var;
            if (i17 == 0 && i18 == 0) {
                r45.qh qhVar = gVar.f383181f;
                if (qhVar.f465516d == 0) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    r45.x15 x15Var = gVar.f383181f.f465519g;
                    kt4.r rVar = this.f393580c;
                    if (x15Var != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "succ title: %s", x15Var.f471196d);
                        try {
                            rVar.f295334c.putByteArray("key_open_card_finish_title", gVar.f383181f.f465519g.mo14344x5f01b1f6());
                        } catch (java.io.IOException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenECardProcess", e17, "", new java.lang.Object[0]);
                        }
                    }
                    rVar.o(abstractActivityC21394xb3d2c0cf, 0, bundle);
                } else if (!jt4.f.c((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, qhVar.f465518f)) {
                    db5.e1.F(abstractActivityC21394xb3d2c0cf, jt4.f.a(abstractActivityC21394xb3d2c0cf, gVar.f383181f.f465517e, str), "", false);
                }
            }
            return true;
        }
        if (!(m1Var instanceof jt4.h)) {
            return false;
        }
        b0Var.i(com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27791x324eeed3);
        jt4.h hVar = (jt4.h) m1Var;
        if (i17 == 0 && i18 == 0) {
            r45.qz4 qz4Var = hVar.f383184f;
            if (qz4Var.f465899d == 0) {
                abstractActivityC21394xb3d2c0cf.getIntent().putExtra("key_open_card_bind_token", hVar.f383184f.f465902g);
            } else if (!jt4.f.c((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, qz4Var.f465904i)) {
                int i19 = hVar.f383188m;
                java.lang.String str2 = hVar.f383189n;
                r45.qz4 qz4Var2 = hVar.f383184f;
                if (!jt4.f.b((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, hVar, i19, str2, qz4Var2.f465899d, qz4Var2.f465900e)) {
                    db5.e1.F(abstractActivityC21394xb3d2c0cf, jt4.f.a(abstractActivityC21394xb3d2c0cf, hVar.f383184f.f465900e, hVar.f383189n, str), "", false);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenECardProcess", "net error: %s", hVar);
            db5.e1.F(abstractActivityC21394xb3d2c0cf, jt4.f.a(abstractActivityC21394xb3d2c0cf, str), "", false);
        }
        return true;
    }

    @Override // np5.g
    public boolean f(java.lang.Object... objArr) {
        jt4.h hVar;
        kt4.r rVar = this.f393580c;
        int i17 = rVar.f295334c.getInt("key_select_card_action");
        java.lang.String H = rVar.H();
        int i18 = rVar.f295334c.getInt("key_verify_scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "bind action: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 1) {
            hVar = new jt4.h(kt4.r.F(rVar), H, rVar.f295334c.getString("key_bind_card_no"), rVar.f295334c.getString("key_bind_mobile_no"), rVar.f295334c.getString("key_bind_bank_type"), rVar.G(), true, true, false, i18, "");
        } else {
            hVar = new jt4.h(kt4.r.F(rVar), H, rVar.f295334c.getString("key_bind_new_card_no"), rVar.f295334c.getString("key_bind_new_card_mobile"), rVar.f295334c.getString("key_bind_new_card_bank_type"), rVar.G(), false, true, false, i18, "");
        }
        np5.b0 b0Var = this.f420367b;
        b0Var.c(com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27791x324eeed3);
        b0Var.a(hVar, true);
        return true;
    }
}

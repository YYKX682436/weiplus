package kt4;

/* loaded from: classes9.dex */
public class b extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kt4.r f393561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kt4.r rVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f393561c = rVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.String str2 = (java.lang.String) objArr[1];
        kt4.r rVar = this.f393561c;
        rVar.f295334c.putString("key_bind_new_card_no", str);
        rVar.f295334c.putString("key_bind_new_card_mobile", str2);
        this.f420367b.a(new ss4.z("", str, null), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = m1Var instanceof ss4.z;
        np5.b0 b0Var = this.f420367b;
        kt4.r rVar = this.f393561c;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        if (z17) {
            ss4.z zVar = (ss4.z) m1Var;
            if (i17 == 0 && i18 == 0) {
                android.os.Bundle bundle = new android.os.Bundle();
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = zVar.f493681e;
                if (c19097xe6dc5b4c == null || !c19097xe6dc5b4c.f261189p) {
                    bundle.putBoolean("key_check_other_card_need_input_card_elem", true);
                    rVar.o(abstractActivityC21394xb3d2c0cf, 0, bundle);
                } else {
                    java.lang.String string = rVar.f295334c.getString("key_bind_new_card_no");
                    java.lang.String string2 = rVar.f295334c.getString("key_bind_new_card_mobile");
                    java.lang.String str2 = zVar.f493681e.f261192s;
                    rVar.f295334c.putString("key_bind_new_card_bank_type", str2);
                    b0Var.c(com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27791x324eeed3);
                    b0Var.a(new jt4.h(kt4.r.F(rVar), rVar.H(), string, string2, str2, rVar.G(), false, false, 0, ""), true);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenECardProcess", "net error: %s", zVar);
                db5.e1.F(abstractActivityC21394xb3d2c0cf, jt4.f.a(abstractActivityC21394xb3d2c0cf, str), "", false);
            }
        } else if (m1Var instanceof jt4.h) {
            b0Var.i(com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27791x324eeed3);
            jt4.h hVar = (jt4.h) m1Var;
            if (i17 == 0 && i18 == 0) {
                r45.qz4 qz4Var = hVar.f383184f;
                if (qz4Var.f465899d == 0) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putBoolean("key_check_other_card_need_input_card_elem", false);
                    r45.x15 x15Var = hVar.f383184f.f465905m;
                    if (x15Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x15Var.f471196d)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "need verfiy sms");
                        bundle2.putBoolean("key_need_verify_sms", true);
                        bundle2.putString("key_open_card_bind_token", hVar.f383184f.f465902g);
                        bundle2.putString("key_open_card_verify_msg_desc", hVar.f383184f.f465903h);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "no need verify sms");
                        bundle2.putBoolean("key_need_verify_sms", false);
                        try {
                            rVar.f295334c.putByteArray("key_open_card_finish_title", hVar.f383184f.f465905m.mo14344x5f01b1f6());
                        } catch (java.io.IOException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenECardProcess", e17, "", new java.lang.Object[0]);
                        }
                    }
                    rVar.o(abstractActivityC21394xb3d2c0cf, 0, bundle2);
                } else if (!jt4.f.c((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, qz4Var.f465904i)) {
                    int i19 = hVar.f383188m;
                    java.lang.String str3 = hVar.f383189n;
                    r45.qz4 qz4Var2 = hVar.f383184f;
                    if (!jt4.f.b((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, hVar, i19, str3, qz4Var2.f465899d, qz4Var2.f465900e)) {
                        db5.e1.F(abstractActivityC21394xb3d2c0cf, jt4.f.a(abstractActivityC21394xb3d2c0cf, hVar.f383184f.f465900e, hVar.f383189n, str), "", false);
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenECardProcess", "net error: %s", hVar);
                db5.e1.F(abstractActivityC21394xb3d2c0cf, jt4.f.a(abstractActivityC21394xb3d2c0cf, str), "", false);
            }
            return true;
        }
        return false;
    }
}

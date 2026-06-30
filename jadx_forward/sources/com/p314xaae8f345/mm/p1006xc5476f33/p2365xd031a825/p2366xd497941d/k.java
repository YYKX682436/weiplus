package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class k extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a f260935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f260935c = aVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        at4.z0 z0Var = (at4.z0) objArr[0];
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar = this.f260935c;
        java.lang.String string = aVar.f295334c.getString("key_real_name_token");
        java.lang.String string2 = aVar.f295334c.getString("realname_verify_process_face_token");
        java.lang.String string3 = aVar.f295334c.getString("key_realname_sessionid");
        boolean z17 = aVar.f295334c.getBoolean("key_marketing_switch_closed", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19087x5acf574b c19087x5acf574b = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2367x633fb29.C19087x5acf574b) aVar.f295334c.getParcelable("realname_verify_process_bundle");
        if (z0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z0Var.f95556b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RealNameVerifyProcess", "get pwd error");
        } else {
            boolean containsKey = aVar.f295334c.containsKey("kreq_token");
            np5.b0 b0Var = this.f420367b;
            if (containsKey) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "bindcard verify");
                b0Var.a(new rs4.b(z0Var, aVar.f295334c.getInt("entry_scene", -1), string3, c19087x5acf574b), true);
            } else {
                b0Var.a(new ys4.f(1, z0Var.f95556b, string, string2, aVar.f295334c.getInt("entry_scene", -1), string3, c19087x5acf574b, z17), true);
            }
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = m1Var instanceof ys4.f;
        np5.b0 b0Var = this.f420367b;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar = this.f260935c;
        if (z17) {
            if (i17 == 0 && i18 == 0) {
                ys4.f fVar = (ys4.f) m1Var;
                if (fVar.f546764g == 0) {
                    aVar.f295334c.putInt("realname_verify_process_ret", -1);
                }
                aVar.f295334c.putString("realname_verify_process_finish_title", fVar.f546761d);
                aVar.f295334c.putString("realname_verify_process_finish_desc", fVar.f546762e);
                aVar.f295334c.putString("realname_verify_process_finish_page", fVar.f546763f);
                aVar.f295334c.putInt("realname_verify_process_finish_err_jump", fVar.f546764g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "real name reg succ ,update user info");
                ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().B();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184();
                c6243x5c461184.f136491g.f88748a = 16;
                c6243x5c461184.f273897d = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.i(this);
                c6243x5c461184.e();
                aVar.F(b0Var);
                if (aVar.f260848e == 2) {
                    aVar.f(abstractActivityC21394xb3d2c0cf, aVar.f295334c);
                    return true;
                }
                aVar.o(abstractActivityC21394xb3d2c0cf, 0, aVar.f295334c);
                return true;
            }
        } else {
            if (!(m1Var instanceof rs4.b)) {
                return m1Var instanceof ys4.l;
            }
            if (i17 == 0 && i18 == 0) {
                rs4.b bVar = (rs4.b) m1Var;
                if (bVar.f480883h == 0) {
                    aVar.f295334c.putInt("realname_verify_process_ret", -1);
                }
                aVar.f295334c.putString("realname_verify_process_finish_title", bVar.f480880e);
                aVar.f295334c.putString("realname_verify_process_finish_desc", bVar.f480881f);
                aVar.f295334c.putString("realname_verify_process_finish_page", bVar.f480882g);
                aVar.f295334c.putInt("realname_verify_process_finish_err_jump", bVar.f480883h);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "bind card verify succ ,update user info");
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641 c19093x748e2641 = bVar.f480879d;
                if (c19093x748e2641 != null) {
                    aVar.f295334c.putParcelable("key_bindcard_value_result", c19093x748e2641);
                }
                ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().B();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c4611842 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184();
                c6243x5c4611842.f136491g.f88748a = 16;
                c6243x5c4611842.f273897d = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.j(this);
                c6243x5c4611842.e();
                aVar.F(b0Var);
                if (aVar.f260848e == 2) {
                    aVar.f(abstractActivityC21394xb3d2c0cf, aVar.f295334c);
                    return true;
                }
                aVar.o(abstractActivityC21394xb3d2c0cf, 0, aVar.f295334c);
                return true;
            }
        }
        return false;
    }
}

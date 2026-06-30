package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class p extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a f260988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f260988c = aVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        return this.f420366a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0h);
    }

    @Override // np5.g
    public void b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "onActivityResult: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 1 || i18 != -1 || intent == null || intent.getExtras() == null) {
            return;
        }
        java.lang.String string = intent.getExtras().getString("token");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar = this.f260988c;
        aVar.f295334c.putString("realname_verify_process_face_token", string);
        aVar.o(this.f420366a, 0, aVar.f295334c);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar = this.f260988c;
        aVar.a("WalletVerifyCodeUI onNext", objArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "onNext, do bind verify!");
        at4.z0 z0Var = (at4.z0) objArr[1];
        if (!((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() || "rename".equals(aVar.f295334c.getString("key_realname_scene"))) {
            z0Var.f95555a = "1";
        } else {
            z0Var.f95555a = "2";
        }
        this.f420367b.d(new ss4.w(z0Var, aVar.f295334c.getInt("entry_scene", -1), aVar.f295334c.getString("key_realname_sessionid")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof rs4.a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar = this.f260988c;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "verify code success!");
                aVar.f295334c.putString("kreq_token", ((rs4.a) m1Var).f480877e);
                return true;
            }
            if (m1Var instanceof ss4.w) {
                aVar.F(this.f420367b);
                ss4.w wVar = (ss4.w) m1Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641 c19093x748e2641 = wVar.f493671d;
                if (c19093x748e2641 != null) {
                    aVar.f295334c.putParcelable("key_bindcard_value_result", c19093x748e2641);
                }
                aVar.f295334c.putString("key_resetpwd", wVar.f493672e);
                boolean z18 = aVar.f295334c.getBoolean("realname_verify_process_need_face", false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "forward: %s", java.lang.Boolean.valueOf(z18));
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
                if (z18) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5925x646e9c76 c5925x646e9c76 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5925x646e9c76();
                    am.jr jrVar = c5925x646e9c76.f136227g;
                    jrVar.f88609j = abstractActivityC21394xb3d2c0cf;
                    jrVar.f88600a = (int) aVar.f295334c.getLong("realname_verify_process_face_scene");
                    jrVar.f88601b = aVar.f295334c.getString("realname_verify_process_face_package");
                    jrVar.f88602c = aVar.f295334c.getString("realname_verify_process_face_package_sign");
                    jrVar.f88607h = 1;
                    c5925x646e9c76.e();
                } else {
                    aVar.o(abstractActivityC21394xb3d2c0cf, 0, aVar.f295334c);
                }
                return true;
            }
            if (m1Var instanceof ys4.l) {
                return true;
            }
        }
        return false;
    }
}

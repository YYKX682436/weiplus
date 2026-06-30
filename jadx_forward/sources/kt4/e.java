package kt4;

/* loaded from: classes9.dex */
public class e extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kt4.r f393564c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kt4.r rVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f393564c = rVar;
    }

    @Override // np5.g
    public void b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "reqCode: %s, resCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_process_result_code", 0);
        this.f393564c.f(this.f420366a, bundle);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        kt4.r rVar = this.f393564c;
        int i17 = rVar.f295334c.getInt("key_open_scene");
        np5.b0 b0Var = this.f420367b;
        b0Var.c(1958);
        b0Var.a(new jt4.i(kt4.r.F(rVar), str, i17, null), true);
        rVar.f295334c.putString("key_pwd1", str);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof jt4.i)) {
            return false;
        }
        this.f420367b.i(1958);
        jt4.i iVar = (jt4.i) m1Var;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        if (i17 == 0 && i18 == 0) {
            r45.oz4 oz4Var = iVar.f383192f;
            if (oz4Var.f464156d == 0) {
                android.os.Bundle bundle = new android.os.Bundle();
                r45.oz4 oz4Var2 = iVar.f383192f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenECardProcess", "req_serial: %s, is_reuse_existing_ecard: %s", oz4Var2.f464159g, java.lang.Boolean.valueOf(oz4Var2.f464162m));
                kt4.r rVar = this.f393564c;
                rVar.f295334c.putString("key_req_serial", iVar.f383192f.f464159g);
                if (iVar.f383192f.f464162m) {
                    bundle.putBoolean("key_is_reuse_existing_ecard", true);
                }
                rVar.o(abstractActivityC21394xb3d2c0cf, 0, bundle);
            } else if (!jt4.f.c((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, oz4Var.f464160h)) {
                int i19 = iVar.f383193g;
                java.lang.String str2 = iVar.f383194h;
                r45.oz4 oz4Var3 = iVar.f383192f;
                if (!jt4.f.b((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf, iVar, i19, str2, oz4Var3.f464156d, oz4Var3.f464157e)) {
                    db5.e1.G(abstractActivityC21394xb3d2c0cf, jt4.f.a(abstractActivityC21394xb3d2c0cf, iVar.f383192f.f464157e, iVar.f383194h, str), "", false, new kt4.c(this));
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenECardProcess", "net error: %s", iVar);
            db5.e1.G(abstractActivityC21394xb3d2c0cf, jt4.f.a(abstractActivityC21394xb3d2c0cf, str), "", false, new kt4.d(this));
        }
        return true;
    }
}

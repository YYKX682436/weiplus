package lz2;

/* loaded from: classes9.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final pz2.a f403876a;

    /* renamed from: b, reason: collision with root package name */
    public final mz2.s1 f403877b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f403878c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d f403879d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f403880e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d activityC15521xdb435b6d) {
        this.f403879d = activityC15521xdb435b6d;
        this.f403878c = activityC15521xdb435b6d.f218516f == 0 ? activityC15521xdb435b6d.m83108x2b5a5a39().f295334c : activityC15521xdb435b6d.getIntent().getExtras();
        this.f403877b = new mz2.s1();
        this.f403876a = (pz2.a) gm0.j1.s(pz2.a.class);
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdAuthUI", "do face id auth");
        mz2.e1 e1Var = (mz2.e1) i95.n0.c(mz2.e1.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("face_auth_scene", 0);
        ((mz2.j2) e1Var).wi(this.f403879d, new lz2.m(this), bundle);
    }

    public abstract void b();

    public abstract int c();

    public abstract boolean d();

    public abstract void e();

    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d activityC15521xdb435b6d = this.f403879d;
        pz2.a aVar = this.f403876a;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletFaceIdAuthUI", "no mgr");
            activityC15521xdb435b6d.U6(activityC15521xdb435b6d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8v));
            return;
        }
        boolean Rb = aVar.Rb();
        boolean a17 = aVar.a1();
        boolean z17 = wo.v1.f529359f.f529400a != 1;
        android.os.Bundle bundle = this.f403878c;
        if (!Rb || !a17 || z17 || bundle == null) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Boolean.valueOf(Rb);
            objArr[1] = java.lang.Boolean.valueOf(a17);
            objArr[2] = java.lang.Boolean.valueOf(z17);
            objArr[3] = java.lang.Boolean.valueOf(bundle == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletFaceIdAuthUI", "support: %s, enrolled: %s, forceClose: %s, data: %s", objArr);
            activityC15521xdb435b6d.U6(activityC15521xdb435b6d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8v));
            return;
        }
        java.lang.String string = bundle.getString("pwd");
        this.f403880e = string;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletFaceIdAuthUI", "no pwd");
            activityC15521xdb435b6d.U6(activityC15521xdb435b6d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8v));
        } else {
            ju5.n.c().b();
            b();
        }
    }

    public abstract void g();

    public abstract void h();

    public abstract boolean i(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var);
}

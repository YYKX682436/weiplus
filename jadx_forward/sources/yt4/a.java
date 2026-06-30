package yt4;

/* loaded from: classes9.dex */
public abstract class a extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f547281c;

    public a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var, android.os.Bundle bundle) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f547281c = bundle;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        android.os.Bundle bundle = this.f547281c;
        bundle.putString("key_pwd1", str);
        this.f420367b.a(new yt4.c(bundle.getString("key_pwd1")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof yt4.c)) {
            return false;
        }
        yt4.c cVar = (yt4.c) m1Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f547282d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CommonCheckPwdController", "hy: check pwd failed");
            return false;
        }
        java.lang.String str2 = cVar.f547282d;
        android.os.Bundle bundle = this.f547281c;
        bundle.putString("payu_reference", str2);
        com.p314xaae8f345.mm.p2802xd031a825.a.d(this.f420366a, bundle);
        return false;
    }
}

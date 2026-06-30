package fs4;

/* loaded from: classes9.dex */
public class k extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fs4.m f347877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(fs4.m mVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f347877c = mVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        at4.z0 z0Var = (at4.z0) objArr[0];
        this.f347877c.f295334c.getString("key_pwd1");
        this.f420367b.d(new gs4.t(z0Var.f95556b, z0Var.f95558d), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        if (i17 != 0 || i18 != 0) {
            if (!(m1Var instanceof gs4.t)) {
                return false;
            }
            db5.e1.G(abstractActivityC21394xb3d2c0cf, str, "", false, new fs4.j(this));
            return true;
        }
        if (m1Var instanceof gs4.t) {
            fs4.m mVar = this.f347877c;
            mVar.f295334c.putInt("RESET_PWD_USER_ACTION", 1);
            mVar.o(abstractActivityC21394xb3d2c0cf, 0, mVar.f295334c);
            db5.e1.T(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ku6));
        }
        return true;
    }
}

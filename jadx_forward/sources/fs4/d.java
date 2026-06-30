package fs4;

/* loaded from: classes9.dex */
public class d extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fs4.h f347870c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fs4.h hVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f347870c = hVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        return this.f420366a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0n);
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        at4.z0 z0Var = (at4.z0) objArr[1];
        z0Var.f95555a = "3";
        this.f420367b.d(new gs4.u(z0Var), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof gs4.s)) {
            return false;
        }
        this.f347870c.f295334c.putString("kreq_token", ((gs4.s) m1Var).f356669e);
        return true;
    }

    @Override // np5.g
    public boolean f(java.lang.Object... objArr) {
        fs4.h hVar = this.f347870c;
        gs4.s sVar = hVar.f347875e;
        if (sVar == null) {
            return true;
        }
        sVar.mo8969xc84d8c3b();
        this.f420367b.a(hVar.f347875e, false);
        return true;
    }
}

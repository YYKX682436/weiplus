package yt4;

/* loaded from: classes9.dex */
public class e extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yt4.f f547283c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yt4.f fVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f547283c = fVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        this.f420367b.a(new yt4.d(this.f547283c.f295334c.getString("payu_reference"), ((at4.z0) objArr[0]).f95556b), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof yt4.d) || i17 != 0 || i18 != 0) {
            return false;
        }
        yt4.f fVar = this.f547283c;
        fVar.f295334c.putInt("key_errcode_payu", 0);
        com.p314xaae8f345.mm.p2802xd031a825.a.c(this.f420366a, fVar.f295334c, 0);
        return true;
    }
}

package to3;

/* loaded from: classes9.dex */
public class g extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ to3.i f502498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(to3.i iVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f502498c = iVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        at4.z0 z0Var = (at4.z0) objArr[1];
        z0Var.f95555a = "2";
        this.f420367b.d(new ss4.w(z0Var), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof ss4.e0;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        if (!z17) {
            if (!(m1Var instanceof wo3.k)) {
                return false;
            }
            com.p314xaae8f345.mm.p2802xd031a825.a.d(abstractActivityC21394xb3d2c0cf, ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf).m83105x7498fe14());
            yo3.m.v(abstractActivityC21394xb3d2c0cf);
            return true;
        }
        if (((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf).m83105x7498fe14() == null || ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf).m83105x7498fe14().getInt("key_bind_scene", -1) != 5 || yo3.m.k()) {
            return false;
        }
        to3.i.H(this.f502498c, abstractActivityC21394xb3d2c0cf);
        return true;
    }
}

package y80;

/* loaded from: classes10.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y80.k0 f541394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.EnumC24638xd3e3395f f541395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y80.p1 f541396f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(y80.k0 k0Var, long j17, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.EnumC24638xd3e3395f enumC24638xd3e3395f, y80.p1 p1Var) {
        super(1);
        this.f541394d = k0Var;
        this.f541395e = enumC24638xd3e3395f;
        this.f541396f = p1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        y80.p1 p1Var = this.f541396f;
        y80.k0 k0Var = this.f541394d;
        if (booleanValue) {
            k0Var.getClass();
            y80.j0 j0Var = new y80.j0(k0Var, p1Var);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getUserCurrentLocationWithPermissionGranted: start ");
            com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.EnumC24638xd3e3395f enumC24638xd3e3395f = this.f541395e;
            sb6.append(enumC24638xd3e3395f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f541405d, sb6.toString());
            if (enumC24638xd3e3395f == com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.EnumC24638xd3e3395f.f44098x4081570) {
                ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                i11.h.e().j(j0Var, false);
            } else {
                ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                i11.h.e().k(j0Var, false);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f541405d, "getUserCurrentLocationWithPermissionNotGranted: ");
            p1Var.a(null);
        }
        return jz5.f0.f384359a;
    }
}

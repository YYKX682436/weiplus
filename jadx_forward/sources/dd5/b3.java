package dd5;

/* loaded from: classes4.dex */
public final class b3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310628d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f310628d = f9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dd5.b3(this.f310628d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dd5.b3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f310628d;
        java.lang.String tj6 = ((k90.b) u0Var).tj(f9Var, f9Var.z0(), false);
        android.database.Cursor Ai = ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).Ai(f9Var.z0(), new java.lang.String[]{"videolength"});
        if (Ai != null) {
            try {
                r2 = Ai.moveToFirst() ? Ai.getInt(0) : 0;
                vz5.b.a(Ai, null);
            } finally {
            }
        }
        return new jz5.l(tj6, new java.lang.Integer(r2));
    }
}

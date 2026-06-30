package du0;

/* loaded from: classes5.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f324967d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f324968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ du0.t0 f324969f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(du0.t0 t0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f324969f = t0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        du0.s0 s0Var = new du0.s0(this.f324969f, interfaceC29045xdcb5ca57);
        s0Var.f324968e = obj;
        return s0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.s0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f324967d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f324968e;
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.q7.c("MaasCache") + "/MovieComposing/", "materials");
            if (!r6Var.m()) {
                r6Var.J();
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            du0.t0 t0Var = this.f324969f;
            java.util.List i18 = kz5.c0.i(p3325xe03a0797.p3326xc267989b.l.b(y0Var, p0Var, null, new du0.p0(t0Var, r6Var, null), 2, null), p3325xe03a0797.p3326xc267989b.l.b(y0Var, p0Var, null, new du0.q0(t0Var, r6Var, null), 2, null), p3325xe03a0797.p3326xc267989b.l.b(y0Var, p0Var, null, new du0.r0(t0Var, r6Var, null), 2, null));
            this.f324967d = 1;
            if (p3325xe03a0797.p3326xc267989b.h.a(i18, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}

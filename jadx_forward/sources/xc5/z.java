package xc5;

/* loaded from: classes12.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.h0 f535134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f535135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(xc5.h0 h0Var, mf3.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f535134d = h0Var;
        this.f535135e = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc5.z(this.f535134d, this.f535135e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xc5.z zVar = (xc5.z) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        zVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xc5.h0 h0Var = this.f535134d;
        h0Var.f535000y = false;
        lg3.a aVar2 = h0Var.f534998w;
        if (aVar2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar2).h(this.f535135e, new vf3.f(vf3.e.f517915i, null, 0, 0.0f, 14, null));
        }
        h0Var.a0();
        return jz5.f0.f384359a;
    }
}

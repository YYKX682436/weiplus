package ze5;

/* loaded from: classes9.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.n8 f553491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ze5.n0 f553492e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ze5.n8 n8Var, ze5.n0 n0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f553491d = n8Var;
        this.f553492e = n0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ze5.h0(this.f553491d, this.f553492e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ze5.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f553491d.f553644c;
        if (abstractC11172x705e5905 == null) {
            return null;
        }
        i95.m c17 = i95.n0.c(c00.z2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c00.z2 z2Var = (c00.z2) c17;
        bw5.u8 u8Var = this.f553492e.f553635t;
        if (u8Var != null) {
            ((b00.r) z2Var).f98290d.getClass();
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10520x8a9df0c0 c10520x8a9df0c0 = abstractC11172x705e5905 instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10520x8a9df0c0 ? (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10520x8a9df0c0) abstractC11172x705e5905 : null;
            if (c10520x8a9df0c0 != null) {
                c10520x8a9df0c0.j(u8Var);
            }
        }
        return jz5.f0.f384359a;
    }
}

package e22;

/* loaded from: classes14.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f328155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e22.d1 f328156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(e22.d1 d1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f328156e = d1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new e22.b1(this.f328156e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((e22.b1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f328155d;
        e22.d1 d1Var = this.f328156e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            e22.g gVar = new e22.g(2, null, d1Var.f328167e, 0, 0, 24, null);
            this.f328155d = 1;
            obj = rm0.h.b(gVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ((n0.q4) d1Var.f328168f).mo148714x53d8522f(java.lang.Boolean.valueOf(((r45.nw0) fVar.f152151d).m75939xb282bd08(2) == 0));
        if (fVar.b()) {
            x0.i0 i0Var = d1Var.f328170h;
            java.util.LinkedList m75941xfb821914 = ((r45.nw0) fVar.f152151d).m75941xfb821914(3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
            i0Var.addAll(e22.d1.N6(d1Var, m75941xfb821914));
            ot5.g.c("MicroMsg.FindersFeedViewModel", "next, isEnded: " + d1Var.f328168f);
            d1Var.f328167e = ((r45.nw0) fVar.f152151d).m75934xbce7f2f(1);
        }
        ((n0.q4) d1Var.f328169g).mo148714x53d8522f(java.lang.Boolean.FALSE);
        return jz5.f0.f384359a;
    }
}

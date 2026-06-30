package nu0;

/* loaded from: classes5.dex */
public final class w3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f421663d;

    /* renamed from: e, reason: collision with root package name */
    public int f421664e;

    public w3(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nu0.w3(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new nu0.w3((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f421664e;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i95.m mVar = (i95.m) this.f421663d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return mVar;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        i95.m c17 = i95.n0.c(pp0.q0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pp0.q0.od((pp0.q0) c17, false, 1, null);
        this.f421663d = c17;
        this.f421664e = 1;
        java.lang.Object g17 = az0.i5.f97090a.g(this);
        if (g17 != aVar) {
            g17 = jz5.f0.f384359a;
        }
        return g17 == aVar ? aVar : c17;
    }
}

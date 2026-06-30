package u5;

/* loaded from: classes14.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f506255d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f506256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u5.s f506257f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u5.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f506257f = sVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        u5.q qVar = new u5.q(this.f506257f, interfaceC29045xdcb5ca57);
        qVar.f506256e = obj;
        return qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((u5.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f506255d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f506256e;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            u5.s sVar = this.f506257f;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.f2 f2Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.f2(n0.s4.f(new u5.m(sVar)), n0.s4.f(new u5.n(sVar)), u5.o.f506251n);
            u5.p pVar = new u5.p(h0Var, sVar, y0Var);
            this.f506255d = 1;
            if (f2Var.a(pVar, this) == aVar) {
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

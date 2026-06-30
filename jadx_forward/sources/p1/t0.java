package p1;

/* loaded from: classes10.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f432428d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1.q0 f432430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f432431g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(p1.q0 q0Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f432430f = q0Var;
        this.f432431g = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p1.t0 t0Var = new p1.t0(this.f432430f, this.f432431g, interfaceC29045xdcb5ca57);
        t0Var.f432429e = obj;
        return t0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((p1.t0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f432428d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f432429e;
            p1.q0 q0Var = this.f432430f;
            q0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y0Var, "<set-?>");
            q0Var.f432406p = y0Var;
            this.f432428d = 1;
            if (this.f432431g.mo149xb9724478(q0Var, this) == aVar) {
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

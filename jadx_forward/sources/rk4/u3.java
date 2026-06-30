package rk4;

/* loaded from: classes11.dex */
public final class u3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f478539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk4.v3 f478540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.j20 f478541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f478542g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(rk4.v3 v3Var, bw5.j20 j20Var, java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478540e = v3Var;
        this.f478541f = j20Var;
        this.f478542g = map;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rk4.u3(this.f478540e, this.f478541f, this.f478542g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.u3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f478539d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            pi0.l1 l1Var = this.f478540e.f478553e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l1Var);
            java.lang.String b17 = this.f478541f.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getRouterName(...)");
            this.f478539d = 1;
            if (l1Var.o(b17, this.f478542g, this) == aVar) {
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

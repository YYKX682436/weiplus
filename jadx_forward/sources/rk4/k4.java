package rk4;

/* loaded from: classes2.dex */
public final class k4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f478312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk4.l4 f478313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478315g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(rk4.l4 l4Var, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478313e = l4Var;
        this.f478314f = str;
        this.f478315g = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rk4.k4(this.f478313e, this.f478314f, this.f478315g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.k4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f478312d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f478312d = 1;
            this.f478313e.getClass();
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            new rk4.t3(this.f478315g).l().q(new rk4.i4(new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), rVar, this.f478314f));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}

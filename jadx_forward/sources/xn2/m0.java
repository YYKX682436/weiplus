package xn2;

/* loaded from: classes2.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f537061d;

    /* renamed from: e, reason: collision with root package name */
    public int f537062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f537063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f537064g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, xn2.p0 p0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f537063f = c0Var;
        this.f537064g = p0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xn2.m0(this.f537063f, this.f537064g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xn2.m0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f537062e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = this.f537063f;
            this.f537061d = c0Var2;
            this.f537062e = 1;
            java.lang.Object c17 = xn2.p0.c(this.f537064g, this);
            if (c17 == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
            obj = c17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.c0) this.f537061d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        c0Var.f391645d = ((java.lang.Boolean) obj).booleanValue();
        return jz5.f0.f384359a;
    }
}

package eg2;

/* loaded from: classes3.dex */
public final class z0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f334185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg2.b1 f334186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334187f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(eg2.b1 b1Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f334186e = b1Var;
        this.f334187f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new eg2.z0(this.f334186e, this.f334187f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((eg2.z0) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f334185d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            eg2.o0 o0Var = eg2.o0.f334138a;
            eg2.b1 b1Var = this.f334186e;
            java.lang.String str = b1Var.f334071f;
            java.lang.String str2 = this.f334187f;
            int i18 = b1Var.f334074i;
            this.f334185d = 1;
            obj = o0Var.a(str, str2, null, i18, 2, this);
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

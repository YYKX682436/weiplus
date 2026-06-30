package eg2;

/* loaded from: classes3.dex */
public final class q0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f334148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334150f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f334151g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(java.lang.String str, java.lang.String str2, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f334149e = str;
        this.f334150f = str2;
        this.f334151g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new eg2.q0(this.f334149e, this.f334150f, this.f334151g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((eg2.q0) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f334148d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            eg2.o0 o0Var = eg2.o0.f334138a;
            java.lang.String str = this.f334149e;
            java.lang.String str2 = this.f334150f;
            int i18 = this.f334151g;
            this.f334148d = 1;
            obj = o0Var.a(str, str2, null, i18, 1, this);
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

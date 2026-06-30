package qg5;

/* loaded from: classes8.dex */
public final class i4 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f444552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qg5.q4 f444553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444554f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(qg5.q4 q4Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f444553e = q4Var;
        this.f444554f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qg5.i4(this.f444553e, this.f444554f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((qg5.i4) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f444552d;
        qg5.q4 q4Var = this.f444553e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ct.q2 V6 = q4Var.V6();
            this.f444552d = 1;
            obj = ((qg5.l0) V6).nj(this.f444554f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ((java.lang.Boolean) obj).booleanValue();
        ((qg5.l0) q4Var.V6()).ij();
        return obj;
    }
}

package te2;

/* loaded from: classes3.dex */
public final class s6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f499939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499940e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(te2.p8 p8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499940e = p8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.s6(this.f499940e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.s6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f499939d;
        te2.p8 p8Var = this.f499940e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f499939d = 1;
            obj = te2.p8.O6(p8Var, false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            db5.t7.h(p8Var.m80379x76847179(), p8Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e09));
            p8Var.C1 = true;
        }
        te2.p8.x7(p8Var, false, null, 2, null);
        te2.p8.X6(p8Var, false, 1, null);
        return jz5.f0.f384359a;
    }
}

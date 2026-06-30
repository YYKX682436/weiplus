package te2;

/* loaded from: classes3.dex */
public final class r5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f499913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f499915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f499916g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(te2.p8 p8Var, r45.h32 h32Var, java.lang.Integer num, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499914e = p8Var;
        this.f499915f = h32Var;
        this.f499916g = num;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.r5(this.f499914e, this.f499915f, this.f499916g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.r5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.h32 h32Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f499913d;
        te2.p8 p8Var = this.f499914e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.h32 h32Var2 = p8Var.A1.f499924b;
            if (h32Var2 != null) {
                h32Var2.set(18, java.lang.Integer.valueOf(this.f499915f.m75939xb282bd08(18)));
            }
            this.f499913d = 1;
            obj = te2.p8.T6(p8Var, 0, this, 1, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (!((java.lang.Boolean) obj).booleanValue() && (h32Var = p8Var.A1.f499924b) != null) {
            java.lang.Integer num = this.f499916g;
            h32Var.set(18, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        }
        te2.p8.x7(p8Var, false, null, 2, null);
        return jz5.f0.f384359a;
    }
}

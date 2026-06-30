package ro5;

/* loaded from: classes14.dex */
public final class q extends qz5.l implements yz5.v {

    /* renamed from: d, reason: collision with root package name */
    public int f479810d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ int f479811e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ int f479812f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f479813g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ int f479814h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ boolean f479815i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ boolean f479816m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ro5.b0 f479817n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ro5.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(8, interfaceC29045xdcb5ca57);
        this.f479817n = b0Var;
    }

    @Override // yz5.v
    public java.lang.Object D(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        int intValue3 = ((java.lang.Number) obj4).intValue();
        int intValue4 = ((java.lang.Number) obj5).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj6).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj7).booleanValue();
        ro5.q qVar = new ro5.q(this.f479817n, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj8);
        qVar.f479811e = intValue;
        qVar.f479812f = intValue2;
        qVar.f479813g = intValue3;
        qVar.f479814h = intValue4;
        qVar.f479815i = booleanValue;
        qVar.f479816m = booleanValue2;
        return qVar.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f479810d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = this.f479811e;
            int i19 = this.f479812f;
            int i27 = this.f479813g;
            int i28 = this.f479814h;
            boolean z17 = this.f479815i;
            boolean z18 = this.f479816m;
            ro5.b0 b0Var = this.f479817n;
            b0Var.f479688l = 0;
            ro5.m1 m1Var = b0Var.f479678b;
            if (m1Var != null) {
                er4.r rVar = b0Var.f479679c;
                this.f479810d = 1;
                if (m1Var.d(i18, i19, i27, i28, z17, rVar, z18, this) == aVar) {
                    return aVar;
                }
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

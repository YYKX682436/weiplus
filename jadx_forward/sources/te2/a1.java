package te2;

/* loaded from: classes3.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f499384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f499385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f499386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f499387g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(te2.p1 p1Var, boolean z17, dk2.vg vgVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f499385e = p1Var;
        this.f499386f = z17;
        this.f499387g = vgVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.a1(this.f499385e, this.f499386f, this.f499387g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.a1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f499384d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            te2.p1 p1Var = this.f499385e;
            int i18 = this.f499386f ? 3 : 1;
            dk2.vg vgVar = this.f499387g;
            java.lang.Integer num = new java.lang.Integer(vgVar.f315787a.m75939xb282bd08(0));
            r45.rm1 g17 = dk2.q.g(vgVar.f315787a);
            this.f499384d = 1;
            if (te2.p1.A(p1Var, i18, num, g17, 0, this, 8, null) == aVar) {
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

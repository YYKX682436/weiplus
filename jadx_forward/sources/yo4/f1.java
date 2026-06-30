package yo4;

/* loaded from: classes10.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f545742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f f545743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f545744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f545745g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer[] f545746h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f, java.util.List list, java.util.List list2, java.lang.Integer[] numArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545743e = c18795x62fd7c3f;
        this.f545744f = list;
        this.f545745g = list2;
        this.f545746h = numArr;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yo4.f1(this.f545743e, this.f545744f, this.f545745g, this.f545746h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yo4.f1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f545742d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var = this.f545743e.G;
            java.util.List z07 = kz5.z.z0(this.f545746h);
            this.f545742d = 1;
            java.util.List list = this.f545744f;
            java.util.List list2 = this.f545745g;
            u0Var.getClass();
            obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.t0(u0Var, list, list2, z07, null), this);
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

package ro2;

/* loaded from: classes2.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f479608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f479609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f479610f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f479611g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f479612h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f479613i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f479614m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f479615n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.graphics.Bitmap bitmap, android.content.Context context, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f479609e = bitmap;
        this.f479610f = context;
        this.f479611g = i17;
        this.f479612h = i18;
        this.f479613i = abstractC14490x69736cb5;
        this.f479614m = qeVar;
        this.f479615n = s0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ro2.o(this.f479609e, this.f479610f, this.f479611g, this.f479612h, this.f479613i, this.f479614m, this.f479615n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ro2.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f479608d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            ro2.n nVar = new ro2.n(this.f479609e, this.f479610f, this.f479611g, this.f479612h, this.f479613i, this.f479614m, this.f479615n, null);
            this.f479608d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, nVar, this) == aVar) {
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

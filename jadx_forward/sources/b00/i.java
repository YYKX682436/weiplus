package b00;

/* loaded from: classes9.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f98215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b00.r f98216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f98217f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f98218g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f98219h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bw5.x8 f98220i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b00.r rVar, android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, bw5.x8 x8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f98216e = rVar;
        this.f98217f = context;
        this.f98218g = str;
        this.f98219h = f9Var;
        this.f98220i = x8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b00.i(this.f98216e, this.f98217f, this.f98218g, this.f98219h, this.f98220i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b00.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f98215d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b00.r rVar = this.f98216e;
            android.content.Context context = this.f98217f;
            java.lang.String str = this.f98218g;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f98219h;
            bw5.x8 x8Var = this.f98220i;
            this.f98215d = 1;
            if (rVar.hj(context, str, f9Var, x8Var, this) == aVar) {
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

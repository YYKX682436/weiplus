package nl4;

/* loaded from: classes11.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f419755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nl4.r f419756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419758g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f419759h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(nl4.r rVar, java.lang.String str, java.lang.String str2, bw5.lp0 lp0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f419756e = rVar;
        this.f419757f = str;
        this.f419758g = str2;
        this.f419759h = lp0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nl4.p(this.f419756e, this.f419757f, this.f419758g, this.f419759h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nl4.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f419755d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            nl4.r rVar = this.f419756e;
            long c17 = r26.q0.c(this.f419757f);
            java.lang.String str = this.f419758g;
            bw5.gq0 e17 = this.f419759h.e();
            this.f419755d = 1;
            obj = nl4.r.q(rVar, c17, str, e17, this);
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

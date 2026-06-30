package mx0;

/* loaded from: classes5.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f413649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 f413650f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f413651g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f413652h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(mx0.e1 e1Var, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117, boolean z17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413649e = e1Var;
        this.f413650f = c4084x74642117;
        this.f413651g = z17;
        this.f413652h = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.l0(this.f413649e, this.f413650f, this.f413651g, this.f413652h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.l0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413648d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f413649e.f413473g = this.f413650f.m33714x2e400754();
            if (this.f413649e.f413469c && this.f413651g && !this.f413649e.f413470d) {
                mx0.e1 e1Var = this.f413649e;
                this.f413648d = 1;
                if (mx0.e1.c(e1Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f413652h.mo146xb9724478(java.lang.Boolean.valueOf(this.f413651g));
        return jz5.f0.f384359a;
    }
}

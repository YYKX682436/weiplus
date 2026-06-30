package rp4;

/* loaded from: classes10.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f480221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839 f480222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f480223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f480224g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer[] f480225h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839 c18821x16ce7839, java.util.List list, java.util.List list2, java.lang.Integer[] numArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f480222e = c18821x16ce7839;
        this.f480223f = list;
        this.f480224g = list2;
        this.f480225h = numArr;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rp4.u(this.f480222e, this.f480223f, this.f480224g, this.f480225h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rp4.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f480221d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.C18821x16ce7839 c18821x16ce7839 = this.f480222e;
            c18821x16ce7839.getMediaModel().f(this.f480223f, this.f480224g, kz5.z.z0(this.f480225h));
            c18821x16ce7839.getMediaModel().e(rp4.w.f480227d);
            c18821x16ce7839.getMediaModel().b();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            rp4.t tVar = new rp4.t(c18821x16ce7839, null);
            this.f480221d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, tVar, this) == aVar) {
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

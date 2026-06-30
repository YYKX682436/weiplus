package hq0;

/* loaded from: classes7.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f364498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f364500f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(long j17, hq0.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f364499e = j17;
        this.f364500f = b0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hq0.a0(this.f364499e, this.f364500f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hq0.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f364498d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long e17 = s26.a.e(this.f364499e);
            this.f364498d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(e17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (!this.f364500f.Q) {
            this.f364500f.mo123041x5cd39ffa();
        }
        java.lang.String str = this.f364500f.f364504y;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initBiz timeout (");
        sb6.append((java.lang.Object) s26.a.h(this.f364499e));
        sb6.append("), isDestroyBiz:");
        sb6.append(!this.f364500f.Q);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        return jz5.f0.f384359a;
    }
}

package df2;

/* loaded from: classes3.dex */
public final class ee extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.qe f311587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vm1 f311588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f311589f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(df2.qe qeVar, r45.vm1 vm1Var, java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311587d = qeVar;
        this.f311588e = vm1Var;
        this.f311589f = obj;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.ee(this.f311587d, this.f311588e, this.f311589f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ee) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g b76 = this.f311587d.b7();
        if (b76 == null) {
            return null;
        }
        b76.A1(this.f311588e, this.f311589f, true);
        return jz5.f0.f384359a;
    }
}

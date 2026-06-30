package vo4;

/* loaded from: classes10.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.b f520203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f520204e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(vo4.b bVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f520203d = bVar;
        this.f520204e = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vo4.q(this.f520203d, this.f520204e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vo4.q qVar = (vo4.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        qVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPreloadMaterials, play: ");
        vo4.b bVar = this.f520203d;
        sb6.append(bVar.f520138d.f257243c);
        sb6.append(", texture:");
        sb6.append(bVar.f520135a);
        sb6.append(", pts:");
        sb6.append(this.f520204e);
        sb6.append(", startTime:");
        sb6.append(bVar.f520138d.f257241a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogScriptReader", sb6.toString());
        if (!bVar.f520149o) {
            bVar.c();
        }
        bVar.d(0L);
        bVar.b(0L, false);
        return jz5.f0.f384359a;
    }
}

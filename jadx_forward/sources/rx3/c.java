package rx3;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f482548d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f482549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox3.a f482550f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx3.h f482551g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ox3.a aVar, rx3.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f482550f = aVar;
        this.f482551g = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        rx3.c cVar = new rx3.c(this.f482550f, this.f482551g, interfaceC29045xdcb5ca57);
        cVar.f482549e = obj;
        return cVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f482548d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f482549e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindDataSource, requestExclusive is ");
            ox3.a aVar2 = this.f482550f;
            sb6.append(aVar2.f431254d.f497124g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExclusiveRemoteDataSource", sb6.toString());
            rx3.b bVar = new rx3.b(aVar2, kVar, this.f482551g, null);
            this.f482548d = 1;
            if (p3325xe03a0797.p3326xc267989b.a4.b(2000L, bVar, this) == aVar) {
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

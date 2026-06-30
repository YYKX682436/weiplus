package qu2;

/* loaded from: classes12.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f448319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qu2.k f448320e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(qu2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f448320e = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qu2.j(this.f448320e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qu2.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f448319d;
        qu2.k kVar = this.f448320e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kVar.f448325e = true;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = kVar.f448322b;
            if (r2Var != null) {
                this.f448319d = 1;
                if (p3325xe03a0797.p3326xc267989b.v2.d(r2Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ts5.b bVar = kVar.f448323c;
        if (bVar != null) {
            ou2.c cVar = (ou2.c) bVar;
            nu2.e.a(cVar.f430462b, cVar.f430463c, cVar.f430461a, false, 4, null);
        }
        return jz5.f0.f384359a;
    }
}

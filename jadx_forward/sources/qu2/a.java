package qu2;

/* loaded from: classes7.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f448279d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f448280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qu2.b f448281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qu2.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f448281f = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        qu2.a aVar = new qu2.a(this.f448281f, interfaceC29045xdcb5ca57);
        aVar.f448280e = obj;
        return aVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qu2.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f448279d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f448280e;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f448280e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        while (p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            this.f448281f.c();
            long j17 = r3.f448290i * 1000;
            this.f448280e = y0Var;
            this.f448279d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}

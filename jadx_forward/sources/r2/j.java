package r2;

/* loaded from: classes14.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f450253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f450254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r2.o f450255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f450256g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z17, r2.o oVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f450254e = z17;
        this.f450255f = oVar;
        this.f450256g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new r2.j(this.f450254e, this.f450255f, this.f450256g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((r2.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f450253d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean z17 = this.f450254e;
            r2.o oVar = this.f450255f;
            if (z17) {
                o1.e eVar = oVar.f450264d;
                long j17 = this.f450256g;
                int i18 = p2.w.f432938c;
                long j18 = p2.w.f432937b;
                this.f450253d = 2;
                if (eVar.a(j17, j18, this) == aVar) {
                    return aVar;
                }
            } else {
                o1.e eVar2 = oVar.f450264d;
                int i19 = p2.w.f432938c;
                long j19 = p2.w.f432937b;
                long j27 = this.f450256g;
                this.f450253d = 1;
                if (eVar2.a(j19, j27, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}

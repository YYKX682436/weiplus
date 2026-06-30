package ay1;

/* loaded from: classes2.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f96735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ay1.l f96736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f96737f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ay1.l lVar, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f96736e = lVar;
        this.f96737f = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ay1.c(this.f96736e, this.f96737f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ay1.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f96735d;
        ay1.l lVar = this.f96736e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            oz5.l f93115e = lVar.d().getF93115e();
            ay1.b bVar = new ay1.b(lVar, this.f96737f, null);
            this.f96735d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(f93115e, bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        lVar.f96763f = null;
        return jz5.f0.f384359a;
    }
}

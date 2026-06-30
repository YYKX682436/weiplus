package rx3;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f482561d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f482562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f482563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx3.h f482564g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.util.List list, rx3.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f482563f = list;
        this.f482564g = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        rx3.g gVar = new rx3.g(this.f482563f, this.f482564g, interfaceC29045xdcb5ca57);
        gVar.f482562e = obj;
        return gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f482561d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rx3.f fVar = new rx3.f(this.f482563f, (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f482562e, this.f482564g, new java.util.ArrayList(), null);
            this.f482561d = 1;
            if (p3325xe03a0797.p3326xc267989b.a4.c(5000L, fVar, this) == aVar) {
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

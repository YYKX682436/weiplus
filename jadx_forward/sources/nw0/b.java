package nw0;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422283d;

    /* renamed from: e, reason: collision with root package name */
    public int f422284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw0.h f422285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422286g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(nw0.h hVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f422285f = hVar;
        this.f422286g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nw0.b(this.f422285f, this.f422286g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nw0.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        nw0.h hVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f422284e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kw0.b bVar = kw0.b.f394324e;
            nw0.h hVar2 = this.f422285f;
            this.f422283d = hVar2;
            this.f422284e = 1;
            obj = nw0.h.a(hVar2, bVar, this.f422286g, this);
            if (obj == aVar) {
                return aVar;
            }
            hVar = hVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (nw0.h) this.f422283d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        zu0.k kVar = (zu0.k) obj;
        hVar.getClass();
        int i18 = kVar.f557214a;
        kw0.b bVar2 = kw0.b.f394324e;
        zu0.h hVar3 = kVar.f557215b;
        if (i18 == 3) {
            hVar.f422302c.mo523x53d8522f(hVar3);
        } else if (i18 == 2) {
            hVar.f422303d.mo523x53d8522f(hVar3);
        }
        return jz5.f0.f384359a;
    }
}

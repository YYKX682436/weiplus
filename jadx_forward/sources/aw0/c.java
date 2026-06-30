package aw0;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f96005d;

    /* renamed from: e, reason: collision with root package name */
    public int f96006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aw0.f f96007f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(aw0.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f96007f = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aw0.c(this.f96007f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aw0.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        aw0.f fVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f96006e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            vv0.b bVar = vv0.b.f521904d;
            aw0.f fVar2 = this.f96007f;
            this.f96005d = fVar2;
            this.f96006e = 1;
            obj = aw0.f.a(fVar2, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
            fVar = fVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (aw0.f) this.f96005d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        zu0.k kVar = (zu0.k) obj;
        fVar.getClass();
        if (kVar.f557214a == 5) {
            fVar.f96014c.mo523x53d8522f(kVar.f557215b);
        }
        return jz5.f0.f384359a;
    }
}

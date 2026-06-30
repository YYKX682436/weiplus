package kw1;

/* loaded from: classes14.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394346d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f394347e;

    /* renamed from: f, reason: collision with root package name */
    public int f394348f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kw1.k f394349g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kw1.o f394350h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kw1.k kVar, kw1.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f394349g = kVar;
        this.f394350h = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kw1.b(this.f394349g, this.f394350h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kw1.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        rw1.a aVar;
        kw1.n nVar;
        pz5.a aVar2 = pz5.a.f440719d;
        int i17 = this.f394348f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kw1.k kVar = this.f394349g;
            rw1.a aVar3 = kVar.f394388e;
            kw1.o oVar = this.f394350h;
            kw1.n nVar2 = (kw1.n) oVar;
            qw1.j jVar = kVar.f394386c;
            java.lang.String str = ((kw1.n) oVar).f394391a;
            this.f394346d = aVar3;
            this.f394347e = nVar2;
            this.f394348f = 1;
            obj = jVar.c(str, this);
            if (obj == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            nVar = nVar2;
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (kw1.n) this.f394347e;
            aVar = (rw1.a) this.f394346d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        qw1.e yuvTextureGroupWrapper = (qw1.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yuvTextureGroupWrapper, "yuvTextureGroupWrapper");
        rw1.b bVar = new rw1.b(nVar.f394394c, nVar.f394392b, yuvTextureGroupWrapper);
        this.f394346d = null;
        this.f394347e = null;
        this.f394348f = 2;
        obj = aVar.c(bVar, this);
        return obj == aVar2 ? aVar2 : obj;
    }
}

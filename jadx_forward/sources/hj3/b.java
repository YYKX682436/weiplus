package hj3;

/* loaded from: classes14.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f363128d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f363129e;

    /* renamed from: f, reason: collision with root package name */
    public int f363130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hj3.m f363131g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hj3.r f363132h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hj3.m mVar, hj3.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363131g = mVar;
        this.f363132h = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hj3.b(this.f363131g, this.f363132h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hj3.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        oj3.a aVar;
        hj3.q qVar;
        pz5.a aVar2 = pz5.a.f440719d;
        int i17 = this.f363130f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            hj3.m mVar = this.f363131g;
            oj3.a aVar3 = mVar.f363180e;
            hj3.r rVar = this.f363132h;
            hj3.q qVar2 = (hj3.q) rVar;
            nj3.j jVar = mVar.f363178c;
            java.lang.String str = ((hj3.q) rVar).f363184a;
            this.f363128d = aVar3;
            this.f363129e = qVar2;
            this.f363130f = 1;
            obj = jVar.c(str, this);
            if (obj == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            qVar = qVar2;
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = (hj3.q) this.f363129e;
            aVar = (oj3.a) this.f363128d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        nj3.e yuvTextureGroupWrapper = (nj3.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yuvTextureGroupWrapper, "yuvTextureGroupWrapper");
        oj3.b bVar = new oj3.b(qVar.f363190c, qVar.f363185b, yuvTextureGroupWrapper);
        this.f363128d = null;
        this.f363129e = null;
        this.f363130f = 2;
        obj = aVar.c(bVar, this);
        return obj == aVar2 ? aVar2 : obj;
    }
}

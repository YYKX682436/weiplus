package hj3;

/* loaded from: classes14.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363137d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lj3.c f363139f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hj3.m f363140g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hj3.r f363141h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(lj3.c cVar, hj3.m mVar, hj3.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363139f = cVar;
        this.f363140g = mVar;
        this.f363141h = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        hj3.d dVar = new hj3.d(this.f363139f, this.f363140g, this.f363141h, interfaceC29045xdcb5ca57);
        dVar.f363138e = obj;
        return dVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hj3.d) mo148xaf65a0fc((jj3.c) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f363137d;
        if (i17 != 0) {
            if (i17 == 1) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return (kj3.f) obj;
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return null;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jj3.d a17 = ((jj3.c) this.f363138e).a();
        if (a17 != null) {
            lj3.c cVar = this.f363139f;
            hj3.m mVar = this.f363140g;
            if (cVar == null) {
                kj3.d dVar = mVar.f363182g;
                hj3.p pVar = (hj3.p) this.f363141h;
                android.util.Size drawSize = a17.getSize();
                mj3.g renderInfo = pVar.f363185b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize, "drawSize");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderInfo, "renderInfo");
                kj3.e eVar = new kj3.e(renderInfo, drawSize, pVar.f363187c.f375928e, true);
                this.f363137d = 1;
                obj = dVar.c(eVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                return (kj3.f) obj;
            }
            kj3.d dVar2 = mVar.f363182g;
            android.util.Size drawSize2 = a17.getSize();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize2, "drawSize");
            mj3.g renderInfo2 = cVar.f400508b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderInfo2, "renderInfo");
            kj3.e eVar2 = new kj3.e(renderInfo2, drawSize2, cVar.f400509c, false);
            this.f363137d = 2;
            if (dVar2.c(eVar2, this) == aVar) {
                return aVar;
            }
        }
        return null;
    }
}

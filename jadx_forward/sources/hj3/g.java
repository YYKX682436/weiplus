package hj3;

/* loaded from: classes14.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363151d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hj3.m f363153f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nj3.c f363154g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hj3.m mVar, nj3.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363153f = mVar;
        this.f363154g = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        hj3.g gVar = new hj3.g(this.f363153f, this.f363154g, interfaceC29045xdcb5ca57);
        gVar.f363152e = obj;
        return gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hj3.g) mo148xaf65a0fc((jj3.c) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f363151d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            jj3.d a17 = ((jj3.c) this.f363152e).a();
            if (a17 == null) {
                return null;
            }
            kj3.d dVar = this.f363153f.f363182g;
            android.util.Size drawSize = a17.getSize();
            nj3.c cVar = this.f363154g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<this>");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize, "drawSize");
            mj3.g gVar = cVar.f419426c;
            if (gVar == null) {
                gVar = new mj3.g(0, 0, 0, false, false, 24, null);
            }
            kj3.e eVar = new kj3.e(gVar, drawSize, cVar.f419425b.f375928e, true);
            this.f363151d = 1;
            obj = dVar.c(eVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return (kj3.f) obj;
    }
}

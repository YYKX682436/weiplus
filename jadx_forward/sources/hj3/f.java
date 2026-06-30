package hj3;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363147d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hj3.m f363149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nj3.f f363150g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(hj3.m mVar, nj3.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363149f = mVar;
        this.f363150g = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        hj3.f fVar = new hj3.f(this.f363149f, this.f363150g, interfaceC29045xdcb5ca57);
        fVar.f363148e = obj;
        return fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hj3.f) mo148xaf65a0fc((jj3.c) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object c17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f363147d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            jj3.d a17 = ((jj3.c) this.f363148e).a();
            is0.c cVar = null;
            if (a17 == null) {
                return null;
            }
            kj3.d dVar = this.f363149f.f363182g;
            android.util.Size drawSize = a17.getSize();
            nj3.f fVar = this.f363150g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize, "drawSize");
            mj3.g gVar = fVar.f419440e;
            if (gVar == null) {
                gVar = new mj3.g(0, 0, 0, false, false, 24, null);
            }
            if (fVar.f419438c) {
                nj3.d dVar2 = fVar.f419437b;
                if (dVar2.f419428b) {
                    cVar = dVar2.f419427a;
                }
            }
            kj3.e eVar = new kj3.e(gVar, drawSize, cVar != null ? cVar.f375928e : 0, false);
            this.f363147d = 1;
            c17 = dVar.c(eVar, this);
            if (c17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c17 = obj;
        }
        return (kj3.f) c17;
    }
}

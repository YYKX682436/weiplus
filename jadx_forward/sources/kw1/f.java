package kw1;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394363d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kw1.k f394365f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qw1.c f394366g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kw1.k kVar, qw1.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f394365f = kVar;
        this.f394366g = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        kw1.f fVar = new kw1.f(this.f394365f, this.f394366g, interfaceC29045xdcb5ca57);
        fVar.f394364e = obj;
        return fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kw1.f) mo148xaf65a0fc((mw1.b) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f394363d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mw1.c a17 = ((mw1.b) this.f394364e).a();
            if (a17 == null) {
                return null;
            }
            nw1.d dVar = this.f394365f.f394390g;
            android.util.Size drawSize = ((com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3) a17).m54521x356c92ad();
            qw1.c cVar = this.f394366g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<this>");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize, "drawSize");
            pw1.g gVar = cVar.f448612c;
            if (gVar == null) {
                gVar = new pw1.g(0, 0, 0, false, 0, 24, null);
            }
            nw1.e eVar = new nw1.e(gVar, drawSize, cVar.f448611b.f375928e, true);
            this.f394363d = 1;
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
        return (nw1.f) obj;
    }
}

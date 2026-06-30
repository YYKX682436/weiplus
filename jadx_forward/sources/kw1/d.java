package kw1;

/* loaded from: classes14.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394355d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kw1.k f394357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kw1.o f394358g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kw1.k kVar, kw1.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f394357f = kVar;
        this.f394358g = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        kw1.d dVar = new kw1.d(this.f394357f, this.f394358g, interfaceC29045xdcb5ca57);
        dVar.f394356e = obj;
        return dVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kw1.d) mo148xaf65a0fc((mw1.b) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f394355d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mw1.c a17 = ((mw1.b) this.f394356e).a();
            if (a17 == null) {
                return null;
            }
            nw1.d dVar = this.f394357f.f394390g;
            kw1.m mVar = (kw1.m) this.f394358g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3 b3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b3) a17;
            android.util.Size drawSize = b3Var.m54521x356c92ad();
            pw1.g a18 = pw1.g.a(mVar.f394392b, 0, 0, 0, false, b3Var.m54525x8f7ec8ee(), 15, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mVar, "<this>");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize, "drawSize");
            nw1.e eVar = new nw1.e(a18, drawSize, mVar.f394393c.f375928e, true);
            this.f394355d = 1;
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

package z;

/* loaded from: classes14.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f550205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f550206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z.e f550207f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f550208g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f550209h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.Object obj, z.e eVar, n0.e5 e5Var, n0.e5 e5Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f550206e = obj;
        this.f550207f = eVar;
        this.f550208g = e5Var;
        this.f550209h = e5Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new z.h(this.f550206e, this.f550207f, this.f550208g, this.f550209h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((z.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f550205d;
        z.e eVar = this.f550207f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f550206e, ((n0.q4) eVar.f550167e).mo128745x754a37bb())) {
                z.e eVar2 = this.f550207f;
                java.lang.Object obj2 = this.f550206e;
                z.p1 p1Var = z.j.f550236a;
                z.p pVar = (z.p) this.f550208g.mo128745x754a37bb();
                this.f550205d = 1;
                if (z.e.c(eVar2, obj2, pVar, null, null, this, 12, null) == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        z.p1 p1Var2 = z.j.f550236a;
        yz5.l lVar = (yz5.l) this.f550209h.mo128745x754a37bb();
        if (lVar != null) {
            lVar.mo146xb9724478(eVar.d());
        }
        return jz5.f0.f384359a;
    }
}

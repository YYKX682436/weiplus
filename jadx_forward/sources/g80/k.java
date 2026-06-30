package g80;

/* loaded from: classes12.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f351010d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f351011e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f351012f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f351013g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f351014h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f351015i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f351016m;

    /* renamed from: n, reason: collision with root package name */
    public int f351017n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s70.d f351018o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ s70.g f351019p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.List f351020q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s70.d f351021r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s70.d f351022s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f351023t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s70.d f351024u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j15.d f351025v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s70.d dVar, s70.g gVar, java.util.List list, s70.d dVar2, s70.d dVar3, boolean z17, s70.d dVar4, j15.d dVar5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f351018o = dVar;
        this.f351019p = gVar;
        this.f351020q = list;
        this.f351021r = dVar2;
        this.f351022s = dVar3;
        this.f351023t = z17;
        this.f351024u = dVar4;
        this.f351025v = dVar5;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new g80.k(this.f351018o, this.f351019p, this.f351020q, this.f351021r, this.f351022s, this.f351023t, this.f351024u, this.f351025v, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g80.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f351017n;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        s70.d dVar = this.f351018o;
        s70.g gVar = this.f351019p;
        java.util.List<s70.d> list = this.f351020q;
        s70.d dVar2 = this.f351021r;
        boolean z17 = this.f351023t;
        s70.d dVar3 = this.f351024u;
        j15.d dVar4 = this.f351025v;
        this.f351010d = dVar;
        this.f351011e = gVar;
        this.f351012f = list;
        this.f351013g = dVar2;
        s70.d dVar5 = this.f351022s;
        this.f351014h = dVar5;
        this.f351015i = dVar3;
        this.f351016m = dVar4;
        this.f351017n = 1;
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
        rVar.k();
        g80.j jVar = new g80.j(gVar, dVar3, dVar4, dVar, list, dVar2, z17, rVar);
        z25.f fVar = new z25.f();
        fVar.f551325c = jVar;
        fVar.f551324b = 1;
        fVar.f551327e = dVar.f485463g;
        if (gVar.f485482f == 1) {
            for (s70.d dVar6 : list) {
                if (dVar6.f485458b == s70.c.f485453h) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((s70.d) obj2).f485458b == s70.c.f485455m) {
                            break;
                        }
                    }
                    s70.d dVar7 = (s70.d) obj2;
                    fVar.f551323a = 1;
                    fVar.f551328f = dVar2.f485463g;
                    fVar.f551329g = dVar2.f485464h;
                    fVar.f551326d = dVar6.f485463g;
                    if (dVar5 != null && dVar7 != null) {
                        fVar.f551330h = dVar5.f485463g;
                        fVar.f551331i = dVar7.f485463g;
                        fVar.f551323a = 25;
                        fVar.f551339q = 2;
                    }
                }
            }
            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
        }
        fVar.f551323a = 2;
        java.lang.String str = dVar2.f485463g;
        fVar.f551328f = str;
        fVar.f551329g = dVar2.f485464h;
        fVar.f551326d = str;
        if (dVar5 != null) {
            fVar.f551330h = dVar5.f485463g;
            fVar.f551323a = 24;
            fVar.f551339q = 1;
        }
        fVar.f551338p = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        ((o25.t) ((p25.f) i95.n0.c(p25.f.class))).getClass();
        z25.d dVar8 = new z25.d();
        dVar8.f551321m = z17;
        dVar8.d(fVar);
        rVar.m(new g80.i(gVar, dVar8));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar2 = pz5.a.f440719d;
        return j17 == aVar ? aVar : j17;
    }
}

package ut;

/* loaded from: classes12.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f512302d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f512303e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f512304f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f512305g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f512306h;

    /* renamed from: i, reason: collision with root package name */
    public int f512307i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f512308m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v05.b f512309n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f512310o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ oi3.g f512311p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f512312q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f512313r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f512314s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(boolean z17, v05.b bVar, ut.q0 q0Var, oi3.g gVar, java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f512308m = z17;
        this.f512309n = bVar;
        this.f512310o = q0Var;
        this.f512311p = gVar;
        this.f512312q = str;
        this.f512313r = dVar;
        this.f512314s = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ut.x(this.f512308m, this.f512309n, this.f512310o, this.f512311p, this.f512312q, this.f512313r, this.f512314s, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        z25.d dVar;
        java.lang.String str;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f512307i;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        v05.b bVar = this.f512309n;
        ut.q0 q0Var = this.f512310o;
        oi3.g gVar = this.f512311p;
        java.lang.String str3 = this.f512312q;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = this.f512313r;
        long j17 = this.f512314s;
        this.f512302d = bVar;
        this.f512303e = q0Var;
        this.f512304f = gVar;
        this.f512305g = str3;
        this.f512306h = dVar2;
        this.f512307i = 1;
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
        rVar.k();
        ((o25.t) ((p25.f) i95.n0.c(p25.f.class))).getClass();
        z25.d dVar3 = new z25.d();
        ut.w wVar = new ut.w(q0Var, gVar, rVar, str3, bVar, dVar2, dVar3, j17);
        if (this.f512308m) {
            v05.a aVar2 = (v05.a) bVar.m75936x14adae67(bVar.f513848e + 8);
            java.lang.String str4 = "";
            if (aVar2 == null || (str = aVar2.m75945x2fec8307(aVar2.f449897d + 3)) == null) {
                str = "";
            }
            ut.j jVar = q0Var.f512245o.f512266q;
            if (jVar != null && (str2 = jVar.f512178a) != null) {
                str4 = str2;
            }
            dVar = dVar3;
            dVar.f551316h = str4;
            dVar.f551318j = str;
        } else {
            dVar = dVar3;
        }
        z25.f fVar = new z25.f();
        fVar.f551325c = wVar;
        fVar.f551332j = gVar.m75942xfb822ef2(gVar.f427150d + 0);
        fVar.f551337o = gVar.m75945x2fec8307(gVar.f427150d + 3);
        fVar.f551324b = 3;
        fVar.f551323a = 5;
        fVar.f551326d = str3;
        fVar.f551338p = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        dVar.d(fVar);
        rVar.m(new ut.v(q0Var, dVar));
        java.lang.Object j18 = rVar.j();
        return j18 == aVar ? aVar : j18;
    }
}

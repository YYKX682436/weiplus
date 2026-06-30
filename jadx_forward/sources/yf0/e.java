package yf0;

/* loaded from: classes12.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f543064d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f543065e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f543066f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f543067g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f543068h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f543069i;

    /* renamed from: m, reason: collision with root package name */
    public int f543070m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f543071n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f543072o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f543073p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f543074q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ yf0.f f543075r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f543076s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ oi3.h f543077t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z17, t21.v2 v2Var, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yf0.f fVar, java.util.Map map, oi3.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f543071n = z17;
        this.f543072o = v2Var;
        this.f543073p = str;
        this.f543074q = h0Var;
        this.f543075r = fVar;
        this.f543076s = map;
        this.f543077t = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yf0.e(this.f543071n, this.f543072o, this.f543073p, this.f543074q, this.f543075r, this.f543076s, this.f543077t, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf0.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f543070m;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f543071n;
        t21.v2 v2Var = this.f543072o;
        java.lang.String str = this.f543073p;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f543074q;
        yf0.f fVar = this.f543075r;
        java.util.Map map = this.f543076s;
        oi3.h hVar = this.f543077t;
        this.f543064d = v2Var;
        this.f543065e = str;
        this.f543066f = h0Var;
        this.f543067g = fVar;
        this.f543068h = map;
        this.f543069i = hVar;
        this.f543070m = 1;
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
        rVar.k();
        ((o25.t) ((p25.f) i95.n0.c(p25.f.class))).getClass();
        z25.d dVar = new z25.d();
        yf0.d dVar2 = new yf0.d(fVar, z17, rVar, v2Var, h0Var, str, map, dVar, hVar);
        if (!z17) {
            v2Var.f496556u = -1;
            v2Var.f496544i = 104;
            v2Var.f496539d = 0;
            v2Var.U = 524552;
            vf0.m3.k(v2Var);
            ((f65.u) ((wf0.c2) i95.n0.c(wf0.c2.class))).wi(v2Var.d(), wf0.e2.f527037e);
        }
        z25.f fVar2 = new z25.f();
        fVar2.f551332j = v2Var.f496549n;
        fVar2.f551337o = v2Var.h();
        fVar2.f551324b = 2;
        fVar2.f551323a = 4;
        fVar2.f551326d = str;
        if (!z17) {
            fVar2.f551327e = (java.lang.String) h0Var.f391656d;
        }
        fVar2.f551325c = dVar2;
        dVar.d(fVar2);
        dVar.f551322n = z17;
        rVar.m(new yf0.c(fVar, z17, dVar));
        java.lang.Object j17 = rVar.j();
        return j17 == aVar ? aVar : j17;
    }
}

package zf0;

/* loaded from: classes11.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f553966d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f553967e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f553968f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f553969g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f553970h;

    /* renamed from: i, reason: collision with root package name */
    public int f553971i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vf0.o2 f553972m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c01.f7 f553973n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553974o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f553975p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f553976q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f553977r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vf0.o2 o2Var, c01.f7 f7Var, java.lang.String str, zf0.v0 v0Var, java.util.Map map, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f553972m = o2Var;
        this.f553973n = f7Var;
        this.f553974o = str;
        this.f553975p = v0Var;
        this.f553976q = map;
        this.f553977r = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zf0.i(this.f553972m, this.f553973n, this.f553974o, this.f553975p, this.f553976q, this.f553977r, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zf0.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.r rVar;
        zf0.v0 v0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f553971i;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        vf0.o2 o2Var = this.f553972m;
        java.lang.String str = this.f553974o;
        zf0.v0 v0Var2 = this.f553975p;
        java.util.Map map = this.f553976q;
        long j17 = this.f553977r;
        this.f553966d = o2Var;
        c01.f7 f7Var = this.f553973n;
        this.f553967e = f7Var;
        this.f553968f = str;
        this.f553969g = v0Var2;
        this.f553970h = map;
        this.f553971i = 1;
        p3325xe03a0797.p3326xc267989b.r rVar2 = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
        rVar2.k();
        zf0.h hVar = new zf0.h(v0Var2, str, rVar2, o2Var);
        zf0.g gVar = new zf0.g(v0Var2, str, map, rVar2, o2Var, j17);
        if (o2Var == vf0.o2.f517776e) {
            rVar = rVar2;
            v0Var = v0Var2;
            ((a82.u1) ((o72.q4) i95.n0.c(o72.q4.class))).Di(f7Var.u(), f7Var.w(), f7Var.n(), f7Var.l(), f7Var.x(), str, "", hVar, gVar);
        } else {
            rVar = rVar2;
            v0Var = v0Var2;
            ((a82.u1) ((o72.q4) i95.n0.c(o72.q4.class))).Di(f7Var.r(), f7Var.q(), f7Var.k(), f7Var.j(), f7Var.o(), str, "", hVar, gVar);
        }
        rVar.m(new zf0.f(v0Var, str, o2Var));
        java.lang.Object j18 = rVar.j();
        return j18 == aVar ? aVar : j18;
    }
}

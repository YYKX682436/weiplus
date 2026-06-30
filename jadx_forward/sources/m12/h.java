package m12;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f404376d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f404377e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f404378f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f404379g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f404380h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f404381i;

    /* renamed from: m, reason: collision with root package name */
    public int f404382m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404383n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ rm5.k f404384o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.List f404385p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.gif.a f404386q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m12.i f404387r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f404388s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f404389t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(rm5.k kVar, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.gif.a aVar, m12.i iVar, java.nio.ByteBuffer byteBuffer, java.util.Set set, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f404384o = kVar;
        this.f404385p = list;
        this.f404386q = aVar;
        this.f404387r = iVar;
        this.f404388s = byteBuffer;
        this.f404389t = set;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        m12.h hVar = new m12.h(this.f404384o, this.f404385p, this.f404386q, this.f404387r, this.f404388s, this.f404389t, interfaceC29045xdcb5ca57);
        hVar.f404383n = obj;
        return hVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((m12.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f404382m;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f404383n;
            java.util.List list = this.f404385p;
            com.p314xaae8f345.mm.p1006xc5476f33.gif.a aVar2 = this.f404386q;
            m12.i iVar = this.f404387r;
            java.nio.ByteBuffer byteBuffer = this.f404388s;
            java.util.Set set = this.f404389t;
            this.f404383n = y0Var;
            rm5.k kVar = this.f404384o;
            this.f404376d = kVar;
            this.f404377e = list;
            this.f404378f = aVar2;
            this.f404379g = iVar;
            this.f404380h = byteBuffer;
            this.f404381i = set;
            this.f404382m = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            rVar.m(new m12.e(kVar, aVar2));
            kVar.a(list, new m12.g(iVar, byteBuffer, aVar2, y0Var, set, list, rVar));
            if (rVar.j() == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}

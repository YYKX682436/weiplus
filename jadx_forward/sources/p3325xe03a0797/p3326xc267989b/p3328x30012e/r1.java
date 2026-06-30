package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes4.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f391917d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f391918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j f391919f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f391920g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f391921h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f391919f = jVar;
        this.f391920g = i2Var;
        this.f391921h = obj;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.r1 r1Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.r1(this.f391919f, this.f391920g, this.f391921h, interfaceC29045xdcb5ca57);
        r1Var.f391918e = obj;
        return r1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((p3325xe03a0797.p3326xc267989b.p3328x30012e.r1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.p3328x30012e.t2) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f391917d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int ordinal = ((p3325xe03a0797.p3326xc267989b.p3328x30012e.t2) this.f391918e).ordinal();
            p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = this.f391920g;
            if (ordinal == 0) {
                this.f391917d = 1;
                if (this.f391919f.a(i2Var, this) == aVar) {
                    return aVar;
                }
            } else if (ordinal == 2) {
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.f391922a;
                java.lang.Object obj2 = this.f391921h;
                if (obj2 == l0Var) {
                    i2Var.d();
                } else {
                    i2Var.e(obj2);
                }
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

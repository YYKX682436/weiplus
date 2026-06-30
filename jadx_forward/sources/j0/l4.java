package j0;

/* loaded from: classes14.dex */
public final class l4 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f377963d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f377964e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ long f377965f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f377966g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f377967h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c0.o f377968i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(p3325xe03a0797.p3326xc267989b.y0 y0Var, n0.v2 v2Var, c0.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f377966g = y0Var;
        this.f377967h = v2Var;
        this.f377968i = oVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j17 = ((d1.e) obj2).f307160a;
        c0.o oVar = this.f377968i;
        j0.l4 l4Var = new j0.l4(this.f377966g, this.f377967h, oVar, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        l4Var.f377964e = (b0.f2) obj;
        l4Var.f377965f = j17;
        return l4Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f377963d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b0.f2 f2Var = (b0.f2) this.f377964e;
            p3325xe03a0797.p3326xc267989b.l.d(this.f377966g, null, null, new j0.j4(this.f377967h, this.f377965f, this.f377968i, null), 3, null);
            this.f377963d = 1;
            obj = ((b0.h2) f2Var).b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        p3325xe03a0797.p3326xc267989b.l.d(this.f377966g, null, null, new j0.k4(this.f377967h, booleanValue, this.f377968i, null), 3, null);
        return jz5.f0.f384359a;
    }
}

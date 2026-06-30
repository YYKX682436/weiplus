package l0;

/* loaded from: classes14.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f395785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f395786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f395787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0.p1 f395788g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p2.f f395789h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.p f395790i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f395791m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(l0.a3 a3Var, java.util.Map map, l0.p1 p1Var, p2.f fVar, yz5.p pVar, float f17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f395786e = a3Var;
        this.f395787f = map;
        this.f395788g = p1Var;
        this.f395789h = fVar;
        this.f395790i = pVar;
        this.f395791m = f17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new l0.i2(this.f395786e, this.f395787f, this.f395788g, this.f395789h, this.f395790i, this.f395791m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((l0.i2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f395785d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            l0.a3 a3Var = this.f395786e;
            java.util.Map map = (java.util.Map) ((n0.q4) a3Var.f395569i).mo128745x754a37bb();
            java.util.Map map2 = this.f395787f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map2, "<set-?>");
            ((n0.q4) a3Var.f395569i).mo148714x53d8522f(map2);
            ((n0.q4) a3Var.f395575o).mo148714x53d8522f(this.f395788g);
            yz5.p pVar = this.f395790i;
            p2.f fVar = this.f395789h;
            ((n0.q4) a3Var.f395573m).mo148714x53d8522f(new l0.h2(map2, pVar, fVar));
            float R = fVar.R(this.f395791m);
            ((n0.q4) a3Var.f395574n).mo148714x53d8522f(java.lang.Float.valueOf(R));
            this.f395785d = 1;
            if (a3Var.c(map, map2, this) == aVar) {
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

package l0;

/* loaded from: classes14.dex */
public final class o2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f395937d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f395938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f395939f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f395940g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z.p f395941h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(l0.a3 a3Var, float f17, z.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f395939f = a3Var;
        this.f395940g = f17;
        this.f395941h = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        l0.o2 o2Var = new l0.o2(this.f395939f, this.f395940g, this.f395941h, interfaceC29045xdcb5ca57);
        o2Var.f395938e = obj;
        return o2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((l0.o2) mo148xaf65a0fc((b0.u0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f395937d;
        l0.a3 a3Var = this.f395939f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                b0.u0 u0Var = (b0.u0) this.f395938e;
                p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
                e0Var.f391648d = ((java.lang.Number) ((n0.q4) a3Var.f395567g).mo128745x754a37bb()).floatValue();
                n0.v2 v2Var = a3Var.f395568h;
                float f17 = this.f395940g;
                ((n0.q4) v2Var).mo148714x53d8522f(new java.lang.Float(f17));
                ((n0.q4) a3Var.f395564d).mo148714x53d8522f(java.lang.Boolean.TRUE);
                z.e a17 = z.f.a(e0Var.f391648d, 0.0f, 2, null);
                java.lang.Float f18 = new java.lang.Float(f17);
                z.p pVar = this.f395941h;
                l0.n2 n2Var = new l0.n2(u0Var, e0Var);
                this.f395937d = 1;
                if (z.e.c(a17, f18, pVar, null, n2Var, this, 4, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            ((n0.q4) a3Var.f395568h).mo148714x53d8522f(null);
            ((n0.q4) a3Var.f395564d).mo148714x53d8522f(java.lang.Boolean.FALSE);
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            ((n0.q4) a3Var.f395568h).mo148714x53d8522f(null);
            ((n0.q4) a3Var.f395564d).mo148714x53d8522f(java.lang.Boolean.FALSE);
            throw th6;
        }
    }
}

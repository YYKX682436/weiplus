package b0;

/* loaded from: classes14.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97921d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f97922e;

    /* renamed from: f, reason: collision with root package name */
    public long f97923f;

    /* renamed from: g, reason: collision with root package name */
    public int f97924g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97925h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0.m3 f97926i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f97927m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f97928n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(b0.m3 m3Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97926i = m3Var;
        this.f97927m = g0Var;
        this.f97928n = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.k3 k3Var = new b0.k3(this.f97926i, this.f97927m, this.f97928n, interfaceC29045xdcb5ca57);
        k3Var.f97925h = obj;
        return k3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.k3) mo148xaf65a0fc((b0.p2) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var;
        b0.m3 m3Var;
        long j17;
        b0.m3 m3Var2;
        float f17;
        float f18;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97924g;
        b0.y1 y1Var = b0.y1.Horizontal;
        int i18 = 1;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b0.p2 p2Var = (b0.p2) this.f97925h;
            b0.m3 m3Var3 = this.f97926i;
            b0.j3 j3Var = new b0.j3(m3Var3, new b0.i3(m3Var3, p2Var));
            b0.q1 q1Var = m3Var3.f97969e;
            p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var2 = this.f97927m;
            long j18 = g0Var2.f391654d;
            b0.y1 y1Var2 = m3Var3.f97965a;
            long j19 = this.f97928n;
            float b17 = y1Var2 == y1Var ? p2.w.b(j19) : p2.w.c(j19);
            if (m3Var3.f97966b) {
                b17 *= -1;
            }
            this.f97925h = m3Var3;
            this.f97921d = m3Var3;
            this.f97922e = g0Var2;
            this.f97923f = j18;
            this.f97924g = 1;
            obj = q1Var.a(j3Var, b17, this);
            if (obj == aVar) {
                return aVar;
            }
            g0Var = g0Var2;
            m3Var = m3Var3;
            j17 = j18;
            m3Var2 = m3Var;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j27 = this.f97923f;
            p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var3 = (p3321xbce91901.jvm.p3324x21ffc6bd.g0) this.f97922e;
            b0.m3 m3Var4 = (b0.m3) this.f97921d;
            m3Var2 = (b0.m3) this.f97925h;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g0Var = g0Var3;
            m3Var = m3Var4;
            j17 = j27;
        }
        float floatValue = ((java.lang.Number) obj).floatValue();
        if (m3Var2.f97966b) {
            floatValue *= -1;
        }
        if (m3Var.f97965a == y1Var) {
            i18 = 2;
            f18 = floatValue;
            f17 = 0.0f;
        } else {
            f17 = floatValue;
            f18 = 0.0f;
        }
        g0Var.f391654d = p2.w.a(j17, f18, f17, i18, null);
        return jz5.f0.f384359a;
    }
}

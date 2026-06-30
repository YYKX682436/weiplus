package b0;

/* loaded from: classes14.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f16388d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f16389e;

    /* renamed from: f, reason: collision with root package name */
    public long f16390f;

    /* renamed from: g, reason: collision with root package name */
    public int f16391g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16392h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0.m3 f16393i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f16394m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f16395n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(b0.m3 m3Var, kotlin.jvm.internal.g0 g0Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16393i = m3Var;
        this.f16394m = g0Var;
        this.f16395n = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.k3 k3Var = new b0.k3(this.f16393i, this.f16394m, this.f16395n, continuation);
        k3Var.f16392h = obj;
        return k3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.k3) create((b0.p2) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.g0 g0Var;
        b0.m3 m3Var;
        long j17;
        b0.m3 m3Var2;
        float f17;
        float f18;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16391g;
        b0.y1 y1Var = b0.y1.Horizontal;
        int i18 = 1;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b0.p2 p2Var = (b0.p2) this.f16392h;
            b0.m3 m3Var3 = this.f16393i;
            b0.j3 j3Var = new b0.j3(m3Var3, new b0.i3(m3Var3, p2Var));
            b0.q1 q1Var = m3Var3.f16436e;
            kotlin.jvm.internal.g0 g0Var2 = this.f16394m;
            long j18 = g0Var2.f310121d;
            b0.y1 y1Var2 = m3Var3.f16432a;
            long j19 = this.f16395n;
            float b17 = y1Var2 == y1Var ? p2.w.b(j19) : p2.w.c(j19);
            if (m3Var3.f16433b) {
                b17 *= -1;
            }
            this.f16392h = m3Var3;
            this.f16388d = m3Var3;
            this.f16389e = g0Var2;
            this.f16390f = j18;
            this.f16391g = 1;
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
            long j27 = this.f16390f;
            kotlin.jvm.internal.g0 g0Var3 = (kotlin.jvm.internal.g0) this.f16389e;
            b0.m3 m3Var4 = (b0.m3) this.f16388d;
            m3Var2 = (b0.m3) this.f16392h;
            kotlin.ResultKt.throwOnFailure(obj);
            g0Var = g0Var3;
            m3Var = m3Var4;
            j17 = j27;
        }
        float floatValue = ((java.lang.Number) obj).floatValue();
        if (m3Var2.f16433b) {
            floatValue *= -1;
        }
        if (m3Var.f16432a == y1Var) {
            i18 = 2;
            f18 = floatValue;
            f17 = 0.0f;
        } else {
            f17 = floatValue;
            f18 = 0.0f;
        }
        g0Var.f310121d = p2.w.a(j17, f18, f17, i18, null);
        return jz5.f0.f302826a;
    }
}

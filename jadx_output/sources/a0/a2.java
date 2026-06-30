package a0;

/* loaded from: classes14.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f60d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f61e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.s2 f62f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0.j2 f63g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f64h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p2.f f65i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f66m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f67n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f68o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f69p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f70q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f71r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f72s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f73t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(a0.s2 s2Var, a0.j2 j2Var, android.view.View view, p2.f fVar, float f17, kotlinx.coroutines.flow.i2 i2Var, n0.e5 e5Var, n0.e5 e5Var2, n0.e5 e5Var3, n0.e5 e5Var4, n0.v2 v2Var, n0.e5 e5Var5, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f62f = s2Var;
        this.f63g = j2Var;
        this.f64h = view;
        this.f65i = fVar;
        this.f66m = f17;
        this.f67n = i2Var;
        this.f68o = e5Var;
        this.f69p = e5Var2;
        this.f70q = e5Var3;
        this.f71r = e5Var4;
        this.f72s = v2Var;
        this.f73t = e5Var5;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        a0.a2 a2Var = new a0.a2(this.f62f, this.f63g, this.f64h, this.f65i, this.f66m, this.f67n, this.f68o, this.f69p, this.f70q, this.f71r, this.f72s, this.f73t, continuation);
        a2Var.f61e = obj;
        return a2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.a2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        a0.r2 r2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f60d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f61e;
            a0.s2 s2Var = this.f62f;
            a0.j2 j2Var = this.f63g;
            android.view.View view = this.f64h;
            p2.f fVar = this.f65i;
            a0.r2 a17 = s2Var.a(j2Var, view, fVar, this.f66m);
            kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
            a0.t2 t2Var = (a0.t2) a17;
            android.widget.Magnifier magnifier = t2Var.f298a;
            long a18 = p2.r.a(magnifier.getWidth(), magnifier.getHeight());
            yz5.l lVar = (yz5.l) this.f68o.getValue();
            if (lVar != null) {
                lVar.invoke(new p2.k(fVar.e(p2.r.b(a18))));
            }
            g0Var.f310121d = a18;
            kotlinx.coroutines.flow.l.p(new kotlinx.coroutines.flow.y1(this.f67n, new a0.y1(t2Var, null)), y0Var);
            try {
                kotlinx.coroutines.flow.j f17 = n0.s4.f(new a0.z1(t2Var, this.f65i, this.f69p, this.f70q, this.f71r, this.f72s, this.f73t, g0Var, this.f68o));
                this.f61e = t2Var;
                this.f60d = 1;
                java.lang.Object a19 = ((kotlinx.coroutines.flow.b) f17).a(v26.j0.f433015d, this);
                if (a19 != aVar) {
                    a19 = f0Var;
                }
                if (a19 == aVar) {
                    return aVar;
                }
                r2Var = t2Var;
            } catch (java.lang.Throwable th6) {
                th = th6;
                r2Var = t2Var;
                ((a0.t2) r2Var).f298a.dismiss();
                throw th;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r2Var = (a0.r2) this.f61e;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th7) {
                th = th7;
                ((a0.t2) r2Var).f298a.dismiss();
                throw th;
            }
        }
        ((a0.t2) r2Var).f298a.dismiss();
        return f0Var;
    }
}

package j0;

/* loaded from: classes14.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f377783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.g0 f377784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1.z f377785f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(float f17, e1.g0 g0Var, e1.z zVar) {
        super(1);
        this.f377783d = f17;
        this.f377784e = g0Var;
        this.f377785f = zVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g1.f onDrawWithContent = (g1.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDrawWithContent, "$this$onDrawWithContent");
        u1.o0 o0Var = (u1.o0) onDrawWithContent;
        o0Var.b();
        e1.g0 g0Var = this.f377784e;
        e1.z zVar = this.f377785f;
        g1.b bVar = (g1.b) o0Var.p();
        long b17 = bVar.b();
        bVar.a().c();
        g1.d dVar = (g1.d) bVar.f349037a;
        dVar.e(this.f377783d, 0.0f);
        dVar.c(45.0f, d1.e.f307156b);
        g1.h.d(onDrawWithContent, g0Var, 0L, 0.0f, null, zVar, 0, 46, null);
        bVar.a().b();
        bVar.c(b17);
        return jz5.f0.f384359a;
    }
}

package a0;

/* loaded from: classes14.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f81798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1.d0 f81799e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(n0.v2 v2Var, c1.d0 d0Var) {
        super(1);
        this.f81798d = v2Var;
        this.f81799e = d0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(semantics, "$this$semantics");
        n0.v2 v2Var = this.f81798d;
        boolean a17 = a0.v0.a(v2Var);
        y1.m0.f540306d.a(semantics, y1.m0.f540303a[4], java.lang.Boolean.valueOf(a17));
        y1.l lVar = (y1.l) semantics;
        lVar.g(y1.k.f540296o, new y1.a(null, new a0.o0(this.f81799e, v2Var)));
        return jz5.f0.f384359a;
    }
}

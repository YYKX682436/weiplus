package a0;

/* loaded from: classes14.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1.d0 f266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(n0.v2 v2Var, c1.d0 d0Var) {
        super(1);
        this.f265d = v2Var;
        this.f266e = d0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        kotlin.jvm.internal.o.g(semantics, "$this$semantics");
        n0.v2 v2Var = this.f265d;
        boolean a17 = a0.v0.a(v2Var);
        y1.m0.f458773d.a(semantics, y1.m0.f458770a[4], java.lang.Boolean.valueOf(a17));
        y1.l lVar = (y1.l) semantics;
        lVar.g(y1.k.f458763o, new y1.a(null, new a0.o0(this.f266e, v2Var)));
        return jz5.f0.f302826a;
    }
}

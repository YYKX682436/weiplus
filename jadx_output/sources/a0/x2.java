package a0;

/* loaded from: classes14.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e06.f f334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f335f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(float f17, e06.f fVar, int i17) {
        super(1);
        this.f333d = f17;
        this.f334e = fVar;
        this.f335f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        kotlin.jvm.internal.o.g(semantics, "$this$semantics");
        java.lang.Float valueOf = java.lang.Float.valueOf(this.f333d);
        e06.f fVar = this.f334e;
        y1.h hVar = new y1.h(((java.lang.Number) e06.p.i(valueOf, fVar)).floatValue(), fVar, this.f335f);
        f06.v[] vVarArr = y1.m0.f458770a;
        y1.m0.f458772c.a(semantics, y1.m0.f458770a[1], hVar);
        return jz5.f0.f302826a;
    }
}

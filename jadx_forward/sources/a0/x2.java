package a0;

/* loaded from: classes14.dex */
public final class x2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f81866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e06.f f81867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f81868f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(float f17, e06.f fVar, int i17) {
        super(1);
        this.f81866d = f17;
        this.f81867e = fVar;
        this.f81868f = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(semantics, "$this$semantics");
        java.lang.Float valueOf = java.lang.Float.valueOf(this.f81866d);
        e06.f fVar = this.f81867e;
        y1.h hVar = new y1.h(((java.lang.Number) e06.p.i(valueOf, fVar)).floatValue(), fVar, this.f81868f);
        f06.v[] vVarArr = y1.m0.f540303a;
        y1.m0.f540305c.a(semantics, y1.m0.f540303a[1], hVar);
        return jz5.f0.f384359a;
    }
}

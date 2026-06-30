package b0;

/* loaded from: classes14.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1.f f16570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f16571e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(q1.f fVar, kotlin.jvm.internal.e0 e0Var) {
        super(2);
        this.f16570d = fVar;
        this.f16571e = e0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        p1.s event = (p1.s) obj;
        float floatValue = ((java.lang.Number) obj2).floatValue();
        kotlin.jvm.internal.o.g(event, "event");
        q1.g.a(this.f16570d, event);
        event.a();
        this.f16571e.f310115d = floatValue;
        return jz5.f0.f302826a;
    }
}

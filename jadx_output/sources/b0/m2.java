package b0;

/* loaded from: classes14.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f16430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.p2 f16431e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(kotlin.jvm.internal.e0 e0Var, b0.p2 p2Var) {
        super(2);
        this.f16430d = e0Var;
        this.f16431e = p2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        ((java.lang.Number) obj2).floatValue();
        kotlin.jvm.internal.e0 e0Var = this.f16430d;
        float f17 = e0Var.f310115d;
        e0Var.f310115d = f17 + this.f16431e.a(floatValue - f17);
        return jz5.f0.f302826a;
    }
}

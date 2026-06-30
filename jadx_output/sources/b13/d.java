package b13;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y03.f f17094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y03.f fVar) {
        super(2);
        this.f17094d = fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.util.Size size = (android.util.Size) obj;
        java.lang.Integer num = (java.lang.Integer) obj2;
        c13.b0 b0Var = c13.b0.f37860d;
        y03.f fVar = this.f17094d;
        kotlin.jvm.internal.o.d(fVar);
        int width = size.getWidth();
        int height = size.getHeight();
        kotlin.jvm.internal.o.d(num);
        b0Var.l(fVar, width, height, num.intValue());
        return jz5.f0.f302826a;
    }
}

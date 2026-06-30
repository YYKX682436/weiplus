package b13;

/* loaded from: classes14.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y03.f f98628d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y03.f fVar) {
        super(2);
        this.f98628d = fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.util.Size size = (android.util.Size) obj;
        java.lang.Integer num = (java.lang.Integer) obj2;
        c13.b0 b0Var = c13.b0.f119393d;
        y03.f fVar = this.f98628d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        int width = size.getWidth();
        int height = size.getHeight();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        b0Var.l(fVar, width, height, num.intValue());
        return jz5.f0.f384359a;
    }
}

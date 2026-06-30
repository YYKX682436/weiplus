package zu3;

/* loaded from: classes10.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu3.v f557365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(zu3.v vVar) {
        super(2);
        this.f557365d = vVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Matrix m17 = (android.graphics.Matrix) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m17, "m");
        zu3.v vVar = this.f557365d;
        vVar.m179563xbfb64d6f().f106450g.set(m17);
        vVar.postInvalidate();
        return jz5.f0.f384359a;
    }
}

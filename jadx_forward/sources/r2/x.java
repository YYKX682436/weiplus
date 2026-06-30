package r2;

/* loaded from: classes14.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.y1 f450296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u1.y1 y1Var) {
        super(2);
        this.f450296d = y1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        u1.w set = (u1.w) obj;
        p2.s it = (p2.s) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "$this$set");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object obj3 = this.f450296d.f505257a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
        r2.h0 h0Var = (r2.h0) obj3;
        int ordinal = it.ordinal();
        if (ordinal != 0) {
            i17 = 1;
            if (ordinal != 1) {
                throw new jz5.j();
            }
        } else {
            i17 = 0;
        }
        h0Var.setLayoutDirection(i17);
        return jz5.f0.f384359a;
    }
}

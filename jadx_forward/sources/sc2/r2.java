package sc2;

/* loaded from: classes2.dex */
public final class r2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final sc2.r2 f487721d = new sc2.r2();

    public r2() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view;
        ad2.h observer = (ad2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        if (observer.f84683n == 39) {
            sc2.w2 w2Var = observer instanceof sc2.w2 ? (sc2.w2) observer : null;
            if (w2Var != null && (view = w2Var.f84676d) != null) {
                view.post(new sc2.q2(observer));
            }
        }
        return jz5.f0.f384359a;
    }
}

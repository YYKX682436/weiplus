package sc2;

/* loaded from: classes2.dex */
public final class t2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487792d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(in5.s0 s0Var) {
        super(1);
        this.f487792d = s0Var;
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
                view.post(new sc2.s2(observer, this.f487792d));
            }
        }
        return jz5.f0.f384359a;
    }
}

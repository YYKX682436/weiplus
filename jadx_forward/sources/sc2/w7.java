package sc2;

/* loaded from: classes2.dex */
public final class w7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f487875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(int i17, in5.s0 s0Var) {
        super(1);
        this.f487875d = i17;
        this.f487876e = s0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view;
        ad2.h observer = (ad2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        xc2.p0 p0Var = observer.f84680h;
        if (p0Var != null && (view = observer.f84676d) != null && p0Var.B == 1) {
            int i17 = p0Var.E;
            int i18 = this.f487875d;
            if (i18 < i17 || i18 >= p0Var.F) {
                ad2.k.a(observer, this.f487876e, view, p0Var, false, null, 16, null);
            } else {
                ad2.k.b(observer, this.f487876e, view, p0Var, false, null, 16, null);
            }
        }
        return jz5.f0.f384359a;
    }
}

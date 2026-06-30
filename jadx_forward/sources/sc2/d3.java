package sc2;

/* loaded from: classes2.dex */
public final class d3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487363e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(in5.s0 s0Var, java.lang.String str) {
        super(1);
        this.f487362d = s0Var;
        this.f487363e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view;
        ad2.h observer = (ad2.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        if (observer.f84683n == 75) {
            sc2.m3 m3Var = observer instanceof sc2.m3 ? (sc2.m3) observer : null;
            if (m3Var != null && (view = m3Var.f84676d) != null) {
                view.post(new sc2.c3(observer, this.f487362d, view, this.f487363e));
            }
        }
        return jz5.f0.f384359a;
    }
}

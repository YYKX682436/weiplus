package ix3;

/* loaded from: classes10.dex */
public final class k0 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.o0 f377003d;

    public k0(ix3.o0 o0Var) {
        this.f377003d = o0Var;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        ix3.g0 data = (ix3.g0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        j75.f Q6 = this.f377003d.Q6();
        if (Q6 != null) {
            Q6.B3(new ix3.h0(data));
        }
    }

    @Override // in5.u
    public boolean v(android.view.View itemView, in5.c cVar, int i17) {
        ix3.g0 data = (ix3.g0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        j75.f Q6 = this.f377003d.Q6();
        if (Q6 == null) {
            return false;
        }
        Q6.B3(new ix3.j0(data));
        return false;
    }
}

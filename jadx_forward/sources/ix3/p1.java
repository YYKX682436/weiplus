package ix3;

/* loaded from: classes10.dex */
public final class p1 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.t1 f377060d;

    public p1(ix3.t1 t1Var) {
        this.f377060d = t1Var;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        ix3.l1 data = (ix3.l1) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        j75.f Q6 = this.f377060d.Q6();
        if (Q6 != null) {
            Q6.B3(new ix3.m1(data));
        }
    }

    @Override // in5.u
    public boolean v(android.view.View itemView, in5.c cVar, int i17) {
        ix3.l1 data = (ix3.l1) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        j75.f Q6 = this.f377060d.Q6();
        if (Q6 == null) {
            return false;
        }
        Q6.B3(new ix3.o1(data));
        return false;
    }
}

package yw3;

/* loaded from: classes11.dex */
public final class w6 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw3.a7 f548455d;

    public w6(yw3.a7 a7Var) {
        this.f548455d = a7Var;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        yw3.s6 data = (yw3.s6) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        j75.f Q6 = this.f548455d.Q6();
        if (Q6 != null) {
            Q6.B3(new yw3.t6(data));
        }
    }

    @Override // in5.u
    public boolean v(android.view.View itemView, in5.c cVar, int i17) {
        yw3.s6 data = (yw3.s6) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        j75.f Q6 = this.f548455d.Q6();
        if (Q6 == null) {
            return false;
        }
        Q6.B3(new yw3.v6(data));
        return false;
    }
}

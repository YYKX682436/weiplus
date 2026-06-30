package fx3;

/* loaded from: classes10.dex */
public final class l implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fx3.q f348675d;

    public l(fx3.q qVar) {
        this.f348675d = qVar;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        fx3.h data = (fx3.h) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        j75.f Q6 = this.f348675d.Q6();
        if (Q6 != null) {
            Q6.B3(new fx3.i(data));
        }
    }

    @Override // in5.u
    public boolean v(android.view.View itemView, in5.c cVar, int i17) {
        fx3.h data = (fx3.h) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        j75.f Q6 = this.f348675d.Q6();
        if (Q6 == null) {
            return false;
        }
        Q6.B3(new fx3.k(data));
        return false;
    }
}

package xu;

/* loaded from: classes9.dex */
public final class l implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xu.p f538714d;

    public l(xu.p pVar) {
        this.f538714d = pVar;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        hu.b data = (hu.b) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        j75.f Q6 = this.f538714d.Q6();
        if (Q6 != null) {
            Q6.B3(new hu.c(data));
        }
    }

    @Override // in5.u
    public boolean v(android.view.View itemView, in5.c cVar, int i17) {
        hu.b data = (hu.b) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        j75.f Q6 = this.f538714d.Q6();
        if (Q6 == null) {
            return false;
        }
        Q6.B3(new hu.d(data));
        return false;
    }
}

package ey0;

/* loaded from: classes5.dex */
public final class i implements v51.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ey0.j f338839a;

    public i(ey0.j jVar) {
        this.f338839a = jVar;
    }

    @Override // v51.f
    public final void a(java.util.Date date) {
        ey0.j jVar = this.f338839a;
        if (date == null) {
            jVar.getClass();
        } else {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jVar.f338842c, date)) {
                return;
            }
            jVar.f338842c = date;
            jVar.f338840a.a(date);
        }
    }
}

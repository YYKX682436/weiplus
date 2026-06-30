package ey0;

/* loaded from: classes5.dex */
public final class h implements v51.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ey0.j f338838a;

    public h(ey0.j jVar) {
        this.f338838a = jVar;
    }

    @Override // v51.e
    public final void a(java.util.Date date) {
        ey0.j jVar = this.f338838a;
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

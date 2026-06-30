package ey0;

/* loaded from: classes5.dex */
public final class e implements v51.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ey0.g f338833a;

    public e(ey0.g gVar) {
        this.f338833a = gVar;
    }

    @Override // v51.e
    public final void a(java.util.Date date) {
        ey0.g gVar = this.f338833a;
        if (date == null) {
            gVar.getClass();
        } else {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f338837c, date)) {
                return;
            }
            gVar.f338837c = date;
            gVar.f338835a.a(date);
        }
    }
}

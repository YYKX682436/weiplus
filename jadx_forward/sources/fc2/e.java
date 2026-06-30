package fc2;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final fc2.c f342475a;

    public e(fc2.c cVar) {
        this.f342475a = cVar;
    }

    public void a(fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        fc2.c cVar = this.f342475a;
        if (cVar != null) {
            cVar.b(event);
        }
    }
}

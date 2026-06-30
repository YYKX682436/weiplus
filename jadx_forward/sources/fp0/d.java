package fp0;

/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: d, reason: collision with root package name */
    public fp0.c f346779d;

    /* renamed from: e, reason: collision with root package name */
    public fp0.v f346780e;

    public abstract void a();

    public void b(fp0.u status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        fp0.v vVar = this.f346780e;
        if (vVar != null) {
            pm0.v.X(new fp0.g(((fp0.h) vVar).f346789a, this, status));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("watch");
            throw null;
        }
    }

    public boolean c(fp0.d newTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newTask, "newTask");
        return true;
    }

    public abstract java.lang.String d();
}

package fp0;

/* loaded from: classes10.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final fp0.d f346828d;

    /* renamed from: e, reason: collision with root package name */
    public final fp0.v f346829e;

    /* renamed from: f, reason: collision with root package name */
    public final fp0.c f346830f;

    public w(fp0.d dVar, fp0.c cVar, fp0.v vVar) {
        this.f346828d = dVar;
        this.f346830f = cVar;
        this.f346829e = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        fp0.d dVar = this.f346828d;
        dVar.getClass();
        fp0.c loader = this.f346830f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        fp0.v watch = this.f346829e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(watch, "watch");
        dVar.f346779d = loader;
        dVar.f346780e = watch;
        dVar.a();
    }
}

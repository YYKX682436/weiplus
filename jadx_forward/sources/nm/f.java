package nm;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nm.g f419965d;

    public f(nm.g gVar) {
        this.f419965d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f419965d.f419966a.f419973d) {
            nm.i.a(this.f419965d.f419966a);
        }
    }
}

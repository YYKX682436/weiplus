package li;

/* loaded from: classes12.dex */
public class d extends qi.b {

    /* renamed from: m, reason: collision with root package name */
    public static li.e f400277m;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f400278h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f400279i = false;

    public d(android.content.Context context) {
        this.f400278h = context;
    }

    @Override // qi.b
    public java.lang.String b() {
        return "OpenglLeak";
    }

    @Override // qi.b
    public void c(android.app.Application application, qi.c cVar) {
        super.c(application, cVar);
        pi.b bVar = pi.b.f436027e;
        android.app.Activity a17 = pi.b.a();
        if (a17 != null) {
            bVar.f436028d = new pi.a(a17.hashCode(), a17.getLocalClassName());
            com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41210x3ca472ca(bVar.f436028d.m158554x9616526c());
        }
        application.registerActivityLifecycleCallbacks(bVar);
        pi.d.f436030d.start();
    }

    @Override // qi.b
    public void e() {
        super.e();
        new java.lang.Thread(new li.a(this)).start();
    }
}

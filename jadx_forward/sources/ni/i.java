package ni;

/* loaded from: classes12.dex */
public class i extends ni.e implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k {

    /* renamed from: e, reason: collision with root package name */
    public final long f418712e;

    /* renamed from: g, reason: collision with root package name */
    public ni.h f418714g;

    /* renamed from: h, reason: collision with root package name */
    public ni.g f418715h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f418716i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f418717m = new ni.f(this);

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f418713f = new android.os.Handler(pi.d.f436030d.getLooper());

    public i(long j17) {
        this.f418712e = j17;
    }

    public void a(android.app.Application application) {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40966xc74540ab(this);
        application.registerActivityLifecycleCallbacks(this);
        oj.j.c("matrix.LeakMonitorDefault", "start", new java.lang.Object[0]);
        android.app.Activity a17 = pi.b.a();
        if (a17 != null) {
            ni.d dVar = new ni.d(this, a17.hashCode(), new ni.c());
            dVar.b();
            synchronized (this.f418710d) {
                ((java.util.LinkedList) this.f418710d).add(dVar);
            }
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void off() {
        this.f418713f.removeCallbacks(this.f418717m);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void on() {
        this.f418713f.postDelayed(this.f418717m, this.f418712e);
    }
}

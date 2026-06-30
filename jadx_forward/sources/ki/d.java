package ki;

/* loaded from: classes12.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f389620d;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f389621e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f389622f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0 f389623g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f389624h;

    /* renamed from: i, reason: collision with root package name */
    public final ki.b f389625i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f389626m;

    public d(java.lang.String name, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4660x9028c9b0 backgroundOwner, java.util.ArrayList trimCallback, ki.b config, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backgroundOwner, "backgroundOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trimCallback, "trimCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f389622f = name;
        this.f389623g = backgroundOwner;
        this.f389624h = trimCallback;
        this.f389625i = config;
        this.f389626m = z17;
        android.os.HandlerThread b17 = oj.g.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "MatrixHandlerThread.getDefaultHandlerThread()");
        this.f389620d = new android.os.Handler(b17.getLooper());
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f389621e;
        if (i17 >= this.f389625i.f389618b.size()) {
            oj.j.b("Matrix.TrimMemoryNotifier", "index[" + i17 + "] out of bounds[" + this.f389625i.f389618b.size() + ']', new java.lang.Object[0]);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("!!![");
        sb6.append(this.f389622f);
        sb6.append("] trim timeout [");
        int i18 = i17 + 1;
        sb6.append(i18);
        sb6.append('/');
        sb6.append(this.f389625i.f389618b.size());
        sb6.append("] ");
        sb6.append((java.lang.Long) this.f389625i.f389618b.get(i17));
        oj.j.c("Matrix.TrimMemoryNotifier", sb6.toString(), new java.lang.Object[0]);
        ki.i.f389634c.d(this.f389624h);
        if (i18 < this.f389625i.f389618b.size()) {
            this.f389621e = i18;
            java.lang.Object obj = this.f389625i.f389618b.get(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "config.delayMillis[nextIndex]");
            long longValue = ((java.lang.Number) obj).longValue();
            this.f389620d.postDelayed(this, longValue);
            oj.j.c("Matrix.TrimMemoryNotifier", "...[" + this.f389622f + "] trim delay[" + (i18 + 1) + '/' + this.f389625i.f389618b.size() + "] " + longValue, new java.lang.Object[0]);
        }
    }
}

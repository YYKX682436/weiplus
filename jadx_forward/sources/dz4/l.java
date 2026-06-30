package dz4;

/* loaded from: classes12.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public boolean f326865c;

    /* renamed from: d, reason: collision with root package name */
    public dz4.j f326866d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f326867e;

    /* renamed from: f, reason: collision with root package name */
    public long f326868f;

    /* renamed from: g, reason: collision with root package name */
    public long f326869g;

    /* renamed from: h, reason: collision with root package name */
    public long f326870h;

    /* renamed from: i, reason: collision with root package name */
    public long f326871i;

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f326863a = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final int f326864b = 50;

    /* renamed from: j, reason: collision with root package name */
    public final dz4.k f326872j = new dz4.k(this);

    public final void a(java.lang.String playId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playId, "playId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterNoteVoiceProgressMonitor", "pauseMonitoring: " + this.f326865c + ", " + this.f326867e + ' ' + playId);
        if (this.f326865c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326867e, playId)) {
            this.f326865c = false;
            this.f326863a.removeCallbacks(this.f326872j);
            long currentTimeMillis = this.f326869g + (java.lang.System.currentTimeMillis() - this.f326868f);
            this.f326871i = currentTimeMillis;
            this.f326869g = currentTimeMillis;
            long j17 = this.f326870h;
            double d17 = j17 > 0 ? e06.p.d(currentTimeMillis / j17, 0.0d, 1.0d) : 0.0d;
            dz4.j jVar = this.f326866d;
            if (jVar != null) {
                ((dz4.d0) jVar).a(d17, playId);
            }
        }
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterNoteVoiceProgressMonitor", "stopMonitoring: ");
        this.f326865c = false;
        this.f326863a.removeCallbacks(this.f326872j);
    }
}

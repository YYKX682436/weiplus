package bs2;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 f105496a;

    /* renamed from: b, reason: collision with root package name */
    public final int f105497b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f105498c;

    /* renamed from: d, reason: collision with root package name */
    public db2.o4 f105499d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.f f105500e;

    /* renamed from: f, reason: collision with root package name */
    public long f105501f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f105502g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f105503h;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 core) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(core, "core");
        this.f105496a = core;
        this.f105497b = 39;
        this.f105498c = new java.util.concurrent.locks.ReentrantLock();
    }

    public final boolean a(java.lang.String str) {
        boolean z17 = this.f105500e != null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NativeDramaTabPreloadWorker", "clearCache source=" + str + " hadCache=" + z17);
        this.f105500e = null;
        this.f105501f = 0L;
        return z17;
    }

    public final com.p314xaae8f345.mm.p944x882e457a.f b() {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f105500e;
        if (fVar == null) {
            return null;
        }
        if (this.f105501f <= 0 || android.os.SystemClock.elapsedRealtime() - this.f105501f >= 3600000) {
            return null;
        }
        return fVar;
    }
}

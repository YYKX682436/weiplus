package p6;

/* loaded from: classes16.dex */
public class h implements p6.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f433670a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class f433671b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Handler f433672c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f433673d;

    /* renamed from: e, reason: collision with root package name */
    public q6.d f433674e;

    /* renamed from: f, reason: collision with root package name */
    public q6.a f433675f;

    /* renamed from: g, reason: collision with root package name */
    public final p6.a f433676g = new p6.a();

    public h(android.content.Context context) {
        this.f433670a = context;
        try {
            this.f433671b = java.lang.Class.forName("android.os.RichTapVibrationEffect");
            int intValue = ((java.lang.Integer) this.f433671b.getMethod("checkIfRichTapSupport", new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).intValue();
            if (1 == intValue) {
                l6.m.f398274c = true;
            } else {
                l6.m.f398272a = (65280 & intValue) >> 8;
                l6.m.f398273b = (intValue & 255) >> 0;
                l6.m.f398274c = false;
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void a(java.lang.String str, int i17, int i18, q6.a aVar) {
        this.f433675f = aVar;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("Richtap-Sync");
        this.f433673d = handlerThread;
        handlerThread.start();
        p6.g gVar = new p6.g(this, this.f433673d.getLooper(), i17, i18);
        this.f433672c = gVar;
        p6.a aVar2 = this.f433676g;
        q6.d dVar = new q6.d(gVar, str, aVar2);
        this.f433674e = dVar;
        q6.a aVar3 = aVar2.f433646g;
        if (aVar3 != null) {
            if (aVar3.mo8697x9746038c() < 0) {
                this.f433674e.f441753a = aVar2.f433646g.mo8697x9746038c();
                this.f433674e.a(aVar2.f433646g.mo8697x9746038c(), aVar2.f433647h);
                return;
            } else {
                q6.d dVar2 = this.f433674e;
                long j17 = aVar2.f433647h;
                dVar2.f441753a = j17;
                dVar2.a(j17, j17);
                return;
            }
        }
        if (aVar == null && l6.m.f398272a >= 24) {
            l6.c.c(this.f433670a).a(str, 1, 0, i17, i18);
            this.f433672c.sendEmptyMessageDelayed(102, l6.m.d(str));
        } else if (aVar != null) {
            dVar.f441753a = aVar.mo8697x9746038c();
            this.f433674e.a(aVar.mo8697x9746038c(), 0L);
        } else {
            synchronized (dVar) {
                dVar.c(0L, 0L);
            }
            dVar.b();
        }
    }

    @Override // p6.f
    public void b(boolean z17) {
        p6.a aVar = this.f433676g;
        if (z17) {
            aVar.f433642c = Integer.MAX_VALUE;
        } else {
            aVar.f433642c = 0;
        }
    }

    @Override // p6.f
    public void c() {
        this.f433676g.b();
        e();
        l6.c.c(this.f433670a).e();
    }

    @Override // p6.f
    public void d(java.io.File file, int i17, int i18, q6.a aVar) {
        p6.a aVar2 = this.f433676g;
        aVar2.b();
        aVar2.f433649j = file;
        aVar2.f433643d = i17;
        aVar2.f433644e = i18;
        aVar2.f433646g = aVar;
    }

    public final void e() {
        android.os.HandlerThread handlerThread = this.f433673d;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f433673d = null;
            this.f433672c = null;
            this.f433674e = null;
        }
    }

    @Override // p6.f
    /* renamed from: getCurrentPosition */
    public int mo157874x9746038c() {
        m6.c cVar;
        p6.a aVar = this.f433676g;
        q6.a aVar2 = aVar.f433646g;
        if (aVar2 != null) {
            return aVar2.mo8697x9746038c();
        }
        int i17 = aVar.f433648i;
        if (i17 == 6) {
            return (int) ((android.os.SystemClock.elapsedRealtime() - aVar.f433641b) + aVar.f433647h);
        }
        if (i17 == 7) {
            return aVar.f433647h;
        }
        if (i17 == 9 && (cVar = aVar.f433645f) != null) {
            return cVar.mo146856x51e8b0a();
        }
        return 0;
    }

    @Override // p6.f
    /* renamed from: pause */
    public void mo157875x65825f6() {
        p6.a aVar = this.f433676g;
        if (6 != aVar.f433648i) {
            return;
        }
        e();
        l6.c.c(this.f433670a).e();
        aVar.f433648i = 7;
        if (!p6.a.a(aVar.f433645f)) {
            aVar.f433647h = 0;
            return;
        }
        q6.a aVar2 = aVar.f433646g;
        if (aVar2 != null) {
            aVar.f433647h = aVar2.mo8697x9746038c();
            return;
        }
        int elapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - aVar.f433641b);
        if (elapsedRealtime < 0) {
            aVar.f433647h = 0;
        } else {
            aVar.f433647h += elapsedRealtime;
        }
    }

    @Override // p6.f
    /* renamed from: prepare */
    public boolean mo157876xed060d07() {
        p6.a aVar = this.f433676g;
        java.io.File file = aVar.f433649j;
        if (file != null) {
            aVar.f433640a = l6.m.h(file);
        }
        if (1 == l6.m.i(aVar.f433640a)) {
            aVar.f433640a = l6.m.a(aVar.f433640a);
        }
        if (24 > l6.m.f398272a) {
            aVar.f433640a = l6.m.j(aVar.f433640a);
            aVar.f433640a = l6.m.k(aVar.f433640a);
        }
        m6.c g17 = l6.m.g(aVar.f433640a);
        if (p6.a.a(g17)) {
            aVar.f433645f = g17;
            return true;
        }
        aVar.b();
        return false;
    }

    @Override // p6.f
    /* renamed from: release */
    public void mo157877x41012807() {
        this.f433676g.b();
        e();
    }

    @Override // p6.f
    /* renamed from: seekTo */
    public boolean mo157878xc9fc1b13(int i17) {
        p6.a aVar = this.f433676g;
        if (p6.a.a(aVar.f433645f) && i17 >= 0 && i17 <= aVar.f433645f.mo146856x51e8b0a()) {
            e();
            l6.c.c(this.f433670a).e();
            aVar.f433647h = i17;
            java.lang.String c17 = l6.m.c(aVar.f433640a, i17);
            if (c17 == null || "".equals(c17)) {
                if (aVar.f433642c > 0) {
                    c17 = aVar.f433640a;
                    aVar.f433647h = 0;
                } else {
                    aVar.f433648i = 9;
                }
            }
            if (6 != aVar.f433648i) {
                return true;
            }
            aVar.f433641b = android.os.SystemClock.elapsedRealtime();
            q6.a aVar2 = aVar.f433646g;
            if (aVar2 != null) {
                a(aVar.f433640a, aVar.f433643d, aVar.f433644e, aVar2);
            } else {
                a(c17, aVar.f433643d, aVar.f433644e, null);
            }
            return true;
        }
        return false;
    }

    @Override // p6.f
    /* renamed from: start */
    public boolean mo157879x68ac462() {
        p6.a aVar = this.f433676g;
        if (6 == aVar.f433648i || !p6.a.a(aVar.f433645f) || aVar.f433647h < 0) {
            return false;
        }
        if (9 == aVar.f433648i) {
            aVar.f433647h = 0;
        }
        java.lang.String c17 = l6.m.c(aVar.f433640a, aVar.f433647h);
        if (c17 == null || "".equals(c17)) {
            aVar.f433648i = 9;
            return false;
        }
        aVar.f433641b = android.os.SystemClock.elapsedRealtime();
        aVar.f433648i = 6;
        q6.a aVar2 = aVar.f433646g;
        if (aVar2 != null) {
            a(aVar.f433640a, aVar.f433643d, aVar.f433644e, aVar2);
            return true;
        }
        a(c17, aVar.f433643d, aVar.f433644e, null);
        return true;
    }
}

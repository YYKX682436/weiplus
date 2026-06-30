package p6;

/* loaded from: classes16.dex */
public class j implements p6.f {

    /* renamed from: a, reason: collision with root package name */
    public p001xcca8366f.os.C0028x42c9e078 f433681a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.Handler f433682b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.HandlerThread f433683c;

    /* renamed from: d, reason: collision with root package name */
    public q6.d f433684d;

    /* renamed from: e, reason: collision with root package name */
    public q6.a f433685e;

    /* renamed from: f, reason: collision with root package name */
    public final p6.a f433686f = new p6.a();

    public j(android.content.Context context) {
    }

    public final void a(java.lang.String str, int i17, int i18, q6.a aVar) {
        this.f433685e = aVar;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("Tencent-Sync");
        this.f433683c = handlerThread;
        handlerThread.start();
        p6.i iVar = new p6.i(this, this.f433683c.getLooper(), i17, i18);
        this.f433682b = iVar;
        p6.a aVar2 = this.f433686f;
        q6.d dVar = new q6.d(iVar, str, aVar2);
        this.f433684d = dVar;
        q6.a aVar3 = aVar2.f433646g;
        if (aVar3 == null) {
            if (aVar != null) {
                dVar.f441753a = aVar.mo8697x9746038c();
                this.f433684d.a(aVar.mo8697x9746038c(), 0L);
                return;
            } else {
                synchronized (dVar) {
                    dVar.c(0L, 0L);
                }
                dVar.b();
                return;
            }
        }
        if (aVar3.mo8697x9746038c() < 0) {
            this.f433684d.f441753a = aVar2.f433646g.mo8697x9746038c();
            this.f433684d.a(aVar2.f433646g.mo8697x9746038c(), aVar2.f433647h);
        } else {
            q6.d dVar2 = this.f433684d;
            long j17 = aVar2.f433647h;
            dVar2.f441753a = j17;
            dVar2.a(j17, j17);
        }
    }

    @Override // p6.f
    public void b(boolean z17) {
        p6.a aVar = this.f433686f;
        if (z17) {
            aVar.f433642c = Integer.MAX_VALUE;
        } else {
            aVar.f433642c = 0;
        }
    }

    @Override // p6.f
    public void c() {
        try {
            this.f433686f.b();
            if (this.f433681a == null) {
                return;
            }
            e();
            this.f433681a.m2438x360802();
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // p6.f
    public void d(java.io.File file, int i17, int i18, q6.a aVar) {
        p6.a aVar2 = this.f433686f;
        aVar2.b();
        aVar2.f433649j = file;
        aVar2.f433643d = i17;
        aVar2.f433644e = i18;
        aVar2.f433646g = aVar;
    }

    public final void e() {
        android.os.HandlerThread handlerThread = this.f433683c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f433683c = null;
            this.f433682b = null;
            this.f433684d = null;
        }
    }

    @Override // p6.f
    /* renamed from: getCurrentPosition */
    public int mo157874x9746038c() {
        m6.c cVar;
        p6.a aVar = this.f433686f;
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
        p6.a aVar = this.f433686f;
        if (6 != aVar.f433648i) {
            return;
        }
        p001xcca8366f.os.C0028x42c9e078 c0028x42c9e078 = this.f433681a;
        if (c0028x42c9e078 != null) {
            c0028x42c9e078.m2438x360802();
        }
        e();
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
        p6.a aVar = this.f433686f;
        java.io.File file = aVar.f433649j;
        if (file != null) {
            aVar.f433640a = l6.m.h(file);
        }
        if (1 == l6.m.i(aVar.f433640a)) {
            aVar.f433640a = l6.m.a(aVar.f433640a);
        }
        aVar.f433640a = l6.m.j(aVar.f433640a);
        aVar.f433640a = l6.m.k(aVar.f433640a);
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
        this.f433686f.b();
        e();
        p001xcca8366f.os.C0028x42c9e078 c0028x42c9e078 = this.f433681a;
        if (c0028x42c9e078 != null) {
            c0028x42c9e078.m2438x360802();
        }
        this.f433681a = null;
    }

    @Override // p6.f
    /* renamed from: seekTo */
    public boolean mo157878xc9fc1b13(int i17) {
        p6.a aVar = this.f433686f;
        if (p6.a.a(aVar.f433645f) && i17 >= 0 && i17 <= aVar.f433645f.mo146856x51e8b0a()) {
            p001xcca8366f.os.C0028x42c9e078 c0028x42c9e078 = this.f433681a;
            if (c0028x42c9e078 != null) {
                c0028x42c9e078.m2438x360802();
            }
            e();
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
        p6.a aVar = this.f433686f;
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

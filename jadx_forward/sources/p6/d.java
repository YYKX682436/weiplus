package p6;

/* loaded from: classes16.dex */
public class d implements p6.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Vibrator f433658a;

    /* renamed from: b, reason: collision with root package name */
    public l6.b f433659b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Handler f433660c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f433661d;

    /* renamed from: e, reason: collision with root package name */
    public q6.d f433662e;

    /* renamed from: f, reason: collision with root package name */
    public q6.a f433663f;

    /* renamed from: g, reason: collision with root package name */
    public final p6.a f433664g = new p6.a();

    /* renamed from: h, reason: collision with root package name */
    public l6.l f433665h;

    public d(android.content.Context context) {
        this.f433658a = (android.os.Vibrator) context.getSystemService("vibrator");
        l6.b bVar = new l6.b(context);
        this.f433659b = bVar;
        bVar.start();
    }

    public void a(java.lang.String str, int i17, int i18, int i19, int i27) {
        try {
            int i28 = new org.json.JSONObject(str).getJSONObject("Metadata").getInt("Version");
            if (i28 == 1) {
                g();
                this.f433659b.a(new l6.a(str, i17, i18, i19, i27));
                return;
            }
            if (i28 == 2) {
                f();
                java.lang.String k17 = l6.m.k(l6.m.j(str));
                l6.l lVar = new l6.l();
                this.f433665h = lVar;
                synchronized (lVar) {
                    if (i18 >= 0) {
                        try {
                            lVar.f398265a = i18;
                        } finally {
                        }
                    }
                    if (i19 >= 0 && i19 <= 255) {
                        lVar.f398267c = i19;
                    }
                }
                l6.l lVar2 = this.f433665h;
                o6.a f17 = l6.m.f(k17);
                lVar2.a(i17, i18, f17 != null ? f17.mo146856x51e8b0a() : 0, new p6.b(this, k17, i19, i27));
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // p6.f
    public void b(boolean z17) {
        p6.a aVar = this.f433664g;
        if (z17) {
            aVar.f433642c = Integer.MAX_VALUE;
        } else {
            aVar.f433642c = 0;
        }
    }

    @Override // p6.f
    public void c() {
        this.f433664g.b();
        f();
        g();
    }

    @Override // p6.f
    public void d(java.io.File file, int i17, int i18, q6.a aVar) {
        p6.a aVar2 = this.f433664g;
        aVar2.b();
        aVar2.f433649j = file;
        aVar2.f433643d = i17;
        aVar2.f433644e = i18;
        aVar2.f433646g = aVar;
    }

    public final void e(java.lang.String str, int i17, int i18, q6.a aVar) {
        this.f433663f = aVar;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("Richtap-Sync");
        this.f433661d = handlerThread;
        handlerThread.start();
        p6.c cVar = new p6.c(this, this.f433661d.getLooper(), i17, i18);
        this.f433660c = cVar;
        p6.a aVar2 = this.f433664g;
        q6.d dVar = new q6.d(cVar, str, aVar2);
        this.f433662e = dVar;
        q6.a aVar3 = aVar2.f433646g;
        if (aVar3 == null) {
            if (aVar != null) {
                dVar.f441753a = aVar.mo8697x9746038c();
                this.f433662e.a(aVar.mo8697x9746038c(), 0L);
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
            this.f433662e.f441753a = aVar2.f433646g.mo8697x9746038c();
            this.f433662e.a(aVar2.f433646g.mo8697x9746038c(), aVar2.f433647h);
        } else {
            q6.d dVar2 = this.f433662e;
            long j17 = aVar2.f433647h;
            dVar2.f441753a = j17;
            dVar2.a(j17, j17);
        }
    }

    public final void f() {
        android.os.HandlerThread handlerThread = this.f433661d;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f433661d = null;
            this.f433660c = null;
            this.f433662e = null;
        }
        l6.l lVar = this.f433665h;
        if (lVar != null) {
            synchronized (lVar) {
                try {
                    android.os.HandlerThread handlerThread2 = lVar.f398269e;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        lVar.f398269e = null;
                    }
                    lVar.f398270f = null;
                } catch (java.lang.Throwable unused) {
                }
            }
            this.f433665h = null;
        }
    }

    public final void g() {
        l6.b bVar = this.f433659b;
        if (bVar != null) {
            synchronized (bVar.f398241d) {
                try {
                } catch (java.lang.Exception unused) {
                }
                synchronized (bVar.f398242e) {
                    if (!((java.util.ArrayList) bVar.f398245h).isEmpty()) {
                        l6.a aVar = (l6.a) ((java.util.ArrayList) bVar.f398245h).get(0);
                        if (aVar.f398238g) {
                            aVar.f398238g = false;
                        }
                        bVar.f398241d.notify();
                    }
                }
            }
        }
        this.f433658a.cancel();
    }

    @Override // p6.f
    /* renamed from: getCurrentPosition */
    public int mo157874x9746038c() {
        m6.c cVar;
        p6.a aVar = this.f433664g;
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
        p6.a aVar = this.f433664g;
        if (6 != aVar.f433648i) {
            return;
        }
        f();
        g();
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
        p6.a aVar = this.f433664g;
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
        this.f433664g.b();
        f();
        l6.b bVar = this.f433659b;
        if (bVar != null) {
            bVar.f398244g = true;
            synchronized (bVar.f398241d) {
                try {
                    synchronized (bVar.f398242e) {
                        ((java.util.ArrayList) bVar.f398245h).clear();
                        bVar.f398245h = null;
                    }
                    bVar.f398241d.notify();
                } catch (java.lang.Exception unused) {
                }
            }
            this.f433659b = null;
        }
    }

    @Override // p6.f
    /* renamed from: seekTo */
    public boolean mo157878xc9fc1b13(int i17) {
        p6.a aVar = this.f433664g;
        if (p6.a.a(aVar.f433645f) && i17 >= 0 && i17 <= aVar.f433645f.mo146856x51e8b0a()) {
            f();
            g();
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
                e(aVar.f433640a, aVar.f433643d, aVar.f433644e, aVar2);
            } else {
                e(c17, aVar.f433643d, aVar.f433644e, null);
            }
            return true;
        }
        return false;
    }

    @Override // p6.f
    /* renamed from: start */
    public boolean mo157879x68ac462() {
        p6.a aVar = this.f433664g;
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
            e(aVar.f433640a, aVar.f433643d, aVar.f433644e, aVar2);
            return true;
        }
        e(c17, aVar.f433643d, aVar.f433644e, null);
        return true;
    }
}

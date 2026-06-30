package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class nf extends java.lang.Thread {

    /* renamed from: c, reason: collision with root package name */
    private static final int f50559c = 80;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ne f50562d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f50563e = false;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f50560a = false;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f50561b = false;

    public nf(com.tencent.mapsdk.internal.ne neVar) {
        setName("tms-texture");
        this.f50562d = neVar;
        com.tencent.mapsdk.core.utils.log.LogUtil.a(a()).c(com.tencent.mapsdk.internal.la.a.f50266g, "tms-texture thread create");
    }

    private void d() {
        com.tencent.mapsdk.core.utils.log.LogUtil.a(a()).c(com.tencent.mapsdk.internal.la.a.f50266g, "tms-texture thread resume");
        this.f50560a = false;
        synchronized (this) {
            notifyAll();
        }
    }

    private boolean e() {
        com.tencent.mapsdk.internal.tk tkVar;
        com.tencent.mapsdk.internal.ne neVar = this.f50562d;
        if (neVar == null || (tkVar = neVar.f50506f) == null || tkVar.f51661e == 0) {
            return false;
        }
        if (android.os.SystemClock.elapsedRealtime() - tkVar.f51668l > 560) {
            tkVar.f51660d.nativeClearDownloadURLCache(tkVar.f51661e);
            tkVar.f51668l = android.os.SystemClock.elapsedRealtime();
        }
        return tkVar.f51660d.nativeGenerateTextures(tkVar.f51661e);
    }

    private boolean f() {
        return this.f50561b;
    }

    public final int a() {
        com.tencent.mapsdk.internal.ne neVar = this.f50562d;
        if (neVar != null) {
            return neVar.K;
        }
        return -1;
    }

    public final void b() {
        com.tencent.mapsdk.core.utils.log.LogUtil.a(a()).c(com.tencent.mapsdk.internal.la.a.f50266g, "tms-texture thread stop");
        this.f50560a = false;
        this.f50563e = true;
        synchronized (this) {
            notifyAll();
        }
    }

    public final void c() {
        com.tencent.mapsdk.core.utils.log.LogUtil.a(a()).b(com.tencent.mapsdk.internal.la.a.f50266g, "tms-texture thread pause");
        this.f50560a = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.tk tkVar;
        com.tencent.mapsdk.core.utils.log.LogUtil.a(a()).c(com.tencent.mapsdk.internal.la.a.f50266g, "tms-texture thread run");
        while (!this.f50563e) {
            boolean z17 = false;
            if (!this.f50560a && (neVar = this.f50562d) != null && (tkVar = neVar.f50506f) != null && tkVar.f51661e != 0) {
                if (android.os.SystemClock.elapsedRealtime() - tkVar.f51668l > 560) {
                    tkVar.f51660d.nativeClearDownloadURLCache(tkVar.f51661e);
                    tkVar.f51668l = android.os.SystemClock.elapsedRealtime();
                }
                z17 = tkVar.f51660d.nativeGenerateTextures(tkVar.f51661e);
            }
            if (!z17) {
                try {
                    synchronized (this) {
                        wait(80L);
                    }
                } catch (java.lang.InterruptedException e17) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(android.util.Log.getStackTraceString(e17));
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
        this.f50561b = true;
        com.tencent.mapsdk.core.utils.log.LogUtil.a(a()).c(com.tencent.mapsdk.internal.la.a.f50266g, "tms-texture thread destroy");
    }
}

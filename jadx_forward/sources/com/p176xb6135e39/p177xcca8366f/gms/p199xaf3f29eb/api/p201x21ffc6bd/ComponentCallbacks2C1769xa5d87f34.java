package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.BackgroundDetector */
/* loaded from: classes13.dex */
public final class ComponentCallbacks2C1769xa5d87f34 implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {
    private static final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ComponentCallbacks2C1769xa5d87f34 zza = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ComponentCallbacks2C1769xa5d87f34();
    private final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean zzc = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.ArrayList zzd = new java.util.ArrayList();
    private boolean zze = false;

    /* renamed from: com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener */
    /* loaded from: classes13.dex */
    public interface BackgroundStateChangeListener {
        /* renamed from: onBackgroundStateChanged */
        void mo17872x7ebbedf0(boolean z17);
    }

    private ComponentCallbacks2C1769xa5d87f34() {
    }

    /* renamed from: getInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ComponentCallbacks2C1769xa5d87f34 m17867x9cf0d20b() {
        return zza;
    }

    /* renamed from: initialize */
    public static void m17868x33ebcb90(android.app.Application application) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ComponentCallbacks2C1769xa5d87f34 componentCallbacks2C1769xa5d87f34 = zza;
        synchronized (componentCallbacks2C1769xa5d87f34) {
            if (!componentCallbacks2C1769xa5d87f34.zze) {
                application.registerActivityLifecycleCallbacks(componentCallbacks2C1769xa5d87f34);
                application.registerComponentCallbacks(componentCallbacks2C1769xa5d87f34);
                componentCallbacks2C1769xa5d87f34.zze = true;
            }
        }
    }

    private final void zza(boolean z17) {
        synchronized (zza) {
            java.util.Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ComponentCallbacks2C1769xa5d87f34.BackgroundStateChangeListener) it.next()).mo17872x7ebbedf0(z17);
            }
        }
    }

    /* renamed from: addListener */
    public void m17869x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ComponentCallbacks2C1769xa5d87f34.BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (zza) {
            this.zzd.add(backgroundStateChangeListener);
        }
    }

    /* renamed from: isInBackground */
    public boolean m17870x1c2ac67d() {
        return this.zzb.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.zzc;
        boolean compareAndSet = this.zzb.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            zza(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.zzc;
        boolean compareAndSet = this.zzb.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            zza(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i17) {
        if (i17 == 20 && this.zzb.compareAndSet(false, true)) {
            this.zzc.set(true);
            zza(true);
        }
    }

    /* renamed from: readCurrentStateIfPossible */
    public boolean m17871x9375979c(boolean z17) {
        if (!this.zzc.get()) {
            if (!com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18597x674a68a2()) {
                return z17;
            }
            android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.zzc.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.zzb.set(true);
            }
        }
        return m17870x1c2ac67d();
    }
}

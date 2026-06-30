package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class o6 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.u6 f135098d;

    public o6(com.p314xaae8f345.mm.app.u6 u6Var) {
        this.f135098d = u6Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.app.u6 u6Var = this.f135098d;
        u6Var.getClass();
        boolean a17 = k95.b.a(activity);
        synchronized (u6Var.H) {
            int[] iArr = u6Var.H;
            iArr[0] = iArr[0] + 1;
            if (a17) {
                iArr[1] = iArr[1] + 1;
            }
        }
        if (u6Var.d(false) == 1) {
            u6Var.f135366m = android.os.SystemClock.elapsedRealtime();
            u6Var.f135360d.removeCallbacks(u6Var.M);
        }
        if (u6Var.d(true) == 1) {
            u6Var.f135367n = android.os.SystemClock.elapsedRealtime();
            u6Var.f135369p = u6Var.g(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        com.p314xaae8f345.mm.app.u6 u6Var = this.f135098d;
        u6Var.getClass();
        boolean a17 = k95.b.a(activity);
        synchronized (u6Var.H) {
            int[] iArr = u6Var.H;
            iArr[0] = iArr[0] - 1;
            if (a17) {
                iArr[1] = iArr[1] - 1;
            }
        }
        if (u6Var.f135373t && u6Var.d(false) == 0) {
            u6Var.f135360d.removeCallbacks(u6Var.M);
            u6Var.f135360d.postDelayed(u6Var.M, java.util.concurrent.TimeUnit.SECONDS.toMillis(2L));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        com.p314xaae8f345.mm.app.r6 r6Var;
        com.p314xaae8f345.mm.app.u6 u6Var = this.f135098d;
        if (u6Var.d(true) <= 0 || (r6Var = u6Var.G) == null) {
            return;
        }
        r6Var.a();
        u6Var.G = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        if (gm0.j1.a() != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResumed(android.app.Activity r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.app.o6.onActivityResumed(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        com.p314xaae8f345.mm.app.u6 u6Var = this.f135098d;
        u6Var.getClass();
        boolean a17 = k95.b.a(activity);
        synchronized (u6Var.I) {
            int[] iArr = u6Var.I;
            iArr[0] = iArr[0] + 1;
            if (a17) {
                iArr[1] = iArr[1] + 1;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        int[] iArr;
        int i17;
        com.p314xaae8f345.mm.app.u6 u6Var = this.f135098d;
        u6Var.getClass();
        boolean a17 = k95.b.a(activity);
        synchronized (u6Var.I) {
            iArr = u6Var.I;
            iArr[0] = iArr[0] - 1;
            if (a17) {
                iArr[1] = iArr[1] - 1;
            }
        }
        if (u6Var.f135373t) {
            return;
        }
        synchronized (iArr) {
            i17 = u6Var.I[0];
        }
        if (i17 == 0) {
            u6Var.f135360d.removeCallbacks(u6Var.L);
            u6Var.f135360d.postDelayed(u6Var.L, com.p314xaae8f345.mm.app.u6.R);
        }
    }
}

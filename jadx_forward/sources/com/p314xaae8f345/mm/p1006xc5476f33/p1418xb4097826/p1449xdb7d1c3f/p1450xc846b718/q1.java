package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class q1 implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1 f187314d;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1 w1Var) {
        this.f187314d = w1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r0.U6() == true) goto L13;
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResumed(android.app.Activity r5) {
        /*
            r4 = this;
            java.lang.String r0 = "activity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.tencent.mm.ui.LauncherUI"
            r2 = 0
            boolean r0 = r26.i0.n(r0, r1, r2)
            com.tencent.mm.plugin.finder.extension.reddot.w1 r1 = r4.f187314d
            if (r0 == 0) goto L32
            boolean r0 = r5 instanceof com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8
            if (r0 == 0) goto L20
            r0 = r5
            com.tencent.mm.ui.vas.launcher.VASLauncher r0 = (com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8) r0
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 == 0) goto L2b
            boolean r0 = r0.U6()
            r3 = 1
            if (r0 != r3) goto L2b
            goto L2c
        L2b:
            r3 = r2
        L2c:
            if (r3 != 0) goto L32
            r1.Ri()
            goto L4b
        L32:
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = "BizFlutterTLFlutterViewActivity"
            boolean r5 = r26.i0.n(r5, r0, r2)
            if (r5 == 0) goto L47
            r5 = 104(0x68, float:1.46E-43)
            r1.f187477e = r5
            goto L4b
        L47:
            r5 = 999(0x3e7, float:1.4E-42)
            r1.f187477e = r5
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.q1.onActivityResumed(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }
}

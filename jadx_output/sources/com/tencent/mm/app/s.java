package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class s extends android.content.BroadcastReceiver implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f53757d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.t f53758e;

    public s(com.tencent.mm.app.t tVar, com.tencent.mm.app.f fVar) {
        this.f53758e = tVar;
    }

    public final void a(java.lang.String str, java.lang.String str2, com.tencent.mm.app.k kVar) {
        com.tencent.mm.app.w wVar;
        java.lang.Runnable runnable;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppForegroundDelegate", "[checkAlive] activityName:%s process:%s action:%s", str, str2, kVar.name());
        com.tencent.mm.app.w wVar2 = this.f53758e.f53777c;
        com.tencent.mm.app.w wVar3 = com.tencent.mm.app.w.INSTANCE;
        wVar2.getClass();
        com.tencent.mm.app.k kVar2 = com.tencent.mm.app.k.RESUMED;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.app.w.f53880y;
        com.tencent.mm.app.k kVar3 = com.tencent.mm.app.k.PAUSED;
        if (kVar == kVar2) {
            com.tencent.mm.app.u uVar = (com.tencent.mm.app.u) concurrentHashMap.get(str2);
            if (uVar == null) {
                concurrentHashMap.put(str2, new com.tencent.mm.app.u(str, kVar));
            } else if (!uVar.a(str, kVar)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppForegroundDelegate", "[countState] activityName=%s duplicate resume", str);
            }
        } else if (kVar == kVar3) {
            com.tencent.mm.app.u uVar2 = (com.tencent.mm.app.u) concurrentHashMap.get(str2);
            if (uVar2 == null) {
                concurrentHashMap.put(str2, new com.tencent.mm.app.u(str, kVar));
            } else if (!uVar2.a(str, kVar)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppForegroundDelegate", "[countState] activityName=%s duplicate pause", str);
            }
        }
        com.tencent.mm.app.k kVar4 = com.tencent.mm.app.k.STARTED;
        if (kVar == kVar4) {
            if (!this.f53758e.f53777c.f53889n) {
                this.f53758e.f53776b.a(true, str);
            }
            this.f53757d.remove(str);
        }
        if ((kVar == com.tencent.mm.app.k.CREATED || kVar == kVar4 || kVar == kVar2 || kVar == kVar3) && (runnable = (wVar = this.f53758e.f53777c).f53884f) != null) {
            wVar.f53882d.removeCallbacks(runnable);
            this.f53758e.f53777c.f53884f = null;
        }
        if (kVar == kVar2) {
            com.tencent.mm.app.w wVar4 = this.f53758e.f53777c;
            android.os.Handler handler = wVar4.f53882d;
            com.tencent.mm.app.p pVar = new com.tencent.mm.app.p(this, str);
            wVar4.f53884f = pVar;
            handler.postDelayed(pVar, 600L);
            return;
        }
        if (kVar == kVar3) {
            com.tencent.mm.app.w wVar5 = this.f53758e.f53777c;
            android.os.Handler handler2 = wVar5.f53882d;
            com.tencent.mm.app.q qVar = new com.tencent.mm.app.q(this, str);
            wVar5.f53884f = qVar;
            handler2.postDelayed(qVar, 600L);
            return;
        }
        com.tencent.mm.app.k kVar5 = com.tencent.mm.app.k.STOPPED;
        if (kVar == kVar5 || kVar == com.tencent.mm.app.k.DESTROY) {
            if (kVar == kVar5) {
                this.f53757d.add(str);
            }
            com.tencent.mm.app.w wVar6 = this.f53758e.f53777c;
            if (wVar6.f53884f == null) {
                android.os.Handler handler3 = wVar6.f53882d;
                com.tencent.mm.app.r rVar = new com.tencent.mm.app.r(this, str);
                wVar6.f53884f = rVar;
                handler3.postDelayed(rVar, 600L);
            }
        }
    }

    public final java.lang.String b() {
        return bm5.f1.a() + "@" + android.os.Process.myPid();
    }

    public final void c(com.tencent.mm.app.k kVar, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(kVar.f53473d);
        intent.putExtra("_application_context_process_", b());
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME", str);
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent, com.tencent.mm.app.w.f53874s);
    }

    public final void d(com.tencent.mm.app.l lVar, android.app.Activity activity) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(lVar.f53490d);
        intent.putExtra("_application_context_process_", b());
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_CLASS_NAME", activity.getClass().getName());
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_REF", activity.hashCode() + "");
    }

    public final void e(java.lang.String str, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.Intent.ACTION_NET_STATS");
        intent.putExtra("ui", str);
        intent.putExtra("opCode", i17);
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.app.o(this, intent), "TrafficMonitorBroadcast");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.lang.String str = activity.getClass().getName() + "@" + activity.hashCode();
        com.tencent.mm.app.w.f53875t = str;
        this.f53758e.f53777c.f53885g = new java.lang.ref.WeakReference(activity);
        com.tencent.mm.app.w.f53877v.add(activity.getClass().getName());
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        com.tencent.mm.app.k kVar = com.tencent.mm.app.k.CREATED;
        if (n17) {
            a(str, b(), kVar);
        } else {
            c(kVar, str);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        java.lang.String str = activity.getClass().getName() + "@" + activity.hashCode();
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        com.tencent.mm.app.k kVar = com.tencent.mm.app.k.DESTROY;
        if (n17) {
            a(str, b(), kVar);
        } else {
            c(kVar, str);
        }
        d(com.tencent.mm.app.l.EXIT, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        com.tencent.mm.app.w.f53878w = false;
        java.lang.String str = activity.getClass().getName() + "@" + activity.hashCode();
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        com.tencent.mm.app.k kVar = com.tencent.mm.app.k.PAUSED;
        if (n17) {
            a(str, b(), kVar);
        } else {
            c(kVar, str);
        }
        e(activity.getClass().getSimpleName(), 4);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        d(com.tencent.mm.app.l.ENTER, activity);
        this.f53758e.f53777c.f53886h = new java.lang.ref.WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        com.tencent.mm.app.w.f53878w = true;
        java.lang.String str = activity.getClass().getName() + "@" + activity.hashCode();
        this.f53758e.f53777c.f53886h = new java.lang.ref.WeakReference(activity);
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        com.tencent.mm.app.k kVar = com.tencent.mm.app.k.RESUMED;
        if (n17) {
            a(str, b(), kVar);
        } else {
            c(kVar, str);
        }
        e(activity.getClass().getSimpleName(), 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        java.lang.String str = activity.getClass().getName() + "@" + activity.hashCode();
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        com.tencent.mm.app.k kVar = com.tencent.mm.app.k.STARTED;
        if (n17) {
            a(str, b(), kVar);
        } else {
            c(kVar, str);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        java.lang.String str = activity.getClass().getName() + "@" + activity.hashCode();
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        com.tencent.mm.app.k kVar = com.tencent.mm.app.k.STOPPED;
        if (n17) {
            a(str, b(), kVar);
        } else {
            c(kVar, str);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        if (!"android.intent.action.SCREEN_OFF".equals(action) && !"android.intent.action.SCREEN_ON".equals(action)) {
            boolean equals = action.equals("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_STARTED");
            com.tencent.mm.app.k kVar = com.tencent.mm.app.k.RESUMED;
            com.tencent.mm.app.k kVar2 = com.tencent.mm.app.k.STARTED;
            com.tencent.mm.app.k kVar3 = equals ? kVar2 : action.equals("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_RESUMED") ? kVar : action.equals("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_PAUSED") ? com.tencent.mm.app.k.PAUSED : action.equals("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_STOPPED") ? com.tencent.mm.app.k.STOPPED : null;
            if (kVar3 == kVar2 || kVar3 == kVar) {
                com.tencent.mm.app.m mVar = com.tencent.mm.app.w.f53879x;
                mVar.f53513g = false;
                this.f53758e.f53777c.f53882d.removeCallbacks(mVar);
            }
            if (kVar3 != null) {
                a(intent.getStringExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME"), intent.getStringExtra("_application_context_process_"), kVar3);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppForegroundDelegate", "ACTION_SCREEN:%s isAppForeground:%s", action, java.lang.Boolean.valueOf(this.f53758e.f53777c.f53889n));
        if ("android.intent.action.SCREEN_OFF".equals(action)) {
            com.tencent.mm.app.t tVar = this.f53758e;
            com.tencent.mm.app.w wVar = tVar.f53777c;
            wVar.f53892q = true;
            com.tencent.mm.app.m mVar2 = com.tencent.mm.app.w.f53879x;
            com.tencent.mm.app.v vVar = tVar.f53776b;
            android.os.Handler handler = wVar.f53882d;
            mVar2.f53510d = vVar;
            mVar2.f53512f = handler;
            mVar2.f53511e = 0;
            mVar2.f53513g = true;
            handler.postDelayed(mVar2, 5000L);
        } else {
            this.f53758e.f53777c.f53882d.removeCallbacks(com.tencent.mm.app.w.f53879x);
            this.f53758e.f53777c.f53892q = false;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.app.n(this), "MicroMsg.AppForegroundDelegate");
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
    }
}

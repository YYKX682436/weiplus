package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class s extends android.content.BroadcastReceiver implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f135290d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.t f135291e;

    public s(com.p314xaae8f345.mm.app.t tVar, com.p314xaae8f345.mm.app.f fVar) {
        this.f135291e = tVar;
    }

    public final void a(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.app.k kVar) {
        com.p314xaae8f345.mm.app.w wVar;
        java.lang.Runnable runnable;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppForegroundDelegate", "[checkAlive] activityName:%s process:%s action:%s", str, str2, kVar.name());
        com.p314xaae8f345.mm.app.w wVar2 = this.f135291e.f135310c;
        com.p314xaae8f345.mm.app.w wVar3 = com.p314xaae8f345.mm.app.w.INSTANCE;
        wVar2.getClass();
        com.p314xaae8f345.mm.app.k kVar2 = com.p314xaae8f345.mm.app.k.RESUMED;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.app.w.f135413y;
        com.p314xaae8f345.mm.app.k kVar3 = com.p314xaae8f345.mm.app.k.PAUSED;
        if (kVar == kVar2) {
            com.p314xaae8f345.mm.app.u uVar = (com.p314xaae8f345.mm.app.u) concurrentHashMap.get(str2);
            if (uVar == null) {
                concurrentHashMap.put(str2, new com.p314xaae8f345.mm.app.u(str, kVar));
            } else if (!uVar.a(str, kVar)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppForegroundDelegate", "[countState] activityName=%s duplicate resume", str);
            }
        } else if (kVar == kVar3) {
            com.p314xaae8f345.mm.app.u uVar2 = (com.p314xaae8f345.mm.app.u) concurrentHashMap.get(str2);
            if (uVar2 == null) {
                concurrentHashMap.put(str2, new com.p314xaae8f345.mm.app.u(str, kVar));
            } else if (!uVar2.a(str, kVar)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppForegroundDelegate", "[countState] activityName=%s duplicate pause", str);
            }
        }
        com.p314xaae8f345.mm.app.k kVar4 = com.p314xaae8f345.mm.app.k.STARTED;
        if (kVar == kVar4) {
            if (!this.f135291e.f135310c.f135422n) {
                this.f135291e.f135309b.a(true, str);
            }
            this.f135290d.remove(str);
        }
        if ((kVar == com.p314xaae8f345.mm.app.k.CREATED || kVar == kVar4 || kVar == kVar2 || kVar == kVar3) && (runnable = (wVar = this.f135291e.f135310c).f135417f) != null) {
            wVar.f135415d.removeCallbacks(runnable);
            this.f135291e.f135310c.f135417f = null;
        }
        if (kVar == kVar2) {
            com.p314xaae8f345.mm.app.w wVar4 = this.f135291e.f135310c;
            android.os.Handler handler = wVar4.f135415d;
            com.p314xaae8f345.mm.app.p pVar = new com.p314xaae8f345.mm.app.p(this, str);
            wVar4.f135417f = pVar;
            handler.postDelayed(pVar, 600L);
            return;
        }
        if (kVar == kVar3) {
            com.p314xaae8f345.mm.app.w wVar5 = this.f135291e.f135310c;
            android.os.Handler handler2 = wVar5.f135415d;
            com.p314xaae8f345.mm.app.q qVar = new com.p314xaae8f345.mm.app.q(this, str);
            wVar5.f135417f = qVar;
            handler2.postDelayed(qVar, 600L);
            return;
        }
        com.p314xaae8f345.mm.app.k kVar5 = com.p314xaae8f345.mm.app.k.STOPPED;
        if (kVar == kVar5 || kVar == com.p314xaae8f345.mm.app.k.DESTROY) {
            if (kVar == kVar5) {
                this.f135290d.add(str);
            }
            com.p314xaae8f345.mm.app.w wVar6 = this.f135291e.f135310c;
            if (wVar6.f135417f == null) {
                android.os.Handler handler3 = wVar6.f135415d;
                com.p314xaae8f345.mm.app.r rVar = new com.p314xaae8f345.mm.app.r(this, str);
                wVar6.f135417f = rVar;
                handler3.postDelayed(rVar, 600L);
            }
        }
    }

    public final java.lang.String b() {
        return bm5.f1.a() + "@" + android.os.Process.myPid();
    }

    public final void c(com.p314xaae8f345.mm.app.k kVar, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(kVar.f135006d);
        intent.putExtra("_application_context_process_", b());
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME", str);
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent, com.p314xaae8f345.mm.app.w.f135407s);
    }

    public final void d(com.p314xaae8f345.mm.app.l lVar, android.app.Activity activity) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(lVar.f135023d);
        intent.putExtra("_application_context_process_", b());
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_CLASS_NAME", activity.getClass().getName());
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_REF", activity.hashCode() + "");
    }

    public final void e(java.lang.String str, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.Intent.ACTION_NET_STATS");
        intent.putExtra("ui", str);
        intent.putExtra("opCode", i17);
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.app.o(this, intent), "TrafficMonitorBroadcast");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.lang.String str = activity.getClass().getName() + "@" + activity.hashCode();
        com.p314xaae8f345.mm.app.w.f135408t = str;
        this.f135291e.f135310c.f135418g = new java.lang.ref.WeakReference(activity);
        com.p314xaae8f345.mm.app.w.f135410v.add(activity.getClass().getName());
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        com.p314xaae8f345.mm.app.k kVar = com.p314xaae8f345.mm.app.k.CREATED;
        if (n17) {
            a(str, b(), kVar);
        } else {
            c(kVar, str);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        java.lang.String str = activity.getClass().getName() + "@" + activity.hashCode();
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        com.p314xaae8f345.mm.app.k kVar = com.p314xaae8f345.mm.app.k.DESTROY;
        if (n17) {
            a(str, b(), kVar);
        } else {
            c(kVar, str);
        }
        d(com.p314xaae8f345.mm.app.l.EXIT, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        com.p314xaae8f345.mm.app.w.f135411w = false;
        java.lang.String str = activity.getClass().getName() + "@" + activity.hashCode();
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        com.p314xaae8f345.mm.app.k kVar = com.p314xaae8f345.mm.app.k.PAUSED;
        if (n17) {
            a(str, b(), kVar);
        } else {
            c(kVar, str);
        }
        e(activity.getClass().getSimpleName(), 4);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
        d(com.p314xaae8f345.mm.app.l.ENTER, activity);
        this.f135291e.f135310c.f135419h = new java.lang.ref.WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        com.p314xaae8f345.mm.app.w.f135411w = true;
        java.lang.String str = activity.getClass().getName() + "@" + activity.hashCode();
        this.f135291e.f135310c.f135419h = new java.lang.ref.WeakReference(activity);
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        com.p314xaae8f345.mm.app.k kVar = com.p314xaae8f345.mm.app.k.RESUMED;
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
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        com.p314xaae8f345.mm.app.k kVar = com.p314xaae8f345.mm.app.k.STARTED;
        if (n17) {
            a(str, b(), kVar);
        } else {
            c(kVar, str);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        java.lang.String str = activity.getClass().getName() + "@" + activity.hashCode();
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        com.p314xaae8f345.mm.app.k kVar = com.p314xaae8f345.mm.app.k.STOPPED;
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
            com.p314xaae8f345.mm.app.k kVar = com.p314xaae8f345.mm.app.k.RESUMED;
            com.p314xaae8f345.mm.app.k kVar2 = com.p314xaae8f345.mm.app.k.STARTED;
            com.p314xaae8f345.mm.app.k kVar3 = equals ? kVar2 : action.equals("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_RESUMED") ? kVar : action.equals("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_PAUSED") ? com.p314xaae8f345.mm.app.k.PAUSED : action.equals("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_STOPPED") ? com.p314xaae8f345.mm.app.k.STOPPED : null;
            if (kVar3 == kVar2 || kVar3 == kVar) {
                com.p314xaae8f345.mm.app.m mVar = com.p314xaae8f345.mm.app.w.f135412x;
                mVar.f135046g = false;
                this.f135291e.f135310c.f135415d.removeCallbacks(mVar);
            }
            if (kVar3 != null) {
                a(intent.getStringExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME"), intent.getStringExtra("_application_context_process_"), kVar3);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppForegroundDelegate", "ACTION_SCREEN:%s isAppForeground:%s", action, java.lang.Boolean.valueOf(this.f135291e.f135310c.f135422n));
        if ("android.intent.action.SCREEN_OFF".equals(action)) {
            com.p314xaae8f345.mm.app.t tVar = this.f135291e;
            com.p314xaae8f345.mm.app.w wVar = tVar.f135310c;
            wVar.f135425q = true;
            com.p314xaae8f345.mm.app.m mVar2 = com.p314xaae8f345.mm.app.w.f135412x;
            com.p314xaae8f345.mm.app.v vVar = tVar.f135309b;
            android.os.Handler handler = wVar.f135415d;
            mVar2.f135043d = vVar;
            mVar2.f135045f = handler;
            mVar2.f135044e = 0;
            mVar2.f135046g = true;
            handler.postDelayed(mVar2, 5000L);
        } else {
            this.f135291e.f135310c.f135415d.removeCallbacks(com.p314xaae8f345.mm.app.w.f135412x);
            this.f135291e.f135310c.f135425q = false;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.app.n(this), "MicroMsg.AppForegroundDelegate");
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
    }
}

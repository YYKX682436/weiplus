package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.a0 f134429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.ComponentName f134430e;

    public z(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.a0 a0Var, android.content.ComponentName componentName) {
        this.f134429d = a0Var;
        this.f134430e = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k kVar;
        oj.j.b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.b(), "onServiceDisconnected " + this.f134430e, new java.lang.Object[0]);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134362f = null;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134275x.h(null);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.f19976x233c02ec.getClass();
        concurrentHashMap = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.f19977x9d3dd13a;
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9 c4684xa6b8b6c9 = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9) ((java.util.Map.Entry) it.next()).getValue();
            kVar = c4684xa6b8b6c9.attachedObserver;
            if (kVar != null) {
                c4684xa6b8b6c9.getAttachedSource().mo40970xb5bdeb7a(kVar);
            }
            c4684xa6b8b6c9.attachedObserver = null;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0 d0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k;
        oj.j.c(d0Var.b(), "DispatcherStateOwners detached", new java.lang.Object[0]);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4691x67659369.f134337d.a(this.f134429d.f134351d);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.a0 a0Var = this.f134429d;
        java.lang.String b17 = d0Var.b();
        try {
            this.f134429d.f134351d.unbindService(a0Var);
        } catch (java.lang.Throwable th6) {
            oj.j.d(b17, th6, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.a0 a0Var2 = this.f134429d;
        try {
            a0Var2.f134351d.bindService(a0Var2.f134352e, a0Var2, 32);
            oj.j.b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.b(), "rebound supervisor", new java.lang.Object[0]);
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0 d0Var2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k;
            oj.j.d(d0Var2.b(), th7, "rebound supervisor failed", new java.lang.Object[0]);
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4690x9af4e045 c4690x9af4e045 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4690x9af4e045.f134333e;
            android.app.Application context = this.f134429d.f134351d;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.y yVar = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.y(this);
            c4690x9af4e045.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4690x9af4e045.f134331c != null) {
                oj.j.b(d0Var2.b(), "SubordinatePacemaker: already installed", new java.lang.Object[0]);
                return;
            }
            if (d0Var2.d()) {
                return;
            }
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4690x9af4e045.f134332d = yVar;
            java.lang.String str = oj.m.f427242b;
            if (str == null) {
                str = context.getPackageName();
                oj.m.f427242b = str;
            }
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4690x9af4e045.f134329a = str;
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("SUPERVISOR_INSTALLED");
            if (android.os.Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 34) {
                context.registerReceiver(c4690x9af4e045, intentFilter, (java.lang.String) ((jz5.n) com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4690x9af4e045.f134330b).mo141623x754a37bb(), null);
            } else {
                context.registerReceiver(c4690x9af4e045, intentFilter, (java.lang.String) ((jz5.n) com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4690x9af4e045.f134330b).mo141623x754a37bb(), null, 4);
            }
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4690x9af4e045.f134331c = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g0(yVar);
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4661x636abfbb interfaceC4661x636abfbb = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134266o;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k kVar2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4690x9af4e045.f134331c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar2);
            interfaceC4661x636abfbb.mo40966xc74540ab(kVar2);
        }
    }
}

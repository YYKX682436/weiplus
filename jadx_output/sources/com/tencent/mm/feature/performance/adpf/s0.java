package com.tencent.mm.feature.performance.adpf;

@j95.b
/* loaded from: classes12.dex */
public final class s0 extends i95.w implements ob0.f {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f67482d = jz5.h.b(com.tencent.mm.feature.performance.adpf.i.f67426d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f67483e = jz5.h.b(com.tencent.mm.feature.performance.adpf.g.f67420d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f67484f = jz5.h.b(com.tencent.mm.feature.performance.adpf.e.f67413d);

    public final void Ai() {
        java.util.Iterator it = com.tencent.mm.feature.performance.adpf.x1.f67507f.a().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((com.tencent.mm.feature.performance.adpf.x1) it.next()).j();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", "dumpAllCallbacks: " + i17);
        for (com.tencent.mm.feature.performance.adpf.x1 x1Var : com.tencent.mm.feature.performance.adpf.x1.f67507f.a()) {
            synchronized (x1Var.f()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(x1Var.e());
                sb6.append(" dump: ");
                sb6.append(x1Var.j());
                sb6.append(", list=");
                java.util.List f17 = x1Var.f();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(f17, 10));
                java.util.Iterator it6 = f17.iterator();
                while (it6.hasNext()) {
                    arrayList.add(((com.tencent.mm.feature.performance.adpf.b) ((ob0.e) it6.next())).f67394d.getName());
                }
                sb6.append(arrayList);
                com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", sb6.toString());
            }
        }
    }

    public void Bi(java.lang.String type) {
        kotlin.jvm.internal.o.g(type, "type");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (kz5.c0.i("ANR", "SIGNAL_ANR", "LAG", "LAG_IDLE_HANDLER", "LAG_TOUCH").contains(type)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", "onLagging: ".concat(type));
            com.tencent.mm.feature.performance.adpf.IAdpfState.Companion.d(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_UI_LAGGING).turnOnSync();
            ((com.tencent.mm.feature.performance.adpf.b2) ((jz5.n) f67482d).getValue()).a(30000L, 1800000L);
        }
    }

    public void Di(ob0.d callback) {
        java.lang.Object obj;
        java.lang.Class cls;
        java.lang.Object obj2;
        com.tencent.mm.feature.performance.adpf.x1 x1Var;
        f06.d[] dVarArr;
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.Iterator it = com.tencent.mm.feature.performance.adpf.x1.f67507f.a().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((com.tencent.mm.feature.performance.adpf.x1) obj).b(callback)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.tencent.mm.feature.performance.adpf.x1 x1Var2 = (com.tencent.mm.feature.performance.adpf.x1) obj;
        if (x1Var2 != null) {
            throw new java.lang.IllegalStateException(("AdpfCallback already registered: " + callback.getClass().getName() + ", scheduler=" + x1Var2.e()).toString());
        }
        java.util.List list = (java.util.List) ((jz5.n) com.tencent.mm.feature.performance.adpf.x1.f67509h).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (callback.getClass().isAnnotationPresent((java.lang.Class) obj3)) {
                arrayList.add(obj3);
            }
        }
        if (arrayList.size() > 1) {
            throw new java.lang.IllegalStateException(("AdpfCallback can only be annotated with 1 policy, present: " + arrayList).toString());
        }
        java.util.List list2 = (java.util.List) ((jz5.n) com.tencent.mm.feature.performance.adpf.x1.f67510i).getValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj4 : list2) {
            if (callback.getClass().isAnnotationPresent((java.lang.Class) obj4)) {
                arrayList2.add(obj4);
            }
        }
        if (arrayList2.contains(com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$RunThreadsWithLowEnergy.class) && arrayList2.contains(com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$OnLowEnergy.class)) {
            throw new java.lang.IllegalStateException(("AdpfCallback can only be annotated with 1 low-energy callback, present: " + arrayList2).toString());
        }
        if (callback.getClass().isAnnotationPresent(com.tencent.mm.feature.performance.api.AdpfAnno$SchedulePolicy$Foreground.class)) {
            java.lang.annotation.Annotation annotation = callback.getClass().getAnnotation(com.tencent.mm.feature.performance.api.AdpfAnno$SchedulePolicy$Foreground.class);
            kotlin.jvm.internal.o.d(annotation);
            cls = ((com.tencent.mm.feature.performance.api.AdpfAnno$SchedulePolicy$Foreground) annotation).multiProcessMode() ? com.tencent.mm.feature.performance.adpf.l1.class : com.tencent.mm.feature.performance.adpf.k1.class;
        } else {
            cls = callback.getClass().isAnnotationPresent(com.tencent.mm.feature.performance.api.AdpfAnno$SchedulePolicy$Batch.class) ? com.tencent.mm.feature.performance.adpf.c1.class : callback.getClass().isAnnotationPresent(com.tencent.mm.feature.performance.api.AdpfAnno$SchedulePolicy$Idle.class) ? com.tencent.mm.feature.performance.adpf.q1.class : callback.getClass().isAnnotationPresent(com.tencent.mm.feature.performance.api.AdpfAnno$SchedulePolicy$Critical.class) ? com.tencent.mm.feature.performance.adpf.j1.class : com.tencent.mm.feature.performance.adpf.k1.class;
        }
        if (callback.getClass().isAnnotationPresent(com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$BindingUI.class)) {
            java.util.List[] listArr = new java.util.List[2];
            java.lang.annotation.Annotation annotation2 = callback.getClass().getAnnotation(com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$BindingUI.class);
            kotlin.jvm.internal.o.d(annotation2);
            listArr[0] = kz5.z.z0(((com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$BindingUI) annotation2).activityNames());
            java.lang.annotation.Annotation annotation3 = callback.getClass().getAnnotation(com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$BindingUI.class);
            kotlin.jvm.internal.o.d(annotation3);
            java.lang.Class<? extends android.app.Activity>[] activities = ((com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$BindingUI) annotation3).activities();
            kotlin.jvm.internal.j0 j0Var = kotlin.jvm.internal.i0.f310124a;
            int length = activities.length;
            if (length == 0) {
                dVarArr = kotlin.jvm.internal.i0.f310125b;
            } else {
                f06.d[] dVarArr2 = new f06.d[length];
                for (int i17 = 0; i17 < length; i17++) {
                    dVarArr2[i17] = kotlin.jvm.internal.i0.a(activities[i17]);
                }
                dVarArr = dVarArr2;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(dVarArr.length);
            for (f06.d dVar : dVarArr) {
                arrayList3.add(xz5.a.b(dVar).getName());
            }
            listArr[1] = arrayList3;
            obj2 = kz5.d0.r(kz5.c0.i(listArr));
        } else {
            obj2 = kz5.p0.f313996d;
        }
        java.util.Iterator it6 = com.tencent.mm.feature.performance.adpf.x1.f67507f.a().iterator();
        while (true) {
            if (!it6.hasNext()) {
                x1Var = (com.tencent.mm.feature.performance.adpf.x1) cls.getConstructor(java.util.List.class).newInstance(obj2);
                java.util.List a17 = com.tencent.mm.feature.performance.adpf.x1.f67507f.a();
                kotlin.jvm.internal.o.d(x1Var);
                a17.add(x1Var);
                break;
            }
            x1Var = (com.tencent.mm.feature.performance.adpf.x1) it6.next();
            if (kotlin.jvm.internal.o.b(x1Var.getClass(), cls) && kotlin.jvm.internal.o.b(x1Var.d(), obj2)) {
                break;
            }
        }
        synchronized (x1Var.f()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", x1Var.e() + " register: " + callback.getName());
            x1Var.k();
            x1Var.i(callback);
            com.tencent.mm.feature.performance.adpf.b bVar = new com.tencent.mm.feature.performance.adpf.b(x1Var, callback);
            bVar.j(x1Var.c("Init"));
            x1Var.f().add(bVar);
        }
        Ai();
    }

    public void Ni(java.lang.String stateName, boolean z17) {
        kotlin.jvm.internal.o.g(stateName, "stateName");
        com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState d17 = com.tencent.mm.feature.performance.adpf.IAdpfState.Companion.d(stateName);
        if (z17) {
            d17.turnOnSync();
        } else {
            d17.turnOffSync();
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        android.os.PowerManager powerManager;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.feature.performance.adpf.k2 k2Var = com.tencent.mm.feature.performance.adpf.IAdpfState.Companion;
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_FG);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_FG_MULTIPROCESS);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_ON_VOIP);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_ON_FINDER);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_ON_LIVE);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_ON_LIVE_ANCHOR);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_BATTERY_TEMPERATURE_HIGH);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_BATTERY_TEMPERATURE_HIGH_CRITICAL);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_BATTERY_LOW);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_THERMAL_HIGH);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_THERMAL_HIGH_CRITICAL);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_POWER_SAVE_MODE_ON);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_CPU_LOAD_HIGH);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_CPU_LOAD_HIGH_CRITICAL);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_MEMORY_LOW);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_UI_LAGGING);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_ON_CHARGING);
        k2Var.b(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_BG_SCHEDULE);
        com.tencent.matrix.lifecycle.t0 t0Var = com.tencent.matrix.lifecycle.t0.f52900d;
        k2Var.a(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_COMPOSITE_FG, new com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner(t0Var, k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_FG), k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_FG_MULTIPROCESS)));
        com.tencent.matrix.lifecycle.s0 s0Var = com.tencent.matrix.lifecycle.s0.f52790d;
        k2Var.a(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_COMPOSITE_IDLE_CHARGING, new com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner(s0Var, k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_ON_CHARGING), k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_BG_SCHEDULE)));
        k2Var.a(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_COMPOSITE_ON_VIPS, new com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner(t0Var, k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_ON_VOIP), k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_ON_FINDER), k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_ON_LIVE), k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_ON_LIVE_ANCHOR)));
        k2Var.a(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_COMPOSITE_RESTRICTED, new com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner(t0Var, k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_BATTERY_TEMPERATURE_HIGH), k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_BATTERY_LOW), k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_THERMAL_HIGH), k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_POWER_SAVE_MODE_ON), k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_CPU_LOAD_HIGH), k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_MEMORY_LOW), k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_UI_LAGGING)));
        k2Var.a(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_COMPOSITE_EMERGENCY, new com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner(t0Var, new com.tencent.matrix.lifecycle.StatefulOwnerKt$shadow$1(new com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner(s0Var, k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_BATTERY_TEMPERATURE_HIGH), k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_THERMAL_HIGH), k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_CPU_LOAD_HIGH)), false, false), new com.tencent.matrix.lifecycle.StatefulOwnerKt$shadow$1(new com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner(t0Var, k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_BATTERY_TEMPERATURE_HIGH_CRITICAL), k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_THERMAL_HIGH_CRITICAL), k2Var.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_CPU_LOAD_HIGH_CRITICAL)), false, false)));
        com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.addLifecycleCallback(new com.tencent.mm.feature.performance.adpf.s());
        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner appExplicitBackgroundOwner = com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE;
        appExplicitBackgroundOwner.addLifecycleCallback(new com.tencent.mm.feature.performance.adpf.u());
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(a0Var) { // from class: com.tencent.mm.feature.performance.adpf.AdpfFeatureService$initListeners$3

            /* renamed from: d, reason: collision with root package name */
            public final jz5.g f67386d = jz5.h.b(com.tencent.mm.feature.performance.adpf.v.f67496d);

            {
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                com.tencent.mm.autogen.events.VoipEvent event = voipEvent;
                kotlin.jvm.internal.o.g(event, "event");
                boolean wi6 = ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).wi();
                jz5.g gVar = this.f67386d;
                am.y00 y00Var = event.f54945g;
                if (wi6) {
                    if (((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) ((jz5.n) gVar).getValue()).active()) {
                        return false;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", "on voip launched: %s", java.lang.Integer.valueOf(y00Var.f8415b));
                    ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) ((jz5.n) gVar).getValue()).turnOnSync();
                    return false;
                }
                if (!((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) ((jz5.n) gVar).getValue()).active()) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", "on voip stopped: %s", java.lang.Integer.valueOf(y00Var.f8415b));
                ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) ((jz5.n) gVar).getValue()).turnOffSync();
                return false;
            }
        }.alive();
        ob0.f3 f3Var = (ob0.f3) i95.n0.c(ob0.f3.class);
        com.tencent.mm.feature.performance.adpf.y yVar = new com.tencent.mm.feature.performance.adpf.y();
        ((vk.n) f3Var).getClass();
        vk.l lVar = vk.n.f437741d;
        synchronized (vk.l.b(lVar)) {
            vk.l.b(lVar).add(yVar);
        }
        ph.e eVar = ph.t.f354285m;
        if (eVar.b()) {
            jz5.g b17 = jz5.h.b(com.tencent.mm.feature.performance.adpf.p0.f67462d);
            jz5.g b18 = jz5.h.b(com.tencent.mm.feature.performance.adpf.h0.f67424d);
            jz5.g b19 = jz5.h.b(com.tencent.mm.feature.performance.adpf.g0.f67421d);
            jz5.g b27 = jz5.h.b(com.tencent.mm.feature.performance.adpf.f0.f67416d);
            jz5.g b28 = jz5.h.b(com.tencent.mm.feature.performance.adpf.q0.f67466d);
            com.tencent.mm.feature.performance.adpf.n0 n0Var = new com.tencent.mm.feature.performance.adpf.n0(b17);
            com.tencent.mm.feature.performance.adpf.i0 i0Var = new com.tencent.mm.feature.performance.adpf.i0(b27);
            com.tencent.mm.feature.performance.adpf.l0 l0Var = new com.tencent.mm.feature.performance.adpf.l0(b18, b19);
            com.tencent.mm.feature.performance.adpf.o0 o0Var = new com.tencent.mm.feature.performance.adpf.o0(b28);
            ph.c c17 = eVar.a().c();
            n0Var.invoke(java.lang.Boolean.valueOf(c17.d()));
            i0Var.invoke(java.lang.Integer.valueOf(c17.b()));
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            l0Var.invoke(java.lang.Integer.valueOf(wh.m.l(context2)));
            o0Var.invoke(java.lang.Boolean.valueOf(c17.c()));
            eVar.a().b(new com.tencent.mm.feature.performance.adpf.z(i0Var, n0Var, l0Var, o0Var));
        }
        if (android.os.Build.VERSION.SDK_INT >= 29 && (powerManager = (android.os.PowerManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(android.os.PowerManager.class)) != null) {
            com.tencent.mm.feature.performance.adpf.d0 d0Var = new com.tencent.mm.feature.performance.adpf.d0(new kotlin.jvm.internal.h0());
            d0Var.invoke(java.lang.Integer.valueOf(powerManager.getCurrentThermalStatus()));
            powerManager.addThermalStatusListener(new com.tencent.mm.feature.performance.adpf.a0(d0Var));
        }
        ob0.f3 f3Var2 = (ob0.f3) i95.n0.c(ob0.f3.class);
        com.tencent.mm.feature.performance.adpf.e0 e0Var = new com.tencent.mm.feature.performance.adpf.e0();
        ((vk.n) f3Var2).getClass();
        synchronized (vk.l.c(lVar)) {
            vk.l.c(lVar).add(e0Var);
        }
        if (com.tencent.mm.feature.performance.adpf.p2.f67464a) {
            appExplicitBackgroundOwner.addLifecycleCallback(new com.tencent.mm.feature.performance.adpf.o2());
        }
    }

    public void wi(java.lang.String stateName, boolean z17) {
        kotlin.jvm.internal.o.g(stateName, "stateName");
        for (com.tencent.mm.feature.performance.adpf.x1 x1Var : com.tencent.mm.feature.performance.adpf.x1.f67507f.a()) {
            com.tencent.mm.feature.performance.adpf.IAdpfState.Companion.getClass();
            ob0.g allStates = (ob0.g) ((jz5.n) com.tencent.mm.feature.performance.adpf.k2.f67441c).getValue();
            x1Var.getClass();
            kotlin.jvm.internal.o.g(allStates, "allStates");
            synchronized (x1Var.f()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(x1Var.e());
                sb6.append(" dispatchStateChanged: ");
                sb6.append(stateName);
                sb6.append('=');
                sb6.append(z17 ? "on" : "off");
                sb6.append(", list=");
                sb6.append(x1Var.f().size());
                com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", sb6.toString());
                if (!x1Var.f().isEmpty()) {
                    com.tencent.mm.feature.performance.adpf.s1 s1Var = new com.tencent.mm.feature.performance.adpf.s1(x1Var, stateName, allStates, z17);
                    android.os.Looper myLooper = android.os.Looper.myLooper();
                    jz5.g gVar = com.tencent.mm.feature.performance.adpf.a2.f67391a;
                    if (kotlin.jvm.internal.o.b(myLooper, ((android.os.Handler) ((jz5.n) gVar).getValue()).getLooper())) {
                        s1Var.invoke();
                    } else {
                        ((android.os.Handler) ((jz5.n) gVar).getValue()).post(new com.tencent.mm.feature.performance.adpf.v1(s1Var));
                    }
                }
            }
        }
    }
}

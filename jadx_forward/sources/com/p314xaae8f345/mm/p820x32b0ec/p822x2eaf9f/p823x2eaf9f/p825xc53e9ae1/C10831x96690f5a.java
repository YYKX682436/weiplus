package com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p825xc53e9ae1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/live/core/core/player/FinderPageExitPlayerDetector;", "Lcom/tencent/plugin/finder/detector/api/detect/FinderEventDetector;", "Lmn0/b0;", "<init>", "()V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.live.core.core.player.FinderPageExitPlayerDetector */
/* loaded from: classes10.dex */
public class C10831x96690f5a extends com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25299xa70d21da<mn0.b0> {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        if (r0 == null) goto L26;
     */
    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6516x7962e81f r8, ls5.f r9, ns5.a r10) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p825xc53e9ae1.C10831x96690f5a.a(com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct, ls5.f, ns5.a):void");
    }

    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public java.lang.String g() {
        return "FinderPageExitPlayerDetector";
    }

    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public long h() {
        return 2L;
    }

    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public java.util.Map i(java.lang.String detectorSource) {
        java.lang.String str;
        boolean z17;
        boolean z18;
        boolean z19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectorSource, "detectorSource");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f296759d;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            android.view.View s17 = s((ls5.f) entry.getValue());
            android.app.Activity f17 = f(s17);
            ls5.d dVar = ((mn0.y) ((mn0.b0) ((ls5.f) entry.getValue()).f402664a)).f411340f;
            ls5.l lVar = dVar != null ? dVar.f402661h : null;
            java.lang.String str2 = this.f296760e;
            if (lVar != null) {
                z18 = lVar.a();
            } else {
                if (f17 != null) {
                    z17 = f17 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) f17).m78542x6d20d943() : f17.isDestroyed();
                } else {
                    ls5.d dVar2 = ((mn0.y) ((mn0.b0) ((ls5.f) entry.getValue()).f402664a)).f411340f;
                    if (dVar2 == null || (str = dVar2.f402658e) == null) {
                        str = "";
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkBindActivityDestroyed activityKey: ");
                    sb6.append(str);
                    sb6.append(" Sets: ");
                    java.util.HashSet hashSet = ms5.f.f412692b;
                    sb6.append(hashSet);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                    z17 = !hashSet.contains(str);
                }
                z18 = !z17;
            }
            ls5.d dVar3 = ((mn0.y) ((mn0.b0) ((ls5.f) entry.getValue()).f402664a)).f411340f;
            android.view.View view = dVar3 != null ? dVar3.f402655b : null;
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
            if (activityManager != null) {
                java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(runningServices, "getRunningServices(...)");
                java.util.Iterator<T> it = runningServices.iterator();
                while (it.hasNext()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((android.app.ActivityManager.RunningServiceInfo) it.next()).service.getClassName(), com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.ServiceC10842xd12fe846.class.getName())) {
                        z19 = true;
                        break;
                    }
                }
            }
            z19 = false;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("getLeaks eventName: ");
            sb7.append(((ls5.f) entry.getValue()).b());
            sb7.append(" detectorSource: ");
            sb7.append(detectorSource);
            sb7.append(" playerView: ");
            sb7.append(s17);
            sb7.append(" pageContext: ");
            sb7.append(f17);
            sb7.append(" hasCode: ");
            sb7.append(f17 != null ? java.lang.Integer.valueOf(f17.hashCode()) : null);
            sb7.append(" isActive: ");
            sb7.append(z18);
            sb7.append(" miniWindowView: ");
            sb7.append(view);
            sb7.append(" detectorLifeCycle: ");
            sb7.append(lVar);
            sb7.append(" hadForeService: ");
            sb7.append(z19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
            if ((z18 || r(s17) || r(view) || z19) ? false : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public int j() {
        return 4;
    }

    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public java.lang.String k(ls5.f event, ns5.a detectParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectParams, "detectParams");
        android.view.View s17 = s(event);
        android.app.Activity f17 = f(s17);
        java.lang.Object obj = event.f402664a;
        ls5.d dVar = ((mn0.y) ((mn0.b0) obj)).f411340f;
        android.view.View view = dVar != null ? dVar.f402655b : null;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("player", obj);
        jSONObject.put("isMute", java.lang.Boolean.valueOf(((mn0.y) ((mn0.b0) obj)).f411343i));
        java.lang.Object obj2 = s17;
        if (s17 == null) {
            obj2 = "null";
        }
        jSONObject.put("playerView", obj2);
        jSONObject.put("detectorSource", detectParams.f421225a);
        jSONObject.put("activityContext", f17 != null ? f17 : "null");
        jSONObject.put("exptId", c19767x257d7f.f38864x6ac9171);
        jSONObject.put("groupId", c19767x257d7f2.f38864x6ac9171);
        jSONObject.put("isDestroyed", f17 != null ? f17.isDestroyed() : true);
        jSONObject.put("traceDump", detectParams.f421226b);
        if (view != null) {
            android.view.View rootView = view.getRootView();
            java.lang.Object layoutParams = rootView != null ? rootView.getLayoutParams() : null;
            android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
            boolean z17 = (layoutParams2 != null ? layoutParams2.type : 0) > 99;
            boolean z18 = view.isAttachedToWindow() && view.isShown();
            jSONObject.put("windowType", z17);
            jSONObject.put("isAttachShow", z18);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }

    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public void l(ls5.f event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleRecover isPlaying: ");
        java.lang.Object obj = event.f402664a;
        sb6.append(((mn0.y) ((mn0.b0) obj)).b(false));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f296760e, sb6.toString());
        if (((mn0.y) ((mn0.b0) obj)).b(false)) {
            mn0.b0.C((mn0.b0) obj, true, false, false, 6, null);
        }
        ((mn0.y) ((mn0.b0) obj)).w();
    }

    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public boolean m() {
        fn0.g gVar = fn0.g.f345728a;
        if (fn0.g.f345729b != null) {
            return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.B0).mo141623x754a37bb()).r()).intValue() == 1;
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25298xba75790f
    public void o(java.util.Map leaks) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(leaks, "leaks");
        java.util.Iterator it = leaks.entrySet().iterator();
        while (it.hasNext()) {
            mn0.d0 d0Var = ((mn0.y) ((mn0.b0) ((ls5.f) ((java.util.Map.Entry) it.next()).getValue()).f402664a)).n().f411290w;
            java.util.Map map = mn0.i0.K;
            synchronized (map) {
                if (!map.containsKey(d0Var) || map.get(d0Var) == null) {
                    map.put(d0Var, 1);
                } else {
                    java.lang.Integer num = (java.lang.Integer) map.get(d0Var);
                    map.put(d0Var, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
            }
        }
        mn0.i0.H.a();
    }

    @Override // com.p314xaae8f345.p2886xc5476f33.p2887xb4097826.p2888x3e7b17c6.api.p2889xb06a26a3.AbstractC25299xa70d21da
    public boolean r(android.view.View view) {
        boolean z17;
        if (view != null) {
            java.lang.String str = "isFloatMode view: " + view + " it.rootView = " + view.getRootView() + " layoutParams: " + view.getRootView().getLayoutParams();
            java.lang.String str2 = this.f296760e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
            android.view.ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
            android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                fn0.g gVar = fn0.g.f345728a;
                if (fn0.g.f345729b != null) {
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.K5).mo141623x754a37bb()).r()).intValue() == 1) {
                        z17 = true;
                        boolean z18 = z17 || (view.isAttachedToWindow() && view.isShown());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "isFloatMode type = " + layoutParams2.type + " isShown: " + view.isShown() + " isAttachedToWindow: " + view.isAttachedToWindow() + " floatOtherCheck: " + z18);
                        if (layoutParams2.type <= 99 && z18) {
                            return true;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "isFloatMode type = " + layoutParams2.type + " isShown: " + view.isShown() + " isAttachedToWindow: " + view.isAttachedToWindow() + " floatOtherCheck: " + z18);
                if (layoutParams2.type <= 99) {
                }
            }
        }
        return false;
    }

    public final android.view.View s(ls5.f fVar) {
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf o17 = ((mn0.y) ((mn0.b0) fVar.f402664a)).o();
        if (o17 == null) {
            return null;
        }
        android.view.SurfaceView f150155g = o17.getF150155g();
        return f150155g != null ? f150155g : o17.mo46536x4ee17f0a();
    }
}

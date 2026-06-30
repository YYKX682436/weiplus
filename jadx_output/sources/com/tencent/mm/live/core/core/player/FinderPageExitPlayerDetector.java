package com.tencent.mm.live.core.core.player;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/live/core/core/player/FinderPageExitPlayerDetector;", "Lcom/tencent/plugin/finder/detector/api/detect/FinderEventDetector;", "Lmn0/b0;", "<init>", "()V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class FinderPageExitPlayerDetector extends com.tencent.plugin.finder.detector.api.detect.FinderEventDetector<mn0.b0> {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        if (r0 == null) goto L26;
     */
    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct r8, ls5.f r9, ns5.a r10) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.live.core.core.player.FinderPageExitPlayerDetector.a(com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct, ls5.f, ns5.a):void");
    }

    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public java.lang.String g() {
        return "FinderPageExitPlayerDetector";
    }

    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public long h() {
        return 2L;
    }

    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public java.util.Map i(java.lang.String detectorSource) {
        java.lang.String str;
        boolean z17;
        boolean z18;
        boolean z19;
        kotlin.jvm.internal.o.g(detectorSource, "detectorSource");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f215226d;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            android.view.View s17 = s((ls5.f) entry.getValue());
            android.app.Activity f17 = f(s17);
            ls5.d dVar = ((mn0.y) ((mn0.b0) ((ls5.f) entry.getValue()).f321131a)).f329807f;
            ls5.l lVar = dVar != null ? dVar.f321128h : null;
            java.lang.String str2 = this.f215227e;
            if (lVar != null) {
                z18 = lVar.a();
            } else {
                if (f17 != null) {
                    z17 = f17 instanceof com.tencent.mm.ui.MMActivity ? ((com.tencent.mm.ui.MMActivity) f17).isStopped() : f17.isDestroyed();
                } else {
                    ls5.d dVar2 = ((mn0.y) ((mn0.b0) ((ls5.f) entry.getValue()).f321131a)).f329807f;
                    if (dVar2 == null || (str = dVar2.f321125e) == null) {
                        str = "";
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkBindActivityDestroyed activityKey: ");
                    sb6.append(str);
                    sb6.append(" Sets: ");
                    java.util.HashSet hashSet = ms5.f.f331159b;
                    sb6.append(hashSet);
                    com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                    z17 = !hashSet.contains(str);
                }
                z18 = !z17;
            }
            ls5.d dVar3 = ((mn0.y) ((mn0.b0) ((ls5.f) entry.getValue()).f321131a)).f329807f;
            android.view.View view = dVar3 != null ? dVar3.f321122b : null;
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
            if (activityManager != null) {
                java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
                kotlin.jvm.internal.o.f(runningServices, "getRunningServices(...)");
                java.util.Iterator<T> it = runningServices.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.o.b(((android.app.ActivityManager.RunningServiceInfo) it.next()).service.getClassName(), com.tencent.mm.live.core.mini.LiveForegroundService.class.getName())) {
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
            com.tencent.mars.xlog.Log.i(str2, sb7.toString());
            if ((z18 || r(s17) || r(view) || z19) ? false : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public int j() {
        return 4;
    }

    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public java.lang.String k(ls5.f event, ns5.a detectParams) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(detectParams, "detectParams");
        android.view.View s17 = s(event);
        android.app.Activity f17 = f(s17);
        java.lang.Object obj = event.f321131a;
        ls5.d dVar = ((mn0.y) ((mn0.b0) obj)).f329807f;
        android.view.View view = dVar != null ? dVar.f321122b : null;
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("player", obj);
        jSONObject.put("isMute", java.lang.Boolean.valueOf(((mn0.y) ((mn0.b0) obj)).f329810i));
        java.lang.Object obj2 = s17;
        if (s17 == null) {
            obj2 = "null";
        }
        jSONObject.put("playerView", obj2);
        jSONObject.put("detectorSource", detectParams.f339692a);
        jSONObject.put("activityContext", f17 != null ? f17 : "null");
        jSONObject.put("exptId", pInt.value);
        jSONObject.put("groupId", pInt2.value);
        jSONObject.put("isDestroyed", f17 != null ? f17.isDestroyed() : true);
        jSONObject.put("traceDump", detectParams.f339693b);
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
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }

    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public void l(ls5.f event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleRecover isPlaying: ");
        java.lang.Object obj = event.f321131a;
        sb6.append(((mn0.y) ((mn0.b0) obj)).b(false));
        com.tencent.mars.xlog.Log.i(this.f215227e, sb6.toString());
        if (((mn0.y) ((mn0.b0) obj)).b(false)) {
            mn0.b0.C((mn0.b0) obj, true, false, false, 6, null);
        }
        ((mn0.y) ((mn0.b0) obj)).w();
    }

    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public boolean m() {
        fn0.g gVar = fn0.g.f264195a;
        if (fn0.g.f264196b != null) {
            return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.B0).getValue()).r()).intValue() == 1;
        }
        return false;
    }

    @Override // com.tencent.plugin.finder.detector.api.detect.BaseEventDetector
    public void o(java.util.Map leaks) {
        kotlin.jvm.internal.o.g(leaks, "leaks");
        java.util.Iterator it = leaks.entrySet().iterator();
        while (it.hasNext()) {
            mn0.d0 d0Var = ((mn0.y) ((mn0.b0) ((ls5.f) ((java.util.Map.Entry) it.next()).getValue()).f321131a)).n().f329757w;
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

    @Override // com.tencent.plugin.finder.detector.api.detect.FinderEventDetector
    public boolean r(android.view.View view) {
        boolean z17;
        if (view != null) {
            java.lang.String str = "isFloatMode view: " + view + " it.rootView = " + view.getRootView() + " layoutParams: " + view.getRootView().getLayoutParams();
            java.lang.String str2 = this.f215227e;
            com.tencent.mars.xlog.Log.i(str2, str);
            android.view.ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
            android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                fn0.g gVar = fn0.g.f264195a;
                if (fn0.g.f264196b != null) {
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.K5).getValue()).r()).intValue() == 1) {
                        z17 = true;
                        boolean z18 = z17 || (view.isAttachedToWindow() && view.isShown());
                        com.tencent.mars.xlog.Log.i(str2, "isFloatMode type = " + layoutParams2.type + " isShown: " + view.isShown() + " isAttachedToWindow: " + view.isAttachedToWindow() + " floatOtherCheck: " + z18);
                        if (layoutParams2.type <= 99 && z18) {
                            return true;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                }
                com.tencent.mars.xlog.Log.i(str2, "isFloatMode type = " + layoutParams2.type + " isShown: " + view.isShown() + " isAttachedToWindow: " + view.isAttachedToWindow() + " floatOtherCheck: " + z18);
                if (layoutParams2.type <= 99) {
                }
            }
        }
        return false;
    }

    public final android.view.View s(ls5.f fVar) {
        com.tencent.rtmp.ui.TXCloudVideoView o17 = ((mn0.y) ((mn0.b0) fVar.f321131a)).o();
        if (o17 == null) {
            return null;
        }
        android.view.SurfaceView f68622g = o17.getF68622g();
        return f68622g != null ? f68622g : o17.getVideoView();
    }
}

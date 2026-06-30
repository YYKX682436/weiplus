package com.tencent.mm.feature.brandecs.flutter;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/feature/brandecs/flutter/FlutterBrsFinderLivePlayerPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Landroidx/lifecycle/v;", "Lcom/tencent/pigeon/biz_base/BizFinderLivePlayersManager;", "<init>", "()V", "plugin-brandecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FlutterBrsFinderLivePlayerPlugin implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, androidx.lifecycle.v, com.tencent.pigeon.biz_base.BizFinderLivePlayersManager {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.pigeon.biz_base.BizFinderLivePlayersCallbackApi f65217e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f65218f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.view.TextureRegistry f65219g;

    /* renamed from: p, reason: collision with root package name */
    public boolean f65225p;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f65216d = "MicroMsg.FlutterBrsFinderLivePlayerPlugin";

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f65220h = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f65221i = new java.util.LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f65222m = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f65223n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f65224o = new java.util.HashSet();

    /* renamed from: q, reason: collision with root package name */
    public final bw5.os0 f65226q = bw5.os0.MMFinder_GetComment_Scene_LiveCard_FromBS;

    public final void a(com.tencent.pigeon.biz_base.FinderLivePlayInfo finderLivePlayInfo, mn0.b0 b0Var, long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f65223n;
        boolean z17 = (concurrentHashMap.containsKey(java.lang.Long.valueOf(j17)) && kotlin.jvm.internal.o.b(concurrentHashMap.get(java.lang.Long.valueOf(j17)), java.lang.Boolean.TRUE)) ? false : true;
        vw.r rVar = (vw.r) i95.n0.c(vw.r.class);
        java.lang.String finder_export_id = finderLivePlayInfo.getFinder_export_id();
        if (finder_export_id == null) {
            finder_export_id = "";
        }
        rVar.getClass();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) rVar.f440723d.get(finder_export_id);
        java.lang.String str = this.f65216d;
        if (finderObject == null || !z17) {
            com.tencent.mars.xlog.Log.w(str, "handle stop cached play playerId: " + j17 + ", playerStatusMap.containsKey(playerId): " + concurrentHashMap.containsKey(java.lang.Long.valueOf(j17)) + ", playerStatusMap[playerId]: " + concurrentHashMap.get(java.lang.Long.valueOf(j17)) + " cachedFeed:" + finderObject);
        } else {
            r45.nw1 liveInfo = finderObject.getLiveInfo();
            if (liveInfo != null) {
                java.util.HashSet hashSet = (java.util.HashSet) this.f65224o;
                if (!hashSet.contains(java.lang.Long.valueOf(j17))) {
                    com.tencent.mars.xlog.Log.w(str, "try start play after stop or destroy has been called, playerId: " + j17);
                    return;
                } else {
                    hashSet.remove(java.lang.Long.valueOf(j17));
                    r45.p72 p72Var = new r45.p72();
                    p72Var.set(0, this.f65226q.toString());
                    ((mn0.y) b0Var).S(liveInfo, p72Var);
                    concurrentHashMap.put(java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE);
                    return;
                }
            }
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        java.lang.String finder_export_id2 = finderLivePlayInfo.getFinder_export_id();
        s40.w0.U9(w0Var, 0L, "", 65, 2, "", true, null, 0L, null, false, false, finder_export_id2 == null ? "" : finder_export_id2, null, 0, 10176, null).l().K(new ew.t(this, j17, finderLivePlayInfo, b0Var));
    }

    @Override // com.tencent.pigeon.biz_base.BizFinderLivePlayersManager
    public void createPlayer(com.tencent.pigeon.biz_base.FinderLivePlayInfo finderLivePlayInfo, boolean z17, long j17, yz5.l result) {
        kotlin.jvm.internal.o.g(finderLivePlayInfo, "finderLivePlayInfo");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.ui.MMActivity mMActivity = this.f65218f;
        java.lang.String str = this.f65216d;
        if (mMActivity == null) {
            com.tencent.mars.xlog.Log.e(str, "create player but activity is null");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            result.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.NullPointerException("activity is null")))));
            return;
        }
        if (this.f65219g == null) {
            com.tencent.mars.xlog.Log.e(str, "create player but textureRegistry is null");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            result.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.NullPointerException("textureRegistry is null")))));
            return;
        }
        if (!fp.q.b("live_sdk")) {
            com.tencent.mars.xlog.Log.e(str, "create player but live_sdk is null");
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            result.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.NullPointerException("live_sdk is null")))));
            return;
        }
        c50.q0 q0Var = (c50.q0) i95.n0.c(c50.q0.class);
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f65218f;
        kotlin.jvm.internal.o.d(mMActivity2);
        mn0.b0 wi6 = ((v40.q) q0Var).wi(mMActivity2);
        io.flutter.view.TextureRegistry textureRegistry = this.f65219g;
        io.flutter.view.TextureRegistry.SurfaceTextureEntry createSurfaceTexture = textureRegistry != null ? textureRegistry.createSurfaceTexture() : null;
        kotlin.jvm.internal.o.d(createSurfaceTexture);
        mn0.y yVar = (mn0.y) wi6;
        yVar.G(true);
        yVar.K(mn0.d0.f329720s, 22);
        ls5.d dVar = yVar.f329807f;
        if (dVar != null) {
            dVar.f321128h = new ew.o(this);
        }
        yVar.Q(0);
        android.graphics.SurfaceTexture surfaceTexture = createSurfaceTexture.surfaceTexture();
        java.lang.Long containerWidth = finderLivePlayInfo.getContainerWidth();
        int longValue = containerWidth != null ? (int) containerWidth.longValue() : 0;
        java.lang.Long containerHeight = finderLivePlayInfo.getContainerHeight();
        surfaceTexture.setDefaultBufferSize(longValue, containerHeight != null ? (int) containerHeight.longValue() : 0);
        java.lang.Long containerWidth2 = finderLivePlayInfo.getContainerWidth();
        int longValue2 = containerWidth2 != null ? (int) containerWidth2.longValue() : 0;
        java.lang.Long containerHeight2 = finderLivePlayInfo.getContainerHeight();
        int longValue3 = containerHeight2 != null ? (int) containerHeight2.longValue() : 0;
        nn0.o oVar = ((nn0.i) ((nn0.c) wi6).p()).f338584b;
        if (oVar != null) {
            oVar.le(surfaceTexture, longValue2, longValue3);
        }
        com.tencent.pigeon.biz_base.BizTLPlayerInfo bizTLPlayerInfo = new com.tencent.pigeon.biz_base.BizTLPlayerInfo(new com.tencent.pigeon.biz_base.BizTLTextureInfo(java.lang.Long.valueOf(createSurfaceTexture.id()), null, null, 6, null), java.lang.Long.valueOf(this.f65222m.incrementAndGet()));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createPlayer: ");
        java.lang.Long playerId = bizTLPlayerInfo.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        sb6.append(playerId.longValue());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        java.util.Map map = this.f65220h;
        java.lang.Long playerId2 = bizTLPlayerInfo.getPlayerId();
        kotlin.jvm.internal.o.d(playerId2);
        map.put(playerId2, new ew.u(wi6, finderLivePlayInfo));
        java.util.Map map2 = this.f65221i;
        java.lang.Long playerId3 = bizTLPlayerInfo.getPlayerId();
        kotlin.jvm.internal.o.d(playerId3);
        map2.put(playerId3, createSurfaceTexture);
        yVar.J(new ew.s(this, bizTLPlayerInfo, finderLivePlayInfo));
        result.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(bizTLPlayerInfo)));
        if (z17) {
            java.lang.Long playerId4 = bizTLPlayerInfo.getPlayerId();
            kotlin.jvm.internal.o.d(playerId4);
            a(finderLivePlayInfo, wi6, playerId4.longValue());
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizFinderLivePlayersManager
    public void destroy(long j17) {
        mn0.b0 b0Var;
        java.util.Map map = this.f65220h;
        ew.u uVar = (ew.u) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        if (uVar != null && (b0Var = uVar.f257005a) != null) {
            mn0.b0.C(b0Var, false, false, false, 6, null);
            ((mn0.y) b0Var).w();
        }
        map.remove(java.lang.Long.valueOf(j17));
        java.util.Map map2 = this.f65221i;
        io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = (io.flutter.view.TextureRegistry.SurfaceTextureEntry) ((java.util.LinkedHashMap) map2).get(java.lang.Long.valueOf(j17));
        if (surfaceTextureEntry != null) {
            surfaceTextureEntry.release();
        }
        map2.remove(java.lang.Long.valueOf(j17));
        ((java.util.HashSet) this.f65224o).remove(java.lang.Long.valueOf(j17));
        ((java.util.concurrent.ConcurrentHashMap) this.f65223n).remove(java.lang.Long.valueOf(j17));
        com.tencent.mars.xlog.Log.i(this.f65216d, "destroy player " + j17);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f65216d, "onAttachedToActivity");
        android.app.Activity activity = binding.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        this.f65218f = mMActivity;
        com.tencent.mm.ui.MMActivity mMActivity2 = mMActivity instanceof com.tencent.mm.ui.MMActivity ? mMActivity : null;
        if (mMActivity2 == null || (mo133getLifecycle = mMActivity2.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f65216d, "onAttachedToEngine");
        com.tencent.pigeon.biz_base.BizFinderLivePlayersManager.Companion companion = com.tencent.pigeon.biz_base.BizFinderLivePlayersManager.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz_base.BizFinderLivePlayersManager.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        this.f65219g = binding.getTextureRegistry();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f65217e = new com.tencent.pigeon.biz_base.BizFinderLivePlayersCallbackApi(binaryMessenger2, null, 2, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        androidx.lifecycle.o mo133getLifecycle;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivity ");
        com.tencent.mm.ui.MMActivity mMActivity = this.f65218f;
        sb6.append(mMActivity != null ? java.lang.Boolean.valueOf(mMActivity.isFinishing()) : null);
        com.tencent.mars.xlog.Log.i(this.f65216d, sb6.toString());
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f65218f;
        if (!(mMActivity2 instanceof com.tencent.mm.ui.MMActivity)) {
            mMActivity2 = null;
        }
        if (mMActivity2 != null && (mo133getLifecycle = mMActivity2.mo133getLifecycle()) != null) {
            mo133getLifecycle.c(this);
        }
        this.f65218f = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f65218f = null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivityForConfigChanges playerKeepers.size = ");
        java.util.Map map = this.f65220h;
        sb6.append(map.size());
        com.tencent.mars.xlog.Log.i(this.f65216d, sb6.toString());
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(((java.util.LinkedHashMap) map).keySet());
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            destroy(((java.lang.Number) it.next()).longValue());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromEngine playerKeepers.size = ");
        java.util.Map map = this.f65220h;
        sb6.append(map.size());
        com.tencent.mars.xlog.Log.i(this.f65216d, sb6.toString());
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(((java.util.LinkedHashMap) map).keySet());
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            destroy(((java.lang.Number) it.next()).longValue());
        }
        com.tencent.pigeon.biz_base.BizFinderLivePlayersManager.Companion companion = com.tencent.pigeon.biz_base.BizFinderLivePlayersManager.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz_base.BizFinderLivePlayersManager.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f65217e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        android.app.Activity activity = binding.getActivity();
        this.f65218f = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.String str = this.f65216d;
        com.tencent.mars.xlog.Log.i(str, "onStateChanged() event = " + event);
        if (event == androidx.lifecycle.m.ON_START) {
            this.f65225p = true;
        }
        if (event == androidx.lifecycle.m.ON_STOP) {
            this.f65225p = false;
            java.util.Map map = this.f65223n;
            if (!((java.util.concurrent.ConcurrentHashMap) map).isEmpty()) {
                for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) map).entrySet()) {
                    if (((java.lang.Boolean) entry.getValue()).booleanValue()) {
                        com.tencent.mars.xlog.Log.i(str, "stop when onStop: " + ((java.lang.Number) entry.getKey()).longValue());
                        stop(((java.lang.Number) entry.getKey()).longValue());
                    }
                }
            }
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizFinderLivePlayersManager
    public void play(long j17) {
        java.lang.String str = this.f65216d;
        com.tencent.mars.xlog.Log.i(str, "play: " + j17);
        if (!this.f65225p) {
            com.tencent.mars.xlog.Log.w(str, "try play when background, playerId: " + j17);
            return;
        }
        ew.u uVar = (ew.u) ((java.util.LinkedHashMap) this.f65220h).get(java.lang.Long.valueOf(j17));
        if (uVar != null) {
            ((java.util.HashSet) this.f65224o).add(java.lang.Long.valueOf(j17));
            a(uVar.f257006b, uVar.f257005a, j17);
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizFinderLivePlayersManager
    public void stop(long j17) {
        mn0.b0 b0Var;
        com.tencent.mars.xlog.Log.i(this.f65216d, "stop: " + j17);
        ew.u uVar = (ew.u) ((java.util.LinkedHashMap) this.f65220h).get(java.lang.Long.valueOf(j17));
        if (uVar == null || (b0Var = uVar.f257005a) == null) {
            return;
        }
        ((java.util.HashSet) this.f65224o).remove(java.lang.Long.valueOf(j17));
        mn0.b0.C(b0Var, false, false, false, 6, null);
        ((java.util.concurrent.ConcurrentHashMap) this.f65223n).put(java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
    }
}

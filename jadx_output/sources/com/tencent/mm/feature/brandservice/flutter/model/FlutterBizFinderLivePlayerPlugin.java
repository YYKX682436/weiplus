package com.tencent.mm.feature.brandservice.flutter.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/feature/brandservice/flutter/model/FlutterBizFinderLivePlayerPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Landroidx/lifecycle/v;", "Lcom/tencent/pigeon/biz_base/BizFinderLivePlayersManager;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FlutterBizFinderLivePlayerPlugin implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, androidx.lifecycle.v, com.tencent.pigeon.biz_base.BizFinderLivePlayersManager {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.pigeon.biz_base.BizFinderLivePlayersCallbackApi f65234e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f65235f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.view.TextureRegistry f65236g;

    /* renamed from: p, reason: collision with root package name */
    public boolean f65242p;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f65233d = "MicroMsg.FlutterBizFinderLivePlayerPlugin";

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f65237h = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f65238i = new java.util.LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f65239m = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f65240n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f65241o = new java.util.HashSet();

    /* renamed from: q, reason: collision with root package name */
    public final bw5.os0 f65243q = bw5.os0.MMFinder_GetComment_Scene_MPFlowList;

    public final void a(com.tencent.pigeon.biz_base.FinderLivePlayInfo finderLivePlayInfo, mn0.b0 b0Var, long j17) {
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        java.lang.String finder_export_id = finderLivePlayInfo.getFinder_export_id();
        if (finder_export_id == null) {
            finder_export_id = "";
        }
        s40.w0.U9(w0Var, 0L, "", 65, 2, "", true, null, 0L, null, false, false, finder_export_id, null, 0, 10176, null).l().K(new lx.d0(this, j17, b0Var));
    }

    @Override // com.tencent.pigeon.biz_base.BizFinderLivePlayersManager
    public void createPlayer(com.tencent.pigeon.biz_base.FinderLivePlayInfo finderLivePlayInfo, boolean z17, long j17, yz5.l result) {
        kotlin.jvm.internal.o.g(finderLivePlayInfo, "finderLivePlayInfo");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.ui.MMActivity mMActivity = this.f65235f;
        java.lang.String str = this.f65233d;
        if (mMActivity == null) {
            com.tencent.mars.xlog.Log.e(str, "create player but activity is null");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            result.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.NullPointerException("activity is null")))));
            return;
        }
        if (this.f65236g == null) {
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
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f65235f;
        kotlin.jvm.internal.o.d(mMActivity2);
        mn0.b0 wi6 = ((v40.q) q0Var).wi(mMActivity2);
        io.flutter.view.TextureRegistry textureRegistry = this.f65236g;
        io.flutter.view.TextureRegistry.SurfaceProducer createSurfaceProducer = textureRegistry != null ? textureRegistry.createSurfaceProducer() : null;
        kotlin.jvm.internal.o.d(createSurfaceProducer);
        mn0.y yVar = (mn0.y) wi6;
        yVar.G(true);
        yVar.K(mn0.d0.f329720s, 17);
        ls5.d dVar = yVar.f329807f;
        if (dVar != null) {
            dVar.f321128h = new lx.y(this);
        }
        yVar.Q(0);
        java.lang.Long containerWidth = finderLivePlayInfo.getContainerWidth();
        int longValue = containerWidth != null ? (int) containerWidth.longValue() : 0;
        java.lang.Long containerHeight = finderLivePlayInfo.getContainerHeight();
        createSurfaceProducer.setSize(longValue, containerHeight != null ? (int) containerHeight.longValue() : 0);
        android.view.Surface surface = createSurfaceProducer.getSurface();
        kotlin.jvm.internal.o.f(surface, "getSurface(...)");
        java.lang.Long containerWidth2 = finderLivePlayInfo.getContainerWidth();
        int longValue2 = containerWidth2 != null ? (int) containerWidth2.longValue() : 0;
        java.lang.Long containerHeight2 = finderLivePlayInfo.getContainerHeight();
        ((nn0.c) wi6).v(surface, longValue2, containerHeight2 != null ? (int) containerHeight2.longValue() : 0);
        com.tencent.pigeon.biz_base.BizTLPlayerInfo bizTLPlayerInfo = new com.tencent.pigeon.biz_base.BizTLPlayerInfo(new com.tencent.pigeon.biz_base.BizTLTextureInfo(java.lang.Long.valueOf(createSurfaceProducer.id()), null, null, 6, null), java.lang.Long.valueOf(this.f65239m.incrementAndGet()));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createPlayer: ");
        java.lang.Long playerId = bizTLPlayerInfo.getPlayerId();
        kotlin.jvm.internal.o.d(playerId);
        sb6.append(playerId.longValue());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        java.util.Map map = this.f65237h;
        java.lang.Long playerId2 = bizTLPlayerInfo.getPlayerId();
        kotlin.jvm.internal.o.d(playerId2);
        map.put(playerId2, new lx.a6(wi6, finderLivePlayInfo));
        java.util.Map map2 = this.f65238i;
        java.lang.Long playerId3 = bizTLPlayerInfo.getPlayerId();
        kotlin.jvm.internal.o.d(playerId3);
        map2.put(playerId3, createSurfaceProducer);
        yVar.J(new lx.c0(this, bizTLPlayerInfo, finderLivePlayInfo));
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
        java.util.Map map = this.f65237h;
        lx.a6 a6Var = (lx.a6) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        if (a6Var != null && (b0Var = a6Var.f321690a) != null) {
            mn0.b0.C(b0Var, false, false, false, 6, null);
            ((mn0.y) b0Var).w();
        }
        map.remove(java.lang.Long.valueOf(j17));
        java.util.Map map2 = this.f65238i;
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = (io.flutter.view.TextureRegistry.SurfaceProducer) ((java.util.LinkedHashMap) map2).get(java.lang.Long.valueOf(j17));
        if (surfaceProducer != null) {
            surfaceProducer.release();
        }
        map2.remove(java.lang.Long.valueOf(j17));
        ((java.util.HashSet) this.f65241o).remove(java.lang.Long.valueOf(j17));
        ((java.util.concurrent.ConcurrentHashMap) this.f65240n).remove(java.lang.Long.valueOf(j17));
        com.tencent.mars.xlog.Log.i(this.f65233d, "destroy player " + j17);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f65233d, "onAttachedToActivity");
        android.app.Activity activity = binding.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        this.f65235f = mMActivity;
        com.tencent.mm.ui.MMActivity mMActivity2 = mMActivity instanceof com.tencent.mm.ui.MMActivity ? mMActivity : null;
        if (mMActivity2 == null || (mo133getLifecycle = mMActivity2.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f65233d, "onAttachedToEngine");
        com.tencent.pigeon.biz_base.BizFinderLivePlayersManager.Companion companion = com.tencent.pigeon.biz_base.BizFinderLivePlayersManager.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz_base.BizFinderLivePlayersManager.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        this.f65236g = binding.getTextureRegistry();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f65234e = new com.tencent.pigeon.biz_base.BizFinderLivePlayersCallbackApi(binaryMessenger2, null, 2, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        androidx.lifecycle.o mo133getLifecycle;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivity ");
        com.tencent.mm.ui.MMActivity mMActivity = this.f65235f;
        sb6.append(mMActivity != null ? java.lang.Boolean.valueOf(mMActivity.isFinishing()) : null);
        com.tencent.mars.xlog.Log.i(this.f65233d, sb6.toString());
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f65235f;
        if (!(mMActivity2 instanceof com.tencent.mm.ui.MMActivity)) {
            mMActivity2 = null;
        }
        if (mMActivity2 != null && (mo133getLifecycle = mMActivity2.mo133getLifecycle()) != null) {
            mo133getLifecycle.c(this);
        }
        this.f65235f = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f65235f = null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivityForConfigChanges playerKeepers.size = ");
        java.util.Map map = this.f65237h;
        sb6.append(map.size());
        com.tencent.mars.xlog.Log.i(this.f65233d, sb6.toString());
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
        java.util.Map map = this.f65237h;
        sb6.append(map.size());
        com.tencent.mars.xlog.Log.i(this.f65233d, sb6.toString());
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
        this.f65234e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        android.app.Activity activity = binding.getActivity();
        this.f65235f = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.String str = this.f65233d;
        com.tencent.mars.xlog.Log.i(str, "onStateChanged() event = " + event);
        if (event == androidx.lifecycle.m.ON_START) {
            this.f65242p = true;
        }
        if (event == androidx.lifecycle.m.ON_STOP) {
            this.f65242p = false;
            java.util.Map map = this.f65240n;
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
        java.lang.String str = this.f65233d;
        com.tencent.mars.xlog.Log.i(str, "play: " + j17);
        if (!this.f65242p) {
            com.tencent.mars.xlog.Log.w(str, "try play when background, playerId: " + j17);
            return;
        }
        lx.a6 a6Var = (lx.a6) ((java.util.LinkedHashMap) this.f65237h).get(java.lang.Long.valueOf(j17));
        if (a6Var != null) {
            ((java.util.HashSet) this.f65241o).add(java.lang.Long.valueOf(j17));
            a(a6Var.f321691b, a6Var.f321690a, j17);
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizFinderLivePlayersManager
    public void stop(long j17) {
        mn0.b0 b0Var;
        com.tencent.mars.xlog.Log.i(this.f65233d, "stop: " + j17);
        lx.a6 a6Var = (lx.a6) ((java.util.LinkedHashMap) this.f65237h).get(java.lang.Long.valueOf(j17));
        if (a6Var == null || (b0Var = a6Var.f321690a) == null) {
            return;
        }
        ((java.util.HashSet) this.f65241o).remove(java.lang.Long.valueOf(j17));
        mn0.b0.C(b0Var, false, false, false, 6, null);
        ((java.util.concurrent.ConcurrentHashMap) this.f65240n).put(java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
    }
}

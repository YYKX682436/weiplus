package a03;

/* loaded from: classes11.dex */
public final class m implements pi0.m0 {
    @Override // pi0.m0
    public boolean a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return com.tencent.mm.ui.bk.k(context);
    }

    @Override // pi0.m0
    public void b(pi0.u0 engine) {
        kotlin.jvm.internal.o.g(engine, "engine");
        b03.u uVar = b03.u.f16864a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        fp.d0.n("dart2cpp");
        android.os.SystemClock.elapsedRealtime();
        b03.m mVar = b03.m.f16849a;
        io.flutter.embedding.engine.FlutterEngine flutterEngine = engine.f354731b;
        io.flutter.embedding.engine.plugins.PluginRegistry plugins = flutterEngine.getPlugins();
        kotlin.jvm.internal.o.f(plugins, "getPlugins(...)");
        mVar.a(plugins);
        flutterEngine.getPlugins().add(new c61.v9(engine.f354732c, engine.f354733d));
        c61.db dbVar = new c61.db();
        dbVar.f38945e = engine.f354734e;
        dbVar.f38946f = engine.f354732c;
        flutterEngine.getPlugins().add(dbVar);
        flutterEngine.setBackgroundExecutor(b03.r.f16862d, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_flutter_enable_surface_background_executor, false));
        io.flutter.embedding.engine.FlutterEngineCache flutterEngineCache = io.flutter.embedding.engine.FlutterEngineCache.getInstance();
        java.lang.String str = engine.f354730a;
        flutterEngineCache.put(str, flutterEngine);
        flutterEngine.addEngineLifecycleListener(new b03.s(str));
    }

    @Override // pi0.m0
    public boolean c() {
        boolean z17 = com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity.f208799g;
        return com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity.f208799g;
    }

    @Override // pi0.m0
    public void d(pi0.m1 routeInfo) {
        kotlin.jvm.internal.o.g(routeInfo, "routeInfo");
        java.util.HashMap hashMap = new java.util.HashMap();
        k12.t tVar = (k12.t) i95.n0.c(k12.t.class);
        hashMap.put("SystemEmojiResPath", tVar == null ? "" : ((h12.g) tVar).Di());
        k12.t tVar2 = (k12.t) i95.n0.c(k12.t.class);
        hashMap.put("QQSmileyDirPath", tVar2 == null ? "" : ((h12.g) tVar2).Bi());
        k12.t tVar3 = (k12.t) i95.n0.c(k12.t.class);
        hashMap.put("NewSmileyDirPath", tVar3 == null ? "" : ((h12.g) tVar3).Ai());
        k12.t tVar4 = (k12.t) i95.n0.c(k12.t.class);
        hashMap.put("EmojiPanelConfigPath", tVar4 != null ? ((h12.g) tVar4).wi() : "");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        hashMap.put("IsEnableInitOnIsolate", bool);
        hashMap.put("IsEnableSupportEmoji", bool);
        routeInfo.f354671g = hashMap;
        if (kotlin.jvm.internal.o.b(routeInfo.f354667c, "root")) {
            java.util.HashMap initParams = routeInfo.f354671g;
            kotlin.jvm.internal.o.f(initParams, "initParams");
            initParams.put("densityScale", java.lang.Float.valueOf((j65.f.g() * 1.0f) / 400));
        }
    }

    @Override // pi0.m0
    public java.lang.Class e() {
        return com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity.class;
    }

    @Override // pi0.m0
    public void f(pi0.l0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.Set set = a03.l.f440a;
        java.util.HashSet hashSet = (java.util.HashSet) a03.l.f440a;
        if (hashSet.isEmpty()) {
            com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(a03.l.f441b);
        }
        hashSet.add(callback);
    }

    @Override // pi0.m0
    public void g(pi0.l0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.Set set = a03.l.f440a;
        java.util.HashSet hashSet = (java.util.HashSet) a03.l.f440a;
        hashSet.remove(callback);
        if (hashSet.isEmpty()) {
            com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.removeLifecycleCallback(a03.l.f441b);
        }
    }

    @Override // pi0.m0
    public android.graphics.Point getDisplayRealSize(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return com.tencent.mm.ui.bk.h(context);
    }

    @Override // pi0.m0
    public pi0.q h() {
        return ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui();
    }

    @Override // pi0.m0
    public int i() {
        return e50.j1.f249508a.d() && android.os.Build.VERSION.SDK_INT >= 29 ? 1 : -1;
    }

    @Override // pi0.m0
    public android.os.HandlerThread j(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        int i17 = pu5.i.f358473b;
        return pu5.f.a(name, -2);
    }

    @Override // pi0.m0
    public android.app.Activity k() {
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        if (k17 != null) {
            return (android.app.Activity) k17.get();
        }
        return null;
    }
}

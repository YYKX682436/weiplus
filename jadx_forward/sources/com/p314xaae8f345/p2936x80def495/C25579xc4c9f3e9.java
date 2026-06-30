package com.p314xaae8f345.p2936x80def495;

/* renamed from: com.tencent.skyline.SkylineLogic */
/* loaded from: classes15.dex */
public class C25579xc4c9f3e9 {

    /* renamed from: DEFAULT_MODE */
    private static final int f46809x651cb501 = 1;

    /* renamed from: MODE_MULTI_FLUTTER_ENGINE_GROUP */
    public static final int f46810x89efc507 = 1;

    /* renamed from: MODE_SINGLE_FLUTTER_ENGINE_GROUP */
    public static final int f46811x95342080 = 2;

    /* renamed from: SKYLINE_INIT_NAME */
    private static final java.lang.String f46812x44cda510 = "Skyline_Invoke_MethodChannel";

    /* renamed from: SKYLINE_NAME */
    private static final java.lang.String f46813x47ebac15 = "Skyline_MethodChannel";

    /* renamed from: SKYLINE_TEXTURE */
    private static final java.lang.String f46814xbf4a4331 = "skyline_texture";
    private static final java.lang.String TAG = "SkylineLogic";

    /* renamed from: TYPE_IMAGE */
    public static final int f46815x1294c7f6 = 3;

    /* renamed from: TYPE_SURFACE */
    public static final int f46816xe016cc88 = 2;

    /* renamed from: TYPE_TEXTURE */
    public static final int f46817xfa0ab4f6 = 1;

    /* renamed from: activeEngines */
    private static java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p2936x80def495.C25559x3d115382> f46818x5a1a948b;

    /* renamed from: isInit */
    private static boolean f46820xb9a4415a;

    /* renamed from: runtimePtr2Id */
    private static java.util.HashMap<java.lang.Long, java.lang.Integer> f46824xdef77d37 = new java.util.HashMap<>();

    /* renamed from: mainHandler */
    private static android.os.Handler f46821xf48ab751 = null;

    /* renamed from: mode */
    private static int f46822x3339a3 = 1;

    /* renamed from: firstId */
    private static int f46819xcd64efeb = 0;

    /* renamed from: preloadFlutterJNIs */
    private static java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.p314xaae8f345.p2936x80def495.C25560xde96d1b7> f46823x68b2e5e1 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: sFlutterUiDisplayListener */
    private static final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 f46825x84cc0d39 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6() { // from class: com.tencent.skyline.SkylineLogic.2
        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
        /* renamed from: onFlutterUiDisplayed */
        public void mo2121x6c956b30() {
            com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.TAG, "onFlutterUiDisplayed");
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6
        /* renamed from: onFlutterUiNoLongerDisplayed */
        public void mo2122xb9179606() {
            com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.TAG, "onFlutterUiNoLongerDisplayed");
        }
    };

    /* renamed from: access$100 */
    public static /* synthetic */ boolean m95756xbbd77eb1() {
        return m95782x3f9b3d53();
    }

    /* renamed from: appIsDetached */
    public static void m95759x673813bd(int i17) {
        com.p314xaae8f345.p2936x80def495.C25559x3d115382 c25559x3d115382 = f46818x5a1a948b.get(java.lang.Integer.valueOf(i17));
        if (c25559x3d115382 == null) {
            com.p314xaae8f345.p2936x80def495.C25578x50634e8f.e(TAG, "flutterEngine is null, appIsDetached fail return");
        } else {
            c25559x3d115382.getFlutterEngine().m137431xae9c49af().m138172x673813bd();
        }
    }

    /* renamed from: appIsInactive */
    public static void m95760x2a6de4b6(int i17) {
        com.p314xaae8f345.p2936x80def495.C25559x3d115382 c25559x3d115382 = f46818x5a1a948b.get(java.lang.Integer.valueOf(i17));
        if (c25559x3d115382 == null) {
            com.p314xaae8f345.p2936x80def495.C25578x50634e8f.e(TAG, "flutterEngine is null, appIsInactive fail return");
        } else {
            c25559x3d115382.getFlutterEngine().m137431xae9c49af().m138173x2a6de4b6();
        }
    }

    /* renamed from: appIsPaused */
    public static void m95761x196db839(int i17) {
        com.p314xaae8f345.p2936x80def495.C25559x3d115382 c25559x3d115382 = f46818x5a1a948b.get(java.lang.Integer.valueOf(i17));
        if (c25559x3d115382 == null) {
            com.p314xaae8f345.p2936x80def495.C25578x50634e8f.e(TAG, "flutterEngine is null, appIsPaused fail return");
        } else {
            c25559x3d115382.getFlutterEngine().m137431xae9c49af().m138174x196db839();
        }
    }

    /* renamed from: appIsResumed */
    public static void m95762x84ce002c(int i17) {
        com.p314xaae8f345.p2936x80def495.C25559x3d115382 c25559x3d115382 = f46818x5a1a948b.get(java.lang.Integer.valueOf(i17));
        if (c25559x3d115382 == null) {
            com.p314xaae8f345.p2936x80def495.C25578x50634e8f.e(TAG, "flutterEngine is null, appIsResumed fail return");
        } else {
            c25559x3d115382.getFlutterEngine().m137431xae9c49af().m138175x84ce002c();
        }
    }

    /* renamed from: attachFlutterEngine */
    public static void m95763xf0c9f339(int i17, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1) {
        com.p314xaae8f345.p2936x80def495.C25559x3d115382 c25559x3d115382 = f46818x5a1a948b.get(java.lang.Integer.valueOf(i17));
        if (c25559x3d115382 == null) {
            com.p314xaae8f345.p2936x80def495.C25578x50634e8f.e(TAG, "flutterEngine is null, attachFlutterEngine fail return");
        } else {
            c28553x45ef20c1.mo124142x11d031be(c25559x3d115382.getFlutterEngine());
            c28553x45ef20c1.m137255x6d15a5c6(f46825x84cc0d39);
        }
    }

    /* renamed from: createDartEntryPoint */
    private static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint m95764x352d9139(com.p314xaae8f345.p2936x80def495.C25575xc51c1017 c25575xc51c1017) {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint(io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136951x464ccf4f().m137934x595ee78f(), c25575xc51c1017.getLibraryURI(), c25575xc51c1017.getEntryPointName());
    }

    /* renamed from: createFlutterEngine */
    public static boolean m95766x9affa1e2(android.content.Context context, final com.p314xaae8f345.p2936x80def495.C25575xc51c1017 c25575xc51c1017) {
        final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m95796x71f32b0f;
        final android.content.res.AssetManager assets;
        final int id6 = c25575xc51c1017.getId();
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(TAG, "createFlutterEngine id:" + id6 + " config:" + c25575xc51c1017.m95747xcc313de3());
        if (f46818x5a1a948b.containsKey(java.lang.Integer.valueOf(id6))) {
            com.p314xaae8f345.p2936x80def495.C25578x50634e8f.w(TAG, "already init flutter engine, return");
            return true;
        }
        long runtimePtr = m95782x3f9b3d53() ? 0L : c25575xc51c1017.getRuntimePtr();
        if (!f46824xdef77d37.containsKey(java.lang.Long.valueOf(runtimePtr))) {
            final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 m95773xe5559df = m95773xe5559df(runtimePtr);
            boolean z17 = m95773xe5559df != null;
            c25575xc51c1017.m95739xd6a2afbc(z17);
            if (!z17) {
                m95773xe5559df = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09();
            }
            f46824xdef77d37.put(java.lang.Long.valueOf(runtimePtr), java.lang.Integer.valueOf(id6));
            m95796x71f32b0f = m95765x9affa1e2(context, id6, m95773xe5559df);
            m95795xa80a068d(new java.lang.Runnable() { // from class: com.tencent.skyline.SkylineLogic$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95783x5c028d2(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.this, c25575xc51c1017);
                }
            });
            final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint m95764x352d9139 = m95764x352d9139(c25575xc51c1017);
            if (z17) {
                try {
                    assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    assets = context.getAssets();
                }
                m95795xa80a068d(new java.lang.Runnable() { // from class: com.tencent.skyline.SkylineLogic$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95784x5c028d3(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.this, m95764x352d9139, assets, m95796x71f32b0f);
                    }
                });
            } else {
                m95795xa80a068d(new java.lang.Runnable() { // from class: com.tencent.skyline.SkylineLogic$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95785x5c028d4(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.this, m95764x352d9139);
                    }
                });
            }
            if (m95782x3f9b3d53()) {
                f46819xcd64efeb = id6;
            }
        } else {
            m95796x71f32b0f = m95796x71f32b0f(context, id6, runtimePtr, m95764x352d9139(c25575xc51c1017), c25575xc51c1017);
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = m95796x71f32b0f;
        if (c28580x69eec95e == null) {
            com.p314xaae8f345.p2936x80def495.C25578x50634e8f.e(TAG, "createFlutterEngine fail, return");
            return false;
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28580x69eec95e.m137427x4255efe8().m137856x3b5b91dc(), f46813x47ebac15);
        f46818x5a1a948b.put(java.lang.Integer.valueOf(id6), new com.p314xaae8f345.p2936x80def495.C25559x3d115382(c28580x69eec95e, new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28580x69eec95e.m137427x4255efe8().m137856x3b5b91dc(), f46812x44cda510), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28580x69eec95e.m137427x4255efe8().m137856x3b5b91dc(), f46814xbf4a4331), new com.p314xaae8f345.p2936x80def495.p2937x60b7c31.C25612x971e32be(new com.p314xaae8f345.p2936x80def495.p2937x60b7c31.C25608x33aadc64(c28580x69eec95e.m137427x4255efe8().m137856x3b5b91dc())), c25575xc51c1017));
        c28580x69eec95e.m137415x4aac123b(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener() { // from class: com.tencent.skyline.SkylineLogic.1
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener
            /* renamed from: onEngineWillDestroy */
            public void mo9535x8a6a5407() {
                com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.TAG, "onEngineWillDestroy id:" + id6);
                com.p314xaae8f345.p2936x80def495.C25559x3d115382 c25559x3d115382 = (com.p314xaae8f345.p2936x80def495.C25559x3d115382) com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.f46818x5a1a948b.remove(java.lang.Integer.valueOf(id6));
                if (com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95756xbbd77eb1() || c25559x3d115382 == null) {
                    return;
                }
                com.p314xaae8f345.p2936x80def495.C25575xc51c1017 config = c25559x3d115382.getConfig();
                if (config.getCreateRuntime()) {
                    com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.TAG, "flutterJNIs remove id:" + id6 + " runtimePtr:" + config.getRuntimePtr());
                    com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.f46824xdef77d37.remove(java.lang.Long.valueOf(config.getRuntimePtr()));
                    com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.f46823x68b2e5e1.remove(java.lang.Long.valueOf(config.getRuntimePtr()));
                }
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener
            /* renamed from: onPreEngineRestart */
            public void mo9536x89b45f89() {
            }
        });
        c28688xe8dbe4c2.m138441xdf757329(new com.p314xaae8f345.p2936x80def495.C25583x8977a35b());
        c28580x69eec95e.m137437xe5cc0b81().mo138622xac1eee45(context, c28580x69eec95e.m137441x5e5b7e39(), c28580x69eec95e.m137427x4255efe8());
        return true;
    }

    /* renamed from: createFlutterView */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 m95767xfa44a45(android.content.Context context, int i17, int i18, int i19) {
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1(context, new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4(context)) : new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1(context, new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04(context, i17, i18, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28548x2ab8be04.SurfaceKind.background)) : new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1(context, new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28550x85bcbf56(context)) : new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1(context, new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28552x398ac0c4(context));
    }

    /* renamed from: destroyFlutterEngine */
    public static void m95768xecc6fa4(int i17) {
        if (m95782x3f9b3d53()) {
            if (f46819xcd64efeb == i17) {
                com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(TAG, "destroyFlutterEngine id:" + i17 + " ignore, when singleFlutterEngineGroup");
                return;
            }
            return;
        }
        com.p314xaae8f345.p2936x80def495.C25559x3d115382 remove = f46818x5a1a948b.remove(java.lang.Integer.valueOf(i17));
        if (remove != null) {
            remove.getFlutterEngine().m137419x5cd39ffa();
            com.p314xaae8f345.p2936x80def495.C25575xc51c1017 config = remove.getConfig();
            if (config.getCreateRuntime()) {
                com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(TAG, "destroyFlutterEngine flutterJNIs remove id:" + i17 + " runtimePtr:" + config.getRuntimePtr());
                f46824xdef77d37.remove(java.lang.Long.valueOf(config.getRuntimePtr()));
            }
        }
    }

    /* renamed from: destroyTaskRunner */
    public static void m95769xd26a54af(long j17) {
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(TAG, "destroyTaskRunner " + j17);
        com.p314xaae8f345.p2936x80def495.C25560xde96d1b7 remove = f46823x68b2e5e1.remove(java.lang.Long.valueOf(j17));
        if (remove != null) {
            remove.getTaskRunnerJNI().m137835x5cd39ffa();
        }
    }

    /* renamed from: detachFlutterView */
    public static void m95770x70229f4e(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1) {
        c28553x45ef20c1.m137259xf8d3d6a1();
        c28553x45ef20c1.m137275xa2124329(f46825x84cc0d39);
    }

    /* renamed from: getFlutterEngine */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m95771xf7af55c8(int i17) {
        com.p314xaae8f345.p2936x80def495.C25559x3d115382 c25559x3d115382 = f46818x5a1a948b.get(java.lang.Integer.valueOf(i17));
        if (c25559x3d115382 != null) {
            return c25559x3d115382.getFlutterEngine();
        }
        return null;
    }

    @java.lang.Deprecated
    /* renamed from: getFlutterJNI */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 m95772xe5559df() {
        return null;
    }

    @java.lang.Deprecated
    /* renamed from: getTaskRunner */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28602x9ef83230 m95774x2669c10b() {
        return null;
    }

    /* renamed from: getTextureChannel */
    public static io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 m95776xaad4285e(int i17) {
        com.p314xaae8f345.p2936x80def495.C25559x3d115382 c25559x3d115382 = f46818x5a1a948b.get(java.lang.Integer.valueOf(i17));
        if (c25559x3d115382 != null) {
            return c25559x3d115382.getSkylineTextureChannel();
        }
        return null;
    }

    /* renamed from: init */
    public static synchronized void m95777x316510(final android.content.Context context) {
        synchronized (com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.class) {
            if (!f46820xb9a4415a) {
                f46820xb9a4415a = true;
                m95779x5896858b();
                f46818x5a1a948b = new java.util.HashMap<>();
                f46821xf48ab751 = new android.os.Handler(android.os.Looper.getMainLooper());
                final io.p3284xd2ae381c.C28534x4dc80f50 m136946x21169495 = io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495();
                m95795xa80a068d(new java.lang.Runnable() { // from class: com.tencent.skyline.SkylineLogic$$f
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.m95787xe3ede919(io.p3284xd2ae381c.C28534x4dc80f50.this, context);
                    }
                });
            }
        }
    }

    /* renamed from: initAsync */
    public static synchronized void m95778xeefd574c(android.content.Context context, final java.lang.Runnable runnable) {
        synchronized (com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.class) {
            if (!f46820xb9a4415a) {
                f46820xb9a4415a = true;
                m95779x5896858b();
                f46818x5a1a948b = new java.util.HashMap<>();
                f46821xf48ab751 = new android.os.Handler(android.os.Looper.getMainLooper());
                io.p3284xd2ae381c.C28534x4dc80f50 m136946x21169495 = io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495();
                if (m136946x21169495.m136951x464ccf4f().m137937x498da6d4()) {
                    java.util.Objects.requireNonNull(runnable);
                    m95795xa80a068d(new java.lang.Runnable() { // from class: com.tencent.skyline.SkylineLogic$$e
                        @Override // java.lang.Runnable
                        public final void run() {
                            runnable.run();
                        }
                    });
                } else {
                    m136946x21169495.m136951x464ccf4f().m137941xfb0191fa(context);
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691 c28590xca799691 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691(new java.lang.String[0]);
                    c28590xca799691.add(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691.f70903xecaa9ac4);
                    c28590xca799691.add("--no-enable-merged-platform-ui-thread");
                    c28590xca799691.add(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691.f70906x9a72d246);
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f m136951x464ccf4f = m136946x21169495.m136951x464ccf4f();
                    java.lang.String[] m137777xb986489e = c28590xca799691.m137777xb986489e();
                    android.os.Handler handler = f46821xf48ab751;
                    java.util.Objects.requireNonNull(runnable);
                    m136951x464ccf4f.m137933x58050ce5(context, m137777xb986489e, handler, new java.lang.Runnable() { // from class: com.tencent.skyline.SkylineLogic$$e
                        @Override // java.lang.Runnable
                        public final void run() {
                            runnable.run();
                        }
                    });
                }
            }
        }
    }

    /* renamed from: initLibrary */
    private static void m95779x5896858b() {
        com.p314xaae8f345.p2936x80def495.jni.C25603xf5ecd239.m95951x1ee4a105();
        com.p314xaae8f345.p2936x80def495.jni.C25603xf5ecd239.m95954x32c4e6("skyline");
        com.p314xaae8f345.p2936x80def495.jni.C25603xf5ecd239.m95950x3cbcf0e2();
    }

    /* renamed from: initMode */
    public static synchronized void m95780xffd0ad3(int i17) {
        synchronized (com.p314xaae8f345.p2936x80def495.C25579xc4c9f3e9.class) {
            com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(TAG, "initMode mode:" + i17);
            f46822x3339a3 = i17;
        }
    }

    /* renamed from: invokeJsApi */
    public static void m95781x3865da79(int i17, java.lang.String str, org.json.JSONObject jSONObject, int i18, com.p314xaae8f345.p2936x80def495.p2937x60b7c31.C25612x971e32be.SkylineJsApiCallback skylineJsApiCallback) {
        com.p314xaae8f345.p2936x80def495.C25559x3d115382 c25559x3d115382 = f46818x5a1a948b.get(java.lang.Integer.valueOf(i17));
        if (c25559x3d115382 != null) {
            c25559x3d115382.m95647xcb3dec1f().m95982xb9724478(str, jSONObject, i18, skylineJsApiCallback);
        }
    }

    /* renamed from: isSingleFlutterEngineGroup */
    private static boolean m95782x3f9b3d53() {
        return f46822x3339a3 == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createFlutterEngine$1 */
    public static /* synthetic */ void m95783x5c028d2(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e, com.p314xaae8f345.p2936x80def495.C25575xc51c1017 c25575xc51c1017) {
        c28580x69eec95e.m137435x8a0ad399().m138193x7e19e2e7(c25575xc51c1017.m95747xcc313de3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createFlutterEngine$2 */
    public static /* synthetic */ void m95784x5c028d3(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint, android.content.res.AssetManager assetManager, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        if (c28586x96e67e09.m137686xf0d424ee()) {
            c28586x96e67e09.m137731x95362943(dartEntrypoint.f71023x326ef622, dartEntrypoint.f71021xd7b69460, dartEntrypoint.f71022x5e3250be, assetManager, null, c28580x69eec95e.m137429xe85cb873());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createFlutterEngine$3 */
    public static /* synthetic */ void m95785x5c028d4(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint) {
        c28580x69eec95e.m137427x4255efe8().m137853x820a9012(dartEntrypoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createFlutterEngine$4 */
    public static /* synthetic */ void m95786x5c028d5(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.w(TAG, c28687x4bb242ff.f71610xbfc5d0e1 + " not support.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$init$0 */
    public static /* synthetic */ void m95787xe3ede919(io.p3284xd2ae381c.C28534x4dc80f50 c28534x4dc80f50, android.content.Context context) {
        if (c28534x4dc80f50.m136951x464ccf4f().m137937x498da6d4()) {
            return;
        }
        c28534x4dc80f50.m136951x464ccf4f().m137938x6fa2b5a2(context.getApplicationContext());
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691 c28590xca799691 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691(new java.lang.String[0]);
        c28590xca799691.add("--no-enable-merged-platform-ui-thread");
        c28590xca799691.add(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691.f70906x9a72d246);
        c28534x4dc80f50.m136951x464ccf4f().m137931xa072d3d7(context, c28590xca799691.m137777xb986489e());
    }

    /* renamed from: obtainBitmap */
    public static android.graphics.Bitmap m95788x1af2e34(int i17) {
        com.p314xaae8f345.p2936x80def495.C25559x3d115382 c25559x3d115382 = f46818x5a1a948b.get(java.lang.Integer.valueOf(i17));
        if (c25559x3d115382 != null) {
            return c25559x3d115382.getFlutterEngine().m137441x5e5b7e39().m138025x12501425();
        }
        return null;
    }

    /* renamed from: obtainRenderer */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m95789xf25c5088(int i17) {
        com.p314xaae8f345.p2936x80def495.C25559x3d115382 c25559x3d115382 = f46818x5a1a948b.get(java.lang.Integer.valueOf(i17));
        if (c25559x3d115382 != null) {
            return c25559x3d115382.getFlutterEngine().m137441x5e5b7e39();
        }
        return null;
    }

    /* renamed from: preloadFlutterJNI */
    public static void m95791x8fc3b4d2(long j17) {
        if (java.lang.Thread.currentThread().getId() == f46821xf48ab751.getLooper().getThread().getId()) {
            com.p314xaae8f345.p2936x80def495.C25560xde96d1b7 c25560xde96d1b7 = f46823x68b2e5e1.get(java.lang.Long.valueOf(j17));
            if (c25560xde96d1b7 == null || c25560xde96d1b7.getFlutterJNI() == null) {
                return;
            }
            c25560xde96d1b7.getFlutterJNI().m137650xd4207fd7();
            return;
        }
        com.p314xaae8f345.p2936x80def495.C25560xde96d1b7 c25560xde96d1b72 = f46823x68b2e5e1.get(java.lang.Long.valueOf(j17));
        if (c25560xde96d1b72 != null) {
            c25560xde96d1b72.getFlutterJNI().m137649x5f9cc196();
        }
    }

    /* renamed from: preloadTaskRunner */
    public static void m95793xa7d81bfe(long j17) {
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.i(TAG, "preloadTaskRunner " + j17);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28602x9ef83230 c28602x9ef83230 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28602x9ef83230();
        c28586x96e67e09.m137651x3aa8758e(c28602x9ef83230);
        f46823x68b2e5e1.put(java.lang.Long.valueOf(j17), new com.p314xaae8f345.p2936x80def495.C25560xde96d1b7(c28586x96e67e09, c28602x9ef83230));
    }

    /* renamed from: reportMemoryUsage */
    public static void m95794x939f934c(int i17) {
        com.p314xaae8f345.p2936x80def495.C25559x3d115382 c25559x3d115382 = f46818x5a1a948b.get(java.lang.Integer.valueOf(i17));
        if (c25559x3d115382 != null) {
            c25559x3d115382.getFlutterEngine().m137449x3d144ed9().m138351x939f934c();
        }
    }

    /* renamed from: runOnMainThread */
    private static void m95795xa80a068d(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread().getId() == f46821xf48ab751.getLooper().getThread().getId()) {
            runnable.run();
        } else {
            f46821xf48ab751.post(runnable);
        }
    }

    /* renamed from: spawnExport */
    private static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m95796x71f32b0f(android.content.Context context, int i17, long j17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint, com.p314xaae8f345.p2936x80def495.C25575xc51c1017 c25575xc51c1017) {
        com.p314xaae8f345.p2936x80def495.C25559x3d115382 c25559x3d115382 = f46818x5a1a948b.get(java.lang.Integer.valueOf(f46824xdef77d37.get(java.lang.Long.valueOf(j17)).intValue()));
        if (c25559x3d115382 != null) {
            return c25559x3d115382.getFlutterEngine().m137461x688f37b(context, dartEntrypoint, c25575xc51c1017.m95747xcc313de3(), null, new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82(i17), true, false, false, true);
        }
        throw new java.lang.IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    /* renamed from: version */
    public static java.lang.String m95797x14f51cd8() {
        return "skyline/1.4.20 (-1;#1290;8a7dd6a5a5214e9082c18cdb4f02400b11e7002d;engine-c84b1c37a5875c60a6955c9235badf69804192be;)";
    }

    /* renamed from: getFlutterJNI */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 m95773xe5559df(long j17) {
        com.p314xaae8f345.p2936x80def495.C25560xde96d1b7 c25560xde96d1b7 = f46823x68b2e5e1.get(java.lang.Long.valueOf(j17));
        if (c25560xde96d1b7 != null) {
            return c25560xde96d1b7.getFlutterJNI();
        }
        return null;
    }

    /* renamed from: getTaskRunner */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28602x9ef83230 m95775x2669c10b(long j17) {
        com.p314xaae8f345.p2936x80def495.C25560xde96d1b7 c25560xde96d1b7 = f46823x68b2e5e1.get(java.lang.Long.valueOf(j17));
        if (c25560xde96d1b7 != null) {
            return c25560xde96d1b7.getTaskRunnerJNI();
        }
        return null;
    }

    @java.lang.Deprecated
    /* renamed from: preloadTaskRunner */
    public static void m95792xa7d81bfe() {
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.w(TAG, "preloadTaskRunner");
    }

    @java.lang.Deprecated
    /* renamed from: preloadFlutterJNI */
    public static void m95790x8fc3b4d2() {
        com.p314xaae8f345.p2936x80def495.C25578x50634e8f.w(TAG, "preloadFlutterJNI");
    }

    /* renamed from: createFlutterEngine */
    private static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m95765x9affa1e2(android.content.Context context, int i17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e(context, null, c28586x96e67e09, new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82(i17), null, true);
    }
}

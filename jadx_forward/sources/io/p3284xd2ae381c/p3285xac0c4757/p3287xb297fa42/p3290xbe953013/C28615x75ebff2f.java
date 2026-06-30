package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013;

/* renamed from: io.flutter.embedding.engine.loader.FlutterLoader */
/* loaded from: classes13.dex */
public class C28615x75ebff2f {

    /* renamed from: AOT_SHARED_LIBRARY_NAME */
    static final java.lang.String f71082x3e09570 = "aot-shared-library-name";

    /* renamed from: AOT_VMSERVICE_SHARED_LIBRARY_NAME */
    static final java.lang.String f71083xc5e28eef = "aot-vmservice-shared-library-name";

    /* renamed from: AUTOMATICALLY_REGISTER_PLUGINS_KEY */
    static final java.lang.String f71084x706e38a0 = "automatically-register-plugins";

    /* renamed from: CPU_ABI */
    public static java.lang.String f71085x659f2d11 = null;

    /* renamed from: DEFAULT_KERNEL_BLOB */
    private static final java.lang.String f71086x5717d541 = "kernel_blob.bin";

    /* renamed from: DEFAULT_LIBRARY */
    private static final java.lang.String f71087x4873087d = "libflutter.so";

    /* renamed from: DISABLE_MERGED_PLATFORM_UI_THREAD_KEY */
    private static final java.lang.String f71088x9813d185 = "io.flutter.embedding.android.DisableMergedPlatformUIThread";

    /* renamed from: ENABLE_FLUTTER_GPU */
    private static final java.lang.String f71089x94aef50d = "io.flutter.embedding.android.EnableFlutterGPU";

    /* renamed from: ENABLE_IMPELLER_META_DATA_KEY */
    private static final java.lang.String f71090x390346a7 = "io.flutter.embedding.android.EnableImpeller";

    /* renamed from: ENABLE_SURFACE_CONTROL */
    private static final java.lang.String f71091x2053ccf = "io.flutter.embedding.android.EnableSurfaceControl";

    /* renamed from: ENABLE_VULKAN_VALIDATION_META_DATA_KEY */
    private static final java.lang.String f71092x7bed15b6 = "io.flutter.embedding.android.EnableVulkanValidation";

    /* renamed from: FLUTTER_ASSETS_DIR_KEY */
    static final java.lang.String f71093x64b4e954 = "flutter-assets-dir";

    /* renamed from: IMPELLER_ANTIALIAS_LINES */
    private static final java.lang.String f71094xd57008f5 = "io.flutter.embedding.android.ImpellerAntialiasLines";

    /* renamed from: IMPELLER_BACKEND_META_DATA_KEY */
    private static final java.lang.String f71095xaba356e0 = "io.flutter.embedding.android.ImpellerBackend";

    /* renamed from: IMPELLER_LAZY_SHADER_MODE */
    private static final java.lang.String f71096xc7bc50cb = "io.flutter.embedding.android.ImpellerLazyShaderInitialization";

    /* renamed from: IMPELLER_OPENGL_GPU_TRACING_DATA_KEY */
    private static final java.lang.String f71097x99e27711 = "io.flutter.embedding.android.EnableOpenGLGPUTracing";

    /* renamed from: IMPELLER_VULKAN_GPU_TRACING_DATA_KEY */
    private static final java.lang.String f71098x2d87d815 = "io.flutter.embedding.android.EnableVulkanGPUTracing";

    /* renamed from: ISOLATE_SNAPSHOT_DATA_KEY */
    static final java.lang.String f71099x4fb1e591 = "isolate-snapshot-data";

    /* renamed from: LEAK_VM_META_DATA_KEY */
    private static final java.lang.String f71100xda1adaf8 = "io.flutter.embedding.android.LeakVM";

    /* renamed from: OLD_GEN_HEAP_SIZE_META_DATA_KEY */
    private static final java.lang.String f71101x99123852 = "io.flutter.embedding.android.OldGenHeapSize";

    /* renamed from: SNAPSHOT_ASSET_PATH_KEY */
    static final java.lang.String f71102xcc0a638f = "snapshot-asset-path";
    private static final java.lang.String TAG = "FlutterLoader";

    /* renamed from: VMSERVICE_SNAPSHOT_LIBRARY */
    private static final java.lang.String f71103xc16e1b41 = "libvmservice_snapshot.so";

    /* renamed from: VM_SNAPSHOT_DATA_KEY */
    static final java.lang.String f71104x1e2950bd = "vm-snapshot-data";

    /* renamed from: instance */
    private static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f f71105x21169495;

    /* renamed from: executorService */
    private java.util.concurrent.ExecutorService f71106x8a276262;

    /* renamed from: flutterApplicationInfo */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28614xf98e2682 f71107xca457a62;

    /* renamed from: flutterJNI */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 f71108x2014a1e9;

    /* renamed from: initResultFuture */
    java.util.concurrent.Future<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.InitResult> f71109xd7449970;

    /* renamed from: initStartTimestampMillis */
    private long f71110x698edb6a;

    /* renamed from: initialized */
    private boolean f71111x498da6d4;

    /* renamed from: settings */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.Settings f71112x5582bc23;

    /* renamed from: io.flutter.embedding.engine.loader.FlutterLoader$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements java.util.concurrent.Callable<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.InitResult> {

        /* renamed from: val$appContext */
        final /* synthetic */ android.content.Context f71114x273329b1;

        public AnonymousClass1(android.content.Context context) {
            this.f71114x273329b1 = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$call$0 */
        public /* synthetic */ void m137943xd8fae2e7(android.content.Context context) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.this.f71108x2014a1e9.m137715xdcd251b4(io.p3284xd2ae381c.p3319x36f002.C28969x6063ab6c.m139410xbca9ae01(context));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.InitResult call() {
            java.lang.String str;
            java.lang.String str2;
            java.lang.String[] strArr;
            io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterLoader initTask");
            try {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.m137924x1295e496();
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996 m137925xe6662af5 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.this.m137925xe6662af5(this.f71114x273329b1);
                try {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.this.f71108x2014a1e9.m137693xeb57c8f5(this.f71114x273329b1);
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.this.f71108x2014a1e9.m137764x695fb5d2();
                    java.util.concurrent.ExecutorService executorService = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.this.f71106x8a276262;
                    final android.content.Context context = this.f71114x273329b1;
                    executorService.execute(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.loader.FlutterLoader$1$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.AnonymousClass1.this.m137943xd8fae2e7(context);
                        }
                    });
                    if (m137925xe6662af5 != null) {
                        m137925xe6662af5.m137958x5cfb0a10();
                    }
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.InitResult initResult = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.InitResult(io.p3284xd2ae381c.p3319x36f002.C28969x6063ab6c.m139413x5010680c(this.f71114x273329b1), io.p3284xd2ae381c.p3319x36f002.C28969x6063ab6c.m139410xbca9ae01(this.f71114x273329b1), io.p3284xd2ae381c.p3319x36f002.C28969x6063ab6c.m139412x18650a2d(this.f71114x273329b1), null);
                    if (m139423xc9e48c90 != null) {
                        m139423xc9e48c90.close();
                    }
                    return initResult;
                } catch (java.lang.UnsatisfiedLinkError e17) {
                    if (!e17.toString().contains("couldn't find \"libflutter.so\"") && !e17.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                        throw e17;
                    }
                    java.lang.String property = java.lang.System.getProperty("os.arch");
                    java.io.File file = new java.io.File(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.this.f71107xca457a62.f71080xc3c7a549);
                    java.lang.String[] list = file.list();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.String[] strArr2 = android.os.Build.SUPPORTED_ABIS;
                    int length = strArr2.length;
                    int i17 = 0;
                    while (i17 < length) {
                        java.lang.String str3 = strArr2[i17];
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("!");
                        java.lang.String str4 = java.io.File.separator;
                        sb6.append(str4);
                        sb6.append(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428);
                        sb6.append(str4);
                        sb6.append(str3);
                        java.lang.String sb7 = sb6.toString();
                        java.lang.String[] strArr3 = this.f71114x273329b1.getApplicationInfo().splitSourceDirs;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        if (strArr3 != null) {
                            int length2 = strArr3.length;
                            int i18 = 0;
                            while (i18 < length2) {
                                arrayList2.add(strArr3[i18] + sb7);
                                i18++;
                                strArr2 = strArr2;
                            }
                            strArr = strArr2;
                            arrayList.addAll(arrayList2);
                        } else {
                            strArr = strArr2;
                        }
                        java.lang.String str5 = this.f71114x273329b1.getApplicationInfo().sourceDir;
                        if (str5 != null && !str5.isEmpty()) {
                            arrayList.add(str5 + sb7);
                        }
                        i17++;
                        strArr2 = strArr;
                    }
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                    sb8.append(property);
                    sb8.append(", and the native libraries directory (with path ");
                    sb8.append(file.getAbsolutePath());
                    sb8.append(") ");
                    if (file.exists()) {
                        str = "contains the following files: " + java.util.Arrays.toString(list);
                    } else {
                        str = "does not exist";
                    }
                    sb8.append(str);
                    if (arrayList.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = ", and the split and source libraries directory (with path(s) " + arrayList + ")";
                    }
                    sb8.append(str2);
                    sb8.append(".");
                    throw new java.lang.UnsupportedOperationException(sb8.toString(), e17);
                }
            } finally {
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.loader.FlutterLoader$InitResult */
    /* loaded from: classes13.dex */
    public static class InitResult {

        /* renamed from: appStoragePath */
        final java.lang.String f71115x9028a45f;

        /* renamed from: dataDirPath */
        final java.lang.String f71116xb3ee348;

        /* renamed from: engineCachesPath */
        final java.lang.String f71117xd4f484d8;

        public /* synthetic */ InitResult(java.lang.String str, java.lang.String str2, java.lang.String str3, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.AnonymousClass1 anonymousClass1) {
            this(str, str2, str3);
        }

        private InitResult(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.f71115x9028a45f = str;
            this.f71117xd4f484d8 = str2;
            this.f71116xb3ee348 = str3;
        }
    }

    /* renamed from: io.flutter.embedding.engine.loader.FlutterLoader$Settings */
    /* loaded from: classes11.dex */
    public static class Settings {

        /* renamed from: logTag */
        private java.lang.String f71118xbe97adb6;

        /* renamed from: getLogTag */
        public java.lang.String m137944x23aed0ac() {
            return this.f71118xbe97adb6;
        }

        /* renamed from: setLogTag */
        public void m137945x16e404b8(java.lang.String str) {
            this.f71118xbe97adb6 = str;
        }
    }

    public C28615x75ebff2f() {
        this(io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136952xffee662b().m137772xf9e7376a());
    }

    /* renamed from: fullAssetPathFrom */
    private java.lang.String m137923x31aca230(java.lang.String str) {
        return this.f71107xca457a62.f71078xdfbe8d4e + java.io.File.separator + str;
    }

    /* renamed from: getCPUAbi */
    public static void m137924x1295e496() {
        int i17 = 0;
        int i18 = 0;
        boolean z17 = false;
        boolean z18 = false;
        while (true) {
            java.lang.String[] strArr = android.os.Build.SUPPORTED_32_BIT_ABIS;
            if (i18 >= strArr.length) {
                break;
            }
            java.lang.String str = strArr[i18];
            if ("armeabi".equalsIgnoreCase(str)) {
                z17 = true;
            } else if ("armeabi-v7a".equalsIgnoreCase(str)) {
                z18 = true;
            } else if (!"x86".equalsIgnoreCase(str)) {
                "mips".equalsIgnoreCase(str);
            }
            i18++;
        }
        boolean z19 = false;
        while (true) {
            java.lang.String[] strArr2 = android.os.Build.SUPPORTED_64_BIT_ABIS;
            if (i17 >= strArr2.length) {
                break;
            }
            java.lang.String str2 = strArr2[i17];
            if ("arm64-v8a".equalsIgnoreCase(str2)) {
                z19 = true;
            } else if (!"x86_64".equalsIgnoreCase(str2)) {
                "mips64".equalsIgnoreCase(str2);
            }
            i17++;
        }
        if (z19) {
            f71085x659f2d11 = "arm64-v8a";
        } else if (z17 || z18) {
            f71085x659f2d11 = "armeabi-v7a";
        } else {
            f71085x659f2d11 = "x86_64";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initResources */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996 m137925xe6662af5(android.content.Context context) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996 c28620xee791996 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28620xee791996(io.p3284xd2ae381c.p3319x36f002.C28969x6063ab6c.m139412x18650a2d(context), context.getPackageName(), context.getPackageManager(), context.getResources().getAssets());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f71085x659f2d11);
        java.lang.String str = java.io.File.separator;
        sb6.append(str);
        sb6.append(this.f71107xca457a62.f71081x7c42bfe5);
        c28620xee791996.m137955xb1996fcf(m137923x31aca230(sb6.toString())).m137955xb1996fcf(m137923x31aca230(f71085x659f2d11 + str + this.f71107xca457a62.f71079x1c2dc3d9));
        c28620xee791996.m137957x68ac462();
        return c28620xee791996;
    }

    /* renamed from: isLeakVM */
    private static boolean m137926xe6354f24(android.os.Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean(f71100xda1adaf8, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$ensureInitializationCompleteAsync$1 */
    public static /* synthetic */ void m137927xac3695d5(java.lang.Runnable runnable) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.m137570x231e8ab5();
        io.p3284xd2ae381c.Log.i(TAG, "ensureInitializationCompleteAsync afterInit finished");
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$ensureInitializationCompleteAsync$2 */
    public /* synthetic */ void m137928xac3695d6(android.content.Context context, java.lang.String[] strArr, final java.lang.Runnable runnable) {
        try {
            this.f71109xd7449970.get();
            m137932xa072d3d7(context.getApplicationContext(), strArr, false);
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.loader.FlutterLoader$$a
                @Override // java.lang.Runnable
                public final void run() {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.m137927xac3695d5(runnable);
                }
            });
        } catch (java.lang.Exception e17) {
            io.p3284xd2ae381c.Log.e(TAG, "Flutter initialization failed.", e17);
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startInitialization$0 */
    public /* synthetic */ void m137929x3ded4c91(android.content.Context context) {
        io.p3284xd2ae381c.Log.i(TAG, "startInitialization, start init VsyncWaiter");
        io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.m139644x9cf0d20b((android.hardware.display.DisplayManager) context.getSystemService("display"), this.f71108x2014a1e9).m139646x316510();
        io.p3284xd2ae381c.Log.i(TAG, "startInitialization, finish init VsyncWaiter");
    }

    /* renamed from: automaticallyRegisterPlugins */
    public boolean m137930xd546f15a() {
        return this.f71107xca457a62.f71076xd546f15a;
    }

    /* renamed from: ensureInitializationComplete */
    public void m137931xa072d3d7(android.content.Context context, java.lang.String[] strArr) {
        m137932xa072d3d7(context, strArr, true);
    }

    /* renamed from: ensureInitializationCompleteAsync */
    public void m137933x58050ce5(final android.content.Context context, final java.lang.String[] strArr, android.os.Handler handler, final java.lang.Runnable runnable) {
        if (this.f71112x5582bc23 == null) {
            throw new java.lang.IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        if (this.f71111x498da6d4) {
            handler.post(runnable);
        } else {
            this.f71106x8a276262.execute(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.loader.FlutterLoader$$b
                @Override // java.lang.Runnable
                public final void run() {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.this.m137928xac3695d6(context, strArr, runnable);
                }
            });
        }
    }

    /* renamed from: findAppBundlePath */
    public java.lang.String m137934x595ee78f() {
        return this.f71107xca457a62.f71078xdfbe8d4e;
    }

    /* renamed from: getLookupKeyForAsset */
    public java.lang.String m137935x1898ec96(java.lang.String str) {
        return m137923x31aca230(str);
    }

    /* renamed from: initialized */
    public boolean m137937x498da6d4() {
        return this.f71111x498da6d4;
    }

    /* renamed from: startInitialization */
    public void m137938x6fa2b5a2(android.content.Context context) {
        m137940x6fa2b5a2(context, new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.Settings(), true);
    }

    /* renamed from: startInitializationAsync */
    public void m137941xfb0191fa(android.content.Context context) {
        m137940x6fa2b5a2(context, new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.Settings(), false);
    }

    public C28615x75ebff2f(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        this(c28586x96e67e09, io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136950x8a276262());
    }

    /* renamed from: ensureInitializationComplete */
    public void m137932xa072d3d7(android.content.Context context, java.lang.String[] strArr, boolean z17) {
        java.lang.String str;
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 c28972x8eeb7200;
        if (this.f71111x498da6d4) {
            return;
        }
        if (z17) {
            str = "--impeller-backend=";
            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                throw new java.lang.IllegalStateException("ensureInitializationComplete must be called on the main thread");
            }
        } else {
            str = "--impeller-backend=";
        }
        if (this.f71112x5582bc23 != null) {
            try {
                io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterLoader#ensureInitializationComplete");
                try {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.InitResult initResult = this.f71109xd7449970.get();
                    c28972x8eeb7200 = m139423xc9e48c90;
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("--icu-native-lib-path=");
                        sb6.append(this.f71107xca457a62.f71080xc3c7a549);
                        java.lang.String str2 = java.io.File.separator;
                        sb6.append(str2);
                        sb6.append(f71087x4873087d);
                        arrayList.add(sb6.toString());
                        if (strArr != null) {
                            java.util.Collections.addAll(arrayList, strArr);
                        }
                        java.lang.String str3 = initResult.f71116xb3ee348 + str2 + this.f71107xca457a62.f71078xdfbe8d4e + str2 + f71085x659f2d11;
                        java.lang.String str4 = str3 + str2 + this.f71107xca457a62.f71081x7c42bfe5;
                        java.lang.String str5 = str3 + str2 + this.f71107xca457a62.f71079x1c2dc3d9;
                        java.io.File file = new java.io.File(str4);
                        java.io.File file2 = new java.io.File(str5);
                        if (file.exists() && file2.exists()) {
                            arrayList.add("--snapshot-asset-path=" + str3);
                            arrayList.add("--vm-snapshot-data=" + this.f71107xca457a62.f71081x7c42bfe5);
                            arrayList.add("--isolate-snapshot-data=" + this.f71107xca457a62.f71079x1c2dc3d9);
                        } else if ((!file.exists() && file2.exists()) || (file.exists() && !file2.exists())) {
                            io.p3284xd2ae381c.Log.i(TAG, "vm_snapshot_data and isolate_snapshot_data. This two files only exist one of them.");
                        }
                        arrayList.add("--aot-shared-library-name=" + this.f71107xca457a62.f71075xc8af4adb);
                        arrayList.add("--aot-shared-library-name=" + this.f71107xca457a62.f71080xc3c7a549 + str2 + this.f71107xca457a62.f71075xc8af4adb);
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("--cache-dir-path=");
                        sb7.append(initResult.f71117xd4f484d8);
                        arrayList.add(sb7.toString());
                        if (this.f71107xca457a62.f71077x3c794a9c != null) {
                            arrayList.add("--domain-network-policy=" + this.f71107xca457a62.f71077x3c794a9c);
                        }
                        if (this.f71112x5582bc23.m137944x23aed0ac() != null) {
                            arrayList.add("--log-tag=" + this.f71112x5582bc23.m137944x23aed0ac());
                        }
                        android.os.Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        int i17 = bundle != null ? bundle.getInt(f71101x99123852) : 0;
                        if (i17 == 0) {
                            ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getMemoryInfo(new android.app.ActivityManager.MemoryInfo());
                            i17 = (int) ((r7.totalMem / 1000000.0d) / 2.0d);
                        }
                        arrayList.add("--old-gen-heap-size=" + i17);
                        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 12 * 4));
                        arrayList.add("--prefetched-default-font-manager");
                        if (bundle != null) {
                            if (bundle.containsKey(f71090x390346a7)) {
                                if (bundle.getBoolean(f71090x390346a7)) {
                                    arrayList.add(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691.f70910xfe029af9);
                                } else {
                                    arrayList.add(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691.f70906x9a72d246);
                                }
                            }
                            if (bundle.getBoolean(f71092x7bed15b6, false)) {
                                arrayList.add(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691.f70914x4075163a);
                            }
                            if (bundle.getBoolean(f71097x99e27711, false)) {
                                arrayList.add("--enable-opengl-gpu-tracing");
                            }
                            if (bundle.getBoolean(f71098x2d87d815, false)) {
                                arrayList.add("--enable-vulkan-gpu-tracing");
                            }
                            if (bundle.getBoolean(f71088x9813d185, false)) {
                                arrayList.add("--merged-platform-ui-thread=disabled");
                            }
                            if (bundle.getBoolean(f71089x94aef50d, false)) {
                                arrayList.add("--enable-flutter-gpu");
                            }
                            if (bundle.getBoolean(f71091x2053ccf, false)) {
                                arrayList.add("--enable-surface-control");
                            }
                            java.lang.String string = bundle.getString(f71095xaba356e0);
                            if (string != null) {
                                arrayList.add(str.concat(string));
                            }
                            if (bundle.getBoolean(f71096xc7bc50cb)) {
                                arrayList.add("--impeller-lazy-shader-mode");
                            }
                            if (bundle.getBoolean(f71094xd57008f5)) {
                                arrayList.add("--impeller-antialias-lines");
                            }
                        }
                        arrayList.add("--leak-vm=".concat(m137926xe6354f24(bundle) ? "true" : "false"));
                        long uptimeMillis = android.os.SystemClock.uptimeMillis() - this.f71110x698edb6a;
                        if (z17) {
                            this.f71108x2014a1e9.m137682x316510(context, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), null, initResult.f71115x9028a45f, initResult.f71117xd4f484d8, uptimeMillis, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue());
                        } else {
                            this.f71108x2014a1e9.m137683x403a7b6b(context, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), null, initResult.f71115x9028a45f, initResult.f71117xd4f484d8, uptimeMillis, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue());
                        }
                        this.f71111x498da6d4 = true;
                        if (c28972x8eeb7200 != null) {
                            c28972x8eeb7200.close();
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        java.lang.Throwable th7 = th;
                        if (c28972x8eeb7200 == null) {
                            throw th7;
                        }
                        try {
                            c28972x8eeb7200.close();
                            throw th7;
                        } catch (java.lang.Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    c28972x8eeb7200 = m139423xc9e48c90;
                }
            } catch (java.lang.Exception e17) {
                io.p3284xd2ae381c.Log.e(TAG, "Flutter initialization failed.", e17);
                throw new java.lang.RuntimeException(e17);
            }
        } else {
            throw new java.lang.IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
    }

    /* renamed from: getLookupKeyForAsset */
    public java.lang.String m137936x1898ec96(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("packages");
        java.lang.String str3 = java.io.File.separator;
        sb6.append(str3);
        sb6.append(str2);
        sb6.append(str3);
        sb6.append(str);
        return m137935x1898ec96(sb6.toString());
    }

    /* renamed from: startInitialization */
    public void m137939x6fa2b5a2(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.Settings settings) {
        m137940x6fa2b5a2(context, settings, true);
    }

    /* renamed from: startInitializationAsync */
    public void m137942xfb0191fa(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.Settings settings) {
        m137940x6fa2b5a2(context, settings, false);
    }

    public C28615x75ebff2f(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09, java.util.concurrent.ExecutorService executorService) {
        this.f71111x498da6d4 = false;
        this.f71108x2014a1e9 = c28586x96e67e09;
        this.f71106x8a276262 = executorService;
    }

    /* renamed from: startInitialization */
    public void m137940x6fa2b5a2(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.Settings settings, boolean z17) {
        if (this.f71112x5582bc23 != null) {
            return;
        }
        if (z17 && android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("startInitialization must be called on the main thread");
        }
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterLoader#startInitialization");
        try {
            final android.content.Context applicationContext = context.getApplicationContext();
            this.f71112x5582bc23 = settings;
            this.f71110x698edb6a = android.os.SystemClock.uptimeMillis();
            this.f71107xca457a62 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28613x855993b1.m137915x32c4e6(applicationContext);
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.loader.FlutterLoader$$c
                @Override // java.lang.Runnable
                public final void run() {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.this.m137929x3ded4c91(applicationContext);
                }
            });
            this.f71109xd7449970 = this.f71106x8a276262.submit(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.AnonymousClass1(applicationContext));
            if (m139423xc9e48c90 != null) {
                m139423xc9e48c90.close();
            }
        } catch (java.lang.Throwable th6) {
            if (m139423xc9e48c90 != null) {
                try {
                    m139423xc9e48c90.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }
}

package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.tinker.loader.TinkerResourcePatcher */
/* loaded from: classes13.dex */
public class C26606xacf71dc8 {
    private static final java.lang.String TAG = "Tinker.ResourcePatcher";

    /* renamed from: TEST_ASSETS_VALUE */
    private static final java.lang.String f55475x4d982022 = "only_use_to_test_tinker_resource.txt";

    /* renamed from: addAssetPathAsSharedLibraryMethod */
    private static java.lang.reflect.Method f55476xadddd051;

    /* renamed from: addAssetPathMethod */
    private static java.lang.reflect.Method f55477xa5235595;

    /* renamed from: assetsFiled */
    private static java.lang.reflect.Field f55478x7ed610a5;

    /* renamed from: currentActivityThread */
    private static java.lang.Object f55479x886627d2;

    /* renamed from: ensureStringBlocksMethod */
    private static java.lang.reflect.Method f55480x28baf596;

    /* renamed from: newAssetManager */
    private static android.content.res.AssetManager f55481x518f1c5d;

    /* renamed from: newAssetManagerCtor */
    private static java.lang.reflect.Constructor<?> f55482x81dfdc11;

    /* renamed from: packageContext */
    private static android.content.Context f55483x351a5e89;

    /* renamed from: packageResContext */
    private static android.content.Context f55484x251a11d5;

    /* renamed from: packagesFiled */
    private static java.lang.reflect.Field f55485x936b817b;

    /* renamed from: publicSourceDirField */
    private static java.lang.reflect.Field f55486x61d61071;

    /* renamed from: references */
    private static java.util.Collection<java.lang.ref.WeakReference<android.content.res.Resources>> f55487x528caa88;

    /* renamed from: resDir */
    private static java.lang.reflect.Field f55488xc84d0fcd;

    /* renamed from: resourceImpls */
    private static java.util.Map<java.lang.Object, java.lang.ref.WeakReference<java.lang.Object>> f55489x392a86e5;

    /* renamed from: resourcePackagesFiled */
    private static java.lang.reflect.Field f55490x8dbe740d;

    /* renamed from: resourcesImplFiled */
    private static java.lang.reflect.Field f55491xefbb3783;

    /* renamed from: storedPatchedResModifiedTime */
    private static long f55492x40beef92;

    /* renamed from: stringBlocksField */
    private static java.lang.reflect.Field f55493x7b10aa43;

    /* renamed from: com.tencent.tinker.loader.TinkerResourcePatcher$ResourceInsuranceHandlerCallback */
    /* loaded from: classes13.dex */
    public static final class ResourceInsuranceHandlerCallback implements android.os.Handler.Callback {

        /* renamed from: LAUNCH_ACTIVITY_LIFECYCLE_ITEM_CLASSNAME */
        private static final java.lang.String f55494x929984f0 = "android.app.servertransaction.LaunchActivityItem";

        /* renamed from: EXECUTE_TRANSACTION */
        private final int f55495xded9f0d4;

        /* renamed from: LAUNCH_ACTIVITY */
        private final int f55496xdeef61b;

        /* renamed from: RELAUNCH_ACTIVITY */
        private final int f55497xb0a8df88;

        /* renamed from: mContext */
        private final android.content.Context f55498xd6cfe882;

        /* renamed from: mOriginalCallback */
        private final android.os.Handler.Callback f55500xcb2677c3;

        /* renamed from: mPatchResApkPath */
        private final java.lang.String f55501xdafb41dc;

        /* renamed from: mGetCallbacksMethod */
        private java.lang.reflect.Method f55499xb4598066 = null;

        /* renamed from: mSkipInterceptExecuteTransaction */
        private boolean f55502x22c55d5f = false;

        public ResourceInsuranceHandlerCallback(android.content.Context context, java.lang.String str, android.os.Handler.Callback callback, java.lang.Class<?> cls) {
            android.content.Context applicationContext = context.getApplicationContext();
            this.f55498xd6cfe882 = applicationContext != null ? applicationContext : context;
            this.f55501xdafb41dc = str;
            this.f55500xcb2677c3 = callback;
            this.f55496xdeef61b = m104531x88732de8(cls, "LAUNCH_ACTIVITY", 100);
            this.f55497xb0a8df88 = m104531x88732de8(cls, "RELAUNCH_ACTIVITY", 126);
            if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104742x33bbb0c9(28, true)) {
                this.f55495xded9f0d4 = m104531x88732de8(cls, "EXECUTE_TRANSACTION ", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de);
            } else {
                this.f55495xded9f0d4 = -1;
            }
        }

        /* renamed from: fetchMessageId */
        private int m104531x88732de8(java.lang.Class<?> cls, java.lang.String str, int i17) {
            try {
                return com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(cls, str).getInt(null);
            } catch (java.lang.Throwable unused) {
                return i17;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
        
            if (r6.getClass().getName().equals(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26606xacf71dc8.ResourceInsuranceHandlerCallback.f55494x929984f0) != false) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: hackMessage */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean m104532x6a74c1a6(android.os.Message r6) {
            /*
                r5 = this;
                java.lang.String r0 = r5.f55501xdafb41dc
                boolean r0 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26606xacf71dc8.m104522xbbd77af0(r0)
                java.lang.String r1 = "Tinker.ResourcePatcher"
                r2 = 1
                r3 = 0
                if (r0 != 0) goto Lf
            Lc:
                r6 = r3
                goto L7b
            Lf:
                int r0 = r6.what
                int r4 = r5.f55496xdeef61b
                if (r0 == r4) goto L7a
                int r4 = r5.f55497xb0a8df88
                if (r0 != r4) goto L1a
                goto L7a
            L1a:
                int r4 = r5.f55495xded9f0d4
                if (r0 != r4) goto Lc
                boolean r0 = r5.f55502x22c55d5f
                if (r0 == 0) goto L23
                goto Lc
            L23:
                java.lang.Object r6 = r6.obj
                if (r6 != 0) goto L2f
                java.lang.String r6 = "transaction is null, skip rest insurance logic."
                java.lang.Object[] r0 = new java.lang.Object[r3]
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(r1, r6, r0)
                goto Lc
            L2f:
                java.lang.reflect.Method r0 = r5.f55499xb4598066
                if (r0 != 0) goto L3d
                java.lang.String r0 = "getCallbacks"
                java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3d
                java.lang.reflect.Method r0 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104705xfb2fc3fa(r6, r0, r4)     // Catch: java.lang.Throwable -> L3d
                r5.f55499xb4598066 = r0     // Catch: java.lang.Throwable -> L3d
            L3d:
                java.lang.reflect.Method r0 = r5.f55499xb4598066
                if (r0 != 0) goto L4b
                java.lang.String r6 = "fail to find getLifecycleStateRequest method, skip rest insurance logic."
                java.lang.Object[] r0 = new java.lang.Object[r3]
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(r1, r6, r0)
                r5.f55502x22c55d5f = r2
                goto Lc
            L4b:
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L72
                java.lang.Object r6 = r0.invoke(r6, r4)     // Catch: java.lang.Throwable -> L72
                java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L72
                if (r6 == 0) goto Lc
                int r0 = r6.size()     // Catch: java.lang.Throwable -> L72
                if (r0 <= 0) goto Lc
                java.lang.Object r6 = r6.get(r3)     // Catch: java.lang.Throwable -> L72
                if (r6 == 0) goto Lc
                java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L72
                java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L72
                java.lang.String r0 = "android.app.servertransaction.LaunchActivityItem"
                boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> L72
                if (r6 == 0) goto Lc
                goto L7a
            L72:
                java.lang.String r6 = "fail to call getLifecycleStateRequest method, skip rest insurance logic."
                java.lang.Object[] r0 = new java.lang.Object[r3]
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(r1, r6, r0)
                goto Lc
            L7a:
                r6 = r2
            L7b:
                if (r6 == 0) goto L8d
                android.content.Context r6 = r5.f55498xd6cfe882     // Catch: java.lang.Throwable -> L85
                java.lang.String r0 = r5.f55501xdafb41dc     // Catch: java.lang.Throwable -> L85
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26606xacf71dc8.m104528x62183525(r6, r0, r2)     // Catch: java.lang.Throwable -> L85
                goto L8d
            L85:
                r6 = move-exception
                java.lang.String r0 = "fail to ensure patched resources available after it's modified."
                java.lang.Object[] r2 = new java.lang.Object[r3]
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35(r1, r6, r0, r2)
            L8d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26606xacf71dc8.ResourceInsuranceHandlerCallback.m104532x6a74c1a6(android.os.Message):boolean");
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (m104532x6a74c1a6(message)) {
                return true;
            }
            android.os.Handler.Callback callback = this.f55500xcb2677c3;
            if (callback != null) {
                return callback.handleMessage(message);
            }
            return false;
        }
    }

    /* renamed from: checkResUpdate */
    private static boolean m104523xcacd4961(android.content.Context context) {
        try {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(context.getAssets().open(f55475x4d982022));
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "checkResUpdate success, found test resource assets file only_use_to_test_tinker_resource.txt", new java.lang.Object[0]);
            return true;
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "checkResUpdate failed, can't find test resource assets file only_use_to_test_tinker_resource.txt e:" + th6.getMessage(), new java.lang.Object[0]);
                return false;
            } finally {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104666xd71209a9(null);
            }
        }
    }

    /* renamed from: clearPreloadTypedArrayIssue */
    private static void m104524x4be85f6e(android.content.res.Resources resources) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "try to clear typedArray cache!", new java.lang.Object[0]);
        try {
            java.lang.Object obj = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1((java.lang.Class<?>) android.content.res.Resources.class, "mTypedArrayPool").get(resources);
            do {
            } while (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104705xfb2fc3fa(obj, "acquire", (java.lang.Class<?>[]) new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]) != null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "clearPreloadTypedArrayIssue failed, ignore error: " + th6, new java.lang.Object[0]);
        }
    }

    /* renamed from: installResourceInsuranceHacks */
    private static void m104525x953201e1(android.content.Context context, java.lang.String str) {
        try {
            java.lang.Object m104706x60a4f2ef = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104706x60a4f2ef(context, null);
            android.os.Handler handler = (android.os.Handler) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(m104706x60a4f2ef, "mH").get(m104706x60a4f2ef);
            java.lang.reflect.Field m104702x183d66c1 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1((java.lang.Class<?>) android.os.Handler.class, "mCallback");
            android.os.Handler.Callback callback = (android.os.Handler.Callback) m104702x183d66c1.get(handler);
            if (callback instanceof com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26606xacf71dc8.ResourceInsuranceHandlerCallback) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "installResourceInsuranceHacks: already installed, skip rest logic.", new java.lang.Object[0]);
            } else {
                m104702x183d66c1.set(handler, new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26606xacf71dc8.ResourceInsuranceHandlerCallback(context, str, callback, handler.getClass()));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35(TAG, th6, "failed to install resource insurance hack.", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPatchedResModifiedAfterLastLoad */
    public static boolean m104526x334ef50c(java.lang.String str) {
        long j17;
        try {
            j17 = new java.io.File(str).lastModified();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35(TAG, th6, "Fail to get patched res modified time.", new java.lang.Object[0]);
            j17 = 0;
        }
        return (j17 == 0 || j17 == f55492x40beef92) ? false : true;
    }

    /* renamed from: isResourceCanPatch */
    public static void m104527x36c409d0(android.content.Context context) {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2 = java.lang.Class.forName("android.app.ActivityThread");
        f55479x886627d2 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104706x60a4f2ef(context, cls2);
        try {
            cls = java.lang.Class.forName("android.app.LoadedApk");
        } catch (java.lang.ClassNotFoundException unused) {
            cls = java.lang.Class.forName("android.app.ActivityThread$PackageInfo");
        }
        f55488xc84d0fcd = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(cls, "mResDir");
        f55485x936b817b = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(cls2, "mPackages");
        try {
            f55490x8dbe740d = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(cls2, "mResourcePackages");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35(TAG, th6, "Fail to get mResourcePackages field.", new java.lang.Object[0]);
            f55490x8dbe740d = null;
        }
        android.content.res.AssetManager assets = context.getAssets();
        f55477xa5235595 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104705xfb2fc3fa(assets, "addAssetPath", (java.lang.Class<?>[]) new java.lang.Class[]{java.lang.String.class});
        if (m104530x699da6eb(context.getApplicationInfo())) {
            f55476xadddd051 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104705xfb2fc3fa(assets, "addAssetPathAsSharedLibrary", (java.lang.Class<?>[]) new java.lang.Class[]{java.lang.String.class});
        }
        try {
            f55493x7b10aa43 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(assets, "mStringBlocks");
            f55480x28baf596 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104705xfb2fc3fa(assets, "ensureStringBlocks", (java.lang.Class<?>[]) new java.lang.Class[0]);
        } catch (java.lang.Throwable unused2) {
        }
        f55482x81dfdc11 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104701xf3d1ec81(assets, (java.lang.Class<?>[]) new java.lang.Class[0]);
        java.lang.Class<?> cls3 = java.lang.Class.forName("android.app.ResourcesManager");
        java.lang.Object invoke = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104704xfb2fc3fa(cls3, "getInstance", (java.lang.Class<?>[]) new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        try {
            f55487x528caa88 = ((android.util.ArrayMap) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(cls3, "mActiveResources").get(invoke)).values();
        } catch (java.lang.NoSuchFieldException unused3) {
            f55487x528caa88 = (java.util.Collection) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(cls3, "mResourceReferences").get(invoke);
            try {
                f55489x392a86e5 = (java.util.Map) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(cls3, "mResourceImpls").get(invoke);
            } catch (java.lang.Throwable unused4) {
                f55489x392a86e5 = null;
            }
        }
        if (f55487x528caa88 == null) {
            throw new java.lang.IllegalStateException("resource references is null");
        }
        android.content.res.Resources resources = context.getResources();
        try {
            f55491xefbb3783 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(resources, "mResourcesImpl");
        } catch (java.lang.Throwable unused5) {
            f55478x7ed610a5 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(resources, "mAssets");
        }
        try {
            f55486x61d61071 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1((java.lang.Class<?>) android.content.pm.ApplicationInfo.class, "publicSourceDir");
        } catch (java.lang.NoSuchFieldException unused6) {
        }
    }

    /* renamed from: monkeyPatchExistingResources */
    public static void m104528x62183525(android.content.Context context, java.lang.String str, boolean z17) {
        if (str == null) {
            return;
        }
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        f55483x351a5e89 = context.createPackageContext(context.getPackageName(), 1);
        f55484x251a11d5 = context.createPackageContext(context.getPackageName(), 0);
        java.lang.reflect.Field[] fieldArr = {f55485x936b817b, f55490x8dbe740d};
        for (int i17 = 0; i17 < 2; i17++) {
            java.lang.reflect.Field field = fieldArr[i17];
            if (field != null) {
                java.util.Iterator it = ((java.util.Map) field.get(f55479x886627d2)).entrySet().iterator();
                while (it.hasNext()) {
                    java.lang.Object obj = ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
                    if (obj != null && applicationInfo.sourceDir.equals((java.lang.String) f55488xc84d0fcd.get(obj))) {
                        f55488xc84d0fcd.set(obj, str);
                    }
                }
            }
        }
        if (z17) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "Re-injecting, skip rest logic.", new java.lang.Object[0]);
            m104529x826ab617(str);
            return;
        }
        android.content.res.AssetManager assetManager = (android.content.res.AssetManager) f55482x81dfdc11.newInstance(new java.lang.Object[0]);
        f55481x518f1c5d = assetManager;
        if (((java.lang.Integer) f55477xa5235595.invoke(assetManager, str)).intValue() == 0) {
            throw new java.lang.IllegalStateException("Could not create new AssetManager");
        }
        m104529x826ab617(str);
        if (m104530x699da6eb(applicationInfo)) {
            for (java.lang.String str2 : applicationInfo.sharedLibraryFiles) {
                if (str2.endsWith(".apk")) {
                    if (((java.lang.Integer) f55476xadddd051.invoke(f55481x518f1c5d, str2)).intValue() == 0) {
                        throw new java.lang.IllegalStateException("AssetManager add SharedLibrary Fail");
                    }
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "addAssetPathAsSharedLibrary ".concat(str2), new java.lang.Object[0]);
                }
            }
        }
        java.lang.reflect.Field field2 = f55493x7b10aa43;
        java.lang.reflect.Field field3 = null;
        if (field2 != null && f55480x28baf596 != null) {
            field2.set(f55481x518f1c5d, null);
            f55480x28baf596.invoke(f55481x518f1c5d, new java.lang.Object[0]);
        }
        java.util.Iterator<java.lang.ref.WeakReference<android.content.res.Resources>> it6 = f55487x528caa88.iterator();
        while (it6.hasNext()) {
            android.content.res.Resources resources = it6.next().get();
            if (resources != null) {
                try {
                    f55478x7ed610a5.set(resources, f55481x518f1c5d);
                } catch (java.lang.Throwable unused) {
                    java.lang.Object obj2 = f55491xefbb3783.get(resources);
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(obj2, "mAssets").set(obj2, f55481x518f1c5d);
                }
                m104524x4be85f6e(resources);
                resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
            }
        }
        java.util.Map<java.lang.Object, java.lang.ref.WeakReference<java.lang.Object>> map = f55489x392a86e5;
        if (map != null) {
            java.lang.reflect.Field field4 = null;
            for (java.util.Map.Entry<java.lang.Object, java.lang.ref.WeakReference<java.lang.Object>> entry : map.entrySet()) {
                java.lang.Object key = entry.getKey();
                if (field3 == null) {
                    field3 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(key.getClass(), "mResDir");
                }
                if (applicationInfo.sourceDir.equals((java.lang.String) field3.get(key))) {
                    if (android.os.Build.VERSION.SDK_INT >= 35) {
                        field3.set(key, str);
                    }
                    java.lang.Object obj3 = entry.getValue().get();
                    if (obj3 != null) {
                        if (field4 == null) {
                            field4 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104703x183d66c1(obj3, "mAssets");
                        }
                        field4.set(obj3, f55481x518f1c5d);
                    }
                }
            }
        }
        try {
            java.lang.reflect.Field field5 = f55486x61d61071;
            if (field5 != null) {
                field5.set(context.getApplicationInfo(), str);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35(TAG, th6, "fail to process publicSourceDirField field hack.", new java.lang.Object[0]);
        }
        if (!m104523xcacd4961(context)) {
            throw new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26608x7636b0b6(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55628xc392eb38);
        }
        m104525x953201e1(context, str);
    }

    /* renamed from: recordCurrentPatchedResModifiedTime */
    private static void m104529x826ab617(java.lang.String str) {
        try {
            f55492x40beef92 = new java.io.File(str).lastModified();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35(TAG, th6, "Fail to store patched res modified time.", new java.lang.Object[0]);
            f55492x40beef92 = 0L;
        }
    }

    /* renamed from: shouldAddSharedLibraryAssets */
    private static boolean m104530x699da6eb(android.content.pm.ApplicationInfo applicationInfo) {
        return (applicationInfo == null || applicationInfo.sharedLibraryFiles == null) ? false : true;
    }
}

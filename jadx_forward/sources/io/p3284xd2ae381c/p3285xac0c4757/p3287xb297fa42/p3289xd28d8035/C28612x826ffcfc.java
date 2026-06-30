package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035;

/* renamed from: io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager */
/* loaded from: classes13.dex */
public class C28612x826ffcfc implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f {

    /* renamed from: MAPPING_KEY */
    public static final java.lang.String f71050x3a05ef2e = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f.class.getName().concat(".loadingUnitMapping");
    private static final java.lang.String TAG = "PlayStoreDeferredComponentManager";

    /* renamed from: channel */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28654x1f81a365 f71051x2c0b7d03;

    /* renamed from: context */
    private android.content.Context f71052x38b735af;

    /* renamed from: flutterApplicationInfo */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28614xf98e2682 f71053xca457a62;

    /* renamed from: flutterJNI */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 f71054x2014a1e9;

    /* renamed from: listener */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.C28612x826ffcfc.FeatureInstallStateUpdatedListener f71055x503cc4b4;

    /* renamed from: loadingUnitIdToComponentNames */
    protected android.util.SparseArray<java.lang.String> f71056x8907f7e1;

    /* renamed from: loadingUnitIdToSharedLibraryNames */
    protected android.util.SparseArray<java.lang.String> f71057x9091ece8;

    /* renamed from: nameToSessionId */
    private java.util.Map<java.lang.String, java.lang.Integer> f71058x2ac0228b;

    /* renamed from: sessionIdToLoadingUnitId */
    private android.util.SparseIntArray f71059xd9730cf;

    /* renamed from: sessionIdToName */
    private android.util.SparseArray<java.lang.String> f71060xa584b157;

    /* renamed from: sessionIdToState */
    private android.util.SparseArray<java.lang.String> f71061xb606745;

    /* renamed from: splitInstallManager */
    private qa.b f71062xfcf37f4c;

    /* renamed from: io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager$FeatureInstallStateUpdatedListener */
    /* loaded from: classes13.dex */
    public class FeatureInstallStateUpdatedListener {
        private FeatureInstallStateUpdatedListener() {
        }

        /* renamed from: onStateUpdate */
        public /* bridge */ /* synthetic */ void m137908x66c3015b(java.lang.Object obj) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
            m137909x66c3015b((qa.c) null);
        }

        /* renamed from: onStateUpdate */
        public void m137909x66c3015b(qa.c cVar) {
            throw null;
        }
    }

    public C28612x826ffcfc(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        this.f71052x38b735af = context;
        this.f71054x2014a1e9 = c28586x96e67e09;
        this.f71053xca457a62 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28613x855993b1.m137915x32c4e6(context);
        throw new java.lang.RuntimeException("stub!");
    }

    /* renamed from: getApplicationInfo */
    private android.content.pm.ApplicationInfo m137903x9a0587e8() {
        try {
            return this.f71052x38b735af.getPackageManager().getApplicationInfo(this.f71052x38b735af.getPackageName(), 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* renamed from: initLoadingUnitMappingToComponentNames */
    private void m137904xbf9a10c4() {
        android.os.Bundle bundle;
        android.content.pm.ApplicationInfo m137903x9a0587e8 = m137903x9a0587e8();
        if (m137903x9a0587e8 == null || (bundle = m137903x9a0587e8.metaData) == null) {
            return;
        }
        java.lang.String str = f71050x3a05ef2e;
        java.lang.String string = bundle.getString(str, null);
        if (string == null) {
            io.p3284xd2ae381c.Log.e(TAG, "No loading unit to dynamic feature module name found. Ensure '" + str + "' is defined in the base module's AndroidManifest.");
            return;
        }
        if (string.equals("")) {
            return;
        }
        for (java.lang.String str2 : string.split(",")) {
            java.lang.String[] split = str2.split(":", -1);
            int parseInt = java.lang.Integer.parseInt(split[0]);
            this.f71056x8907f7e1.put(parseInt, split[1]);
            if (split.length > 2) {
                this.f71057x9091ece8.put(parseInt, split[2]);
            }
        }
    }

    /* renamed from: lambda$installDeferredComponent$0 */
    private /* synthetic */ void m137905xdd1c564c(java.lang.String str, int i17, java.lang.Integer num) {
        this.f71060xa584b157.put(num.intValue(), str);
        this.f71059xd9730cf.put(num.intValue(), i17);
        if (this.f71058x2ac0228b.containsKey(str)) {
            this.f71061xb606745.remove(this.f71058x2ac0228b.get(str).intValue());
        }
        this.f71058x2ac0228b.put(str, num);
        this.f71061xb606745.put(num.intValue(), "Requested");
    }

    /* renamed from: lambda$installDeferredComponent$1 */
    private /* synthetic */ void m137906xdd1c564d(int i17, java.lang.String str, java.lang.Exception exc) {
        com.google.android.play.core.splitinstall.SplitInstallException splitInstallException = (com.google.android.play.core.splitinstall.SplitInstallException) exc;
        int errorCode = splitInstallException.getErrorCode();
        if (errorCode == -6) {
            this.f71054x2014a1e9.m137662x48987eed(i17, "Install of deferred component module \"" + str + "\" failed with a network error", true);
            return;
        }
        if (errorCode != -2) {
            this.f71054x2014a1e9.m137662x48987eed(i17, java.lang.String.format("Install of deferred component module \"%s\" failed with error %d: %s", str, java.lang.Integer.valueOf(splitInstallException.getErrorCode()), splitInstallException.getMessage()), false);
            return;
        }
        this.f71054x2014a1e9.m137662x48987eed(i17, "Install of deferred component module \"" + str + "\" failed as it is unavailable", false);
    }

    /* renamed from: verifyJNI */
    private boolean m137907x9aea986c() {
        if (this.f71054x2014a1e9 != null) {
            return true;
        }
        io.p3284xd2ae381c.Log.e(TAG, "No FlutterJNI provided. `setJNI` must be called on the DeferredComponentManager before attempting to load dart libraries or invoking with platform channels.");
        return false;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f
    /* renamed from: destroy */
    public void mo137889x5cd39ffa() {
        throw null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f
    /* renamed from: getDeferredComponentInstallState */
    public java.lang.String mo137890x17d2f6fe(int i17, java.lang.String str) {
        if (str == null) {
            str = this.f71056x8907f7e1.get(i17);
        }
        if (str == null) {
            io.p3284xd2ae381c.Log.e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
            return com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        if (this.f71058x2ac0228b.containsKey(str)) {
            return this.f71061xb606745.get(this.f71058x2ac0228b.get(str).intValue());
        }
        qa.b bVar = null;
        bVar.getInstalledModules();
        throw null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f
    /* renamed from: installDeferredComponent */
    public void mo137891x1f0d4383(int i17, java.lang.String str) {
        if (str == null) {
            str = this.f71056x8907f7e1.get(i17);
        }
        if (str == null) {
            io.p3284xd2ae381c.Log.e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
        } else {
            if (!str.equals("") || i17 <= 0) {
                throw new java.lang.RuntimeException("stub!");
            }
            mo137893xdafb2776(i17, str);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f
    /* renamed from: loadAssets */
    public void mo137892xd45e6009(int i17, java.lang.String str) {
        if (m137907x9aea986c()) {
            try {
                android.content.Context context = this.f71052x38b735af;
                android.content.Context createPackageContext = context.createPackageContext(context.getPackageName(), 0);
                this.f71052x38b735af = createPackageContext;
                this.f71054x2014a1e9.m137763xc1fc34c8(createPackageContext.getAssets(), this.f71053xca457a62.f71078xdfbe8d4e);
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f
    /* renamed from: loadDartLibrary */
    public void mo137893xdafb2776(int i17, java.lang.String str) {
        if (m137907x9aea986c() && i17 >= 0) {
            java.lang.String str2 = this.f71057x9091ece8.get(i17);
            if (str2 == null) {
                str2 = this.f71053xca457a62.f71075xc8af4adb + "-" + i17 + ".part.so";
            }
            java.lang.String str3 = android.os.Build.SUPPORTED_ABIS[0];
            java.lang.String replace = str3.replace("-", "_");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(this.f71052x38b735af.getFilesDir());
            for (java.lang.String str4 : this.f71052x38b735af.getApplicationInfo().splitSourceDirs) {
                linkedList.add(new java.io.File(str4));
            }
            while (!linkedList.isEmpty()) {
                java.io.File file = (java.io.File) linkedList.remove();
                if (file == null || !file.isDirectory() || file.listFiles() == null) {
                    java.lang.String name = file.getName();
                    if (name.endsWith(".apk") && ((name.startsWith(str) || name.startsWith("split_config")) && name.contains(replace))) {
                        arrayList.add(file.getAbsolutePath());
                    } else if (name.equals(str2)) {
                        arrayList2.add(file.getAbsolutePath());
                    }
                } else {
                    for (java.io.File file2 : file.listFiles()) {
                        linkedList.add(file2);
                    }
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(str2);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((java.lang.String) it.next()) + "!lib/" + str3 + "/" + str2);
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                arrayList3.add((java.lang.String) it6.next());
            }
            this.f71054x2014a1e9.m137692xc3110397(i17, (java.lang.String[]) arrayList3.toArray(new java.lang.String[arrayList3.size()]));
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f
    /* renamed from: setDeferredComponentChannel */
    public void mo137894x7f8cd9c7(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28654x1f81a365 c28654x1f81a365) {
        this.f71051x2c0b7d03 = c28654x1f81a365;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f
    /* renamed from: setJNI */
    public void mo137895xca026fe3(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        this.f71054x2014a1e9 = c28586x96e67e09;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f
    /* renamed from: uninstallDeferredComponent */
    public boolean mo137896xc421571c(int i17, java.lang.String str) {
        if (str == null) {
            str = this.f71056x8907f7e1.get(i17);
        }
        if (str == null) {
            io.p3284xd2ae381c.Log.e(TAG, "Deferred component name was null and could not be resolved from loading unit id.");
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        qa.b bVar = null;
        bVar.deferredUninstall(arrayList);
        throw null;
    }
}

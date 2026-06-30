package com.google.android.gms.dynamite;

/* loaded from: classes13.dex */
public final class DynamiteModule {
    public static final int LOCAL = -1;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final int REMOTE = 1;
    private static java.lang.Boolean zzb = null;
    private static java.lang.String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static java.lang.Boolean zzf;
    private static com.google.android.gms.dynamite.zzq zzk;
    private static com.google.android.gms.dynamite.zzr zzl;
    private final android.content.Context zzj;
    private static final java.lang.ThreadLocal zzg = new java.lang.ThreadLocal();
    private static final java.lang.ThreadLocal zzh = new com.google.android.gms.dynamite.zzd();
    private static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions zzi = new com.google.android.gms.dynamite.zze();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE = new com.google.android.gms.dynamite.zzf();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_LOCAL = new com.google.android.gms.dynamite.zzg();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new com.google.android.gms.dynamite.zzh();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new com.google.android.gms.dynamite.zzi();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new com.google.android.gms.dynamite.zzj();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new com.google.android.gms.dynamite.zzk();
    public static final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy zza = new com.google.android.gms.dynamite.zzl();

    /* loaded from: classes6.dex */
    public static class DynamiteLoaderClassLoader {
        public static java.lang.ClassLoader sClassLoader;
    }

    /* loaded from: classes13.dex */
    public static class LoadingException extends java.lang.Exception {
        public /* synthetic */ LoadingException(java.lang.String str, com.google.android.gms.dynamite.zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(java.lang.String str, java.lang.Throwable th6, com.google.android.gms.dynamite.zzp zzpVar) {
            super(str, th6);
        }
    }

    /* loaded from: classes13.dex */
    public interface VersionPolicy {

        /* loaded from: classes13.dex */
        public interface IVersions {
            int zza(android.content.Context context, java.lang.String str);

            int zzb(android.content.Context context, java.lang.String str, boolean z17);
        }

        /* loaded from: classes13.dex */
        public static class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context context, java.lang.String str, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions iVersions);
    }

    private DynamiteModule(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    public static int getLocalVersion(android.content.Context context, java.lang.String str) {
        try {
            java.lang.Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            java.lang.reflect.Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            java.lang.reflect.Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (com.google.android.gms.common.internal.Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            java.lang.String.valueOf(declaredField.get(null));
            return 0;
        } catch (java.lang.ClassNotFoundException unused) {
            return 0;
        } catch (java.lang.Exception e17) {
            "Failed to load module descriptor class: ".concat(java.lang.String.valueOf(e17.getMessage()));
            return 0;
        }
    }

    public static int getRemoteVersion(android.content.Context context, java.lang.String str) {
        return zza(context, str, false);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context context, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy versionPolicy, java.lang.String str) {
        com.google.android.gms.dynamite.DynamiteModule zzc2;
        java.lang.Boolean bool;
        com.google.android.gms.dynamic.IObjectWrapper zzj;
        com.google.android.gms.dynamite.DynamiteModule dynamiteModule;
        com.google.android.gms.dynamite.zzr zzrVar;
        java.lang.Boolean valueOf;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("null application Context", null);
        }
        java.lang.ThreadLocal threadLocal = zzg;
        com.google.android.gms.dynamite.zzn zznVar = (com.google.android.gms.dynamite.zzn) threadLocal.get();
        com.google.android.gms.dynamite.zzn zznVar2 = new com.google.android.gms.dynamite.zzn(null);
        threadLocal.set(zznVar2);
        java.lang.ThreadLocal threadLocal2 = zzh;
        long longValue = ((java.lang.Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule = versionPolicy.selectModule(context, str, zzi);
            int i17 = selectModule.localVersion;
            int i18 = selectModule.remoteVersion;
            int i19 = selectModule.selection;
            if (i19 != 0) {
                if (i19 == -1) {
                    if (i17 != 0) {
                        i19 = -1;
                    }
                }
                if (i19 != 1 || i18 != 0) {
                    if (i19 == -1) {
                        zzc2 = zzc(applicationContext, str);
                    } else {
                        if (i19 != 1) {
                            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("VersionPolicy returned invalid code:" + i19, null);
                        }
                        try {
                            try {
                                synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                    if (!zzf(context)) {
                                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Remote loading disabled", null);
                                    }
                                    bool = zzb;
                                }
                                if (bool == null) {
                                    throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                        zzrVar = zzl;
                                    }
                                    if (zzrVar == null) {
                                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("DynamiteLoaderV2 was not cached.", null);
                                    }
                                    com.google.android.gms.dynamite.zzn zznVar3 = (com.google.android.gms.dynamite.zzn) threadLocal.get();
                                    if (zznVar3 == null || zznVar3.zza == null) {
                                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No result cursor", null);
                                    }
                                    android.content.Context applicationContext2 = context.getApplicationContext();
                                    android.database.Cursor cursor = zznVar3.zza;
                                    com.google.android.gms.dynamic.ObjectWrapper.wrap(null);
                                    synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                        valueOf = java.lang.Boolean.valueOf(zze >= 2);
                                    }
                                    android.content.Context context2 = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(valueOf.booleanValue() ? zzrVar.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(applicationContext2), str, i18, com.google.android.gms.dynamic.ObjectWrapper.wrap(cursor)) : zzrVar.zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(applicationContext2), str, i18, com.google.android.gms.dynamic.ObjectWrapper.wrap(cursor)));
                                    if (context2 == null) {
                                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to get module context", null);
                                    }
                                    dynamiteModule = new com.google.android.gms.dynamite.DynamiteModule(context2);
                                } else {
                                    com.google.android.gms.dynamite.zzq zzg2 = zzg(context);
                                    if (zzg2 == null) {
                                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to create IDynamiteLoader.", null);
                                    }
                                    int zze2 = zzg2.zze();
                                    if (zze2 >= 3) {
                                        com.google.android.gms.dynamite.zzn zznVar4 = (com.google.android.gms.dynamite.zzn) threadLocal.get();
                                        if (zznVar4 == null) {
                                            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No cached result cursor holder", null);
                                        }
                                        zzj = zzg2.zzi(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i18, com.google.android.gms.dynamic.ObjectWrapper.wrap(zznVar4.zza));
                                    } else {
                                        zzj = zze2 == 2 ? zzg2.zzj(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i18) : zzg2.zzh(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, i18);
                                    }
                                    java.lang.Object unwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzj);
                                    if (unwrap == null) {
                                        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", null);
                                    }
                                    dynamiteModule = new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) unwrap);
                                }
                                zzc2 = dynamiteModule;
                            } catch (android.os.RemoteException e17) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", e17, null);
                            } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e18) {
                                throw e18;
                            } catch (java.lang.Throwable th6) {
                                com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(context, th6);
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", th6, null);
                            }
                        } catch (com.google.android.gms.dynamite.DynamiteModule.LoadingException e19) {
                            e19.getMessage();
                            int i27 = selectModule.localVersion;
                            if (i27 == 0 || versionPolicy.selectModule(context, str, new com.google.android.gms.dynamite.zzo(i27, 0)).selection != -1) {
                                throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Remote load failed. No local fallback found.", e19, null);
                            }
                            zzc2 = zzc(applicationContext, str);
                        }
                    }
                    if (longValue == 0) {
                        zzh.remove();
                    } else {
                        zzh.set(java.lang.Long.valueOf(longValue));
                    }
                    android.database.Cursor cursor2 = zznVar2.zza;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    zzg.set(zznVar);
                    return zzc2;
                }
            }
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No acceptable module " + str + " found. Local version is " + selectModule.localVersion + " and remote version is " + selectModule.remoteVersion + ".", null);
        } catch (java.lang.Throwable th7) {
            if (longValue == 0) {
                zzh.remove();
            } else {
                zzh.set(java.lang.Long.valueOf(longValue));
            }
            android.database.Cursor cursor3 = zznVar2.zza;
            if (cursor3 != null) {
                cursor3.close();
            }
            zzg.set(zznVar);
            throw th7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0124, code lost:
    
        if (zze(r11) != false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161 A[Catch: all -> 0x0168, TryCatch #3 {all -> 0x0168, blocks: (B:3:0x0002, B:9:0x00c2, B:64:0x00c8, B:11:0x00d2, B:38:0x012a, B:28:0x0137, B:51:0x0161, B:52:0x0164, B:47:0x015a, B:68:0x00ce, B:127:0x0167, B:5:0x0003, B:71:0x0009, B:72:0x0025, B:79:0x00bf, B:84:0x0046, B:102:0x0098, B:110:0x009b, B:121:0x00b4, B:8:0x00c1, B:124:0x00ba), top: B:2:0x0002, inners: #2, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        r8.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int zzb(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static com.google.android.gms.dynamite.DynamiteModule zzc(android.content.Context context, java.lang.String str) {
        "Selected local version of ".concat(java.lang.String.valueOf(str));
        return new com.google.android.gms.dynamite.DynamiteModule(context);
    }

    private static void zzd(java.lang.ClassLoader classLoader) {
        com.google.android.gms.dynamite.zzr zzrVar;
        com.google.android.gms.dynamite.zzp zzpVar = null;
        try {
            android.os.IBinder iBinder = (android.os.IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = queryLocalInterface instanceof com.google.android.gms.dynamite.zzr ? (com.google.android.gms.dynamite.zzr) queryLocalInterface : new com.google.android.gms.dynamite.zzr(iBinder);
            }
            zzl = zzrVar;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to instantiate dynamite loader", e17, zzpVar);
        }
    }

    private static boolean zze(android.database.Cursor cursor) {
        com.google.android.gms.dynamite.zzn zznVar = (com.google.android.gms.dynamite.zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static boolean zzf(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z17 = false;
        if (zzf == null) {
            android.content.pm.ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z17 = true;
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            zzf = valueOf;
            z17 = valueOf.booleanValue();
            if (z17 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                zzd = true;
            }
        }
        return z17;
    }

    private static com.google.android.gms.dynamite.zzq zzg(android.content.Context context) {
        com.google.android.gms.dynamite.zzq zzqVar;
        synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
            com.google.android.gms.dynamite.zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                android.os.IBinder iBinder = (android.os.IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = queryLocalInterface instanceof com.google.android.gms.dynamite.zzq ? (com.google.android.gms.dynamite.zzq) queryLocalInterface : new com.google.android.gms.dynamite.zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (java.lang.Exception e17) {
                e17.getMessage();
            }
            return null;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public android.content.Context getModuleContext() {
        return this.zzj;
    }

    public android.os.IBinder instantiate(java.lang.String str) {
        try {
            return (android.os.IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e17) {
            throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to instantiate module class: ".concat(java.lang.String.valueOf(str)), e17, null);
        }
    }
}

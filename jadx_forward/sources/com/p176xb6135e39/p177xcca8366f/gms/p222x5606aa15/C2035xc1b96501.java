package com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15;

/* renamed from: com.google.android.gms.dynamite.DynamiteModule */
/* loaded from: classes13.dex */
public final class C2035xc1b96501 {

    /* renamed from: LOCAL */
    public static final int f6013x453e74b = -1;

    /* renamed from: NONE */
    public static final int f6014x24a738 = 0;

    /* renamed from: NO_SELECTION */
    public static final int f6015x31c5086e = 0;

    /* renamed from: REMOTE */
    public static final int f6022x8fddec46 = 1;
    private static java.lang.Boolean zzb = null;
    private static java.lang.String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static java.lang.Boolean zzf;
    private static com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzq zzk;
    private static com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzr zzl;
    private final android.content.Context zzj;
    private static final java.lang.ThreadLocal zzg = new java.lang.ThreadLocal();
    private static final java.lang.ThreadLocal zzh = new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzd();
    private static final com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy.IVersions zzi = new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zze();

    /* renamed from: PREFER_REMOTE */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy f6020x5b725155 = new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzf();

    /* renamed from: PREFER_LOCAL */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy f6019x1327245c = new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzg();

    /* renamed from: PREFER_REMOTE_VERSION_NO_FORCE_STAGING */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy f6021x5f0054fa = new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzh();

    /* renamed from: PREFER_HIGHEST_OR_LOCAL_VERSION */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy f6016x7608ac12 = new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzi();

    /* renamed from: PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy f6017xdb783536 = new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzj();

    /* renamed from: PREFER_HIGHEST_OR_REMOTE_VERSION */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy f6018x5de7af31 = new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzk();
    public static final com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy zza = new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzl();

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader */
    /* loaded from: classes6.dex */
    public static class DynamiteLoaderClassLoader {

        /* renamed from: sClassLoader */
        public static java.lang.ClassLoader f6023x9f1fbd38;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$LoadingException */
    /* loaded from: classes13.dex */
    public static class LoadingException extends java.lang.Exception {
        public /* synthetic */ LoadingException(java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(java.lang.String str, java.lang.Throwable th6, com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzp zzpVar) {
            super(str, th6);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$VersionPolicy */
    /* loaded from: classes13.dex */
    public interface VersionPolicy {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions */
        /* loaded from: classes13.dex */
        public interface IVersions {
            int zza(android.content.Context context, java.lang.String str);

            int zzb(android.content.Context context, java.lang.String str, boolean z17);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult */
        /* loaded from: classes13.dex */
        public static class SelectionResult {

            /* renamed from: localVersion */
            public int f6024xbf9cb6ed = 0;

            /* renamed from: remoteVersion */
            public int f6025x33ae01b2 = 0;

            /* renamed from: selection */
            public int f6026x99b8718c = 0;
        }

        /* renamed from: selectModule */
        com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy.SelectionResult mo18694x6f1b1a88(android.content.Context context, java.lang.String str, com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy.IVersions iVersions);
    }

    private C2035xc1b96501(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context);
        this.zzj = context;
    }

    /* renamed from: getLocalVersion */
    public static int m18689x208f4963(android.content.Context context, java.lang.String str) {
        try {
            java.lang.Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            java.lang.reflect.Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            java.lang.reflect.Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(declaredField.get(null), str)) {
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

    /* renamed from: getRemoteVersion */
    public static int m18690xf10dbdfc(android.content.Context context, java.lang.String str) {
        return zza(context, str, false);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: load */
    public static com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501 m18691x32c4e6(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy versionPolicy, java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501 zzc2;
        java.lang.Boolean bool;
        com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2029x272bd28b zzj;
        com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501 c2035xc1b96501;
        com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzr zzrVar;
        java.lang.Boolean valueOf;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("null application Context", null);
        }
        java.lang.ThreadLocal threadLocal = zzg;
        com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzn zznVar = (com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzn) threadLocal.get();
        com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzn zznVar2 = new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzn(null);
        threadLocal.set(zznVar2);
        java.lang.ThreadLocal threadLocal2 = zzh;
        long longValue = ((java.lang.Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.VersionPolicy.SelectionResult mo18694x6f1b1a88 = versionPolicy.mo18694x6f1b1a88(context, str, zzi);
            int i17 = mo18694x6f1b1a88.f6024xbf9cb6ed;
            int i18 = mo18694x6f1b1a88.f6025x33ae01b2;
            int i19 = mo18694x6f1b1a88.f6026x99b8718c;
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
                            throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("VersionPolicy returned invalid code:" + i19, null);
                        }
                        try {
                            try {
                                synchronized (com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.class) {
                                    if (!zzf(context)) {
                                        throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("Remote loading disabled", null);
                                    }
                                    bool = zzb;
                                }
                                if (bool == null) {
                                    throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    synchronized (com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.class) {
                                        zzrVar = zzl;
                                    }
                                    if (zzrVar == null) {
                                        throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("DynamiteLoaderV2 was not cached.", null);
                                    }
                                    com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzn zznVar3 = (com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzn) threadLocal.get();
                                    if (zznVar3 == null || zznVar3.zza == null) {
                                        throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("No result cursor", null);
                                    }
                                    android.content.Context applicationContext2 = context.getApplicationContext();
                                    android.database.Cursor cursor = zznVar3.zza;
                                    com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(null);
                                    synchronized (com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.class) {
                                        valueOf = java.lang.Boolean.valueOf(zze >= 2);
                                    }
                                    android.content.Context context2 = (android.content.Context) com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18683xcdecea63(valueOf.booleanValue() ? zzrVar.zzf(com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(applicationContext2), str, i18, com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(cursor)) : zzrVar.zze(com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(applicationContext2), str, i18, com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(cursor)));
                                    if (context2 == null) {
                                        throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("Failed to get module context", null);
                                    }
                                    c2035xc1b96501 = new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501(context2);
                                } else {
                                    com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzq zzg2 = zzg(context);
                                    if (zzg2 == null) {
                                        throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("Failed to create IDynamiteLoader.", null);
                                    }
                                    int zze2 = zzg2.zze();
                                    if (zze2 >= 3) {
                                        com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzn zznVar4 = (com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzn) threadLocal.get();
                                        if (zznVar4 == null) {
                                            throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("No cached result cursor holder", null);
                                        }
                                        zzj = zzg2.zzi(com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(context), str, i18, com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(zznVar4.zza));
                                    } else {
                                        zzj = zze2 == 2 ? zzg2.zzj(com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(context), str, i18) : zzg2.zzh(com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18684x37d04a(context), str, i18);
                                    }
                                    java.lang.Object m18683xcdecea63 = com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434.m18683xcdecea63(zzj);
                                    if (m18683xcdecea63 == null) {
                                        throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("Failed to load remote module.", null);
                                    }
                                    c2035xc1b96501 = new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501((android.content.Context) m18683xcdecea63);
                                }
                                zzc2 = c2035xc1b96501;
                            } catch (android.os.RemoteException e17) {
                                throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("Failed to load remote module.", e17, null);
                            } catch (com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException e18) {
                                throw e18;
                            } catch (java.lang.Throwable th6) {
                                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1993xcbccc96a.m18551x7bd75faf(context, th6);
                                throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("Failed to load remote module.", th6, null);
                            }
                        } catch (com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException e19) {
                            e19.getMessage();
                            int i27 = mo18694x6f1b1a88.f6024xbf9cb6ed;
                            if (i27 == 0 || versionPolicy.mo18694x6f1b1a88(context, str, new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzo(i27, 0)).f6026x99b8718c != -1) {
                                throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("Remote load failed. No local fallback found.", e19, null);
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
            throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("No acceptable module " + str + " found. Local version is " + mo18694x6f1b1a88.f6024xbf9cb6ed + " and remote version is " + mo18694x6f1b1a88.f6025x33ae01b2 + ".", null);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.zza(android.content.Context, java.lang.String, boolean):int");
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501 zzc(android.content.Context context, java.lang.String str) {
        "Selected local version of ".concat(java.lang.String.valueOf(str));
        return new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501(context);
    }

    private static void zzd(java.lang.ClassLoader classLoader) {
        com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzr zzrVar;
        com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzp zzpVar = null;
        try {
            android.os.IBinder iBinder = (android.os.IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzr ? (com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzr) queryLocalInterface : new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzr(iBinder);
            }
            zzl = zzrVar;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("Failed to instantiate dynamite loader", e17, zzpVar);
        }
    }

    private static boolean zze(android.database.Cursor cursor) {
        com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzn zznVar = (com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzn) zzg.get();
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
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1706xe937257a.m17641x9cf0d20b().mo17631x402556f4(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
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

    private static com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzq zzg(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzq zzqVar;
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.class) {
            com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                android.os.IBinder iBinder = (android.os.IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = queryLocalInterface instanceof com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzq ? (com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzq) queryLocalInterface : new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.zzq(iBinder);
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
    /* renamed from: getModuleContext */
    public android.content.Context m18692x94bc11ed() {
        return this.zzj;
    }

    /* renamed from: instantiate */
    public android.os.IBinder m18693x83a782ea(java.lang.String str) {
        try {
            return (android.os.IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e17) {
            throw new com.p176xb6135e39.p177xcca8366f.gms.p222x5606aa15.C2035xc1b96501.LoadingException("Failed to instantiate module class: ".concat(java.lang.String.valueOf(str)), e17, null);
        }
    }
}

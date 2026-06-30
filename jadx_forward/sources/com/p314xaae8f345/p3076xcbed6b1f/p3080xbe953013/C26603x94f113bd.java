package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013;

/* renamed from: com.tencent.tinker.loader.TinkerDexOptimizer */
/* loaded from: classes13.dex */
public final class C26603x94f113bd {

    /* renamed from: INTERPRET_LOCK_FILE_NAME */
    private static final java.lang.String f55449xd3f556ec = "interpret.lock";

    /* renamed from: SHELL_COMMAND_TRANSACTION */
    private static final int f55450xce2e12fb = 1598246212;
    private static final java.lang.String TAG = "Tinker.ParallelDex";

    /* renamed from: sEmptyResultReceiver */
    private static final android.os.ResultReceiver f55451x2d8f4466;

    /* renamed from: sHandler */
    private static final android.os.Handler f55452x36ab1757;

    /* renamed from: sSynchronizedPMCache */
    private static final android.content.pm.PackageManager[] f55455xf74edc7e;

    /* renamed from: sPerformDexOptSecondaryTransactionCode */
    private static final int[] f55454x28103c21 = {-1};

    /* renamed from: sPMSBinderProxy */
    private static final android.os.IBinder[] f55453xb34eb641 = {null};

    /* renamed from: com.tencent.tinker.loader.TinkerDexOptimizer$OptimizeWorker */
    /* loaded from: classes13.dex */
    public static class OptimizeWorker {

        /* renamed from: patchClassLoaderStrongRef */
        private static java.lang.ClassLoader f55457x7e135379;

        /* renamed from: callback */
        private final com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback f55458xf5bc2045;

        /* renamed from: context */
        private final android.content.Context f55459x38b735af;

        /* renamed from: dexFile */
        private final java.io.File f55460x5d050a33;

        /* renamed from: optimizedDir */
        private final java.io.File f55461xbea91de6;

        /* renamed from: targetISA */
        private final java.lang.String f55462xcf62f526;

        /* renamed from: useDLC */
        private final boolean f55463xce2a81d4;

        /* renamed from: useEmergencyMode */
        private final boolean f55464xb6a9208d;

        /* renamed from: useInterpretMode */
        private final boolean f55465x766c7609;

        public OptimizeWorker(android.content.Context context, java.io.File file, java.io.File file2, boolean z17, boolean z18, java.lang.String str, boolean z19, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback resultCallback) {
            this.f55459x38b735af = context;
            this.f55460x5d050a33 = file;
            this.f55461xbea91de6 = file2;
            this.f55465x766c7609 = z17;
            this.f55463xce2a81d4 = z18;
            this.f55458xf5bc2045 = resultCallback;
            this.f55462xcf62f526 = str;
            this.f55464xb6a9208d = z19;
        }

        public boolean run() {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback resultCallback;
            try {
                if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(this.f55460x5d050a33) && (resultCallback = this.f55458xf5bc2045) != null) {
                    resultCallback.mo104489x428b6afc(this.f55460x5d050a33, this.f55461xbea91de6, new java.io.IOException("dex file " + this.f55460x5d050a33.getAbsolutePath() + " is not exist!"));
                    return false;
                }
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback resultCallback2 = this.f55458xf5bc2045;
                if (resultCallback2 != null) {
                    resultCallback2.mo104490xb05099c3(this.f55460x5d050a33, this.f55461xbea91de6);
                }
                final java.lang.String m104689x54ec473d = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104689x54ec473d(this.f55460x5d050a33, this.f55461xbea91de6);
                if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104739x6e3ebd34()) {
                    if (this.f55465x766c7609) {
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.m104501x3e67161a(this.f55460x5d050a33.getAbsolutePath(), m104689x54ec473d, this.f55462xcf62f526);
                    } else if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.app.AbstractApplicationC26612x4766a891.m104536x9cf0d20b().m104541x48f0f041() && com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104753x210a0aea(21, 25, true) && com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104737x4a4e0f09()) {
                        try {
                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.TAG, "dexopt with interpret mode on 32bit supported system was enabled.", new java.lang.Object[0]);
                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.m104501x3e67161a(this.f55460x5d050a33.getAbsolutePath(), m104689x54ec473d, this.f55462xcf62f526);
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.TAG, th6, "exception occurred on dexopt triggering.", new java.lang.Object[0]);
                        }
                        if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(new java.io.File(m104689x54ec473d))) {
                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.TAG, "interpret dexopt failure, compensate with system method.", new java.lang.Object[0]);
                            dalvik.system.DexFile.loadDex(this.f55460x5d050a33.getAbsolutePath(), m104689x54ec473d, 0);
                        }
                    } else if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104742x33bbb0c9(26, true)) {
                        dalvik.system.DexFile.loadDex(this.f55460x5d050a33.getAbsolutePath(), m104689x54ec473d, 0);
                    } else if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104742x33bbb0c9(29, true)) {
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.m104497xf2a5943f(m104689x54ec473d);
                        f55457x7e135379 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26598xad6d125f.m104458x69bf730f(this.f55459x38b735af, this.f55461xbea91de6, this.f55463xce2a81d4, this.f55460x5d050a33.getAbsolutePath());
                        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.tinker.loader.TinkerDexOptimizer.OptimizeWorker.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.m104508x9902ed5b(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.OptimizeWorker.this.f55459x38b735af, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.OptimizeWorker.this.f55460x5d050a33.getAbsolutePath(), m104689x54ec473d);
                                    if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.OptimizeWorker.this.f55464xb6a9208d) {
                                        return;
                                    }
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    java.lang.String str = m104689x54ec473d;
                                    sb6.append(str.substring(0, str.lastIndexOf(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55698xb5cf7628)));
                                    sb6.append(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55753xc810596f);
                                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.m104510xa881ea14(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.OptimizeWorker.this.f55459x38b735af, sb6.toString(), new java.lang.Long[0]);
                                } catch (java.lang.Throwable th7) {
                                    try {
                                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.TAG, th7, "Fail to call triggerPMDexOptAsyncOnDemand.", new java.lang.Object[0]);
                                        if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.OptimizeWorker.this.f55464xb6a9208d) {
                                            return;
                                        }
                                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                        java.lang.String str2 = m104689x54ec473d;
                                        sb7.append(str2.substring(0, str2.lastIndexOf(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55698xb5cf7628)));
                                        sb7.append(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55753xc810596f);
                                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.m104510xa881ea14(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.OptimizeWorker.this.f55459x38b735af, sb7.toString(), new java.lang.Long[0]);
                                    } catch (java.lang.Throwable th8) {
                                        if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.OptimizeWorker.this.f55464xb6a9208d) {
                                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                                            java.lang.String str3 = m104689x54ec473d;
                                            sb8.append(str3.substring(0, str3.lastIndexOf(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55698xb5cf7628)));
                                            sb8.append(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55753xc810596f);
                                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.m104510xa881ea14(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.OptimizeWorker.this.f55459x38b735af, sb8.toString(), new java.lang.Long[0]);
                                        }
                                        throw th8;
                                    }
                                }
                            }
                        };
                        if (this.f55464xb6a9208d) {
                            new java.lang.Thread(runnable, "TinkerDex2oatTrigger").start();
                        } else {
                            runnable.run();
                        }
                    } else {
                        f55457x7e135379 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26598xad6d125f.m104458x69bf730f(this.f55459x38b735af, this.f55461xbea91de6, this.f55463xce2a81d4, this.f55460x5d050a33.getAbsolutePath());
                    }
                }
                java.io.File file = new java.io.File(m104689x54ec473d);
                if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file) && !com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104691x54677ec4(file)) {
                    java.io.FileNotFoundException fileNotFoundException = new java.io.FileNotFoundException("Odex file: " + file.getAbsolutePath() + " does not exist.");
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback resultCallback3 = this.f55458xf5bc2045;
                    if (resultCallback3 != null) {
                        resultCallback3.mo104489x428b6afc(this.f55460x5d050a33, this.f55461xbea91de6, fileNotFoundException);
                    }
                    return false;
                }
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback resultCallback4 = this.f55458xf5bc2045;
                if (resultCallback4 != null) {
                    resultCallback4.mo104491xe05b4124(this.f55460x5d050a33, this.f55461xbea91de6, file);
                }
                return true;
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.TAG, "Failed to optimize dex: " + this.f55460x5d050a33.getAbsolutePath(), th7);
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback resultCallback5 = this.f55458xf5bc2045;
                if (resultCallback5 != null) {
                    resultCallback5.mo104489x428b6afc(this.f55460x5d050a33, this.f55461xbea91de6, th7);
                }
                return false;
            }
        }
    }

    /* renamed from: com.tencent.tinker.loader.TinkerDexOptimizer$ResultCallback */
    /* loaded from: classes13.dex */
    public interface ResultCallback {
        /* renamed from: onFailed */
        void mo104489x428b6afc(java.io.File file, java.io.File file2, java.lang.Throwable th6);

        /* renamed from: onStart */
        void mo104490xb05099c3(java.io.File file, java.io.File file2);

        /* renamed from: onSuccess */
        void mo104491xe05b4124(java.io.File file, java.io.File file2, java.io.File file3);
    }

    /* renamed from: com.tencent.tinker.loader.TinkerDexOptimizer$StreamConsumer */
    /* loaded from: classes13.dex */
    public static class StreamConsumer {

        /* renamed from: STREAM_CONSUMER */
        static final java.util.concurrent.Executor f55468x121f51d5 = java.util.concurrent.Executors.newSingleThreadExecutor();

        private StreamConsumer() {
        }

        /* renamed from: consumeInputStream */
        public static void m104515x6ab9aa4e(final java.io.InputStream inputStream) {
            f55468x121f51d5.execute(new java.lang.Runnable() { // from class: com.tencent.tinker.loader.TinkerDexOptimizer.StreamConsumer.1
                @Override // java.lang.Runnable
                public void run() {
                    if (inputStream == null) {
                        return;
                    }
                    do {
                        try {
                        } catch (java.io.IOException unused) {
                        } catch (java.lang.Throwable th6) {
                            try {
                                inputStream.close();
                            } catch (java.lang.Exception unused2) {
                            }
                            throw th6;
                        }
                    } while (inputStream.read(new byte[256]) > 0);
                    try {
                        inputStream.close();
                    } catch (java.lang.Exception unused3) {
                    }
                }
            });
        }
    }

    static {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        f55452x36ab1757 = handler;
        f55451x2d8f4466 = new android.os.ResultReceiver(handler);
        f55455xf74edc7e = new android.content.pm.PackageManager[]{null};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createFakeODexPathStructureOnDemand */
    public static void m104497xf2a5943f(java.lang.String str) {
        if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104742x33bbb0c9(29, true)) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "Creating fake odex path structure.", new java.lang.Object[0]);
            java.io.File file = new java.io.File(str);
            if (file.exists()) {
                return;
            }
            java.io.File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            try {
                file.createNewFile();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    /* renamed from: executePMSShellCommand */
    private static void m104498xf95d9bfc(android.content.Context context, java.lang.String[] strArr) {
        android.os.Parcel parcel;
        android.os.IBinder m104499x800efbe4 = m104499x800efbe4(context);
        long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
        android.os.Parcel parcel2 = null;
        try {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "[+] Execute shell cmd, args: %s", java.util.Arrays.toString(strArr));
            android.os.Parcel obtain = android.os.Parcel.obtain();
            try {
                parcel = android.os.Parcel.obtain();
                try {
                    obtain.writeFileDescriptor(java.io.FileDescriptor.in);
                    obtain.writeFileDescriptor(java.io.FileDescriptor.out);
                    obtain.writeFileDescriptor(java.io.FileDescriptor.err);
                    obtain.writeStringArray(strArr);
                    obtain.writeStrongBinder(null);
                    f55451x2d8f4466.writeToParcel(obtain, 0);
                    m104499x800efbe4.transact(f55450xce2e12fb, obtain, parcel, 0);
                    parcel.readException();
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "[+] Execute shell cmd done.", new java.lang.Object[0]);
                    parcel.recycle();
                    obtain.recycle();
                    android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    parcel2 = obtain;
                    try {
                        throw new java.lang.IllegalStateException("Failure on executing shell cmd.", th);
                    } catch (java.lang.Throwable th7) {
                        if (parcel != null) {
                            parcel.recycle();
                        }
                        if (parcel2 != null) {
                            parcel2.recycle();
                        }
                        android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th7;
                    }
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                parcel = null;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            parcel = null;
        }
    }

    /* renamed from: getPMSBinderProxy */
    private static android.os.IBinder m104499x800efbe4(android.content.Context context) {
        android.os.IBinder[] iBinderArr = f55453xb34eb641;
        synchronized (iBinderArr) {
            android.os.IBinder iBinder = iBinderArr[0];
            if (iBinder != null && iBinder.isBinderAlive()) {
                return iBinder;
            }
            try {
                android.os.IBinder iBinder2 = (android.os.IBinder) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104704xfb2fc3fa(java.lang.Class.forName("android.os.ServiceManager"), "getService", (java.lang.Class<?>[]) new java.lang.Class[]{java.lang.String.class}).invoke(null, "package");
                iBinderArr[0] = iBinder2;
                return iBinder2;
            } catch (java.lang.Throwable th6) {
                if (th6 instanceof java.lang.reflect.InvocationTargetException) {
                    throw new java.lang.IllegalStateException(th6.getTargetException());
                }
                throw new java.lang.IllegalStateException(th6);
            }
        }
    }

    /* renamed from: getSynchronizedPackageManager */
    private static final android.content.pm.PackageManager m104500xd4ce22b1(android.content.Context context) {
        android.content.pm.PackageManager[] packageManagerArr = f55455xf74edc7e;
        synchronized (packageManagerArr) {
            try {
                try {
                    if (packageManagerArr[0] != null) {
                        android.os.IBinder[] iBinderArr = f55453xb34eb641;
                        synchronized (iBinderArr) {
                            android.os.IBinder iBinder = iBinderArr[0];
                            if (iBinder != null && iBinder.isBinderAlive()) {
                                return packageManagerArr[0];
                            }
                        }
                    }
                    final android.os.IBinder m104499x800efbe4 = m104499x800efbe4(context);
                    java.lang.Object invoke = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104704xfb2fc3fa(java.lang.Class.forName("android.content.pm.IPackageManager$Stub"), "asInterface", (java.lang.Class<?>[]) new java.lang.Class[]{android.os.IBinder.class}).invoke(null, (android.os.IBinder) java.lang.reflect.Proxy.newProxyInstance(context.getClassLoader(), m104499x800efbe4.getClass().getInterfaces(), new java.lang.reflect.InvocationHandler() { // from class: com.tencent.tinker.loader.TinkerDexOptimizer.2
                        @Override // java.lang.reflect.InvocationHandler
                        public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                            if ("transact".equals(method.getName())) {
                                objArr[3] = 0;
                            }
                            return method.invoke(m104499x800efbe4, objArr);
                        }
                    }));
                    java.lang.Class<?> cls = java.lang.Class.forName("android.app.ApplicationPackageManager");
                    if (context instanceof android.content.ContextWrapper) {
                        context = ((android.content.ContextWrapper) context).getBaseContext();
                    }
                    android.content.pm.PackageManager packageManager = (android.content.pm.PackageManager) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104700xf3d1ec81(cls, (java.lang.Class<?>[]) new java.lang.Class[]{context.getClass(), java.lang.Class.forName("android.content.pm.IPackageManager")}).newInstance(context, invoke);
                    packageManagerArr[0] = packageManager;
                    return packageManager;
                } catch (java.lang.Throwable th6) {
                    if (th6 instanceof java.lang.IllegalStateException) {
                        throw th6;
                    }
                    throw new java.lang.IllegalStateException(th6);
                }
            } catch (java.lang.reflect.InvocationTargetException e17) {
                throw new java.lang.IllegalStateException(e17.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: interpretDex2Oat */
    public static void m104501x3e67161a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26634x2c5b4cf4 c26634x2c5b4cf4;
        java.io.File file = new java.io.File(str2);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            c26634x2c5b4cf4 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26634x2c5b4cf4.m104640x4fff4e3d(new java.io.File(file.getParentFile(), f55449xd3f556ec));
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add("dex2oat");
                int i17 = android.os.Build.VERSION.SDK_INT;
                arrayList.add("--runtime-arg");
                arrayList.add("-classpath");
                arrayList.add("--runtime-arg");
                arrayList.add("&");
                arrayList.add("--dex-file=" + str);
                arrayList.add("--oat-file=" + str2);
                arrayList.add("--instruction-set=" + str3);
                if (i17 > 25) {
                    arrayList.add("--compiler-filter=quicken");
                } else {
                    arrayList.add("--compiler-filter=interpret-only");
                }
                java.lang.ProcessBuilder processBuilder = new java.lang.ProcessBuilder(arrayList);
                processBuilder.redirectErrorStream(true);
                java.lang.Process start = processBuilder.start();
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.StreamConsumer.m104515x6ab9aa4e(start.getInputStream());
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.StreamConsumer.m104515x6ab9aa4e(start.getErrorStream());
                try {
                    int waitFor = start.waitFor();
                    if (waitFor != 0) {
                        throw new java.io.IOException("dex2oat works unsuccessfully, exit code: " + waitFor);
                    }
                    if (c26634x2c5b4cf4 != null) {
                        try {
                            c26634x2c5b4cf4.close();
                        } catch (java.io.IOException e17) {
                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "release interpret Lock error", e17);
                        }
                    }
                } catch (java.lang.InterruptedException e18) {
                    throw new java.io.IOException("dex2oat is interrupted, msg: " + e18.getMessage(), e18);
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (c26634x2c5b4cf4 != null) {
                    try {
                        c26634x2c5b4cf4.close();
                    } catch (java.io.IOException e19) {
                        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "release interpret Lock error", e19);
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            c26634x2c5b4cf4 = null;
        }
    }

    /* renamed from: optimizeAll */
    public static boolean m104502x79c2e584(android.content.Context context, java.util.Collection<java.io.File> collection, java.io.File file, boolean z17, boolean z18, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback resultCallback) {
        return m104503x79c2e584(context, collection, file, false, z17, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104728x98963917(), z18, resultCallback);
    }

    /* renamed from: performBgDexOptJob */
    private static void m104504xe300f21b(android.content.Context context) {
        m104498xf95d9bfc(context, new java.lang.String[]{"bg-dexopt-job", context.getPackageName()});
    }

    /* renamed from: performDexOptSecondary */
    private static void m104505x60e22c17(android.content.Context context) {
        java.lang.String[] strArr = new java.lang.String[6];
        strArr[0] = "compile";
        strArr[1] = "-f";
        strArr[2] = "--secondary-dex";
        strArr[3] = "-m";
        strArr[4] = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104742x33bbb0c9(31, true) ? "verify" : "speed-profile";
        strArr[5] = context.getPackageName();
        m104498xf95d9bfc(context, strArr);
    }

    /* renamed from: performDexOptSecondaryByTransactionCode */
    private static void m104506x74e6cd3d(android.content.Context context) {
        android.os.Parcel parcel;
        boolean z17;
        android.os.Parcel parcel2;
        int[] iArr = f55454x28103c21;
        synchronized (iArr) {
            parcel = null;
            z17 = true;
            if (iArr[0] == -1) {
                try {
                    java.lang.reflect.Method m104704xfb2fc3fa = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104704xfb2fc3fa((java.lang.Class<?>) java.lang.Class.class, "getDeclaredField", (java.lang.Class<?>[]) new java.lang.Class[]{java.lang.String.class});
                    m104704xfb2fc3fa.setAccessible(true);
                    java.lang.reflect.Field field = (java.lang.reflect.Field) m104704xfb2fc3fa.invoke(java.lang.Class.forName("android.content.pm.IPackageManager$Stub"), "TRANSACTION_performDexOptSecondary");
                    field.setAccessible(true);
                    iArr[0] = ((java.lang.Integer) field.get(null)).intValue();
                } catch (java.lang.Throwable th6) {
                    throw new java.lang.IllegalStateException("Cannot query transaction code of performDexOptSecondary.", th6);
                }
            }
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "[+] performDexOptSecondaryByTransactionCode, code: %s", java.lang.Integer.valueOf(iArr[0]));
        android.os.IBinder m104499x800efbe4 = m104499x800efbe4(context);
        try {
            parcel2 = android.os.Parcel.obtain();
            try {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    parcel2.writeInterfaceToken(m104499x800efbe4.getInterfaceDescriptor());
                    parcel2.writeString(context.getPackageName());
                    parcel2.writeString(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104742x33bbb0c9(31, true) ? "verify" : "speed-profile");
                    parcel2.writeInt(1);
                    if (!m104499x800efbe4.transact(iArr[0], parcel2, obtain, 0)) {
                        throw new java.lang.IllegalStateException("Binder transaction failure.");
                    }
                    try {
                        obtain.readException();
                        if (obtain.readInt() == 0) {
                            z17 = false;
                        }
                        if (!z17) {
                            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "[!] System API return false.", new java.lang.Object[0]);
                        }
                        obtain.recycle();
                        parcel2.recycle();
                        return;
                    } finally {
                        java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(th);
                    }
                } catch (android.os.RemoteException th7) {
                    throw new java.lang.IllegalStateException(th7);
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
            th = th8;
        } catch (java.lang.Throwable th9) {
            th = th9;
            parcel2 = null;
        }
        if (0 != 0) {
            parcel.recycle();
        }
        if (parcel2 != null) {
            parcel2.recycle();
        }
        throw th;
    }

    /* renamed from: registerDexModule */
    private static void m104507x915b2200(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageManager m104500xd4ce22b1 = m104500xd4ce22b1(context);
        try {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104705xfb2fc3fa(m104500xd4ce22b1, "registerDexModule", (java.lang.Class<?>[]) new java.lang.Class[]{java.lang.String.class, java.lang.Class.forName("android.content.pm.PackageManager$DexModuleRegisterCallback")}).invoke(m104500xd4ce22b1, str, null);
        } catch (java.lang.reflect.InvocationTargetException e17) {
            throw new java.lang.IllegalStateException(e17.getTargetException());
        } catch (java.lang.Throwable th6) {
            if (!(th6 instanceof java.lang.IllegalStateException)) {
                throw new java.lang.IllegalStateException(th6);
            }
            throw th6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: triggerPMDexOptOnDemand */
    public static void m104508x9902ed5b(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104742x33bbb0c9(29, true)) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "[+] Not API 29, 30 and newer device, skip triggering dexopt.", new java.lang.Object[0]);
            return;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "[+] Hit target device, do dexopt logic now.", new java.lang.Object[0]);
        java.io.File file = new java.io.File(str2);
        if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file)) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "[+] Oat file %s should be valid, skip triggering dexopt.", str2);
            return;
        }
        java.io.File file2 = new java.io.File(str);
        for (int i17 = 0; i17 < 10; i17++) {
            if (m104509xd17158d8(context, file2, file, true)) {
                return;
            }
        }
        if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file)) {
            return;
        }
        java.lang.String str3 = android.os.Build.MANUFACTURER;
        if (!"huawei".equalsIgnoreCase(str3) && !"honor".equalsIgnoreCase(str3)) {
            throw new java.lang.IllegalStateException("No odex file was generated after calling performDexOptSecondary");
        }
        for (int i18 = 0; i18 < 5; i18++) {
            try {
                m104507x915b2200(context, str);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35(TAG, th6, "[-] Error.", new java.lang.Object[0]);
            }
            if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file)) {
                break;
            }
            android.os.SystemClock.sleep(3000L);
        }
        if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file)) {
            throw new java.lang.IllegalStateException("No odex file was generated after calling registerDexModule");
        }
    }

    /* renamed from: triggerSecondaryDexOpt */
    private static boolean m104509xd17158d8(android.content.Context context, java.io.File file, java.io.File file2, boolean z17) {
        try {
            m104505x60e22c17(context);
            if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file2)) {
                return true;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35(TAG, th6, "[-] Error.", new java.lang.Object[0]);
        }
        try {
            m104504xe300f21b(context);
            if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file2)) {
                return true;
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35(TAG, th7, "[-] Error.", new java.lang.Object[0]);
        }
        try {
            m104506x74e6cd3d(context);
            if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file2)) {
                return true;
            }
        } catch (java.lang.Throwable th8) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35(TAG, th8, "[-] Error.", new java.lang.Object[0]);
        }
        return z17 ? m104510xa881ea14(context, file2.getAbsolutePath(), 3000L) : com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: waitUntilFileGeneratedOrTimeout */
    public static boolean m104510xa881ea14(android.content.Context context, java.lang.String str, java.lang.Long... lArr) {
        java.io.File file = new java.io.File(str);
        if (lArr == null || lArr.length <= 0) {
            lArr = new java.lang.Long[]{1000L, 2000L, 4000L, 8000L, 16000L, 32000L};
        }
        int i17 = 0;
        while (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file) && i17 < lArr.length) {
            int i18 = i17 + 1;
            android.os.SystemClock.sleep(lArr[i17].longValue());
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w(TAG, "[!] File %s does not exist after waiting %s time(s), wait again.", str, java.lang.Integer.valueOf(i18));
            i17 = i18;
        }
        if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104686xc32e09cb(file)) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i(TAG, "[+] File %s was found.", str);
            return true;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e(TAG, "[-] File %s does not exist after waiting for %s times.", str, java.lang.Integer.valueOf(lArr.length));
        return false;
    }

    /* renamed from: optimizeAll */
    public static boolean m104503x79c2e584(android.content.Context context, java.util.Collection<java.io.File> collection, java.io.File file, boolean z17, boolean z18, java.lang.String str, boolean z19, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.ResultCallback resultCallback) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        java.util.Collections.sort(arrayList, new java.util.Comparator<java.io.File>() { // from class: com.tencent.tinker.loader.TinkerDexOptimizer.1
            @Override // java.util.Comparator
            public int compare(java.io.File file2, java.io.File file3) {
                long length = file2.length();
                long length2 = file3.length();
                if (length < length2) {
                    return 1;
                }
                return length == length2 ? 0 : -1;
            }
        });
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.C26603x94f113bd.OptimizeWorker(context, (java.io.File) it.next(), file, z17, z18, str, z19, resultCallback).run()) {
                return false;
            }
        }
        return true;
    }
}

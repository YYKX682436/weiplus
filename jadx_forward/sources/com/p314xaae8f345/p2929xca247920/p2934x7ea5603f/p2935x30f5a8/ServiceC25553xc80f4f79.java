package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* renamed from: com.tencent.shadow.dynamic.host.PluginProcessService */
/* loaded from: classes13.dex */
public class ServiceC25553xc80f4f79 extends com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.AbstractServiceC25529x43ace7ea implements android.os.IBinder.DeathRecipient {

    /* renamed from: sSelf */
    private static com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.ServiceC25553xc80f4f79 f46724x67bd25f;

    /* renamed from: sSystemServiceManager */
    private static com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25543x7ea75130 f46725x8fbf985a;

    /* renamed from: _hellAccFlag_ */
    private byte f46726x7f11beae;

    /* renamed from: mPluginLoader */
    private com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25549x41da3086 f46730xf1253233;

    /* renamed from: mUuidManager */
    private com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25557xe88c352 f46733x552c2cc5;

    /* renamed from: logger */
    private static final com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 f46720xbe97f590 = com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25509x39e6a13a.m94647x23af1886("Shadow.PluginProcessService");

    /* renamed from: ppsIdLock */
    private static final java.lang.Object f46721x9617fd39 = new java.lang.Object();

    /* renamed from: sPpsId */
    private static java.lang.String f46723xc8d94a3b = "";

    /* renamed from: sActivityHolder */
    static final com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.AbstractServiceC25529x43ace7ea.ActivityHolder f46722x7fca6cee = new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.AbstractServiceC25529x43ace7ea.ActivityHolder();

    /* renamed from: mPpsControllerBinder */
    private final com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.BinderC25554x1edf1dd f46731xda5bff4c = new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.BinderC25554x1edf1dd(this);

    /* renamed from: mMainHandler */
    private android.os.Handler f46729x9e97c8a4 = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: mKillSelfTask */
    private java.lang.Runnable f46727xc7646d7c = new java.lang.Runnable() { // from class: com.tencent.shadow.dynamic.host.PluginProcessService.1

        /* renamed from: _hellAccFlag_ */
        private byte f46734x7f11beae;

        @Override // java.lang.Runnable
        public void run() {
            com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.ServiceC25553xc80f4f79.f46720xbe97f590.mo46946x5c4d208("kill-self task will run.");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/shadow/dynamic/host/PluginProcessService$1", "run", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
            java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/shadow/dynamic/host/PluginProcessService$1", "run", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        }
    };

    /* renamed from: mRuntimeLoaded */
    private boolean f46732x32e4b290 = false;

    /* renamed from: mLoaderUuid */
    private java.lang.String f46728xede34ebb = "";

    /* renamed from: checkApkFileExists */
    private static void m95605xe29fe40c(java.lang.String str, com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 c25507x83693462) {
        java.lang.String str2;
        if (c25507x83693462 == null || ((str2 = c25507x83693462.f46642x1b64b1fd) == null && c25507x83693462.f46641x58b6bfa == null)) {
            throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(3003, "uuid==" + str + "的 apkFile 没有找到。");
        }
        if (str2 != null) {
            java.io.File file = new java.io.File(c25507x83693462.f46642x1b64b1fd);
            if (file.exists()) {
                return;
            }
            throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(3003, file.getAbsolutePath() + "文件不存在");
        }
    }

    /* renamed from: checkUuidManagerNotNull */
    private void m95606x8f85ca50() {
        if (this.f46733x552c2cc5 == null) {
            throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(3004, "mUuidManager == null");
        }
    }

    /* renamed from: getActivityHolder */
    public static android.app.Application.ActivityLifecycleCallbacks m95607x4c8ab291() {
        return f46722x7fca6cee;
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.ServiceC25553xc80f4f79 m95608x9cf0d20b() {
        return f46724x67bd25f;
    }

    /* renamed from: getPpsId */
    public static java.lang.String m95609x74fc9138() {
        java.lang.String str;
        synchronized (f46721x9617fd39) {
            str = f46723xc8d94a3b;
        }
        return str;
    }

    /* renamed from: getServiceManager */
    public static com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25543x7ea75130 m95610xa6dfa82e() {
        return f46725x8fbf985a;
    }

    /* renamed from: killSelf */
    private void m95611xdbf09fca() {
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b0 = f46720xbe97f590;
        interfaceC25508x87fce1b0.mo46953x3164ae("PluginProcessService found binderDied: killSelf");
        interfaceC25508x87fce1b0.mo46951x5d03b04();
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/shadow/dynamic/host/PluginProcessService", "killSelf", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/shadow/dynamic/host/PluginProcessService", "killSelf", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    /* renamed from: setUuid */
    private void m95612x7651233d(java.lang.String str) {
        if (this.f46728xede34ebb.isEmpty()) {
            this.f46728xede34ebb = str;
        } else {
            if (this.f46728xede34ebb.equals(str)) {
                return;
            }
            throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(3006, "已设置过uuid==" + this.f46728xede34ebb + "试图设置uuid==" + str);
        }
    }

    /* renamed from: bindLifecycleListener */
    public void m95613xb3768381(android.os.IBinder iBinder) {
        try {
            iBinder.linkToDeath(this, 0);
        } catch (android.os.RemoteException e17) {
            f46720xbe97f590.mo46949x5c4d208("bindLifecycleListener to binder failed", (java.lang.Throwable) e17);
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        m95611xdbf09fca();
    }

    /* renamed from: checkPpsId */
    public com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25 m95614xe045fac6(java.lang.String str) {
        com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25 m95617xa780fd8f;
        synchronized (f46721x9617fd39) {
            f46720xbe97f590.mo46953x3164ae("checkPpsId(" + str + ") -> sPpsId = (" + f46723xc8d94a3b + ")");
            if (f46723xc8d94a3b.isEmpty()) {
                f46723xc8d94a3b = str;
            }
            if (!f46723xc8d94a3b.equals(str)) {
                this.f46729x9e97c8a4.removeCallbacks(this.f46727xc7646d7c);
                this.f46729x9e97c8a4.postDelayed(this.f46727xc7646d7c, 50L);
            }
            m95617xa780fd8f = m95617xa780fd8f();
        }
        return m95617xa780fd8f;
    }

    /* renamed from: exit */
    public void m95615x2fb91e() {
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b0 = f46720xbe97f590;
        if (interfaceC25508x87fce1b0.mo46960xd67f5b29()) {
            interfaceC25508x87fce1b0.mo46953x3164ae("exit");
        }
        f46722x7fca6cee.m95534x233ec80e();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/shadow/dynamic/host/PluginProcessService", "exit", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        java.lang.System.exit(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/shadow/dynamic/host/PluginProcessService", "exit", "()V", "java/lang/System_EXEC_", "exit", "(I)V");
        try {
            wait();
        } catch (java.lang.InterruptedException unused) {
        }
    }

    /* renamed from: getPluginLoader */
    public android.os.IBinder m95616xba82ab9c() {
        return this.f46730xf1253233;
    }

    /* renamed from: getPpsStatus */
    public com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25 m95617xa780fd8f() {
        return new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25(this.f46728xede34ebb, this.f46732x32e4b290, this.f46730xf1253233 != null, this.f46733x552c2cc5 != null, m95609x74fc9138());
    }

    /* renamed from: initCrashHandlerByFd */
    public void m95618x31bc40e8(android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.ParcelFileDescriptor parcelFileDescriptor2) {
        f46720xbe97f590.mo46953x3164ae("initCrashHandlerByFd call for " + parcelFileDescriptor.getFd() + ", " + parcelFileDescriptor2.getFd());
        com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25538xec60a8b7.m95570x71965dbb().m95568x316510(parcelFileDescriptor, parcelFileDescriptor2);
    }

    /* renamed from: loadPluginLoader */
    public void m95619x4340092c(java.lang.String str) {
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b0 = f46720xbe97f590;
        interfaceC25508x87fce1b0.mo46953x3164ae("loadPluginLoader uuid:" + str + " mPluginLoader:" + this.f46730xf1253233);
        m95606x8f85ca50();
        m95612x7651233d(str);
        if (this.f46730xf1253233 != null) {
            throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872.f46686x2e37038e, "重复调用loadPluginLoader");
        }
        try {
            try {
                com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 mo95538xba82ab9c = this.f46733x552c2cc5.mo95538xba82ab9c(str);
                android.os.ParcelFileDescriptor mo95536x19585922 = this.f46733x552c2cc5.mo95536x19585922();
                if (interfaceC25508x87fce1b0.mo46960xd67f5b29()) {
                    interfaceC25508x87fce1b0.mo46953x3164ae("取出uuid==" + str + "的Loader apk:" + mo95538xba82ab9c.f46642x1b64b1fd);
                }
                m95605xe29fe40c(str, mo95538xba82ab9c);
                com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25549x41da3086 m95589x32c4e6 = new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25545x1a49fae6().m95589x32c4e6(mo95538xba82ab9c, str, getApplicationContext(), mo95536x19585922);
                m95589x32c4e6.m95594x1b5ad5b0(this.f46733x552c2cc5);
                if (mo95536x19585922 != null) {
                    mo95536x19585922.close();
                }
                mo95538xba82ab9c.m94643x848e814a();
                this.f46730xf1253233 = m95589x32c4e6;
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b02 = f46720xbe97f590;
                if (interfaceC25508x87fce1b02.mo46959x817b6a63()) {
                    interfaceC25508x87fce1b02.mo46949x5c4d208("获取Loader Apk失败", (java.lang.Throwable) e17);
                }
                throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(3005, e17.getMessage());
            } catch (com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25548x1c97480 e18) {
                throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(3003, "uuid==" + str + "的PluginLoader没有找到。cause:" + e18.getMessage());
            }
        } catch (com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872 e19) {
            com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b03 = f46720xbe97f590;
            if (interfaceC25508x87fce1b03.mo46959x817b6a63()) {
                interfaceC25508x87fce1b03.mo46949x5c4d208("loadPluginLoader发生FailedException", (java.lang.Throwable) e19);
            }
            throw e19;
        } catch (java.lang.RuntimeException e27) {
            com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b04 = f46720xbe97f590;
            if (interfaceC25508x87fce1b04.mo46959x817b6a63()) {
                interfaceC25508x87fce1b04.mo46949x5c4d208("loadPluginLoader发生RuntimeException", (java.lang.Throwable) e27);
            }
            throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(e27);
        } catch (java.lang.Exception e28) {
            e = e28;
            com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b05 = f46720xbe97f590;
            if (interfaceC25508x87fce1b05.mo46959x817b6a63()) {
                interfaceC25508x87fce1b05.mo46949x5c4d208("loadPluginLoader发生Exception", e);
            }
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(3002, "加载动态实现失败 cause：" + e.getMessage());
        }
    }

    /* renamed from: loadPluginLoaderByApk */
    public void m95620x6f4ce479(java.lang.String str, com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 c25507x83693462, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        f46720xbe97f590.mo46953x3164ae("loadPluginLoaderByApk:" + c25507x83693462);
        if (this.f46730xf1253233 != null) {
            throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872.f46686x2e37038e, "重复调用loadPluginLoader");
        }
        try {
            if (parcelFileDescriptor == null || c25507x83693462 == null) {
                throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(3003, "PluginLoader没有找到: androidJar:" + parcelFileDescriptor + "; " + c25507x83693462);
            }
            m95605xe29fe40c(null, c25507x83693462);
            com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25549x41da3086 m95589x32c4e6 = new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25545x1a49fae6().m95589x32c4e6(c25507x83693462, str, getApplicationContext(), parcelFileDescriptor);
            m95589x32c4e6.m95594x1b5ad5b0(this.f46733x552c2cc5);
            parcelFileDescriptor.close();
            c25507x83693462.m94643x848e814a();
            this.f46730xf1253233 = m95589x32c4e6;
        } catch (com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872 e17) {
            f46720xbe97f590.mo46949x5c4d208("loadPluginLoader发生FailedException", (java.lang.Throwable) e17);
            throw e17;
        } catch (java.lang.RuntimeException e18) {
            f46720xbe97f590.mo46949x5c4d208("loadPluginLoader发生RuntimeException", (java.lang.Throwable) e18);
            throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(e18);
        } catch (java.lang.Exception e19) {
            e = e19;
            f46720xbe97f590.mo46949x5c4d208("loadPluginLoader发生Exception", e);
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(3002, "加载动态实现失败 cause：" + e.getMessage());
        }
    }

    /* renamed from: loadRuntime */
    public void m95621x3de17412(java.lang.String str) {
        m95606x8f85ca50();
        m95612x7651233d(str);
        if (this.f46732x32e4b290) {
            throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872.f46687xbf7f413d, "重复调用loadRuntime");
        }
        try {
            com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b0 = f46720xbe97f590;
            if (interfaceC25508x87fce1b0.mo46960xd67f5b29()) {
                interfaceC25508x87fce1b0.mo46953x3164ae("loadRuntime uuid:" + str);
            }
            try {
                try {
                    com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 mo95539x9a3f0ba2 = this.f46733x552c2cc5.mo95539x9a3f0ba2(str);
                    com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462 c25507x83693462 = new com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462(mo95539x9a3f0ba2.f46642x1b64b1fd, mo95539x9a3f0ba2.f46644xcae4856d, mo95539x9a3f0ba2.f46643xdba72780);
                    if (com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25533x32e9deb9.m95555x3de17412(c25507x83693462)) {
                        com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25533x32e9deb9.m95559x7f93e4f3(this, c25507x83693462);
                    }
                    this.f46732x32e4b290 = true;
                } catch (com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25548x1c97480 e17) {
                    throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(3003, "uuid==" + str + "的Runtime没有找到。cause:" + e17.getMessage());
                }
            } catch (android.os.RemoteException e18) {
                throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(3005, e18.getMessage());
            }
        } catch (java.lang.RuntimeException e19) {
            com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b02 = f46720xbe97f590;
            if (interfaceC25508x87fce1b02.mo46959x817b6a63()) {
                interfaceC25508x87fce1b02.mo46949x5c4d208("loadRuntime发生RuntimeException", (java.lang.Throwable) e19);
            }
            throw new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(e19);
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        f46720xbe97f590.mo46953x3164ae("onBind:" + intent);
        return this.f46731xda5bff4c;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.AbstractServiceC25529x43ace7ea, android.app.Service
    public void onCreate() {
        f46724x67bd25f = this;
        super.onCreate();
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.AbstractServiceC25529x43ace7ea, android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        f46720xbe97f590.mo46953x3164ae("onUnbind:" + intent);
        return super.onUnbind(intent);
    }

    /* renamed from: setHostOpenedFds */
    public void m95622xf3653042(java.util.Map<java.lang.String, android.os.ParcelFileDescriptor> map) {
        com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25541xf001b0c.m95581x71965dbb().mo95583x3d2142d(map);
    }

    /* renamed from: setSystemService */
    public void m95623x3f690c44(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25543x7ea75130 interfaceC25543x7ea75130) {
        f46720xbe97f590.mo46953x3164ae("setSystemService " + interfaceC25543x7ea75130);
        f46725x8fbf985a = interfaceC25543x7ea75130;
        m95613xb3768381(interfaceC25543x7ea75130.asBinder());
    }

    /* renamed from: setUuidManager */
    public void m95624x1b5ad5b0(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25557xe88c352 interfaceC25557xe88c352) {
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b0 = f46720xbe97f590;
        if (interfaceC25508x87fce1b0.mo46960xd67f5b29()) {
            interfaceC25508x87fce1b0.mo46953x3164ae("setUuidManager uuidManager==" + interfaceC25557xe88c352);
        }
        this.f46733x552c2cc5 = interfaceC25557xe88c352;
        if (this.f46730xf1253233 != null) {
            if (interfaceC25508x87fce1b0.mo46960xd67f5b29()) {
                interfaceC25508x87fce1b0.mo46953x3164ae("更新mPluginLoader的uuidManager");
            }
            this.f46730xf1253233.m95594x1b5ad5b0(interfaceC25557xe88c352);
        }
    }
}

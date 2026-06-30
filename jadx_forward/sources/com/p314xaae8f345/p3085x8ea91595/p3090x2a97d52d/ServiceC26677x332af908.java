package com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d;

/* renamed from: com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService */
/* loaded from: classes13.dex */
public class ServiceC26677x332af908 extends android.app.Service implements com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.InterfaceC26678x1cd107c8 {
    protected static final java.lang.String TAG = "TMAssistantDownloadSDKService";

    /* renamed from: _hellAccFlag_ */
    private byte f56215x7f11beae;

    /* renamed from: downloadSDKServiceImpl */
    protected final com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.TMAssistantDownloadSDKServiceImpl f56216x4e62a883 = new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.TMAssistantDownloadSDKServiceImpl();

    /* renamed from: mCallbacks */
    protected final android.os.RemoteCallbackList<com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4> f56218x3c7f32e1 = new android.os.RemoteCallbackList<>();

    /* renamed from: mCallbackHashMap */
    protected final java.util.HashMap<com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4, java.lang.String> f56217xe08ae93c = new java.util.HashMap<>();

    /* renamed from: mServiceDownloadTaskManager */
    com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26680x21944beb f56219x89186e18 = null;

    /* renamed from: com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService$TMAssistantDownloadSDKServiceImpl */
    /* loaded from: classes13.dex */
    public class TMAssistantDownloadSDKServiceImpl extends com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.Stub {
        public TMAssistantDownloadSDKServiceImpl() {
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: cancelDownloadTask */
        public void mo104783x48fc89c7(java.lang.String str, java.lang.String str2) {
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26680x21944beb c26680x21944beb = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.this.f56219x89186e18;
            if (c26680x21944beb != null) {
                c26680x21944beb.m104959xe1fe4122(str, str2);
            }
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: getDownloadTaskInfo */
        public com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 mo104784x69694ff1(java.lang.String str, java.lang.String str2) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.TAG, "getDownloadTaskInfo");
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26680x21944beb c26680x21944beb = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.this.f56219x89186e18;
            if (c26680x21944beb != null) {
                return c26680x21944beb.m104962x69694ff1(str, str2);
            }
            return null;
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: getServiceVersion */
        public int mo104785x8a0bb559() {
            return 1;
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: isAllDownloadFinished */
        public boolean mo104786xe58d0751() {
            return com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26664x893bb469.m104860x9cf0d20b().m104865xe58d0751().booleanValue();
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: pauseDownloadTask */
        public void mo104787xb0172743(java.lang.String str, java.lang.String str2) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.TAG, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33727x24728b);
            try {
                com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26680x21944beb c26680x21944beb = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.this.f56219x89186e18;
                if (c26680x21944beb != null) {
                    c26680x21944beb.m104963xe51afc9e(str, str2);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.TAG, e17, "", new java.lang.Object[0]);
            }
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.TAG, "pauseDownloadTask end");
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: registerDownloadTaskCallback */
        public void mo104788x8f0da8d5(java.lang.String str, com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4 interfaceC26645x556a9ec4) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.TAG, "registerDownloadTaskCallback,clientKey:" + str);
            if (str == null || interfaceC26645x556a9ec4 == null) {
                return;
            }
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.this.f56218x3c7f32e1.register(interfaceC26645x556a9ec4);
            synchronized (this) {
                com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.this.f56217xe08ae93c.put(interfaceC26645x556a9ec4, str);
            }
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: setServiceSetingIsDownloadWifiOnly */
        public void mo104789xa56831c6(boolean z17) {
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.m104915x9cf0d20b().m104923xde8e7655(z17);
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: setServiceSetingIsTaskAutoResume */
        public void mo104790x80c86a1e(boolean z17) {
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.m104915x9cf0d20b().m104924xb884866d(z17);
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: setServiceSetingMaxTaskNum */
        public void mo104791x39ddf030(int i17) {
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.m104915x9cf0d20b().m104925x6bd33bf(i17);
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: startDownloadTask */
        public int mo104792x729383af(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, java.lang.String str4, java.lang.String str5, java.util.Map map) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.TAG, "startDownloadTask，clientkey:" + str + ",url:" + str2 + ",manager:" + com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.this.f56219x89186e18 + ",fileName:" + str5);
            if (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.this.f56219x89186e18 == null) {
                return 3;
            }
            com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f.m105397x9cf0d20b().m105403xd8e69476(str, str2);
            return com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.this.f56219x89186e18.m104967x5cae6f0a(str, str2, str3, j17, i17, str4, str5, map);
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: unregisterDownloadTaskCallback */
        public void mo104793x9e4c47ee(java.lang.String str, com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4 interfaceC26645x556a9ec4) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.TAG, "unregisterDownloadTaskCallback,clientKey:" + str);
            if (str == null || interfaceC26645x556a9ec4 == null) {
                return;
            }
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.this.f56218x3c7f32e1.unregister(interfaceC26645x556a9ec4);
            synchronized (this) {
                com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.this.f56217xe08ae93c.remove(interfaceC26645x556a9ec4);
            }
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.InterfaceC26678x1cd107c8
    /* renamed from: OnDownloadProgressChanged */
    public void mo104956xdb72a920(java.lang.String str, java.lang.String str2, long j17, long j18) {
        try {
            int beginBroadcast = this.f56218x3c7f32e1.beginBroadcast();
            for (int i17 = 0; i17 < beginBroadcast; i17++) {
                try {
                    com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4 broadcastItem = this.f56218x3c7f32e1.getBroadcastItem(i17);
                    java.lang.String str3 = this.f56217xe08ae93c.get(broadcastItem);
                    if (str3 != null && str3.equals(str)) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("OnDownloadProgressChanged,clientKey:");
                        sb6.append(str);
                        sb6.append(",receivedLen:");
                        try {
                            sb6.append(j17);
                            sb6.append(",url:");
                            try {
                                sb6.append(str2);
                                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, sb6.toString());
                                broadcastItem.mo104779xcbedf400(str, str2, j17, j18);
                                break;
                            } catch (android.os.RemoteException unused) {
                                continue;
                            }
                        } catch (android.os.RemoteException unused2) {
                        }
                    }
                } catch (android.os.RemoteException unused3) {
                }
            }
            this.f56218x3c7f32e1.finishBroadcast();
        } catch (java.lang.Throwable unused4) {
        }
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.InterfaceC26678x1cd107c8
    /* renamed from: OnDownloadStateChanged */
    public void mo104957xc9b7fa2a(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, boolean z17, boolean z18) {
        try {
            int beginBroadcast = this.f56218x3c7f32e1.beginBroadcast();
            for (int i19 = 0; i19 < beginBroadcast; i19++) {
                try {
                    com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4 broadcastItem = this.f56218x3c7f32e1.getBroadcastItem(i19);
                    java.lang.String str4 = this.f56217xe08ae93c.get(broadcastItem);
                    if (str4 != null && str4.equals(str)) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("OnDownloadStateChanged,clientKey:");
                        sb6.append(str);
                        sb6.append(",state:");
                        try {
                            sb6.append(i17);
                            sb6.append(",url:");
                            try {
                                sb6.append(str2);
                                com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, sb6.toString());
                                broadcastItem.mo104780xb39b9b4a(str, str2, i17, i18, str3, z17, z18);
                                break;
                            } catch (android.os.RemoteException unused) {
                                continue;
                            }
                        } catch (android.os.RemoteException unused2) {
                        }
                    }
                } catch (android.os.RemoteException unused3) {
                }
            }
            this.f56218x3c7f32e1.finishBroadcast();
        } catch (java.lang.Throwable unused4) {
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onBind ,intent:" + intent);
        return this.f56216x4e62a883;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105499xe9f5beed(this);
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.m104950x9cf0d20b().m104953xc20729b2();
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26680x21944beb c26680x21944beb = new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.p3091x3f198a88.C26680x21944beb(com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.C26760xbf3cb54f.m105397x9cf0d20b().m105402x18c1bab());
        this.f56219x89186e18 = c26680x21944beb;
        c26680x21944beb.m104966xc6cf6336(this);
        this.f56219x89186e18.m104964x2becbd20();
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26664x893bb469.m104860x9cf0d20b().m104864x316510();
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onDestroy");
        super.onDestroy();
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26664x893bb469.m104860x9cf0d20b().m104870xcde67f29();
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26683x196ff91c.m104979x9cf0d20b().m104980xc6e3cda3();
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15.m104988x9cf0d20b().m104989xf5e5c7a0();
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26686xfa250f15.m104988x9cf0d20b().m104990x5cd39514();
        this.f56219x89186e18.m104968xd9fb6199();
        this.f56219x89186e18.m104966xc6cf6336(null);
        this.f56219x89186e18 = null;
        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26675xcb69b97b.m104950x9cf0d20b().m104955x41b0e64b();
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105491x5cd39ffa();
        android.os.SystemClock.sleep(300L);
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tmassistantsdk/downloadservice/TMAssistantDownloadSDKService", "onDestroy", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/tmassistantsdk/downloadservice/TMAssistantDownloadSDKService", "onDestroy", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "onUnbind ,intent:" + intent);
        return super.onUnbind(intent);
    }
}

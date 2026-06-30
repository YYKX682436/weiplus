package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.flutter.embedding.engine.FlutterEngineConnectionRegistry */
/* loaded from: classes15.dex */
public class C28583xadf77f39 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28626xdefe319f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28636x96284e85, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3294x2a7d81b0.InterfaceC28629x9d440a60, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3295x51bfb16a.InterfaceC28632xee0fa49a {
    private static final java.lang.String TAG = "FlutterEngineCxnRegstry";

    /* renamed from: activityPluginBinding */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28583xadf77f39.FlutterEngineActivityPluginBinding f70816x4483d503;

    /* renamed from: broadcastReceiver */
    private android.content.BroadcastReceiver f70817x2e57e5d0;

    /* renamed from: broadcastReceiverPluginBinding */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28583xadf77f39.FlutterEngineBroadcastReceiverPluginBinding f70819xee2623e2;

    /* renamed from: contentProvider */
    private android.content.ContentProvider f70820x559a158a;

    /* renamed from: contentProviderPluginBinding */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28583xadf77f39.FlutterEngineContentProviderPluginBinding f70822xf54cd268;

    /* renamed from: exclusiveActivity */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28538xcee5fd7a<android.app.Activity> f70823xdb4c97cd;

    /* renamed from: flutterEngine */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e f70824x3a4f997e;

    /* renamed from: pluginBinding */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding f70826xbdeee7d2;

    /* renamed from: service */
    private android.app.Service f70828x7643c6b5;

    /* renamed from: servicePluginBinding */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28583xadf77f39.FlutterEngineServicePluginBinding f70830x37eb9f1d;

    /* renamed from: plugins */
    private final java.util.Map<java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f>, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f> f70827xe3a677a0 = new java.util.HashMap();

    /* renamed from: activityAwarePlugins */
    private final java.util.Map<java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f>, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f> f70815x6111f811 = new java.util.HashMap();

    /* renamed from: isWaitingForActivityReattachment */
    private boolean f70825x37785d6b = false;

    /* renamed from: serviceAwarePlugins */
    private final java.util.Map<java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f>, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28635x1d9c00c9> f70829x26db82b7 = new java.util.HashMap();

    /* renamed from: broadcastReceiverAwarePlugins */
    private final java.util.Map<java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f>, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3294x2a7d81b0.InterfaceC28628x8bd3728e> f70818x668ad152 = new java.util.HashMap();

    /* renamed from: contentProviderAwarePlugins */
    private final java.util.Map<java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f>, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3295x51bfb16a.InterfaceC28631xeb788f14> f70821x14313a0c = new java.util.HashMap();

    /* renamed from: io.flutter.embedding.engine.FlutterEngineConnectionRegistry$DefaultFlutterAssets */
    /* loaded from: classes13.dex */
    public static class DefaultFlutterAssets implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterAssets {

        /* renamed from: flutterLoader */
        final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f f70831x464ccf4f;

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterAssets
        /* renamed from: getAssetFilePathByName */
        public java.lang.String mo137498xa4fdae7d(java.lang.String str) {
            return this.f70831x464ccf4f.m137935x1898ec96(str);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterAssets
        /* renamed from: getAssetFilePathBySubpath */
        public java.lang.String mo137500x573ff133(java.lang.String str) {
            return this.f70831x464ccf4f.m137935x1898ec96(str);
        }

        private DefaultFlutterAssets(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f c28615x75ebff2f) {
            this.f70831x464ccf4f = c28615x75ebff2f;
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterAssets
        /* renamed from: getAssetFilePathByName */
        public java.lang.String mo137499xa4fdae7d(java.lang.String str, java.lang.String str2) {
            return this.f70831x464ccf4f.m137936x1898ec96(str, str2);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterAssets
        /* renamed from: getAssetFilePathBySubpath */
        public java.lang.String mo137501x573ff133(java.lang.String str, java.lang.String str2) {
            return this.f70831x464ccf4f.m137936x1898ec96(str, str2);
        }
    }

    /* renamed from: io.flutter.embedding.engine.FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding */
    /* loaded from: classes15.dex */
    public static class FlutterEngineActivityPluginBinding implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 {

        /* renamed from: activity */
        private final android.app.Activity f70832x9d4bf30f;

        /* renamed from: hiddenLifecycleReference */
        private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3296xedfae76a.C28634xcda7566b f70833x4dd9324b;

        /* renamed from: onRequestPermissionsResultListeners */
        private final java.util.Set<io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.RequestPermissionsResultListener> f70836x22aef94e = new java.util.HashSet();

        /* renamed from: onActivityResultListeners */
        private final java.util.Set<io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener> f70834x24afeb4 = new java.util.HashSet();

        /* renamed from: onNewIntentListeners */
        private final java.util.Set<io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.NewIntentListener> f70835x454b582 = new java.util.HashSet();

        /* renamed from: onUserLeaveHintListeners */
        private final java.util.Set<io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.UserLeaveHintListener> f70838xb72021eb = new java.util.HashSet();

        /* renamed from: onWindowFocusChangedListeners */
        private final java.util.Set<io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.WindowFocusChangedListener> f70839x1be3b374 = new java.util.HashSet();

        /* renamed from: onSaveInstanceStateListeners */
        private final java.util.Set<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3.OnSaveInstanceStateListener> f70837x41847bbf = new java.util.HashSet();

        public FlutterEngineActivityPluginBinding(android.app.Activity activity, p012xc85e97e9.p093xedfae76a.o oVar) {
            this.f70832x9d4bf30f = activity;
            this.f70833x4dd9324b = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3296xedfae76a.C28634xcda7566b(oVar);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3
        /* renamed from: addActivityResultListener */
        public void mo137502xbf77c2e1(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener activityResultListener) {
            this.f70834x24afeb4.add(activityResultListener);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3
        /* renamed from: addOnNewIntentListener */
        public void mo137503x3f200eb0(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.NewIntentListener newIntentListener) {
            this.f70835x454b582.add(newIntentListener);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3
        /* renamed from: addOnSaveStateListener */
        public void mo137504x34e23b68(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3.OnSaveInstanceStateListener onSaveInstanceStateListener) {
            this.f70837x41847bbf.add(onSaveInstanceStateListener);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3
        /* renamed from: addOnUserLeaveHintListener */
        public void mo137505x4cb909a7(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.UserLeaveHintListener userLeaveHintListener) {
            this.f70838xb72021eb.add(userLeaveHintListener);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3
        /* renamed from: addOnWindowFocusChangedListener */
        public void mo137506xc604aa20(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.WindowFocusChangedListener windowFocusChangedListener) {
            this.f70839x1be3b374.add(windowFocusChangedListener);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3
        /* renamed from: addRequestPermissionsResultListener */
        public void mo137507xb8c6e287(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.RequestPermissionsResultListener requestPermissionsResultListener) {
            this.f70836x22aef94e.add(requestPermissionsResultListener);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3
        /* renamed from: getActivity */
        public android.app.Activity mo137508x19263085() {
            return this.f70832x9d4bf30f;
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3
        /* renamed from: getLifecycle */
        public java.lang.Object mo137509xed6858b4() {
            return this.f70833x4dd9324b;
        }

        /* renamed from: onActivityResult */
        public boolean m137510x9d4787cb(int i17, int i18, android.content.Intent intent) {
            java.util.Iterator it = new java.util.HashSet(this.f70834x24afeb4).iterator();
            while (true) {
                boolean z17 = false;
                while (it.hasNext()) {
                    if (((io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener) it.next()).mo63506x9d4787cb(i17, i18, intent) || z17) {
                        z17 = true;
                    }
                }
                return z17;
            }
        }

        /* renamed from: onNewIntent */
        public void m137511xc944513d(android.content.Intent intent) {
            java.util.Iterator<io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.NewIntentListener> it = this.f70835x454b582.iterator();
            while (it.hasNext()) {
                it.next().m138443xc944513d(intent);
            }
        }

        /* renamed from: onRequestPermissionsResult */
        public boolean m137512x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
            java.util.Iterator<io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.RequestPermissionsResultListener> it = this.f70836x22aef94e.iterator();
            while (true) {
                boolean z17 = false;
                while (it.hasNext()) {
                    if (it.next().mo266x953457f1(i17, strArr, iArr) || z17) {
                        z17 = true;
                    }
                }
                return z17;
            }
        }

        /* renamed from: onRestoreInstanceState */
        public void m137513xb949e58d(android.os.Bundle bundle) {
            java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3.OnSaveInstanceStateListener> it = this.f70837x41847bbf.iterator();
            while (it.hasNext()) {
                it.next().m137989xb949e58d(bundle);
            }
        }

        /* renamed from: onSaveInstanceState */
        public void m137514xa71a2260(android.os.Bundle bundle) {
            java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3.OnSaveInstanceStateListener> it = this.f70837x41847bbf.iterator();
            while (it.hasNext()) {
                it.next().m137990xa71a2260(bundle);
            }
        }

        /* renamed from: onUserLeaveHint */
        public void m137515xb1e9ab4() {
            java.util.Iterator<io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.UserLeaveHintListener> it = this.f70838xb72021eb.iterator();
            while (it.hasNext()) {
                it.next().m138444xb1e9ab4();
            }
        }

        /* renamed from: onWindowFocusChanged */
        public void m137516xa4ec7b0b(boolean z17) {
            java.util.Iterator<io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.WindowFocusChangedListener> it = this.f70839x1be3b374.iterator();
            while (it.hasNext()) {
                it.next().m138445xa4ec7b0b(z17);
            }
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3
        /* renamed from: removeActivityResultListener */
        public void mo137517xa002e684(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener activityResultListener) {
            this.f70834x24afeb4.remove(activityResultListener);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3
        /* renamed from: removeOnNewIntentListener */
        public void mo137518x461145ed(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.NewIntentListener newIntentListener) {
            this.f70835x454b582.remove(newIntentListener);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3
        /* renamed from: removeOnSaveStateListener */
        public void mo137519x3bd372a5(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3.OnSaveInstanceStateListener onSaveInstanceStateListener) {
            this.f70837x41847bbf.remove(onSaveInstanceStateListener);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3
        /* renamed from: removeOnUserLeaveHintListener */
        public void mo137520x7d925a64(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.UserLeaveHintListener userLeaveHintListener) {
            this.f70838xb72021eb.remove(userLeaveHintListener);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3
        /* renamed from: removeOnWindowFocusChangedListener */
        public void mo137521xfb014783(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.WindowFocusChangedListener windowFocusChangedListener) {
            this.f70839x1be3b374.remove(windowFocusChangedListener);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3
        /* renamed from: removeRequestPermissionsResultListener */
        public void mo137522xb9a0166a(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.RequestPermissionsResultListener requestPermissionsResultListener) {
            this.f70836x22aef94e.remove(requestPermissionsResultListener);
        }
    }

    /* renamed from: io.flutter.embedding.engine.FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding */
    /* loaded from: classes15.dex */
    public static class FlutterEngineBroadcastReceiverPluginBinding implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3294x2a7d81b0.InterfaceC28630xd890b002 {

        /* renamed from: broadcastReceiver */
        private final android.content.BroadcastReceiver f70840x2e57e5d0;

        public FlutterEngineBroadcastReceiverPluginBinding(android.content.BroadcastReceiver broadcastReceiver) {
            this.f70840x2e57e5d0 = broadcastReceiver;
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3294x2a7d81b0.InterfaceC28630xd890b002
        /* renamed from: getBroadcastReceiver */
        public android.content.BroadcastReceiver mo137523x818c6d1a() {
            return this.f70840x2e57e5d0;
        }
    }

    /* renamed from: io.flutter.embedding.engine.FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding */
    /* loaded from: classes15.dex */
    public static class FlutterEngineContentProviderPluginBinding implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3295x51bfb16a.InterfaceC28633xdb2be688 {

        /* renamed from: contentProvider */
        private final android.content.ContentProvider f70841x559a158a;

        public FlutterEngineContentProviderPluginBinding(android.content.ContentProvider contentProvider) {
            this.f70841x559a158a = contentProvider;
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3295x51bfb16a.InterfaceC28633xdb2be688
        /* renamed from: getContentProvider */
        public android.content.ContentProvider mo137524x39fbe754() {
            return this.f70841x559a158a;
        }
    }

    /* renamed from: io.flutter.embedding.engine.FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding */
    /* loaded from: classes15.dex */
    public static class FlutterEngineServicePluginBinding implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28637x43b0d33d {

        /* renamed from: hiddenLifecycleReference */
        private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3296xedfae76a.C28634xcda7566b f70842x4dd9324b;

        /* renamed from: onModeChangeListeners */
        private final java.util.Set<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28635x1d9c00c9.OnModeChangeListener> f70843x290ffed = new java.util.HashSet();

        /* renamed from: service */
        private final android.app.Service f70844x7643c6b5;

        public FlutterEngineServicePluginBinding(android.app.Service service, p012xc85e97e9.p093xedfae76a.o oVar) {
            this.f70844x7643c6b5 = service;
            this.f70842x4dd9324b = oVar != null ? new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3296xedfae76a.C28634xcda7566b(oVar) : null;
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28637x43b0d33d
        /* renamed from: addOnModeChangeListener */
        public void mo137525x1c813b87(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28635x1d9c00c9.OnModeChangeListener onModeChangeListener) {
            this.f70843x290ffed.add(onModeChangeListener);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28637x43b0d33d
        /* renamed from: getLifecycle */
        public java.lang.Object mo137526xed6858b4() {
            return this.f70842x4dd9324b;
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28637x43b0d33d
        /* renamed from: getService */
        public android.app.Service mo137527xb411027f() {
            return this.f70844x7643c6b5;
        }

        /* renamed from: onMoveToBackground */
        public void m137528x260bb479() {
            java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28635x1d9c00c9.OnModeChangeListener> it = this.f70843x290ffed.iterator();
            while (it.hasNext()) {
                it.next().m137998x260bb479();
            }
        }

        /* renamed from: onMoveToForeground */
        public void m137529xebbbc88e() {
            java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28635x1d9c00c9.OnModeChangeListener> it = this.f70843x290ffed.iterator();
            while (it.hasNext()) {
                it.next().m137999xebbbc88e();
            }
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28637x43b0d33d
        /* renamed from: removeOnModeChangeListener */
        public void mo137530xf3b6ebea(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28635x1d9c00c9.OnModeChangeListener onModeChangeListener) {
            this.f70843x290ffed.remove(onModeChangeListener);
        }
    }

    public C28583xadf77f39(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f c28615x75ebff2f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1 c28584x3d6c67c1) {
        this.f70824x3a4f997e = c28580x69eec95e;
        this.f70826xbdeee7d2 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding(context, c28580x69eec95e, c28580x69eec95e.m137427x4255efe8(), c28580x69eec95e.m137441x5e5b7e39(), c28580x69eec95e.m137437xe5cc0b81().mo138640x52b66db3(), new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28583xadf77f39.DefaultFlutterAssets(c28615x75ebff2f), c28584x3d6c67c1);
    }

    /* renamed from: attachToActivityInternal */
    private void m137469x2b3b1eac(android.app.Activity activity, p012xc85e97e9.p093xedfae76a.o oVar) {
        this.f70816x4483d503 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28583xadf77f39.FlutterEngineActivityPluginBinding(activity, oVar);
        this.f70824x3a4f997e.m137437xe5cc0b81().mo138651xbc662463(activity.getIntent() != null ? activity.getIntent().getBooleanExtra(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691.f70921x1b0ce3c7, false) : false);
        this.f70824x3a4f997e.m137437xe5cc0b81().mo138622xac1eee45(activity, this.f70824x3a4f997e.m137441x5e5b7e39(), this.f70824x3a4f997e.m137427x4255efe8());
        this.f70824x3a4f997e.m137438xd3b564d1().m138779xac1eee45(activity, this.f70824x3a4f997e.m137427x4255efe8());
        for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f interfaceC28625xf037586f : this.f70815x6111f811.values()) {
            if (this.f70825x37785d6b) {
                interfaceC28625xf037586f.mo265x37859a58(this.f70816x4483d503);
            } else {
                interfaceC28625xf037586f.mo260x9f807ad(this.f70816x4483d503);
            }
        }
        this.f70825x37785d6b = false;
    }

    /* renamed from: attachedActivity */
    private android.app.Activity m137470x4b4cf0d3() {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28538xcee5fd7a<android.app.Activity> interfaceC28538xcee5fd7a = this.f70823xdb4c97cd;
        if (interfaceC28538xcee5fd7a != null) {
            return interfaceC28538xcee5fd7a.mo10653x73732a52();
        }
        return null;
    }

    /* renamed from: detachFromActivityInternal */
    private void m137471x8c4c2ae9() {
        this.f70824x3a4f997e.m137437xe5cc0b81().mo138633xb06a1793();
        this.f70824x3a4f997e.m137438xd3b564d1().m138787xb06a1793();
        this.f70823xdb4c97cd = null;
        this.f70816x4483d503 = null;
    }

    /* renamed from: detachFromAppComponent */
    private void m137472x7bbeaa59() {
        if (m137473xa080ea38()) {
            mo137482x32c8cc0c();
            return;
        }
        if (m137476xb86ec66c()) {
            mo137486x7795a18();
        } else if (m137474x818becc7()) {
            mo137484x6862d973();
        } else if (m137475xf5416e41()) {
            mo137485x840395ed();
        }
    }

    /* renamed from: isAttachedToActivity */
    private boolean m137473xa080ea38() {
        return this.f70823xdb4c97cd != null;
    }

    /* renamed from: isAttachedToBroadcastReceiver */
    private boolean m137474x818becc7() {
        return this.f70817x2e57e5d0 != null;
    }

    /* renamed from: isAttachedToContentProvider */
    private boolean m137475xf5416e41() {
        return this.f70820x559a158a != null;
    }

    /* renamed from: isAttachedToService */
    private boolean m137476xb86ec66c() {
        return this.f70828x7643c6b5 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0
    public void add(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f interfaceC28623x7c9e3e4f) {
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#add ".concat(interfaceC28623x7c9e3e4f.getClass().getSimpleName()));
        try {
            if (has(interfaceC28623x7c9e3e4f.getClass())) {
                io.p3284xd2ae381c.Log.w(TAG, "Attempted to register plugin (" + interfaceC28623x7c9e3e4f + ") but it was already registered with this FlutterEngine (" + this.f70824x3a4f997e + ").");
                if (m139423xc9e48c90 != null) {
                    m139423xc9e48c90.close();
                    return;
                }
                return;
            }
            io.p3284xd2ae381c.Log.v(TAG, "Adding plugin: " + interfaceC28623x7c9e3e4f);
            this.f70827xe3a677a0.put(interfaceC28623x7c9e3e4f.getClass(), interfaceC28623x7c9e3e4f);
            interfaceC28623x7c9e3e4f.mo261xdddc9e60(this.f70826xbdeee7d2);
            if (interfaceC28623x7c9e3e4f instanceof io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f) {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f interfaceC28625xf037586f = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f) interfaceC28623x7c9e3e4f;
                this.f70815x6111f811.put(interfaceC28623x7c9e3e4f.getClass(), interfaceC28625xf037586f);
                if (m137473xa080ea38()) {
                    interfaceC28625xf037586f.mo260x9f807ad(this.f70816x4483d503);
                }
            }
            if (interfaceC28623x7c9e3e4f instanceof io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28635x1d9c00c9) {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28635x1d9c00c9 interfaceC28635x1d9c00c9 = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28635x1d9c00c9) interfaceC28623x7c9e3e4f;
                this.f70829x26db82b7.put(interfaceC28623x7c9e3e4f.getClass(), interfaceC28635x1d9c00c9);
                if (m137476xb86ec66c()) {
                    interfaceC28635x1d9c00c9.m137996xb393a657(this.f70830x37eb9f1d);
                }
            }
            if (interfaceC28623x7c9e3e4f instanceof io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3294x2a7d81b0.InterfaceC28628x8bd3728e) {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3294x2a7d81b0.InterfaceC28628x8bd3728e interfaceC28628x8bd3728e = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3294x2a7d81b0.InterfaceC28628x8bd3728e) interfaceC28623x7c9e3e4f;
                this.f70818x668ad152.put(interfaceC28623x7c9e3e4f.getClass(), interfaceC28628x8bd3728e);
                if (m137474x818becc7()) {
                    interfaceC28628x8bd3728e.m137991xc55622f2(this.f70819xee2623e2);
                }
            }
            if (interfaceC28623x7c9e3e4f instanceof io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3295x51bfb16a.InterfaceC28631xeb788f14) {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3295x51bfb16a.InterfaceC28631xeb788f14 interfaceC28631xeb788f14 = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3295x51bfb16a.InterfaceC28631xeb788f14) interfaceC28623x7c9e3e4f;
                this.f70821x14313a0c.put(interfaceC28623x7c9e3e4f.getClass(), interfaceC28631xeb788f14);
                if (m137475xf5416e41()) {
                    interfaceC28631xeb788f14.m137993x43e9332c(this.f70822xf54cd268);
                }
            }
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28626xdefe319f
    /* renamed from: attachToActivity */
    public void mo137477x715d32cf(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28538xcee5fd7a<android.app.Activity> interfaceC28538xcee5fd7a, p012xc85e97e9.p093xedfae76a.o oVar) {
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.InterfaceC28538xcee5fd7a<android.app.Activity> interfaceC28538xcee5fd7a2 = this.f70823xdb4c97cd;
            if (interfaceC28538xcee5fd7a2 != null) {
                interfaceC28538xcee5fd7a2.mo10652xf8d3d6a1();
            }
            m137472x7bbeaa59();
            this.f70823xdb4c97cd = interfaceC28538xcee5fd7a;
            m137469x2b3b1eac(interfaceC28538xcee5fd7a.mo10653x73732a52(), oVar);
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3294x2a7d81b0.InterfaceC28629x9d440a60
    /* renamed from: attachToBroadcastReceiver */
    public void mo137478xa7525e10(android.content.BroadcastReceiver broadcastReceiver, p012xc85e97e9.p093xedfae76a.o oVar) {
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#attachToBroadcastReceiver");
        try {
            m137472x7bbeaa59();
            this.f70817x2e57e5d0 = broadcastReceiver;
            this.f70819xee2623e2 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28583xadf77f39.FlutterEngineBroadcastReceiverPluginBinding(broadcastReceiver);
            java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3294x2a7d81b0.InterfaceC28628x8bd3728e> it = this.f70818x668ad152.values().iterator();
            while (it.hasNext()) {
                it.next().m137991xc55622f2(this.f70819xee2623e2);
            }
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3295x51bfb16a.InterfaceC28632xee0fa49a
    /* renamed from: attachToContentProvider */
    public void mo137479x4f559dca(android.content.ContentProvider contentProvider, p012xc85e97e9.p093xedfae76a.o oVar) {
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#attachToContentProvider");
        try {
            m137472x7bbeaa59();
            this.f70820x559a158a = contentProvider;
            this.f70822xf54cd268 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28583xadf77f39.FlutterEngineContentProviderPluginBinding(contentProvider);
            java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3295x51bfb16a.InterfaceC28631xeb788f14> it = this.f70821x14313a0c.values().iterator();
            while (it.hasNext()) {
                it.next().m137993x43e9332c(this.f70822xf54cd268);
            }
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28636x96284e85
    /* renamed from: attachToService */
    public void mo137480xbf2b8ef5(android.app.Service service, p012xc85e97e9.p093xedfae76a.o oVar, boolean z17) {
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#attachToService");
        try {
            m137472x7bbeaa59();
            this.f70828x7643c6b5 = service;
            this.f70830x37eb9f1d = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28583xadf77f39.FlutterEngineServicePluginBinding(service, oVar);
            java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28635x1d9c00c9> it = this.f70829x26db82b7.values().iterator();
            while (it.hasNext()) {
                it.next().m137996xb393a657(this.f70830x37eb9f1d);
            }
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

    /* renamed from: destroy */
    public void m137481x5cd39ffa() {
        io.p3284xd2ae381c.Log.v(TAG, "Destroying.");
        m137472x7bbeaa59();
        mo137497x4c6f0a7d();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28626xdefe319f
    /* renamed from: detachFromActivity */
    public void mo137482x32c8cc0c() {
        if (!m137473xa080ea38()) {
            io.p3284xd2ae381c.Log.e(TAG, "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f> it = this.f70815x6111f811.values().iterator();
            while (it.hasNext()) {
                it.next().mo262x262a05ea();
            }
            m137471x8c4c2ae9();
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28626xdefe319f
    /* renamed from: detachFromActivityForConfigChanges */
    public void mo137483x3d389304() {
        if (!m137473xa080ea38()) {
            io.p3284xd2ae381c.Log.e(TAG, "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.f70825x37785d6b = true;
            java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f> it = this.f70815x6111f811.values().iterator();
            while (it.hasNext()) {
                it.next().mo263x145650e2();
            }
            m137471x8c4c2ae9();
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3294x2a7d81b0.InterfaceC28629x9d440a60
    /* renamed from: detachFromBroadcastReceiver */
    public void mo137484x6862d973() {
        if (!m137474x818becc7()) {
            io.p3284xd2ae381c.Log.e(TAG, "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3294x2a7d81b0.InterfaceC28628x8bd3728e> it = this.f70818x668ad152.values().iterator();
            while (it.hasNext()) {
                it.next().m137992xe401d955();
            }
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3295x51bfb16a.InterfaceC28632xee0fa49a
    /* renamed from: detachFromContentProvider */
    public void mo137485x840395ed() {
        if (!m137475xf5416e41()) {
            io.p3284xd2ae381c.Log.e(TAG, "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3295x51bfb16a.InterfaceC28631xeb788f14> it = this.f70821x14313a0c.values().iterator();
            while (it.hasNext()) {
                it.next().m137994x69c5264f();
            }
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28636x96284e85
    /* renamed from: detachFromService */
    public void mo137486x7795a18() {
        if (!m137476xb86ec66c()) {
            io.p3284xd2ae381c.Log.e(TAG, "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#detachFromService");
        try {
            java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28635x1d9c00c9> it = this.f70829x26db82b7.values().iterator();
            while (it.hasNext()) {
                it.next().m137997xac3a6c7a();
            }
            this.f70828x7643c6b5 = null;
            this.f70830x37eb9f1d = null;
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f get(java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f> cls) {
        return this.f70827xe3a677a0.get(cls);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0
    public boolean has(java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f> cls) {
        return this.f70827xe3a677a0.containsKey(cls);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28626xdefe319f
    /* renamed from: onActivityResult */
    public boolean mo137487x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (!m137473xa080ea38()) {
            io.p3284xd2ae381c.Log.e(TAG, "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            boolean m137510x9d4787cb = this.f70816x4483d503.m137510x9d4787cb(i17, i18, intent);
            if (m139423xc9e48c90 != null) {
                m139423xc9e48c90.close();
            }
            return m137510x9d4787cb;
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28636x96284e85
    /* renamed from: onMoveToBackground */
    public void mo137488x260bb479() {
        if (m137476xb86ec66c()) {
            io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#onMoveToBackground");
            try {
                this.f70830x37eb9f1d.m137528x260bb479();
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28636x96284e85
    /* renamed from: onMoveToForeground */
    public void mo137489xebbbc88e() {
        if (m137476xb86ec66c()) {
            io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#onMoveToForeground");
            try {
                this.f70830x37eb9f1d.m137529xebbbc88e();
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28626xdefe319f
    /* renamed from: onNewIntent */
    public void mo137490xc944513d(android.content.Intent intent) {
        if (!m137473xa080ea38()) {
            io.p3284xd2ae381c.Log.e(TAG, "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.f70816x4483d503.m137511xc944513d(intent);
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28626xdefe319f
    /* renamed from: onRequestPermissionsResult */
    public boolean mo137491x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        if (!m137473xa080ea38()) {
            io.p3284xd2ae381c.Log.e(TAG, "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            boolean m137512x953457f1 = this.f70816x4483d503.m137512x953457f1(i17, strArr, iArr);
            if (m139423xc9e48c90 != null) {
                m139423xc9e48c90.close();
            }
            return m137512x953457f1;
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28626xdefe319f
    /* renamed from: onRestoreInstanceState */
    public void mo137492xb949e58d(android.os.Bundle bundle) {
        if (!m137473xa080ea38()) {
            io.p3284xd2ae381c.Log.e(TAG, "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.f70816x4483d503.m137513xb949e58d(bundle);
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28626xdefe319f
    /* renamed from: onSaveInstanceState */
    public void mo137493xa71a2260(android.os.Bundle bundle) {
        if (!m137473xa080ea38()) {
            io.p3284xd2ae381c.Log.e(TAG, "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.f70816x4483d503.m137514xa71a2260(bundle);
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28626xdefe319f
    /* renamed from: onUserLeaveHint */
    public void mo137494xb1e9ab4() {
        if (!m137473xa080ea38()) {
            io.p3284xd2ae381c.Log.e(TAG, "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.f70816x4483d503.m137515xb1e9ab4();
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0
    /* renamed from: remove */
    public void mo137495xc84af884(java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f> cls) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f interfaceC28623x7c9e3e4f = this.f70827xe3a677a0.get(cls);
        if (interfaceC28623x7c9e3e4f == null) {
            return;
        }
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
        try {
            if (interfaceC28623x7c9e3e4f instanceof io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f) {
                if (m137473xa080ea38()) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f) interfaceC28623x7c9e3e4f).mo262x262a05ea();
                }
                this.f70815x6111f811.remove(cls);
            }
            if (interfaceC28623x7c9e3e4f instanceof io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28635x1d9c00c9) {
                if (m137476xb86ec66c()) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3297x7643c6b5.InterfaceC28635x1d9c00c9) interfaceC28623x7c9e3e4f).m137997xac3a6c7a();
                }
                this.f70829x26db82b7.remove(cls);
            }
            if (interfaceC28623x7c9e3e4f instanceof io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3294x2a7d81b0.InterfaceC28628x8bd3728e) {
                if (m137474x818becc7()) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3294x2a7d81b0.InterfaceC28628x8bd3728e) interfaceC28623x7c9e3e4f).m137992xe401d955();
                }
                this.f70818x668ad152.remove(cls);
            }
            if (interfaceC28623x7c9e3e4f instanceof io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3295x51bfb16a.InterfaceC28631xeb788f14) {
                if (m137475xf5416e41()) {
                    ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3295x51bfb16a.InterfaceC28631xeb788f14) interfaceC28623x7c9e3e4f).m137994x69c5264f();
                }
                this.f70821x14313a0c.remove(cls);
            }
            interfaceC28623x7c9e3e4f.mo264x6a0307dd(this.f70826xbdeee7d2);
            this.f70827xe3a677a0.remove(cls);
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

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0
    /* renamed from: removeAll */
    public void mo137497x4c6f0a7d() {
        mo137496xc84af884(new java.util.HashSet(this.f70827xe3a677a0.keySet()));
        this.f70827xe3a677a0.clear();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0
    /* renamed from: remove */
    public void mo137496xc84af884(java.util.Set<java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f>> set) {
        java.util.Iterator<java.lang.Class<? extends io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f>> it = set.iterator();
        while (it.hasNext()) {
            mo137495xc84af884(it.next());
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0
    public void add(java.util.Set<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f> set) {
        java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f> it = set.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }
}

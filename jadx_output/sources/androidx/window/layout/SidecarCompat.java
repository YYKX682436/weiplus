package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 &2\u00020\u0001:\u0005&'()*B\u001d\b\u0007\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\"B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b!\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0017R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010 ¨\u0006+"}, d2 = {"Landroidx/window/layout/SidecarCompat;", "Landroidx/window/layout/ExtensionInterfaceCompat;", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Ljz5/f0;", "registerConfigurationChangeListener", "unregisterComponentCallback", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "extensionCallback", "setExtensionCallback", "Landroidx/window/layout/WindowLayoutInfo;", "getWindowLayoutInfo", "onWindowLayoutChangeListenerAdded", "Landroid/os/IBinder;", "windowToken", "register", "onWindowLayoutChangeListenerRemoved", "", "validateExtensionInterface", "Landroidx/window/sidecar/SidecarInterface;", "sidecar", "Landroidx/window/sidecar/SidecarInterface;", "getSidecar", "()Landroidx/window/sidecar/SidecarInterface;", "Landroidx/window/layout/SidecarAdapter;", "sidecarAdapter", "Landroidx/window/layout/SidecarAdapter;", "", "windowListenerRegisteredContexts", "Ljava/util/Map;", "Landroid/content/ComponentCallbacks;", "componentCallbackMap", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "<init>", "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/SidecarAdapter;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Companion", "DistinctElementCallback", "DistinctSidecarElementCallback", "FirstAttachAdapter", "TranslatingCallback", "window_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes13.dex */
public final class SidecarCompat implements androidx.window.layout.ExtensionInterfaceCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.SidecarCompat.Companion INSTANCE = new androidx.window.layout.SidecarCompat.Companion(null);
    private static final java.lang.String TAG = "SidecarCompat";
    private final java.util.Map<android.app.Activity, android.content.ComponentCallbacks> componentCallbackMap;
    private androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback;
    private final androidx.window.sidecar.SidecarInterface sidecar;
    private final androidx.window.layout.SidecarAdapter sidecarAdapter;
    private final java.util.Map<android.os.IBinder, android.app.Activity> windowListenerRegisteredContexts;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Landroidx/window/layout/SidecarCompat$Companion;", "", "()V", "TAG", "", "sidecarVersion", "Landroidx/window/core/Version;", "getSidecarVersion", "()Landroidx/window/core/Version;", "getActivityWindowToken", "Landroid/os/IBinder;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Landroid/app/Activity;", "getActivityWindowToken$window_release", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final android.os.IBinder getActivityWindowToken$window_release(android.app.Activity activity) {
            android.view.Window window;
            android.view.WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final androidx.window.core.Version getSidecarVersion() {
            try {
                java.lang.String apiVersion = androidx.window.sidecar.SidecarProvider.getApiVersion();
                if (android.text.TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return androidx.window.core.Version.INSTANCE.parse(apiVersion);
            } catch (java.lang.NoClassDefFoundError | java.lang.UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctElementCallback;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Landroidx/window/layout/WindowLayoutInfo;", "newLayout", "Ljz5/f0;", "onWindowLayoutChanged", "callbackInterface", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/WeakHashMap;", "activityWindowLayoutInfo", "Ljava/util/WeakHashMap;", "<init>", "(Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;)V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes13.dex */
    public static final class DistinctElementCallback implements androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface {
        private final java.util.WeakHashMap<android.app.Activity, androidx.window.layout.WindowLayoutInfo> activityWindowLayoutInfo;
        private final androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface;
        private final java.util.concurrent.locks.ReentrantLock lock;

        public DistinctElementCallback(androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface) {
            kotlin.jvm.internal.o.g(callbackInterface, "callbackInterface");
            this.callbackInterface = callbackInterface;
            this.lock = new java.util.concurrent.locks.ReentrantLock();
            this.activityWindowLayoutInfo = new java.util.WeakHashMap<>();
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public void onWindowLayoutChanged(android.app.Activity activity, androidx.window.layout.WindowLayoutInfo newLayout) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(newLayout, "newLayout");
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (kotlin.jvm.internal.o.b(newLayout, this.activityWindowLayoutInfo.get(activity))) {
                    return;
                }
                this.activityWindowLayoutInfo.put(activity, newLayout);
                reentrantLock.unlock();
                this.callbackInterface.onWindowLayoutChanged(activity, newLayout);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Ljz5/f0;", "onDeviceStateChanged", "Landroid/os/IBinder;", "token", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "Landroidx/window/layout/SidecarAdapter;", "sidecarAdapter", "Landroidx/window/layout/SidecarAdapter;", "callbackInterface", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "lastDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "Ljava/util/WeakHashMap;", "mActivityWindowLayoutInfo", "Ljava/util/WeakHashMap;", "<init>", "(Landroidx/window/layout/SidecarAdapter;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes13.dex */
    public static final class DistinctSidecarElementCallback implements androidx.window.sidecar.SidecarInterface.SidecarCallback {
        private final androidx.window.sidecar.SidecarInterface.SidecarCallback callbackInterface;
        private androidx.window.sidecar.SidecarDeviceState lastDeviceState;
        private final java.util.concurrent.locks.ReentrantLock lock;
        private final java.util.WeakHashMap<android.os.IBinder, androidx.window.sidecar.SidecarWindowLayoutInfo> mActivityWindowLayoutInfo;
        private final androidx.window.layout.SidecarAdapter sidecarAdapter;

        public DistinctSidecarElementCallback(androidx.window.layout.SidecarAdapter sidecarAdapter, androidx.window.sidecar.SidecarInterface.SidecarCallback callbackInterface) {
            kotlin.jvm.internal.o.g(sidecarAdapter, "sidecarAdapter");
            kotlin.jvm.internal.o.g(callbackInterface, "callbackInterface");
            this.sidecarAdapter = sidecarAdapter;
            this.callbackInterface = callbackInterface;
            this.lock = new java.util.concurrent.locks.ReentrantLock();
            this.mActivityWindowLayoutInfo = new java.util.WeakHashMap<>();
        }

        public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState newDeviceState) {
            kotlin.jvm.internal.o.g(newDeviceState, "newDeviceState");
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.sidecarAdapter.isEqualSidecarDeviceState(this.lastDeviceState, newDeviceState)) {
                    return;
                }
                this.lastDeviceState = newDeviceState;
                this.callbackInterface.onDeviceStateChanged(newDeviceState);
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(android.os.IBinder token, androidx.window.sidecar.SidecarWindowLayoutInfo newLayout) {
            kotlin.jvm.internal.o.g(token, "token");
            kotlin.jvm.internal.o.g(newLayout, "newLayout");
            synchronized (this.lock) {
                if (this.sidecarAdapter.isEqualSidecarWindowLayoutInfo(this.mActivityWindowLayoutInfo.get(token), newLayout)) {
                    return;
                }
                this.mActivityWindowLayoutInfo.put(token, newLayout);
                this.callbackInterface.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\r\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/window/layout/SidecarCompat$FirstAttachAdapter;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Ljz5/f0;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroidx/window/layout/SidecarCompat;", "sidecarCompat", "Landroidx/window/layout/SidecarCompat;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "kotlin.jvm.PlatformType", "activityWeakReference", "Ljava/lang/ref/WeakReference;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/window/layout/SidecarCompat;Landroid/app/Activity;)V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes13.dex */
    public static final class FirstAttachAdapter implements android.view.View.OnAttachStateChangeListener {
        private final java.lang.ref.WeakReference<android.app.Activity> activityWeakReference;
        private final androidx.window.layout.SidecarCompat sidecarCompat;

        public FirstAttachAdapter(androidx.window.layout.SidecarCompat sidecarCompat, android.app.Activity activity) {
            kotlin.jvm.internal.o.g(sidecarCompat, "sidecarCompat");
            kotlin.jvm.internal.o.g(activity, "activity");
            this.sidecarCompat = sidecarCompat;
            this.activityWeakReference = new java.lang.ref.WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            kotlin.jvm.internal.o.g(view, "view");
            view.removeOnAttachStateChangeListener(this);
            android.app.Activity activity = this.activityWeakReference.get();
            android.os.IBinder activityWindowToken$window_release = androidx.window.layout.SidecarCompat.INSTANCE.getActivityWindowToken$window_release(activity);
            if (activity == null || activityWindowToken$window_release == null) {
                return;
            }
            this.sidecarCompat.register(activityWindowToken$window_release, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            kotlin.jvm.internal.o.g(view, "view");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¨\u0006\r"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Ljz5/f0;", "onDeviceStateChanged", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "<init>", "(Landroidx/window/layout/SidecarCompat;)V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes13.dex */
    public final class TranslatingCallback implements androidx.window.sidecar.SidecarInterface.SidecarCallback {
        final /* synthetic */ androidx.window.layout.SidecarCompat this$0;

        public TranslatingCallback(androidx.window.layout.SidecarCompat this$0) {
            kotlin.jvm.internal.o.g(this$0, "this$0");
            this.this$0 = this$0;
        }

        public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState newDeviceState) {
            androidx.window.sidecar.SidecarInterface sidecar;
            kotlin.jvm.internal.o.g(newDeviceState, "newDeviceState");
            java.util.Collection<android.app.Activity> values = this.this$0.windowListenerRegisteredContexts.values();
            androidx.window.layout.SidecarCompat sidecarCompat = this.this$0;
            for (android.app.Activity activity : values) {
                android.os.IBinder activityWindowToken$window_release = androidx.window.layout.SidecarCompat.INSTANCE.getActivityWindowToken$window_release(activity);
                androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (activityWindowToken$window_release != null && (sidecar = sidecarCompat.getSidecar()) != null) {
                    sidecarWindowLayoutInfo = sidecar.getWindowLayoutInfo(activityWindowToken$window_release);
                }
                androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = sidecarCompat.extensionCallback;
                if (extensionCallbackInterface != null) {
                    extensionCallbackInterface.onWindowLayoutChanged(activity, sidecarCompat.sidecarAdapter.translate(sidecarWindowLayoutInfo, newDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(android.os.IBinder windowToken, androidx.window.sidecar.SidecarWindowLayoutInfo newLayout) {
            kotlin.jvm.internal.o.g(windowToken, "windowToken");
            kotlin.jvm.internal.o.g(newLayout, "newLayout");
            android.app.Activity activity = (android.app.Activity) this.this$0.windowListenerRegisteredContexts.get(windowToken);
            if (activity == null) {
                return;
            }
            androidx.window.layout.SidecarAdapter sidecarAdapter = this.this$0.sidecarAdapter;
            androidx.window.sidecar.SidecarInterface sidecar = this.this$0.getSidecar();
            androidx.window.sidecar.SidecarDeviceState deviceState = sidecar == null ? null : sidecar.getDeviceState();
            if (deviceState == null) {
                deviceState = new androidx.window.sidecar.SidecarDeviceState();
            }
            androidx.window.layout.WindowLayoutInfo translate = sidecarAdapter.translate(newLayout, deviceState);
            androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.this$0.extensionCallback;
            if (extensionCallbackInterface == null) {
                return;
            }
            extensionCallbackInterface.onWindowLayoutChanged(activity, translate);
        }
    }

    public SidecarCompat(androidx.window.sidecar.SidecarInterface sidecarInterface, androidx.window.layout.SidecarAdapter sidecarAdapter) {
        kotlin.jvm.internal.o.g(sidecarAdapter, "sidecarAdapter");
        this.sidecar = sidecarInterface;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new java.util.LinkedHashMap();
        this.componentCallbackMap = new java.util.LinkedHashMap();
    }

    private final void registerConfigurationChangeListener(final android.app.Activity activity) {
        if (this.componentCallbackMap.get(activity) == null) {
            android.content.ComponentCallbacks componentCallbacks = new android.content.ComponentCallbacks() { // from class: androidx.window.layout.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(android.content.res.Configuration newConfig) {
                    kotlin.jvm.internal.o.g(newConfig, "newConfig");
                    androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = androidx.window.layout.SidecarCompat.this.extensionCallback;
                    if (extensionCallbackInterface == null) {
                        return;
                    }
                    android.app.Activity activity2 = activity;
                    extensionCallbackInterface.onWindowLayoutChanged(activity2, androidx.window.layout.SidecarCompat.this.getWindowLayoutInfo(activity2));
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            };
            this.componentCallbackMap.put(activity, componentCallbacks);
            activity.registerComponentCallbacks(componentCallbacks);
        }
    }

    private final void unregisterComponentCallback(android.app.Activity activity) {
        activity.unregisterComponentCallbacks(this.componentCallbackMap.get(activity));
        this.componentCallbackMap.remove(activity);
    }

    public final androidx.window.sidecar.SidecarInterface getSidecar() {
        return this.sidecar;
    }

    public final androidx.window.layout.WindowLayoutInfo getWindowLayoutInfo(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        android.os.IBinder activityWindowToken$window_release = INSTANCE.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return new androidx.window.layout.WindowLayoutInfo(kz5.p0.f313996d);
        }
        androidx.window.sidecar.SidecarInterface sidecarInterface = this.sidecar;
        androidx.window.sidecar.SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(activityWindowToken$window_release);
        androidx.window.layout.SidecarAdapter sidecarAdapter = this.sidecarAdapter;
        androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.sidecar;
        androidx.window.sidecar.SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new androidx.window.sidecar.SidecarDeviceState();
        }
        return sidecarAdapter.translate(windowLayoutInfo, deviceState);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerAdded(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        android.os.IBinder activityWindowToken$window_release = INSTANCE.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            register(activityWindowToken$window_release, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new androidx.window.layout.SidecarCompat.FirstAttachAdapter(this, activity));
        }
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerRemoved(android.app.Activity activity) {
        androidx.window.sidecar.SidecarInterface sidecarInterface;
        kotlin.jvm.internal.o.g(activity, "activity");
        android.os.IBinder activityWindowToken$window_release = INSTANCE.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return;
        }
        androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(activityWindowToken$window_release);
        }
        unregisterComponentCallback(activity);
        boolean z17 = this.windowListenerRegisteredContexts.size() == 1;
        this.windowListenerRegisteredContexts.remove(activityWindowToken$window_release);
        if (!z17 || (sidecarInterface = this.sidecar) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final void register(android.os.IBinder windowToken, android.app.Activity activity) {
        androidx.window.sidecar.SidecarInterface sidecarInterface;
        kotlin.jvm.internal.o.g(windowToken, "windowToken");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.windowListenerRegisteredContexts.put(windowToken, activity);
        androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.extensionCallback;
        if (extensionCallbackInterface != null) {
            extensionCallbackInterface.onWindowLayoutChanged(activity, getWindowLayoutInfo(activity));
        }
        registerConfigurationChangeListener(activity);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void setExtensionCallback(androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback) {
        kotlin.jvm.internal.o.g(extensionCallback, "extensionCallback");
        this.extensionCallback = new androidx.window.layout.SidecarCompat.DistinctElementCallback(extensionCallback);
        androidx.window.sidecar.SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new androidx.window.layout.SidecarCompat.DistinctSidecarElementCallback(this.sidecarAdapter, new androidx.window.layout.SidecarCompat.TranslatingCallback(this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2 A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a6 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0080 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0059 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018a A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0020 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    @Override // androidx.window.layout.ExtensionInterfaceCompat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean validateExtensionInterface() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.validateExtensionInterface():boolean");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(android.content.Context context) {
        this(androidx.window.sidecar.SidecarProvider.getSidecarImpl(context.getApplicationContext()), new androidx.window.layout.SidecarAdapter());
        kotlin.jvm.internal.o.g(context, "context");
    }
}

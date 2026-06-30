package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001f !B\u0013\b\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J&\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Landroidx/window/layout/SidecarWindowBackend;", "Landroidx/window/layout/WindowBackend;", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "", "isActivityRegistered", "Ljz5/f0;", "callbackRemovedForActivity", "Ljava/util/concurrent/Executor;", "executor", "Lm3/a;", "Landroidx/window/layout/WindowLayoutInfo;", "callback", "registerLayoutChangeCallback", "unregisterLayoutChangeCallback", "Landroidx/window/layout/ExtensionInterfaceCompat;", "windowExtension", "Landroidx/window/layout/ExtensionInterfaceCompat;", "getWindowExtension", "()Landroidx/window/layout/ExtensionInterfaceCompat;", "setWindowExtension", "(Landroidx/window/layout/ExtensionInterfaceCompat;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "windowLayoutChangeCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks$annotations", "()V", "<init>", "Companion", "ExtensionListenerImpl", "WindowLayoutChangeCallbackWrapper", "window_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes13.dex */
public final class SidecarWindowBackend implements androidx.window.layout.WindowBackend {
    public static final boolean DEBUG = false;
    private static final java.lang.String TAG = "WindowServer";
    private static volatile androidx.window.layout.SidecarWindowBackend globalInstance;
    private androidx.window.layout.ExtensionInterfaceCompat windowExtension;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> windowLayoutChangeCallbacks = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.SidecarWindowBackend.Companion INSTANCE = new androidx.window.layout.SidecarWindowBackend.Companion(null);
    private static final java.util.concurrent.locks.ReentrantLock globalLock = new java.util.concurrent.locks.ReentrantLock();

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\b\u0010\r\u001a\u00020\fH\u0007R\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$Companion;", "", "Landroid/content/Context;", "context", "Landroidx/window/layout/SidecarWindowBackend;", "getInstance", "Landroidx/window/layout/ExtensionInterfaceCompat;", "initAndVerifyExtension", "Landroidx/window/core/Version;", "sidecarVersion", "", "isSidecarVersionSupported", "Ljz5/f0;", "resetInstance", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "globalInstance", "Landroidx/window/layout/SidecarWindowBackend;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final androidx.window.layout.SidecarWindowBackend getInstance(android.content.Context context) {
            kotlin.jvm.internal.o.g(context, "context");
            if (androidx.window.layout.SidecarWindowBackend.globalInstance == null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = androidx.window.layout.SidecarWindowBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (androidx.window.layout.SidecarWindowBackend.globalInstance == null) {
                        androidx.window.layout.SidecarWindowBackend.globalInstance = new androidx.window.layout.SidecarWindowBackend(androidx.window.layout.SidecarWindowBackend.INSTANCE.initAndVerifyExtension(context));
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            androidx.window.layout.SidecarWindowBackend sidecarWindowBackend = androidx.window.layout.SidecarWindowBackend.globalInstance;
            kotlin.jvm.internal.o.d(sidecarWindowBackend);
            return sidecarWindowBackend;
        }

        public final androidx.window.layout.ExtensionInterfaceCompat initAndVerifyExtension(android.content.Context context) {
            kotlin.jvm.internal.o.g(context, "context");
            try {
                if (!isSidecarVersionSupported(androidx.window.layout.SidecarCompat.INSTANCE.getSidecarVersion())) {
                    return null;
                }
                androidx.window.layout.SidecarCompat sidecarCompat = new androidx.window.layout.SidecarCompat(context);
                if (sidecarCompat.validateExtensionInterface()) {
                    return sidecarCompat;
                }
                return null;
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }

        public final boolean isSidecarVersionSupported(androidx.window.core.Version sidecarVersion) {
            return sidecarVersion != null && sidecarVersion.compareTo(androidx.window.core.Version.INSTANCE.getVERSION_0_1()) >= 0;
        }

        public final void resetInstance() {
            androidx.window.layout.SidecarWindowBackend.globalInstance = null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\n"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$ExtensionListenerImpl;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Landroidx/window/layout/WindowLayoutInfo;", "newLayout", "Ljz5/f0;", "onWindowLayoutChanged", "<init>", "(Landroidx/window/layout/SidecarWindowBackend;)V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes13.dex */
    public final class ExtensionListenerImpl implements androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface {
        final /* synthetic */ androidx.window.layout.SidecarWindowBackend this$0;

        public ExtensionListenerImpl(androidx.window.layout.SidecarWindowBackend this$0) {
            kotlin.jvm.internal.o.g(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public void onWindowLayoutChanged(android.app.Activity activity, androidx.window.layout.WindowLayoutInfo newLayout) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(newLayout, "newLayout");
            java.util.Iterator<androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> it = this.this$0.getWindowLayoutChangeCallbacks().iterator();
            while (it.hasNext()) {
                androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper next = it.next();
                if (kotlin.jvm.internal.o.b(next.getActivity(), activity)) {
                    next.accept(newLayout);
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "", "Landroidx/window/layout/WindowLayoutInfo;", "newLayoutInfo", "Ljz5/f0;", "accept", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "Lm3/a;", "callback", "Lm3/a;", "getCallback", "()Lm3/a;", "lastInfo", "Landroidx/window/layout/WindowLayoutInfo;", "getLastInfo", "()Landroidx/window/layout/WindowLayoutInfo;", "setLastInfo", "(Landroidx/window/layout/WindowLayoutInfo;)V", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Lm3/a;)V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes13.dex */
    public static final class WindowLayoutChangeCallbackWrapper {
        private final android.app.Activity activity;
        private final m3.a callback;
        private final java.util.concurrent.Executor executor;
        private androidx.window.layout.WindowLayoutInfo lastInfo;

        public WindowLayoutChangeCallbackWrapper(android.app.Activity activity, java.util.concurrent.Executor executor, m3.a callback) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(executor, "executor");
            kotlin.jvm.internal.o.g(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: accept$lambda-0, reason: not valid java name */
        public static final void m10accept$lambda0(androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper this$0, androidx.window.layout.WindowLayoutInfo newLayoutInfo) {
            kotlin.jvm.internal.o.g(this$0, "this$0");
            kotlin.jvm.internal.o.g(newLayoutInfo, "$newLayoutInfo");
            this$0.getCallback().accept(newLayoutInfo);
        }

        public final void accept(final androidx.window.layout.WindowLayoutInfo newLayoutInfo) {
            kotlin.jvm.internal.o.g(newLayoutInfo, "newLayoutInfo");
            this.lastInfo = newLayoutInfo;
            this.executor.execute(new java.lang.Runnable() { // from class: androidx.window.layout.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.m10accept$lambda0(androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.this, newLayoutInfo);
                }
            });
        }

        public final android.app.Activity getActivity() {
            return this.activity;
        }

        public final m3.a getCallback() {
            return this.callback;
        }

        public final androidx.window.layout.WindowLayoutInfo getLastInfo() {
            return this.lastInfo;
        }

        public final void setLastInfo(androidx.window.layout.WindowLayoutInfo windowLayoutInfo) {
            this.lastInfo = windowLayoutInfo;
        }
    }

    public SidecarWindowBackend(androidx.window.layout.ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
        androidx.window.layout.ExtensionInterfaceCompat extensionInterfaceCompat2 = this.windowExtension;
        if (extensionInterfaceCompat2 == null) {
            return;
        }
        extensionInterfaceCompat2.setExtensionCallback(new androidx.window.layout.SidecarWindowBackend.ExtensionListenerImpl(this));
    }

    private final void callbackRemovedForActivity(android.app.Activity activity) {
        androidx.window.layout.ExtensionInterfaceCompat extensionInterfaceCompat;
        java.util.concurrent.CopyOnWriteArrayList<androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        boolean z17 = false;
        if (!(copyOnWriteArrayList instanceof java.util.Collection) || !copyOnWriteArrayList.isEmpty()) {
            java.util.Iterator<T> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (kotlin.jvm.internal.o.b(((androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                    z17 = true;
                    break;
                }
            }
        }
        if (z17 || (extensionInterfaceCompat = this.windowExtension) == null) {
            return;
        }
        extensionInterfaceCompat.onWindowLayoutChangeListenerRemoved(activity);
    }

    public static /* synthetic */ void getWindowLayoutChangeCallbacks$annotations() {
    }

    private final boolean isActivityRegistered(android.app.Activity activity) {
        java.util.concurrent.CopyOnWriteArrayList<androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if ((copyOnWriteArrayList instanceof java.util.Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.o.b(((androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                return true;
            }
        }
        return false;
    }

    public final androidx.window.layout.ExtensionInterfaceCompat getWindowExtension() {
        return this.windowExtension;
    }

    public final java.util.concurrent.CopyOnWriteArrayList<androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }

    @Override // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(android.app.Activity activity, java.util.concurrent.Executor executor, m3.a callback) {
        androidx.window.layout.WindowLayoutInfo windowLayoutInfo;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(executor, "executor");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.concurrent.locks.ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            androidx.window.layout.ExtensionInterfaceCompat windowExtension = getWindowExtension();
            if (windowExtension == null) {
                callback.accept(new androidx.window.layout.WindowLayoutInfo(kz5.p0.f313996d));
                return;
            }
            boolean isActivityRegistered = isActivityRegistered(activity);
            androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = new androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper(activity, executor, callback);
            getWindowLayoutChangeCallbacks().add(windowLayoutChangeCallbackWrapper);
            if (isActivityRegistered) {
                java.util.Iterator<T> it = getWindowLayoutChangeCallbacks().iterator();
                while (true) {
                    windowLayoutInfo = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (kotlin.jvm.internal.o.b(activity, ((androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) obj).getActivity())) {
                            break;
                        }
                    }
                }
                androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = (androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) obj;
                if (windowLayoutChangeCallbackWrapper2 != null) {
                    windowLayoutInfo = windowLayoutChangeCallbackWrapper2.getLastInfo();
                }
                if (windowLayoutInfo != null) {
                    windowLayoutChangeCallbackWrapper.accept(windowLayoutInfo);
                }
            } else {
                windowExtension.onWindowLayoutChangeListenerAdded(activity);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setWindowExtension(androidx.window.layout.ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
    }

    @Override // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(m3.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        synchronized (globalLock) {
            if (getWindowExtension() == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> it = getWindowLayoutChangeCallbacks().iterator();
            while (it.hasNext()) {
                androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper next = it.next();
                if (next.getCallback() == callback) {
                    arrayList.add(next);
                }
            }
            getWindowLayoutChangeCallbacks().removeAll(arrayList);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                callbackRemovedForActivity(((androidx.window.layout.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) it6.next()).getActivity());
            }
        }
    }
}

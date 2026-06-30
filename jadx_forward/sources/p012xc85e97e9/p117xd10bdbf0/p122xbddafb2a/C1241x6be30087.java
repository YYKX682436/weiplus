package p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001f !B\u0013\b\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J&\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Landroidx/window/layout/SidecarWindowBackend;", "Landroidx/window/layout/WindowBackend;", "Landroid/app/Activity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "", "isActivityRegistered", "Ljz5/f0;", "callbackRemovedForActivity", "Ljava/util/concurrent/Executor;", "executor", "Lm3/a;", "Landroidx/window/layout/WindowLayoutInfo;", "callback", "registerLayoutChangeCallback", "unregisterLayoutChangeCallback", "Landroidx/window/layout/ExtensionInterfaceCompat;", "windowExtension", "Landroidx/window/layout/ExtensionInterfaceCompat;", "getWindowExtension", "()Landroidx/window/layout/ExtensionInterfaceCompat;", "setWindowExtension", "(Landroidx/window/layout/ExtensionInterfaceCompat;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "windowLayoutChangeCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks$annotations", "()V", "<init>", "Companion", "ExtensionListenerImpl", "WindowLayoutChangeCallbackWrapper", "window_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: androidx.window.layout.SidecarWindowBackend */
/* loaded from: classes13.dex */
public final class C1241x6be30087 implements p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1243x7f37a464 {

    /* renamed from: DEBUG */
    public static final boolean f3913x3de9e33 = false;
    private static final java.lang.String TAG = "WindowServer";

    /* renamed from: globalInstance */
    private static volatile p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087 f3914x16b9a958;
    private p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1233x2fc4d7fc windowExtension;
    private final java.util.concurrent.CopyOnWriteArrayList<p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper> windowLayoutChangeCallbacks = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.Companion INSTANCE = new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.Companion(null);

    /* renamed from: globalLock */
    private static final java.util.concurrent.locks.ReentrantLock f3915xccccb36e = new java.util.concurrent.locks.ReentrantLock();

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\b\u0010\r\u001a\u00020\fH\u0007R\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$Companion;", "", "Landroid/content/Context;", "context", "Landroidx/window/layout/SidecarWindowBackend;", "getInstance", "Landroidx/window/layout/ExtensionInterfaceCompat;", "initAndVerifyExtension", "Landroidx/window/core/Version;", "sidecarVersion", "", "isSidecarVersionSupported", "Ljz5/f0;", "resetInstance", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "globalInstance", "Landroidx/window/layout/SidecarWindowBackend;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: androidx.window.layout.SidecarWindowBackend$Companion, reason: from kotlin metadata */
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: getInstance */
        public final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087 m8610x9cf0d20b(android.content.Context context) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.f3914x16b9a958 == null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.f3915xccccb36e;
                reentrantLock.lock();
                try {
                    if (p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.f3914x16b9a958 == null) {
                        p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.f3914x16b9a958 = new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.INSTANCE.m8611x3f5b9e1f(context));
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087 c1241x6be30087 = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.f3914x16b9a958;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1241x6be30087);
            return c1241x6be30087;
        }

        /* renamed from: initAndVerifyExtension */
        public final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1233x2fc4d7fc m8611x3f5b9e1f(android.content.Context context) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            try {
                if (!m8612xfee3df69(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1239xc09ad4df.INSTANCE.m8595x595ea7f1())) {
                    return null;
                }
                p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1239xc09ad4df c1239xc09ad4df = new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1239xc09ad4df(context);
                if (c1239xc09ad4df.mo8538x5f9c370()) {
                    return c1239xc09ad4df;
                }
                return null;
            } catch (java.lang.Throwable unused) {
                return null;
            }
        }

        /* renamed from: isSidecarVersionSupported */
        public final boolean m8612xfee3df69(p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f.C1197x782db4b8 sidecarVersion) {
            return sidecarVersion != null && sidecarVersion.compareTo(p012xc85e97e9.p117xd10bdbf0.p118x2eaf9f.C1197x782db4b8.INSTANCE.m8385x1fe61ac5()) >= 0;
        }

        /* renamed from: resetInstance */
        public final void m8613xd7185704() {
            p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.f3914x16b9a958 = null;
        }
    }

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\n"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$ExtensionListenerImpl;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "Landroid/app/Activity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Landroidx/window/layout/WindowLayoutInfo;", "newLayout", "Ljz5/f0;", "onWindowLayoutChanged", "<init>", "(Landroidx/window/layout/SidecarWindowBackend;)V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: androidx.window.layout.SidecarWindowBackend$ExtensionListenerImpl */
    /* loaded from: classes13.dex */
    public final class ExtensionListenerImpl implements p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1233x2fc4d7fc.ExtensionCallbackInterface {

        /* renamed from: this$0 */
        final /* synthetic */ p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087 f3918xcbdd23aa;

        public ExtensionListenerImpl(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087 this$0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
            this.f3918xcbdd23aa = this$0;
        }

        @Override // p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1233x2fc4d7fc.ExtensionCallbackInterface
        /* renamed from: onWindowLayoutChanged */
        public void mo8539xa6868dbb(android.app.Activity activity, p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28 newLayout) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newLayout, "newLayout");
            java.util.Iterator<p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper> it = this.f3918xcbdd23aa.m8608x5b659b2e().iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper next = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(next.getActivity(), activity)) {
                    next.m8615xab27b508(newLayout);
                }
            }
        }
    }

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "", "Landroidx/window/layout/WindowLayoutInfo;", "newLayoutInfo", "Ljz5/f0;", "accept", "Landroid/app/Activity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "Lm3/a;", "callback", "Lm3/a;", "getCallback", "()Lm3/a;", "lastInfo", "Landroidx/window/layout/WindowLayoutInfo;", "getLastInfo", "()Landroidx/window/layout/WindowLayoutInfo;", "setLastInfo", "(Landroidx/window/layout/WindowLayoutInfo;)V", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Lm3/a;)V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: androidx.window.layout.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper */
    /* loaded from: classes13.dex */
    public static final class WindowLayoutChangeCallbackWrapper {
        private final android.app.Activity activity;
        private final m3.a callback;
        private final java.util.concurrent.Executor executor;
        private p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28 lastInfo;

        public WindowLayoutChangeCallbackWrapper(android.app.Activity activity, java.util.concurrent.Executor executor, m3.a callback) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(executor, "executor");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: accept$lambda-0 */
        public static final void m8614xf76e93c6(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper this$0, p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28 newLayoutInfo) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newLayoutInfo, "$newLayoutInfo");
            this$0.getCallback().mo3938xab27b508(newLayoutInfo);
        }

        /* renamed from: accept */
        public final void m8615xab27b508(final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28 newLayoutInfo) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newLayoutInfo, "newLayoutInfo");
            this.lastInfo = newLayoutInfo;
            this.executor.execute(new java.lang.Runnable() { // from class: androidx.window.layout.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$a
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper.m8614xf76e93c6(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper.this, newLayoutInfo);
                }
            });
        }

        public final android.app.Activity getActivity() {
            return this.activity;
        }

        public final m3.a getCallback() {
            return this.callback;
        }

        public final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28 getLastInfo() {
            return this.lastInfo;
        }

        /* renamed from: setLastInfo */
        public final void m8619x1f90cee6(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28 c1249xd38bff28) {
            this.lastInfo = c1249xd38bff28;
        }
    }

    public C1241x6be30087(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1233x2fc4d7fc interfaceC1233x2fc4d7fc) {
        this.windowExtension = interfaceC1233x2fc4d7fc;
        p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1233x2fc4d7fc interfaceC1233x2fc4d7fc2 = this.windowExtension;
        if (interfaceC1233x2fc4d7fc2 == null) {
            return;
        }
        interfaceC1233x2fc4d7fc2.mo8537x2fd98562(new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.ExtensionListenerImpl(this));
    }

    /* renamed from: callbackRemovedForActivity */
    private final void m8604x862fd39d(android.app.Activity activity) {
        p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1233x2fc4d7fc interfaceC1233x2fc4d7fc;
        java.util.concurrent.CopyOnWriteArrayList<p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        boolean z17 = false;
        if (!(copyOnWriteArrayList instanceof java.util.Collection) || !copyOnWriteArrayList.isEmpty()) {
            java.util.Iterator<T> it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                    z17 = true;
                    break;
                }
            }
        }
        if (z17 || (interfaceC1233x2fc4d7fc = this.windowExtension) == null) {
            return;
        }
        interfaceC1233x2fc4d7fc.mo8536x34ee9a03(activity);
    }

    /* renamed from: getWindowLayoutChangeCallbacks$annotations */
    public static /* synthetic */ void m8605x780902ae() {
    }

    /* renamed from: isActivityRegistered */
    private final boolean m8606x64aa39bb(android.app.Activity activity) {
        java.util.concurrent.CopyOnWriteArrayList<p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if ((copyOnWriteArrayList instanceof java.util.Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                return true;
            }
        }
        return false;
    }

    public final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1233x2fc4d7fc getWindowExtension() {
        return this.windowExtension;
    }

    /* renamed from: getWindowLayoutChangeCallbacks */
    public final java.util.concurrent.CopyOnWriteArrayList<p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper> m8608x5b659b2e() {
        return this.windowLayoutChangeCallbacks;
    }

    @Override // p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1243x7f37a464
    /* renamed from: registerLayoutChangeCallback */
    public void mo8540x5ea79122(android.app.Activity activity, java.util.concurrent.Executor executor, m3.a callback) {
        p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28 c1249xd38bff28;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(executor, "executor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.concurrent.locks.ReentrantLock reentrantLock = f3915xccccb36e;
        reentrantLock.lock();
        try {
            p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1233x2fc4d7fc windowExtension = getWindowExtension();
            if (windowExtension == null) {
                callback.mo3938xab27b508(new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28(kz5.p0.f395529d));
                return;
            }
            boolean m8606x64aa39bb = m8606x64aa39bb(activity);
            p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper(activity, executor, callback);
            m8608x5b659b2e().add(windowLayoutChangeCallbackWrapper);
            if (m8606x64aa39bb) {
                java.util.Iterator<T> it = m8608x5b659b2e().iterator();
                while (true) {
                    c1249xd38bff28 = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activity, ((p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper) obj).getActivity())) {
                            break;
                        }
                    }
                }
                p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = (p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper) obj;
                if (windowLayoutChangeCallbackWrapper2 != null) {
                    c1249xd38bff28 = windowLayoutChangeCallbackWrapper2.getLastInfo();
                }
                if (c1249xd38bff28 != null) {
                    windowLayoutChangeCallbackWrapper.m8615xab27b508(c1249xd38bff28);
                }
            } else {
                windowExtension.mo8535x984a6f63(activity);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: setWindowExtension */
    public final void m8609x721c396d(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1233x2fc4d7fc interfaceC1233x2fc4d7fc) {
        this.windowExtension = interfaceC1233x2fc4d7fc;
    }

    @Override // p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1243x7f37a464
    /* renamed from: unregisterLayoutChangeCallback */
    public void mo8541x6de6303b(m3.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        synchronized (f3915xccccb36e) {
            if (getWindowExtension() == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper> it = m8608x5b659b2e().iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper next = it.next();
                if (next.getCallback() == callback) {
                    arrayList.add(next);
                }
            }
            m8608x5b659b2e().removeAll(arrayList);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                m8604x862fd39d(((p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.WindowLayoutChangeCallbackWrapper) it6.next()).getActivity());
            }
        }
    }
}

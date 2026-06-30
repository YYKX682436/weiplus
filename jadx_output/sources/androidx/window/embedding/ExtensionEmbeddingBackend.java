package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 .2\u00020\u0001:\u0003./0B\u0013\b\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b-\u0010\u001eJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J,\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\u001c\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u0018\u0010(\u001a\u00060'R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00061"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend;", "Landroidx/window/embedding/EmbeddingBackend;", "", "Landroidx/window/embedding/EmbeddingRule;", "getSplitRules", "rules", "Ljz5/f0;", "setSplitRules", "rule", "registerRule", "unregisterRule", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Ljava/util/concurrent/Executor;", "executor", "Lm3/a;", "", "Landroidx/window/embedding/SplitInfo;", "callback", "registerSplitListenerForActivity", "consumer", "unregisterSplitListenerForActivity", "", "isSplitSupported", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "embeddingExtension", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "getEmbeddingExtension", "()Landroidx/window/embedding/EmbeddingInterfaceCompat;", "setEmbeddingExtension", "(Landroidx/window/embedding/EmbeddingInterfaceCompat;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "splitChangeCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks$annotations", "()V", "Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "splitInfoEmbeddingCallback", "Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "splitRules", "Ljava/util/concurrent/CopyOnWriteArraySet;", "<init>", "Companion", "EmbeddingCallbackImpl", "SplitListenerWrapper", "window_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes14.dex */
public final class ExtensionEmbeddingBackend implements androidx.window.embedding.EmbeddingBackend {
    private static final java.lang.String TAG = "EmbeddingBackend";
    private static volatile androidx.window.embedding.ExtensionEmbeddingBackend globalInstance;
    private androidx.window.embedding.EmbeddingInterfaceCompat embeddingExtension;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper> splitChangeCallbacks;
    private final androidx.window.embedding.ExtensionEmbeddingBackend.EmbeddingCallbackImpl splitInfoEmbeddingCallback;
    private final java.util.concurrent.CopyOnWriteArraySet<androidx.window.embedding.EmbeddingRule> splitRules;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.embedding.ExtensionEmbeddingBackend.Companion INSTANCE = new androidx.window.embedding.ExtensionEmbeddingBackend.Companion(null);
    private static final java.util.concurrent.locks.ReentrantLock globalLock = new java.util.concurrent.locks.ReentrantLock();

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0006J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0017\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$Companion;", "", "()V", "TAG", "", "globalInstance", "Landroidx/window/embedding/ExtensionEmbeddingBackend;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "getInstance", "initAndVerifyEmbeddingExtension", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "isExtensionVersionSupported", "", "extensionVersion", "", "(Ljava/lang/Integer;)Z", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        private final androidx.window.embedding.EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension() {
            try {
                androidx.window.embedding.EmbeddingCompat.Companion companion = androidx.window.embedding.EmbeddingCompat.INSTANCE;
                if (isExtensionVersionSupported(companion.getExtensionApiLevel()) && companion.isEmbeddingAvailable()) {
                    return new androidx.window.embedding.EmbeddingCompat();
                }
                return null;
            } catch (java.lang.Throwable th6) {
                kotlin.jvm.internal.o.m("Failed to load embedding extension: ", th6);
                return null;
            }
        }

        public final androidx.window.embedding.ExtensionEmbeddingBackend getInstance() {
            if (androidx.window.embedding.ExtensionEmbeddingBackend.globalInstance == null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = androidx.window.embedding.ExtensionEmbeddingBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (androidx.window.embedding.ExtensionEmbeddingBackend.globalInstance == null) {
                        androidx.window.embedding.ExtensionEmbeddingBackend.globalInstance = new androidx.window.embedding.ExtensionEmbeddingBackend(androidx.window.embedding.ExtensionEmbeddingBackend.INSTANCE.initAndVerifyEmbeddingExtension());
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            androidx.window.embedding.ExtensionEmbeddingBackend extensionEmbeddingBackend = androidx.window.embedding.ExtensionEmbeddingBackend.globalInstance;
            kotlin.jvm.internal.o.d(extensionEmbeddingBackend);
            return extensionEmbeddingBackend;
        }

        public final boolean isExtensionVersionSupported(java.lang.Integer extensionVersion) {
            return extensionVersion != null && extensionVersion.intValue() >= 1;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "Ljz5/f0;", "onSplitInfoChanged", "lastInfo", "Ljava/util/List;", "getLastInfo", "()Ljava/util/List;", "setLastInfo", "(Ljava/util/List;)V", "<init>", "(Landroidx/window/embedding/ExtensionEmbeddingBackend;)V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes14.dex */
    public final class EmbeddingCallbackImpl implements androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface {
        private java.util.List<androidx.window.embedding.SplitInfo> lastInfo;
        final /* synthetic */ androidx.window.embedding.ExtensionEmbeddingBackend this$0;

        public EmbeddingCallbackImpl(androidx.window.embedding.ExtensionEmbeddingBackend this$0) {
            kotlin.jvm.internal.o.g(this$0, "this$0");
            this.this$0 = this$0;
        }

        public final java.util.List<androidx.window.embedding.SplitInfo> getLastInfo() {
            return this.lastInfo;
        }

        @Override // androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface
        public void onSplitInfoChanged(java.util.List<androidx.window.embedding.SplitInfo> splitInfo) {
            kotlin.jvm.internal.o.g(splitInfo, "splitInfo");
            this.lastInfo = splitInfo;
            java.util.Iterator<androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper> it = this.this$0.getSplitChangeCallbacks().iterator();
            while (it.hasNext()) {
                it.next().accept(splitInfo);
            }
        }

        public final void setLastInfo(java.util.List<androidx.window.embedding.SplitInfo> list) {
            this.lastInfo = list;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "", "", "Landroidx/window/embedding/SplitInfo;", "splitInfoList", "Ljz5/f0;", "accept", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Landroid/app/Activity;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "Lm3/a;", "callback", "Lm3/a;", "getCallback", "()Lm3/a;", "lastValue", "Ljava/util/List;", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Lm3/a;)V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes14.dex */
    public static final class SplitListenerWrapper {
        private final android.app.Activity activity;
        private final m3.a callback;
        private final java.util.concurrent.Executor executor;
        private java.util.List<androidx.window.embedding.SplitInfo> lastValue;

        public SplitListenerWrapper(android.app.Activity activity, java.util.concurrent.Executor executor, m3.a callback) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(executor, "executor");
            kotlin.jvm.internal.o.g(callback, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: accept$lambda-1, reason: not valid java name */
        public static final void m9accept$lambda1(androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper this$0, java.util.List splitsWithActivity) {
            kotlin.jvm.internal.o.g(this$0, "this$0");
            kotlin.jvm.internal.o.g(splitsWithActivity, "$splitsWithActivity");
            this$0.getCallback().accept(splitsWithActivity);
        }

        public final void accept(java.util.List<androidx.window.embedding.SplitInfo> splitInfoList) {
            kotlin.jvm.internal.o.g(splitInfoList, "splitInfoList");
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : splitInfoList) {
                if (((androidx.window.embedding.SplitInfo) obj).contains(this.activity)) {
                    arrayList.add(obj);
                }
            }
            if (kotlin.jvm.internal.o.b(arrayList, this.lastValue)) {
                return;
            }
            this.lastValue = arrayList;
            this.executor.execute(new java.lang.Runnable() { // from class: androidx.window.embedding.ExtensionEmbeddingBackend$SplitListenerWrapper$$a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper.m9accept$lambda1(androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper.this, arrayList);
                }
            });
        }

        public final m3.a getCallback() {
            return this.callback;
        }
    }

    public ExtensionEmbeddingBackend(androidx.window.embedding.EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
        androidx.window.embedding.ExtensionEmbeddingBackend.EmbeddingCallbackImpl embeddingCallbackImpl = new androidx.window.embedding.ExtensionEmbeddingBackend.EmbeddingCallbackImpl(this);
        this.splitInfoEmbeddingCallback = embeddingCallbackImpl;
        this.splitChangeCallbacks = new java.util.concurrent.CopyOnWriteArrayList<>();
        androidx.window.embedding.EmbeddingInterfaceCompat embeddingInterfaceCompat2 = this.embeddingExtension;
        if (embeddingInterfaceCompat2 != null) {
            embeddingInterfaceCompat2.setEmbeddingCallback(embeddingCallbackImpl);
        }
        this.splitRules = new java.util.concurrent.CopyOnWriteArraySet<>();
    }

    public static /* synthetic */ void getSplitChangeCallbacks$annotations() {
    }

    public final androidx.window.embedding.EmbeddingInterfaceCompat getEmbeddingExtension() {
        return this.embeddingExtension;
    }

    public final java.util.concurrent.CopyOnWriteArrayList<androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper> getSplitChangeCallbacks() {
        return this.splitChangeCallbacks;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public java.util.Set<androidx.window.embedding.EmbeddingRule> getSplitRules() {
        return this.splitRules;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public boolean isSplitSupported() {
        return this.embeddingExtension != null;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void registerRule(androidx.window.embedding.EmbeddingRule rule) {
        kotlin.jvm.internal.o.g(rule, "rule");
        if (this.splitRules.contains(rule)) {
            return;
        }
        this.splitRules.add(rule);
        androidx.window.embedding.EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat == null) {
            return;
        }
        embeddingInterfaceCompat.setSplitRules(this.splitRules);
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void registerSplitListenerForActivity(android.app.Activity activity, java.util.concurrent.Executor executor, m3.a callback) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(executor, "executor");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.concurrent.locks.ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            androidx.window.embedding.EmbeddingInterfaceCompat embeddingExtension = getEmbeddingExtension();
            kz5.p0 p0Var = kz5.p0.f313996d;
            if (embeddingExtension == null) {
                callback.accept(p0Var);
                return;
            }
            androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper splitListenerWrapper = new androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper(activity, executor, callback);
            getSplitChangeCallbacks().add(splitListenerWrapper);
            if (this.splitInfoEmbeddingCallback.getLastInfo() != null) {
                java.util.List<androidx.window.embedding.SplitInfo> lastInfo = this.splitInfoEmbeddingCallback.getLastInfo();
                kotlin.jvm.internal.o.d(lastInfo);
                splitListenerWrapper.accept(lastInfo);
            } else {
                splitListenerWrapper.accept(p0Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setEmbeddingExtension(androidx.window.embedding.EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void setSplitRules(java.util.Set<? extends androidx.window.embedding.EmbeddingRule> rules) {
        kotlin.jvm.internal.o.g(rules, "rules");
        this.splitRules.clear();
        this.splitRules.addAll(rules);
        androidx.window.embedding.EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat == null) {
            return;
        }
        embeddingInterfaceCompat.setSplitRules(this.splitRules);
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void unregisterRule(androidx.window.embedding.EmbeddingRule rule) {
        kotlin.jvm.internal.o.g(rule, "rule");
        if (this.splitRules.contains(rule)) {
            this.splitRules.remove(rule);
            androidx.window.embedding.EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat == null) {
                return;
            }
            embeddingInterfaceCompat.setSplitRules(this.splitRules);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        getSplitChangeCallbacks().remove(r2);
     */
    @Override // androidx.window.embedding.EmbeddingBackend
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void unregisterSplitListenerForActivity(m3.a r5) {
        /*
            r4 = this;
            java.lang.String r0 = "consumer"
            kotlin.jvm.internal.o.g(r5, r0)
            java.util.concurrent.locks.ReentrantLock r0 = androidx.window.embedding.ExtensionEmbeddingBackend.globalLock
            r0.lock()
            java.util.concurrent.CopyOnWriteArrayList r1 = r4.getSplitChangeCallbacks()     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L33
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L33
            androidx.window.embedding.ExtensionEmbeddingBackend$SplitListenerWrapper r2 = (androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper) r2     // Catch: java.lang.Throwable -> L33
            m3.a r3 = r2.getCallback()     // Catch: java.lang.Throwable -> L33
            boolean r3 = kotlin.jvm.internal.o.b(r3, r5)     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L12
            java.util.concurrent.CopyOnWriteArrayList r5 = r4.getSplitChangeCallbacks()     // Catch: java.lang.Throwable -> L33
            r5.remove(r2)     // Catch: java.lang.Throwable -> L33
        L2f:
            r0.unlock()
            return
        L33:
            r5 = move-exception
            r0.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.ExtensionEmbeddingBackend.unregisterSplitListenerForActivity(m3.a):void");
    }
}

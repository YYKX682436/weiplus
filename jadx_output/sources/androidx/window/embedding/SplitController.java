package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\u0005J*\u0010\u0014\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u001a\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u0006\u0010\u0017\u001a\u00020\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/window/embedding/SplitController;", "", "", "Landroidx/window/embedding/EmbeddingRule;", "staticRules", "Ljz5/f0;", "setStaticSplitRules", "getSplitRules", "rule", "registerRule", "unregisterRule", "clearRegisteredRules", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Ljava/util/concurrent/Executor;", "executor", "Lm3/a;", "", "Landroidx/window/embedding/SplitInfo;", "consumer", "addSplitListener", "removeSplitListener", "", "isSplitSupported", "Landroidx/window/embedding/EmbeddingBackend;", "embeddingBackend", "Landroidx/window/embedding/EmbeddingBackend;", "staticSplitRules", "Ljava/util/Set;", "<init>", "()V", "Companion", "window_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes14.dex */
public final class SplitController {
    private static volatile androidx.window.embedding.SplitController globalInstance;
    public static final boolean sDebug = false;
    private final androidx.window.embedding.EmbeddingBackend embeddingBackend;
    private java.util.Set<? extends androidx.window.embedding.EmbeddingRule> staticSplitRules;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.embedding.SplitController.Companion INSTANCE = new androidx.window.embedding.SplitController.Companion(null);
    private static final java.util.concurrent.locks.ReentrantLock globalLock = new java.util.concurrent.locks.ReentrantLock();

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/window/embedding/SplitController$Companion;", "", "Landroidx/window/embedding/SplitController;", "getInstance", "Landroid/content/Context;", "context", "", "staticRuleResourceId", "Ljz5/f0;", "initialize", "globalInstance", "Landroidx/window/embedding/SplitController;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "sDebug", "Z", "<init>", "()V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final androidx.window.embedding.SplitController getInstance() {
            if (androidx.window.embedding.SplitController.globalInstance == null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = androidx.window.embedding.SplitController.globalLock;
                reentrantLock.lock();
                try {
                    if (androidx.window.embedding.SplitController.globalInstance == null) {
                        androidx.window.embedding.SplitController.globalInstance = new androidx.window.embedding.SplitController(null);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            androidx.window.embedding.SplitController splitController = androidx.window.embedding.SplitController.globalInstance;
            kotlin.jvm.internal.o.d(splitController);
            return splitController;
        }

        public final void initialize(android.content.Context context, int i17) {
            kotlin.jvm.internal.o.g(context, "context");
            java.util.Set<androidx.window.embedding.EmbeddingRule> parseSplitRules$window_release = new androidx.window.embedding.SplitRuleParser().parseSplitRules$window_release(context, i17);
            androidx.window.embedding.SplitController companion = getInstance();
            if (parseSplitRules$window_release == null) {
                parseSplitRules$window_release = kz5.r0.f314002d;
            }
            companion.setStaticSplitRules(parseSplitRules$window_release);
        }
    }

    public /* synthetic */ SplitController(kotlin.jvm.internal.i iVar) {
        this();
    }

    public static final androidx.window.embedding.SplitController getInstance() {
        return INSTANCE.getInstance();
    }

    public static final void initialize(android.content.Context context, int i17) {
        INSTANCE.initialize(context, i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStaticSplitRules(java.util.Set<? extends androidx.window.embedding.EmbeddingRule> set) {
        this.staticSplitRules = set;
        this.embeddingBackend.setSplitRules(set);
    }

    public final void addSplitListener(android.app.Activity activity, java.util.concurrent.Executor executor, m3.a consumer) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(executor, "executor");
        kotlin.jvm.internal.o.g(consumer, "consumer");
        this.embeddingBackend.registerSplitListenerForActivity(activity, executor, consumer);
    }

    public final void clearRegisteredRules() {
        this.embeddingBackend.setSplitRules(this.staticSplitRules);
    }

    public final java.util.Set<androidx.window.embedding.EmbeddingRule> getSplitRules() {
        return kz5.n0.X0(this.embeddingBackend.getSplitRules());
    }

    public final boolean isSplitSupported() {
        return this.embeddingBackend.isSplitSupported();
    }

    public final void registerRule(androidx.window.embedding.EmbeddingRule rule) {
        kotlin.jvm.internal.o.g(rule, "rule");
        this.embeddingBackend.registerRule(rule);
    }

    public final void removeSplitListener(m3.a consumer) {
        kotlin.jvm.internal.o.g(consumer, "consumer");
        this.embeddingBackend.unregisterSplitListenerForActivity(consumer);
    }

    public final void unregisterRule(androidx.window.embedding.EmbeddingRule rule) {
        kotlin.jvm.internal.o.g(rule, "rule");
        this.embeddingBackend.unregisterRule(rule);
    }

    private SplitController() {
        this.embeddingBackend = androidx.window.embedding.ExtensionEmbeddingBackend.INSTANCE.getInstance();
        this.staticSplitRules = kz5.r0.f314002d;
    }
}

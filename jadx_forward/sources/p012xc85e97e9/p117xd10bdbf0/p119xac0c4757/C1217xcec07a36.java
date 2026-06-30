package p012xc85e97e9.p117xd10bdbf0.p119xac0c4757;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\u0005J*\u0010\u0014\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u001a\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J\u0006\u0010\u0017\u001a\u00020\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/window/embedding/SplitController;", "", "", "Landroidx/window/embedding/EmbeddingRule;", "staticRules", "Ljz5/f0;", "setStaticSplitRules", "getSplitRules", "rule", "registerRule", "unregisterRule", "clearRegisteredRules", "Landroid/app/Activity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Ljava/util/concurrent/Executor;", "executor", "Lm3/a;", "", "Landroidx/window/embedding/SplitInfo;", "consumer", "addSplitListener", "removeSplitListener", "", "isSplitSupported", "Landroidx/window/embedding/EmbeddingBackend;", "embeddingBackend", "Landroidx/window/embedding/EmbeddingBackend;", "staticSplitRules", "Ljava/util/Set;", "<init>", "()V", "Companion", "window_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: androidx.window.embedding.SplitController */
/* loaded from: classes14.dex */
public final class C1217xcec07a36 {

    /* renamed from: globalInstance */
    private static volatile p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36 f3829x16b9a958;

    /* renamed from: sDebug */
    public static final boolean f3831xc82af5a0 = false;
    private final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.InterfaceC1208xcbb6fb5d embeddingBackend;
    private java.util.Set<? extends p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.AbstractC1211xe320fed3> staticSplitRules;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36.Companion INSTANCE = new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36.Companion(null);

    /* renamed from: globalLock */
    private static final java.util.concurrent.locks.ReentrantLock f3830xccccb36e = new java.util.concurrent.locks.ReentrantLock();

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/window/embedding/SplitController$Companion;", "", "Landroidx/window/embedding/SplitController;", "getInstance", "Landroid/content/Context;", "context", "", "staticRuleResourceId", "Ljz5/f0;", "initialize", "globalInstance", "Landroidx/window/embedding/SplitController;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "sDebug", "Z", "<init>", "()V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: androidx.window.embedding.SplitController$Companion, reason: from kotlin metadata */
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: getInstance */
        public final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36 m8472x9cf0d20b() {
            if (p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36.f3829x16b9a958 == null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36.f3830xccccb36e;
                reentrantLock.lock();
                try {
                    if (p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36.f3829x16b9a958 == null) {
                        p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36.f3829x16b9a958 = new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36(null);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36 c1217xcec07a36 = p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36.f3829x16b9a958;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1217xcec07a36);
            return c1217xcec07a36;
        }

        /* renamed from: initialize */
        public final void m8473x33ebcb90(android.content.Context context, int i17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            java.util.Set<p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.AbstractC1211xe320fed3> m8513xccdbd8cc = new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1223x74a1a8d5().m8513xccdbd8cc(context, i17);
            p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36 m8472x9cf0d20b = m8472x9cf0d20b();
            if (m8513xccdbd8cc == null) {
                m8513xccdbd8cc = kz5.r0.f395535d;
            }
            m8472x9cf0d20b.m8464x1e58138d(m8513xccdbd8cc);
        }
    }

    public /* synthetic */ C1217xcec07a36(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this();
    }

    /* renamed from: getInstance */
    public static final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1217xcec07a36 m8462x9cf0d20b() {
        return INSTANCE.m8472x9cf0d20b();
    }

    /* renamed from: initialize */
    public static final void m8463x33ebcb90(android.content.Context context, int i17) {
        INSTANCE.m8473x33ebcb90(context, i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setStaticSplitRules */
    public final void m8464x1e58138d(java.util.Set<? extends p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.AbstractC1211xe320fed3> set) {
        this.staticSplitRules = set;
        this.embeddingBackend.mo8425x76d23ff(set);
    }

    /* renamed from: addSplitListener */
    public final void m8465x4850ecd(android.app.Activity activity, java.util.concurrent.Executor executor, m3.a consumer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(executor, "executor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumer, "consumer");
        this.embeddingBackend.mo8424x58a1a1ed(activity, executor, consumer);
    }

    /* renamed from: clearRegisteredRules */
    public final void m8466xcf31f988() {
        this.embeddingBackend.mo8425x76d23ff(this.staticSplitRules);
    }

    /* renamed from: getSplitRules */
    public final java.util.Set<p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.AbstractC1211xe320fed3> m8467xd948d5f3() {
        return kz5.n0.X0(this.embeddingBackend.mo8421xd948d5f3());
    }

    /* renamed from: isSplitSupported */
    public final boolean m8468xeeea3e7e() {
        return this.embeddingBackend.mo8422xeeea3e7e();
    }

    /* renamed from: registerRule */
    public final void m8469x9a35303f(p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.AbstractC1211xe320fed3 rule) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rule, "rule");
        this.embeddingBackend.mo8423x9a35303f(rule);
    }

    /* renamed from: removeSplitListener */
    public final void m8470x98bb7ca(m3.a consumer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumer, "consumer");
        this.embeddingBackend.mo8427x5ad90c86(consumer);
    }

    /* renamed from: unregisterRule */
    public final void m8471x50df2158(p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.AbstractC1211xe320fed3 rule) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rule, "rule");
        this.embeddingBackend.mo8426x50df2158(rule);
    }

    private C1217xcec07a36() {
        this.embeddingBackend = p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1214xf540197c.INSTANCE.m8446x9cf0d20b();
        this.staticSplitRules = kz5.r0.f395535d;
    }
}

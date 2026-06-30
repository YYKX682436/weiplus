package p012xc85e97e9.p117xd10bdbf0.p119xac0c4757;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/window/embedding/EmbeddingCompat;", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "", "Landroidx/window/embedding/EmbeddingRule;", "rules", "Ljz5/f0;", "setSplitRules", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "embeddingCallback", "setEmbeddingCallback", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "embeddingExtension", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "Landroidx/window/embedding/EmbeddingAdapter;", "adapter", "Landroidx/window/embedding/EmbeddingAdapter;", "<init>", "(Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;Landroidx/window/embedding/EmbeddingAdapter;)V", "()V", "Companion", "window_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: androidx.window.embedding.EmbeddingCompat */
/* loaded from: classes14.dex */
public final class C1209x84f00199 implements p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.InterfaceC1210xf54719e4 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1209x84f00199.Companion INSTANCE = new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1209x84f00199.Companion(null);

    /* renamed from: DEBUG */
    public static final boolean f3807x3de9e33 = true;
    private static final java.lang.String TAG = "EmbeddingCompat";
    private final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1202x9bd59818 adapter;
    private final androidx.window.extensions.embedding.ActivityEmbeddingComponent embeddingExtension;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\r\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/window/embedding/EmbeddingCompat$Companion;", "", "()V", "DEBUG", "", "TAG", "", "embeddingComponent", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "getExtensionApiLevel", "", "()Ljava/lang/Integer;", "isEmbeddingAvailable", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.window.embedding.EmbeddingCompat$Companion, reason: from kotlin metadata */
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: embeddingComponent */
        public final androidx.window.extensions.embedding.ActivityEmbeddingComponent m8431xa8ca4766() {
            androidx.window.extensions.embedding.ActivityEmbeddingComponent activityEmbeddingComponent;
            return (!m8433xa32b47fc() || (activityEmbeddingComponent = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent()) == null) ? new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1213xaa58773() : activityEmbeddingComponent;
        }

        /* renamed from: getExtensionApiLevel */
        public final java.lang.Integer m8432x971eca33() {
            try {
                return java.lang.Integer.valueOf(androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (java.lang.NoClassDefFoundError | java.lang.UnsupportedOperationException unused) {
                return null;
            }
        }

        /* renamed from: isEmbeddingAvailable */
        public final boolean m8433xa32b47fc() {
            try {
                return androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
            } catch (java.lang.NoClassDefFoundError | java.lang.UnsupportedOperationException unused) {
                return false;
            }
        }
    }

    public C1209x84f00199(androidx.window.extensions.embedding.ActivityEmbeddingComponent embeddingExtension, p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1202x9bd59818 adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(embeddingExtension, "embeddingExtension");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.embeddingExtension = embeddingExtension;
        this.adapter = adapter;
    }

    @Override // p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.InterfaceC1210xf54719e4
    /* renamed from: setEmbeddingCallback */
    public void mo8429x6678187a(p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.InterfaceC1210xf54719e4.EmbeddingCallbackInterface embeddingCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(embeddingCallback, "embeddingCallback");
        this.embeddingExtension.setSplitInfoCallback(new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1212x1071cb39(embeddingCallback, this.adapter));
    }

    @Override // p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.InterfaceC1210xf54719e4
    /* renamed from: setSplitRules */
    public void mo8430x76d23ff(java.util.Set<? extends p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.AbstractC1211xe320fed3> rules) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rules, "rules");
        this.embeddingExtension.setEmbeddingRules(this.adapter.m8415x3ec0f14e(rules));
    }

    public C1209x84f00199() {
        this(INSTANCE.m8431xa8ca4766(), new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1202x9bd59818());
    }
}

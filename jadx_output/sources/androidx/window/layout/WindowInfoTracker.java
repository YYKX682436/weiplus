package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/WindowInfoTracker;", "", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Lkotlinx/coroutines/flow/j;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "Companion", "window_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes14.dex */
public interface WindowInfoTracker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.WindowInfoTracker.Companion INSTANCE = androidx.window.layout.WindowInfoTracker.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\u000e\u001a\u00020\fH\u0007R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/window/layout/WindowInfoTracker$Companion;", "", "Landroid/content/Context;", "context", "Landroidx/window/layout/WindowInfoTracker;", "getOrCreate", "Landroidx/window/layout/WindowBackend;", "windowBackend$window_release", "(Landroid/content/Context;)Landroidx/window/layout/WindowBackend;", "windowBackend", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "overridingDecorator", "Ljz5/f0;", "overrideDecorator", "reset", "", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "decorator", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private static final boolean DEBUG = false;
        static final /* synthetic */ androidx.window.layout.WindowInfoTracker.Companion $$INSTANCE = new androidx.window.layout.WindowInfoTracker.Companion();
        private static final java.lang.String TAG = kotlin.jvm.internal.i0.a(androidx.window.layout.WindowInfoTracker.class).g();
        private static androidx.window.layout.WindowInfoTrackerDecorator decorator = androidx.window.layout.EmptyDecorator.INSTANCE;

        private Companion() {
        }

        public final androidx.window.layout.WindowInfoTracker getOrCreate(android.content.Context context) {
            kotlin.jvm.internal.o.g(context, "context");
            return decorator.decorate(new androidx.window.layout.WindowInfoTrackerImpl(androidx.window.layout.WindowMetricsCalculatorCompat.INSTANCE, windowBackend$window_release(context)));
        }

        public final void overrideDecorator(androidx.window.layout.WindowInfoTrackerDecorator overridingDecorator) {
            kotlin.jvm.internal.o.g(overridingDecorator, "overridingDecorator");
            decorator = overridingDecorator;
        }

        public final void reset() {
            decorator = androidx.window.layout.EmptyDecorator.INSTANCE;
        }

        public final androidx.window.layout.WindowBackend windowBackend$window_release(android.content.Context context) {
            kotlin.jvm.internal.o.g(context, "context");
            androidx.window.layout.ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend = null;
            try {
                androidx.window.extensions.layout.WindowLayoutComponent windowLayoutComponent = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                if (windowLayoutComponent != null) {
                    extensionWindowLayoutInfoBackend = new androidx.window.layout.ExtensionWindowLayoutInfoBackend(windowLayoutComponent);
                }
            } catch (java.lang.Throwable unused) {
            }
            return extensionWindowLayoutInfoBackend == null ? androidx.window.layout.SidecarWindowBackend.INSTANCE.getInstance(context) : extensionWindowLayoutInfoBackend;
        }
    }

    static androidx.window.layout.WindowInfoTracker getOrCreate(android.content.Context context) {
        return INSTANCE.getOrCreate(context);
    }

    static void overrideDecorator(androidx.window.layout.WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        INSTANCE.overrideDecorator(windowInfoTrackerDecorator);
    }

    static void reset() {
        INSTANCE.reset();
    }

    kotlinx.coroutines.flow.j windowLayoutInfo(android.app.Activity activity);
}

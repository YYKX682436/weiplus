package p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/WindowInfoTracker;", "", "Landroid/app/Activity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Lkotlinx/coroutines/flow/j;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfo", "Companion", "window_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: androidx.window.layout.WindowInfoTracker */
/* loaded from: classes14.dex */
public interface InterfaceC1244x7222407a {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1244x7222407a.Companion INSTANCE = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1244x7222407a.Companion.f3924x83b00915;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\u000e\u001a\u00020\fH\u0007R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/window/layout/WindowInfoTracker$Companion;", "", "Landroid/content/Context;", "context", "Landroidx/window/layout/WindowInfoTracker;", "getOrCreate", "Landroidx/window/layout/WindowBackend;", "windowBackend$window_release", "(Landroid/content/Context;)Landroidx/window/layout/WindowBackend;", "windowBackend", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "overridingDecorator", "Ljz5/f0;", "overrideDecorator", "reset", "", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "decorator", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: androidx.window.layout.WindowInfoTracker$Companion, reason: from kotlin metadata */
    /* loaded from: classes14.dex */
    public static final class Companion {
        private static final boolean DEBUG = false;

        /* renamed from: $$INSTANCE */
        static final /* synthetic */ p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1244x7222407a.Companion f3924x83b00915 = new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1244x7222407a.Companion();
        private static final java.lang.String TAG = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1244x7222407a.class).g();
        private static p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1245x325100e1 decorator = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1232x518c458e.f3862x4fbc8495;

        private Companion() {
        }

        /* renamed from: getOrCreate */
        public final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1244x7222407a m8625x8dcda235(android.content.Context context) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            return decorator.mo8534x220c2b0d(new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1246x1ddc49ba(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1255x3accddd7.f3941x4fbc8495, m8628x86bc1ed8(context)));
        }

        /* renamed from: overrideDecorator */
        public final void m8626x7aa8c1cf(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1245x325100e1 overridingDecorator) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(overridingDecorator, "overridingDecorator");
            decorator = overridingDecorator;
        }

        /* renamed from: reset */
        public final void m8627x6761d4f() {
            decorator = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1232x518c458e.f3862x4fbc8495;
        }

        /* renamed from: windowBackend$window_release */
        public final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1243x7f37a464 m8628x86bc1ed8(android.content.Context context) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1234xb15a534d c1234xb15a534d = null;
            try {
                androidx.window.extensions.layout.WindowLayoutComponent windowLayoutComponent = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                if (windowLayoutComponent != null) {
                    c1234xb15a534d = new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1234xb15a534d(windowLayoutComponent);
                }
            } catch (java.lang.Throwable unused) {
            }
            return c1234xb15a534d == null ? p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1241x6be30087.INSTANCE.m8610x9cf0d20b(context) : c1234xb15a534d;
        }
    }

    /* renamed from: getOrCreate */
    static p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1244x7222407a m8621x8dcda235(android.content.Context context) {
        return INSTANCE.m8625x8dcda235(context);
    }

    /* renamed from: overrideDecorator */
    static void m8622x7aa8c1cf(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1245x325100e1 interfaceC1245x325100e1) {
        INSTANCE.m8626x7aa8c1cf(interfaceC1245x325100e1);
    }

    /* renamed from: reset */
    static void m8623x6761d4f() {
        INSTANCE.m8627x6761d4f();
    }

    /* renamed from: windowLayoutInfo */
    p3325xe03a0797.p3326xc267989b.p3328x30012e.j mo8518x5c7bb08(android.app.Activity activity);
}

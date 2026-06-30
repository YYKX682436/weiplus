package p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator;", "", "computeCurrentWindowMetrics", "Landroidx/window/layout/WindowMetrics;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "Landroid/app/Activity;", "computeMaximumWindowMetrics", "Companion", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.layout.WindowMetricsCalculator */
/* loaded from: classes3.dex */
public interface InterfaceC1251x464cc9f5 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1251x464cc9f5.Companion INSTANCE = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1251x464cc9f5.Companion.f3937x83b00915;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculator$Companion;", "", "Landroidx/window/layout/WindowMetricsCalculator;", "getOrCreate", "Landroidx/window/layout/WindowMetricsCalculatorDecorator;", "overridingDecorator", "Ljz5/f0;", "overrideDecorator", "reset", "Lkotlin/Function1;", "decorator", "Lyz5/l;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: androidx.window.layout.WindowMetricsCalculator$Companion, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* renamed from: $$INSTANCE */
        static final /* synthetic */ p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1251x464cc9f5.Companion f3937x83b00915 = new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1251x464cc9f5.Companion();
        private static yz5.l decorator = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1252x6e004ee1.f3939x4fbc8495;

        private Companion() {
        }

        /* renamed from: getOrCreate */
        public final p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1251x464cc9f5 m8648x8dcda235() {
            return (p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1251x464cc9f5) decorator.mo146xb9724478(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1255x3accddd7.f3941x4fbc8495);
        }

        /* renamed from: overrideDecorator */
        public final void m8649x7aa8c1cf(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1256x1a39f1c6 overridingDecorator) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(overridingDecorator, "overridingDecorator");
            decorator = new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1253x1c01da75(overridingDecorator);
        }

        /* renamed from: reset */
        public final void m8650x6761d4f() {
            decorator = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1254x46de9375.f3940x4fbc8495;
        }
    }

    /* renamed from: getOrCreate */
    static p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1251x464cc9f5 m8642x8dcda235() {
        return INSTANCE.m8648x8dcda235();
    }

    /* renamed from: overrideDecorator */
    static void m8643x7aa8c1cf(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1256x1a39f1c6 interfaceC1256x1a39f1c6) {
        INSTANCE.m8649x7aa8c1cf(interfaceC1256x1a39f1c6);
    }

    /* renamed from: reset */
    static void m8644x6761d4f() {
        INSTANCE.m8650x6761d4f();
    }

    /* renamed from: computeCurrentWindowMetrics */
    p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1250xcce25e93 mo8645x297b8891(android.app.Activity activity);

    /* renamed from: computeMaximumWindowMetrics */
    p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1250xcce25e93 mo8646x3e6f174a(android.app.Activity activity);
}

package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class o1 implements androidx.compose.ui.platform.k4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewConfiguration f10674a;

    public o1(android.view.ViewConfiguration viewConfiguration) {
        kotlin.jvm.internal.o.g(viewConfiguration, "viewConfiguration");
        this.f10674a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.k4
    public long a() {
        return 40L;
    }

    @Override // androidx.compose.ui.platform.k4
    public float b() {
        return this.f10674a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.k4
    public long c() {
        return android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.k4
    public long d() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.k4
    public long e() {
        float f17 = 48;
        return p2.i.b(f17, f17);
    }
}

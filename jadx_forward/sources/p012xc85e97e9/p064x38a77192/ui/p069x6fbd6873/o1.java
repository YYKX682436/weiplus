package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class o1 implements p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewConfiguration f92207a;

    public o1(android.view.ViewConfiguration viewConfiguration) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewConfiguration, "viewConfiguration");
        this.f92207a = viewConfiguration;
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4
    public long a() {
        return 40L;
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4
    public float b() {
        return this.f92207a.getScaledTouchSlop();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4
    public long c() {
        return android.view.ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4
    public long d() {
        return android.view.ViewConfiguration.getLongPressTimeout();
    }

    @Override // p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4
    public long e() {
        float f17 = 48;
        return p2.i.b(f17, f17);
    }
}

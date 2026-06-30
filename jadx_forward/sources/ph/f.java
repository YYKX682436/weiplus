package ph;

/* loaded from: classes12.dex */
public abstract class f implements ph.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f435796a;

    public f(boolean z17) {
        this.f435796a = z17;
    }

    @Override // ph.g
    public boolean a(ph.c batteryState, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batteryState, "batteryState");
        return !this.f435796a;
    }

    @Override // ph.h
    public boolean b(java.lang.String event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        throw new java.lang.RuntimeException("Use #onStateChanged(BatteryState, String) instead");
    }

    @Override // ph.g
    public boolean c(ph.c batteryState, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batteryState, "batteryState");
        return !this.f435796a;
    }

    @Override // ph.h
    public boolean d(ph.c batteryState, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batteryState, "batteryState");
        return !this.f435796a;
    }

    @Override // ph.g
    public boolean e(ph.c batteryState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batteryState, "batteryState");
        return !this.f435796a;
    }

    @Override // ph.g
    public boolean f(ph.c batteryState, java.lang.String event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batteryState, "batteryState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return !this.f435796a;
    }

    @Override // ph.g
    public boolean g(ph.c batteryState, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batteryState, "batteryState");
        return !this.f435796a;
    }
}

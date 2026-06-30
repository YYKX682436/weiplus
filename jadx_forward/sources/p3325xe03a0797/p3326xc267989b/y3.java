package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class y3 extends p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h0 implements java.lang.Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final long f392239g;

    public y3(long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57.mo48699x76847179(), interfaceC29045xdcb5ca57);
        this.f392239g = j17;
    }

    @Override // p3325xe03a0797.p3326xc267989b.a, p3325xe03a0797.p3326xc267989b.c3
    public java.lang.String W() {
        return super.W() + "(timeMillis=" + this.f392239g + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        y(new p3325xe03a0797.p3326xc267989b.x3("Timed out waiting for " + this.f392239g + " ms", this));
    }
}

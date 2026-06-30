package uh1;

/* loaded from: classes13.dex */
public final class q1 extends uh1.y1 {

    /* renamed from: h, reason: collision with root package name */
    public static final uh1.q1 f509403h = new uh1.q1();

    /* renamed from: i, reason: collision with root package name */
    public static final android.net.NetworkRequest f509404i;

    static {
        android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(build, "build(...)");
        f509404i = build;
    }

    public q1() {
        super(null);
    }

    @Override // uh1.y1
    public android.net.NetworkRequest a() {
        return f509404i;
    }
}

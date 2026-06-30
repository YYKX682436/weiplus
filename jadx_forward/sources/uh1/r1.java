package uh1;

/* loaded from: classes13.dex */
public final class r1 extends uh1.y1 {

    /* renamed from: h, reason: collision with root package name */
    public static final uh1.r1 f509431h = new uh1.r1();

    /* renamed from: i, reason: collision with root package name */
    public static final android.net.NetworkRequest f509432i;

    static {
        android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().addTransportType(1).build();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(build, "build(...)");
        f509432i = build;
    }

    public r1() {
        super(null);
    }

    @Override // uh1.y1
    public android.net.NetworkRequest a() {
        return f509432i;
    }
}

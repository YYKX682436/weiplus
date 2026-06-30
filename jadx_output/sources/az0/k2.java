package az0;

/* loaded from: classes13.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final az0.k2 f15624d = new az0.k2();

    public k2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        tq5.k.a("xeffect_xlog");
        az0.j2 j2Var = az0.j2.f15598a;
        synchronized (a8.a.class) {
            z17 = a8.a.f1946a != null;
        }
        if (!z17) {
            com.tencent.maas.b bVar = new com.tencent.maas.b(j2Var);
            synchronized (a8.a.class) {
                if (a8.a.f1946a != null) {
                    throw new java.lang.IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                a8.a.f1946a = bVar;
            }
        }
        a8.a.a("linkid");
        a8.a.a("ilink_protobuf");
        a8.a.a("ilink2");
        a8.a.a("ilink_network");
        a8.a.a("owl");
        a8.a.a("mmskia");
        a8.a.a("xffmpeg");
        a8.a.a("WeVision");
        a8.a.a("MaasSDK");
        return java.lang.Boolean.TRUE;
    }
}

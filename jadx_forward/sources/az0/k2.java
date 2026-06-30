package az0;

/* loaded from: classes13.dex */
public final class k2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final az0.k2 f97157d = new az0.k2();

    public k2() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        tq5.k.a("xeffect_xlog");
        az0.j2 j2Var = az0.j2.f97131a;
        synchronized (a8.a.class) {
            z17 = a8.a.f83479a != null;
        }
        if (!z17) {
            com.p314xaae8f345.p457x3304c6.b bVar = new com.p314xaae8f345.p457x3304c6.b(j2Var);
            synchronized (a8.a.class) {
                if (a8.a.f83479a != null) {
                    throw new java.lang.IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                a8.a.f83479a = bVar;
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

package dd5;

/* loaded from: classes9.dex */
public final class h2 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.h2 f310694b = new dd5.h2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f310695c = dd5.f2.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f310696d = dd5.e2.f310657p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f310697e = kz5.z.D0(new java.lang.Integer[]{76, 92, 3});

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f310698f = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f310698f;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f310695c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f310696d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        return kz5.c0.i(76, 92, 3).contains(java.lang.Integer.valueOf(simpleMsgInfo.m75939xb282bd08(simpleMsgInfo.f427150d + 5)));
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && f310697e.contains(java.lang.Integer.valueOf(i18)));
    }
}

package dd5;

/* loaded from: classes9.dex */
public final class z extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.z f310880b = new dd5.z();

    /* renamed from: c, reason: collision with root package name */
    public static final ad5.l0[] f310881c = {ad5.f.f84782a, ad5.d.f84775a};

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Class f310882d = dd5.x.class;

    /* renamed from: e, reason: collision with root package name */
    public static final uc5.n f310883e = dd5.w.f310855p;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f310884f = kz5.z.D0(new java.lang.Integer[]{115, 124});

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f310885g = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f310885g;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f310882d;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f310883e;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        return kz5.c0.i(115, 124).contains(java.lang.Integer.valueOf(simpleMsgInfo.m75939xb282bd08(simpleMsgInfo.f427150d + 5)));
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && f310884f.contains(java.lang.Integer.valueOf(i18)));
    }
}

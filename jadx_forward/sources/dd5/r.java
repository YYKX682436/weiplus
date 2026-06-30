package dd5;

/* loaded from: classes9.dex */
public final class r extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.r f310800b = new dd5.r();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f310801c = dd5.p.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f310802d = dd5.o.f310766p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f310803e = kz5.z.D0(new java.lang.Integer[]{42, 66});

    @Override // uc5.p
    public java.util.Set b() {
        return f310803e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f310801c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f310802d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        int i17 = simpleMsgInfo.f427150d;
        return simpleMsgInfo.m75939xb282bd08(i17 + 4) == 42 || simpleMsgInfo.m75939xb282bd08(i17 + 4) == 66;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 42 || i17 == 66);
    }
}

package dd5;

/* loaded from: classes9.dex */
public final class z2 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.z2 f310894b = new dd5.z2();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f310895c = dd5.y2.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f310896d = dd5.x2.f310868p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f310897e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f310897e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f310895c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f310896d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        int i17 = simpleMsgInfo.f427150d;
        return simpleMsgInfo.m75939xb282bd08(i17 + 5) == 5 || simpleMsgInfo.m75939xb282bd08(i17 + 5) == 4;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && (i18 == 5 || i18 == 4));
    }
}

package dd5;

/* loaded from: classes9.dex */
public final class j0 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.j0 f310710b = new dd5.j0();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f310711c = dd5.i0.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f310712d = dd5.h0.f310692p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f310713e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f310713e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f310711c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f310712d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        int i17 = simpleMsgInfo.f427150d;
        return simpleMsgInfo.m75939xb282bd08(i17 + 5) == 26 || simpleMsgInfo.m75939xb282bd08(i17 + 5) == 97;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        return java.lang.Boolean.valueOf(i17 == 49 && (i18 == 26 || i18 == 97));
    }
}

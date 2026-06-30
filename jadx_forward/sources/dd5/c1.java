package dd5;

/* loaded from: classes9.dex */
public final class c1 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.c1 f310633b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f310634c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f310635d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f310636e;

    static {
        dd5.c1 c1Var = new dd5.c1();
        f310633b = c1Var;
        f310634c = dd5.a1.class;
        f310635d = new dd5.c(c1Var.f508072a);
        f310636e = kz5.z.D0(new java.lang.Integer[]{754974769, 1241514033, 1174405169});
    }

    @Override // uc5.p
    public java.util.Set b() {
        return f310636e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f310634c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f310635d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        int i17 = simpleMsgInfo.f427150d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f(simpleMsgInfo.m75939xb282bd08(i17 + 4) & 65535, simpleMsgInfo.m75939xb282bd08(i17 + 5)), java.lang.Boolean.FALSE)) {
            return false;
        }
        java.lang.String m75945x2fec8307 = simpleMsgInfo.m75945x2fec8307(i17 + 13);
        if (!(!r26.n0.N(m75945x2fec8307))) {
            m75945x2fec8307 = null;
        }
        if (m75945x2fec8307 == null) {
            return false;
        }
        return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ok(m75945x2fec8307, simpleMsgInfo.m75942xfb822ef2(i17 + 0), simpleMsgInfo.m75945x2fec8307(i17 + 3)) != null;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        if (i17 != 49) {
            return java.lang.Boolean.FALSE;
        }
        return java.lang.Boolean.valueOf(i18 == 51 || i18 == 129 || i18 == 106);
    }
}

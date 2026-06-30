package dd5;

/* loaded from: classes9.dex */
public final class n extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.n f310755b = new dd5.n();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f310756c = dd5.l.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f310757d = dd5.k.f310720p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f310758e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f310758e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f310756c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f310757d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        int i17 = simpleMsgInfo.f427150d;
        if (simpleMsgInfo.m75939xb282bd08(i17 + 5) != 33 && simpleMsgInfo.m75939xb282bd08(i17 + 5) != 36) {
            return false;
        }
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(simpleMsgInfo.m75945x2fec8307(i17 + 13));
        s05.d dVar = (s05.d) bVar.m75936x14adae67(bVar.f513848e + 39);
        return dVar != null && dVar.m163514xfb85f7b0() == 1;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        if (i17 != 49) {
            return java.lang.Boolean.FALSE;
        }
        if (i18 == 33 || i18 == 36) {
            return null;
        }
        return java.lang.Boolean.FALSE;
    }
}

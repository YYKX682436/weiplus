package dd5;

/* loaded from: classes9.dex */
public final class d0 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.d0 f310643b = new dd5.d0();

    /* renamed from: c, reason: collision with root package name */
    public static final ad5.l0[] f310644c = {ad5.f.f84782a, ad5.q.f84827a, ad5.d.f84775a};

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Class f310645d = dd5.b0.class;

    /* renamed from: e, reason: collision with root package name */
    public static final uc5.n f310646e = dd5.a0.f310615p;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f310647f = kz5.o1.c(47);

    @Override // uc5.p
    public java.util.Set b() {
        return f310647f;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f310645d;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f310646e;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        if (simpleMsgInfo.m75939xb282bd08(simpleMsgInfo.f427150d + 4) != 47) {
            return false;
        }
        java.lang.String j17 = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).pj((oi3.e) simpleMsgInfo).j();
        if (j17 == null) {
            return false;
        }
        java.util.List f07 = r26.n0.f0(j17, new java.lang.String[]{":"}, false, 0, 6, null);
        if (f07.size() <= 3) {
            return false;
        }
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Di((java.lang.String) f07.get(3)) != null;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        if (i17 != 47) {
            return java.lang.Boolean.FALSE;
        }
        return null;
    }
}

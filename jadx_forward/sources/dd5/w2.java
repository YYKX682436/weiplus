package dd5;

/* loaded from: classes9.dex */
public final class w2 extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.w2 f310858b = new dd5.w2();

    /* renamed from: c, reason: collision with root package name */
    public static final ad5.l0[] f310859c = {ad5.f.f84782a, ad5.d.f84775a};

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Class f310860d = dd5.u2.class;

    /* renamed from: e, reason: collision with root package name */
    public static final uc5.n f310861e = dd5.t2.f310827p;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f310862f = kz5.c0.i(java.lang.Integer.valueOf(java.lang.Integer.parseInt("1001")), java.lang.Integer.valueOf(java.lang.Integer.parseInt("1002")), java.lang.Integer.valueOf(java.lang.Integer.parseInt("1005")));

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f310863g = kz5.z.D0(new java.lang.Integer[]{2000, 2001});

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f310864h = kz5.z.D0(new java.lang.Integer[]{419430449, 436207665, 536870961, 536936497, 469762097, 503316529});

    @Override // uc5.p
    public java.util.Set b() {
        return f310864h;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f310860d;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f310861e;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(simpleMsgInfo, "simpleMsgInfo");
        int i17 = simpleMsgInfo.f427150d;
        java.lang.String m75945x2fec8307 = simpleMsgInfo.m75945x2fec8307(i17 + 13);
        boolean z17 = true;
        if (!(!r26.n0.N(m75945x2fec8307))) {
            m75945x2fec8307 = null;
        }
        if (m75945x2fec8307 == null) {
            return false;
        }
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(m75945x2fec8307);
        b15.c cVar = (b15.c) bVar.m75936x14adae67(bVar.f513848e + 31);
        if (cVar == null) {
            return false;
        }
        if (simpleMsgInfo.m75939xb282bd08(i17 + 5) != 2000) {
            java.lang.String w17 = cVar.w();
            return kz5.n0.O(f310862f, w17 != null ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(w17)) : null);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6255xde73125b c6255xde73125b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6255xde73125b();
        c6255xde73125b.f136504g.f89954a = cVar.y();
        c6255xde73125b.e();
        int m75939xb282bd08 = simpleMsgInfo.m75939xb282bd08(i17 + 9);
        am.z10 z10Var = c6255xde73125b.f136505h;
        if (m75939xb282bd08 == 1) {
            z17 = z10Var.f90039b;
        } else if (z10Var.f90039b) {
            z17 = false;
        }
        if (z10Var.f90038a == -2) {
            return false;
        }
        return z17;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        if (i17 == 49 && f310863g.contains(java.lang.Integer.valueOf(i18))) {
            return null;
        }
        return java.lang.Boolean.FALSE;
    }
}

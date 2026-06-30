package oo1;

/* loaded from: classes5.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final oo1.f f428675d = new oo1.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (!r26.n0.C(username, ',', false, 2, null) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.X3(username) && !r26.i0.n(username, "@stranger", false)) {
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }
}

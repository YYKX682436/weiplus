package ub5;

/* loaded from: classes5.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ub5.h f507763d = new ub5.h();

    public h() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 it = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.k2()) {
            l15.c cVar = new l15.c();
            java.lang.String U1 = it.U1();
            if (U1 == null) {
                U1 = "";
            }
            cVar.m126728xdc93280d(U1);
            v05.b k17 = cVar.k();
            if (k17 != null) {
                int i18 = k17.f449898d;
                if (k17.m75939xb282bd08(i18 + 6) == 5) {
                    i17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(k17.m75945x2fec8307(i18 + 9)) ? 1 : 2;
                    return "{\"msgid\":" + it.I0() + ";\"msg_type\":" + g95.e0.e(it) + ";\"inner_msg_type\":" + g95.e0.b(it) + ";\"send_time\":" + it.mo78012x3fdd41df() + ";\"url_type\":" + i17 + '}';
                }
            }
        }
        i17 = 0;
        return "{\"msgid\":" + it.I0() + ";\"msg_type\":" + g95.e0.e(it) + ";\"inner_msg_type\":" + g95.e0.b(it) + ";\"send_time\":" + it.mo78012x3fdd41df() + ";\"url_type\":" + i17 + '}';
    }
}

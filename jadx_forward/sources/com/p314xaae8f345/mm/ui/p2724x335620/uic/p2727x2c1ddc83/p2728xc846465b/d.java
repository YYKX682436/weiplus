package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.d f290816d = new com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.d();

    public d() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 it = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (g95.e0.b(it) == 5) {
            l15.c cVar = new l15.c();
            java.lang.String U1 = it.U1();
            if (U1 == null) {
                U1 = "";
            }
            cVar.m126728xdc93280d(U1);
            v05.b k17 = cVar.k();
            if (k17 != null) {
                java.lang.String m75945x2fec8307 = k17.m75945x2fec8307(k17.f513848e + 0);
                if (r26.n0.N(m75945x2fec8307)) {
                    m75945x2fec8307 = k17.m75945x2fec8307(k17.f449898d + 9);
                }
                if (r26.n0.D(m75945x2fec8307, "mp.weixin.qq.com", false, 2, null)) {
                    str = ";\"url_type\":1";
                }
            }
            str = ";\"url_type\":2";
        } else {
            str = ";\"url_type\":0";
        }
        return "{\"msgid\":" + it.I0() + ";\"msg_type\":" + g95.e0.e(it) + ";\"inner_msg_type\":" + g95.e0.b(it) + ";\"send_time\":" + it.mo78012x3fdd41df() + str + '}';
    }
}

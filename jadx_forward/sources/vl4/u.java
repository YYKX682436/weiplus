package vl4;

/* loaded from: classes11.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final vl4.u f519437a = new vl4.u();

    public final jm4.n2 a() {
        jm4.u2 a17 = jm4.w2.f381968d.a();
        if (a17 == null) {
            return null;
        }
        return ((jm4.w2) a17).d(bw5.eq0.TingChatRoom);
    }

    public final boolean b(jm4.n2 n2Var) {
        jm4.g3 f17;
        if (n2Var == null) {
            n2Var = a();
        }
        jm4.d1 p17 = (n2Var == null || (f17 = ((jm4.p2) n2Var).f()) == null) ? null : ((jm4.h3) f17).p();
        bw5.o50 a17 = p17 != null ? ((jm4.e1) p17).a() : null;
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TingChatRoomUtil", "gotoTingChatRoom: chatRoomCategoryId is null");
            pm0.v.X(vl4.t.f519436d);
            return false;
        }
        bw5.o50 o50Var = new bw5.o50();
        o50Var.i(a17.c());
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        qk.f9.a(aj6, context, o50Var, null, false, null, 28, null);
        return true;
    }

    public final boolean c(jm4.n2 n2Var) {
        jm4.z2 z2Var;
        jm4.k3 k3Var;
        if (n2Var == null) {
            return false;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        jm4.g3 f17 = ((jm4.p2) n2Var).f();
        java.lang.String str = null;
        if (f17 != null && (z2Var = (jm4.z2) p3380x6a61f93.p3381xf512d0a5.C30495x21b91836.m169369x21b488b2(((jm4.h3) f17).m105978x2737f10())) != null && (k3Var = (jm4.k3) p3380x6a61f93.p3381xf512d0a5.C30411x21b15b29.m168663x21b4ae47(((jm4.a3) z2Var).m105978x2737f10())) != null) {
            byte[] m168946x21b0d9e9 = p3380x6a61f93.p3381xf512d0a5.C30437x21b323b2.m168946x21b0d9e9(((jm4.m3) k3Var).m105978x2737f10());
            bw5.p90 p90Var = m168946x21b0d9e9 != null ? (bw5.p90) jm4.r5.b(m168946x21b0d9e9, new bw5.p90()) : null;
            if (p90Var != null) {
                bw5.mc0 mc0Var = p90Var.A[9] ? p90Var.f113048o : new bw5.mc0();
                if (mc0Var != null) {
                    str = mc0Var.m12488x6c03c64c();
                }
            }
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, e17);
    }
}

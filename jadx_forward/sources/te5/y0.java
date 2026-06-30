package te5;

/* loaded from: classes5.dex */
public abstract class y0 {
    public static final java.lang.String a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d d76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null || (d76 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6.d7(v17.f430199i, f9Var.m124847x74d37ac6(), f9Var.Q0(), v17.f430227p, f9Var.j())) == null) {
            return null;
        }
        return d76.f68099xfeae815;
    }

    public static final boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f9Var, "<this>");
        boolean c17 = ez.v0.f339310a.c(f9Var, null);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgInfo", "isMessageExpired, msgId=" + f9Var.m124847x74d37ac6() + ", msgSvrId=" + f9Var.I0() + ", talker=" + f9Var.Q0() + ", isExpired=" + c17);
        }
        return c17;
    }
}

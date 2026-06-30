package hc2;

/* loaded from: classes2.dex */
public abstract class w {
    public static final com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb a(r45.t11 t11Var) {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Di;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t11Var, "<this>");
        java.lang.String m75945x2fec8307 = t11Var.m75945x2fec8307(0);
        r45.ri0 ri0Var = (r45.ri0) t11Var.m75936x14adae67(1);
        if (m75945x2fec8307 == null || ri0Var == null) {
            return null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, ri0Var.f466419d)) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            Di = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6) c17)).Di(ri0Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderEmojiInfo.toIEmojiInfo", "md5 not match: md5=" + m75945x2fec8307 + ", protoEmoji.Md5=" + ri0Var.f466419d);
            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            Di = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6) c18)).Bi(m75945x2fec8307, null);
        }
        return Di;
    }
}

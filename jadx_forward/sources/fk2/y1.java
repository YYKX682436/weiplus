package fk2;

/* loaded from: classes2.dex */
public final class y1 {
    public y1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.content.Context context, r45.gj1 payload, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 finallyUserMessage) {
        java.lang.String m75945x2fec8307;
        int L;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payload, "payload");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finallyUserMessage, "finallyUserMessage");
        r45.ze2 ze2Var = (r45.ze2) payload.m75936x14adae67(0);
        if (ze2Var == null || (m75945x2fec8307 = ze2Var.m75945x2fec8307(2)) == null || (L = r26.n0.L(finallyUserMessage, m75945x2fec8307, 0, false, 6, null)) < 0 || m75945x2fec8307.length() + L > finallyUserMessage.length()) {
            return;
        }
        finallyUserMessage.c(new fk2.x1(context, payload), L, m75945x2fec8307.length() + L, 33);
    }
}

package v24;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final v24.c f514436a = new v24.c();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f514437b;

    public final boolean a() {
        java.lang.Boolean bool = f514437b;
        if (bool != null) {
            return bool.booleanValue();
        }
        android.database.Cursor B = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().B(1, new java.util.ArrayList(), "*", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getNecessaryCursorWithConversation(...)");
        while (B.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
            l4Var.mo9015xbf5d97fd(B);
            if (l4Var.w0() > c01.id.c()) {
                B.close();
                ot5.g.c("MicroMsg.ChatMsgTimeFixer", "[getWrongConversation] collect wrong conversation: " + l4Var.h1() + ' ' + l4Var.w0());
                f514437b = java.lang.Boolean.TRUE;
                return true;
            }
        }
        B.close();
        f514437b = java.lang.Boolean.FALSE;
        return false;
    }
}

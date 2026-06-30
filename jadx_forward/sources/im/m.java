package im;

/* loaded from: classes9.dex */
public final class m implements com.p314xaae8f345.mm.p944x882e457a.j1 {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f373692d;

    static {
        new im.l(null);
        f373692d = jz5.h.b(im.k.f373691d);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i18 == 0 || !(m1Var instanceof w11.r0)) {
            return;
        }
        long j17 = ((w11.r0) m1Var).f523650f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        if (str == null) {
            str = "";
        }
        pm0.v.O("AndroidSendMsgFailReport", new im.j(j17, new jz5.o(valueOf, valueOf2, str)));
    }
}

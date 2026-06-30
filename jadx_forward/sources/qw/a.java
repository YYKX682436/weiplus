package qw;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final qw.a f448584a = new qw.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f448585b = {"gh_43f2581f6fd6", "gh_3dfda90e39d6", "gh_b4af18eac3d5", "gh_f0a92aa7146c", "gh_e087bb5b95e6", "gh_579db1f2cf89", "gh_25d9ac85a4bc", "gh_22b87fa7cb3c", "gh_6e99ff560306", "notifymessage", "qqmail", "qmessage", "tmessage", "floatbottle", "facebookapp", "qqfriend", "newsapp", "feedsapp", "masssendapp", "blogapp", "voipapp", "voicevoipapp", "voiceinputapp", "googlecontact", "fmessage", "medianote", "qqsync", "lbsapp", "shakeapp", "linkedinplugin", "weixin", "gh_051d9102de63"};

    public final boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, int i17, int i18) {
        ot0.r0 i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.mo78013xfb85f7b0() == 34 || msg.mo78013xfb85f7b0() == 3 || msg.mo78013xfb85f7b0() == 1 || msg.mo78013xfb85f7b0() == 452984881 || msg.mo78013xfb85f7b0() == 520093745 || msg.mo78013xfb85f7b0() == 369098801 || msg.mo78013xfb85f7b0() == 452984881 || msg.mo78013xfb85f7b0() == 520093745 || msg.mo78013xfb85f7b0() == 754974769 || msg.mo78013xfb85f7b0() == 1241514033 || msg.mo78013xfb85f7b0() == 979370033) {
            return false;
        }
        return (i17 == 3 || i18 == 9 || i18 == 15 || i18 == 17) && msg.t2() && (i19 = com.p314xaae8f345.mm.p2621x8fb0427b.c2.i(msg)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(i19.f430114i);
    }

    public final boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(msg.Q0(), "getTalker(...)");
        if (!yo.a.b(f448585b, r0)) {
            java.lang.String Q0 = msg.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(Q0, true);
            if (!(n17 == null ? false : n17.w2())) {
                return true;
            }
        }
        return false;
    }
}

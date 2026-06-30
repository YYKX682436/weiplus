package p3380x6a61f93.p3383xf5152754;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0012"}, d2 = {"Lurgen/ur_54A4/URS_3370;", "", "", dm.i4.f66863x30b5ef64, "", "commentScene", "duration", "Ljz5/f0;", "UR_F09B", "", "UR_FB2E", "UR_6826", dm.i4.f66875xa013b0d5, "UR_4141", "cmdId", "UR_053C", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: urgen.ur_54A4.URS_3370 */
/* loaded from: classes2.dex */
public final class C30537x277ca82 {

    /* renamed from: INSTANCE */
    public static final p3380x6a61f93.p3383xf5152754.C30537x277ca82 f77134x4fbc8495 = new p3380x6a61f93.p3383xf5152754.C30537x277ca82();

    private C30537x277ca82() {
    }

    /* renamed from: UR_053C */
    public static final byte[] m169738x21b06797(int cmdId, int commentScene) {
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, java.lang.Integer.valueOf(commentScene));
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        bw5.c30 c30Var = new bw5.c30();
        bw5.sc scVar = new bw5.sc();
        db2.t4 t4Var = db2.t4.f309704a;
        c30Var.f107432d = scVar.mo11468x92b714fd(t4Var.b(cmdId, qt2Var).mo14344x5f01b1f6());
        boolean[] zArr = c30Var.f107436h;
        zArr[1] = true;
        c30Var.f107435g = new bw5.hd().mo11468x92b714fd(t4Var.n().mo14344x5f01b1f6());
        zArr[4] = true;
        c30Var.f107433e = ((java.lang.Number) P6.f384366d).floatValue();
        zArr[2] = true;
        c30Var.f107434f = ((java.lang.Number) P6.f384367e).floatValue();
        zArr[3] = true;
        byte[] mo14344x5f01b1f6 = c30Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        return mo14344x5f01b1f6;
    }

    /* renamed from: UR_4141 */
    public static final java.lang.String m169739x21b22a1c(java.lang.String username) {
        java.lang.String g27;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        if (n17 == null) {
            return "";
        }
        if (n17.g2() == null) {
            g27 = n17.f2();
            str = "getDisplayNick(...)";
        } else {
            g27 = n17.g2();
            str = "getDisplayRemark(...)";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g27, str);
        return g27;
    }

    /* renamed from: UR_6826 */
    public static final java.lang.String m169740x21b32ce8() {
        ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
        java.lang.String c17 = b52.b.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getFinderCurTabContextId(...)");
        return c17;
    }

    /* renamed from: UR_F09B */
    public static final void m169741x21ba55b5(byte[] finderObject, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        if (finderObject.length == 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).a(new qg3.j(finderObject, i17, i18));
    }

    /* renamed from: UR_FB2E */
    public static final java.lang.String m169742x21ba9871() {
        ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
        java.lang.String b17 = b52.b.b();
        return b17 == null ? "" : b17;
    }
}

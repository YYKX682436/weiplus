package zl2;

/* loaded from: classes3.dex */
public final class h4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final zl2.h4 f555339d = new zl2.h4();

    public h4() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, int] */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_SUPPORT_HEVC_ENC_INT_SYNC;
        java.lang.Object m17 = c17.m(u3Var, -1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        zl2.q4 q4Var = zl2.q4.f555466a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtil2", "deviceSupportHevcEncForLive supportHevc:" + intValue);
        if (intValue == -1) {
            ?? wi6 = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).wi(5);
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf((int) wi6));
            i17 = wi6;
        } else {
            ((ku5.t0) ku5.t0.f394148d).g(zl2.g4.f555322d);
            i17 = intValue;
        }
        return java.lang.Boolean.valueOf(i17 == 1);
    }
}

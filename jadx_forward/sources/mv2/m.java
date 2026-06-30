package mv2;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final mv2.m f413138a = new mv2.m();

    public final boolean a(java.lang.String username) {
        r45.mr4 mr4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        m92.b j37 = g92.a.j3(g92.b.f351302e, username, false, 2, null);
        int m75939xb282bd08 = (j37 == null || (mr4Var = (r45.mr4) j37.u0().m75936x14adae67(37)) == null) ? 0 : mr4Var.m75939xb282bd08(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209442r4).mo141623x754a37bb()).r()).intValue() == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostChecker", "checkSupportAudio isShowAudioLink:" + m75939xb282bd08 + ", debugOk:" + z17);
        return z17 || m75939xb282bd08 == 1;
    }

    public final boolean b(java.lang.String username) {
        r45.mr4 mr4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        m92.b j37 = g92.a.j3(g92.b.f351302e, username, false, 2, null);
        int m75939xb282bd08 = (j37 == null || (mr4Var = (r45.mr4) j37.u0().m75936x14adae67(37)) == null) ? 0 : mr4Var.m75939xb282bd08(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209424q4).mo141623x754a37bb()).r()).intValue() == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostChecker", "checkSupportMusic isShowMusicLink:" + m75939xb282bd08 + ", debugOk:" + z17);
        return z17 || m75939xb282bd08 == 1;
    }

    public final boolean c(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        m92.b j37 = g92.a.j3(g92.b.f351302e, username, false, 2, null);
        int i17 = j37 != null ? j37.f68698x26b1b2e8 : 0;
        boolean z17 = (2097152 & i17) != 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209406p4).mo141623x754a37bb()).r()).intValue() == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostChecker", "checkSupportWindowProduct extFlag:" + i17 + ", ret " + z17 + ", debugOk:" + z18);
        if (z18) {
            return true;
        }
        return z17;
    }
}

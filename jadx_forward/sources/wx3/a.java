package wx3;

/* loaded from: classes15.dex */
public abstract class a {
    public static final void a(long j17, java.lang.String feedId, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7168x9f0cf5ff c7168x9f0cf5ff = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7168x9f0cf5ff();
        c7168x9f0cf5ff.f144687d = j17;
        c7168x9f0cf5ff.f144688e = c7168x9f0cf5ff.b("feedid", feedId, true);
        c7168x9f0cf5ff.f144689f = j18;
        c7168x9f0cf5ff.k();
    }

    public static final void b(long j17, java.lang.String feedId, int i17, java.lang.String str, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6834xac9359af c6834xac9359af = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6834xac9359af();
        c6834xac9359af.f141555d = j17;
        c6834xac9359af.f141556e = c6834xac9359af.b("feedid", feedId, true);
        c6834xac9359af.f141557f = i17;
        c6834xac9359af.f141558g = c6834xac9359af.b("tousername", str, true);
        c6834xac9359af.f141560i = z17 ? 1L : 2L;
        c6834xac9359af.f141561j = z18 ? 1L : 2L;
        c6834xac9359af.k();
    }

    public static /* synthetic */ void c(long j17, java.lang.String str, int i17, java.lang.String str2, boolean z17, boolean z18, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            str2 = null;
        }
        b(j17, str, i17, str2, (i18 & 16) != 0 ? false : z17, (i18 & 32) != 0 ? false : z18);
    }

    public static final void d(java.lang.String feedId, long j17, long j18, long j19, int i17, java.lang.String username, boolean z17, boolean z18, java.lang.String toUserName, boolean z19, boolean z27, java.lang.String recRequestId, boolean z28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUserName, "toUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recRequestId, "recRequestId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6836xbc712795 c6836xbc712795 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6836xbc712795();
        c6836xbc712795.f141572d = c6836xbc712795.b("feedid", feedId, true);
        c6836xbc712795.f141573e = j17;
        c6836xbc712795.f141574f = j18;
        c6836xbc712795.f141575g = j19;
        c6836xbc712795.f141576h = c6836xbc712795.b(dm.i4.f66875xa013b0d5, username, true);
        c6836xbc712795.f141577i = i17;
        c6836xbc712795.f141578j = z17 ? 1L : 2L;
        c6836xbc712795.f141579k = z18 ? 1L : 2L;
        c6836xbc712795.f141580l = c6836xbc712795.b("toUserName", toUserName, true);
        c6836xbc712795.f141581m = !z19 ? 1L : 2L;
        c6836xbc712795.f141582n = z27 ? 1L : 2L;
        c6836xbc712795.f141583o = c6836xbc712795.b("rec_request_id", recRequestId, true);
        c6836xbc712795.f141584p = z28 ? 2L : 1L;
        c6836xbc712795.k();
    }

    public static final void f(int i17, int i18, java.lang.String wording, java.lang.String username, java.lang.String feedId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6838x59383988 c6838x59383988 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6838x59383988();
        c6838x59383988.f141595e = i18;
        c6838x59383988.f141596f = c6838x59383988.b("wording", wording, true);
        c6838x59383988.f141594d = i17;
        c6838x59383988.f141598h = c6838x59383988.b("UserName", username, true);
        c6838x59383988.f141597g = c6838x59383988.b("feedid", feedId, true);
        c6838x59383988.k();
    }
}

package z71;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static z71.b f552043a;

    public static z71.b a() {
        if (f552043a == null) {
            f552043a = new z71.b();
        }
        return f552043a;
    }

    public java.lang.String b(java.lang.String str) {
        r45.f03 Dj;
        try {
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0(str);
            return (L0 == null || (Dj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Dj(L0, str)) == null || Dj.f455430q == null) ? "" : java.lang.String.format("{\"tipsid\":\"%s\";\"ctrltype\":%d;\"showtype\":%d;\"expose_count\":%d;\"first_expose_time\":%d;\"rece_time\":%d;\"redDotShowInfoExt\":%s}", L0.f65880x11c19d58, java.lang.Integer.valueOf(L0.f65875xb5fc3ab6), java.lang.Integer.valueOf(Dj.f455420d), java.lang.Integer.valueOf(Dj.f455430q.f465189d), java.lang.Long.valueOf(Dj.f455430q.f465191f), java.lang.Long.valueOf(L0.f65879x2261f6f2), nk6.A(L0.f65874xb5f7102a).toString().replace(",", ";"));
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public boolean c() {
        boolean el6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        boolean z17 = !((c01.z1.j() & 34359738368L) != 0);
        boolean z18 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() && ((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiFinderData", "[isShowFinderEntrance] show:%s open:%s, isTeenModeAndNothing:%s", java.lang.Boolean.valueOf(el6), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        return el6 && z17 && !z18;
    }

    public boolean d() {
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        boolean z17 = !((c01.z1.j() & 9007199254740992L) != 0);
        boolean Ai = ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Ai();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiFinderData", "[isShowLiveEntrance] openLiveFriends:%s enableFinderLiveEntry:%s, isTeenMode:%s", java.lang.Boolean.valueOf(Ai), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(mo168058x74219ae7));
        return z17 && Ai && !mo168058x74219ae7;
    }
}

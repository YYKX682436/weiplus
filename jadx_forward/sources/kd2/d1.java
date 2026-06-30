package kd2;

/* loaded from: classes10.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f388260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f388261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 f388262f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f388263g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f388264h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(kd2.p1 p1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88, long j17, boolean z17) {
        super(0);
        this.f388260d = p1Var;
        this.f388261e = c14994x9b99c079;
        this.f388262f = c14989xf862ae88;
        this.f388263g = j17;
        this.f388264h = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        kd2.q0 q0Var;
        r45.yj4 yj4Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        r45.yj4 yj4Var2;
        r45.rz0 rz0Var;
        kd2.p1 p1Var = this.f388260d;
        if (p1Var.u()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f388261e;
            r45.dm2 m76806xdef68064 = c14994x9b99c079.m59240x7c94657b().m76806xdef68064();
            int m75939xb282bd08 = (m76806xdef68064 == null || (rz0Var = (r45.rz0) m76806xdef68064.m75936x14adae67(38)) == null) ? 0 : rz0Var.m75939xb282bd08(0);
            java.lang.String str2 = kd2.v1.f388386a;
            kd2.q0 q0Var2 = p1Var.f388320x;
            r45.qt2 qt2Var = q0Var2 != null ? q0Var2.f388336d : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 nextFeedData = this.f388262f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextFeedData, "nextFeedData");
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[7];
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(nextFeedData.m59127x5db1b11()));
            java.lang.String sessionBuffer = nextFeedData.getSessionBuffer();
            if (sessionBuffer == null) {
                sessionBuffer = "";
            }
            lVarArr[1] = new jz5.l("session_buffer", sessionBuffer);
            lVarArr[2] = new jz5.l("last_completed_feedid", pm0.v.u(this.f388263g));
            lVarArr[3] = new jz5.l("continue_play_type", java.lang.Integer.valueOf(m75939xb282bd08));
            if (qt2Var == null || (str = qt2Var.m75945x2fec8307(1)) == null) {
                str = "";
            }
            lVarArr[4] = new jz5.l("source_contextid", str);
            lVarArr[5] = new jz5.l("source_commentscene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : "");
            lVarArr[6] = new jz5.l("float_frame_sessionid", kd2.v1.f388386a);
            ((cy1.a) rVar).yj("float_frame_feed_play_next", null, kz5.c1.k(lVarArr), 1, true);
            long j17 = vn2.u0.f519920a.j(c14994x9b99c079);
            if (j17 <= 0) {
                r45.no2 m76812x1c39ba23 = c14994x9b99c079.getFeedObject().m76812x1c39ba23();
                j17 = m76812x1c39ba23 != null ? m76812x1c39ba23.m75939xb282bd08(0) : 0;
            }
            p1Var.S0();
            ds2.h hVar = ds2.h.f324399a;
            long feedId = nextFeedData.getFeedId();
            r45.mb4 mb4Var = nextFeedData.m59135x7efe73ec().get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mb4Var, "get(...)");
            mn2.g4 c17 = hVar.c(feedId, mb4Var, false);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd(context);
            p1Var.f388321y = c15188xd8bd4bd;
            c15188xd8bd4bd.n(c17, false, nextFeedData);
            kd2.p1.H0(p1Var, c15188xd8bd4bd, j17, 0.0f, false, false, 12, null);
            kd2.q0 q0Var3 = p1Var.f388320x;
            if (q0Var3 != null) {
                q0Var3.f388339g = nextFeedData;
            }
            if (q0Var3 != null && (yj4Var2 = q0Var3.f388345m) != null) {
                yj4Var2.set(11, c14994x9b99c079.getFeedObject());
            }
            p1Var.z0(4, nextFeedData, c15188xd8bd4bd.getF212140n(), null, 0L, 1.0f, false, true, p1Var.G, false);
            p1Var.k0().m58249xa2fbf520(true);
            if (this.f388264h && (q0Var = p1Var.C) != null && (yj4Var = q0Var.f388345m) != null && (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) yj4Var.m75936x14adae67(11)) != null) {
                try {
                    bw5.zc0 zc0Var = new bw5.zc0();
                    zc0Var.d(new bw5.yr().mo11468x92b714fd(c19792x256d2725.mo14344x5f01b1f6()));
                    qg3.i0 a17 = qg3.k0.f444359d.a();
                    qg3.h1 a18 = a17 != null ? ((qg3.k0) a17).a() : null;
                    if (a18 != null) {
                        byte[] mo14344x5f01b1f6 = zc0Var.mo14344x5f01b1f6();
                        long m105978x2737f10 = ((qg3.i1) a18).m105978x2737f10();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
                        p3380x6a61f93.p3383xf5152754.C30546x21b188e2.m169822x21b85a33(m105978x2737f10, mo14344x5f01b1f6);
                        int i17 = qg3.g1.f444353d;
                        java.lang.String playSessionId = p3380x6a61f93.p3383xf5152754.C30552x21b30f7a.m169879x21b8cb32();
                        kd2.q0 q0Var4 = p1Var.C;
                        if (q0Var4 != null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playSessionId, "<set-?>");
                            q0Var4.f388348p = playSessionId;
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playSessionId, "playSessionId");
                        p3380x6a61f93.p3383xf5152754.C30546x21b188e2.m169816x21b2bc76(((qg3.i1) a18).m105978x2737f10(), playSessionId);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderVideoPassive", "updatePlayingFeed ex " + e17.getMessage());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}

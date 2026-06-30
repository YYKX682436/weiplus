package c50;

/* loaded from: classes3.dex */
public interface c1 extends i95.m {
    static /* synthetic */ void gb(c50.c1 c1Var, ml2.h5 h5Var, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportGift");
        }
        ((ml2.r0) c1Var).Xj(h5Var, str, i17, (i18 & 8) != 0 ? null : str2, (i18 & 16) != 0 ? null : str3, (i18 & 32) != 0 ? null : str4);
    }

    static /* synthetic */ void ii(c50.c1 c1Var, ml2.f5 f5Var, ml2.e5 e5Var, boolean z17, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportRedPacket");
        }
        if ((i18 & 4) != 0) {
            z17 = true;
        }
        if ((i18 & 8) != 0) {
            i17 = 0;
        }
        ((ml2.r0) c1Var).Ek(f5Var, e5Var, z17, i17);
    }

    static /* synthetic */ void l9(c50.c1 c1Var, ml2.i5 i5Var, java.lang.String str, long j17, int i17, java.lang.String str2, java.lang.String str3, java.lang.Long l17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, long j18, int i18, java.lang.String str10, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21158");
        }
        ((ml2.r0) c1Var).nj(i5Var, str, j17, i17, str2, (i19 & 32) != 0 ? null : str3, (i19 & 64) != 0 ? 0L : l17, (i19 & 128) != 0 ? "" : str4, (i19 & 256) != 0 ? "" : str5, (i19 & 512) != 0 ? "" : str6, (i19 & 1024) != 0 ? null : str7, (i19 & 2048) != 0 ? null : str8, (i19 & 4096) != 0 ? null : str9, (i19 & 8192) != 0 ? 0L : j18, (i19 & 16384) != 0 ? 0 : i18, (i19 & 32768) != 0 ? null : str10);
    }

    static void w1(c50.c1 c1Var, long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j19, java.lang.String str6, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportOnce21084");
        }
        long j27 = (i17 & 1) != 0 ? 0L : j17;
        long j28 = (i17 & 2) != 0 ? 0L : j18;
        java.lang.String anchorFinderUsername = (i17 & 4) != 0 ? "" : str;
        java.lang.String topic = (i17 & 8) != 0 ? "" : str2;
        java.lang.String commentScene = (i17 & 16) != 0 ? "" : str3;
        java.lang.String contextid = (i17 & 32) != 0 ? "" : str4;
        java.lang.String sessionbuffer = (i17 & 64) != 0 ? "" : str5;
        long j29 = (i17 & 128) == 0 ? j19 : 0L;
        java.lang.String adData = (i17 & 256) != 0 ? "" : str6;
        ((ml2.r0) c1Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorFinderUsername, "anchorFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextid, "contextid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionbuffer, "sessionbuffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adData, "adData");
        if (anchorFinderUsername.length() == 0) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            anchorFinderUsername = xy2.c.e(context);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6460xac48e0d9 c6460xac48e0d9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6460xac48e0d9();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        c6460xac48e0d9.f138020d = c6460xac48e0d9.b("LiveID", b52.b.q(j27), true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        c6460xac48e0d9.f138021e = c6460xac48e0d9.b("FeedID", b52.b.q(j28), true);
        c6460xac48e0d9.f138022f = c6460xac48e0d9.b("UserName", anchorFinderUsername, true);
        c6460xac48e0d9.f138023g = c6460xac48e0d9.b("Topic", java.net.URLEncoder.encode(topic, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), true);
        c6460xac48e0d9.f138024h = c6460xac48e0d9.b("CommentScene", commentScene, true);
        if (contextid.length() == 0) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            contextid = b52.b.b();
            if (contextid == null) {
                contextid = "";
            }
        }
        c6460xac48e0d9.f138026j = c6460xac48e0d9.b("ContextId", contextid, true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        c6460xac48e0d9.f138027k = c6460xac48e0d9.b("ClickTabContextId", c17, true);
        c6460xac48e0d9.f138029m = c6460xac48e0d9.b("SessionBuffer", sessionbuffer, true);
        c6460xac48e0d9.f138036t = currentTimeMillis;
        c6460xac48e0d9.f138037u = j29;
        c6460xac48e0d9.f138041y = c6460xac48e0d9.b("AdData", r26.i0.t(adData, ",", ";", false), true);
        c6460xac48e0d9.G = c6460xac48e0d9.b("CouponId", "", true);
        c6460xac48e0d9.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportOnce21084Inner, liveId=" + c6460xac48e0d9.f138020d + ", feedId=" + c6460xac48e0d9.f138021e + ", username=" + c6460xac48e0d9.f138022f + ", topic=" + c6460xac48e0d9.f138023g + ", commentScene=" + c6460xac48e0d9.f138024h + ", isPrivate=" + c6460xac48e0d9.f138025i + ", contextId=" + c6460xac48e0d9.f138026j + ", clickTabContextId=" + c6460xac48e0d9.f138027k + ", sessionId=" + c6460xac48e0d9.f138028l + ", sessionBuffer=" + c6460xac48e0d9.f138029m + ", shopPermit=" + c6460xac48e0d9.f138030n + ", enterSessionId=" + c6460xac48e0d9.f138031o + ", liveTime=" + c6460xac48e0d9.f138032p + ", floatDuration=" + c6460xac48e0d9.f138034r + ", fullDuration=" + c6460xac48e0d9.f138033q + ", enterStatus=" + c6460xac48e0d9.f138035s + ", actionTS=" + c6460xac48e0d9.f138036t + ", action=" + c6460xac48e0d9.f138037u + ", enterIconType=" + c6460xac48e0d9.f138039w + ", pageType=" + c6460xac48e0d9.f138040x + ", adData=" + c6460xac48e0d9.f138041y + ", scenenote=" + c6460xac48e0d9.f138042z + ", identityType=" + c6460xac48e0d9.A + ", request_id=" + c6460xac48e0d9.B + ", actionStyle=" + c6460xac48e0d9.F + ", actionResult=" + c6460xac48e0d9.f138038v + ", couponId=" + c6460xac48e0d9.G + ", chnlExtra=" + c6460xac48e0d9.D);
    }
}

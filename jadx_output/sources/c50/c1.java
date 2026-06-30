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
        kotlin.jvm.internal.o.g(anchorFinderUsername, "anchorFinderUsername");
        kotlin.jvm.internal.o.g(topic, "topic");
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        kotlin.jvm.internal.o.g(contextid, "contextid");
        kotlin.jvm.internal.o.g(sessionbuffer, "sessionbuffer");
        kotlin.jvm.internal.o.g(adData, "adData");
        if (anchorFinderUsername.length() == 0) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            anchorFinderUsername = xy2.c.e(context);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.autogen.mmdata.rpt.FinderAudienceActionLogStruct finderAudienceActionLogStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderAudienceActionLogStruct();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderAudienceActionLogStruct.f56487d = finderAudienceActionLogStruct.b("LiveID", b52.b.q(j27), true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        finderAudienceActionLogStruct.f56488e = finderAudienceActionLogStruct.b("FeedID", b52.b.q(j28), true);
        finderAudienceActionLogStruct.f56489f = finderAudienceActionLogStruct.b("UserName", anchorFinderUsername, true);
        finderAudienceActionLogStruct.f56490g = finderAudienceActionLogStruct.b("Topic", java.net.URLEncoder.encode(topic, com.tencent.mapsdk.internal.rv.f51270c), true);
        finderAudienceActionLogStruct.f56491h = finderAudienceActionLogStruct.b("CommentScene", commentScene, true);
        if (contextid.length() == 0) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            contextid = b52.b.b();
            if (contextid == null) {
                contextid = "";
            }
        }
        finderAudienceActionLogStruct.f56493j = finderAudienceActionLogStruct.b("ContextId", contextid, true);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        finderAudienceActionLogStruct.f56494k = finderAudienceActionLogStruct.b("ClickTabContextId", c17, true);
        finderAudienceActionLogStruct.f56496m = finderAudienceActionLogStruct.b("SessionBuffer", sessionbuffer, true);
        finderAudienceActionLogStruct.f56503t = currentTimeMillis;
        finderAudienceActionLogStruct.f56504u = j29;
        finderAudienceActionLogStruct.f56508y = finderAudienceActionLogStruct.b("AdData", r26.i0.t(adData, ",", ";", false), true);
        finderAudienceActionLogStruct.G = finderAudienceActionLogStruct.b("CouponId", "", true);
        finderAudienceActionLogStruct.k();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "reportOnce21084Inner, liveId=" + finderAudienceActionLogStruct.f56487d + ", feedId=" + finderAudienceActionLogStruct.f56488e + ", username=" + finderAudienceActionLogStruct.f56489f + ", topic=" + finderAudienceActionLogStruct.f56490g + ", commentScene=" + finderAudienceActionLogStruct.f56491h + ", isPrivate=" + finderAudienceActionLogStruct.f56492i + ", contextId=" + finderAudienceActionLogStruct.f56493j + ", clickTabContextId=" + finderAudienceActionLogStruct.f56494k + ", sessionId=" + finderAudienceActionLogStruct.f56495l + ", sessionBuffer=" + finderAudienceActionLogStruct.f56496m + ", shopPermit=" + finderAudienceActionLogStruct.f56497n + ", enterSessionId=" + finderAudienceActionLogStruct.f56498o + ", liveTime=" + finderAudienceActionLogStruct.f56499p + ", floatDuration=" + finderAudienceActionLogStruct.f56501r + ", fullDuration=" + finderAudienceActionLogStruct.f56500q + ", enterStatus=" + finderAudienceActionLogStruct.f56502s + ", actionTS=" + finderAudienceActionLogStruct.f56503t + ", action=" + finderAudienceActionLogStruct.f56504u + ", enterIconType=" + finderAudienceActionLogStruct.f56506w + ", pageType=" + finderAudienceActionLogStruct.f56507x + ", adData=" + finderAudienceActionLogStruct.f56508y + ", scenenote=" + finderAudienceActionLogStruct.f56509z + ", identityType=" + finderAudienceActionLogStruct.A + ", request_id=" + finderAudienceActionLogStruct.B + ", actionStyle=" + finderAudienceActionLogStruct.F + ", actionResult=" + finderAudienceActionLogStruct.f56505v + ", couponId=" + finderAudienceActionLogStruct.G + ", chnlExtra=" + finderAudienceActionLogStruct.D);
    }
}

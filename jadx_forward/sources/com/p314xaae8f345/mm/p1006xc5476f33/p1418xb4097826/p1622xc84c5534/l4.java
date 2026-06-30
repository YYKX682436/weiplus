package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class l4 {
    public l4(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.StringBuffer sb6, java.lang.String key, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (num != null && num.intValue() == 0) {
            return;
        }
        sb6.append(key + '=' + num + '\n');
    }

    public final void b(java.lang.StringBuffer sb6, java.lang.String key, java.lang.Long l17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (l17 != null && l17.longValue() == 0) {
            return;
        }
        sb6.append(key + '=' + l17 + '\n');
    }

    public final void c(r45.vd6 stats, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stats, "stats");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("[Stats]\n");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l4 l4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4.f206684r0;
        l4Var.b(stringBuffer, "feedId", java.lang.Long.valueOf(stats.m75942xfb822ef2(0)));
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        r45.yw6 yw6Var = (r45.yw6) stats.m75936x14adae67(2);
        l4Var.a(stringBuffer, "vidPlayLen", yw6Var != null ? java.lang.Integer.valueOf(yw6Var.m75939xb282bd08(0)) : null);
        r45.yw6 yw6Var2 = (r45.yw6) stats.m75936x14adae67(2);
        l4Var.a(stringBuffer, "stayTime", yw6Var2 != null ? java.lang.Integer.valueOf(yw6Var2.m75939xb282bd08(1)) : null);
        r45.yw6 yw6Var3 = (r45.yw6) stats.m75936x14adae67(2);
        l4Var.b(stringBuffer, "stayTimeMs", yw6Var3 != null ? java.lang.Long.valueOf(yw6Var3.m75942xfb822ef2(2)) : null);
        r45.yw6 yw6Var4 = (r45.yw6) stats.m75936x14adae67(2);
        l4Var.b(stringBuffer, "vidPlayTimeMs", yw6Var4 != null ? java.lang.Long.valueOf(yw6Var4.m75942xfb822ef2(3)) : null);
        r45.yw6 yw6Var5 = (r45.yw6) stats.m75936x14adae67(2);
        l4Var.b(stringBuffer, "vidPlayingTimeMs", yw6Var5 != null ? java.lang.Long.valueOf(yw6Var5.m75942xfb822ef2(4)) : null);
        r45.yw6 yw6Var6 = (r45.yw6) stats.m75936x14adae67(2);
        l4Var.b(stringBuffer, "exposeTimeMs", yw6Var6 != null ? java.lang.Long.valueOf(yw6Var6.m75942xfb822ef2(5)) : null);
        r45.yw6 yw6Var7 = (r45.yw6) stats.m75936x14adae67(2);
        l4Var.b(stringBuffer, "startPlayTime", yw6Var7 != null ? java.lang.Long.valueOf(yw6Var7.m75942xfb822ef2(6)) : null);
        r45.yw6 yw6Var8 = (r45.yw6) stats.m75936x14adae67(2);
        l4Var.b(stringBuffer, "endPlayTime", yw6Var8 != null ? java.lang.Long.valueOf(yw6Var8.m75942xfb822ef2(7)) : null);
        r45.yw6 yw6Var9 = (r45.yw6) stats.m75936x14adae67(2);
        l4Var.b(stringBuffer, "lastPlayTime", yw6Var9 != null ? java.lang.Long.valueOf(yw6Var9.m75942xfb822ef2(8)) : null);
        r45.yw6 yw6Var10 = (r45.yw6) stats.m75936x14adae67(2);
        l4Var.b(stringBuffer, "stopTimes", yw6Var10 != null ? java.lang.Long.valueOf(yw6Var10.m75942xfb822ef2(9)) : null);
        r45.yw6 yw6Var11 = (r45.yw6) stats.m75936x14adae67(2);
        l4Var.a(stringBuffer, "autoPlay", yw6Var11 != null ? java.lang.Integer.valueOf(yw6Var11.m75939xb282bd08(10)) : null);
        r45.q25 q25Var = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, ya.a.f77453x4b357bf, q25Var != null ? java.lang.Integer.valueOf(q25Var.m75939xb282bd08(7)) : null);
        r45.q25 q25Var2 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "forward_times", q25Var2 != null ? java.lang.Integer.valueOf(q25Var2.m75939xb282bd08(4)) : null);
        r45.q25 q25Var3 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "feed_stay_time", q25Var3 != null ? java.lang.Integer.valueOf(q25Var3.m75939xb282bd08(2)) : null);
        r45.q25 q25Var4 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "vid_replay_times", q25Var4 != null ? java.lang.Integer.valueOf(q25Var4.m75939xb282bd08(3)) : null);
        r45.q25 q25Var5 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "max_vid_play_progress", q25Var5 != null ? java.lang.Integer.valueOf(q25Var5.m75939xb282bd08(1)) : null);
        r45.q25 q25Var6 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "pageTurn", q25Var6 != null ? java.lang.Integer.valueOf(q25Var6.m75939xb282bd08(0)) : null);
        r45.q25 q25Var7 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "clickComment", q25Var7 != null ? java.lang.Integer.valueOf(q25Var7.m75939xb282bd08(5)) : null);
        r45.q25 q25Var8 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "clickHead", q25Var8 != null ? java.lang.Integer.valueOf(q25Var8.m75939xb282bd08(6)) : null);
        r45.q25 q25Var9 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "likeStatus", q25Var9 != null ? java.lang.Integer.valueOf(q25Var9.m75939xb282bd08(9)) : null);
        r45.q25 q25Var10 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "followStatus", q25Var10 != null ? java.lang.Integer.valueOf(q25Var10.m75939xb282bd08(8)) : null);
        r45.q25 q25Var11 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "favStatus", q25Var11 != null ? java.lang.Integer.valueOf(q25Var11.m75939xb282bd08(11)) : null);
        r45.q25 q25Var12 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "notInterestAction", q25Var12 != null ? java.lang.Integer.valueOf(q25Var12.m75939xb282bd08(15)) : null);
        r45.q25 q25Var13 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "fastSlip", q25Var13 != null ? java.lang.Integer.valueOf(q25Var13.m75939xb282bd08(12)) : null);
        r45.q25 q25Var14 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "sortId", q25Var14 != null ? java.lang.Integer.valueOf(q25Var14.m75939xb282bd08(13)) : null);
        r45.q25 q25Var15 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "maxVidPlayLen", q25Var15 != null ? java.lang.Integer.valueOf(q25Var15.m75939xb282bd08(14)) : null);
        r45.q25 q25Var16 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "clickTopicTimes", q25Var16 != null ? java.lang.Integer.valueOf(q25Var16.m75939xb282bd08(16)) : null);
        r45.q25 q25Var17 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "expandTextTimes", q25Var17 != null ? java.lang.Integer.valueOf(q25Var17.m75939xb282bd08(17)) : null);
        r45.q25 q25Var18 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "shareMomentTimes", q25Var18 != null ? java.lang.Integer.valueOf(q25Var18.m75939xb282bd08(18)) : null);
        r45.q25 q25Var19 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "clickPoiTimes", q25Var19 != null ? java.lang.Integer.valueOf(q25Var19.m75939xb282bd08(19)) : null);
        r45.q25 q25Var20 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "collapseTextTimes", q25Var20 != null ? java.lang.Integer.valueOf(q25Var20.m75939xb282bd08(20)) : null);
        r45.q25 q25Var21 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "commentLikeTimes", q25Var21 != null ? java.lang.Integer.valueOf(q25Var21.m75939xb282bd08(21)) : null);
        r45.q25 q25Var22 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "clickFeedMenu", q25Var22 != null ? java.lang.Integer.valueOf(q25Var22.m75939xb282bd08(22)) : null);
        r45.q25 q25Var23 = (r45.q25) stats.m75936x14adae67(3);
        l4Var.a(stringBuffer, "complainTimes", q25Var23 != null ? java.lang.Integer.valueOf(q25Var23.m75939xb282bd08(23)) : null);
        l4Var.b(stringBuffer, "actionTimeMs", java.lang.Long.valueOf(stats.m75942xfb822ef2(6)));
        l4Var.a(stringBuffer, "feedScene", java.lang.Integer.valueOf(stats.m75939xb282bd08(7)));
        java.lang.String m75945x2fec8307 = stats.m75945x2fec8307(8);
        l4Var.a(stringBuffer, "sessionBuffer", m75945x2fec8307 != null ? java.lang.Integer.valueOf(m75945x2fec8307.length()) : null);
        r45.q25 q25Var24 = (r45.q25) stats.m75936x14adae67(3);
        r45.h85 h85Var = q25Var24 != null ? (r45.h85) q25Var24.m75936x14adae67(29) : null;
        if (h85Var != null) {
            stringBuffer.append("picStats = " + h85Var.mo12245xcc313de3() + '\n');
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, stringBuffer.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:355:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.vd6 d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.n4 r26, r45.qt2 r27) {
        /*
            Method dump skipped, instructions count: 2046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l4.d(com.tencent.mm.plugin.finder.report.n4, r45.qt2):r45.vd6");
    }
}

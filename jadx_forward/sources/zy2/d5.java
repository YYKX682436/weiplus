package zy2;

/* loaded from: classes4.dex */
public abstract class d5 {
    public static java.lang.String a(int i17, java.lang.String str) {
        return "<finder><type>" + i17 + "</type><detail>" + str + "</detail></finder>";
    }

    public static int b(java.util.Map map, int i17) {
        return map != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.finder.type"), -1) : i17;
    }

    public static java.lang.String c(r45.g92 g92Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (g92Var != null) {
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g92Var.m75945x2fec8307(0))) {
                    sb6.append("<finderLive>");
                    sb6.append("<finderLiveID>");
                    sb6.append(g92Var.m75945x2fec8307(0));
                    sb6.append("</finderLiveID>");
                    sb6.append("<finderUsername>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(g92Var.m75945x2fec8307(1)));
                    sb6.append("</finderUsername>");
                    sb6.append("<finderObjectID>");
                    sb6.append(g92Var.m75945x2fec8307(2));
                    sb6.append("</finderObjectID>");
                    sb6.append("<nickname>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(3)));
                    sb6.append("</nickname>");
                    sb6.append("<desc>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(4)));
                    sb6.append("</desc>");
                    sb6.append("<finderNonceID>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(g92Var.m75945x2fec8307(12)));
                    sb6.append("</finderNonceID>");
                    sb6.append("<headUrl>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(11)));
                    sb6.append("</headUrl>");
                    sb6.append("<extFlag>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(java.lang.String.valueOf(g92Var.m75939xb282bd08(14))));
                    sb6.append("</extFlag>");
                    sb6.append("<media>");
                    sb6.append("<coverUrl>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(5)));
                    sb6.append("</coverUrl>");
                    sb6.append("<height>");
                    sb6.append(g92Var.m75938x746dc8a6(7));
                    sb6.append("</height>");
                    sb6.append("<width>");
                    sb6.append(g92Var.m75938x746dc8a6(6));
                    sb6.append("</width>");
                    sb6.append("</media>");
                    sb6.append("<liveStatus>");
                    sb6.append(g92Var.m75939xb282bd08(13));
                    sb6.append("</liveStatus>");
                    sb6.append("<sourceType>");
                    sb6.append(g92Var.m75939xb282bd08(15));
                    sb6.append("</sourceType>");
                    sb6.append("<liveSourceTypeStr>");
                    sb6.append(g92Var.m75939xb282bd08(15));
                    sb6.append("</liveSourceTypeStr>");
                    sb6.append("<ecSource>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(16)));
                    sb6.append("</ecSource>");
                    sb6.append("<authIconType>");
                    sb6.append(g92Var.m75939xb282bd08(18));
                    sb6.append("</authIconType>");
                    sb6.append("<authIconTypeStr>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a("" + g92Var.m75939xb282bd08(18)));
                    sb6.append("</authIconTypeStr>");
                    sb6.append("<authIconUrl>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(17)));
                    sb6.append("</authIconUrl>");
                    sb6.append("<bindType>");
                    sb6.append(g92Var.m75939xb282bd08(19));
                    sb6.append("</bindType>");
                    sb6.append("<bizUsername>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(20)));
                    sb6.append("</bizUsername>");
                    sb6.append("<bizNickname>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(21)));
                    sb6.append("</bizNickname>");
                    sb6.append("<bizHeadUrl>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(45)));
                    sb6.append("</bizHeadUrl>");
                    sb6.append("<chargeFlag>");
                    sb6.append(g92Var.m75939xb282bd08(22));
                    sb6.append("</chargeFlag>");
                    sb6.append("<liveNickname>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(25)));
                    sb6.append("</liveNickname>");
                    sb6.append("<liveUsername>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(26)));
                    sb6.append("</liveUsername>");
                    sb6.append("<byPassInfoString>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(27)));
                    sb6.append("</byPassInfoString>");
                    sb6.append("<relayIndex>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(28)));
                    sb6.append("</relayIndex>");
                    sb6.append("<eventNickname>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(29)));
                    sb6.append("</eventNickname>");
                    sb6.append("<eventHeadUrl>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(30)));
                    sb6.append("</eventHeadUrl>");
                    sb6.append("<eventId>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(31)));
                    sb6.append("</eventId>");
                    sb6.append("<participantIdentity>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(32)));
                    sb6.append("</participantIdentity>");
                    sb6.append("<eventStatus>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(33)));
                    sb6.append("</eventStatus>");
                    sb6.append("<streamStatus>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(34)));
                    sb6.append("</streamStatus>");
                    sb6.append("<coverEffectType>");
                    sb6.append(g92Var.m75939xb282bd08(35));
                    sb6.append("</coverEffectType>");
                    sb6.append("<coverEffectText>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(36)));
                    sb6.append("</coverEffectText>");
                    sb6.append("<replayStatus>");
                    sb6.append(g92Var.m75939xb282bd08(39));
                    sb6.append("</replayStatus>");
                    sb6.append("<tailTagURL>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(40)));
                    sb6.append("</tailTagURL>");
                    sb6.append("<liveFlag>");
                    sb6.append(g92Var.m75939xb282bd08(38));
                    sb6.append("</liveFlag>");
                    sb6.append("<lastGMsgID>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(41)));
                    sb6.append("</lastGMsgID>");
                    sb6.append("<enterSessionId>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(g92Var.m75945x2fec8307(42)));
                    sb6.append("</enterSessionId>");
                    sb6.append("<shareScene>");
                    sb6.append(g92Var.m75939xb282bd08(44));
                    sb6.append("</shareScene>");
                    if (((r45.xz3) g92Var.m75936x14adae67(43)) != null) {
                        sb6.append("<instantDiscountActivityExtra>");
                        sb6.append("<activityKey>");
                        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(((r45.xz3) g92Var.m75936x14adae67(43)).m75945x2fec8307(0)));
                        sb6.append("</activityKey>");
                        sb6.append("<coverMaskImageURL>");
                        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(((r45.xz3) g92Var.m75936x14adae67(43)).m75945x2fec8307(1)));
                        sb6.append("</coverMaskImageURL>");
                        sb6.append("</instantDiscountActivityExtra>");
                    }
                    r45.d50 d50Var = (r45.d50) g92Var.m75936x14adae67(46);
                    if (d50Var != null && d50Var.m75941xfb821914(1) != null && !d50Var.m75941xfb821914(1).isEmpty()) {
                        sb6.append("<coAuthor>");
                        sb6.append("<avatarUrl>");
                        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(d50Var.m75945x2fec8307(0)));
                        sb6.append("</avatarUrl>");
                        sb6.append("<authors>");
                        java.util.Iterator it = d50Var.m75941xfb821914(1).iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it.next();
                            if (c19782x23db1cfa != null) {
                                sb6.append("<author>");
                                sb6.append("<nickname>");
                                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(c19782x23db1cfa.m76184x8010e5e4()));
                                sb6.append("</nickname>");
                                sb6.append("<username>");
                                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(c19782x23db1cfa.m76197x6c03c64c()));
                                sb6.append("</username>");
                                sb6.append("</author>");
                            }
                        }
                        sb6.append("</authors>");
                        sb6.append("</coAuthor>");
                    }
                    sb6.append("</finderLive>");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "make content error! %s", e17.getMessage());
            }
        }
        return sb6.toString();
    }

    public static java.lang.String d(r45.dv2 dv2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (dv2Var != null) {
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dv2Var.m75945x2fec8307(0))) {
                    sb6.append("<finderColumn>");
                    sb6.append("<cardId>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(dv2Var.m75945x2fec8307(0)));
                    sb6.append("</cardId>");
                    sb6.append("<title>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(dv2Var.m75945x2fec8307(1)));
                    sb6.append("</title>");
                    sb6.append("<secondTitle>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(dv2Var.m75945x2fec8307(2)));
                    sb6.append("</secondTitle>");
                    for (int i17 = 0; i17 < dv2Var.m75941xfb821914(3).size(); i17++) {
                        java.lang.String str = ((java.lang.String) dv2Var.m75941xfb821914(3).get(i17)) + ((java.lang.String) dv2Var.m75941xfb821914(4).get(i17));
                        if (i17 == 0) {
                            sb6.append("<iconUrl>");
                            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(str));
                            sb6.append("</iconUrl>");
                        } else if (i17 == 1) {
                            sb6.append("<iconUrl_1>");
                            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(str));
                            sb6.append("</iconUrl_1>");
                        } else if (i17 == 2) {
                            sb6.append("<iconUrl_2>");
                            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(str));
                            sb6.append("</iconUrl_2>");
                        } else if (i17 == 3) {
                            sb6.append("<iconUrl_3>");
                            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(str));
                            sb6.append("</iconUrl_3>");
                        }
                    }
                    if (dv2Var.m75934xbce7f2f(5) != null) {
                        java.lang.String str2 = new java.lang.String(android.util.Base64.encode(dv2Var.m75934xbce7f2f(5).g(), 0));
                        sb6.append("<cardbuffer>");
                        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(str2));
                        sb6.append("</cardbuffer>");
                    }
                    sb6.append("</finderColumn>");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "make content error! %s", e17.getMessage());
            }
        }
        return sb6.toString();
    }

    public static java.lang.String e(r45.ev2 ev2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (ev2Var != null) {
            try {
                if (ev2Var.m75942xfb822ef2(0) != 0) {
                    sb6.append("<finderCollection>");
                    sb6.append("<feedCount>");
                    sb6.append(ev2Var.m75939xb282bd08(4));
                    sb6.append("</feedCount>");
                    sb6.append("<collectionTopicType>");
                    sb6.append(ev2Var.m75939xb282bd08(5));
                    sb6.append("</collectionTopicType>");
                    sb6.append("<paidCollectionType>");
                    sb6.append(ev2Var.m75939xb282bd08(6));
                    sb6.append("</paidCollectionType>");
                    sb6.append("<price>");
                    sb6.append(ev2Var.m75939xb282bd08(7));
                    sb6.append("</price>");
                    sb6.append("<title>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(ev2Var.m75945x2fec8307(1)));
                    sb6.append("</title>");
                    sb6.append("<collectionId>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(ev2Var.m75942xfb822ef2(0)));
                    sb6.append("</collectionId>");
                    sb6.append("<thumbUrl>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(ev2Var.m75945x2fec8307(3)));
                    sb6.append("</thumbUrl>");
                    sb6.append("<collectionDesc>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(ev2Var.m75945x2fec8307(2)));
                    sb6.append("</collectionDesc>");
                    sb6.append("<authorUsername>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(ev2Var.m75945x2fec8307(8)));
                    sb6.append("</authorUsername>");
                    sb6.append("<nickname>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(ev2Var.m75945x2fec8307(9)));
                    sb6.append("</nickname>");
                    sb6.append("<avatarURL>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(ev2Var.m75945x2fec8307(10)));
                    sb6.append("</avatarURL>");
                    sb6.append("<authIconURL>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(ev2Var.m75945x2fec8307(11)));
                    sb6.append("</authIconURL>");
                    sb6.append("<authIconType>");
                    sb6.append(ev2Var.m75939xb282bd08(12));
                    sb6.append("</authIconType>");
                    sb6.append("<sourceCommentScene>");
                    sb6.append(ev2Var.m75939xb282bd08(13));
                    sb6.append("</sourceCommentScene>");
                    sb6.append("</finderCollection>");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "make content error! %s", e17.getMessage());
            }
        }
        return sb6.toString();
    }

    public static java.lang.String f(r45.kv2 kv2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (kv2Var != null) {
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kv2Var.m75945x2fec8307(0))) {
                    if ((kv2Var.m75939xb282bd08(25) & 4) > 0) {
                        kv2Var.set(31, 1);
                    }
                    sb6.append("<finderFeed>");
                    sb6.append("<objectId>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1(kv2Var.m75945x2fec8307(0)));
                    sb6.append("</objectId>");
                    sb6.append("<objectNonceId>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1(kv2Var.m75945x2fec8307(8)));
                    sb6.append("</objectNonceId>");
                    sb6.append("<feedType>");
                    sb6.append(kv2Var.m75939xb282bd08(5));
                    sb6.append("</feedType>");
                    sb6.append("<nickname>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(kv2Var.m75945x2fec8307(2)));
                    sb6.append("</nickname>");
                    sb6.append("<username>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(kv2Var.m75945x2fec8307(1)));
                    sb6.append("</username>");
                    sb6.append("<avatar>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(kv2Var.m75945x2fec8307(3)));
                    sb6.append("</avatar>");
                    sb6.append("<desc>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(kv2Var.m75945x2fec8307(4)));
                    sb6.append("</desc>");
                    sb6.append("<mediaCount>");
                    sb6.append(kv2Var.m75939xb282bd08(6));
                    sb6.append("</mediaCount>");
                    sb6.append("<localId>");
                    sb6.append(kv2Var.m75942xfb822ef2(9));
                    sb6.append("</localId>");
                    sb6.append("<authIconType>");
                    sb6.append(kv2Var.m75939xb282bd08(13));
                    sb6.append("</authIconType>");
                    sb6.append("<authIconUrl>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(kv2Var.m75945x2fec8307(14)));
                    sb6.append("</authIconUrl>");
                    sb6.append("<mediaList>");
                    int i17 = 7;
                    java.util.Iterator it = kv2Var.m75941xfb821914(7).iterator();
                    while (it.hasNext()) {
                        r45.iv2 iv2Var = (r45.iv2) it.next();
                        sb6.append("<media>");
                        sb6.append("<mediaType>");
                        sb6.append(iv2Var.m75939xb282bd08(0));
                        sb6.append("</mediaType>");
                        sb6.append("<url>");
                        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(iv2Var.m75945x2fec8307(1)));
                        sb6.append("</url>");
                        sb6.append("<thumbUrl>");
                        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(iv2Var.m75945x2fec8307(2)));
                        sb6.append("</thumbUrl>");
                        sb6.append("<coverUrl>");
                        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(iv2Var.m75945x2fec8307(8)));
                        sb6.append("</coverUrl>");
                        sb6.append("<fullCoverUrl>");
                        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(iv2Var.m75945x2fec8307(6)));
                        sb6.append("</fullCoverUrl>");
                        sb6.append("<fullClipInset>");
                        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(iv2Var.m75945x2fec8307(i17)));
                        sb6.append("</fullClipInset>");
                        sb6.append("<width>");
                        sb6.append(iv2Var.m75938x746dc8a6(3));
                        sb6.append("</width>");
                        sb6.append("<height>");
                        sb6.append(iv2Var.m75938x746dc8a6(4));
                        sb6.append("</height>");
                        sb6.append("<videoPlayDuration>");
                        sb6.append(iv2Var.m75939xb282bd08(5));
                        sb6.append("</videoPlayDuration>");
                        sb6.append("</media>");
                        i17 = 7;
                    }
                    sb6.append("</mediaList>");
                    sb6.append("<megaVideo>");
                    sb6.append("<objectId>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1(kv2Var.m75945x2fec8307(10)));
                    sb6.append("</objectId>");
                    sb6.append("<objectNonceId>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1(kv2Var.m75945x2fec8307(11)));
                    sb6.append("</objectNonceId>");
                    sb6.append("</megaVideo>");
                    sb6.append("<bizUsername>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(kv2Var.m75945x2fec8307(12)));
                    sb6.append("</bizUsername>");
                    sb6.append("<bizNickname>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(kv2Var.m75945x2fec8307(15)));
                    sb6.append("</bizNickname>");
                    sb6.append("<bizAvatar>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(kv2Var.m75945x2fec8307(16)));
                    sb6.append("</bizAvatar>");
                    sb6.append("<bizUsernameV2>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(kv2Var.m75945x2fec8307(17)));
                    sb6.append("</bizUsernameV2>");
                    sb6.append("<bizAuthIconType>");
                    sb6.append(kv2Var.m75939xb282bd08(18));
                    sb6.append("</bizAuthIconType>");
                    sb6.append("<bizAuthIconUrl>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(kv2Var.m75945x2fec8307(19)));
                    sb6.append("</bizAuthIconUrl>");
                    sb6.append("<coverEffectType>");
                    sb6.append(kv2Var.m75939xb282bd08(20));
                    sb6.append("</coverEffectType>");
                    sb6.append("<coverEffectText>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(kv2Var.m75945x2fec8307(21)));
                    sb6.append("</coverEffectText>");
                    sb6.append("<finderForwardSource>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(kv2Var.m75945x2fec8307(22)));
                    sb6.append("</finderForwardSource>");
                    sb6.append("<contactJumpInfoStr>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(kv2Var.m75945x2fec8307(23)));
                    sb6.append("</contactJumpInfoStr>");
                    sb6.append("<ecSource>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(kv2Var.m75945x2fec8307(24)));
                    sb6.append("</ecSource>");
                    if (kv2Var.m75934xbce7f2f(26) != null) {
                        java.lang.String str = new java.lang.String(android.util.Base64.encode(kv2Var.m75934xbce7f2f(26).e(), 2));
                        sb6.append("<shareBypData>");
                        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(str));
                        sb6.append("</shareBypData>");
                    }
                    if (kv2Var.m75939xb282bd08(31) > 0) {
                        sb6.append("<content_type>");
                        sb6.append(kv2Var.m75939xb282bd08(31));
                        sb6.append("</content_type>");
                    }
                    sb6.append("<lastGMsgID>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(kv2Var.m75945x2fec8307(27)));
                    sb6.append("</lastGMsgID>");
                    if (((r45.mv4) kv2Var.m75936x14adae67(28)) != null) {
                        sb6.append("<newlifeShareExtInfo>");
                        sb6.append("<content>");
                        sb6.append("<createTime>");
                        sb6.append(((r45.mv4) kv2Var.m75936x14adae67(28)).m75939xb282bd08(0));
                        sb6.append("</createTime>");
                        sb6.append("<commentEggCount>");
                        sb6.append(((r45.mv4) kv2Var.m75936x14adae67(28)).m75939xb282bd08(4));
                        sb6.append("</commentEggCount>");
                        sb6.append("<activityType>");
                        sb6.append(((r45.mv4) kv2Var.m75936x14adae67(28)).m75939xb282bd08(5));
                        sb6.append("</activityType>");
                        sb6.append("<isInnerQuickShare>");
                        sb6.append(((r45.mv4) kv2Var.m75936x14adae67(28)).m75939xb282bd08(6));
                        sb6.append("</isInnerQuickShare>");
                        if (((r45.ik2) ((r45.mv4) kv2Var.m75936x14adae67(28)).m75936x14adae67(2)) != null) {
                            sb6.append("<desc>");
                            sb6.append("<fromRichPublisher>");
                            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(java.lang.Integer.valueOf(((r45.ik2) ((r45.mv4) kv2Var.m75936x14adae67(28)).m75936x14adae67(2)).m75939xb282bd08(3))));
                            sb6.append("</fromRichPublisher>");
                            sb6.append("<pictureCutRatio>");
                            sb6.append(((r45.ik2) ((r45.mv4) kv2Var.m75936x14adae67(28)).m75936x14adae67(2)).m75937x160e9ec7(2));
                            sb6.append("</pictureCutRatio>");
                            sb6.append("<pictureCutRatioForFinder>");
                            sb6.append(((r45.ik2) ((r45.mv4) kv2Var.m75936x14adae67(28)).m75936x14adae67(2)).m75937x160e9ec7(6));
                            sb6.append("</pictureCutRatioForFinder>");
                            sb6.append("<richTextJson>");
                            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(((r45.ik2) ((r45.mv4) kv2Var.m75936x14adae67(28)).m75936x14adae67(2)).m75945x2fec8307(0))));
                            sb6.append("</richTextJson>");
                            sb6.append("<richTextTitle>");
                            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(((r45.ik2) ((r45.mv4) kv2Var.m75936x14adae67(28)).m75936x14adae67(2)).m75945x2fec8307(1))));
                            sb6.append("</richTextTitle>");
                            java.util.Iterator it6 = ((r45.ik2) ((r45.mv4) kv2Var.m75936x14adae67(28)).m75936x14adae67(2)).m75941xfb821914(8).iterator();
                            while (it6.hasNext()) {
                                r45.av4 av4Var = (r45.av4) it6.next();
                                sb6.append("<customCropInfo>");
                                sb6.append("<imageHeight>");
                                sb6.append(av4Var.m75939xb282bd08(5));
                                sb6.append("</imageHeight>");
                                sb6.append("<imageWidth>");
                                sb6.append(av4Var.m75939xb282bd08(4));
                                sb6.append("</imageWidth>");
                                sb6.append("<cropTop>");
                                sb6.append(av4Var.m75937x160e9ec7(0));
                                sb6.append("</cropTop>");
                                sb6.append("<cropBottom>");
                                sb6.append(av4Var.m75937x160e9ec7(2));
                                sb6.append("</cropBottom>");
                                sb6.append("<cropLeft>");
                                sb6.append(av4Var.m75937x160e9ec7(1));
                                sb6.append("</cropLeft>");
                                sb6.append("<cropRight>");
                                sb6.append(av4Var.m75937x160e9ec7(3));
                                sb6.append("</cropRight>");
                                sb6.append("</customCropInfo>");
                            }
                            sb6.append("</desc>");
                        }
                        if (((r45.jk2) ((r45.mv4) kv2Var.m75936x14adae67(28)).m75936x14adae67(1)) != null) {
                            sb6.append("<info>");
                            java.util.Iterator it7 = ((r45.jk2) ((r45.mv4) kv2Var.m75936x14adae67(28)).m75936x14adae67(1)).m75941xfb821914(9).iterator();
                            while (it7.hasNext()) {
                                r45.av4 av4Var2 = (r45.av4) it7.next();
                                sb6.append("<pictureCropInfo>");
                                sb6.append("<imageHeight>");
                                sb6.append(av4Var2.m75939xb282bd08(5));
                                sb6.append("</imageHeight>");
                                sb6.append("<imageWidth>");
                                sb6.append(av4Var2.m75939xb282bd08(4));
                                sb6.append("</imageWidth>");
                                sb6.append("<cropTop>");
                                sb6.append(av4Var2.m75937x160e9ec7(0));
                                sb6.append("</cropTop>");
                                sb6.append("<cropBottom>");
                                sb6.append(av4Var2.m75937x160e9ec7(2));
                                sb6.append("</cropBottom>");
                                sb6.append("<cropLeft>");
                                sb6.append(av4Var2.m75937x160e9ec7(1));
                                sb6.append("</cropLeft>");
                                sb6.append("<cropRight>");
                                sb6.append(av4Var2.m75937x160e9ec7(3));
                                sb6.append("</cropRight>");
                                sb6.append("</pictureCropInfo>");
                            }
                            sb6.append("</info>");
                        }
                        sb6.append("</content>");
                        sb6.append("</newlifeShareExtInfo>");
                    }
                    if (kv2Var.m75939xb282bd08(29) != 0) {
                        sb6.append("<sourceCommentScene>");
                        sb6.append(kv2Var.m75939xb282bd08(29));
                        sb6.append("</sourceCommentScene>");
                    }
                    if (((r45.gv2) kv2Var.m75936x14adae67(30)) != null) {
                        sb6.append("<finderShareExtInfo>");
                        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(((r45.gv2) kv2Var.m75936x14adae67(30)).mo12245xcc313de3().toString()));
                        sb6.append("</finderShareExtInfo>");
                    }
                    sb6.append("</finderFeed>");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "make content error! %s", e17.getMessage());
            }
        }
        return sb6.toString();
    }

    public static java.lang.String g(r45.lv2 lv2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (lv2Var != null) {
            sb6.append("<finderpoirelatedstream><longitudeString>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(lv2Var.m75945x2fec8307(1)));
            sb6.append("</longitudeString><latitudeString>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(lv2Var.m75945x2fec8307(0)));
            sb6.append("</latitudeString><poiName>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(lv2Var.m75945x2fec8307(2)));
            sb6.append("</poiName><poiScaleString>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(lv2Var.m75945x2fec8307(3)));
            sb6.append("</poiScaleString><address>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(lv2Var.m75945x2fec8307(4)));
            sb6.append("</address><infoUrl>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(lv2Var.m75945x2fec8307(5)));
            sb6.append("</infoUrl><poiClassifyId>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(lv2Var.m75945x2fec8307(6)));
            sb6.append("</poiClassifyId><poiCategories>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(lv2Var.m75945x2fec8307(7)));
            sb6.append("</poiCategories></finderpoirelatedstream>");
        }
        return sb6.toString();
    }

    public static java.lang.String h(r45.mv2 mv2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (mv2Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mv2Var.m75945x2fec8307(0))) {
            sb6.append("<finderTopic><topic>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(mv2Var.m75945x2fec8307(0)));
            sb6.append("</topic><topicType>");
            sb6.append(mv2Var.m75939xb282bd08(1));
            sb6.append("</topicType><fromFeedId>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(mv2Var.m75945x2fec8307(7)));
            sb6.append("</fromFeedId><iconUrl>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(mv2Var.m75945x2fec8307(2)));
            sb6.append("</iconUrl><desc>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(mv2Var.m75945x2fec8307(3)));
            sb6.append("</desc><patMusicId>");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(mv2Var.m75945x2fec8307(5)));
            sb6.append("</patMusicId>");
            if (((r45.hv2) mv2Var.m75936x14adae67(4)) != null) {
                sb6.append("<location><poiClassifyId>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(((r45.hv2) mv2Var.m75936x14adae67(4)).m75945x2fec8307(0)));
                sb6.append("</poiClassifyId><longitude>");
                sb6.append(((r45.hv2) mv2Var.m75936x14adae67(4)).m75938x746dc8a6(1));
                sb6.append("</longitude><latitude>");
                sb6.append(((r45.hv2) mv2Var.m75936x14adae67(4)).m75938x746dc8a6(2));
                sb6.append("</latitude></location>");
            }
            if (((r45.ht0) mv2Var.m75936x14adae67(6)) != null) {
                sb6.append("<event><topicId>");
                sb6.append(((r45.ht0) mv2Var.m75936x14adae67(6)).m75945x2fec8307(0));
                sb6.append("</topicId><name>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(((r45.ht0) mv2Var.m75936x14adae67(6)).m75945x2fec8307(1)));
                sb6.append("</name><creatorNickName>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(((r45.ht0) mv2Var.m75936x14adae67(6)).m75945x2fec8307(2)));
                sb6.append("</creatorNickName><hiddenMark>");
                sb6.append(((r45.ht0) mv2Var.m75936x14adae67(6)).m75942xfb822ef2(4));
                sb6.append("</hiddenMark><title>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(((r45.ht0) mv2Var.m75936x14adae67(6)).m75945x2fec8307(5)));
                sb6.append("</title></event>");
            }
            if (((r45.ub4) mv2Var.m75936x14adae67(8)) != null) {
                sb6.append("<templateItem><templateTopicId>");
                sb6.append(((r45.ub4) mv2Var.m75936x14adae67(8)).m75945x2fec8307(0));
                sb6.append("</templateTopicId><templateType>");
                sb6.append(((r45.ub4) mv2Var.m75936x14adae67(8)).m75939xb282bd08(1));
                sb6.append("</templateType></templateItem>");
            }
            sb6.append("</finderTopic>");
        }
        return sb6.toString();
    }

    public static java.lang.String i(r45.hd2 hd2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (hd2Var != null) {
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hd2Var.m75945x2fec8307(3))) {
                    sb6.append("<finderThemeLiveStream>");
                    sb6.append("<mainTitle>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(hd2Var.m75945x2fec8307(0)));
                    sb6.append("</mainTitle>");
                    sb6.append("<subTitle>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(hd2Var.m75945x2fec8307(1)));
                    sb6.append("</subTitle>");
                    sb6.append("<imgUrl>");
                    sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.a(hd2Var.m75945x2fec8307(2)));
                    sb6.append("</imgUrl>");
                    sb6.append("<themeId>");
                    sb6.append(hd2Var.m75945x2fec8307(3));
                    sb6.append("</themeId>");
                    sb6.append("</finderThemeLiveStream>");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "make content error! %s", e17.getMessage());
            }
        }
        return sb6.toString();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x05fe -> B:47:0x061d). Please report as a decompilation issue!!! */
    public static r45.kv2 j(java.lang.String str, java.util.Map map) {
        r45.kv2 kv2Var = new r45.kv2();
        try {
            java.lang.String str2 = str + ".finderFeed";
            if (!map.isEmpty()) {
                if (map.containsKey(str2 + ".objectId")) {
                    java.lang.String str3 = (java.lang.String) map.get(str2 + ".objectId");
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    java.lang.String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    int i17 = 0;
                    kv2Var.set(0, str3);
                    java.lang.String str5 = (java.lang.String) map.get(str2 + ".objectNonceId");
                    if (str5 == null) {
                        str5 = "";
                    }
                    kv2Var.set(8, str5);
                    kv2Var.set(5, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str2 + ".feedType"), 0)));
                    java.lang.String str6 = (java.lang.String) map.get(str2 + ".nickname");
                    if (str6 == null) {
                        str6 = "";
                    }
                    kv2Var.set(2, str6);
                    java.lang.String str7 = (java.lang.String) map.get(str2 + ".username");
                    if (str7 == null) {
                        str7 = "";
                    }
                    kv2Var.set(1, str7);
                    java.lang.String str8 = (java.lang.String) map.get(str2 + ".avatar");
                    if (str8 == null) {
                        str8 = "";
                    }
                    kv2Var.set(3, str8);
                    java.lang.String str9 = (java.lang.String) map.get(str2 + ".desc");
                    if (str9 != null) {
                        str4 = str9;
                    }
                    kv2Var.set(4, str4);
                    kv2Var.set(6, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str2 + ".mediaCount"), 0)));
                    kv2Var.set(9, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) map.get(str2 + ".localId"))));
                    kv2Var.set(13, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str2 + ".authIconType"), 0)));
                    kv2Var.set(14, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".authIconUrl")));
                    int i18 = 0;
                    for (int i19 = 6; i18 < kv2Var.m75939xb282bd08(i19); i19 = 6) {
                        r45.iv2 iv2Var = new r45.iv2();
                        java.lang.String str10 = str2 + ".mediaList.media";
                        if (i18 > 0) {
                            str10 = str10 + i18;
                        }
                        iv2Var.set(i17, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str10 + ".mediaType"))));
                        iv2Var.set(1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str10 + ".url")));
                        iv2Var.set(2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str10 + ".thumbUrl")));
                        iv2Var.set(8, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str10 + ".coverUrl")));
                        iv2Var.set(6, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str10 + ".fullCoverUrl")));
                        iv2Var.set(7, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str10 + ".fullClipInset")));
                        iv2Var.set(3, java.lang.Float.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str10 + ".width"))));
                        iv2Var.set(4, java.lang.Float.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str10 + ".height"))));
                        iv2Var.set(5, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str10 + ".videoPlayDuration"))));
                        kv2Var.m75941xfb821914(7).add(iv2Var);
                        i18++;
                        i17 = 0;
                    }
                    java.lang.String str11 = str2 + ".megaVideo";
                    kv2Var.set(10, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str11 + ".objectId")));
                    kv2Var.set(11, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str11 + ".objectNonceId")));
                    kv2Var.set(12, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".bizUsername")));
                    kv2Var.set(15, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".bizNickname")));
                    kv2Var.set(16, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".bizAvatar")));
                    kv2Var.set(17, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".bizUsernameV2")));
                    kv2Var.set(18, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".bizAuthIconType"))));
                    kv2Var.set(19, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".bizAuthIconUrl")));
                    kv2Var.set(20, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".coverEffectType"))));
                    kv2Var.set(21, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".coverEffectText")));
                    kv2Var.set(22, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".finderForwardSource")));
                    kv2Var.set(23, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".contactJumpInfoStr")));
                    kv2Var.set(24, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".ecSource")));
                    kv2Var.set(31, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".content_type"))));
                    if (kv2Var.m75939xb282bd08(31) == 1) {
                        kv2Var.set(25, java.lang.Integer.valueOf(kv2Var.m75939xb282bd08(25) | 4));
                    }
                    java.lang.String s17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".shareBypData"));
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s17)) {
                        kv2Var.set(26, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(android.util.Base64.decode(s17, 2)));
                    }
                    kv2Var.set(27, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".lastGMsgID")));
                    kv2Var.set(29, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".sourceCommentScene"))));
                    java.lang.String s18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".finderShareExtInfo"));
                    if (!s18.isEmpty()) {
                        kv2Var.set(30, (r45.gv2) new r45.gv2().mo75930xb5cb93b2(s18));
                    }
                    try {
                        if (map.containsKey(str2 + ".newlifeShareExtInfo.content")) {
                            kv2Var.set(28, s(map, str2 + ".newlifeShareExtInfo.content", kv2Var.m75939xb282bd08(6)));
                        } else {
                            if (map.containsKey(str2 + ".newlifeShareExtInfo")) {
                                kv2Var.set(28, s(map, str2 + ".newlifeShareExtInfo", kv2Var.m75939xb282bd08(6)));
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "parse newlifeShareExtInfo error! %s", e17.getMessage());
                    }
                }
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "parse error! %s", e18.getMessage());
        }
        return kv2Var;
    }

    public static r45.dv2 k(java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        r45.dv2 dv2Var = new r45.dv2();
        java.lang.String str6 = str + ".finderColumn";
        if (map.isEmpty()) {
            dv2Var.set(0, "");
            dv2Var.set(1, "");
            dv2Var.set(2, "");
            dv2Var.set(5, null);
        } else {
            java.lang.String str7 = (java.lang.String) map.get(str6 + ".cardbuffer");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str7 == null) {
                str7 = "";
            }
            dv2Var.set(5, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(android.util.Base64.decode(str7, 0)));
            java.lang.String str8 = (java.lang.String) map.get(str6 + ".iconUrl");
            if (str8 == null) {
                str8 = "";
            }
            java.lang.String str9 = (java.lang.String) map.get(str6 + ".iconUrl_1");
            if (str9 == null) {
                str9 = "";
            }
            java.lang.String str10 = (java.lang.String) map.get(str6 + ".iconUrl_2");
            if (str10 == null) {
                str10 = "";
            }
            java.lang.String str11 = (java.lang.String) map.get(str6 + ".iconUrl_3");
            if (str11 == null) {
                str11 = "";
            }
            java.lang.String[] split = str8.split("&token");
            dv2Var.m75941xfb821914(3).add(split[0]);
            java.util.LinkedList m75941xfb821914 = dv2Var.m75941xfb821914(4);
            if (split.length > 1) {
                str2 = "&token" + split[1];
            } else {
                str2 = "";
            }
            m75941xfb821914.add(str2);
            java.lang.String[] split2 = str9.split("&token");
            dv2Var.m75941xfb821914(3).add(split2[0]);
            java.util.LinkedList m75941xfb8219142 = dv2Var.m75941xfb821914(4);
            if (split2.length > 1) {
                str3 = "&token" + split2[1];
            } else {
                str3 = "";
            }
            m75941xfb8219142.add(str3);
            java.lang.String[] split3 = str10.split("&token");
            dv2Var.m75941xfb821914(3).add(split3[0]);
            java.util.LinkedList m75941xfb8219143 = dv2Var.m75941xfb821914(4);
            if (split3.length > 1) {
                str4 = "&token" + split3[1];
            } else {
                str4 = "";
            }
            m75941xfb8219143.add(str4);
            java.lang.String[] split4 = str11.split("&token");
            dv2Var.m75941xfb821914(3).add(split4[0]);
            java.util.LinkedList m75941xfb8219144 = dv2Var.m75941xfb821914(4);
            if (split4.length > 1) {
                str5 = "&token" + split4[1];
            } else {
                str5 = "";
            }
            m75941xfb8219144.add(str5);
            java.lang.String str12 = (java.lang.String) map.get(str6 + ".cardId");
            if (str12 == null) {
                str12 = "";
            }
            dv2Var.set(0, str12);
            java.lang.String str13 = (java.lang.String) map.get(str6 + ".title");
            if (str13 == null) {
                str13 = "";
            }
            dv2Var.set(1, str13);
            java.lang.String str14 = (java.lang.String) map.get(str6 + ".secondTitle");
            dv2Var.set(2, str14 != null ? str14 : "");
        }
        return dv2Var;
    }

    public static r45.g92 l(java.lang.String str, java.util.Map map) {
        r45.g92 g92Var = new r45.g92();
        try {
            java.lang.String str2 = str + ".finderLive";
            if (!map.isEmpty()) {
                if (map.containsKey(str2 + ".finderLiveID")) {
                    g92Var.set(0, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".finderLiveID")));
                    g92Var.set(1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".finderUsername")));
                    g92Var.set(2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".finderObjectID")));
                    g92Var.set(3, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".nickname")));
                    g92Var.set(4, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".desc")));
                    g92Var.set(5, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".media.coverUrl")).replace("&amp;", "&"));
                    g92Var.set(7, java.lang.Float.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str2 + ".media.height"))));
                    g92Var.set(6, java.lang.Float.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str2 + ".media.width"))));
                    g92Var.set(11, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".headUrl")));
                    g92Var.set(12, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".finderNonceID")));
                    g92Var.set(13, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".liveStatus"))));
                    g92Var.set(15, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".sourceType"))));
                    java.lang.String str3 = (java.lang.String) map.get(str2 + ".liveSourceTypeStr");
                    if (g92Var.m75939xb282bd08(15) == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        g92Var.set(15, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1(str3)));
                    }
                    g92Var.set(18, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".authIconType"))));
                    if (g92Var.m75939xb282bd08(18) == 0) {
                        g92Var.set(18, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".authIconTypeStr")))));
                    }
                    g92Var.set(17, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".authIconUrl")));
                    g92Var.set(19, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".bindType"))));
                    g92Var.set(20, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".bizUsername")));
                    g92Var.set(21, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".bizNickname")));
                    g92Var.set(45, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".bizHeadUrl")));
                    g92Var.set(22, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".chargeFlag"))));
                    g92Var.set(25, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".liveNickname")));
                    g92Var.set(26, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".liveUsername")));
                    g92Var.set(27, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".byPassInfoString")));
                    g92Var.set(28, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".relayIndex")));
                    g92Var.set(29, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".eventNickname")));
                    g92Var.set(30, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".eventHeadUrl")));
                    g92Var.set(31, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".eventId")));
                    g92Var.set(32, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".participantIdentity")));
                    g92Var.set(33, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".eventStatus")));
                    g92Var.set(34, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".streamStatus")));
                    g92Var.set(35, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".coverEffectType"))));
                    g92Var.set(36, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".coverEffectText")));
                    g92Var.set(37, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".chatroomId")));
                    g92Var.set(38, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".liveFlag"))));
                    g92Var.set(39, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".replayStatus"))));
                    g92Var.set(40, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".tailTagURL")));
                    g92Var.set(41, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".lastGMsgID")));
                    g92Var.set(42, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".enterSessionId")));
                    g92Var.set(44, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".shareScene"))));
                    if (g92Var.m75939xb282bd08(13) != 1 && g92Var.m75939xb282bd08(13) != 2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderShareParser", "[parseFinderLive] shareObject.liveStatus = " + g92Var.m75939xb282bd08(13));
                        g92Var.set(13, 1);
                    }
                    g92Var.set(14, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".extFlag"))));
                    g92Var.set(16, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".ecSource")));
                    java.lang.String s17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".instantDiscountActivityExtra.activityKey"));
                    java.lang.String s18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".instantDiscountActivityExtra.coverMaskImageURL"));
                    r45.xz3 xz3Var = new r45.xz3();
                    xz3Var.set(0, s17);
                    xz3Var.set(1, s18);
                    g92Var.set(43, xz3Var);
                    java.lang.String str4 = (java.lang.String) map.get(str2 + ".coAuthor.avatarUrl");
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.lang.String str5 = str2 + ".coAuthor.authors.author";
                    java.lang.String str6 = str5;
                    int i17 = 1;
                    while (map.containsKey(str6) && linkedList.size() < 20) {
                        java.lang.String str7 = (java.lang.String) map.get(str6 + ".nickname");
                        java.lang.String str8 = (java.lang.String) map.get(str6 + ".username");
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
                        c19782x23db1cfa.m76227x7ac946f0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1(str7));
                        c19782x23db1cfa.m76240x66bc2758(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1(str8));
                        linkedList.add(c19782x23db1cfa);
                        str6 = str5 + i17;
                        i17++;
                    }
                    if (!linkedList.isEmpty() || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                        r45.d50 d50Var = new r45.d50();
                        d50Var.set(0, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1(str4));
                        d50Var.set(1, linkedList);
                        g92Var.set(46, d50Var);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "parse error! %s", e17.getMessage());
        }
        return g92Var;
    }

    public static r45.lv2 m(java.lang.String str, java.util.Map map) {
        r45.lv2 lv2Var = new r45.lv2();
        java.lang.String str2 = str + ".finderpoirelatedstream";
        if (map.isEmpty()) {
            lv2Var.set(1, "");
            lv2Var.set(0, "");
            lv2Var.set(2, "");
            lv2Var.set(3, "");
            lv2Var.set(4, "");
            lv2Var.set(5, "");
            lv2Var.set(6, "");
            lv2Var.set(7, "");
        } else {
            java.lang.String str3 = (java.lang.String) map.get(str2 + ".longitudeString");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str3 == null) {
                str3 = "";
            }
            lv2Var.set(1, str3);
            java.lang.String str4 = (java.lang.String) map.get(str2 + ".latitudeString");
            if (str4 == null) {
                str4 = "";
            }
            lv2Var.set(0, str4);
            java.lang.String str5 = (java.lang.String) map.get(str2 + ".poiName");
            if (str5 == null) {
                str5 = "";
            }
            lv2Var.set(2, str5);
            java.lang.String str6 = (java.lang.String) map.get(str2 + ".poiScaleString");
            if (str6 == null) {
                str6 = "";
            }
            lv2Var.set(3, str6);
            java.lang.String str7 = (java.lang.String) map.get(str2 + ".address");
            if (str7 == null) {
                str7 = "";
            }
            lv2Var.set(4, str7);
            java.lang.String str8 = (java.lang.String) map.get(str2 + ".infoUrl");
            if (str8 == null) {
                str8 = "";
            }
            lv2Var.set(5, str8);
            java.lang.String str9 = (java.lang.String) map.get(str2 + ".poiClassifyId");
            if (str9 == null) {
                str9 = "";
            }
            lv2Var.set(6, str9);
            java.lang.String str10 = (java.lang.String) map.get(str2 + ".poiCategories");
            lv2Var.set(7, str10 != null ? str10 : "");
        }
        return lv2Var;
    }

    public static r45.ev2 n(java.lang.String str, java.util.Map map) {
        r45.ev2 ev2Var = new r45.ev2();
        java.lang.String str2 = str + ".finderCollection";
        if (map != null && !map.isEmpty()) {
            ev2Var.set(4, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".feedCount"), 0)));
            ev2Var.set(5, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".collectionTopicType"), 0)));
            ev2Var.set(6, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".paidCollectionType"), 0)));
            ev2Var.set(7, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".price"), 0)));
            java.lang.String str3 = (java.lang.String) map.get(str2 + ".title");
            if (str3 == null) {
                str3 = "";
            }
            ev2Var.set(1, str3);
            ev2Var.set(0, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q0((java.lang.String) map.get(str2 + ".collectionId"), 0L)));
            java.lang.String str4 = (java.lang.String) map.get(str2 + ".thumbUrl");
            if (str4 == null) {
                str4 = "";
            }
            ev2Var.set(3, str4);
            java.lang.String str5 = (java.lang.String) map.get(str2 + ".collectionDesc");
            if (str5 == null) {
                str5 = "";
            }
            ev2Var.set(2, str5);
            java.lang.String str6 = (java.lang.String) map.get(str2 + ".authorUsername");
            if (str6 == null) {
                str6 = "";
            }
            ev2Var.set(8, str6);
            java.lang.String str7 = (java.lang.String) map.get(str2 + ".nickname");
            if (str7 == null) {
                str7 = "";
            }
            ev2Var.set(9, str7);
            java.lang.String str8 = (java.lang.String) map.get(str2 + ".avatarURL");
            if (str8 == null) {
                str8 = "";
            }
            ev2Var.set(10, str8);
            java.lang.String str9 = (java.lang.String) map.get(str2 + ".authIconURL");
            ev2Var.set(11, str9 != null ? str9 : "");
            ev2Var.set(12, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".authIconType"), 0)));
            ev2Var.set(13, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".sourceCommentScene"), 0)));
        }
        return ev2Var;
    }

    public static r45.mv2 o(java.lang.String str, java.util.Map map) {
        r45.mv2 mv2Var = new r45.mv2();
        java.lang.String str2 = str + ".finderTopic";
        if (map.isEmpty()) {
            mv2Var.set(0, "");
            mv2Var.set(1, -1);
            mv2Var.set(2, "");
            mv2Var.set(3, "");
            mv2Var.set(4, new r45.hv2());
            mv2Var.set(7, "");
        } else {
            java.lang.String str3 = (java.lang.String) map.get(str2 + ".topic");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str3 == null) {
                str3 = "";
            }
            mv2Var.set(0, str3);
            mv2Var.set(1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".topicType"), -1)));
            java.lang.String str4 = (java.lang.String) map.get(str2 + ".iconUrl");
            if (str4 == null) {
                str4 = "";
            }
            mv2Var.set(2, str4);
            java.lang.String str5 = (java.lang.String) map.get(str2 + ".desc");
            if (str5 == null) {
                str5 = "";
            }
            mv2Var.set(3, str5);
            java.lang.String str6 = (java.lang.String) map.get(str2 + ".patMusicId");
            if (str6 == null) {
                str6 = "";
            }
            mv2Var.set(5, str6);
            java.lang.String str7 = (java.lang.String) map.get(str2 + ".fromFeedId");
            if (str7 == null) {
                str7 = "";
            }
            mv2Var.set(7, str7);
            r45.hv2 hv2Var = new r45.hv2();
            hv2Var.set(0, (java.lang.String) map.get(str2 + ".location.poiClassifyId"));
            hv2Var.set(1, java.lang.Float.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) map.get(str2 + ".location.longitude"), 0.0f)));
            hv2Var.set(2, java.lang.Float.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) map.get(str2 + ".location.latitude"), 0.0f)));
            mv2Var.set(4, hv2Var);
            if (map.get(str2 + ".event.topicId") != null) {
                r45.ht0 ht0Var = new r45.ht0();
                java.lang.String str8 = (java.lang.String) map.get(str2 + ".event.topicId");
                if (str8 == null) {
                    str8 = "";
                }
                ht0Var.set(0, str8);
                java.lang.String str9 = (java.lang.String) map.get(str2 + ".event.name");
                if (str9 == null) {
                    str9 = "";
                }
                ht0Var.set(1, str9);
                java.lang.String str10 = (java.lang.String) map.get(str2 + ".event.creatorNickName");
                if (str10 == null) {
                    str10 = "";
                }
                ht0Var.set(2, str10);
                ht0Var.set(4, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(str2 + ".event.hiddenMark"), 0L)));
                java.lang.String str11 = (java.lang.String) map.get(str2 + ".event.title");
                if (str11 == null) {
                    str11 = "";
                }
                ht0Var.set(5, str11);
                mv2Var.set(6, ht0Var);
            }
            if (map.get(str2 + ".templateItem.templateTopicId") != null) {
                r45.ub4 ub4Var = new r45.ub4();
                java.lang.String str12 = (java.lang.String) map.get(str2 + ".templateItem.templateTopicId");
                ub4Var.set(0, str12 != null ? str12 : "");
                ub4Var.set(1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".templateItem.templateType"), 0)));
                mv2Var.set(8, ub4Var);
            }
        }
        return mv2Var;
    }

    public static r45.mv2 p(java.lang.String str, java.util.Map map) {
        r45.mv2 mv2Var = new r45.mv2();
        java.lang.String str2 = str + ".finderTopicShareItem";
        if (map.isEmpty()) {
            mv2Var.set(0, "");
            mv2Var.set(1, -1);
            mv2Var.set(2, "");
            mv2Var.set(3, "");
            mv2Var.set(4, new r45.hv2());
        } else {
            java.lang.String str3 = (java.lang.String) map.get(str2 + ".topic");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str3 == null) {
                str3 = "";
            }
            mv2Var.set(0, str3);
            mv2Var.set(1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".topicType"), -1)));
            java.lang.String str4 = (java.lang.String) map.get(str2 + ".iconUrl");
            if (str4 == null) {
                str4 = "";
            }
            mv2Var.set(2, str4);
            java.lang.String str5 = (java.lang.String) map.get(str2 + ".desc");
            if (str5 == null) {
                str5 = "";
            }
            mv2Var.set(3, str5);
            java.lang.String str6 = (java.lang.String) map.get(str2 + ".fromFeedId");
            if (str6 == null) {
                str6 = "";
            }
            mv2Var.set(7, str6);
            java.lang.String str7 = (java.lang.String) map.get(str2 + ".patMusicId");
            if (str7 == null) {
                str7 = "";
            }
            mv2Var.set(5, str7);
            r45.hv2 hv2Var = new r45.hv2();
            hv2Var.set(0, (java.lang.String) map.get(str2 + ".location.poiClassifyId"));
            hv2Var.set(1, java.lang.Float.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) map.get(str2 + ".location.longitude"), 0.0f)));
            hv2Var.set(2, java.lang.Float.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) map.get(str2 + ".location.latitude"), 0.0f)));
            mv2Var.set(4, hv2Var);
            if (map.get(str2 + ".event.topicId") != null) {
                r45.ht0 ht0Var = new r45.ht0();
                java.lang.String str8 = (java.lang.String) map.get(str2 + ".event.topicId");
                if (str8 == null) {
                    str8 = "";
                }
                ht0Var.set(0, str8);
                java.lang.String str9 = (java.lang.String) map.get(str2 + ".event.name");
                if (str9 == null) {
                    str9 = "";
                }
                ht0Var.set(1, str9);
                java.lang.String str10 = (java.lang.String) map.get(str2 + ".event.creatorNickName");
                if (str10 == null) {
                    str10 = "";
                }
                ht0Var.set(2, str10);
                ht0Var.set(4, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(str2 + ".event.hiddenMark"), 0L)));
                java.lang.String str11 = (java.lang.String) map.get(str2 + ".event.title");
                if (str11 == null) {
                    str11 = "";
                }
                ht0Var.set(5, str11);
                mv2Var.set(6, ht0Var);
            }
            if (map.get(str2 + ".templateItem.templateTopicId") != null) {
                r45.ub4 ub4Var = new r45.ub4();
                java.lang.String str12 = (java.lang.String) map.get(str2 + ".templateItem.templateTopicId");
                ub4Var.set(0, str12 != null ? str12 : "");
                ub4Var.set(1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2 + ".templateItem.templateType"), 0)));
                mv2Var.set(8, ub4Var);
            }
        }
        return mv2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x03bf, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6.m75945x2fec8307(8)) != false) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r45.kv2 q(java.lang.String r18, java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zy2.d5.q(java.lang.String, java.util.Map):r45.kv2");
    }

    public static r45.hd2 r(java.lang.String str, java.util.Map map) {
        r45.hd2 hd2Var = new r45.hd2();
        try {
            java.lang.String str2 = str + ".finderThemeLiveStream";
            if (!map.isEmpty()) {
                if (map.containsKey(str2 + ".themeId")) {
                    java.lang.String str3 = (java.lang.String) map.get(str2 + ".mainTitle");
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    java.lang.String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    hd2Var.set(0, str3);
                    java.lang.String str5 = (java.lang.String) map.get(str2 + ".subTitle");
                    if (str5 == null) {
                        str5 = "";
                    }
                    hd2Var.set(1, str5);
                    java.lang.String str6 = (java.lang.String) map.get(str2 + ".imgUrl");
                    if (str6 == null) {
                        str6 = "";
                    }
                    hd2Var.set(2, str6);
                    java.lang.String str7 = (java.lang.String) map.get(str2 + ".themeId");
                    if (str7 != null) {
                        str4 = str7;
                    }
                    hd2Var.set(3, str4);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "parseLiveTheme: parse error! %s", e17.getMessage());
        }
        return hd2Var;
    }

    public static r45.mv4 s(java.util.Map map, java.lang.String str, int i17) {
        r45.mv4 mv4Var = new r45.mv4();
        int i18 = 0;
        mv4Var.set(0, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".createTime"), 0)));
        mv4Var.set(4, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".commentEggCount"), 0)));
        mv4Var.set(5, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".activityType"), 0)));
        mv4Var.set(6, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".isInnerQuickShare"), 0)));
        if (map.containsKey(str + ".desc")) {
            java.lang.String str2 = str + ".desc";
            mv4Var.set(2, new r45.ik2());
            ((r45.ik2) mv4Var.m75936x14adae67(2)).set(3, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str2 + ".fromRichPublisher"), 0)));
            ((r45.ik2) mv4Var.m75936x14adae67(2)).set(2, java.lang.Double.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str2 + ".pictureCutRatio"))));
            ((r45.ik2) mv4Var.m75936x14adae67(2)).set(6, java.lang.Double.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str2 + ".pictureCutRatioForFinder"))));
            ((r45.ik2) mv4Var.m75936x14adae67(2)).set(0, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1((java.lang.String) map.get(str2 + ".richTextJson"), new java.lang.Object[0]));
            ((r45.ik2) mv4Var.m75936x14adae67(2)).set(1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1((java.lang.String) map.get(str2 + ".richTextTitle"), new java.lang.Object[0]));
            int i19 = 0;
            while (i19 < i17) {
                r45.av4 av4Var = new r45.av4();
                java.lang.String str3 = str2 + ".customCropInfo";
                if (i19 > 0) {
                    str3 = str3 + i19;
                }
                av4Var.set(i18, java.lang.Double.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str3 + ".cropTop"))));
                av4Var.set(2, java.lang.Double.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str3 + ".cropBottom"))));
                av4Var.set(1, java.lang.Double.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str3 + ".cropLeft"))));
                av4Var.set(3, java.lang.Double.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str3 + ".cropRight"))));
                av4Var.set(4, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str3 + ".imageWidth"), 0)));
                av4Var.set(5, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str3 + ".imageHeight"), 0)));
                ((r45.ik2) mv4Var.m75936x14adae67(2)).m75941xfb821914(8).add(av4Var);
                i19++;
                i18 = 0;
            }
        }
        java.lang.String str4 = str + ".info";
        if (map.containsKey(str4)) {
            r45.jk2 jk2Var = new r45.jk2();
            for (int i27 = 0; i27 < i17; i27++) {
                r45.av4 av4Var2 = new r45.av4();
                java.lang.String str5 = str4 + ".pictureCropInfo";
                if (i27 > 0) {
                    str5 = str5 + i27;
                }
                av4Var2.set(0, java.lang.Double.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str5 + ".cropTop"))));
                av4Var2.set(2, java.lang.Double.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str5 + ".cropBottom"))));
                av4Var2.set(1, java.lang.Double.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str5 + ".cropLeft"))));
                av4Var2.set(3, java.lang.Double.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1((java.lang.String) map.get(str5 + ".cropRight"))));
                av4Var2.set(4, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str5 + ".imageWidth"), 0)));
                av4Var2.set(5, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str5 + ".imageHeight"), 0)));
                jk2Var.m75941xfb821914(9).add(av4Var2);
            }
            mv4Var.set(1, jk2Var);
        }
        return mv4Var;
    }

    public static r45.br2 t(java.lang.String str, java.util.Map map) {
        r45.br2 br2Var = new r45.br2();
        try {
            java.lang.String str2 = str + ".finderLiveProductShare";
            if (!map.isEmpty()) {
                br2Var.set(0, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".finderLiveID")));
                br2Var.set(1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".finderUsername")));
                br2Var.set(2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".finderObjectID")));
                br2Var.set(3, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".finderNonceID")));
                br2Var.set(4, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".liveStatus")));
                br2Var.set(5, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".appId")));
                br2Var.set(6, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".pagePath")));
                br2Var.set(7, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".productId")));
                br2Var.set(8, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".coverUrl")));
                br2Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".productTitle")));
                br2Var.set(10, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".marketPrice"))));
                br2Var.set(11, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".sellingPrice"))));
                br2Var.set(12, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".platformHeadImg")));
                br2Var.set(13, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".platformName")));
                br2Var.set(14, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".shopWindowId")));
                br2Var.set(15, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".flashSalePrice"))));
                br2Var.set(16, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) map.get(str2 + ".flashSaleEndTime"))));
                br2Var.set(17, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".ecSource")));
                br2Var.set(18, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".sellingPriceWording")));
                br2Var.set(19, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".platformIconURL")));
                br2Var.set(20, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".firstProductTagURL")));
                br2Var.set(21, java.lang.Float.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str2 + ".firstProductTagAspectRatioString"))));
                br2Var.set(22, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".secondProductTagURL")));
                br2Var.set(23, java.lang.Float.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1((java.lang.String) map.get(str2 + ".secondProductTagAspectRatioString"))));
                br2Var.set(24, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".firstGuaranteeWording")));
                br2Var.set(25, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".secondGuaranteeWording")));
                br2Var.set(26, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".thirdGuaranteeWording")));
                br2Var.set(27, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y((java.lang.String) map.get(str2 + ".isPriceBeginShow"), false)));
                br2Var.set(28, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".lastGMsgID")));
                br2Var.set(29, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".discountWording")));
                br2Var.set(30, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".promoterKey")));
                br2Var.set(32, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".priceSuffixDescription")));
                br2Var.set(33, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".productCardKey")));
                br2Var.set(34, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".isWxShop")));
                br2Var.set(35, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".brandIconUrl")));
                br2Var.set(36, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".rIconUrl")));
                br2Var.set(37, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".rIconUrlDarkMode")));
                br2Var.set(38, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".topShopIconUrl")));
                br2Var.set(39, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".topShopIconUrlDarkMode")));
                br2Var.set(40, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".simplifyTopShopIconUrl")));
                br2Var.set(41, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".simplifyTopShopIconUrlDarkmode")));
                br2Var.set(42, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".topShopIconWidth"))));
                br2Var.set(43, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".topShopIconHeight"))));
                br2Var.set(44, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".simplifyTopShopIconWidth"))));
                br2Var.set(45, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C1((java.lang.String) map.get(str2 + ".simplifyTopShopIconHeight"))));
                br2Var.set(46, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".maskPriceWording")));
                for (int i17 = 0; i17 < 10; i17++) {
                    java.lang.String str3 = str2 + ".showBoxItemStringList.showBoxItemString";
                    if (i17 > 0) {
                        str3 = str3 + i17;
                    }
                    if (!map.containsKey(str3)) {
                        break;
                    }
                    byte[] decode = android.util.Base64.decode((java.lang.String) map.get(str3), 2);
                    r45.p56 p56Var = new r45.p56();
                    if (decode != null) {
                        try {
                            p56Var.mo11468x92b714fd(decode);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "parse error! %s", e17.getMessage());
                        }
                    }
                    br2Var.m75941xfb821914(31).add(p56Var);
                }
                br2Var.set(47, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".richLabelTitleB64")));
                br2Var.set(48, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s1((java.lang.String) map.get(str2 + ".richShopDescB64")));
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderShareParser", "parse error! %s", e18.getMessage());
        }
        return br2Var;
    }
}

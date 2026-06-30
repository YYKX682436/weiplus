package zy2;

/* loaded from: classes9.dex */
public abstract class pc {
    public static java.lang.String a(r45.xs4 xs4Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (xs4Var != null) {
            try {
                sb6.append("<musicShareItem>");
                sb6.append("<mvObjectId>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(xs4Var.m75945x2fec8307(0)));
                sb6.append("</mvObjectId>");
                sb6.append("<mvNonceId>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(xs4Var.m75945x2fec8307(1)));
                sb6.append("</mvNonceId>");
                sb6.append("<mvCoverUrl>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(xs4Var.m75945x2fec8307(2)));
                sb6.append("</mvCoverUrl>");
                sb6.append("<mvMakerFinderNickname>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(xs4Var.m75945x2fec8307(3)));
                sb6.append("</mvMakerFinderNickname>");
                sb6.append("<mvSingerName>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(xs4Var.m75945x2fec8307(4)));
                sb6.append("</mvSingerName>");
                sb6.append("<mvAlbumName>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(xs4Var.m75945x2fec8307(5)));
                sb6.append("</mvAlbumName>");
                sb6.append("<mvMusicGenre>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(xs4Var.m75945x2fec8307(7)));
                sb6.append("</mvMusicGenre>");
                sb6.append("<mvIssueDate>");
                sb6.append(xs4Var.m75942xfb822ef2(8));
                sb6.append("</mvIssueDate>");
                sb6.append("<mvIdentification>");
                java.lang.String m75945x2fec8307 = xs4Var.m75945x2fec8307(9);
                java.lang.String str = "";
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                sb6.append(ot0.q.g(m75945x2fec8307));
                sb6.append("</mvIdentification>");
                sb6.append("<musicDuration>");
                sb6.append(xs4Var.m75939xb282bd08(10));
                sb6.append("</musicDuration>");
                sb6.append("<mvExtInfo>");
                java.lang.String m75945x2fec83072 = xs4Var.m75945x2fec8307(6);
                if (m75945x2fec83072 != null) {
                    str = m75945x2fec83072;
                }
                sb6.append(ot0.q.g(str));
                sb6.append("</mvExtInfo>");
                sb6.append("<mvOperationUrl>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(xs4Var.m75945x2fec8307(12)));
                sb6.append("</mvOperationUrl>");
                sb6.append("<mid>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(xs4Var.m75945x2fec8307(11)));
                sb6.append("</mid>");
                sb6.append("<appIdForSourceDisplay>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(xs4Var.m75945x2fec8307(17)));
                sb6.append("</appIdForSourceDisplay>");
                sb6.append("</musicShareItem>");
                if (xs4Var.m75939xb282bd08(18) > 0) {
                    sb6.append("<tingListenItem>");
                    sb6.append("<type>");
                    sb6.append(xs4Var.m75939xb282bd08(18));
                    sb6.append("</type>");
                    sb6.append("<listenId>");
                    sb6.append(xs4Var.m75945x2fec8307(20));
                    sb6.append("</listenId>");
                    sb6.append("<listenItem>");
                    sb6.append(xs4Var.m75945x2fec8307(19));
                    sb6.append("</listenItem>");
                    sb6.append("</tingListenItem>");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicMvShareParser", "make content error! %s", e17.getMessage());
            }
        }
        return sb6.toString();
    }

    public static r45.xs4 b(java.lang.String str, java.util.Map map) {
        r45.xs4 xs4Var = new r45.xs4();
        try {
            java.lang.String str2 = str + ".musicShareItem";
            if (!map.isEmpty()) {
                java.lang.String str3 = str + ".tingListenItem";
                java.lang.String str4 = (java.lang.String) map.get(str2 + ".mvObjectId");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                xs4Var.set(0, str4);
                java.lang.String str6 = (java.lang.String) map.get(str2 + ".mvNonceId");
                if (str6 == null) {
                    str6 = "";
                }
                xs4Var.set(1, str6);
                java.lang.String str7 = (java.lang.String) map.get(str2 + ".mvCoverUrl");
                if (str7 == null) {
                    str7 = "";
                }
                xs4Var.set(2, str7);
                java.lang.String str8 = (java.lang.String) map.get(str2 + ".mvMakerFinderNickname");
                if (str8 == null) {
                    str8 = "";
                }
                xs4Var.set(3, str8);
                java.lang.String str9 = (java.lang.String) map.get(str2 + ".mvSingerName");
                if (str9 == null) {
                    str9 = "";
                }
                xs4Var.set(4, str9);
                java.lang.String str10 = (java.lang.String) map.get(str2 + ".mvAlbumName");
                if (str10 == null) {
                    str10 = "";
                }
                xs4Var.set(5, str10);
                java.lang.String str11 = (java.lang.String) map.get(str2 + ".mvMusicGenre");
                if (str11 == null) {
                    str11 = "";
                }
                xs4Var.set(7, str11);
                xs4Var.set(8, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1((java.lang.String) map.get(str2 + ".mvIssueDate"))));
                java.lang.String str12 = (java.lang.String) map.get(str2 + ".mvIdentification");
                if (str12 == null) {
                    str12 = "";
                }
                xs4Var.set(9, str12);
                xs4Var.set(10, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str2 + ".musicDuration"), 0)));
                java.lang.String str13 = (java.lang.String) map.get(str2 + ".mvExtInfo");
                if (str13 == null) {
                    str13 = "";
                }
                xs4Var.set(6, str13);
                java.lang.String str14 = (java.lang.String) map.get(str2 + ".mvOperationUrl");
                if (str14 == null) {
                    str14 = "";
                }
                xs4Var.set(12, str14);
                java.lang.String str15 = (java.lang.String) map.get(str2 + ".mid");
                if (str15 == null) {
                    str15 = "";
                }
                xs4Var.set(11, str15);
                java.lang.String str16 = (java.lang.String) map.get(str2 + ".appIdForSourceDisplay");
                if (str16 == null) {
                    str16 = "";
                }
                xs4Var.set(17, str16);
                xs4Var.set(18, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str3 + ".type"), 0)));
                java.lang.String str17 = (java.lang.String) map.get(str3 + ".listenItem");
                if (str17 == null) {
                    str17 = "";
                }
                xs4Var.set(19, str17);
                java.lang.String str18 = (java.lang.String) map.get(str3 + ".listenId");
                if (str18 != null) {
                    str5 = str18;
                }
                xs4Var.set(20, str5);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicMvShareParser", "parse error! %s", e17.getMessage());
        }
        return xs4Var;
    }
}

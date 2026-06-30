package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public abstract class t3 {

    /* renamed from: a, reason: collision with root package name */
    public static int f276857a = 10;

    public static boolean a(int i17) {
        return i17 == 203 || i17 == 2001 || i17 == 2004 || i17 == 2005 || i17 == 2003;
    }

    public static int b(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        char c17 = 65535;
        switch (str.hashCode()) {
            case -2146424236:
                if (str.equals("adDetail")) {
                    c17 = 0;
                    break;
                }
                break;
            case -2076650431:
                if (str.equals("timeline")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1892013107:
                if (str.equals("editCover")) {
                    c17 = 2;
                    break;
                }
                break;
            case -1680466457:
                if (str.equals("changeCover")) {
                    c17 = 3;
                    break;
                }
                break;
            case -1451958199:
                if (str.equals("messageSetting")) {
                    c17 = 4;
                    break;
                }
                break;
            case -1335224239:
                if (str.equals("detail")) {
                    c17 = 5;
                    break;
                }
                break;
            case -1078169490:
                if (str.equals("me_tab")) {
                    c17 = 6;
                    break;
                }
                break;
            case -920409781:
                if (str.equals("albumV2")) {
                    c17 = 7;
                    break;
                }
                break;
            case -906336856:
                if (str.equals(ya.a.f77450x918d59a8)) {
                    c17 = '\b';
                    break;
                }
                break;
            case -266832054:
                if (str.equals("userHome")) {
                    c17 = '\t';
                    break;
                }
                break;
            case -235365105:
                if (str.equals("publish")) {
                    c17 = '\n';
                    break;
                }
                break;
            case -196315310:
                if (str.equals("gallery")) {
                    c17 = 11;
                    break;
                }
                break;
            case -147143286:
                if (str.equals("userTop")) {
                    c17 = '\f';
                    break;
                }
                break;
            case -146498739:
                if (str.equals("recentlyFriends")) {
                    c17 = '\r';
                    break;
                }
                break;
            case 92896879:
                if (str.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37635xb5a3973f)) {
                    c17 = 14;
                    break;
                }
                break;
            case 485611823:
                if (str.equals("visibilityShow")) {
                    c17 = 15;
                    break;
                }
                break;
            case 783391388:
                if (str.equals("ws_fold_timeline")) {
                    c17 = 16;
                    break;
                }
                break;
            case 954925063:
                if (str.equals(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) {
                    c17 = 17;
                    break;
                }
                break;
            case 1168387810:
                if (str.equals("finderCoverDetail")) {
                    c17 = 18;
                    break;
                }
                break;
            case 1187766710:
                if (str.equals("platformProfile")) {
                    c17 = 19;
                    break;
                }
                break;
            case 1251946977:
                if (str.equals("platformWeb")) {
                    c17 = 20;
                    break;
                }
                break;
            case 1330711262:
                if (str.equals("visibilitySetting")) {
                    c17 = 21;
                    break;
                }
                break;
            case 1408627678:
                if (str.equals("textDetail")) {
                    c17 = 22;
                    break;
                }
                break;
            case 1455652693:
                if (str.equals("recentlyFriendsSearch")) {
                    c17 = 23;
                    break;
                }
                break;
            case 1561293144:
                if (str.equals("unreadMessage")) {
                    c17 = 24;
                    break;
                }
                break;
            case 1979886754:
                if (str.equals("sendCmt")) {
                    c17 = 25;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return 12;
            case 1:
                return 1;
            case 2:
                return 14;
            case 3:
                return 13;
            case 4:
                return 11;
            case 5:
                return 4;
            case 6:
                return 10002;
            case 7:
            case 14:
                return 3;
            case '\b':
                return 19;
            case '\t':
                return 2;
            case '\n':
                return 6;
            case 11:
                return 5;
            case '\f':
                return 9;
            case '\r':
                return 21;
            case 15:
                return 22;
            case 16:
                return 8;
            case 17:
                return 7;
            case 18:
                return 15;
            case 19:
                return 10001;
            case 20:
                return 18;
            case 21:
                return 20;
            case 22:
                return 17;
            case 23:
                return 23;
            case 24:
                return 10;
            case 25:
                return 16;
            default:
                return 0;
        }
    }
}

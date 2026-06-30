package pl3;

/* loaded from: classes15.dex */
public abstract class a {
    public static int a(java.lang.String str) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54248xb24ba796.equalsIgnoreCase(str)) {
            return 1;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54249xb24ba8ad.equalsIgnoreCase(str)) {
            return 2;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54258x7b032c6e.equalsIgnoreCase(str) || "audio/mp3".equalsIgnoreCase(str)) {
            return 3;
        }
        if ("audio/mp4a-latm".equalsIgnoreCase(str) || str.startsWith(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54257xb16332e8)) {
            return 4;
        }
        if ("audio/qcelp".equalsIgnoreCase(str)) {
            return 5;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54266xd63d2e3c.equalsIgnoreCase(str)) {
            return 6;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54262x7b041728.equalsIgnoreCase(str)) {
            return 7;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54247x7afda88a.equalsIgnoreCase(str)) {
            return 8;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54256x7b031cfe.equalsIgnoreCase(str)) {
            return 9;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54263xb16343ff.equalsIgnoreCase(str)) {
            return 10;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54255x7affee51.equalsIgnoreCase(str)) {
            return 11;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54261xe563c7b2.equalsIgnoreCase(str)) {
            return 12;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54244xb1630448.equalsIgnoreCase(str)) {
            return 13;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54253xe4f8678e.equalsIgnoreCase(str)) {
            return 14;
        }
        if ("audio/x-ms-wma".equalsIgnoreCase(str)) {
            return 15;
        }
        if ("audio/x-wav".equalsIgnoreCase(str)) {
            return 16;
        }
        return ("audio/x-ape".equalsIgnoreCase(str) || "application/x-ape".equalsIgnoreCase(str)) ? 17 : 0;
    }

    public static int b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayIdKeyReport", "getMusicPlayerErrIdKey, errCode:" + i17);
        switch (i17) {
            case 700:
                return 45;
            case 701:
                return 48;
            case 702:
                return 39;
            case 703:
                return 40;
            case 704:
                return 41;
            case 705:
                return 42;
            case 706:
                return 43;
            case 707:
                return 44;
            default:
                return 189;
        }
    }

    public static int c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicPlayIdKeyReport", "getQQMusicPlayerErrIdKey, errCode:" + i17);
        if (i17 == 66) {
            return 23;
        }
        if (i17 == 67) {
            return 24;
        }
        if (i17 == 69) {
            return 25;
        }
        if (i17 == 70) {
            return 36;
        }
        if (i17 == 74) {
            return 26;
        }
        if (i17 == 80) {
            return 27;
        }
        if (i17 == 101) {
            return 28;
        }
        if (i17 == 102) {
            return 29;
        }
        if (i17 == 700) {
            return 37;
        }
        if (i17 == 701) {
            return 38;
        }
        switch (i17) {
            case 53:
                return 17;
            case 54:
                return 18;
            case 55:
                return 19;
            default:
                switch (i17) {
                    case 62:
                        return 20;
                    case 63:
                        return 21;
                    case 64:
                        return 22;
                    default:
                        switch (i17) {
                            case 500:
                                return 31;
                            case 501:
                                return 32;
                            case 502:
                                return 33;
                            case 503:
                                return 34;
                            case 504:
                                return 35;
                            default:
                                return 30;
                        }
                }
        }
    }
}

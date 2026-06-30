package ri;

/* loaded from: classes12.dex */
public class h0 {
    public final java.lang.String a() {
        java.lang.String str = (java.lang.String) com.p314xaae8f345.mm.app.C4999x403c3a42.f134763k.f135260q.c(false);
        return str != null ? str.replace(',', ';') : "";
    }

    public final int b(java.lang.String str) {
        if (str.equalsIgnoreCase(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)) {
            return 1033;
        }
        if (str.equalsIgnoreCase(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":tools")) {
            return 1187;
        }
        if (str.equalsIgnoreCase(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":push")) {
            return 1189;
        }
        if (str.startsWith(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":appbrand")) {
            return 1190;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n.f34699x366c91de;
    }

    public final int c(java.lang.String str) {
        if (str.endsWith("SnsTimeLineUI")) {
            return 0;
        }
        if (str.endsWith("ChattingUIFragment") || str.endsWith("ChattingUI")) {
            return 20;
        }
        if (str.endsWith("MainUI")) {
            return 40;
        }
        if (str.endsWith("FinderHomeUI") || str.endsWith("FinderHomeAffinityUI")) {
            return 100;
        }
        if (str.endsWith("FinderProfileUI")) {
            return 120;
        }
        if (str.endsWith("FinderTimelineLbsUI")) {
            return 140;
        }
        return str.endsWith("AddressUI") ? 160 : -1;
    }

    public final int d(java.lang.String str) {
        if (str.equalsIgnoreCase(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)) {
            return 1192;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        sb6.append(":tools");
        return str.equalsIgnoreCase(sb6.toString()) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.r.f34705x366c91de : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n.f34699x366c91de;
    }
}

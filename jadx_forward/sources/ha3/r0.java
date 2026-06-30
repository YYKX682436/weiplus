package ha3;

/* loaded from: classes12.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ha3.r0 f361463a = new ha3.r0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f361464b = new java.util.LinkedHashMap();

    public final java.lang.String a(java.lang.String mainMediaId, java.lang.String fileName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainMediaId, "mainMediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        if (!r26.i0.n(fileName, ".ts", false)) {
            return mainMediaId;
        }
        return mainMediaId + '@' + fileName;
    }

    public final com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest b(dn.o info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
        c2CDownloadRequest.f17794xb4089397 = info.f69591xf9dbbe9c;
        c2CDownloadRequest.f17792xcd096f43 = info.f69601xaca5bdda;
        c2CDownloadRequest.f17767xab4b3f30 = info.f69575xf11df5f5;
        c2CDownloadRequest.url = info.f323344z;
        c2CDownloadRequest.m37861xfb0731c4(info.f69595x6d25b0d9);
        c2CDownloadRequest.f17842x8460e80b = info.f323324l1;
        int i17 = info.f323322h;
        c2CDownloadRequest.f17775x596916e = i17;
        int i18 = info.f69580x454032b6;
        c2CDownloadRequest.f17769xd0bc10db = i18;
        int i19 = info.f69592xf1ebe47b;
        c2CDownloadRequest.f17793xd428dad6 = i19;
        c2CDownloadRequest.f17774x383344a3 = info.P;
        if (i17 == 1) {
            c2CDownloadRequest.f17783x5be456ba = com.p314xaae8f345.mm.p1004x2137b148.C11327xbf69711b.f33341x2e20ff8b;
        } else if (i17 == 2) {
            c2CDownloadRequest.f17783x5be456ba = com.p314xaae8f345.mm.p1004x2137b148.C11327xbf69711b.f33344x1bbb74e9;
        } else if (i17 != 3) {
            if (i17 != 8) {
                java.lang.String url = c2CDownloadRequest.url;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "url");
                if (!(url.length() == 0)) {
                    c2CDownloadRequest.f17783x5be456ba = com.p314xaae8f345.mm.p1004x2137b148.C11327xbf69711b.f33348xd7d481fd;
                }
            } else {
                c2CDownloadRequest.f17783x5be456ba = com.p314xaae8f345.mm.p1004x2137b148.C11327xbf69711b.f33349x1b03b35f;
            }
        } else if (i18 < 100 || i18 > 117 || i19 != 20201) {
            c2CDownloadRequest.f17783x5be456ba = com.p314xaae8f345.mm.p1004x2137b148.C11327xbf69711b.f33350x62f14787;
        } else {
            c2CDownloadRequest.f17783x5be456ba = com.p314xaae8f345.mm.p1004x2137b148.C11327xbf69711b.f33346xde4f5eff;
        }
        return c2CDownloadRequest;
    }
}

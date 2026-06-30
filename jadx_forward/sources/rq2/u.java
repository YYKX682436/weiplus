package rq2;

/* loaded from: classes15.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final rq2.u f480422a = new rq2.u();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f480423b = "";

    public static void c(rq2.u uVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, int i17, java.lang.Object obj) {
        java.lang.String str5;
        long parseLong;
        java.lang.String userName = (i17 & 1) != 0 ? "" : str;
        java.lang.String country = (i17 & 2) != 0 ? "" : str2;
        java.lang.String city = (i17 & 4) != 0 ? "" : str3;
        java.lang.String district = (i17 & 8) != 0 ? "" : str4;
        long j47 = (i17 & 16) != 0 ? 0L : j17;
        long j48 = (i17 & 64) != 0 ? 0L : j19;
        long j49 = (i17 & 128) != 0 ? 0L : j27;
        long j57 = (i17 & 256) != 0 ? 0L : j28;
        long j58 = (i17 & 512) != 0 ? 0L : j29;
        long j59 = (i17 & 1024) != 0 ? 0L : j37;
        long j66 = (i17 & 2048) != 0 ? 0L : j38;
        long j67 = (i17 & 4096) != 0 ? 0L : j39;
        uVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(country, "country");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(city, "city");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(district, "district");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6352xa5ba012a c6352xa5ba012a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6352xa5ba012a();
        if (android.text.TextUtils.isEmpty(f480423b)) {
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            f480423b = Ri;
        }
        long j68 = j57;
        long j69 = j49;
        c6352xa5ba012a.f136998d = c6352xa5ba012a.b("sessionid", f480423b, true);
        c6352xa5ba012a.f136999e = c6352xa5ba012a.b("contextid", rq2.x.f480448b, true);
        c6352xa5ba012a.f137000f = c6352xa5ba012a.b("clickTabContextid", rq2.x.f480451e, true);
        long j76 = 0;
        c6352xa5ba012a.f137001g = 0L;
        c6352xa5ba012a.f137008n = c6352xa5ba012a.b("nearby_username", userName, true);
        c6352xa5ba012a.f137010p = c6352xa5ba012a.b("country", country, true);
        c6352xa5ba012a.f137009o = c6352xa5ba012a.b("city", city, true);
        try {
            str5 = r26.n0.B(district, " - ", false) ? district.subSequence(r26.n0.L(district, " - ", 0, false, 6, null) + 3, district.length()).toString() : "";
            try {
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NearbyPersonReporter", th.toString());
                c6352xa5ba012a.f137002h = j76;
                c6352xa5ba012a.f137003i = c6352xa5ba012a.b("district", str5, true);
                c6352xa5ba012a.f137004j = j47;
                c6352xa5ba012a.f137005k = j18;
                c6352xa5ba012a.f137006l = c01.id.c();
                c6352xa5ba012a.f137007m = j48;
                c6352xa5ba012a.f137011q = j69;
                c6352xa5ba012a.f137012r = j68;
                c6352xa5ba012a.f137013s = j58;
                c6352xa5ba012a.f137014t = j59;
                c6352xa5ba012a.f137015u = j66;
                c6352xa5ba012a.f137016v = j67;
                c6352xa5ba012a.k();
                c6352xa5ba012a.n();
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            str5 = "";
        }
        if (!r26.n0.B(district, "公里", false)) {
            if (r26.n0.B(district, "米", false)) {
                parseLong = java.lang.Long.parseLong(district.subSequence(0, r26.n0.L(district, "米", 0, false, 6, null)).toString());
            }
            c6352xa5ba012a.f137002h = j76;
            c6352xa5ba012a.f137003i = c6352xa5ba012a.b("district", str5, true);
            c6352xa5ba012a.f137004j = j47;
            c6352xa5ba012a.f137005k = j18;
            c6352xa5ba012a.f137006l = c01.id.c();
            c6352xa5ba012a.f137007m = j48;
            c6352xa5ba012a.f137011q = j69;
            c6352xa5ba012a.f137012r = j68;
            c6352xa5ba012a.f137013s = j58;
            c6352xa5ba012a.f137014t = j59;
            c6352xa5ba012a.f137015u = j66;
            c6352xa5ba012a.f137016v = j67;
            c6352xa5ba012a.k();
            c6352xa5ba012a.n();
        }
        parseLong = java.lang.Long.parseLong(district.subSequence(0, r26.n0.L(district, "公里", 0, false, 6, null)).toString()) * 1000;
        j76 = parseLong;
        c6352xa5ba012a.f137002h = j76;
        c6352xa5ba012a.f137003i = c6352xa5ba012a.b("district", str5, true);
        c6352xa5ba012a.f137004j = j47;
        c6352xa5ba012a.f137005k = j18;
        c6352xa5ba012a.f137006l = c01.id.c();
        c6352xa5ba012a.f137007m = j48;
        c6352xa5ba012a.f137011q = j69;
        c6352xa5ba012a.f137012r = j68;
        c6352xa5ba012a.f137013s = j58;
        c6352xa5ba012a.f137014t = j59;
        c6352xa5ba012a.f137015u = j66;
        c6352xa5ba012a.f137016v = j67;
        c6352xa5ba012a.k();
        c6352xa5ba012a.n();
    }

    public final void a(int i17) {
        long j17 = 3;
        switch (i17) {
            case 1:
                j17 = 1;
                break;
            case 2:
                j17 = 2;
                break;
            case 4:
                j17 = 4;
                break;
            case 5:
                j17 = 5;
                break;
            case 6:
                j17 = 6;
                break;
        }
        c(this, null, null, null, null, 0L, 3L, j17, 0L, 0L, 0L, 0L, 0L, 0L, 8095, null);
    }

    public final void b(long j17) {
        c(this, "", null, null, null, 0L, j17, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8158, null);
    }
}

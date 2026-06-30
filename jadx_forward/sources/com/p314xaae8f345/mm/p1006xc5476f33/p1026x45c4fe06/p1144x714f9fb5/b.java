package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f167044a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f167045b = new java.lang.Object();

    public static boolean a(java.lang.String str) {
        synchronized (f167045b) {
            java.util.HashMap hashMap = f167044a;
            if (!hashMap.containsKey(str)) {
                return false;
            }
            return ((java.lang.Boolean) hashMap.get(str)).booleanValue();
        }
    }

    public static void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationReport", "notifyRemoteProcessReport appId:%s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationReport", "notify runtime");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.C12398x24351782 c12398x24351782 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.C12398x24351782();
        c12398x24351782.f167021d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167033b;
        c12398x24351782.f167022e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167034c;
        c12398x24351782.f167023f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167035d;
        c12398x24351782.f167024g = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167037f;
        c12398x24351782.f167025h = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167036e;
        c12398x24351782.f167026i = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167038g;
        c12398x24351782.f167027m = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167039h;
        c12398x24351782.f167028n = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167040i;
        c12398x24351782.f167029o = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167041j;
        c12398x24351782.f167030p = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.a.f167042k;
        c12398x24351782.f167031q = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m0.b(str, c12398x24351782);
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.C12398x24351782 c12398x24351782, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationReport", "reportLocationInfo appId:%s, username:%s, scene:%d, longitude:%f, latitude:%f, locType:%d, accuracy:%f, altitude:%f, sessionId:%s", c12398x24351782.f167021d, c12398x24351782.f167022e, java.lang.Integer.valueOf(c12398x24351782.f167023f), java.lang.Double.valueOf(c12398x24351782.f167025h), java.lang.Double.valueOf(c12398x24351782.f167024g), java.lang.Integer.valueOf(c12398x24351782.f167026i), java.lang.Double.valueOf(c12398x24351782.f167028n), java.lang.Double.valueOf(c12398x24351782.f167029o), str);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7140x183e9c18 c7140x183e9c18 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7140x183e9c18();
        c7140x183e9c18.f144499e = c7140x183e9c18.b("appid", c12398x24351782.f167021d, true);
        c7140x183e9c18.f144500f = c12398x24351782.f167023f;
        c7140x183e9c18.f144502h = c7140x183e9c18.b("latitude", "" + c12398x24351782.f167024g, true);
        c7140x183e9c18.f144501g = c7140x183e9c18.b("longitude", "" + c12398x24351782.f167025h, true);
        c7140x183e9c18.f144503i = c7140x183e9c18.b("accuracy", "" + c12398x24351782.f167028n, true);
        c7140x183e9c18.f144505k = c7140x183e9c18.b("altitude", "" + c12398x24351782.f167029o, true);
        c7140x183e9c18.f144504j = c7140x183e9c18.b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54483x1466c762, "" + c12398x24351782.f167027m, true);
        c7140x183e9c18.f144498d = c7140x183e9c18.b("sessionid", str, true);
        c7140x183e9c18.f144506l = c7140x183e9c18.b("verticalAccuracy", "", true);
        c7140x183e9c18.f144507m = c7140x183e9c18.b("horizontalAccuracy", "", true);
        c7140x183e9c18.f144508n = c12398x24351782.f167030p;
        c7140x183e9c18.k();
    }

    public static void d(final java.lang.String str, int i17, final java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationReport", "requestReportLocation appId:%s, scene:%d, sessionId:%s", str, java.lang.Integer.valueOf(i17), str2);
        if (i17 == 1012 || i17 == 1013 || i17 == 1011 || i17 == 1048 || i17 == 1047 || i17 == 1049 || i17 == 1050 || i17 == 1104 || i17 == 1271 || i17 == 1089) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.d.class, new com.p314xaae8f345.mm.p794xb0fa9b5e.r() { // from class: com.tencent.mm.plugin.appbrand.location.b$$a
                @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
                public final void a(java.lang.Object obj) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.C12398x24351782 c12398x24351782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.C12398x24351782) obj;
                    java.lang.String str3 = str;
                    boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.b.a(str3);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationReport", "isReported:%b, canReport:%b", java.lang.Boolean.valueOf(a17), java.lang.Boolean.valueOf(c12398x24351782.f167031q));
                    if (!c12398x24351782.f167031q || a17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationReport", "not need report location");
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLocationReport", "report location");
                    synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.b.f167045b) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.b.f167044a.put(str3, java.lang.Boolean.TRUE);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1144x714f9fb5.b.c(c12398x24351782, str2);
                }
            });
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* loaded from: classes7.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f169460a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f169461b;

    static {
        java.io.InputStream inputStream;
        try {
            inputStream = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("15007_api_list.txt");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiInvokeReportProtocol", e17, "open read 15007_api_list.txt", new java.lang.Object[0]);
            inputStream = null;
        }
        if (inputStream != null) {
            java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream);
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader);
            while (true) {
                try {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(readLine)) {
                            f169460a.add(readLine);
                        }
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.JsApiInvokeReportProtocol", e18, "readLine()", new java.lang.Object[0]);
                    }
                } finally {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStreamReader);
                }
            }
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.e0.f169474e = new java.util.Random().nextInt(1000000) % 1000000 < 100;
        f169461b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.a0();
    }
}

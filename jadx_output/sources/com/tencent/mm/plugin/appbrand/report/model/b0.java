package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f87927a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f87928b;

    static {
        java.io.InputStream inputStream;
        try {
            inputStream = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("15007_api_list.txt");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiInvokeReportProtocol", e17, "open read 15007_api_list.txt", new java.lang.Object[0]);
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
                        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(readLine)) {
                            f87927a.add(readLine);
                        }
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiInvokeReportProtocol", e18, "readLine()", new java.lang.Object[0]);
                    }
                } finally {
                    com.tencent.mm.sdk.platformtools.t8.v1(bufferedReader);
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStreamReader);
                }
            }
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.appbrand.report.model.e0.f87941e = new java.util.Random().nextInt(1000000) % 1000000 < 100;
        f87928b = new com.tencent.mm.plugin.appbrand.report.model.a0();
    }
}

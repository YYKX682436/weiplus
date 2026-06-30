package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f83696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83697e;

    public w1(com.tencent.mm.plugin.appbrand.y yVar, java.lang.String str) {
        this.f83696d = yVar;
        this.f83697e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.y yVar = this.f83696d;
        java.lang.String str = this.f83697e;
        try {
            java.net.URLConnection openConnection = new java.net.URL("https://weapp.tencent.com/weapplib_coverage/saveCoverageData").openConnection();
            kotlin.jvm.internal.o.e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
            kotlin.jvm.internal.o.f(outputStream, "getOutputStream(...)");
            java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(outputStream, r26.c.f368865a);
            java.io.BufferedWriter bufferedWriter = outputStreamWriter instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) outputStreamWriter : new java.io.BufferedWriter(outputStreamWriter, 8192);
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            httpURLConnection.getOutputStream().close();
            com.tencent.mars.xlog.Log.i("Luggage.JSCoverageUtils", "reportCoverage for appId:" + yVar.getAppId() + ", responseCode:" + httpURLConnection.getResponseCode() + ", data:" + str);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("Luggage.JSCoverageUtils", "reportCoverage for appId:" + yVar.getAppId() + ", get exception:" + e17 + ", data:" + str);
        }
    }
}

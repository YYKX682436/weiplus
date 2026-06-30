package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f165229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165230e;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, java.lang.String str) {
        this.f165229d = yVar;
        this.f165230e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f165229d;
        java.lang.String str = this.f165230e;
        try {
            java.net.URLConnection openConnection = new java.net.URL("https://weapp.tencent.com/weapplib_coverage/saveCoverageData").openConnection();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(outputStream, "getOutputStream(...)");
            java.io.Writer outputStreamWriter = new java.io.OutputStreamWriter(outputStream, r26.c.f450398a);
            java.io.BufferedWriter bufferedWriter = outputStreamWriter instanceof java.io.BufferedWriter ? (java.io.BufferedWriter) outputStreamWriter : new java.io.BufferedWriter(outputStreamWriter, 8192);
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            httpURLConnection.getOutputStream().close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JSCoverageUtils", "reportCoverage for appId:" + yVar.mo48798x74292566() + ", responseCode:" + httpURLConnection.getResponseCode() + ", data:" + str);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.JSCoverageUtils", "reportCoverage for appId:" + yVar.mo48798x74292566() + ", get exception:" + e17 + ", data:" + str);
        }
    }
}

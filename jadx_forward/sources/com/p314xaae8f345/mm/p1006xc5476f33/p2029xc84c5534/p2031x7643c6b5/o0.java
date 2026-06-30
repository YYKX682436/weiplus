package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes11.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Callable f239826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f239827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f239828f;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var, java.util.concurrent.Callable callable, java.lang.String str, long j17) {
        this.f239826d = callable;
        this.f239827e = str;
        this.f239828f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        int i17;
        java.io.InputStream inputStream = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && gm0.j1.a()) {
            i17 = gm0.j1.b().h();
            str = gm0.j1.u().c() == null ? null : c01.z1.r();
        } else {
            str = null;
            i17 = 0;
        }
        try {
            try {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0).getString("support.weixin.qq.com", "support.weixin.qq.com");
                org.json.JSONArray jSONArray = (org.json.JSONArray) this.f239826d.call();
                int length = jSONArray.length();
                for (int i18 = 0; i18 < length; i18++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                    jSONObject.put("tag", this.f239827e);
                    jSONObject.put("uin", i17);
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONObject put = new org.json.JSONObject().put("protocol_ver", 1).put("phone", o45.wf.f424559d).put("os_ver", wo.q.f529313a).put("report_time", this.f239828f);
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                byte[] bytes = jSONObject2.put("head", put.put("revision", str2)).put("items", jSONArray).toString().getBytes();
                int length2 = bytes.length;
                java.lang.String lowerCase = kk.k.g(java.lang.String.format("weixin#$()%d%d", java.lang.Integer.valueOf(o45.wf.f424562g), java.lang.Integer.valueOf(length2)).getBytes()).toLowerCase();
                byte[] a17 = kk.y.a(bytes);
                com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
                kk.d.b(c19764x527bffc1, a17, lowerCase.getBytes());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
                sb6.append("https://");
                sb6.append(string);
                sb6.append("/cgi-bin/mmsupport-bin/stackreport");
                sb6.append("?version=");
                sb6.append(java.lang.Integer.toHexString(o45.wf.f424562g));
                sb6.append("&devicetype=");
                sb6.append(wo.q.f529313a);
                sb6.append("&filelength=");
                sb6.append(length2);
                sb6.append("&sum=");
                sb6.append(lowerCase);
                sb6.append("&reporttype=1&NewReportType=110");
                if (str != null && str.length() != 0) {
                    sb6.append("&username=");
                    sb6.append(str);
                }
                java.lang.String sb7 = sb6.toString();
                org.apache.http.impl.client.DefaultHttpClient defaultHttpClient = new org.apache.http.impl.client.DefaultHttpClient();
                org.apache.http.client.methods.HttpPost httpPost = new org.apache.http.client.methods.HttpPost(sb7);
                org.apache.http.entity.ByteArrayEntity byteArrayEntity = new org.apache.http.entity.ByteArrayEntity(c19764x527bffc1.f38861x6ac9171);
                byteArrayEntity.setContentType("binary/octet-stream");
                httpPost.setEntity(byteArrayEntity);
                inputStream = defaultHttpClient.execute(httpPost).getEntity().getContent();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.cLog", "POST returned: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(inputStream));
                if (inputStream == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ReportManagerKvCheck", e17, "Failed to upload cLog.", new java.lang.Object[0]);
                if (inputStream == null) {
                    return;
                }
            }
            try {
                inputStream.close();
            } catch (java.io.IOException unused) {
            }
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused2) {
                }
            }
            throw th6;
        }
    }
}

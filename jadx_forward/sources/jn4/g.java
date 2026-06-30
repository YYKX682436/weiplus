package jn4;

/* loaded from: classes11.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f382332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 f382334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jn4.h f382335g;

    public g(jn4.h hVar, int i17, java.lang.String str, com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1) {
        this.f382335g = hVar;
        this.f382332d = i17;
        this.f382333e = str;
        this.f382334f = c19764x527bffc1;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0).getString("support.weixin.qq.com", "support.weixin.qq.com");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(str + "/cgi-bin/mmsupport-bin/stackreport?version=");
        stringBuffer.append(java.lang.Integer.toHexString(o45.wf.f424562g));
        stringBuffer.append("&devicetype=");
        stringBuffer.append(wo.q.f529313a);
        stringBuffer.append("&filelength=");
        stringBuffer.append(this.f382332d);
        stringBuffer.append("&sum=");
        stringBuffer.append(this.f382333e);
        stringBuffer.append("&reporttype=4");
        jn4.h hVar = this.f382335g;
        java.lang.String str2 = hVar.f382336d.f382352d;
        if (str2 != null && !str2.equals("")) {
            stringBuffer.append("&username=");
            stringBuffer.append(hVar.f382336d.f382352d);
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        byte[] bArr = this.f382334f.f38861x6ac9171;
        int i17 = 3;
        while (true) {
            int i18 = i17 - 1;
            jn4.m mVar = hVar.f382336d;
            if (i17 <= 0) {
                jn4.m.a(mVar);
                return;
            }
            org.apache.http.impl.client.DefaultHttpClient defaultHttpClient = new org.apache.http.impl.client.DefaultHttpClient();
            org.apache.http.client.methods.HttpPost httpPost = new org.apache.http.client.methods.HttpPost(stringBuffer2);
            try {
                org.apache.http.entity.ByteArrayEntity byteArrayEntity = new org.apache.http.entity.ByteArrayEntity(bArr);
                byteArrayEntity.setContentType("binary/octet-stream");
                httpPost.setEntity(byteArrayEntity);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTraceRoute", "http pose returnContent : " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(defaultHttpClient.execute(httpPost).getEntity().getContent()));
                jn4.d dVar = mVar.f382355g;
                if (dVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.y) dVar).f256875a.f256876a.f256850m.mo50305x3d8a09a2(4);
                    return;
                }
                return;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "http post IOException: " + e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTraceRoute", e17, "", new java.lang.Object[0]);
            } catch (java.lang.IllegalStateException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "http post IllegalStateException: " + e18.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTraceRoute", e18, "", new java.lang.Object[0]);
            }
            i17 = i18;
        }
    }
}

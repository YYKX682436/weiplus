package com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e;

/* renamed from: com.tencent.tmassistantsdk.network.GetHttpRequest */
/* loaded from: classes13.dex */
public abstract class AbstractC26691x125a6bd1 {

    /* renamed from: REQUEST_SERVER_URL */
    protected static final java.lang.String f56257x96180e23 = "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxw) + "/cgi-bin/appstage/yyb_get_userapp_info";
    protected static final java.lang.String TAG = "NetworkTask";

    /* renamed from: mHttpGet */
    protected org.apache.http.client.methods.HttpGet f56258xe8299481 = null;

    /* renamed from: onFinished */
    public abstract void mo104999x7cf2e371(org.json.JSONObject jSONObject, int i17);

    /* renamed from: sendData */
    public synchronized boolean m105003x4a532f52(final java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f56258xe8299481 != null) {
            return false;
        }
        ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.network.GetHttpRequest.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v6, types: [org.apache.http.client.HttpClient] */
            /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.StringBuilder] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 304
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.AbstractC26691x125a6bd1.AnonymousClass1.run():void");
            }
        });
        return false;
    }
}

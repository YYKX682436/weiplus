package com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e;

/* renamed from: com.tencent.tmassistantsdk.network.PostHttpRequest */
/* loaded from: classes13.dex */
public abstract class AbstractC26695x7cbd7c07 {

    /* renamed from: REQUEST_SERVER_URL */
    static final java.lang.String f56262x96180e23 = "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy6) + "/";
    static final java.lang.String TAG = "BaseHttpRequest";

    /* renamed from: mHttpPost */
    org.apache.http.client.methods.HttpPost f56263x1d0d38d5 = null;

    /* renamed from: cancleRequest */
    public synchronized void m105008xc6e3cda3() {
        org.apache.http.client.methods.HttpPost httpPost = this.f56263x1d0d38d5;
        if (httpPost != null && !httpPost.isAborted()) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "BaseHttpRequest:" + this + " cancleRequest");
            try {
                try {
                    this.f56263x1d0d38d5.abort();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
                }
            } finally {
                this.f56263x1d0d38d5 = null;
            }
        }
    }

    /* renamed from: onFinished */
    public abstract void mo104983x7cf2e371(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921, com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec49212, int i17);

    /* renamed from: sendRequest */
    public synchronized boolean m105009x319ab1e7(final com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921) {
        if (abstractC2861x7aec4921 == null) {
            return false;
        }
        if (this.f56263x1d0d38d5 != null) {
            return false;
        }
        ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.network.PostHttpRequest.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
            /* JADX WARN: Type inference failed for: r4v4, types: [org.apache.http.client.methods.HttpPost] */
            /* JADX WARN: Type inference failed for: r5v2, types: [org.apache.http.HttpEntity, org.apache.http.entity.ByteArrayEntity] */
            /* JADX WARN: Type inference failed for: r5v3 */
            /* JADX WARN: Type inference failed for: r5v8, types: [org.apache.http.client.HttpClient] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 292
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.AbstractC26695x7cbd7c07.AnonymousClass1.run():void");
            }
        });
        return false;
    }
}

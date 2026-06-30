package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.q f221921d;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.q qVar) {
        this.f221921d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.q qVar = this.f221921d;
        if (qVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f221941a) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f221942b)) {
            return;
        }
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(qVar.f221942b).openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setRequestMethod(qVar.f221941a.toUpperCase());
            httpURLConnection.setUseCaches(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameControlCmdParser", "requestNet, method:%s, url:%s, responseCode:%d", qVar.f221941a, qVar.f221942b, java.lang.Integer.valueOf(httpURLConnection.getResponseCode()));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameControlCmdParser", e17, "", new java.lang.Object[0]);
        }
    }
}

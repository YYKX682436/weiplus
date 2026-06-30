package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class k4 implements fw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 f267137b;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 activityC19328xb24711f5, java.lang.String str) {
        this.f267137b = activityC19328xb24711f5;
        this.f267136a = str;
    }

    public void a(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewDownloadUI", "getDownloadAppInfo onFailed appId: %s, errType: %s, errCode: %s, errMsg: %s", this.f267136a, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5.K;
        this.f267137b.Z6("download failed");
    }
}

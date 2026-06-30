package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f245969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e f245970f;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e binderC17870x451d307e, java.lang.String str, long j17) {
        this.f245970f = binderC17870x451d307e;
        this.f245968d = str;
        this.f245969e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f245968d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$9");
        java.lang.String str2 = "";
        try {
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
            if (h17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "getOpenSdkAppInfoMM, no cahcer, appId=" + str);
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.k(str, true);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "getOpenSdkAppInfoMM, hit cache, appId=" + str);
            }
            if (h17 != null) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.String str3 = h17.f67369x5e556d3a;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str3 == null) {
                        str3 = "";
                    }
                    jSONObject.put("icon", str3);
                    java.lang.String str4 = h17.f67372x453d1e07;
                    if (str4 == null) {
                        str4 = "";
                    }
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str4);
                    java.lang.String str5 = h17.f67386xa1e9e82c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    jSONObject.put("pkg", str5);
                    str2 = jSONObject.toString();
                } catch (java.lang.Exception unused) {
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "getOpenSdkAppInfoMM, exp=" + th6.toString());
        }
        this.f245970f.m142013x77b46a52("onGetOpenSdkAppInfo", str2, java.lang.Long.valueOf(this.f245969e));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$9");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

@j95.b
/* loaded from: classes.dex */
public class p2 extends i95.w implements su4.g1 {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f263121d = "websearch_";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f263122e;

    public void Ai() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WebSearchPrivacyMgr", "reInit");
        f263121d = "websearch_" + gm0.j1.b().j();
        java.lang.Object l17 = gm0.j1.u().c().l(274436, "");
        java.lang.String obj = l17 != null ? l17.toString() : "en";
        f263122e = java.lang.String.format("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/cgi-bin/newreadtemplate?t=gdpr/confirm&business=search&lang=%s&cc=%s&autoCloseWindow=1", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), obj);
        java.lang.String.format("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyt) + "/cgi-bin/newreadtemplate?t=gdpr/close&business=search&lang=%s&cc=%s&autoCloseWindow=1", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), obj);
    }

    public void Bi(android.content.Context context, java.lang.Runnable runnable) {
        wi();
        runnable.run();
    }

    public void wi() {
        if (f263122e == null) {
            Ai();
        }
    }
}

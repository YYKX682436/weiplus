package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes15.dex */
public abstract class e1 {
    public static void a(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.Object[] objArr = {str, str2, java.lang.Integer.valueOf(i17), str3, str4, str5};
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTaskReport", "reportTaskAction appId:%s, taskSessionId:%s, action:%d, actionNode:%s, ActionScene:%s, extraData:%s", objArr);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7149xf56ff60d c7149xf56ff60d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7149xf56ff60d();
        c7149xf56ff60d.f144576d = c7149xf56ff60d.b("AppId", str, true);
        c7149xf56ff60d.f144577e = c7149xf56ff60d.b("TaskSessionId", str2, true);
        c7149xf56ff60d.f144578f = i17;
        c7149xf56ff60d.f144579g = c7149xf56ff60d.b("ActionNote", str3, true);
        c7149xf56ff60d.f144580h = c7149xf56ff60d.b("ActionScene", str4, true);
        c7149xf56ff60d.f144581i = java.lang.System.currentTimeMillis();
        c7149xf56ff60d.f144582j = c7149xf56ff60d.b("ExtraData", str5, true);
        c7149xf56ff60d.k();
    }
}

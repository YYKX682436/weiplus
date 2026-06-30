package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes4.dex */
public final class r implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f85088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f85090f;

    public r(int i17, java.lang.String str, int i18) {
        this.f85088d = i17;
        this.f85089e = str;
        this.f85090f = i18;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp appBrandCgiPrefetchedResp;
        r45.k50 k50Var;
        r45.ie baseResponse;
        r45.du5 du5Var;
        r45.k50 k50Var2;
        r45.ie baseResponse2;
        r45.ie baseResponse3;
        r45.du5 du5Var2;
        r45.ie ieVar;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.appbrand.launching.u uVar = com.tencent.mm.plugin.appbrand.launching.u.f85203a;
        java.lang.String str = "";
        int i17 = this.f85088d;
        int i18 = -1;
        if (i17 < 0 || i17 >= 32) {
            appBrandCgiPrefetchedResp = new com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp("", -1, "");
        } else {
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.j50();
            lVar.f70665b = new r45.k50();
            lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/coldstartfetchdata";
            lVar.f70667d = 4024;
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ColdStartFetchDataRequest");
            r45.j50 j50Var = (r45.j50) fVar;
            j50Var.f377585e = this.f85089e;
            j50Var.f377584d = this.f85090f;
            j50Var.f377586f = i17;
            com.tencent.mm.modelbase.f b17 = com.tencent.mm.modelbase.l3.b(a17, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            java.lang.String str2 = null;
            if ((b17 != null && b17.f70615a == 0) && b17.f70616b == 0) {
                r45.k50 k50Var3 = (r45.k50) b17.f70618d;
                if ((k50Var3 == null || (ieVar = k50Var3.BaseResponse) == null || ieVar.f376959d != 0) ? false : true) {
                    java.lang.String valueOf = java.lang.String.valueOf(k50Var3 != null ? k50Var3.f378379d : null);
                    r45.k50 k50Var4 = (r45.k50) b17.f70618d;
                    if (k50Var4 != null && (baseResponse3 = k50Var4.getBaseResponse()) != null && (du5Var2 = baseResponse3.f376960e) != null) {
                        str2 = du5Var2.f372756d;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    appBrandCgiPrefetchedResp = new com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp(valueOf, 0, str2);
                }
            }
            if (b17 != null && (k50Var2 = (r45.k50) b17.f70618d) != null && (baseResponse2 = k50Var2.getBaseResponse()) != null) {
                i18 = baseResponse2.f376959d;
            }
            if (b17 != null && (k50Var = (r45.k50) b17.f70618d) != null && (baseResponse = k50Var.getBaseResponse()) != null && (du5Var = baseResponse.f376960e) != null) {
                str2 = du5Var.f372756d;
            }
            if (str2 == null) {
                str2 = "";
            }
            appBrandCgiPrefetchedResp = new com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp("", i18, str2);
        }
        if (appBrandCgiPrefetchedResp instanceof cf.h) {
            str = ((cf.h) appBrandCgiPrefetchedResp).I();
        } else {
            java.lang.String appBrandCgiPrefetchedResp2 = appBrandCgiPrefetchedResp.toString();
            if (appBrandCgiPrefetchedResp2 != null) {
                str = appBrandCgiPrefetchedResp2;
            }
        }
        boolean a18 = com.tencent.mm.plugin.appbrand.utils.d5.a();
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a18) {
            com.tencent.mars.xlog.Log.i("Luggage.Utils.Profile", "runProfiled:log:MicroMsg.AppBrandCgiPrefetchBeforeLaunch|call cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a18 + ' ');
        } else {
            com.tencent.mars.xlog.Log.w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / 16)) + " frames! runProfiled:log:MicroMsg.AppBrandCgiPrefetchBeforeLaunch|call cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a18 + ' ');
        }
        return appBrandCgiPrefetchedResp;
    }
}

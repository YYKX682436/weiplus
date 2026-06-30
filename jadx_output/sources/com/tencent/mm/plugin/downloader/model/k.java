package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class k implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97071f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f97072g;

    public k(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.ipcinvoker.r rVar) {
        this.f97069d = str;
        this.f97070e = str2;
        this.f97071f = str3;
        this.f97072g = rVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        java.lang.String str2;
        d02.k kVar;
        d02.g gVar;
        d02.c cVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadChecker", "errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.downloader.model.DownloadChecker$DownloadInterceptBean downloadChecker$DownloadInterceptBean = new com.tencent.mm.plugin.downloader.model.DownloadChecker$DownloadInterceptBean();
        if (i17 == 0 && i18 == 0) {
            c02.q qVar = (c02.q) oVar.f70711b.f70700a;
            if (qVar != null) {
                int i19 = qVar.f37620f;
                java.lang.String str3 = qVar.f37621g;
                c02.e eVar = qVar.f37618d;
                if (eVar == null || (kVar = eVar.f37592d) == null || (gVar = kVar.f225330f) == null || (cVar = gVar.f225313d) == null || !android.webkit.URLUtil.isNetworkUrl(cVar.f225276d)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DownloadChecker", "downloadInfo is invalid");
                    z17 = false;
                } else {
                    z17 = true;
                }
                if (z17) {
                    downloadChecker$DownloadInterceptBean.f96935d = true;
                    downloadChecker$DownloadInterceptBean.f96936e = i19;
                    downloadChecker$DownloadInterceptBean.f96937f = str3;
                    d02.k kVar2 = eVar.f37592d;
                    d02.d dVar = kVar2.f225328d;
                    downloadChecker$DownloadInterceptBean.f96938g = dVar == null ? null : dVar.f225296d;
                    downloadChecker$DownloadInterceptBean.f96939h = dVar == null ? null : dVar.f225297e;
                    downloadChecker$DownloadInterceptBean.f96940i = dVar != null ? dVar.f225298f : null;
                    d02.g gVar2 = kVar2.f225330f;
                    d02.c cVar2 = gVar2.f225313d;
                    downloadChecker$DownloadInterceptBean.f96941m = cVar2.f225276d;
                    downloadChecker$DownloadInterceptBean.f96942n = cVar2.f225284o;
                    downloadChecker$DownloadInterceptBean.f96943o = cVar2.f225278f;
                    downloadChecker$DownloadInterceptBean.f96944p = cVar2.f225277e;
                    downloadChecker$DownloadInterceptBean.f96945q = cVar2.f225279g;
                    downloadChecker$DownloadInterceptBean.f96946r = cVar2.f225280h;
                    downloadChecker$DownloadInterceptBean.f96947s = gVar2.f225317h;
                    d02.q qVar2 = new d02.q();
                    downloadChecker$DownloadInterceptBean.f96949u = qVar2;
                    qVar2.f225356d = eVar.f37592d.f225330f.f225313d.f225287r;
                } else {
                    downloadChecker$DownloadInterceptBean.f96935d = false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.DownloadChecker", "check download from net, ret: %d, confirmType: %d, appid: %s", java.lang.Integer.valueOf(qVar.f37619e), java.lang.Integer.valueOf(qVar.f37620f), downloadChecker$DownloadInterceptBean.f96938g);
                if (qVar.f37619e != 0) {
                    downloadChecker$DownloadInterceptBean.f96935d = false;
                } else if (!downloadChecker$DownloadInterceptBean.f96935d) {
                    qVar.f37619e = -2018122750;
                }
                java.lang.String str4 = downloadChecker$DownloadInterceptBean.f96938g;
                java.lang.String str5 = this.f97069d;
                java.lang.String str6 = downloadChecker$DownloadInterceptBean.f96941m;
                java.lang.String valueOf = java.lang.String.valueOf(qVar.f37619e);
                java.lang.String str7 = this.f97070e;
                java.lang.String str8 = this.f97071f;
                java.lang.String valueOf2 = java.lang.String.valueOf(qVar.f37620f);
                com.tencent.mars.xlog.Log.i("MicroMsg.DownloadChecker", "reportInfo, appId:[ %s ], rawDownloadUrl:[ %s ], alterDownloadUrl:[ %s ], errCode:[ %s ], mainUrl:[ %s ], source:[ %s ], confirmType:[ %s ]", str4, str5, str6, valueOf, str7, str8, valueOf2);
                try {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                        str5 = java.net.URLEncoder.encode(str5, com.tencent.mapsdk.internal.rv.f51270c);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                        str6 = java.net.URLEncoder.encode(str6, com.tencent.mapsdk.internal.rv.f51270c);
                    }
                } catch (java.io.UnsupportedEncodingException unused) {
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                    str2 = str7;
                    try {
                        str2 = java.net.URLEncoder.encode(str2, com.tencent.mapsdk.internal.rv.f51270c);
                    } catch (java.io.UnsupportedEncodingException unused2) {
                    }
                    jj0.b a17 = jj0.b.a(16749, str4, str5, str6, valueOf, str2, str8, valueOf2);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.f(a17.f299962a, a17.f299963b, true, false);
                }
                str2 = str7;
                jj0.b a172 = jj0.b.a(16749, str4, str5, str6, valueOf, str2, str8, valueOf2);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.f(a172.f299962a, a172.f299963b, true, false);
            } else {
                downloadChecker$DownloadInterceptBean.f96935d = false;
            }
        } else {
            downloadChecker$DownloadInterceptBean.f96935d = false;
        }
        com.tencent.mm.ipcinvoker.r rVar = this.f97072g;
        if (rVar != null) {
            rVar.a(downloadChecker$DownloadInterceptBean);
        }
        return 0;
    }
}

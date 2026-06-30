package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class k implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178604f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f178605g;

    public k(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f178602d = str;
        this.f178603e = str2;
        this.f178604f = str3;
        this.f178605g = rVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        java.lang.String str2;
        d02.k kVar;
        d02.g gVar;
        d02.c cVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadChecker", "errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13217x9736d853 c13217x9736d853 = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13217x9736d853();
        if (i17 == 0 && i18 == 0) {
            c02.q qVar = (c02.q) oVar.f152244b.f152233a;
            if (qVar != null) {
                int i19 = qVar.f119153f;
                java.lang.String str3 = qVar.f119154g;
                c02.e eVar = qVar.f119151d;
                if (eVar == null || (kVar = eVar.f119125d) == null || (gVar = kVar.f306863f) == null || (cVar = gVar.f306846d) == null || !android.webkit.URLUtil.isNetworkUrl(cVar.f306809d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadChecker", "downloadInfo is invalid");
                    z17 = false;
                } else {
                    z17 = true;
                }
                if (z17) {
                    c13217x9736d853.f178468d = true;
                    c13217x9736d853.f178469e = i19;
                    c13217x9736d853.f178470f = str3;
                    d02.k kVar2 = eVar.f119125d;
                    d02.d dVar = kVar2.f306861d;
                    c13217x9736d853.f178471g = dVar == null ? null : dVar.f306829d;
                    c13217x9736d853.f178472h = dVar == null ? null : dVar.f306830e;
                    c13217x9736d853.f178473i = dVar != null ? dVar.f306831f : null;
                    d02.g gVar2 = kVar2.f306863f;
                    d02.c cVar2 = gVar2.f306846d;
                    c13217x9736d853.f178474m = cVar2.f306809d;
                    c13217x9736d853.f178475n = cVar2.f306817o;
                    c13217x9736d853.f178476o = cVar2.f306811f;
                    c13217x9736d853.f178477p = cVar2.f306810e;
                    c13217x9736d853.f178478q = cVar2.f306812g;
                    c13217x9736d853.f178479r = cVar2.f306813h;
                    c13217x9736d853.f178480s = gVar2.f306850h;
                    d02.q qVar2 = new d02.q();
                    c13217x9736d853.f178482u = qVar2;
                    qVar2.f306889d = eVar.f119125d.f306863f.f306846d.f306820r;
                } else {
                    c13217x9736d853.f178468d = false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadChecker", "check download from net, ret: %d, confirmType: %d, appid: %s", java.lang.Integer.valueOf(qVar.f119152e), java.lang.Integer.valueOf(qVar.f119153f), c13217x9736d853.f178471g);
                if (qVar.f119152e != 0) {
                    c13217x9736d853.f178468d = false;
                } else if (!c13217x9736d853.f178468d) {
                    qVar.f119152e = -2018122750;
                }
                java.lang.String str4 = c13217x9736d853.f178471g;
                java.lang.String str5 = this.f178602d;
                java.lang.String str6 = c13217x9736d853.f178474m;
                java.lang.String valueOf = java.lang.String.valueOf(qVar.f119152e);
                java.lang.String str7 = this.f178603e;
                java.lang.String str8 = this.f178604f;
                java.lang.String valueOf2 = java.lang.String.valueOf(qVar.f119153f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadChecker", "reportInfo, appId:[ %s ], rawDownloadUrl:[ %s ], alterDownloadUrl:[ %s ], errCode:[ %s ], mainUrl:[ %s ], source:[ %s ], confirmType:[ %s ]", str4, str5, str6, valueOf, str7, str8, valueOf2);
                try {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                        str5 = java.net.URLEncoder.encode(str5, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                        str6 = java.net.URLEncoder.encode(str6, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    }
                } catch (java.io.UnsupportedEncodingException unused) {
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                    str2 = str7;
                    try {
                        str2 = java.net.URLEncoder.encode(str2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    } catch (java.io.UnsupportedEncodingException unused2) {
                    }
                    jj0.b a17 = jj0.b.a(16749, str4, str5, str6, valueOf, str2, str8, valueOf2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.f(a17.f381495a, a17.f381496b, true, false);
                }
                str2 = str7;
                jj0.b a172 = jj0.b.a(16749, str4, str5, str6, valueOf, str2, str8, valueOf2);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.f(a172.f381495a, a172.f381496b, true, false);
            } else {
                c13217x9736d853.f178468d = false;
            }
        } else {
            c13217x9736d853.f178468d = false;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f178605g;
        if (rVar != null) {
            rVar.a(c13217x9736d853);
        }
        return 0;
    }
}

package k64;

/* loaded from: classes.dex */
public abstract class h {
    public static final void a(r45.mr5 request, int i17, java.lang.String cgiUrl, yz5.l cgiCallback, r45.js5 js5Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestCgi", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiUrl, "cgiUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiCallback, "cgiCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiRequestHelper", "requestCgi() called with: request = " + request + ", funcId = " + i17 + ' ' + z17);
        try {
            yz5.l cVar = z17 ? new k64.c(new java.lang.ref.WeakReference(cgiCallback)) : new k64.d(cgiCallback);
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = request;
            lVar.f152198b = js5Var;
            lVar.f152199c = cgiUrl;
            lVar.f152200d = i17;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            k64.g gVar = new k64.g(i17, a17);
            gVar.mo807x6c193ac1(gm0.j1.d().f152297d, new k64.e(gVar, cVar, a17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CgiRequestHelper", "requestCgi error: request = " + request + ", funcId = " + i17 + ' ' + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestCgi", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper");
    }
}

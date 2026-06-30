package e54;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final e54.a f331171a = new e54.a();

    public static final void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, ab4.n0 n0Var, java.lang.String str) {
        v64.d dVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.ButtonCompPostActionHandler");
        if (str != null) {
            dVar = new v64.d();
            dVar.b("componentId", str);
        } else {
            dVar = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.ButtonCompPostActionHandler");
        if (context == null || c17702x544f64e9 == null || n0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.CompActionHandler", "the context, action info or page is null, when do component post action!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.ButtonCompPostActionHandler");
        } else {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.CompActionHandler", "it is going to do action, action type is " + c17702x544f64e9.f244104b);
                f331171a.b(context, c17702x544f64e9, n0Var, dVar);
            } catch (java.lang.Throwable th6) {
                ca4.q.c("doPostAction", th6);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.CompActionHandler", "the action is done, action type is " + c17702x544f64e9.f244104b);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.ButtonCompPostActionHandler");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.ButtonCompPostActionHandler");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if ((r8.length() > 0) == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010b, code lost:
    
        if ((r3.length() > 0) == true) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r15, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 r16, ab4.n0 r17, v64.d r18) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e54.a.b(android.content.Context, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo, ab4.n0, v64.d):void");
    }
}

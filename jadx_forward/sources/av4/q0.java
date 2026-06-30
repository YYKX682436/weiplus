package av4;

/* loaded from: classes15.dex */
public final class q0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.q0 f95861d = new av4.q0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.StartAdQRScanJSApi", "handleMsg params: " + msg.f422323a);
        java.util.Map map = msg.f422323a;
        int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        nw4.g gVar = env.f422396d;
        if (m40067xab9ed241 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.StartAdQRScanJSApi", "network status is non_network");
            gVar.e(msg.f422546c, "startAdQRScan:failed. Unreachable", null);
            return true;
        }
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "scanUrl");
        java.lang.String f18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "uxInfo");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.StartAdQRScanJSApi", "scanUrl is isNullOrNil");
            ((ee0.l) ((fe0.r3) i95.n0.c(fe0.r3.class))).wi(f18, 3, f17, 0);
            gVar.e(msg.f422546c, "startAdQRScan:failed. Params error", null);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        if (!r26.i0.y(f17, "http", false) && !r26.i0.y(f17, "https", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.StartAdQRScanJSApi", "scanUrl not start with http or https");
            ((ee0.l) ((fe0.r3) i95.n0.c(fe0.r3.class))).wi(f18, 3, f17, 0);
            gVar.e(msg.f422546c, "startAdQRScan:failed.", null);
            return true;
        }
        ((ee0.l) ((fe0.r3) i95.n0.c(fe0.r3.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdImgFilePath", "com.tencent.mm.feature.sns.AdQRScanService");
        java.lang.String str = za4.t0.g() + za4.t0.j("adId", f17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdImgFilePath", "com.tencent.mm.feature.sns.AdQRScanService");
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
                o11.f fVar = new o11.f();
                fVar.f423610a = true;
                fVar.f423611b = true;
                fVar.f423615f = str;
                o11.g a17 = fVar.a();
                n11.a b17 = n11.a.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f18);
                b17.d(f17, a17, new av4.o0(env, msg, str, f17, f18));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.StartAdQRScanJSApi", "filePath not null and file is exist");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f18);
                e(env, msg, str, f17, f18);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.StartAdQRScanJSApi", "exp is " + th6);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "startAdQRScan";
    }

    public final void e(nw4.k kVar, nw4.y2 y2Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        fe0.r3 r3Var = (fe0.r3) i95.n0.c(fe0.r3.class);
        android.content.Context context = kVar.f422393a;
        av4.p0 p0Var = new av4.p0(kVar, y2Var, str3, str2);
        ee0.l lVar = (ee0.l) r3Var;
        lVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClickDirect", "com.tencent.mm.feature.sns.AdQRScanService");
        ca4.b0 b0Var = new ca4.b0(context, str3);
        ee0.k kVar2 = new ee0.k(lVar, p0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClickDirectForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        if (b0Var.f121375p == null) {
            b0Var.f121375p = new android.os.Bundle();
        }
        b0Var.f121375p.putInt("qr_url_type_key", b0Var.f121366g);
        java.lang.ref.WeakReference weakReference = b0Var.f121374o;
        if (weakReference == null) {
            kVar2.a(str2, false, "contextRef is null", b0Var.f121375p);
            b0Var.m();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdQRHelper", "onClickDirectForSearchJsapi, contextRef is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClickDirectForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        } else {
            android.content.Context context2 = (android.content.Context) weakReference.get();
            if (context2 == null) {
                kVar2.a(str2, false, "context is null", b0Var.f121375p);
                b0Var.m();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdQRHelper", "onClickDirectForSearchJsapi, contextRef get is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClickDirectForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            } else {
                b0Var.f121367h = str;
                b0Var.f121368i = str2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdQRHelper", "onClickDirectForSearchJsapi, filePath is " + b0Var.f121367h);
                if (android.text.TextUtils.isEmpty(b0Var.f121367h)) {
                    kVar2.a(str2, false, "imgPath is empty", b0Var.f121375p);
                    b0Var.m();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClickDirectForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                } else {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    ((jd0.u1) ((kd0.h2) i95.n0.c(kd0.h2.class))).getClass();
                    zs5.u0.f557018h.a(context2, currentTimeMillis, b0Var.f121367h, new ca4.z(b0Var, kVar2, str2));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClickDirectForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClickDirect", "com.tencent.mm.feature.sns.AdQRScanService");
    }
}

package om4;

/* loaded from: classes15.dex */
public class t {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f427976b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f427975a = new om4.q(this, "TopStoryReportExposeTask");

    public void a(r45.un6 un6Var, r45.xn6 xn6Var, int i17, int i18, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        try {
            sb6.append("scene=");
            sb6.append(un6Var.f469039i);
            sb6.append("&");
            sb6.append("businesstype=3");
            sb6.append("&");
            sb6.append("mediatype=2");
            sb6.append("&");
            sb6.append("docid=");
            sb6.append(xn6Var.G);
            sb6.append("&");
            sb6.append("typepos=");
            sb6.append("0");
            sb6.append("&");
            sb6.append("docpos=");
            sb6.append(i17 + 1);
            sb6.append("&");
            sb6.append("searchid=");
            sb6.append(un6Var.f469040m);
            sb6.append("&");
            sb6.append("ishomepage=");
            sb6.append(0);
            sb6.append("&rec_category=");
            sb6.append(xn6Var.f471804v);
            sb6.append("&");
            sb6.append("timestamp=");
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append("&");
            sb6.append("clicktype=");
            sb6.append(i18);
            sb6.append("&");
            sb6.append("clickcontent=");
            try {
                sb6.append(fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            } catch (java.lang.Exception unused) {
            }
            sb6.append("&");
            sb6.append("clicksource=");
            sb6.append("4");
            sb6.append("&");
            sb6.append("sceneactiontype=");
            sb6.append(1);
            sb6.append("&");
            sb6.append("query=");
            try {
                sb6.append(fp.s0.b(un6Var.f469041n, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            } catch (java.lang.Exception unused2) {
            }
            sb6.append("&");
            sb6.append("resulttype=");
            sb6.append(xn6Var.H);
            sb6.append("&");
            sb6.append("sessionid=");
            sb6.append(su4.r2.f(un6Var.f469039i));
            sb6.append("&");
            sb6.append("expand=");
            try {
                sb6.append(fp.s0.b(xn6Var.f471806x, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            } catch (java.lang.Exception unused3) {
            }
            sb6.append("&");
            sb6.append("title=");
            try {
                sb6.append(fp.s0.b(xn6Var.f471788d, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            } catch (java.lang.Exception unused4) {
            }
            sb6.append("&");
            sb6.append("nettype=");
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                sb6.append("wifi");
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                sb6.append("4g");
            } else {
                sb6.append("3g");
            }
            sb6.append("&");
            sb6.append("itemtype=");
            sb6.append(xn6Var.A);
        } catch (java.lang.Exception unused5) {
        }
        java.lang.String sb7 = sb6.toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb7)) {
            return;
        }
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f461289t = sb7;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReporterImpl", "do12721ClickVideoReport %s", sb7);
        gm0.j1.d().g(new su4.u1(lq5Var));
    }
}

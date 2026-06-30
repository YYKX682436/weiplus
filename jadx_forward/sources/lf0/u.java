package lf0;

@j95.b
/* loaded from: classes.dex */
public class u extends i95.w implements mf0.z, mf0.d0 {
    public void Ai(java.lang.String str, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.startsWith("wrd")) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(900L, i17, 1L, false);
    }

    public void Bi(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryWebViewVisitTime %s", str);
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f461289t = str;
        gm0.j1.d().g(new su4.a2(lq5Var));
    }

    public void wi(java.lang.String str, java.lang.String str2, int i17, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.startsWith("wrd")) {
            return;
        }
        try {
            java.lang.String format = java.lang.String.format("%s,%s,%s,%s", fp.s0.b(str2, "utf8"), java.lang.Integer.valueOf(i17), str, java.lang.Long.valueOf(j17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "kvReportTopStoryOpenWebViewError 15728 %s", format);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(15728, format);
        } catch (java.io.UnsupportedEncodingException unused) {
        }
    }
}

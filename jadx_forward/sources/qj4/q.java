package qj4;

/* loaded from: classes11.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pj4.h2 f445476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f445477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445478f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445479g;

    public q(pj4.h2 h2Var, java.lang.Long l17, java.lang.String str, java.lang.String str2) {
        this.f445476d = h2Var;
        this.f445477e = l17;
        this.f445478f = str;
        this.f445479g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = "iconid";
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6963xeb25d076 c6963xeb25d076 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6963xeb25d076();
        pj4.h2 h2Var = this.f445476d;
        java.lang.String str2 = h2Var.N;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        c6963xeb25d076.f142685d = c6963xeb25d076.b("SessionID", str2, true);
        c6963xeb25d076.f142689f = h2Var.P;
        java.lang.String str3 = h2Var.f436614d;
        if (str3 == null) {
            str3 = "";
        }
        c6963xeb25d076.f142687e = c6963xeb25d076.b("CliPostID", str3, true);
        c6963xeb25d076.f142691g = h2Var.f436617g;
        java.lang.Long l17 = this.f445477e;
        c6963xeb25d076.f142695i = l17 != null ? l17.longValue() : 0L;
        c6963xeb25d076.f142697j = c01.id.c();
        java.lang.String str4 = this.f445478f;
        if (str4 == null) {
            str4 = "";
        }
        c6963xeb25d076.f142699k = c6963xeb25d076.b("ExitTopicID", str4, true);
        java.lang.String str5 = this.f445479g;
        if (str5 == null) {
            str5 = "";
        }
        c6963xeb25d076.f142701l = c6963xeb25d076.b("ExitTextStatusID", str5, true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = h2Var.f436619i.iterator();
        while (it.hasNext()) {
            java.lang.String str6 = (java.lang.String) it.next();
            if (sb6.length() > 0) {
                sb6.append(";");
            }
            sb6.append(str6);
        }
        c6963xeb25d076.f142693h = c6963xeb25d076.b("StatusIcons", sb6.toString(), true);
        c6963xeb25d076.f142703m = h2Var.f436623o;
        c6963xeb25d076.f142705n = h2Var.f436624p;
        c6963xeb25d076.f142707o = h2Var.f436627q;
        c6963xeb25d076.f142709p = h2Var.f436628r;
        c6963xeb25d076.f142711q = h2Var.f436629s;
        java.lang.String str7 = h2Var.f436630t;
        if (str7 == null) {
            str7 = "";
        }
        c6963xeb25d076.f142713r = c6963xeb25d076.b("SourceID", str7, true);
        java.lang.String str8 = h2Var.f436631u;
        if (str8 == null) {
            str8 = "";
        }
        c6963xeb25d076.f142715s = c6963xeb25d076.b("SourceActivityID", str8, true);
        java.lang.String str9 = h2Var.f436632v;
        if (str9 == null) {
            str9 = "";
        }
        c6963xeb25d076.f142717t = c6963xeb25d076.b("SourceName", str9, true);
        java.lang.String str10 = h2Var.f436633w;
        if (str10 == null) {
            str10 = "";
        }
        c6963xeb25d076.f142719u = c6963xeb25d076.b("SourceIcon", str10, true);
        c6963xeb25d076.f142721v = h2Var.f436634x;
        c6963xeb25d076.f142723w = h2Var.f436637y;
        c6963xeb25d076.f142725x = h2Var.f436640z;
        c6963xeb25d076.f142727y = h2Var.A;
        c6963xeb25d076.f142729z = h2Var.B;
        c6963xeb25d076.A = h2Var.C;
        c6963xeb25d076.B = h2Var.D;
        c6963xeb25d076.C = h2Var.E;
        c6963xeb25d076.E = h2Var.F;
        c6963xeb25d076.F = h2Var.G;
        c6963xeb25d076.G = h2Var.H;
        c6963xeb25d076.H = h2Var.I;
        c6963xeb25d076.I = h2Var.f436613J;
        c6963xeb25d076.f142681J = h2Var.K;
        c6963xeb25d076.K = h2Var.L;
        c6963xeb25d076.L = h2Var.M;
        c6963xeb25d076.P = h2Var.Q;
        c6963xeb25d076.Q = h2Var.R;
        c6963xeb25d076.R = 0L;
        c6963xeb25d076.S = h2Var.U;
        c6963xeb25d076.T = h2Var.V;
        c6963xeb25d076.D = h2Var.E1;
        c6963xeb25d076.U = c6963xeb25d076.b("RefBackgroundUser", h2Var.X, true);
        c6963xeb25d076.V = c6963xeb25d076.b("RefBackgroundStatus", h2Var.Y, true);
        c6963xeb25d076.W = h2Var.S;
        c6963xeb25d076.X = c6963xeb25d076.b("ImgVideoMd5Orig", h2Var.T, true);
        c6963xeb25d076.Y = c6963xeb25d076.b("FinderPickerSessionId", h2Var.Z, true);
        c6963xeb25d076.M = h2Var.f436625p0;
        c6963xeb25d076.N = h2Var.f436635x0;
        c6963xeb25d076.O = c6963xeb25d076.b("FinalCustomTitle", h2Var.f436638y0, true);
        c6963xeb25d076.Z = h2Var.f436620l1;
        c6963xeb25d076.f142682a0 = h2Var.f436626p1;
        c6963xeb25d076.f142683b0 = h2Var.f436636x1;
        c6963xeb25d076.f142684c0 = h2Var.f436639y1;
        c6963xeb25d076.f142686d0 = h2Var.f436641z1;
        c6963xeb25d076.f142688e0 = h2Var.A1;
        c6963xeb25d076.f142690f0 = c6963xeb25d076.b("FinalEmoticon", h2Var.B1, true);
        c6963xeb25d076.f142692g0 = 2L;
        c6963xeb25d076.f142694h0 = 2L;
        c6963xeb25d076.f142696i0 = c6963xeb25d076.b("WeRunInfo", h2Var.C1, true);
        c6963xeb25d076.f142698j0 = c6963xeb25d076.b("PaymentInfo", h2Var.D1, true);
        c6963xeb25d076.f142702l0 = c6963xeb25d076.b("PostRecomIconID", bk4.i.a().f(), true);
        c6963xeb25d076.f142704m0 = qj4.s.f445491a.e();
        c6963xeb25d076.f142706n0 = h2Var.F1;
        c6963xeb25d076.f142708o0 = bk4.i.a().y() ? h2Var.G1 : 0L;
        bk4.r rVar = bk4.r.f103077a;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            java.util.Iterator it6 = ((java.util.ArrayList) rVar.c()).iterator();
            while (it6.hasNext()) {
                ej4.k kVar = (ej4.k) it6.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("iconid", kVar.f334902d);
                pj4.o1 j17 = bk4.i.a().j(kVar.f334902d);
                jSONObject.put("icontype", j17 != null ? j17.f436764g : 0);
                jSONObject.put("customtitle", kVar.f334903e);
                jSONArray.put(jSONObject);
            }
        } catch (java.lang.Exception unused) {
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(",");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(jSONArray2).replaceAll(";");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        c6963xeb25d076.f142710p0 = c6963xeb25d076.b("FreqIcons", replaceAll, true);
        c6963xeb25d076.f142712q0 = c6963xeb25d076.b("IconSelections", h2Var.H1, true);
        java.util.LinkedList CustomRecommendIconFromPicker = h2Var.N1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(CustomRecommendIconFromPicker, "CustomRecommendIconFromPicker");
        org.json.JSONArray jSONArray3 = new org.json.JSONArray();
        try {
            java.util.Iterator it7 = CustomRecommendIconFromPicker.iterator();
            while (it7.hasNext()) {
                java.lang.String str11 = (java.lang.String) it7.next();
                java.util.Iterator it8 = it7;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(str, str11);
                java.lang.String str12 = str;
                pj4.o1 j18 = bk4.i.a().j(str11);
                jSONObject2.put("icontype", j18 != null ? j18.f436764g : 0);
                jSONObject2.put("customtitle", "");
                jSONArray3.put(jSONObject2);
                it7 = it8;
                str = str12;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.tsReport", "getIconListReportJson: " + e17);
        }
        java.lang.String jSONArray4 = jSONArray3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray4, "toString(...)");
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile(",");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile2, "compile(...)");
        java.lang.String replaceAll2 = compile2.matcher(jSONArray4).replaceAll(";");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll2, "replaceAll(...)");
        c6963xeb25d076.f142730z0 = c6963xeb25d076.b("RcmdIcons", replaceAll2, true);
        c6963xeb25d076.f142714r0 = h2Var.I1;
        java.lang.String str13 = h2Var.J1;
        c6963xeb25d076.f142718t0 = c6963xeb25d076.b("EnterSceneInfo", str13 != null ? r26.i0.u(str13, ',', ';', false, 4, null) : null, true);
        c6963xeb25d076.f142716s0 = h2Var.K1;
        c6963xeb25d076.f142724w0 = c6963xeb25d076.b("VisibilityRangeDetails", h2Var.L1, true);
        c6963xeb25d076.f142726x0 = h2Var.M1;
        if (l17 != null && l17.longValue() == 1) {
            c6963xeb25d076.f142728y0 = c6963xeb25d076.f142726x0 + 1;
        } else {
            c6963xeb25d076.f142728y0 = c6963xeb25d076.f142726x0;
        }
        c6963xeb25d076.k();
        java.lang.String n17 = c6963xeb25d076.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.tsReport", "report%s %s", 22219, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
    }
}

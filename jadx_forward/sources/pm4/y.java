package pm4;

/* loaded from: classes15.dex */
public abstract class y {
    public static void a(r45.un6 un6Var, r45.xn6 xn6Var, java.util.Set set, int i17) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("isfeedback=1&feedtype=0&businesstype=2&itemtype=");
        stringBuffer.append(xn6Var.A);
        stringBuffer.append("&scene=");
        stringBuffer.append(un6Var.f469039i);
        stringBuffer.append("&searchid=");
        stringBuffer.append(un6Var.f469040m);
        stringBuffer.append("&clicktime=");
        stringBuffer.append(java.lang.System.currentTimeMillis());
        stringBuffer.append("&docid=");
        stringBuffer.append(xn6Var.G);
        stringBuffer.append("&docpos=");
        stringBuffer.append(i17);
        stringBuffer.append("&reasonid=");
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((r45.ir0) it.next()).f458810d);
            stringBuffer.append("#");
        }
        stringBuffer.append("&reasonwording=");
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
        java.util.Iterator it6 = set.iterator();
        while (it6.hasNext()) {
            stringBuffer2.append(((r45.ir0) it6.next()).f458811e);
            stringBuffer2.append("#");
        }
        try {
            stringBuffer.append(fp.s0.b(stringBuffer2.toString(), "utf8"));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        stringBuffer.append("&offset=");
        stringBuffer.append(i17);
        stringBuffer.append("&sessionid=");
        stringBuffer.append(su4.r2.f(un6Var.f469039i));
        stringBuffer.append("&reserveexpand=");
        stringBuffer.append(xn6Var.B);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportFeedBackClick %s", stringBuffer.toString());
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f461289t = stringBuffer.toString();
        gm0.j1.d().g(new su4.a2(lq5Var));
    }

    public static void b(int i17) {
        if (i17 == -21020) {
            uu4.b.a(10);
        } else if (i17 == -21009) {
            uu4.b.a(9);
        } else if (i17 == -10012) {
            uu4.b.a(7);
        } else if (i17 == -10004) {
            uu4.b.a(8);
        } else if (i17 == -1010) {
            uu4.b.a(4);
        } else if (i17 == -1007) {
            uu4.b.a(5);
        } else if (i17 == -1004) {
            uu4.b.a(6);
        } else if (i17 == 416) {
            uu4.b.a(15);
        } else if (i17 == 502) {
            uu4.b.a(14);
        } else if (i17 != 503) {
            switch (i17) {
                case 403:
                    uu4.b.a(12);
                    break;
                case 404:
                    uu4.b.a(11);
                    break;
                case 405:
                    uu4.b.a(16);
                    break;
                default:
                    uu4.b.a(255);
                    break;
            }
        } else {
            uu4.b.a(13);
        }
        uu4.a.a(7);
    }

    public static void c(r45.xn6 xn6Var, int i17, int i18, int i19, dn.h hVar) {
        dn.h hVar2 = hVar == null ? new dn.h() : hVar;
        java.lang.String format = java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", java.lang.Integer.valueOf(xn6Var.U), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(hVar2.f69559x1bb3b54a), java.lang.Long.valueOf(hVar2.f69520x14c61803), java.lang.Integer.valueOf(hVar2.f69508x556c2b4f), java.lang.Integer.valueOf(hVar2.f69505x1282dcdf), java.lang.Integer.valueOf(hVar2.f69527x5e24f3ac), java.lang.Integer.valueOf(hVar2.f69540xb5d620d0), java.lang.Integer.valueOf(hVar2.f69533xab94fd8c), hVar2.f69512x53e83fd7, hVar2.f69556x6ff67d4f, hVar2.f69573xda6123f6, java.lang.Integer.valueOf(hVar2.f69509x42a09867), java.lang.Integer.valueOf(hVar2.f69534x86d8cec ? 1 : 0), java.lang.Integer.valueOf(hVar2.f69566x86033819 ? 1 : 0), java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportKvTopStoryCdnDownloadError 16270 %s", format);
        jx3.f.INSTANCE.mo68478xbd3cda5f(16270, format);
        if (i18 != 0) {
            r45.lq5 lq5Var = new r45.lq5();
            java.lang.String str = "videoplayfailreport=1&vt=" + xn6Var.U + "&errorcode=" + i18 + "&filetype=" + i17 + "&startdownloadtime=" + hVar2.f69559x1bb3b54a + "&enddownloadtime=" + hVar2.f69520x14c61803 + "&averagespeed=" + hVar2.f69508x556c2b4f + "&averageconnectcost=" + hVar2.f69505x1282dcdf + "&firstconnectcost=" + hVar2.f69527x5e24f3ac + "&moovfailreason=" + hVar2.f69540xb5d620d0 + "&httpstatuscode=" + hVar2.f69533xab94fd8c + "&clientip=" + hVar2.f69512x53e83fd7 + "&serverip=" + hVar2.f69556x6ff67d4f + "&xerrno=" + hVar2.f69573xda6123f6 + "&cseqresult=" + hVar2.f69509x42a09867 + "&crossnet=" + (hVar2.f69534x86d8cec ? 1 : 0) + "&privateprotocol=" + (hVar2.f69566x86033819 ? 1 : 0) + "&nettype=" + i19 + "&cdnsourcetype=" + xn6Var.Q + "&cdnscene=" + xn6Var.P + "&expand=" + xn6Var.f471806x;
            lq5Var.f461289t = str;
            java.lang.String str2 = hVar2.f69532xac74343b;
            lq5Var.R = str2;
            java.lang.String str3 = xn6Var.f471789e;
            lq5Var.S = str3;
            java.lang.String str4 = xn6Var.S;
            lq5Var.T = str4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "NetSceneWebSearchReport16270 [logString:%s], [header:%s], [url:%s], [bypass:%s]", str, str2, str3, str4);
            gm0.j1.d().g(new su4.a2(lq5Var));
        }
    }

    public static void d(r45.xn6 xn6Var, int i17, java.lang.String str, int i18) {
        java.lang.String format = java.lang.String.format("%s,%s,%s,%s,%s", java.lang.Integer.valueOf(i17), str, xn6Var != null ? xn6Var.G : "", java.lang.Integer.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 2 : !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 1 : 3), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportKvTopStoryVideoPlayError %s", format);
        jx3.f.INSTANCE.mo68478xbd3cda5f(15248, format);
    }

    public static void e(r45.y97 y97Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String Q0;
        java.lang.String r17;
        int i17 = 1;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0())) {
            Q0 = f9Var.A0() == 1 ? c01.z1.r() : c01.w9.s(f9Var.j());
            r17 = f9Var.Q0();
            i17 = 2;
        } else if (f9Var.A0() == 1) {
            Q0 = c01.z1.r();
            r17 = f9Var.Q0();
        } else {
            Q0 = f9Var.Q0();
            r17 = c01.z1.r();
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("isShareClick=1&relevant_vid=");
        stringBuffer.append(y97Var.f472431d);
        stringBuffer.append("&relevant_pre_searchid=");
        stringBuffer.append(y97Var.f472433f);
        stringBuffer.append("&relevant_shared_openid=");
        stringBuffer.append(y97Var.f472434g);
        stringBuffer.append("&rec_category=");
        long j17 = y97Var.f472448x;
        if (j17 > 0) {
            stringBuffer.append(j17);
        } else {
            stringBuffer.append(y97Var.f472435h);
        }
        stringBuffer.append("&source=");
        stringBuffer.append(y97Var.f472443s);
        stringBuffer.append("&fromUser=");
        stringBuffer.append(Q0);
        stringBuffer.append("&fromScene=");
        stringBuffer.append(i17);
        stringBuffer.append("&targetInfo=");
        stringBuffer.append(r17);
        stringBuffer.append("&expand=");
        stringBuffer.append(y97Var.f472432e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryClickShareItem 15371 %s", stringBuffer.toString());
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f461289t = stringBuffer.toString();
        gm0.j1.d().g(new su4.a2(lq5Var));
    }

    public static void f(r45.in6 in6Var, java.lang.String str, long j17) {
        long j18;
        if (in6Var.f458725q.size() > 0) {
            java.util.LinkedList linkedList = in6Var.f458725q;
            if ("clickTopStory".equals(((r45.tn6) linkedList.get(0)).f468150d)) {
                j18 = j17 - ((r45.tn6) linkedList.get(0)).f468151e;
                java.lang.String format = java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", java.lang.Integer.valueOf(in6Var.f458720i), in6Var.f458724p, in6Var.f458716e, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(1)), str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(in6Var.f458726r), java.lang.Integer.valueOf(in6Var.f458729u), in6Var.f458731w, java.lang.Long.valueOf(j18), in6Var.f458732x, in6Var.f458722n);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryHomeUIAction 15466 %s", format);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(15466, format);
            }
        }
        j18 = 0;
        java.lang.String format2 = java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", java.lang.Integer.valueOf(in6Var.f458720i), in6Var.f458724p, in6Var.f458716e, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(1)), str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(in6Var.f458726r), java.lang.Integer.valueOf(in6Var.f458729u), in6Var.f458731w, java.lang.Long.valueOf(j18), in6Var.f458732x, in6Var.f458722n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryHomeUIAction 15466 %s", format2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(15466, format2);
    }

    public static final void g(r45.un6 un6Var, long j17, r45.xn6 xn6Var) {
        if (j17 > 0) {
            java.lang.Object[] objArr = new java.lang.Object[8];
            objArr[0] = java.lang.Integer.valueOf(un6Var.f469039i);
            objArr[1] = java.lang.Long.valueOf(j17 / 1000);
            objArr[2] = java.lang.Long.valueOf(un6Var.f469038h);
            objArr[3] = 3;
            objArr[4] = "";
            objArr[5] = 2;
            objArr[6] = xn6Var != null ? xn6Var.f471806x : un6Var.f469035e;
            objArr[7] = un6Var.f469040m;
            java.lang.String format = java.lang.String.format("videoflowbrowsereport=1&scene=%s&staytime=%s&channelid=%s&pageid=%s&nettype=%s&source=%s&expand=%s&searchid=%s", objArr);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryVideoPageBrowseTime 15018 %s", format);
            r45.lq5 lq5Var = new r45.lq5();
            lq5Var.f461289t = format;
            gm0.j1.d().g(new su4.a2(lq5Var));
        }
    }

    public static void h(r45.un6 un6Var, r45.xn6 xn6Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String format = java.lang.String.format("videosharereport=1&scene=%s&searchid=%s&docid=%s&cdnsourcetype=%s&videoid=%s&optype=%s&fromuser=%s&touser=%s&channelid=%s&optypes=%s&expand=%s", java.lang.Integer.valueOf(un6Var.f469039i), un6Var.f469040m, xn6Var.G, java.lang.Integer.valueOf(xn6Var.Q), xn6Var.f471792h, 0, str2, str3, java.lang.Long.valueOf(un6Var.f469038h), str, xn6Var.f471806x);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryVideoShare 15035 %s", format);
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f461289t = format;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryVideoShare:" + format);
        gm0.j1.d().g(new su4.a2(lq5Var));
    }

    public static final void i(r45.un6 un6Var, r45.xn6 xn6Var, int i17) {
        r45.lq5 lq5Var = new r45.lq5();
        java.lang.String format = java.lang.String.format("logname=videopoint&scene=%s&docid=%s&searchid=%s&vid=%s&actiontype=%s&itemtype=%s", java.lang.Integer.valueOf(un6Var.f469039i), xn6Var.G, un6Var.f469040m, xn6Var.f471792h, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(xn6Var.A));
        lq5Var.f461289t = format;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportVideoPointAction %s", format);
        gm0.j1.d().g(new su4.u1(lq5Var));
    }
}

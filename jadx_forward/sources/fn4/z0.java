package fn4;

/* loaded from: classes15.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    public fn4.b f346164a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f346165b;

    /* renamed from: c, reason: collision with root package name */
    public int f346166c;

    /* renamed from: d, reason: collision with root package name */
    public sm4.k f346167d;

    /* renamed from: e, reason: collision with root package name */
    public sm4.h f346168e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f346169f = new fn4.v0(this);

    public static void a(fn4.z0 z0Var, org.json.JSONObject jSONObject, boolean z17) {
        z0Var.getClass();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("client_conf");
        if (optJSONObject != null) {
            z0Var.f346166c = optJSONObject.optInt("enable_prefetch", 0);
            optJSONObject.optInt("max_report_exposed_cnt", 0);
            optJSONObject.optInt("max_report_exposed_cnt", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "parseAndSetPreFetchReportInfo %s", optJSONObject.toString());
        }
        java.lang.String optString = jSONObject.optString("searchID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "fetch response newsearchid: %s originSearchId: %s", optString, z0Var.f346164a.r0().f469040m);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            z0Var.f346164a.r0().f469040m = optString;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        boolean optBoolean = jSONObject.optBoolean("isSinglePage", false);
        z0Var.f346164a.r0().A = optBoolean;
        if (optBoolean) {
            z0Var.f346164a.R2();
        }
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            uu4.a.a(1);
            z0Var.f346164a.A4(-4, jSONObject.optString("nomoreText"));
            return;
        }
        try {
            java.util.List k17 = k(z0Var.f346164a.p6(), optJSONArray);
            if (((java.util.ArrayList) k17).size() == 0) {
                z0Var.f346164a.A4(-2, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hsj));
            } else {
                z0Var.f346164a.O1(k17, z17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryVideoDataMgr", e17, "parseAndRequestVideoList error: %s", e17.getMessage());
            uu4.a.a(3);
            z0Var.f346164a.A4(-3, "ParseDataError");
        }
    }

    public static int c() {
        int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (m40067xab9ed241 == -1) {
            return 0;
        }
        if (m40067xab9ed241 == 0) {
            return 1;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return 2;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return 3;
        }
        return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 4 : 0;
    }

    public static boolean f(r45.xn6 xn6Var) {
        if (xn6Var == null) {
            return false;
        }
        if (xn6Var.f471798p0 != 1 || android.text.TextUtils.isEmpty(xn6Var.f471803u)) {
            return xn6Var.f471798p0 == 2 && !android.text.TextUtils.isEmpty(xn6Var.Z);
        }
        return true;
    }

    public static java.lang.String g(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return str;
        }
        return str + str2 + "Unicomtype=" + i17 + "&newnettype=" + i18 + "&Netoperator=" + i19;
    }

    public static boolean h(r45.xn6 xn6Var, android.content.Context context) {
        if (xn6Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "jumpToProfile sJumpType:%s", java.lang.Integer.valueOf(xn6Var.f471798p0));
            int i17 = xn6Var.f471798p0;
            if (i17 == 1) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xn6Var.f471803u)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", xn6Var.f471803u);
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                    return true;
                }
            } else if (i17 == 2 && !android.text.TextUtils.isEmpty(xn6Var.Z)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(xn6Var.Z, true);
                if (n17 == null || ((int) n17.E2) <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "jumpToProfile contact not exist, getNow");
                    boolean[] zArr = {false};
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, null, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gga), false, true, new fn4.w0(zArr));
                    try {
                        ((c01.k7) c01.n8.a()).b(xn6Var.Z, 26, new fn4.x0(Q, zArr, xn6Var, context));
                    } catch (java.lang.Throwable th6) {
                        Q.dismiss();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStory.TopStoryVideoDataMgr", "jumpToProfile err:%s", th6.getMessage());
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "jumpToProfile contact exist");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("Contact_User", xn6Var.Z);
                    intent2.putExtra("biz_profile_tab_type", 1);
                    j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent2, null);
                }
                return true;
            }
        }
        return false;
    }

    public static void j(org.json.JSONArray jSONArray, r45.xn6 xn6Var) {
        try {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(0);
            r45.pn6 pn6Var = new r45.pn6();
            xn6Var.Y = pn6Var;
            pn6Var.f464775m = optJSONObject.optString("bizuin");
            xn6Var.Y.f464773h = optJSONObject.optString(dm.i4.f66865x76d1ec5a);
            org.json.JSONObject optJSONObject2 = optJSONObject.optJSONArray("list").optJSONObject(0);
            xn6Var.Y.f464769d = optJSONObject2.optInt("beginTime");
            xn6Var.Y.f464770e = optJSONObject2.optInt("endTime");
            xn6Var.Y.f464771f = optJSONObject2.optInt("minShowTime");
            xn6Var.Y.f464772g = optJSONObject2.optInt("type");
            xn6Var.Y.f464774i = optJSONObject2.optString(dm.i4.f66865x76d1ec5a);
            org.json.JSONObject jSONObject = new org.json.JSONObject(optJSONObject2.optString("dot"));
            xn6Var.Y.f464776n = new r45.on6();
            xn6Var.Y.f464776n.f463915d = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            xn6Var.Y.f464776n.f463916e = jSONObject.optString("desc");
            xn6Var.Y.f464776n.f463917f = jSONObject.optString("relativeURL");
            xn6Var.Y.f464776n.f463918g = jSONObject.optString("originalId");
            xn6Var.Y.f464776n.f463919h = jSONObject.optString("weAppName");
            xn6Var.Y.f464776n.f463920i = jSONObject.optString("appId");
            xn6Var.Y.f464776n.f463921m = jSONObject.optString("avatar");
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List k(boolean r30, org.json.JSONArray r31) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn4.z0.k(boolean, org.json.JSONArray):java.util.List");
    }

    public static void l(org.json.JSONArray jSONArray, r45.xn6 xn6Var) {
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            r45.x56 x56Var = new r45.x56();
            x56Var.f471328d = jSONArray.getJSONObject(i17).optString(dm.i4.f66865x76d1ec5a);
            x56Var.f471329e = jSONArray.getJSONObject(i17).optString("wording");
            x56Var.f471330f = jSONArray.getJSONObject(i17).optLong("category");
            x56Var.f471331g = jSONArray.getJSONObject(i17).optInt("actionType");
            x56Var.f471332h = jSONArray.getJSONObject(i17).optString("url");
            x56Var.f471333i = jSONArray.getJSONObject(i17).optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            x56Var.f471334m = jSONArray.getJSONObject(i17).optString("subTitle");
            x56Var.f471335n = jSONArray.getJSONObject(i17).optString("icon");
            xn6Var.D.add(x56Var);
        }
    }

    public static void m(org.json.JSONObject jSONObject, r45.xn6 xn6Var) {
        r45.vn6 vn6Var = new r45.vn6();
        xn6Var.T = vn6Var;
        vn6Var.f469932d = jSONObject.optString("detailWording");
        xn6Var.T.f469933e = jSONObject.optString("detailUrl");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("feedbackData");
        if (optJSONArray != null) {
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                r45.ir0 ir0Var = new r45.ir0();
                ir0Var.f458810d = optJSONArray.optJSONObject(i17).optString(dm.i4.f66865x76d1ec5a, "");
                ir0Var.f458811e = optJSONArray.optJSONObject(i17).optString("wording", "");
                ir0Var.f458812f = optJSONArray.optJSONObject(i17).optBoolean("isUseToConfirm", false);
                xn6Var.T.f469934f.add(ir0Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(org.json.JSONObject r12, r45.xn6 r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn4.z0.n(org.json.JSONObject, r45.xn6):void");
    }

    public static void r(boolean z17, r45.xn6 xn6Var, org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("thumbUrl");
        xn6Var.f471790f = optString;
        if (z17) {
            xn6Var.f471793i = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
            xn6Var.f471794m = 640;
        } else {
            xn6Var.f471793i = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de;
            xn6Var.f471794m = 280;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            xn6Var.f471790f = "http://shp.qpic.cn/qqvideo_ori/0/" + xn6Var.f471792h + java.lang.String.format("_%s_%s/0", java.lang.Integer.valueOf(xn6Var.f471793i), java.lang.Integer.valueOf(xn6Var.f471794m));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "setThumbnailUrl %s %s", xn6Var.f471792h, xn6Var.f471790f);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(4:2|3|(1:5)(1:132)|6)|(1:8)(2:111|(17:113|(15:(1:(1:130))|10|(4:12|13|14|15)(4:104|105|106|107)|16|17|(2:18|(1:20)(1:21))|22|(2:26|(2:27|(2:29|(2:32|33)(1:31))(1:34)))(0)|35|(2:43|(3:49|(4:52|(2:54|(4:60|(1:62)|63|64))(1:69)|65|50)|70))|(1:73)|(1:75)|(1:80)|77|78)|131|10|(0)(0)|16|17|(3:18|(0)(0)|20)|22|(3:24|26|(3:27|(0)(0)|31))(0)|35|(5:37|39|41|43|(5:45|47|49|(1:50)|70))|(0)|(0)|(0)|77|78))|9|10|(0)(0)|16|17|(3:18|(0)(0)|20)|22|(0)(0)|35|(0)|(0)|(0)|(0)|77|78|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b2, code lost:
    
        r16 = r6;
        r6 = r1;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d0, code lost:
    
        r6.mo48348x1f9d589c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d5, code lost:
    
        r10.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01da, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0080 A[Catch: all -> 0x01bd, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01bd, blocks: (B:3:0x0010, B:6:0x001a, B:10:0x0050, B:12:0x0062, B:104:0x0080, B:111:0x0027), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062 A[Catch: all -> 0x01bd, TRY_LEAVE, TryCatch #3 {all -> 0x01bd, blocks: (B:3:0x0010, B:6:0x001a, B:10:0x0050, B:12:0x0062, B:104:0x0080, B:111:0x0027), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[Catch: all -> 0x01b1, LOOP:0: B:18:0x00a0->B:20:0x00a6, LOOP_END, TryCatch #0 {all -> 0x01b1, blocks: (B:17:0x0096, B:18:0x00a0, B:20:0x00a6, B:22:0x00aa, B:24:0x00c1, B:27:0x00ca, B:29:0x00d0, B:33:0x00dd, B:31:0x00e6, B:35:0x00e9, B:37:0x00f2, B:39:0x00fb, B:41:0x0101, B:43:0x0107, B:45:0x011c, B:47:0x0125, B:50:0x012c, B:52:0x0132, B:54:0x0138, B:56:0x014c, B:58:0x0152, B:60:0x0158, B:62:0x0175, B:63:0x018c), top: B:16:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[EDGE_INSN: B:21:0x00aa->B:22:0x00aa BREAK  A[LOOP:0: B:18:0x00a0->B:20:0x00a6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:17:0x0096, B:18:0x00a0, B:20:0x00a6, B:22:0x00aa, B:24:0x00c1, B:27:0x00ca, B:29:0x00d0, B:33:0x00dd, B:31:0x00e6, B:35:0x00e9, B:37:0x00f2, B:39:0x00fb, B:41:0x0101, B:43:0x0107, B:45:0x011c, B:47:0x0125, B:50:0x012c, B:52:0x0132, B:54:0x0138, B:56:0x014c, B:58:0x0152, B:60:0x0158, B:62:0x0175, B:63:0x018c), top: B:16:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:17:0x0096, B:18:0x00a0, B:20:0x00a6, B:22:0x00aa, B:24:0x00c1, B:27:0x00ca, B:29:0x00d0, B:33:0x00dd, B:31:0x00e6, B:35:0x00e9, B:37:0x00f2, B:39:0x00fb, B:41:0x0101, B:43:0x0107, B:45:0x011c, B:47:0x0125, B:50:0x012c, B:52:0x0132, B:54:0x0138, B:56:0x014c, B:58:0x0152, B:60:0x0158, B:62:0x0175, B:63:0x018c), top: B:16:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9 A[EDGE_INSN: B:34:0x00e9->B:35:0x00e9 BREAK  A[LOOP:1: B:27:0x00ca->B:31:0x00e6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:17:0x0096, B:18:0x00a0, B:20:0x00a6, B:22:0x00aa, B:24:0x00c1, B:27:0x00ca, B:29:0x00d0, B:33:0x00dd, B:31:0x00e6, B:35:0x00e9, B:37:0x00f2, B:39:0x00fb, B:41:0x0101, B:43:0x0107, B:45:0x011c, B:47:0x0125, B:50:0x012c, B:52:0x0132, B:54:0x0138, B:56:0x014c, B:58:0x0152, B:60:0x0158, B:62:0x0175, B:63:0x018c), top: B:16:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:17:0x0096, B:18:0x00a0, B:20:0x00a6, B:22:0x00aa, B:24:0x00c1, B:27:0x00ca, B:29:0x00d0, B:33:0x00dd, B:31:0x00e6, B:35:0x00e9, B:37:0x00f2, B:39:0x00fb, B:41:0x0101, B:43:0x0107, B:45:0x011c, B:47:0x0125, B:50:0x012c, B:52:0x0132, B:54:0x0138, B:56:0x014c, B:58:0x0152, B:60:0x0158, B:62:0x0175, B:63:0x018c), top: B:16:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(r45.xn6 r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn4.z0.s(r45.xn6, java.lang.String, java.lang.String):void");
    }

    public java.util.List b() {
        return this.f346164a.r0().f469048u;
    }

    public r45.xn6 d(int i17) {
        synchronized (this) {
            if (i17 >= 0) {
                if (i17 < ((java.util.LinkedList) b()).size()) {
                    return (r45.xn6) ((java.util.LinkedList) b()).get(i17);
                }
            }
            return null;
        }
    }

    public int e() {
        return ((java.util.LinkedList) b()).size();
    }

    public void i() {
        if (this.f346167d != null) {
            gm0.j1.d().d(this.f346167d);
            this.f346167d = null;
        }
        if (this.f346168e != null) {
            gm0.j1.d().d(this.f346168e);
            this.f346168e = null;
        }
        gm0.j1.d().q(1943, this.f346169f);
    }

    public void o(int i17) {
        synchronized (this) {
            if (i17 >= 0) {
                if (i17 < ((java.util.LinkedList) b()).size()) {
                    ((java.util.LinkedList) b()).remove(i17);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean p(int i17) {
        java.lang.Object[] objArr;
        java.lang.String str;
        if (this.f346165b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TopStory.TopStoryVideoDataMgr", "RequestingData");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "requestData: %s", java.lang.Integer.valueOf(i17));
        this.f346165b = true;
        r45.un6 a17 = pm4.w.a(this.f346164a.r0());
        a17.f469046s = i17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f346164a.r0().f469034d)) {
            r45.x50 x50Var = new r45.x50();
            x50Var.f471321d = "relevant_vid";
            x50Var.f471323f = this.f346164a.r0().f469034d;
            a17.f469044q.add(x50Var);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f346164a.r0().f469035e)) {
            r45.x50 x50Var2 = new r45.x50();
            x50Var2.f471321d = "relevant_expand";
            x50Var2.f471323f = this.f346164a.r0().f469035e;
            a17.f469044q.add(x50Var2);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f346164a.r0().f469036f)) {
            r45.x50 x50Var3 = new r45.x50();
            x50Var3.f471321d = "relevant_pre_searchid";
            x50Var3.f471323f = this.f346164a.r0().f469036f;
            a17.f469044q.add(x50Var3);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f346164a.r0().f469037g)) {
            r45.x50 x50Var4 = new r45.x50();
            x50Var4.f471321d = "relevant_shared_openid";
            x50Var4.f471323f = this.f346164a.r0().f469037g;
            a17.f469044q.add(x50Var4);
        }
        if (this.f346164a.r0().f469043p != null) {
            r45.x50 x50Var5 = new r45.x50();
            x50Var5.f471321d = "rec_category";
            x50Var5.f471322e = this.f346164a.r0().f469043p.f471330f;
            a17.f469044q.add(x50Var5);
        } else {
            r45.x50 x50Var6 = new r45.x50();
            x50Var6.f471321d = "rec_category";
            x50Var6.f471322e = this.f346164a.r0().f469038h;
            a17.f469044q.add(x50Var6);
        }
        java.util.Iterator it = a17.f469044q.iterator();
        while (true) {
            if (!it.hasNext()) {
                objArr = true;
                break;
            }
            if ("show_tag_list".equals(((r45.x50) it.next()).f471321d)) {
                objArr = false;
                break;
            }
        }
        if (this.f346164a.r0().f469043p != null && objArr != false) {
            r45.x50 x50Var7 = new r45.x50();
            x50Var7.f471321d = "show_tag_list";
            x50Var7.f471323f = this.f346164a.r0().f469043p.f471328d;
            a17.f469044q.add(x50Var7);
        }
        r45.x50 x50Var8 = new r45.x50();
        x50Var8.f471321d = "fetch_seed_videoinfo";
        if (this.f346164a.r0().f469043p == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f346164a.r0().f469043p.f471328d)) {
            x50Var8.f471322e = 1L;
        } else {
            x50Var8.f471322e = 0L;
        }
        a17.f469044q.add(x50Var8);
        if (e() == 1) {
            r45.xn6 d17 = d(0);
            r45.x50 x50Var9 = new r45.x50();
            x50Var9.f471321d = "first_video_tag_list";
            x50Var9.f471323f = pm4.w.s(d17.D).toString();
            a17.f469044q.add(x50Var9);
        }
        java.util.HashMap hashMap = (java.util.HashMap) this.f346164a.o4().f346007a;
        if (hashMap.size() > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(hashMap.values());
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                rm4.e eVar = (rm4.e) it6.next();
                stringBuffer.append(eVar.f479009b ? 1 : 0);
                stringBuffer.append("_");
                stringBuffer.append(eVar.f479008a.f471792h);
                stringBuffer.append(";");
            }
            str = stringBuffer.toString();
        } else {
            str = null;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            r45.x50 x50Var10 = new r45.x50();
            x50Var10.f471321d = "client_exposed_info";
            x50Var10.f471323f = str;
            a17.f469044q.add(x50Var10);
        }
        r45.x50 x50Var11 = new r45.x50();
        x50Var11.f471321d = "is_prefetch";
        x50Var11.f471322e = this.f346166c;
        a17.f469044q.add(x50Var11);
        if (this.f346167d != null) {
            gm0.j1.d().d(this.f346167d);
            this.f346167d = null;
        }
        this.f346167d = new sm4.k(a17);
        gm0.j1.d().g(this.f346167d);
        gm0.j1.d().a(1943, this.f346169f);
        uu4.a.a(0);
        return true;
    }

    public void q(r45.un6 un6Var, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this) {
            java.util.List b17 = b();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(b17)) {
                java.util.LinkedList linkedList = (java.util.LinkedList) b17;
                if (i17 < linkedList.size()) {
                    int i18 = i17 > 0 ? i17 - 1 : 0;
                    for (int i19 = i18; i19 < linkedList.size() && i19 < i18 + 10; i19++) {
                        arrayList.add(((r45.xn6) linkedList.get(i19)).f471792h);
                    }
                    sm4.e eVar = new sm4.e(un6Var, arrayList);
                    gm0.j1.d().g(eVar);
                    gm0.j1.d().a(2579, new fn4.t0(this, eVar));
                }
            }
        }
    }
}

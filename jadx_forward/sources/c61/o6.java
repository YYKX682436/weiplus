package c61;

/* loaded from: classes10.dex */
public final class o6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.l7 f120733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(c61.l7 l7Var) {
        super(0);
        this.f120733d = l7Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        cz2.h hVar = new cz2.h();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LAST_WX_VERSION_STRING_SYNC;
        java.lang.String v17 = c17.v(u3Var, "");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g, v17);
        java.lang.String str = cz2.h.f306539b;
        if (b17) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "change version " + v17 + " => " + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g);
            gm0.j1.u().c().x(u3Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g);
            z17 = true;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LAST_WX_VERSION2_STRING_SYNC;
        java.lang.String v18 = c18.v(u3Var2, "");
        java.lang.String format = java.lang.String.format("%08x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f424562g)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(format, v18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "change wechatv " + v18 + " => " + format);
            gm0.j1.u().c().x(u3Var2, format);
            z17 = true;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c19 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LAST_WX_TAG_STRING_SYNC;
        java.lang.String v19 = c19.v(u3Var3, "");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a, v19)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "change tag " + v19 + " => " + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a);
            gm0.j1.u().c().x(u3Var3, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a);
            z17 = true;
        }
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v19);
            hVar.f306540a.a();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6589xda6addba c6589xda6addba = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6589xda6addba();
            c6589xda6addba.f139405d = 8;
            c6589xda6addba.f139406e = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
            c6589xda6addba.f139407f = c6589xda6addba.b("actionName", "wx_change", true);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("lastVersion", v17);
            jSONObject.put("lastVersion2", v18);
            jSONObject.put("lastTag", v19);
            jSONObject.put("ver", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g);
            jSONObject.put("ver_init", lp0.a.f401782c);
            java.lang.String format2 = java.lang.String.format("%08x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f424562g)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
            jSONObject.put("CLIENT_VERSION", format2);
            jSONObject.put("tag", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a);
            jSONObject.put("rev", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            c6589xda6addba.f139408g = c6589xda6addba.b("actionExt", r26.i0.t(jSONObject2, ",", ";", false), true);
            c6589xda6addba.f139414m = c01.id.a();
            c6589xda6addba.f139409h = 0;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.a();
            jSONObject3.put("result", a17 != null ? r26.i0.t(a17, "\n", ";", false) : null);
            java.lang.String jSONObject4 = jSONObject3.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            c6589xda6addba.f139410i = c6589xda6addba.b("resultExt", r26.i0.t(jSONObject4, ",", ";", false), true);
            c6589xda6addba.f139411j = 0;
            c6589xda6addba.f139413l = 0L;
            m92.b I1 = g92.a.I1(g92.b.f351302e, false, 1, null);
            java.lang.String str2 = I1 != null ? I1.f68710x21f9b213 : null;
            c6589xda6addba.f139412k = c6589xda6addba.b("snn", str2 != null ? str2 : "", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "report value " + c6589xda6addba.n());
            c6589xda6addba.k();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z1 z1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z1.f184275a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y1 y1Var : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.z1.f184277c) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(L);
            y1Var.getClass();
            java.lang.String str3 = y1Var.f184239c;
            if (L.getLong(str3, 0L) != 0) {
                L.putLong(str3, 0L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCrashChecker", "clean " + str3);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(y1Var.f184237a, y1Var.f184238b, 1L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCrashChecker", "check " + str3 + ", hit!");
            }
        }
        c61.l7 l7Var = this.f120733d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorage", "clearInvalidData DELETE FROM FinderDraftItem WHERE finderItem IS NULL, succ:" + l7Var.Oj().f303961i.A("FinderDraftItem", "DELETE FROM FinderDraftItem WHERE finderItem IS NULL"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.R = android.provider.Settings.System.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "accelerometer_rotation", 1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoOrientationUIC", "checkSysAllowRotate: systemEnableLandscape = " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.R);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r3 r3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r3) ((jz5.n) l7Var.f120670y0).mo141623x754a37bb();
        r3Var.a();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5723x5d13c579>(a0Var) { // from class: com.tencent.mm.plugin.finder.assist.FinderLiteAppStoreHelper$registerStoreMethod$1
            {
                this.f39173x3fe91575 = 1366460297;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5723x5d13c579 c5723x5d13c579) {
                org.json.JSONObject jSONObject5;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5723x5d13c579 event = c5723x5d13c579;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r3 r3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r3.this;
                r3Var2.a();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MusicPostSelectEvent callback: url=");
                am.kk kkVar = event.f136046g;
                sb6.append(kkVar.f88693a);
                sb6.append(", isCancel=");
                sb6.append(kkVar.f88695c);
                sb6.append(", errCode=");
                sb6.append(kkVar.f88696d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiteAppStoreUtils", sb6.toString());
                if (kkVar.f88696d != 0) {
                    jSONObject5 = new org.json.JSONObject();
                    jSONObject5.put("errCode", kkVar.f88696d);
                    jSONObject5.put("errMsg", "");
                    jSONObject5.put("audioUrl", "");
                    jSONObject5.put("isCancel", 0);
                } else {
                    jSONObject5 = new org.json.JSONObject();
                    jSONObject5.put("errCode", 0);
                    jSONObject5.put("errMsg", "");
                    java.lang.String str4 = kkVar.f88693a;
                    jSONObject5.put("audioUrl", str4 != null ? str4 : "");
                    jSONObject5.put("isCancel", kkVar.f88695c ? 1 : 0);
                    jSONObject5.put("duration", kkVar.f88697e);
                    jSONObject5.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37651x123b08d, kkVar.f88698f);
                    long j17 = kkVar.f88694b;
                    if (j17 != 0) {
                        jSONObject5.put("feedId", pm0.v.u(j17));
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = r3Var2.f184036a;
                if (sVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q3 q3Var = r3Var2.f184037b;
                    sVar.c(q3Var != null ? q3Var.f184011a : 0L, q3Var != null ? q3Var.f184012b : 0, jSONObject5.toString());
                }
                return false;
            }
        }.mo48813x58998cd();
        return jz5.f0.f384359a;
    }
}

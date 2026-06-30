package yy0;

/* loaded from: classes16.dex */
public final class s0 implements com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.AnalyticsListener {

    /* renamed from: a, reason: collision with root package name */
    public static final yy0.s0 f549846a = new yy0.s0();

    @Override // com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.AnalyticsListener
    /* renamed from: onEvent */
    public final void mo9327xaf8c47fb(com.p314xaae8f345.p457x3304c6.p458x9b169b86.C3968xe11269b1 c3968xe11269b1) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z17;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        boolean z18;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        boolean z19;
        java.lang.String str10;
        boolean z27;
        java.nio.ByteBuffer m32402x27f85b92;
        if (c3968xe11269b1 != null) {
            ig.a aVar = c3968xe11269b1.f129329a;
            int i17 = aVar == null ? -1 : yy0.r0.f549834a[aVar.ordinal()];
            ig.j0 j0Var = null;
            ig.w0 w0Var = null;
            ig.s0 s0Var = null;
            ig.n0 n0Var = null;
            ig.j0 j0Var2 = null;
            if (i17 == 1) {
                java.nio.ByteBuffer m32402x27f85b922 = c3968xe11269b1.m32402x27f85b92();
                if (m32402x27f85b922 != null) {
                    try {
                        w0Var = ig.w0.m136531x92b714fd(m32402x27f85b922);
                        str = "PostId";
                        str2 = "getValuesList(...)";
                        str3 = "toString(...)";
                        z17 = false;
                    } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                        str = "PostId";
                        str2 = "getValuesList(...)";
                        str3 = "toString(...)";
                        z17 = false;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("PublisherSessionMetricsReport", e17, "PublisherSessionMetrics pb error", new java.lang.Object[0]);
                    }
                    if (w0Var != null) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6692x2938cb6c c6692x2938cb6c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6692x2938cb6c();
                        java.lang.String mo136364x23a7af9b = w0Var.mo136364x23a7af9b();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136364x23a7af9b, "getSessionId(...)");
                        c6692x2938cb6c.f140283d = c6692x2938cb6c.b("PublisherSessionID", r26.i0.t(mo136364x23a7af9b, ",", ";", z17), true);
                        java.lang.String mo136321xe2daf416 = w0Var.mo136321xe2daf416();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136321xe2daf416, "getEntryType(...)");
                        c6692x2938cb6c.f140284e = c6692x2938cb6c.b("EntryType", r26.i0.t(mo136321xe2daf416, ",", ";", z17), true);
                        java.lang.String mo136328x1f4d2bfc = w0Var.mo136328x1f4d2bfc();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136328x1f4d2bfc, "getMaasVersion(...)");
                        c6692x2938cb6c.f140285f = c6692x2938cb6c.b("MaasSDKVersion", r26.i0.t(mo136328x1f4d2bfc, ",", ";", z17), true);
                        c6692x2938cb6c.f140286g = w0Var.mo136317x19fe5b43();
                        c6692x2938cb6c.f140287h = (int) w0Var.mo136370x195b8688();
                        java.lang.String mo136318x5cc82849 = w0Var.mo136318x5cc82849();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136318x5cc82849, "getEndReason(...)");
                        c6692x2938cb6c.f140288i = c6692x2938cb6c.b("EndReason", r26.i0.t(mo136318x5cc82849, ",", ";", z17), true);
                        c6692x2938cb6c.f140289j = (int) w0Var.mo136371xdde452fc();
                        java.lang.String mo136326x665c9ccc = w0Var.mo136326x665c9ccc();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136326x665c9ccc, "getLastViewId(...)");
                        c6692x2938cb6c.f140290k = c6692x2938cb6c.b("LastViewID", r26.i0.t(mo136326x665c9ccc, ",", ";", z17), true);
                        java.lang.String mo136324xd91044e0 = w0Var.mo136324xd91044e0();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136324xd91044e0, "getLastStateId(...)");
                        c6692x2938cb6c.f140291l = c6692x2938cb6c.b("LastStateID", r26.i0.t(mo136324xd91044e0, ",", ";", z17), true);
                        c6692x2938cb6c.f140292m = w0Var.mo136373x2c20f3da();
                        c6692x2938cb6c.f140293n = w0Var.mo136372x53782216();
                        c6692x2938cb6c.f140294o = (int) w0Var.mo136334xa8f9ef8b();
                        c6692x2938cb6c.f140295p = (int) w0Var.mo136323x1258ce83();
                        c6692x2938cb6c.f140296q = (int) w0Var.mo136369xdada41d5();
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135467x9ac07628 = w0Var.mo136352x6271019d().mo135467x9ac07628();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135467x9ac07628, "getKeysList(...)");
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135471x691318d6 = w0Var.mo136352x6271019d().mo135471x691318d6();
                        java.lang.String str11 = str2;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135471x691318d6, str11);
                        java.util.Iterator it = ((java.util.ArrayList) kz5.n0.a1(mo135467x9ac07628, mo135471x691318d6)).iterator();
                        while (it.hasNext()) {
                            jz5.l lVar = (jz5.l) it.next();
                            jSONObject.put((java.lang.String) lVar.f384366d, lVar.f384367e);
                        }
                        java.lang.String jSONObject2 = jSONObject.toString();
                        java.lang.String str12 = str3;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, str12);
                        c6692x2938cb6c.f140297r = c6692x2938cb6c.b("SCMetrics", r26.i0.t(jSONObject2, ",", ";", false), true);
                        java.lang.String mo136350xc3f7faf3 = w0Var.mo136350xc3f7faf3();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136350xc3f7faf3, "getResultOriginType(...)");
                        c6692x2938cb6c.f140298s = c6692x2938cb6c.b("ResultOriginType", r26.i0.t(mo136350xc3f7faf3, ",", ";", false), true);
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135467x9ac076282 = w0Var.mo136344xef3dd203().mo135467x9ac07628();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135467x9ac076282, "getKeysList(...)");
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135471x691318d62 = w0Var.mo136344xef3dd203().mo135471x691318d6();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135471x691318d62, str11);
                        java.util.Iterator it6 = ((java.util.ArrayList) kz5.n0.a1(mo135467x9ac076282, mo135471x691318d62)).iterator();
                        while (it6.hasNext()) {
                            jz5.l lVar2 = (jz5.l) it6.next();
                            jSONObject3.put((java.lang.String) lVar2.f384366d, lVar2.f384367e);
                        }
                        java.lang.String jSONObject4 = jSONObject3.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, str12);
                        c6692x2938cb6c.f140299t = c6692x2938cb6c.b("ResultInfoMedia", r26.i0.t(jSONObject4, ",", ";", false), true);
                        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135467x9ac076283 = w0Var.mo136347x5aaef891().mo135467x9ac07628();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135467x9ac076283, "getKeysList(...)");
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135471x691318d63 = w0Var.mo136347x5aaef891().mo135471x691318d6();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135471x691318d63, str11);
                        java.util.Iterator it7 = ((java.util.ArrayList) kz5.n0.a1(mo135467x9ac076283, mo135471x691318d63)).iterator();
                        while (it7.hasNext()) {
                            jz5.l lVar3 = (jz5.l) it7.next();
                            jSONObject5.put((java.lang.String) lVar3.f384366d, lVar3.f384367e);
                        }
                        java.lang.String jSONObject6 = jSONObject5.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject6, str12);
                        c6692x2938cb6c.f140300u = c6692x2938cb6c.b("ResultInfoSC", r26.i0.t(jSONObject6, ",", ";", false), true);
                        c6692x2938cb6c.f140301v = w0Var.mo136320xbcc8608a();
                        c6692x2938cb6c.f140302w = w0Var.mo136335x1d91a854();
                        org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135467x9ac076284 = w0Var.mo136338x5aaef7d7().mo135467x9ac07628();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135467x9ac076284, "getKeysList(...)");
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135471x691318d64 = w0Var.mo136338x5aaef7d7().mo135471x691318d6();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135471x691318d64, str11);
                        java.util.Iterator it8 = ((java.util.ArrayList) kz5.n0.a1(mo135467x9ac076284, mo135471x691318d64)).iterator();
                        while (it8.hasNext()) {
                            jz5.l lVar4 = (jz5.l) it8.next();
                            jSONObject7.put((java.lang.String) lVar4.f384366d, lVar4.f384367e);
                        }
                        java.lang.String jSONObject8 = jSONObject7.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject8, str12);
                        c6692x2938cb6c.f140303x = c6692x2938cb6c.b("ResultInfoMC", r26.i0.t(jSONObject8, ",", ";", false), true);
                        org.json.JSONObject jSONObject9 = new org.json.JSONObject();
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135467x9ac076285 = w0Var.mo136330xe8d66797().mo135467x9ac07628();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135467x9ac076285, "getKeysList(...)");
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135471x691318d65 = w0Var.mo136330xe8d66797().mo135471x691318d6();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135471x691318d65, str11);
                        java.util.Iterator it9 = ((java.util.ArrayList) kz5.n0.a1(mo135467x9ac076285, mo135471x691318d65)).iterator();
                        while (it9.hasNext()) {
                            jz5.l lVar5 = (jz5.l) it9.next();
                            jSONObject9.put((java.lang.String) lVar5.f384366d, lVar5.f384367e);
                        }
                        java.lang.String jSONObject10 = jSONObject9.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject10, str12);
                        c6692x2938cb6c.f140304y = c6692x2938cb6c.b("MCMetrics", r26.i0.t(jSONObject10, ",", ";", false), true);
                        org.json.JSONObject jSONObject11 = new org.json.JSONObject();
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135467x9ac076286 = w0Var.mo136340x6eeefa1e().mo135467x9ac07628();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135467x9ac076286, "getKeysList(...)");
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135471x691318d66 = w0Var.mo136340x6eeefa1e().mo135471x691318d6();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135471x691318d66, str11);
                        java.util.Iterator it10 = ((java.util.ArrayList) kz5.n0.a1(mo135467x9ac076286, mo135471x691318d66)).iterator();
                        while (it10.hasNext()) {
                            jz5.l lVar6 = (jz5.l) it10.next();
                            jSONObject11.put((java.lang.String) lVar6.f384366d, lVar6.f384367e);
                        }
                        java.lang.String jSONObject12 = jSONObject11.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject12, str12);
                        c6692x2938cb6c.f140305z = c6692x2938cb6c.b("ResultInfoMCMaterial", r26.i0.t(jSONObject12, ",", ";", false), true);
                        org.json.JSONObject jSONObject13 = new org.json.JSONObject();
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135467x9ac076287 = w0Var.mo136366xb0905257().mo135467x9ac07628();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135467x9ac076287, "getKeysList(...)");
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135471x691318d67 = w0Var.mo136366xb0905257().mo135471x691318d6();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135471x691318d67, str11);
                        java.util.Iterator it11 = ((java.util.ArrayList) kz5.n0.a1(mo135467x9ac076287, mo135471x691318d67)).iterator();
                        while (it11.hasNext()) {
                            jz5.l lVar7 = (jz5.l) it11.next();
                            jSONObject13.put((java.lang.String) lVar7.f384366d, lVar7.f384367e);
                        }
                        java.lang.String jSONObject14 = jSONObject13.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject14, str12);
                        c6692x2938cb6c.A = c6692x2938cb6c.b("StartupOptions", r26.i0.t(jSONObject14, ",", ";", false), true);
                        c6692x2938cb6c.B = c6692x2938cb6c.b(str, w0Var.mo136336x2a881cd1(), true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PublisherSessionMetricsReport", "29692 MJPublisherSessionStruct values:\npublisherSessionID = " + c6692x2938cb6c.f140283d + "\nentryType = " + c6692x2938cb6c.f140284e + "\nmaasSDKVersion = " + c6692x2938cb6c.f140285f + "\nbeginTime = " + c6692x2938cb6c.f140286g + "\ntotalDurationMillis = " + c6692x2938cb6c.f140287h + "\nendReason = " + c6692x2938cb6c.f140288i + "\nvalidationCode = " + c6692x2938cb6c.f140289j + "\nlastViewID = " + c6692x2938cb6c.f140290k + "\nlastStateID = " + c6692x2938cb6c.f140291l + "\nvisitedViews = " + c6692x2938cb6c.f140292m + "\nvisitedStates = " + c6692x2938cb6c.f140293n + "\nmetricsVersion = " + c6692x2938cb6c.f140294o + "\nfirstImpressionTimeCostMillis = " + c6692x2938cb6c.f140295p + "\ntotalDownloadBytes = " + c6692x2938cb6c.f140296q + "\nscMetrics = " + c6692x2938cb6c.f140297r + "\nresultOriginType = " + c6692x2938cb6c.f140298s + "\nresultInfoMedia = " + c6692x2938cb6c.f140299t + "\nresultInfoSC = " + c6692x2938cb6c.f140300u + "\nenterScene = " + c6692x2938cb6c.f140301v + "\nparentEnterScene = " + c6692x2938cb6c.f140302w + "\nresultInfoMC = " + c6692x2938cb6c.f140303x + "\nmcMetrics = " + c6692x2938cb6c.f140304y + "\nresultInfoMCMaterial = " + c6692x2938cb6c.f140305z + "\nstartupOptions = " + c6692x2938cb6c.A + "\npostId = " + c6692x2938cb6c.B);
                        c6692x2938cb6c.k();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i17 == 2) {
                java.nio.ByteBuffer m32402x27f85b923 = c3968xe11269b1.m32402x27f85b92();
                if (m32402x27f85b923 != null) {
                    try {
                        s0Var = ig.s0.m136198x92b714fd(m32402x27f85b923);
                        str5 = "TaskName";
                        str4 = "EndReason";
                        str6 = "getEndReason(...)";
                        z18 = false;
                    } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e18) {
                        str4 = "EndReason";
                        str5 = "TaskName";
                        str6 = "getEndReason(...)";
                        z18 = false;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("PublisherSessionMetricsReport", e18, "PublisherSCTaskMetrics pb error", new java.lang.Object[0]);
                    }
                    if (s0Var != null) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6691xe61da89 c6691xe61da89 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6691xe61da89();
                        java.lang.String mo136083x23a7af9b = s0Var.mo136083x23a7af9b();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136083x23a7af9b, "getSessionId(...)");
                        c6691xe61da89.f140268d = c6691xe61da89.b("PublisherSessionID", r26.i0.t(mo136083x23a7af9b, ",", ";", z18), true);
                        java.lang.String mo136076xe2daf416 = s0Var.mo136076xe2daf416();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136076xe2daf416, "getEntryType(...)");
                        c6691xe61da89.f140269e = c6691xe61da89.b("EntryType", r26.i0.t(mo136076xe2daf416, ",", ";", z18), true);
                        java.lang.String mo136078x1f4d2bfc = s0Var.mo136078x1f4d2bfc();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136078x1f4d2bfc, "getMaasVersion(...)");
                        c6691xe61da89.f140270f = c6691xe61da89.b("MaasSDKVersion", r26.i0.t(mo136078x1f4d2bfc, ",", ";", z18), true);
                        java.lang.String mo136085x30961476 = s0Var.mo136085x30961476();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136085x30961476, "getTaskId(...)");
                        c6691xe61da89.f140271g = c6691xe61da89.b("TaskID", r26.i0.t(mo136085x30961476, ",", ";", z18), true);
                        java.lang.String mo136087x63651726 = s0Var.mo136087x63651726();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136087x63651726, "getTaskName(...)");
                        c6691xe61da89.f140272h = c6691xe61da89.b(str5, r26.i0.t(mo136087x63651726, ",", ";", z18), true);
                        c6691xe61da89.f140273i = s0Var.mo136067x19fe5b43();
                        c6691xe61da89.f140274j = (int) s0Var.mo136094x195b8688();
                        java.lang.String mo136073x5cc82849 = s0Var.mo136073x5cc82849();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136073x5cc82849, str6);
                        c6691xe61da89.f140275k = c6691xe61da89.b(str4, r26.i0.t(mo136073x5cc82849, ",", ";", z18), true);
                        java.lang.String mo136089x3bfa572b = s0Var.mo136089x3bfa572b();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136089x3bfa572b, "getTemplateId(...)");
                        c6691xe61da89.f140276l = c6691xe61da89.b("TemplateID", r26.i0.t(mo136089x3bfa572b, ",", ";", z18), true);
                        c6691xe61da89.f140277m = (int) s0Var.mo136091xb16be4c2();
                        java.lang.String mo136092xec85fc70 = s0Var.mo136092xec85fc70();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136092xec85fc70, "getTemplateSelectReason(...)");
                        c6691xe61da89.f140278n = c6691xe61da89.b("TemplateSelectionReason", r26.i0.t(mo136092xec85fc70, ",", ";", z18), true);
                        java.lang.String mo136068xcc32ee14 = s0Var.mo136068xcc32ee14();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo136068xcc32ee14, "getCamSource(...)");
                        c6691xe61da89.f140279o = c6691xe61da89.b("CameraInUse", r26.i0.t(mo136068xcc32ee14, ",", ";", z18), true);
                        org.json.JSONObject jSONObject15 = new org.json.JSONObject();
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135467x9ac076288 = s0Var.mo136070x9aa62e0c().mo135467x9ac07628();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135467x9ac076288, "getKeysList(...)");
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135471x691318d68 = s0Var.mo136070x9aa62e0c().mo135471x691318d6();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135471x691318d68, "getValuesList(...)");
                        java.util.Iterator it12 = ((java.util.ArrayList) kz5.n0.a1(mo135467x9ac076288, mo135471x691318d68)).iterator();
                        while (it12.hasNext()) {
                            jz5.l lVar8 = (jz5.l) it12.next();
                            jSONObject15.put((java.lang.String) lVar8.f384366d, lVar8.f384367e);
                        }
                        java.lang.String jSONObject16 = jSONObject15.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject16, "toString(...)");
                        c6691xe61da89.f140280p = c6691xe61da89.b("Details", r26.i0.t(jSONObject16, ",", ";", false), true);
                        c6691xe61da89.f140281q = s0Var.mo136075xbcc8608a();
                        c6691xe61da89.f140282r = c6691xe61da89.b("PostId", s0Var.mo136081x2a881cd1(), true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PublisherSessionMetricsReport", "29693 MJPublisherSCTaskStruct values:\npublisherSessionID = " + c6691xe61da89.f140268d + "\nentryType = " + c6691xe61da89.f140269e + "\nmaasSDKVersion = " + c6691xe61da89.f140270f + "\ntaskID = " + c6691xe61da89.f140271g + "\ntaskName = " + c6691xe61da89.f140272h + "\nbeginTime = " + c6691xe61da89.f140273i + "\ndurationMillis = " + c6691xe61da89.f140274j + "\nendReason = " + c6691xe61da89.f140275k + "\ntemplateID = " + c6691xe61da89.f140276l + "\ntemplateIndex = " + c6691xe61da89.f140277m + "\ntemplateSelectionReason = " + c6691xe61da89.f140278n + "\ncameraInUse = " + c6691xe61da89.f140279o + "\ndetails = " + c6691xe61da89.f140280p + "\nenterScene = " + c6691xe61da89.f140281q + "\npostId = " + c6691xe61da89.f140282r);
                        c6691xe61da89.k();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i17 != 3) {
                if (i17 != 4) {
                    if (i17 == 5 && (m32402x27f85b92 = c3968xe11269b1.m32402x27f85b92()) != null) {
                        try {
                            j0Var = ig.j0.m135696x92b714fd(m32402x27f85b92);
                        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e19) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("PublisherSessionMetricsReport", e19, "PublisherEventMetrics pb error", new java.lang.Object[0]);
                        }
                        if (j0Var != null) {
                            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                            java.util.Map l17 = kz5.c1.l(new jz5.l("view_id", j0Var.mo135633x149f58f()), new jz5.l("mj_publisher_session_id", j0Var.mo135640x23a7af9b()), new jz5.l("entry_type", j0Var.mo135631xe2daf416()), new jz5.l("maas_version", j0Var.mo135635x1f4d2bfc()));
                            com.p176xb6135e39.p283xc50a8b8b.j9 mo135467x9ac076289 = j0Var.mo135627x9aa62e0c().mo135467x9ac07628();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135467x9ac076289, "getKeysList(...)");
                            com.p176xb6135e39.p283xc50a8b8b.j9 mo135471x691318d69 = j0Var.mo135627x9aa62e0c().mo135471x691318d6();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135471x691318d69, "getValuesList(...)");
                            l17.putAll(kz5.c1.q(kz5.n0.a1(mo135467x9ac076289, mo135471x691318d69)));
                            ((cy1.a) rVar).yj(j0Var.mo135633x149f58f(), null, kz5.c1.s(l17), 6, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                java.nio.ByteBuffer m32402x27f85b924 = c3968xe11269b1.m32402x27f85b92();
                if (m32402x27f85b924 != null) {
                    try {
                        j0Var2 = ig.j0.m135696x92b714fd(m32402x27f85b924);
                        str10 = "Details";
                        z27 = false;
                    } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e27) {
                        str10 = "Details";
                        z27 = false;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("PublisherSessionMetricsReport", e27, "PublisherEventMetrics pb error", new java.lang.Object[0]);
                    }
                    if (j0Var2 != null) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6689x587c8cb0 c6689x587c8cb0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6689x587c8cb0();
                        java.lang.String mo135640x23a7af9b = j0Var2.mo135640x23a7af9b();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135640x23a7af9b, "getSessionId(...)");
                        c6689x587c8cb0.f140248d = c6689x587c8cb0.b("PublisherSessionID", r26.i0.t(mo135640x23a7af9b, ",", ";", z27), true);
                        java.lang.String mo135631xe2daf416 = j0Var2.mo135631xe2daf416();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135631xe2daf416, "getEntryType(...)");
                        c6689x587c8cb0.f140249e = c6689x587c8cb0.b("EntryType", r26.i0.t(mo135631xe2daf416, ",", ";", z27), true);
                        java.lang.String mo135635x1f4d2bfc = j0Var2.mo135635x1f4d2bfc();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135635x1f4d2bfc, "getMaasVersion(...)");
                        c6689x587c8cb0.f140250f = c6689x587c8cb0.b("MaasSDKVersion", r26.i0.t(mo135635x1f4d2bfc, ",", ";", z27), true);
                        java.lang.String mo135633x149f58f = j0Var2.mo135633x149f58f();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135633x149f58f, "getEventName(...)");
                        c6689x587c8cb0.f140251g = c6689x587c8cb0.b("EventName", r26.i0.t(mo135633x149f58f, ",", ";", z27), true);
                        org.json.JSONObject jSONObject17 = new org.json.JSONObject();
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135467x9ac0762810 = j0Var2.mo135627x9aa62e0c().mo135467x9ac07628();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135467x9ac0762810, "getKeysList(...)");
                        com.p176xb6135e39.p283xc50a8b8b.j9 mo135471x691318d610 = j0Var2.mo135627x9aa62e0c().mo135471x691318d6();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135471x691318d610, "getValuesList(...)");
                        java.util.Iterator it13 = ((java.util.ArrayList) kz5.n0.a1(mo135467x9ac0762810, mo135471x691318d610)).iterator();
                        while (it13.hasNext()) {
                            jz5.l lVar9 = (jz5.l) it13.next();
                            jSONObject17.put((java.lang.String) lVar9.f384366d, lVar9.f384367e);
                        }
                        java.lang.String jSONObject18 = jSONObject17.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject18, "toString(...)");
                        c6689x587c8cb0.f140252h = c6689x587c8cb0.b(str10, r26.i0.t(jSONObject18, ",", ";", false), true);
                        c6689x587c8cb0.f140253i = j0Var2.mo135630xbcc8608a();
                        c6689x587c8cb0.f140254j = c6689x587c8cb0.b("PostId", j0Var2.mo135638x2a881cd1(), true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PublisherSessionMetricsReport", "29694 MJPublisherEventStruct values:\npublisherSessionID = " + c6689x587c8cb0.f140248d + "\nentryType = " + c6689x587c8cb0.f140249e + "\nmaasSDKVersion = " + c6689x587c8cb0.f140250f + "\neventName = " + c6689x587c8cb0.f140251g + "\ndetails = " + c6689x587c8cb0.f140252h + "\nenterScene = " + c6689x587c8cb0.f140253i + "\npostId = " + c6689x587c8cb0.f140254j);
                        c6689x587c8cb0.k();
                        return;
                    }
                    return;
                }
                return;
            }
            java.nio.ByteBuffer m32402x27f85b925 = c3968xe11269b1.m32402x27f85b92();
            if (m32402x27f85b925 != null) {
                try {
                    n0Var = ig.n0.m135977x92b714fd(m32402x27f85b925);
                    str7 = "\nentryType = ";
                    str8 = "Details";
                    str9 = "PostId";
                    z19 = false;
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e28) {
                    str7 = "\nentryType = ";
                    str8 = "Details";
                    str9 = "PostId";
                    z19 = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("PublisherSessionMetricsReport", e28, "PublisherMCTaskMetrics pb error", new java.lang.Object[0]);
                }
                if (n0Var != null) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6690xe037fa4f c6690xe037fa4f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6690xe037fa4f();
                    java.lang.String mo135867x23a7af9b = n0Var.mo135867x23a7af9b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135867x23a7af9b, "getSessionId(...)");
                    c6690xe037fa4f.f140255d = c6690xe037fa4f.b("PublisherSessionID", r26.i0.t(mo135867x23a7af9b, ",", ";", z19), true);
                    java.lang.String mo135857xe2daf416 = n0Var.mo135857xe2daf416();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135857xe2daf416, "getEntryType(...)");
                    c6690xe037fa4f.f140256e = c6690xe037fa4f.b("EntryType", r26.i0.t(mo135857xe2daf416, ",", ";", z19), true);
                    java.lang.String mo135862x1f4d2bfc = n0Var.mo135862x1f4d2bfc();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135862x1f4d2bfc, "getMaasVersion(...)");
                    c6690xe037fa4f.f140257f = c6690xe037fa4f.b("MaasSDKVersion", r26.i0.t(mo135862x1f4d2bfc, ",", ";", z19), true);
                    java.lang.String mo135869x30961476 = n0Var.mo135869x30961476();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135869x30961476, "getTaskId(...)");
                    c6690xe037fa4f.f140258g = c6690xe037fa4f.b("TaskID", r26.i0.t(mo135869x30961476, ",", ";", z19), true);
                    java.lang.String mo135871x63651726 = n0Var.mo135871x63651726();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135871x63651726, "getTaskName(...)");
                    c6690xe037fa4f.f140259h = c6690xe037fa4f.b("TaskName", r26.i0.t(mo135871x63651726, ",", ";", z19), true);
                    c6690xe037fa4f.f140260i = n0Var.mo135850x19fe5b43();
                    c6690xe037fa4f.f140261j = (int) n0Var.mo135873x195b8688();
                    java.lang.String mo135854x5cc82849 = n0Var.mo135854x5cc82849();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135854x5cc82849, "getEndReason(...)");
                    c6690xe037fa4f.f140262k = c6690xe037fa4f.b("EndReason", r26.i0.t(mo135854x5cc82849, ",", ";", z19), true);
                    java.lang.String mo135848x133d5c5a = n0Var.mo135848x133d5c5a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135848x133d5c5a, "getAssetOriginType(...)");
                    c6690xe037fa4f.f140263l = c6690xe037fa4f.b("AssetOriginType", r26.i0.t(mo135848x133d5c5a, ",", ";", z19), true);
                    org.json.JSONObject jSONObject19 = new org.json.JSONObject();
                    com.p176xb6135e39.p283xc50a8b8b.j9 mo135467x9ac0762811 = n0Var.mo135851x9aa62e0c().mo135467x9ac07628();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135467x9ac0762811, "getKeysList(...)");
                    com.p176xb6135e39.p283xc50a8b8b.j9 mo135471x691318d611 = n0Var.mo135851x9aa62e0c().mo135471x691318d6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135471x691318d611, "getValuesList(...)");
                    java.util.Iterator it14 = ((java.util.ArrayList) kz5.n0.a1(mo135467x9ac0762811, mo135471x691318d611)).iterator();
                    while (it14.hasNext()) {
                        jz5.l lVar10 = (jz5.l) it14.next();
                        jSONObject19.put((java.lang.String) lVar10.f384366d, lVar10.f384367e);
                    }
                    java.lang.String jSONObject20 = jSONObject19.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject20, "toString(...)");
                    c6690xe037fa4f.f140264m = c6690xe037fa4f.b(str8, r26.i0.t(jSONObject20, ",", ";", false), true);
                    org.json.JSONObject jSONObject21 = new org.json.JSONObject();
                    com.p176xb6135e39.p283xc50a8b8b.j9 mo135467x9ac0762812 = n0Var.mo135859x8b9fda39().mo135467x9ac07628();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135467x9ac0762812, "getKeysList(...)");
                    com.p176xb6135e39.p283xc50a8b8b.j9 mo135471x691318d612 = n0Var.mo135859x8b9fda39().mo135471x691318d6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo135471x691318d612, "getValuesList(...)");
                    java.util.Iterator it15 = ((java.util.ArrayList) kz5.n0.a1(mo135467x9ac0762812, mo135471x691318d612)).iterator();
                    while (it15.hasNext()) {
                        jz5.l lVar11 = (jz5.l) it15.next();
                        jSONObject21.put((java.lang.String) lVar11.f384366d, lVar11.f384367e);
                    }
                    java.lang.String jSONObject22 = jSONObject21.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject22, "toString(...)");
                    c6690xe037fa4f.f140265n = c6690xe037fa4f.b("ExtDetails0", r26.i0.t(jSONObject22, ",", ";", false), true);
                    c6690xe037fa4f.f140266o = n0Var.mo135856xbcc8608a();
                    c6690xe037fa4f.f140267p = c6690xe037fa4f.b(str9, n0Var.mo135865x2a881cd1(), true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PublisherSessionMetricsReport", "29913 MJPublisherMCTaskStruct values:\npublisherSessionID = " + c6690xe037fa4f.f140255d + str7 + c6690xe037fa4f.f140256e + "\nmaasSDKVersion = " + c6690xe037fa4f.f140257f + "\ntaskID = " + c6690xe037fa4f.f140258g + "\ntaskName = " + c6690xe037fa4f.f140259h + "\nbeginTime = " + c6690xe037fa4f.f140260i + "\ndurationMillis = " + c6690xe037fa4f.f140261j + "\nendReason = " + c6690xe037fa4f.f140262k + "\nassetOriginType = " + c6690xe037fa4f.f140263l + "\ndetails = " + c6690xe037fa4f.f140264m + "\nextDetails0 = " + c6690xe037fa4f.f140265n + "\nenterScene = " + c6690xe037fa4f.f140266o + "\npostId = " + c6690xe037fa4f.f140267p);
                    c6690xe037fa4f.k();
                }
            }
        }
    }
}

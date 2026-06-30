package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e;

/* loaded from: classes10.dex */
public final class m {
    public m(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c multiTaskInfo, r45.fr4 fr4Var, boolean z17, android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskInfo, "multiTaskInfo");
        android.os.Bundle bundle = new android.os.Bundle();
        if (fr4Var != null) {
            r45.w60 w60Var = new r45.w60();
            w60Var.set(3, bm5.f1.a());
            w60Var.set(0, fr4Var);
            w60Var.set(2, java.lang.Boolean.valueOf(!z17));
            if (activity != null) {
                r45.kr4 kr4Var = (r45.kr4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).wi(activity, 5);
                w60Var.set(1, kr4Var != null ? kr4Var.m75945x2fec8307(0) : null);
            }
            bundle.putByteArray("key_multi_task_common_info", w60Var.mo14344x5f01b1f6());
            r5 = jz5.f0.f384359a;
        }
        if (r5 == null) {
            r45.w60 w60Var2 = new r45.w60();
            w60Var2.set(3, bm5.f1.a());
            w60Var2.set(2, java.lang.Boolean.valueOf(!z17));
            bundle.putByteArray("key_multi_task_common_info", w60Var2.mo14344x5f01b1f6());
        }
        bundle.putBoolean("megavideo_openFormMultiTask", z17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            b(multiTaskInfo, bundle, z17, activity);
        } else {
            bundle.putParcelable("multiTaskInfo", multiTaskInfo);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.j.class);
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, android.os.Bundle bundle, boolean z17, android.app.Activity activity) {
        int i17;
        bw5.up upVar = new bw5.up();
        try {
            upVar.mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MegaVideoMultiTaskHelper", "FinderLongVideoStarContext parse fail", th6);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int i18 = qg3.g1.f444353d;
        java.lang.String m169879x21b8cb32 = p3380x6a61f93.p3383xf5152754.C30552x21b30f7a.m169879x21b8cb32();
        bw5.id0 id0Var = new bw5.id0();
        id0Var.f(m169879x21b8cb32);
        id0Var.f110079n = upVar.f115547d;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        android.util.ArrayMap arrayMap = id0Var.f110091z;
        arrayMap.put(100, bool);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = "";
        android.content.Intent intent = new android.content.Intent();
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).mj(4, intent);
        id0Var.d(0);
        if (z17) {
            h0Var.f391656d = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(18, 2, 0, intent);
            intent.putExtra("key_extra_info", "{\"feedid\":" + c16601x7ed0e40c.f66791xc8a07680 + '}');
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
            java.lang.String field_id = c16601x7ed0e40c.f66791xc8a07680;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
            int Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).Di(field_id, c16601x7ed0e40c.f66793x2262335f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(1, (java.lang.String) h0Var.f391656d);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedid", c16601x7ed0e40c.f66791xc8a07680);
            jSONObject.put("feed_index", Di + 1);
            jSONObject.put("import_time", c16601x7ed0e40c.f66789xac3be4e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, qt2Var, "float_feed", 1, jSONObject, false, null, 48, null);
            i17 = 0;
        } else {
            i17 = 0;
            h0Var.f391656d = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(17, 2, 0, intent);
        }
        hc2.e0.a(intent, i17, null, 3, null);
        bundle.putAll(intent.getExtras());
        long Z = pm0.v.Z(upVar.m13139x6e095e9(31) ? upVar.f115549f : "");
        int e17 = (int) (cu2.x.f303982a.e("", "", Z) * 1000);
        if (e17 <= 0) {
            e17 = upVar.f115548e;
        }
        id0Var.g(e17);
        android.content.Context context = activity != null ? activity : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(Z);
        if (((h17 == null || !h17.m59347x965c8f17()) ? i17 : 1) != 0) {
            bw5.zc0 zc0Var = new bw5.zc0();
            zc0Var.d(new bw5.yr().mo11468x92b714fd(h17.getFeedObject().mo14344x5f01b1f6()));
            id0Var.e(zc0Var);
        } else {
            bw5.ad0 ad0Var = new bw5.ad0();
            java.lang.String str = upVar.m13139x6e095e9(33) ? upVar.f115551h : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getFeedSessionBuffer(...)");
            int i19 = str.length() > 0 ? 1 : i17;
            boolean[] zArr = ad0Var.f106675h;
            if (i19 != 0) {
                ad0Var.f106673f = upVar.m13139x6e095e9(33) ? upVar.f115551h : "";
                zArr[3] = true;
            }
            ad0Var.f106671d = upVar.m13139x6e095e9(31) ? upVar.f115549f : "";
            zArr[1] = true;
            ad0Var.f106672e = upVar.m13139x6e095e9(32) ? upVar.f115550g : "";
            zArr[2] = true;
            id0Var.f110081p = ad0Var;
            arrayMap.put(102, bool);
        }
        java.lang.String str2 = upVar.m13139x6e095e9(54) ? upVar.f115555o : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getChannelIdStr(...)");
        if (str2.length() > 0) {
            i17 = 1;
        }
        if (i17 != 0) {
            bw5.wc0 wc0Var = new bw5.wc0();
            wc0Var.f116183n = upVar.m13139x6e095e9(54) ? upVar.f115555o : "";
            boolean[] zArr2 = wc0Var.f116188s;
            zArr2[8] = true;
            wc0Var.f116181i = upVar.f115554n;
            zArr2[6] = true;
            wc0Var.f116179g = upVar.f115553m;
            zArr2[4] = true;
            wc0Var.f116176d = upVar.m13139x6e095e9(51) ? upVar.f115552i : "";
            zArr2[1] = true;
            wc0Var.f116178f = upVar.m13139x6e095e9(55) ? upVar.f115556p : "";
            zArr2[3] = true;
            if (id0Var.b() != null && id0Var.b().f117471g[1]) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(id0Var.b());
                wc0Var.f116177e = linkedList;
                zArr2[2] = true;
            }
            id0Var.f110083r = wc0Var;
            arrayMap.put(202, bool);
        } else {
            id0Var.f110076h = 40;
            arrayMap.put(50, bool);
        }
        byte[] mo14344x5f01b1f6 = id0Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        linkedHashMap.put("open_params", mo14344x5f01b1f6);
        d75.b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.k(context, linkedHashMap, bundle, h0Var));
    }
}

package cq2;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final cq2.r f302977a = new cq2.r();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.os.Bundle, android.os.BaseBundle] */
    public static android.os.Bundle f(cq2.r rVar, int i17, so2.j5 feed, android.view.View view, int i18, jq2.a aVar, int i19, boolean z17, boolean z18, int i27, java.lang.Object obj) {
        r45.an1 an1Var;
        android.content.Intent intent;
        java.lang.String stringExtra;
        r45.ea2 ea2Var;
        r45.an1 an1Var2;
        jz5.f0 f0Var;
        if ((i27 & 16) != 0) {
            aVar = null;
        }
        if ((i27 & 32) != 0) {
            i19 = 0;
        }
        ?? r112 = z17;
        if ((i27 & 64) != 0) {
            r112 = 1;
        }
        if ((i27 & 128) != 0) {
            z18 = true;
        }
        rVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        ?? bundle = new android.os.Bundle();
        if (z18) {
            if (aVar != null) {
                bundle.putString("main_page_position", aVar.f382629b == 88890 ? "4" : "999");
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                bundle.putString("main_page_position", "4");
            }
        }
        bundle.putInt("card_index", i17);
        boolean z19 = feed instanceof wp2.b;
        if (z19) {
            wp2.b bVar = z19 ? (wp2.b) feed : null;
            if (bVar != null && (ea2Var = bVar.f529916o) != null && (an1Var2 = (r45.an1) ea2Var.m75936x14adae67(11)) != null) {
                java.lang.String m75945x2fec8307 = an1Var2.m75945x2fec8307(6);
                bundle.putString("card_tag", m75945x2fec8307 != null ? m75945x2fec8307 : "null");
            }
        } else {
            so2.h1 h1Var = feed instanceof so2.h1 ? (so2.h1) feed : null;
            if (h1Var != null && (an1Var = h1Var.f491910d) != null) {
                java.lang.String m75945x2fec83072 = an1Var.m75945x2fec8307(6);
                bundle.putString("card_tag", m75945x2fec83072 != null ? m75945x2fec83072 : "null");
            }
        }
        bundle.putInt("card_size", i18);
        bundle.putInt("tiling_switch", r112);
        if (aVar != null) {
            bundle.putInt("tab_id", aVar.f382629b);
            bundle.putInt("sub_tab_id", i19);
        }
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rq2.w wVar = (rq2.w) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rq2.w.class);
        if (wVar != null && wVar.f480443o != 0) {
            java.lang.String str = wVar.f480444p;
            if (!(str == null || str.length() == 0)) {
                bundle.putLong("pull_liveid", wVar.f480443o);
                bundle.putString("pull_commentsence", wVar.f480444p);
            }
        }
        android.content.Context context2 = view.getContext();
        android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity != null && (intent = activity.getIntent()) != null && (stringExtra = intent.getStringExtra("NEARBY_LIVE_REPORT_REF_JSON_KEY")) != null) {
            java.lang.String str2 = stringExtra.length() > 0 ? stringExtra : null;
            if (str2 != null) {
                bundle.putString("ref_json", str2);
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r7, int r8, so2.j5 r9, org.json.JSONObject r10, int r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cq2.r.a(android.content.Context, int, so2.j5, org.json.JSONObject, int, int, int, boolean):void");
    }

    public final void c(in5.c feed, er2.a params, org.json.JSONObject chnlExtra, int i17) {
        r45.an1 an1Var;
        r45.ta2 ta2Var;
        r45.ua2 ua2Var;
        java.util.LinkedList m75941xfb821914;
        r45.ea2 ea2Var;
        r45.an1 an1Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chnlExtra, "chnlExtra");
        boolean z17 = feed instanceof wp2.b;
        if (z17) {
            wp2.b bVar = z17 ? (wp2.b) feed : null;
            if (bVar != null && (ea2Var = bVar.f529916o) != null && (an1Var2 = (r45.an1) ea2Var.m75936x14adae67(11)) != null) {
                java.lang.String m75945x2fec8307 = an1Var2.m75945x2fec8307(6);
                chnlExtra.putOpt("card_tag", m75945x2fec8307 != null ? m75945x2fec8307 : "null");
            }
        } else {
            so2.h1 h1Var = feed instanceof so2.h1 ? (so2.h1) feed : null;
            if (h1Var != null && (an1Var = h1Var.f491910d) != null) {
                java.lang.String m75945x2fec83072 = an1Var.m75945x2fec8307(6);
                chnlExtra.putOpt("card_tag", m75945x2fec83072 != null ? m75945x2fec83072 : "null");
            }
        }
        if (feed instanceof vp2.i0) {
            chnlExtra.put("card_index", i17);
            r45.qa2 qa2Var = (r45.qa2) ((vp2.i0) feed).f529916o.m75936x14adae67(15);
            chnlExtra.put("card_profile_num", ((qa2Var == null || (ta2Var = (r45.ta2) qa2Var.m75936x14adae67(1)) == null || (ua2Var = (r45.ua2) ta2Var.m75936x14adae67(1)) == null || (m75941xfb821914 = ua2Var.m75941xfb821914(0)) == null) ? 0 : m75941xfb821914.size()) + 1);
        }
        chnlExtra.putOpt("topic_id", params.f337542b);
        chnlExtra.putOpt("topic_title", params.f337544d);
        chnlExtra.putOpt("tag_id", params.f337543c);
        dk2.of ofVar = ((wq2.e) ((gr2.p0) params.f337548h).f356339b).f530055a.f530067f;
        chnlExtra.putOpt("tiling_switch", java.lang.Integer.valueOf((ofVar == null || !ofVar.f315399f) ? 0 : 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final org.json.JSONObject d(android.content.Context context, int i17, so2.j5 feed, int i18, int i19, int i27, boolean z17, boolean z18) {
        r45.an1 an1Var;
        java.lang.String str;
        android.content.Intent intent;
        java.lang.String stringExtra;
        r45.ea2 ea2Var;
        r45.an1 an1Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (z18 && h(feed, i19) != 0) {
            jSONObject.putOpt("main_page_position", java.lang.Integer.valueOf(h(feed, i19)));
        }
        boolean z19 = feed instanceof wp2.b;
        if (z19) {
            wp2.b bVar = z19 ? (wp2.b) feed : null;
            if (bVar != null && (ea2Var = bVar.f529916o) != null && (an1Var2 = (r45.an1) ea2Var.m75936x14adae67(11)) != null) {
                java.lang.Object m75945x2fec8307 = an1Var2.m75945x2fec8307(6);
                jSONObject.putOpt("card_tag", m75945x2fec8307 != null ? m75945x2fec8307 : "null");
            }
        } else {
            so2.h1 h1Var = feed instanceof so2.h1 ? (so2.h1) feed : null;
            if (h1Var != null && (an1Var = h1Var.f491910d) != null) {
                java.lang.Object m75945x2fec83072 = an1Var.m75945x2fec8307(6);
                jSONObject.putOpt("card_tag", m75945x2fec83072 != null ? m75945x2fec83072 : "null");
            }
        }
        jSONObject.putOpt("card_index", java.lang.Integer.valueOf(i17));
        jSONObject.putOpt("card_size", java.lang.Integer.valueOf(i18));
        jSONObject.putOpt("tiling_switch", java.lang.Integer.valueOf(z17 ? 1 : 0));
        jSONObject.putOpt("tab_id", i19 == 0 ? "" : java.lang.String.valueOf(i19));
        jSONObject.putOpt("sub_tab_id", i27 != 0 ? java.lang.String.valueOf(i27) : "");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (intent = activity.getIntent()) != null && (stringExtra = intent.getStringExtra("NEARBY_LIVE_REPORT_REF_JSON_KEY")) != null) {
            if ((stringExtra.length() > 0) == false) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                jSONObject.putOpt("ref_json", stringExtra);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.ActivityC14524xdd91c7bb activityC14524xdd91c7bb = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.ActivityC14524xdd91c7bb ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.ActivityC14524xdd91c7bb) context : null;
        if (activityC14524xdd91c7bb != null && (str = activityC14524xdd91c7bb.f203081z) != null) {
            java.lang.String str2 = (str.length() == 0) ^ true ? str : null;
            if (str2 != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                ml2.q1 q1Var = ml2.q1.f409345e;
                jSONObject2.put("ref_commenscene", "temp_30");
                jSONObject2.put("liveid", str2);
                jSONObject.putOpt("ref_json", jSONObject2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquareReportUtil", "append liveEndId " + str2 + " to chnlExtra");
            }
        }
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rq2.w wVar = (rq2.w) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rq2.w.class);
        if (wVar != null && wVar.f480443o != 0) {
            java.lang.String str3 = wVar.f480444p;
            if (!(str3 == null || str3.length() == 0)) {
                jSONObject.putOpt("pull_liveid", java.lang.Long.valueOf(wVar.f480443o));
                jSONObject.putOpt("pull_commentsence", wVar.f480444p);
            }
        }
        return jSONObject;
    }

    public final org.json.JSONObject g(in5.c feed, er2.a params, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        c(feed, params, jSONObject, i17);
        return jSONObject;
    }

    public final int h(so2.j5 j5Var, int i17) {
        if (j5Var instanceof wp2.b) {
            int i18 = ((wp2.b) j5Var).f529917p.f455659e;
            if (i18 == 2) {
                return 2;
            }
            if (i18 == 3) {
                return 3;
            }
            if (i18 != 4) {
                return i18 != 13 ? i18 != 16 ? 0 : 1 : i17 == 88890 ? 4 : 999;
            }
            return 4;
        }
        if (j5Var instanceof vp2.l ? true : j5Var instanceof vp2.n) {
            return 1;
        }
        if (!(j5Var instanceof vp2.l0)) {
            return 0;
        }
        int i19 = ((vp2.l0) j5Var).f520473d.f455659e;
        if (i19 != 3) {
            return i19 != 16 ? 0 : 1;
        }
        return 3;
    }
}

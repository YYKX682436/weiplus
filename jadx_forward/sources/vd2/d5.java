package vd2;

@j95.b
/* loaded from: classes3.dex */
public final class d5 extends i95.w implements ss5.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f517238d = "FinderReplayFeatureService";

    public void Ai(r45.nw1 nw1Var, android.content.Intent intent, android.content.Context context, long j17, long j18, java.lang.String anchorUserName, java.lang.String nonceId, java.lang.String str) {
        r45.nw1 nw1Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserName, "anchorUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        so2.p2 p2Var = so2.q2.f492079p;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.Long valueOf = java.lang.Long.valueOf(j18);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        if (nw1Var == null) {
            nw1Var2 = new r45.nw1();
            nw1Var2.set(0, java.lang.Long.valueOf(valueOf != null ? valueOf.longValue() : 0L));
        } else {
            nw1Var2 = nw1Var;
        }
        c19792x256d2725.m76887xcb0dd23c(nw1Var2);
        c19792x256d2725.m76896xfefec3e9(nonceId);
        c19792x256d2725.m76877x684351d(j17);
        c19792x256d2725.m76929x66bc2758(anchorUserName);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56();
        c19793xceab7f56.m76982x9713e3a(str);
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> linkedList2 = new java.util.LinkedList<>();
        c19793xceab7f56.m77002xdb5612fc(9);
        c19793xceab7f56.m77000x535b30a2(linkedList2);
        c19792x256d2725.m76895x5bf46472(c19793xceab7f56);
        linkedList.add(new so2.q2(c19792x256d2725, 0));
        intent2.putExtra("KEY_PARAMS_KEY_VALUE", so2.p2.b(p2Var, linkedList, null, 0, 0, 14, null).mo14344x5f01b1f6());
        i95.m c17 = i95.n0.c(c61.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        android.content.Context context2 = context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
        c61.zb.U7(zbVar, context2, intent2, false, 4, null);
    }

    public boolean Bi(int i17, r45.nw1 nw1Var) {
        r45.i72 i72Var;
        r45.j72 j72Var = (nw1Var == null || (i72Var = (r45.i72) nw1Var.m75936x14adae67(44)) == null) ? null : (r45.j72) i72Var.m75936x14adae67(5);
        if (j72Var != null && j72Var.m75939xb282bd08(5) == 0) {
            r45.gv gvVar = (r45.gv) zl2.r4.f555483a.S0(i17, nw1Var, ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Rj().z0(nw1Var.m75942xfb822ef2(0))).f384367e;
            java.lang.String str = gvVar != null ? gvVar.f457070e : null;
            if (!(str == null || str.length() == 0)) {
                return true;
            }
        }
        return false;
    }

    public boolean Di(java.lang.String str, int i17, java.lang.String str2) {
        return i17 == 4 || i17 == 6 || bj(str2, ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gj(pm0.v.Z(str)));
    }

    public boolean Ni(r45.g92 shareObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObject, "shareObject");
        return Di(shareObject.m75945x2fec8307(0), shareObject.m75939xb282bd08(22), shareObject.m75945x2fec8307(1));
    }

    public boolean Ri(r45.nw1 nw1Var) {
        if (nw1Var != null && nw1Var.m75939xb282bd08(31) == 3) {
            if (cm2.a.i(cm2.a.f124861a, nw1Var, "replayAuditing", false, 2, null).length() == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean Ui(r45.nw1 nw1Var) {
        if (nw1Var != null && nw1Var.m75939xb282bd08(31) == 1) {
            if (!(cm2.a.i(cm2.a.f124861a, nw1Var, "replayReadyToPlay", false, 2, null).length() == 0)) {
                return true;
            }
        }
        return false;
    }

    public void Vi(boolean z17, long j17, java.lang.String pageType, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageType, "pageType");
        if (z17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("object_id", pm0.v.u(j17));
            jSONObject.put("page_type", pageType);
            jSONObject.put("object_type", i17);
            jSONObject.put("page_sub_type", i18);
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            ml2.o3[] o3VarArr = ml2.o3.f409306d;
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            ((ml2.j0) zbVar).Wj("watch_live_expose", jSONObject2);
            return;
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("object_id", pm0.v.u(j17));
        jSONObject3.put("page_type", pageType);
        jSONObject3.put("object_type", i17);
        jSONObject3.put("page_sub_type", i18);
        zy2.zb zbVar2 = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.o3[] o3VarArr2 = ml2.o3.f409306d;
        java.lang.String jSONObject4 = jSONObject3.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
        ((ml2.j0) zbVar2).Wj("watch_live_record", jSONObject4);
    }

    public boolean Zi(java.lang.String str, android.view.View view, android.view.View view2, long j17) {
        r45.nw1 Gj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Gj(j17);
        if (Gj != null) {
            return aj(str, Gj);
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        qs5.d dVar = qs5.d.f447959e;
        s40.w0.u9(w0Var, j17, false, null, null, 4, null, null, null, 224, null);
        boolean z17 = view2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1;
        java.lang.String str2 = this.f517238d;
        if (z17 && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) view2).getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "routerToReplayUI liveEndTag visible!");
        } else {
            if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) view;
                if (c15315xe70278e1.getVisibility() == 0) {
                    java.lang.String f212749x = c15315xe70278e1.getF212749x();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "routerToReplayUI liveTag visible,text:" + f212749x + '!');
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(f212749x, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_1)) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(f212749x, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_0))) {
                        return true;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "routerToReplayUI all tag invisible!");
        }
        return false;
    }

    public boolean aj(java.lang.String str, r45.nw1 nw1Var) {
        if (nw1Var == null) {
            return false;
        }
        boolean bj6 = bj(str, nw1Var);
        boolean z17 = nw1Var.m75939xb282bd08(2) == 2;
        boolean Bi = Bi(4, nw1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517238d, "routerToReplayUI liveId:" + nw1Var.m75942xfb822ef2(0) + " is replay:" + bj6 + ",liveEnd:" + z17 + ", isReplayTransition:" + Bi);
        return bj6 || (z17 && Bi);
    }

    public boolean bj(java.lang.String str, r45.nw1 nw1Var) {
        if (Ui(nw1Var)) {
            return true;
        }
        if (nw1Var != null && nw1Var.m75939xb282bd08(31) == 4) {
            return true;
        }
        if (nw1Var != null && nw1Var.m75939xb282bd08(31) == 2) {
            return true;
        }
        if (nw1Var != null && nw1Var.m75939xb282bd08(31) == 6) {
            return true;
        }
        if (nw1Var != null && nw1Var.m75939xb282bd08(31) == 5) {
            if (!(str == null || str.length() == 0)) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, xy2.c.e(context))) {
                    if (!(cm2.a.i(cm2.a.f124861a, nw1Var, "showReplay", false, 2, null).length() == 0)) {
                        return true;
                    }
                }
            }
        }
        return (nw1Var != null && nw1Var.m75939xb282bd08(31) == 1) && pm0.v.z(nw1Var.m75939xb282bd08(37), 524288);
    }

    public void wi(android.content.Intent intent, android.content.Context context, long j17, long j18, java.lang.String anchorUserName, java.lang.String nonceId, java.lang.String str, java.lang.String contextId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserName, "anchorUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f517238d, "enterFinderLiveReplayUI objectId:" + j17 + ",liveId:" + j18 + ",anchorUserName:" + anchorUserName + ",nonceId:" + nonceId + ",desc:" + str + ",contextId:" + contextId + ",forceCheckTeenMode:" + z17);
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() && !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi() && z17) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
            return;
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        vd2.c5 c5Var = new vd2.c5(this, anchorUserName, contextId, intent, context, j17, nonceId, str);
        qs5.d dVar = qs5.d.f447959e;
        s40.w0.u9(w0Var, j18, true, null, c5Var, 4, null, null, null, 228, null);
    }
}

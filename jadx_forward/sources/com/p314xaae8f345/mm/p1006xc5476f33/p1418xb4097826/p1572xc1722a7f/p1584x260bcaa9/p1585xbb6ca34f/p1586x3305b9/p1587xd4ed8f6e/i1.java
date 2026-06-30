package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class i1 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.o f203255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1 f203256e;

    public i1(vp2.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1 p1Var) {
        this.f203255d = oVar;
        this.f203256e = p1Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.String str;
        sp2.k kVar;
        java.lang.String str2;
        java.lang.String str3;
        pf5.z zVar;
        java.lang.Class cls;
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1 p1Var;
        java.lang.String str5;
        so2.j5 j5Var;
        int i18;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        boolean z17;
        java.lang.Object obj;
        boolean z18;
        java.lang.String str11;
        java.lang.String num;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        java.lang.String m75945x2fec8307;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i19 = i17 - a07;
        vp2.o oVar = this.f203255d;
        java.lang.Object obj2 = oVar.f520481e.get(i19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        so2.j5 j5Var2 = (so2.j5) obj2;
        boolean z19 = j5Var2 instanceof vp2.l;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1 p1Var2 = this.f203256e;
        if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1.n(p1Var2, holder, (vp2.l) j5Var2);
            return;
        }
        if (j5Var2 instanceof vp2.m) {
            vp2.m mVar = (vp2.m) j5Var2;
            p1Var2.getClass();
            cl0.g gVar = new cl0.g();
            gVar.s("finder_username", mVar.getFeedObject().m59299x6bf53a6c());
            r45.nw1 m59258xd05571302 = mVar.getFeedObject().m59258xd0557130();
            gVar.s("liveid", m59258xd05571302 != null ? pm0.v.u(m59258xd05571302.m75942xfb822ef2(0)) : "");
            gVar.s("style", 1);
            gVar.s("ref_objectid", pm0.v.u(mVar.getFeedObject().m59251x5db1b11()));
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            p1Var2.r("live_end_page_play_back_button", gVar2, false);
            boolean z27 = mVar.getFeedObject().getMediaType() == 9;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HeadLivingListConvert", "onLiveReplayClick: pos=" + holder.m8183xf806b362() + ", isReplay=" + z27 + ", nickname=" + mVar.getFeedObject().m59273x80025a04());
            if (!z27) {
                android.content.Intent intent = new android.content.Intent();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("enter_page_type", "live_replay_avatar");
                jSONObject.put("is_lrfeed", "1");
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                intent.putExtra("key_extra_info", r26.i0.t(jSONObject2, ",", ";", false));
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                s40.w0.ba((s40.w0) c17, p1Var2.f203403e, mVar.getFeedObject().getFeedObject(), false, intent, 4, null);
                return;
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("object_id", pm0.v.u(mVar.getFeedObject().m59251x5db1b11()));
            jSONObject3.put("page_type", "live_square");
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).gk(mVar.getFeedObject().m59258xd0557130())) {
                jSONObject3.put("object_type", 1);
            } else {
                jSONObject3.put("object_type", 2);
            }
            jSONObject3.put("style", 1);
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            ml2.o3[] o3VarArr = ml2.o3.f409306d;
            java.lang.String jSONObject4 = jSONObject3.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            ((ml2.j0) zbVar).Wj("watch_live_record", jSONObject4);
            if (!((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(mVar.getFeedObject().m59299x6bf53a6c(), mVar.getFeedObject().m59258xd0557130())) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLiveReplayClick: enter old replay error, replayStatus=");
                r45.nw1 m59258xd05571303 = mVar.getFeedObject().m59258xd0557130();
                sb6.append(m59258xd05571303 != null ? m59258xd05571303.m75939xb282bd08(31) : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.HeadLivingListConvert", sb6.toString());
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            so2.p2 p2Var = so2.q2.f492079p;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(new so2.q2(mVar.getFeedObject().getFeedObject(), 0, 2, null));
            intent2.putExtra("KEY_PARAMS_KEY_VALUE", so2.p2.b(p2Var, linkedList, null, 0, 0, 14, null).mo14344x5f01b1f6());
            intent2.putExtra("KEY_PAGE_TYPE", "live_square");
            i95.m c18 = i95.n0.c(c61.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            c61.zb.U7((c61.zb) c18, p1Var2.f203403e, intent2, false, 4, null);
            return;
        }
        r45.qt2 qt2Var = p1Var2.f203409n;
        java.lang.String str12 = (qt2Var == null || (m75945x2fec8307 = qt2Var.m75945x2fec8307(2)) == null) ? "" : m75945x2fec8307;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("main_page_position", "1");
        bundle.putInt("card_index", i19);
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rq2.w wVar = (rq2.w) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(rq2.w.class);
        if (wVar != null && wVar.f480443o != 0) {
            java.lang.String str13 = wVar.f480444p;
            if (!(str13 == null || str13.length() == 0)) {
                bundle.putLong("pull_liveid", wVar.f480443o);
                bundle.putString("pull_commentsence", wVar.f480444p);
            }
        }
        sp2.k kVar2 = p1Var2.f203405g;
        kVar2.c(bundle, j5Var2);
        tp2.f fVar = p1Var2.f203408m;
        if (fVar != null) {
            str9 = "main_page_position";
            kVar = kVar2;
            str2 = ",";
            str3 = ";";
            zVar = zVar2;
            cls = rq2.w.class;
            str4 = "card_index";
            p1Var = p1Var2;
            str = "get(...)";
            str5 = "pull_liveid";
            j5Var = j5Var2;
            str8 = "liveid";
            i18 = i19;
            str6 = "pull_commentsence";
            str7 = "toString(...)";
            tp2.f.d(fVar, j5Var2, i17, i19, view, oVar.f520481e, str12, 0, bundle, oVar, null, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mc.f34455x366c91de, null);
        } else {
            str = "get(...)";
            kVar = kVar2;
            str2 = ",";
            str3 = ";";
            zVar = zVar2;
            cls = rq2.w.class;
            str4 = "card_index";
            p1Var = p1Var2;
            str5 = "pull_liveid";
            j5Var = j5Var2;
            i18 = i19;
            str6 = "pull_commentsence";
            str7 = "toString(...)";
            str8 = "liveid";
            str9 = "main_page_position";
        }
        android.content.Context context2 = view.getContext();
        android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity != null) {
            boolean z28 = activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
            if (!z28) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity;
            pf5.z zVar3 = zVar;
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar3.a(activityC0065xcd7aa112).a(cls);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, str);
            rq2.w wVar2 = (rq2.w) a17;
            cl0.g gVar3 = new cl0.g();
            gVar3.s("page_index", java.lang.Integer.valueOf(wVar2.f480435d));
            gVar3.s(str4, java.lang.String.valueOf(i18));
            so2.j5 j5Var3 = j5Var;
            boolean z29 = j5Var3 instanceof vp2.n;
            vp2.n nVar = z29 ? (vp2.n) j5Var3 : null;
            if (nVar == null || (feedObject2 = nVar.getFeedObject()) == null || (feedObject3 = feedObject2.getFeedObject()) == null || (m76760x76845fea = feedObject3.m76760x76845fea()) == null || (str10 = m76760x76845fea.m76197x6c03c64c()) == null) {
                str10 = "";
            }
            gVar3.s(dm.i4.f66875xa013b0d5, str10);
            vp2.n nVar2 = z29 ? (vp2.n) j5Var3 : null;
            if (nVar2 == null || (feedObject = nVar2.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null) {
                z17 = false;
                obj = "";
            } else {
                z17 = false;
                obj = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0));
            }
            gVar3.s(str8, obj);
            r45.qt2 qt2Var2 = p1Var.f203409n;
            if (qt2Var2 != null) {
                z18 = true;
                str11 = qt2Var2.m75945x2fec8307(1);
            } else {
                z18 = true;
                str11 = null;
            }
            java.lang.String gVar4 = gVar3.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, str7);
            wVar2.Q6(str11, "main_page_focus_card", r26.i0.t(gVar4, str2, str3, z17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var3 : null;
            if (abstractC14490x69736cb5 != null) {
                cl0.g gVar5 = new cl0.g();
                gVar5.s(str9, java.lang.Integer.valueOf(z18 ? 1 : 0));
                int i27 = i18;
                kVar.l(abstractC14490x69736cb5, i27, gVar5);
                if (wVar2.f480443o != 0) {
                    java.lang.String str14 = wVar2.f480444p;
                    if (str14 != null && str14.length() != 0) {
                        z18 = z17;
                    }
                    if (!z18) {
                        gVar5.s(str5, java.lang.Long.valueOf(wVar2.f480443o));
                        gVar5.s(str6, wVar2.f480444p);
                    }
                }
                ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                long j17 = i27;
                ml2.x1 x1Var = ml2.x1.f409740n;
                if (!z28) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar3.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                java.lang.String str15 = (nyVar == null || (num = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) ? "" : num;
                java.lang.String gVar6 = gVar5.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar6, str7);
                j0Var.sj(abstractC14490x69736cb5, j17, x1Var, str15, "", "", gVar6);
            }
        }
    }
}

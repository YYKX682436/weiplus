package cr2;

/* loaded from: classes2.dex */
public final class j implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr2.x f303394d;

    public j(cr2.x xVar) {
        this.f303394d = xVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        r45.an1 an1Var;
        java.lang.Object obj;
        int i18;
        android.os.Bundle bundle;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        java.lang.String str;
        r45.ea2 ea2Var;
        r45.an1 an1Var2;
        int i19;
        int i27;
        r45.ta2 ta2Var;
        r45.ua2 ua2Var;
        java.lang.String num;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i28 = i17 - a07;
        cr2.x xVar = this.f303394d;
        java.lang.Object obj2 = xVar.f303444q.get(i28);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        so2.j5 j5Var = (so2.j5) obj2;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = xVar.f303428a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activity).a(rq2.w.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        boolean z18 = j5Var instanceof wp2.b;
        er2.a aVar = xVar.f303431d;
        if (z18) {
            org.json.JSONObject g17 = cq2.r.f302977a.g(j5Var, aVar, i28);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962) view.findViewWithTag("nearby-live-preview-view-tag");
            if (c14522x8ffd8962 != null) {
                g17.put("playstatus", c14522x8ffd8962.getPlayStatus());
                java.lang.String mo58381xe699b631 = c14522x8ffd8962.mo58381xe699b631();
                if (mo58381xe699b631 == null) {
                    mo58381xe699b631 = "";
                }
                g17.put("streamid", mo58381xe699b631);
            }
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            wp2.b bVar = z18 ? (wp2.b) j5Var : null;
            long j17 = i28;
            ml2.x1 x1Var = ml2.x1.f409740n;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656 fragment = xVar.f303430c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            java.lang.String str2 = (nyVar == null || (num = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) ? "" : num;
            java.lang.String jSONObject = g17.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            j0Var.sj(bVar, j17, x1Var, str2, "", "", jSONObject);
        }
        r45.qt2 qt2Var = xVar.f303443p;
        if (qt2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        java.lang.String m75945x2fec8307 = qt2Var.m75945x2fec8307(2);
        java.lang.String str3 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        java.util.ArrayList data = xVar.f303444q;
        int i29 = aVar.f337549i == 1 ? 6 : 5;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("topic_id", aVar.f337542b);
        bundle2.putString("topic_title", aVar.f337544d);
        bundle2.putString("tag_id", aVar.f337543c);
        if (j5Var instanceof vp2.i0) {
            bundle2.putInt("page_position", 1);
            bundle2.putInt("card_index", i28);
            r45.qa2 qa2Var = (r45.qa2) ((vp2.i0) j5Var).f529916o.m75936x14adae67(15);
            if (qa2Var == null || (ta2Var = (r45.ta2) qa2Var.m75936x14adae67(1)) == null || (ua2Var = (r45.ua2) ta2Var.m75936x14adae67(1)) == null) {
                i19 = 0;
            } else {
                i19 = 0;
                java.util.LinkedList m75941xfb821914 = ua2Var.m75941xfb821914(0);
                if (m75941xfb821914 != null) {
                    i27 = m75941xfb821914.size();
                    bundle2.putInt("card_profile_num", i27 + 1);
                }
            }
            i27 = i19;
            bundle2.putInt("card_profile_num", i27 + 1);
        }
        if (z18) {
            wp2.b bVar2 = z18 ? (wp2.b) j5Var : null;
            if (bVar2 != null && (ea2Var = bVar2.f529916o) != null && (an1Var2 = (r45.an1) ea2Var.m75936x14adae67(11)) != null) {
                java.lang.String m75945x2fec83072 = an1Var2.m75945x2fec8307(6);
                bundle2.putString("card_tag", m75945x2fec83072 == null ? "null" : m75945x2fec83072);
            }
        } else {
            so2.h1 h1Var = j5Var instanceof so2.h1 ? (so2.h1) j5Var : null;
            if (h1Var != null && (an1Var = h1Var.f491910d) != null) {
                java.lang.String m75945x2fec83073 = an1Var.m75945x2fec8307(6);
                bundle2.putString("card_tag", m75945x2fec83073 == null ? "null" : m75945x2fec83073);
            }
        }
        dk2.of ofVar = ((wq2.e) ((gr2.p0) aVar.f337548h).f356339b).f530055a.f530067f;
        bundle2.putInt("tiling_switch", (ofVar == null || !ofVar.f315399f) ? 0 : 1);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        gr2.o oVar = xVar.f303449v;
        oVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        java.lang.String str4 = (nyVar2 == null || (str = nyVar2.f216915p) == null) ? "" : str;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            obj = "Check failed.";
            i18 = i29;
            bundle = bundle2;
            z17 = false;
        } else {
            obj = "Check failed.";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isFastClick] true, currentClickTime:");
            sb6.append(currentTimeMillis);
            sb6.append(", lastClickTime:");
            i18 = i29;
            bundle = bundle2;
            sb6.append(qd2.h.f443300a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", sb6.toString());
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewEntranceViewItemClick", "onItemClick pos:" + i17 + " feed:" + j5Var + " return for fastClick");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewEntranceViewItemClick", "onItemClick pos:" + i17 + " feed:" + j5Var);
        android.content.Context context2 = oVar.f356331a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException(obj.toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        boolean z19 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
        if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
            if (zl2.q4.f555466a.C(abstractC14490x69736cb5)) {
                yo2.e.f545670a.a(new gr2.n(abstractC14490x69736cb5.getFeedObject()));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = z19 ? abstractC14490x69736cb5 : null;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2 = (abstractC14490x69736cb52 == null || (feedObject = abstractC14490x69736cb52.getFeedObject()) == null) ? null : feedObject.getFeedObject();
                if (feedObject2 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "handleClick rewrite commentScene:" + V6.m75939xb282bd08(5) + ", sessionBuffer:" + feedObject2.m76829x97edf6c0());
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(feedObject2, V6.m75939xb282bd08(5), null);
                }
                c61.y7 y7Var = c61.y7.f120962b;
                android.content.Context context3 = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                y7Var.c(view, (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3, abstractC14490x69736cb5, ez2.a.f339392h, new gr2.l(oVar, i28, j5Var, data, view, str4, str3, i18, bundle, null, elapsedRealtime));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSquareTabLifeCycleReport", "enterLiveRoom");
                ip2.a.f375148d = "page_live_flow";
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a.b(V6, j5Var, 18);
                return;
            }
        }
        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) {
            oVar.f356334d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) j5Var).f192729h;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318 c6463x6ead4318 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318();
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c6463x6ead4318.f138055d = java.lang.System.currentTimeMillis();
            c6463x6ead4318.u("");
            c6463x6ead4318.p(oVar.b(i28, view, "onItemClick"));
            c6463x6ead4318.B("");
            c6463x6ead4318.y("");
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            c6463x6ead4318.w(Ri);
            c6463x6ead4318.r(V6.m75945x2fec8307(1));
            c6463x6ead4318.q(java.lang.String.valueOf(V6.m75939xb282bd08(5)));
            c6463x6ead4318.A(str3);
            c6463x6ead4318.x("");
            c6463x6ead4318.v("");
            c6463x6ead4318.s("all_my_follow");
            c6463x6ead4318.t("");
            c6463x6ead4318.z(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
            c6463x6ead4318.k();
        }
    }
}

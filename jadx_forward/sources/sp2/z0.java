package sp2;

/* loaded from: classes2.dex */
public final class z0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492828d;

    public z0(sp2.o2 o2Var) {
        this.f492828d = o2Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.String str;
        org.json.JSONObject d17;
        java.lang.String num;
        r45.s92 s92Var;
        r45.s92 s92Var2;
        r45.oa2 oa2Var;
        r45.h32 h32Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        r45.s92 s92Var3;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i18 = i17 - a07;
        sp2.o2 o2Var = this.f492828d;
        java.lang.Object obj = o2Var.f492678m.get(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        r45.qt2 qt2Var = o2Var.f492660d;
        java.lang.String m75945x2fec8307 = qt2Var.m75945x2fec8307(2);
        java.lang.String str2 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = o2Var.f492654a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activity).a(rq2.w.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        rq2.w wVar = (rq2.w) a17;
        boolean z17 = j5Var instanceof wp2.b;
        cq2.r rVar = cq2.r.f302977a;
        if (z17 || (j5Var instanceof vp2.e0)) {
            cl0.g gVar = new cl0.g();
            boolean z18 = j5Var instanceof vp2.e0;
            int i19 = z18 ? 2 : 1;
            int i27 = wVar.f480437f;
            if (i27 < 0) {
                i27 = 0;
            }
            gVar.s("page_index", java.lang.Integer.valueOf(i27));
            gVar.s("card_type", java.lang.Integer.valueOf(i19));
            int i28 = wVar.f480437f;
            if (i28 < 0) {
                i28 = 0;
            }
            gVar.s("card_index", java.lang.String.valueOf(i18 - i28));
            wp2.b bVar = z17 ? (wp2.b) j5Var : null;
            gVar.s("liveid", (bVar == null || (feedObject = bVar.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null) ? "" : java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)));
            vp2.e0 e0Var = z18 ? (vp2.e0) j5Var : null;
            if (e0Var == null || (oa2Var = e0Var.f520450d) == null || (h32Var = (r45.h32) oa2Var.m75936x14adae67(0)) == null || (str = h32Var.m75945x2fec8307(4)) == null) {
                str = "";
            }
            gVar.s("Noticeid", str);
            r45.dk2 dk2Var = o2Var.A;
            if (dk2Var != null && (s92Var2 = (r45.s92) dk2Var.m75936x14adae67(12)) != null) {
                gVar.s("card_size", s92Var2.m75939xb282bd08(0) == 0 ? "16:9" : "4:3");
            }
            boolean z19 = j5Var instanceof vp2.u;
            if (z19) {
                gVar.s("ref_objectid", pm0.v.u(((vp2.u) j5Var).getFeedObject().m59251x5db1b11()));
            }
            java.lang.String m75945x2fec83072 = qt2Var.m75945x2fec8307(1);
            java.lang.String str3 = z19 ? "play_back_video_card" : "main_page_recmd_card";
            java.lang.String gVar2 = gVar.toString();
            wVar.Q6(m75945x2fec83072, str3, gVar2 != null ? r26.i0.t(gVar2, ",", ";", false) : null);
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            int o17 = o2Var.o(i18, j5Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
            r45.dk2 dk2Var2 = o2Var.A;
            d17 = rVar.d(context, o17, abstractC14490x69736cb5, (dk2Var2 == null || (s92Var = (r45.s92) dk2Var2.m75936x14adae67(12)) == null) ? 0 : s92Var.m75939xb282bd08(0), (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? 0 : 0, (r21 & 64) != 0 ? true : o2Var.v(), (r21 & 128) != 0);
            o2Var.i(d17, j5Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962) view.findViewWithTag("nearby-live-preview-view-tag");
            if (c14522x8ffd8962 != null) {
                d17.put("playstatus", c14522x8ffd8962.getPlayStatus());
                ko0.t tVar = ko0.t.f391436a;
                mn0.b0 player = c14522x8ffd8962.getPlayer();
                java.lang.String d18 = tVar.d(player != null ? ((mn0.y) player).f411348q : null);
                if (d18 == null) {
                    d18 = "";
                }
                d17.put("streamid", d18);
            }
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            wp2.b bVar2 = z17 ? (wp2.b) j5Var : null;
            long j17 = i18;
            ml2.x1 x1Var = ml2.x1.f409740n;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            java.lang.String str4 = (nyVar == null || (num = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) ? "" : num;
            java.lang.String jSONObject = d17.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            j0Var.sj(bVar2, j17, x1Var, str4, "", "", jSONObject);
        } else if ((j5Var instanceof vp2.c) && ((vp2.c) j5Var).f520443d.B == 2) {
            java.lang.String m75945x2fec83073 = qt2Var.m75945x2fec8307(1);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            int i29 = wVar.f480437f;
            if (i29 < 0) {
                i29 = 0;
            }
            jSONObject2.put("card_index", i18 - i29);
            java.lang.String jSONObject3 = jSONObject2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            wVar.Q6(m75945x2fec83073, "main_page_chatroom_card", r26.i0.t(jSONObject3, ",", ";", false));
        }
        r45.dk2 dk2Var3 = o2Var.A;
        android.os.Bundle f17 = cq2.r.f(rVar, i18, j5Var, view, (dk2Var3 == null || (s92Var3 = (r45.s92) dk2Var3.m75936x14adae67(12)) == null) ? 0 : s92Var3.m75939xb282bd08(0), null, 0, o2Var.v(), false, 176, null);
        sp2.o2.a(o2Var, j5Var, f17);
        tp2.f.d(o2Var.E, j5Var, i17, i18, view, o2Var.f492678m, str2, 3, f17, null, null, 0L, 1792, null);
    }
}

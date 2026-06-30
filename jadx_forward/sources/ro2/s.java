package ro2;

/* loaded from: classes2.dex */
public abstract class s {
    public static final java.lang.CharSequence a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, int i17, int i18) {
        boolean z17;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qeVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        ya2.b2 contact = item.getContact();
        java.lang.String w07 = contact != null ? contact.w0() : "";
        if (item.getFeedObject().getFeedObject().m76805x2dd7a70f() == 1) {
            i19 = i17;
            z17 = true;
        } else {
            z17 = false;
            i19 = i17;
        }
        int i27 = i19 == 1 ? z17 ? com.p314xaae8f345.mm.R.raw.f80038x1c253d07 : com.p314xaae8f345.mm.R.raw.f79472xe7e9e18e : com.p314xaae8f345.mm.R.raw.f81191xe57d3dfe;
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ohi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.olx, java.lang.Integer.valueOf(i18));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return hc2.x0.k(string + w07 + string2, context, '#', i27, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an, h17, h17, 0, 0, 2, 192, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, int i17, r45.zu0 info) {
        r45.vl2 vl2Var;
        r45.ql2 ql2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qeVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = feed.getFeedObject().getFeedObject();
        int m75939xb282bd08 = i17 == 1 ? info.m75939xb282bd08(0) : info.m75939xb282bd08(1);
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209149b6).mo141623x754a37bb()).r()).booleanValue()) {
            i95.m c18 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            lb2.j jVar = (lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209168c6).mo141623x754a37bb();
            jVar.l();
            return ((java.lang.Boolean) jVar.r()).booleanValue();
        }
        pf5.u uVar = pf5.u.f435469a;
        boolean z17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_INTERACTION_STRONG_LIKE_TOAST_INT_SYNC, 0) == 1;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "canShowStrongLikeToast: globalFeatureSwitch is false");
            return false;
        }
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_INTERACTION_STRONG_LIKE_TOAST_BREAK_POINTS_STRING_SYNC, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
        boolean z18 = v17.length() > 0;
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (z18) {
            try {
                java.util.List f07 = r26.n0.f0(v17, new java.lang.String[]{","}, false, 0, 6, null);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = f07.iterator();
                while (it.hasNext()) {
                    java.lang.Integer h17 = r26.h0.h(r26.n0.u0((java.lang.String) it.next()).toString());
                    if (h17 != null) {
                        arrayList.add(h17);
                    }
                }
                p0Var = arrayList;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderInteractionStrongLikeToastConfigVM", "Failed to parse breakPoints: ".concat(v17), e17);
            }
        }
        if (!p0Var.contains(java.lang.Integer.valueOf(m75939xb282bd08))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "canShowStrongLikeToast: isBreakPointReached is false, count: " + m75939xb282bd08);
            return false;
        }
        r45.dm2 m76806xdef68064 = feedObject.m76806xdef68064();
        boolean z19 = ((m76806xdef68064 == null || (vl2Var = (r45.vl2) m76806xdef68064.m75936x14adae67(27)) == null || (ql2Var = (r45.ql2) vl2Var.m75936x14adae67(0)) == null) ? null : ql2Var.m75945x2fec8307(0)) != null;
        if (!((i17 == 1 && z19) ? false : true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "canShowStrongLikeToast: isLikeTypeValid is false, interactionType: " + i17 + ", isDynamicLike: " + z19);
            return false;
        }
        if (!(!hc2.o0.H(feedObject))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "canShowStrongLikeToast: isNotSelfFeed is false, isSelf: " + hc2.o0.H(feedObject));
            return false;
        }
        i95.m c19 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        lb2.j jVar2 = (lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209168c6).mo141623x754a37bb();
        jVar2.l();
        if (!((java.lang.Boolean) jVar2.r()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "canShowStrongLikeToast: isConfigEnabled is false");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "canShowStrongLikeToast, count: " + m75939xb282bd08 + ", globalFeatureSwitch: " + z17 + ", isDynamicLike: " + z19 + ", isSelf: " + hc2.o0.H(feedObject));
        return true;
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 holder, ro2.u likeType, java.lang.Integer num) {
        int i17;
        cw2.da videoView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qeVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(likeType, "likeType");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) holder.f374658i;
        long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
        if (c15196x85976f5f == null || (videoView = c15196x85976f5f.getVideoView()) == null) {
            i17 = 0;
        } else {
            long mo56695x7723e6ff = videoView.mo56695x7723e6ff() * 100;
            i17 = (mo56695x7723e6ff <= 0 ? 0 : java.lang.Float.valueOf(((float) videoView.mo56685x3d7f3f1d()) / ((float) mo56695x7723e6ff))).intValue();
        }
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar != null) {
            java.lang.String t17 = r26.i0.t(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(mo2128x1ed62e84, abstractC14490x69736cb5.w(), nyVar.V6().m75939xb282bd08(5)), ",", ";", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.i(d2Var, context, "acc_like_tips", "view_exp", false, kz5.c1.k(new jz5.l("feed_id", pm0.v.u(mo2128x1ed62e84)), new jz5.l("session_buffer", t17), new jz5.l("acc_like_type", java.lang.Integer.valueOf(likeType.f479640d)), new jz5.l("playpercent", java.lang.Integer.valueOf(i17)), new jz5.l("acc_like_cnt", num)), 8, null);
        }
    }
}

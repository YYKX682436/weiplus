package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public class q extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f250936q = "FinderLiveTimeLineItem";

    /* renamed from: r, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f250937r = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: s, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f250938s;

    public static final /* synthetic */ java.lang.String F(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        java.lang.String str = qVar.f250936q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return str;
    }

    public static final boolean J(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n nVar, android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLiveTag$checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        if (imageView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveTag$checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            return false;
        }
        android.widget.ImageView c17 = nVar.c();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17 != null ? c17.getTag(com.p314xaae8f345.mm.R.id.n8h) : null, str + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveTag$checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return b17;
    }

    public static final void K(android.widget.ImageView imageView, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLiveTag$setLoadedImageTagAndClearOther", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        if (imageView != null) {
            imageView.setTag(com.p314xaae8f345.mm.R.id.n8h, str + i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveTag$setLoadedImageTagAndClearOther", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
    }

    public static final void L(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n nVar2, r45.nw1 nw1Var, ed4.j jVar, int i17) {
        java.lang.String str;
        r45.co1 co1Var;
        r45.co1 co1Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLiveTag$showEndTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        android.view.View f17 = nVar2.f();
        if (f17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f17, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View e17 = nVar2.e();
        if (e17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(e17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0.Gb((s40.w0) c17, nVar2.e(), true, i17, null, 8, null);
        if ((nw1Var == null || (co1Var2 = (r45.co1) nw1Var.m75936x14adae67(43)) == null || co1Var2.m75939xb282bd08(0) != 1) ? false : true) {
            if (!J(nVar, nVar2.c(), jVar.a(), 1)) {
                i95.m c18 = i95.n0.c(vd2.i5.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                vd2.i5.Fb((vd2.i5) c18, jVar.b(), nVar2.c(), jVar.a(), null, 8, null);
                K(nVar2.c(), jVar.a(), 1);
            }
            android.widget.TextView d17 = nVar2.d();
            if (d17 != null) {
                if (nw1Var == null || (co1Var = (r45.co1) nw1Var.m75936x14adae67(43)) == null || (str = co1Var.m75945x2fec8307(1)) == null) {
                    str = "";
                }
                d17.setText(str);
            }
            android.widget.TextView d18 = nVar2.d();
            if (d18 != null) {
                d18.setVisibility(0);
            }
        } else {
            if (!J(nVar, nVar2.c(), jVar.a(), 0)) {
                i95.m c19 = i95.n0.c(vd2.i5.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                vd2.i5.Ac((vd2.i5) c19, jVar.b(), nVar2.c(), jVar.a(), null, 8, null);
                K(nVar2.c(), jVar.a(), 0);
            }
            android.widget.TextView d19 = nVar2.d();
            if (d19 != null) {
                d19.setVisibility(8);
            }
        }
        android.widget.ImageView c27 = nVar2.c();
        if (c27 != null) {
            c27.setVisibility(0);
        }
        android.view.View h17 = nVar2.h();
        if (h17 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(h17, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(h17, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveTag$showEndTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
    }

    public static final void M(r45.g92 g92Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n nVar2, r45.nw1 nw1Var, ed4.j jVar, int i17, r45.l71 l71Var) {
        java.lang.String str;
        r45.co1 co1Var;
        r45.co1 co1Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLiveTag$showLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        android.view.View f17 = nVar2.f();
        if (f17 != null) {
            f17.setContentDescription(nVar2.a());
        }
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).vk(nw1Var, "timelineold") && i17 == 4) {
            android.view.View f18 = nVar2.f();
            if (f18 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f18, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(f18, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View e17 = nVar2.e();
            if (e17 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(e17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                e17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i95.m c17 = i95.n0.c(s40.w0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            s40.w0.Gb((s40.w0) c17, nVar2.e(), false, i17, null, 8, null);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).cj(l71Var != null ? (r45.nw1) l71Var.m75936x14adae67(1) : null, 37);
        } else {
            android.view.View f19 = nVar2.f();
            if (f19 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(f19, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(f19, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View e18 = nVar2.e();
            if (e18 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(e18, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                e18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(e18, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$FinderLiveViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem$updateLiveTag$UrlAndToken;ILcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Ik(nVar2.f(), false, i17, g92Var);
        }
        if ((nw1Var == null || (co1Var2 = (r45.co1) nw1Var.m75936x14adae67(43)) == null || co1Var2.m75939xb282bd08(0) != 1) ? false : true) {
            if (!J(nVar, nVar2.c(), jVar.a(), 1)) {
                i95.m c18 = i95.n0.c(vd2.i5.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                vd2.i5.Fb((vd2.i5) c18, jVar.b(), nVar2.c(), jVar.a(), null, 8, null);
                K(nVar2.c(), jVar.a(), 1);
            }
            android.widget.TextView d17 = nVar2.d();
            if (d17 != null) {
                if (nw1Var == null || (co1Var = (r45.co1) nw1Var.m75936x14adae67(43)) == null || (str = co1Var.m75945x2fec8307(1)) == null) {
                    str = "";
                }
                d17.setText(str);
            }
            android.widget.TextView d18 = nVar2.d();
            if (d18 != null) {
                d18.setVisibility(0);
            }
        } else {
            if (!J(nVar, nVar2.c(), jVar.a(), 0)) {
                i95.m c19 = i95.n0.c(vd2.i5.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                vd2.i5.Ac((vd2.i5) c19, jVar.b(), nVar2.c(), jVar.a(), null, 8, null);
                K(nVar2.c(), jVar.a(), 0);
            }
            android.widget.TextView d19 = nVar2.d();
            if (d19 != null) {
                d19.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveTag$showLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
    }

    public final boolean G(java.lang.String str, android.view.View view, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            return false;
        }
        boolean Zi = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Zi(str, view.findViewById(com.p314xaae8f345.mm.R.id.f4x), view.findViewById(com.p314xaae8f345.mm.R.id.f7y), j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return Zi;
    }

    public final boolean H(r45.g92 shareObject, r45.nw1 nw1Var) {
        boolean Ni;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObject, "shareObject");
        if (nw1Var != null) {
            Ni = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(shareObject.m75945x2fec8307(1), nw1Var);
        } else {
            Ni = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ni(shareObject);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return Ni;
    }

    public final boolean I(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n holder, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 tlObj, r45.g92 shareObject, int i17, r45.nw1 nw1Var, r45.l71 l71Var) {
        r45.lw1 lw1Var;
        boolean z17;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tlObj, "tlObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObject, "shareObject");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLiveTag$getCoverUrl", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        r45.d84 d84Var = l71Var != null ? (r45.d84) l71Var.m75936x14adae67(9) : null;
        if (l71Var == null || (m75941xfb821914 = l71Var.m75941xfb821914(15)) == null) {
            lw1Var = null;
        } else {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.lw1) obj).m75939xb282bd08(5) == 2) {
                    break;
                }
            }
            lw1Var = (r45.lw1) obj;
        }
        ed4.j jVar = new ed4.j();
        java.lang.String m75945x2fec8307 = lw1Var != null ? lw1Var.m75945x2fec8307(0) : null;
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            java.lang.String m75945x2fec83072 = d84Var != null ? d84Var.m75945x2fec8307(0) : null;
            if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
                java.lang.String m75945x2fec83073 = shareObject.m75945x2fec8307(5);
                if (m75945x2fec83073 == null || m75945x2fec83073.length() == 0) {
                    java.lang.String m75945x2fec83074 = shareObject.m75945x2fec8307(11);
                    if (!(m75945x2fec83074 == null || m75945x2fec83074.length() == 0)) {
                        java.lang.String m75945x2fec83075 = shareObject.m75945x2fec8307(11);
                        jVar.d(m75945x2fec83075 != null ? m75945x2fec83075 : "");
                        jVar.c(jVar.b());
                    }
                } else {
                    java.lang.String m75945x2fec83076 = shareObject.m75945x2fec8307(5);
                    if (m75945x2fec83076 == null) {
                        m75945x2fec83076 = "";
                    }
                    jVar.d(m75945x2fec83076);
                    java.lang.String input = jVar.b();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLiveTag$getCoverUrl$removeParam", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile("&?token=[^&]*");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
                    java.lang.String replaceAll = compile.matcher(input).replaceAll("");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveTag$getCoverUrl$removeParam", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                    jVar.c(replaceAll);
                }
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(d84Var != null ? d84Var.m75945x2fec8307(0) : null);
                java.lang.String m75945x2fec83077 = d84Var != null ? d84Var.m75945x2fec8307(1) : null;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (m75945x2fec83077 == null) {
                    m75945x2fec83077 = "";
                }
                sb6.append(m75945x2fec83077);
                jVar.d(sb6.toString());
                java.lang.String m75945x2fec83078 = d84Var != null ? d84Var.m75945x2fec8307(0) : null;
                jVar.c(m75945x2fec83078 != null ? m75945x2fec83078 : "");
            }
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(lw1Var != null ? lw1Var.m75945x2fec8307(0) : null);
            java.lang.String m75945x2fec83079 = lw1Var != null ? lw1Var.m75945x2fec8307(1) : null;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m75945x2fec83079 == null) {
                m75945x2fec83079 = "";
            }
            sb7.append(m75945x2fec83079);
            jVar.d(sb7.toString());
            java.lang.String m75945x2fec830710 = lw1Var != null ? lw1Var.m75945x2fec8307(0) : null;
            jVar.c(m75945x2fec830710 != null ? m75945x2fec830710 : "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveTag$getCoverUrl", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLiveTag$isChargeLive", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        if (nw1Var != null) {
            z17 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(nw1Var);
        } else {
            int i18 = qs5.g.f447965a;
            int m75939xb282bd08 = shareObject.m75939xb282bd08(22);
            z17 = m75939xb282bd08 == 2 || m75939xb282bd08 == 8 || m75939xb282bd08 == 16;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveTag$isChargeLive", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLiveTag$isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        boolean bj6 = nw1Var != null ? ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(shareObject.m75945x2fec8307(1), nw1Var) : ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ni(shareObject);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveTag$isLiveReplay", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        boolean Ri = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ri(nw1Var);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("updateLiveTag live:");
        sb8.append(shareObject.m75945x2fec8307(0));
        sb8.append('(');
        sb8.append(shareObject.m75945x2fec8307(3));
        sb8.append("),liveStatus:");
        sb8.append(i17);
        sb8.append('(');
        sb8.append(nw1Var != null ? java.lang.Integer.valueOf(nw1Var.m75939xb282bd08(2)) : null);
        sb8.append("),chargFlag:");
        sb8.append(shareObject.m75939xb282bd08(22));
        sb8.append(",isChargeLive:");
        sb8.append(z17);
        sb8.append(",isLiveReplay:");
        sb8.append(bj6);
        sb8.append(",producingReplay:");
        sb8.append(Ri);
        sb8.append(",liveInfo null:");
        sb8.append(nw1Var == null);
        sb8.append(",purchaseInfo null:");
        sb8.append((nw1Var != null ? (r45.o52) nw1Var.m75936x14adae67(28) : null) == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f250936q, sb8.toString());
        if (z17) {
            M(shareObject, holder, holder, nw1Var, jVar, 2, l71Var);
        } else if (bj6) {
            M(shareObject, holder, holder, nw1Var, jVar, 4, l71Var);
        } else if (Ri) {
            L(holder, holder, nw1Var, jVar, 3);
        } else if (i17 == 1) {
            M(shareObject, holder, holder, nw1Var, jVar, 0, l71Var);
        } else {
            L(holder, holder, nw1Var, jVar, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void h(android.view.ViewStub viewStub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(baseViewHolder, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem.FinderLiveViewHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n nVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n) baseViewHolder;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder) == null || com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).getParent() == null) {
            android.view.View findViewById = nVar.f250805h.findViewById(com.p314xaae8f345.mm.R.id.n8j);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            nVar.E0 = findViewById;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            nVar.D0 = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.crm);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            boolean z17 = nVar.D0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            if (!z17) {
                android.view.View inflate = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).inflate();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
                nVar.E0 = inflate;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderMediaRoot", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
                nVar.D0 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderMediaStubHas", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            }
        }
        android.view.View g17 = nVar.g();
        android.widget.ImageView imageView = g17 != null ? (android.widget.ImageView) g17.findViewById(com.p314xaae8f345.mm.R.id.n8n) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCoverIv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        nVar.G0 = imageView;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCoverIv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View g18 = nVar.g();
        android.view.View findViewById2 = g18 != null ? g18.findViewById(com.p314xaae8f345.mm.R.id.f4x) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        nVar.H0 = findViewById2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderLiveTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View g19 = nVar.g();
        android.view.View findViewById3 = g19 != null ? g19.findViewById(com.p314xaae8f345.mm.R.id.f7y) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderLiveFeedTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        nVar.M0 = findViewById3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderLiveFeedTag", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View g27 = nVar.g();
        android.widget.ImageView imageView2 = g27 != null ? (android.widget.ImageView) g27.findViewById(com.p314xaae8f345.mm.R.id.hmm) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActivityInfoIcon", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        nVar.I0 = imageView2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActivityInfoIcon", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View g28 = nVar.g();
        android.widget.TextView textView = g28 != null ? (android.widget.TextView) g28.findViewById(com.p314xaae8f345.mm.R.id.e_l) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderBansTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        nVar.J0 = textView;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderBansTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View g29 = nVar.g();
        android.widget.TextView textView2 = g29 != null ? (android.widget.TextView) g29.findViewById(com.p314xaae8f345.mm.R.id.opa) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setReasonTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        nVar.K0 = textView2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReasonTv", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        android.view.View g37 = nVar.g();
        android.view.View findViewById4 = g37 != null ? g37.findViewById(com.p314xaae8f345.mm.R.id.fvb) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFinderOlympicView", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        nVar.L0 = findViewById4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFinderOlympicView", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns nsVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n nVar;
        android.widget.ImageView b17;
        r45.g92 g92Var;
        java.lang.String m75945x2fec8307;
        r45.g92 g92Var2;
        android.view.View g17;
        int i19;
        java.lang.Long j17;
        r45.g92 g92Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        if ((c19807x593d1720 != null ? c19807x593d1720.f39014x86965dde : null) != null && c19807x593d1720.f39014x86965dde.f451381s != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(baseViewHolder, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem.FinderLiveViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n nVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n) baseViewHolder;
            r45.g92 g92Var4 = c19807x593d1720.f39014x86965dde.f451381s;
            java.lang.String valueOf = java.lang.String.valueOf(g92Var4.m75945x2fec8307(3));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNickName", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            nVar2.F0 = valueOf;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNickName", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            r45.a90 a90Var = c19807x593d1720.f39014x86965dde;
            if (a90Var == null || (g92Var3 = a90Var.f451381s) == null || (str = g92Var3.m75945x2fec8307(0)) == null) {
                str = "0";
            }
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(str, 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLiveId", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            nVar2.N0 = V;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLiveId", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$FinderLiveViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLiveStatus", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLiveStatus", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            android.view.View g18 = nVar2.g();
            android.util.Pair j18 = m21.y.j(g18 != null ? g18.getContext() : null);
            android.view.View g19 = nVar2.g();
            android.view.ViewGroup.LayoutParams layoutParams = g19 != null ? g19.getLayoutParams() : null;
            if (layoutParams != null) {
                java.lang.Object first = j18.first;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
                layoutParams.width = ((java.lang.Number) first).intValue();
            }
            if (layoutParams != null) {
                java.lang.Object second = j18.second;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
                layoutParams.height = ((java.lang.Number) second).intValue();
            }
            android.view.View g27 = nVar2.g();
            if (g27 != null) {
                g27.setLayoutParams(layoutParams);
            }
            android.view.View g28 = nVar2.g();
            if (g28 != null) {
                g28.requestLayout();
            }
            android.widget.ImageView b18 = nVar2.b();
            if (b18 != null) {
                b18.setVisibility(8);
            }
            android.widget.TextView j19 = nVar2.j();
            if (j19 != null) {
                j19.setVisibility(8);
            }
            java.lang.String Jj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Jj(nVar2.i());
            if (!(Jj.length() > 0)) {
                Jj = null;
            }
            if (Jj != null) {
                g92Var4.set(5, Jj);
            }
            I(nVar2, c19807x593d1720, g92Var4, g92Var4.m75939xb282bd08(13), (r45.nw1) g92Var4.m75936x14adae67(24), null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = nsVar != null ? nsVar.f251558a : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkLiveStatus", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            r45.g92 g92Var5 = c19807x593d1720.f39014x86965dde.f451381s;
            h0Var.f391656d = g92Var5;
            java.lang.String m75945x2fec83072 = g92Var5.m75945x2fec8307(0);
            long longValue = (m75945x2fec83072 == null || (j17 = r26.h0.j(m75945x2fec83072)) == null) ? 0L : j17.longValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            f0Var.f391649d = ((r45.g92) h0Var.f391656d).m75939xb282bd08(13);
            ed4.i iVar = new ed4.i(nVar2, this, h0Var, c17933xe8d1b226, longValue, c19807x593d1720, f0Var);
            boolean z17 = ((r45.nw1) ((r45.g92) h0Var.f391656d).m75936x14adae67(24)) == null;
            i95.m c17 = i95.n0.c(s40.w0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            s40.w0 w0Var = (s40.w0) c17;
            qs5.d dVar = qs5.d.f447959e;
            s40.w0.u9(w0Var, longValue, z17, null, iVar, 2, null, null, null, 224, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLiveStatus", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            java.lang.String m75945x2fec83073 = g92Var4.m75945x2fec8307(28);
            if ((m75945x2fec83073 == null || m75945x2fec83073.length() == 0) || g92Var4.m75939xb282bd08(13) == 2) {
                android.view.View h17 = nVar2.h();
                if (h17 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(h17, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.ImageView c18 = nVar2.c();
                if (c18 != null) {
                    c18.setVisibility(0);
                }
            } else {
                android.view.View h18 = nVar2.h();
                if (h18 != null) {
                    android.view.View findViewById = h18.findViewById(com.p314xaae8f345.mm.R.id.fv8);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                    android.view.View findViewById2 = h18.findViewById(com.p314xaae8f345.mm.R.id.fv9);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).tk((android.widget.ImageView) findViewById, qs5.y.f448008d, com.p314xaae8f345.mm.R.C30861xcebc809e.c5e);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).tk((android.widget.ImageView) findViewById2, qs5.y.f448009e, com.p314xaae8f345.mm.R.C30861xcebc809e.c5f);
                    android.view.View findViewById3 = h18.findViewById(com.p314xaae8f345.mm.R.id.fva);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
                    android.widget.TextView textView = (android.widget.TextView) findViewById3;
                    textView.setTextSize(1, 14.0f);
                    android.view.View findViewById4 = h18.findViewById(com.p314xaae8f345.mm.R.id.fv_);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
                    android.widget.TextView textView2 = (android.widget.TextView) findViewById4;
                    textView2.setTextSize(1, 14.0f);
                    android.view.View findViewById5 = h18.findViewById(com.p314xaae8f345.mm.R.id.fvc);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
                    android.widget.TextView textView3 = (android.widget.TextView) findViewById5;
                    textView3.setTextSize(1, 15.0f);
                    com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                    com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                    com.p314xaae8f345.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
                    java.lang.String m75945x2fec83074 = g92Var4.m75945x2fec8307(29);
                    if (m75945x2fec83074 == null || m75945x2fec83074.length() == 0) {
                        i19 = 8;
                        textView2.setVisibility(8);
                    } else {
                        i19 = 8;
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        java.lang.String m75945x2fec83075 = g92Var4.m75945x2fec8307(29);
                        ((ke0.e) xVar).getClass();
                        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec83075));
                        textView2.setVisibility(0);
                    }
                    java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.esj, g92Var4.m75945x2fec8307(28));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    int intValue = ((java.lang.Number) j18.first).intValue() - (i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12) * 2);
                    java.lang.String t17 = r26.i0.t(string, "\n", "", false);
                    if (new android.text.StaticLayout(t17, 0, t17.length(), textView.getPaint(), intValue, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
                        string = t17;
                    }
                    textView.setText(string);
                } else {
                    i19 = 8;
                }
                android.view.View h19 = nVar2.h();
                if (h19 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(h19, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    h19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(h19, "com/tencent/mm/plugin/sns/ui/item/FinderLiveTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.ImageView c19 = nVar2.c();
                if (c19 != null) {
                    c19.setVisibility(i19);
                }
            }
            android.view.View g29 = nVar2.g();
            if (g29 != null) {
                g29.setTag(c19807x593d1720);
            }
            android.view.View g37 = nVar2.g();
            if (g37 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bsVar);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOnClickListener", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                android.view.View.OnClickListener finderLiveListener = bsVar.f249576i.f251191f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveListener, "finderLiveListener");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOnClickListener", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                g37.setOnClickListener(finderLiveListener);
            }
            if (H(g92Var4, (r45.nw1) g92Var4.m75936x14adae67(24)) || (g17 = nVar2.g()) == null) {
                nVar = nVar2;
            } else {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(g17);
                if (G(g92Var4.m75945x2fec8307(1), g17, nVar2.i())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                    return;
                }
                p52.h.f433549a.e(java.lang.String.valueOf(g92Var4.m75945x2fec8307(0)), null);
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(g17, "live_room_card");
                nVar = nVar2;
                aVar.Vj(g17, 40, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.o(g92Var4, this, g17, nVar));
            }
            if (g92Var4.m75939xb282bd08(13) == 1) {
                r45.a90 a90Var2 = c19807x593d1720.f39014x86965dde;
                long Z = pm0.v.Z((a90Var2 == null || (g92Var2 = a90Var2.f451381s) == null) ? null : g92Var2.m75945x2fec8307(2));
                r45.a90 a90Var3 = c19807x593d1720.f39014x86965dde;
                java.lang.String str2 = (a90Var3 == null || (g92Var = a90Var3.f451381s) == null || (m75945x2fec8307 = g92Var.m75945x2fec8307(12)) == null) ? "" : m75945x2fec8307;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindActivityIcon", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f250936q, "#bindActivityIcon feedId=".concat(pm0.v.u(Z)));
                p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f250938s;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ik() && (b17 = nVar.b()) != null) {
                    this.f250938s = p3325xe03a0797.p3326xc267989b.l.d(this.f250937r, null, null, new ed4.h(b17, Z, str2, null), 3, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindActivityIcon", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            }
            android.view.View convertView = nVar.f250805h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(convertView, "convertView");
            ym5.a1.h(convertView, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p(g92Var4, this, nVar));
        }
        g(nsVar, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public java.lang.String u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
        return "FinderLiveTimeLineItem";
    }
}

package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes10.dex */
public final class x {
    public x(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final java.lang.String a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.x xVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21904x129eb5b3 c21904x129eb5b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e1;
        java.lang.String f212749x;
        java.lang.String f212749x2;
        java.lang.String f212749x3;
        xVar.getClass();
        android.view.View liveTag = c21904x129eb5b3.getLiveTag();
        if (liveTag != null && liveTag.getVisibility() == 0) {
            android.view.View liveTag2 = c21904x129eb5b3.getLiveTag();
            c15315xe70278e1 = liveTag2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) liveTag2 : null;
            if (c15315xe70278e1 != null && (f212749x3 = c15315xe70278e1.getF212749x()) != null) {
                return f212749x3;
            }
        } else {
            android.view.View liveEndNewTag = c21904x129eb5b3.getLiveEndNewTag();
            if (liveEndNewTag != null && liveEndNewTag.getVisibility() == 0) {
                android.view.View liveEndNewTag2 = c21904x129eb5b3.getLiveEndNewTag();
                c15315xe70278e1 = liveEndNewTag2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) liveEndNewTag2 : null;
                if (c15315xe70278e1 != null && (f212749x2 = c15315xe70278e1.getF212749x()) != null) {
                    return f212749x2;
                }
            } else {
                android.view.View liveEndTagV3 = c21904x129eb5b3.getLiveEndTagV3();
                if (liveEndTagV3 != null && liveEndTagV3.getVisibility() == 0) {
                    android.view.View liveEndTagV32 = c21904x129eb5b3.getLiveEndTagV3();
                    c15315xe70278e1 = liveEndTagV32 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) liveEndTagV32 : null;
                    if (c15315xe70278e1 != null && (f212749x = c15315xe70278e1.getF212749x()) != null) {
                        return f212749x;
                    }
                }
            }
        }
        return "";
    }

    public static final void b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.x xVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar, r45.g92 g92Var, java.lang.String str) {
        java.lang.String str2;
        java.lang.String c17;
        xVar.getClass();
        int i17 = dVar.D() ? 2 : 1;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String m75945x2fec8307 = g92Var.m75945x2fec8307(0);
        java.lang.String str3 = "";
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        hashMap.put("liveid", m75945x2fec8307);
        hashMap.put("share_type", java.lang.String.valueOf(i17));
        if (f9Var == null || (str2 = g95.e0.d(f9Var)) == null) {
            str2 = "";
        }
        hashMap.put("share_wxusername", str2);
        if (f9Var != null && (c17 = g95.e0.c(f9Var)) != null) {
            str3 = c17;
        }
        hashMap.put("share_chat_wxusername", str3);
        hashMap.put("button_txt", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatingItemAppMsgFinderLiveFeed", "report exposed with params " + hashMap);
        i95.m c18 = i95.n0.c(s40.p0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Tj("liveid_share_end_more", hashMap, null, "temp_6", null, null);
    }

    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w r(r45.l71 l71Var, r45.g92 g92Var) {
        r45.lw1 lw1Var;
        java.lang.String m75945x2fec8307;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        r45.d84 d84Var = l71Var != null ? (r45.d84) l71Var.m75936x14adae67(9) : null;
        boolean z17 = true;
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
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w wVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w();
        java.lang.String m75945x2fec83072 = lw1Var != null ? lw1Var.m75945x2fec8307(0) : null;
        if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
            java.lang.String m75945x2fec83073 = d84Var != null ? d84Var.m75945x2fec8307(0) : null;
            if (m75945x2fec83073 == null || m75945x2fec83073.length() == 0) {
                java.lang.String m75945x2fec83074 = g92Var.m75945x2fec8307(5);
                if (m75945x2fec83074 == null || m75945x2fec83074.length() == 0) {
                    java.lang.String m75945x2fec83075 = g92Var.m75945x2fec8307(11);
                    if (m75945x2fec83075 != null && m75945x2fec83075.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        java.lang.String m75945x2fec83076 = g92Var.m75945x2fec8307(11);
                        java.lang.String str = m75945x2fec83076 != null ? m75945x2fec83076 : "";
                        wVar.f287426a = str;
                        wVar.f287427b = str;
                    }
                } else {
                    java.lang.String m75945x2fec83077 = g92Var.m75945x2fec8307(5);
                    if (m75945x2fec83077 == null) {
                        m75945x2fec83077 = "";
                    }
                    wVar.f287426a = m75945x2fec83077;
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile("&?token=[^&]*");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
                    java.lang.String replaceAll = compile.matcher(m75945x2fec83077).replaceAll("");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
                    wVar.f287427b = replaceAll;
                }
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(d84Var != null ? d84Var.m75945x2fec8307(0) : null);
                java.lang.String m75945x2fec83078 = d84Var != null ? d84Var.m75945x2fec8307(1) : null;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (m75945x2fec83078 == null) {
                    m75945x2fec83078 = "";
                }
                sb6.append(m75945x2fec83078);
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb7, "<set-?>");
                wVar.f287426a = sb7;
                m75945x2fec8307 = d84Var != null ? d84Var.m75945x2fec8307(0) : null;
                wVar.f287427b = m75945x2fec8307 != null ? m75945x2fec8307 : "";
            }
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(lw1Var != null ? lw1Var.m75945x2fec8307(0) : null);
            java.lang.String m75945x2fec83079 = lw1Var != null ? lw1Var.m75945x2fec8307(1) : null;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m75945x2fec83079 == null) {
                m75945x2fec83079 = "";
            }
            sb8.append(m75945x2fec83079);
            java.lang.String sb9 = sb8.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb9, "<set-?>");
            wVar.f287426a = sb9;
            m75945x2fec8307 = lw1Var != null ? lw1Var.m75945x2fec8307(0) : null;
            wVar.f287427b = m75945x2fec8307 != null ? m75945x2fec8307 : "";
        }
        return wVar;
    }

    public static final void s(r45.g92 g92Var, r45.nw1 nw1Var, r45.l71 l71Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21904x129eb5b3 c21904x129eb5b3, qs5.n nVar) {
        int i17;
        java.lang.String str;
        r45.co1 co1Var;
        r45.co1 co1Var2;
        android.view.View liveTag = c21904x129eb5b3.getLiveTag();
        if (liveTag == null) {
            i17 = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(liveTag, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            liveTag.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            i17 = 0;
            yj0.a.f(liveTag, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View liveTag2 = c21904x129eb5b3.getLiveTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e1 = liveTag2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) liveTag2 : null;
        if (c15315xe70278e1 != null) {
            android.graphics.drawable.Drawable drawable = c15315xe70278e1.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a4y, null);
            c15315xe70278e1.f212734f = drawable;
            c15315xe70278e1.f212733e = 1;
            c15315xe70278e1.setBackground(drawable);
        }
        android.view.View liveEndTag = c21904x129eb5b3.getLiveEndTag();
        if (liveEndTag != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(liveEndTag, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            liveEndTag.setVisibility(((java.lang.Integer) arrayList2.get(i17)).intValue());
            yj0.a.f(liveEndTag, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View liveEndNewTag = c21904x129eb5b3.getLiveEndNewTag();
        if (liveEndNewTag != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(liveEndNewTag, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            liveEndNewTag.setVisibility(((java.lang.Integer) arrayList3.get(i17)).intValue());
            yj0.a.f(liveEndNewTag, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View liveEndTagV3 = c21904x129eb5b3.getLiveEndTagV3();
        if (liveEndTagV3 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(liveEndTagV3, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            liveEndTagV3.setVisibility(((java.lang.Integer) arrayList4.get(i17)).intValue());
            yj0.a.f(liveEndTagV3, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showLiveTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0.O1((s40.w0) c17, c21904x129eb5b3.getLiveTag(), nVar, false, g92Var, 4, null);
        android.widget.TextView finderDesc = c21904x129eb5b3.getFinderDesc();
        if (finderDesc != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.z.f287640a.f(true, finderDesc, g92Var);
        }
        if (((nw1Var == null || (co1Var2 = (r45.co1) nw1Var.m75936x14adae67(43)) == null || co1Var2.m75939xb282bd08(i17) != 1) ? i17 : 1) == 0) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w r17 = r(l71Var, g92Var);
            ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Di(r17.f287426a, c21904x129eb5b3.getFinderThumb(), r17.f287427b, mn2.f1.D);
            android.widget.TextView finderBansTv = c21904x129eb5b3.getFinderBansTv();
            if (finderBansTv == null) {
                return;
            }
            finderBansTv.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w r18 = r(l71Var, g92Var);
        i95.m c18 = i95.n0.c(vd2.i5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        vd2.i5.Fb((vd2.i5) c18, r18.f287426a, c21904x129eb5b3.getFinderThumb(), r18.f287427b, null, 8, null);
        android.widget.TextView finderBansTv2 = c21904x129eb5b3.getFinderBansTv();
        if (finderBansTv2 != null) {
            if (nw1Var == null || (co1Var = (r45.co1) nw1Var.m75936x14adae67(43)) == null || (str = co1Var.m75945x2fec8307(1)) == null) {
                str = "";
            }
            finderBansTv2.setText(str);
        }
        android.widget.TextView finderBansTv3 = c21904x129eb5b3.getFinderBansTv();
        if (finderBansTv3 == null) {
            return;
        }
        finderBansTv3.setVisibility(i17);
    }

    public final void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21904x129eb5b3 holder, float f17, float f18, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(context);
        int min = java.lang.Math.min(a17.f278668a, a17.f278669b) / 8;
        int i17 = min * 3;
        int i18 = min * 4;
        android.widget.ImageView finderThumb = holder.getFinderThumb();
        android.view.ViewGroup.LayoutParams layoutParams = finderThumb != null ? finderThumb.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.width = i17;
        layoutParams2.height = i18;
        android.widget.ImageView finderThumb2 = holder.getFinderThumb();
        if (finderThumb2 != null) {
            finderThumb2.setLayoutParams(layoutParams2);
        }
        android.view.View finderOlympicView = holder.getFinderOlympicView();
        if (finderOlympicView != null) {
            finderOlympicView.setLayoutParams(layoutParams2);
        }
        android.view.View finderThumbSpace = holder.getFinderThumbSpace();
        if (finderThumbSpace != null) {
            finderThumbSpace.setLayoutParams(layoutParams2);
        }
        android.view.View view = holder.f39493x8ad70635;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.width = i17;
                view.setLayoutParams(layoutParams4);
                holder.m79976x53e9ee84(i17);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatingItemAppMsgFinderLiveFeed", "New layout enabled: mediaWidth=" + i17 + ", targetHeight=" + i18 + ", unitX=" + min + ", holder.width=" + holder.getWidth() + ", clickArea adjusted");
    }

    public final boolean d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.j()) || ot0.q.v(f9Var.j()) == null) {
            return true;
        }
        r45.g92 g92Var = ((zy2.c) ot0.q.v(f9Var.j()).y(zy2.c.class)).f558892b;
        s40.b1 b1Var = (s40.b1) i95.n0.c(s40.b1.class);
        r45.nw1 nw1Var = (r45.nw1) g92Var.m75936x14adae67(24);
        int m75939xb282bd08 = nw1Var != null ? nw1Var.m75939xb282bd08(54) : 0;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) b1Var).getClass();
        return zl2.r4.f555483a.n(m75939xb282bd08);
    }

    public final void e(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21904x129eb5b3 holder, r45.g92 shareObject, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f;
        java.lang.Long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObject, "shareObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String m75945x2fec8307 = shareObject.m75945x2fec8307(0);
        long longValue = (m75945x2fec8307 == null || (j17 = r26.h0.j(m75945x2fec8307)) == null) ? 0L : j17.longValue();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o oVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o(holder, shareObject, longValue, ui6, msg);
        if (ui6.g() instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            android.app.Activity g17 = ui6.g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            activityC21401x6ce6f73f = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) g17;
        } else {
            activityC21401x6ce6f73f = null;
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        qs5.d dVar = qs5.d.f447959e;
        s40.w0.u9((s40.w0) c17, longValue, false, activityC21401x6ce6f73f, oVar, 1, null, null, null, 224, null);
    }

    public final void f(boolean z17, android.widget.TextView descTv, r45.g92 shareObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descTv, "descTv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObject, "shareObject");
        if (z17) {
            java.lang.String m75945x2fec8307 = shareObject.m75945x2fec8307(4);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && ((r40.i) ((tc.e) i95.n0.c(tc.e.class))).wi()) {
                descTv.setVisibility(0);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = descTv.getContext();
                java.lang.String m75945x2fec83072 = shareObject.m75945x2fec8307(4);
                ((ke0.e) xVar).getClass();
                descTv.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec83072));
                return;
            }
        }
        descTv.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0419  */
    /* JADX WARN: Type inference failed for: r1v20, types: [kz5.p0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r44, long r46, android.view.View r48, zy2.c r49, yb5.d r50, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r51, boolean r52, long r53, java.lang.String r55, r45.k30 r56, android.content.Intent r57) {
        /*
            Method dump skipped, instructions count: 1321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.x.g(long, long, android.view.View, zy2.c, yb5.d, com.tencent.mm.storage.f9, boolean, long, java.lang.String, r45.k30, android.content.Intent):void");
    }

    public final void h(android.view.View view, r45.g92 finderObject, yb5.d ui6, java.lang.String userName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(view);
        try {
            java.lang.String m75945x2fec8307 = finderObject.m75945x2fec8307(0);
            long parseLong = m75945x2fec8307 != null ? java.lang.Long.parseLong(m75945x2fec8307) : -1L;
            try {
                if (k(finderObject, (r45.nw1) finderObject.m75936x14adae67(24))) {
                    return;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                f0Var.f391649d = -1;
                f0Var.f391649d = ui6.D() ? 1 : 0;
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(view, "live_room_card");
                jz5.l[] lVarArr = new jz5.l[5];
                java.lang.String m75945x2fec83072 = finderObject.m75945x2fec8307(2);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                lVarArr[0] = new jz5.l("feed_id", m75945x2fec83072);
                java.lang.String m75945x2fec83073 = finderObject.m75945x2fec8307(0);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                lVarArr[1] = new jz5.l("live_id", m75945x2fec83073);
                ((v80.n) ((w80.j) i95.n0.c(w80.j.class))).getClass();
                ml2.q1 q1Var = ml2.q1.f409345e;
                lVarArr[2] = new jz5.l("comment_scene", "temp_6");
                java.lang.String m75945x2fec83074 = finderObject.m75945x2fec8307(1);
                if (m75945x2fec83074 == null) {
                    m75945x2fec83074 = "";
                }
                lVarArr[3] = new jz5.l("finder_username", m75945x2fec83074);
                lVarArr[4] = new jz5.l("session_buffer", "");
                aVar.gk(view, kz5.c1.k(lVarArr));
                aVar.Ai(view, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p(finderObject, f0Var, userName));
                if (z17) {
                    p52.h.f433549a.e(java.lang.String.valueOf(finderObject.m75945x2fec8307(0)), null);
                }
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Vj(view, 40, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q(finderObject, view, parseLong));
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    public final android.view.View i(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return view.findViewById(com.p314xaae8f345.mm.R.id.f7y);
    }

    public final boolean j(java.lang.String str, r45.nw1 nw1Var, android.view.View view, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Zi(str, view.findViewById(com.p314xaae8f345.mm.R.id.f4x), i(view), j17);
    }

    public final boolean k(r45.g92 shareObject, r45.nw1 nw1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObject, "shareObject");
        if (nw1Var == null) {
            return ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ni(shareObject);
        }
        return ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).bj(shareObject.m75945x2fec8307(1), nw1Var);
    }

    public final boolean l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, android.view.View v17, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String str) {
        zy2.c cVar;
        p3325xe03a0797.p3326xc267989b.y0 b17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        ot0.q v18 = ot0.q.v(msg.U1());
        h0Var.f391656d = v18;
        if (v18 == null || (cVar = (zy2.c) v18.y(zy2.c.class)) == null) {
            return false;
        }
        long Z = pm0.v.Z(cVar.f558892b.m75945x2fec8307(2));
        long Z2 = pm0.v.Z(cVar.f558892b.m75945x2fec8307(0));
        java.lang.Object tag = v17.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag : null;
        if (erVar == null || (qVar = erVar.f285441d) == null || (b17 = qVar.mo79417x33dec1ed()) == null) {
            b17 = p3325xe03a0797.p3326xc267989b.z0.b();
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = b17;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.u(cVar, a0Var, Z, v17, str, ui6, Z2, msg, h0Var, elapsedRealtime, null), 2, null);
        return false;
    }

    public final void m(r45.g92 shareObject, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObject, "shareObject");
        long Z = pm0.v.Z(shareObject.m75945x2fec8307(2));
        int i17 = qs5.g.f447965a;
        int m75939xb282bd08 = shareObject.m75939xb282bd08(22);
        ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Vi(true, Z, ya.a.f77453x4b357bf, ((m75939xb282bd08 == 2 || m75939xb282bd08 == 8 || m75939xb282bd08 == 16) || shareObject.m75939xb282bd08(22) == 6) ? 1 : 2, z17 ? 2 : 1);
    }

    public final void n(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        r45.g92 g92Var = null;
        g92Var = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var != null ? f9Var.j() : null)) {
            ot0.q v17 = ot0.q.v(f9Var != null ? f9Var.U1() : null);
            if (v17 != null) {
                boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var != null ? f9Var.Q0() : null);
                g92Var = ((zy2.c) v17.y(zy2.c.class)).f558892b;
                g92Var.set(44, java.lang.Integer.valueOf(R4 ? 4 : 3));
            }
        }
        if (g92Var != null) {
            m40.i0 i0Var = (m40.i0) i95.n0.c(m40.i0.class);
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("share_scene", java.lang.String.valueOf(g92Var.m75939xb282bd08(44)));
            lVarArr[1] = new jz5.l("liveid", java.lang.String.valueOf(g92Var.m75945x2fec8307(0)));
            java.lang.String m75945x2fec8307 = g92Var.m75945x2fec8307(2);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            lVarArr[2] = new jz5.l("feedid", m75945x2fec8307);
            ((b92.y0) i0Var).wi(true, kz5.c1.i(lVarArr));
        }
    }

    public final void o(yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        ot0.q v17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(msg.j()) || (v17 = ot0.q.v(msg.U1())) == null) {
            return;
        }
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(msg.Q0());
        r45.g92 g92Var = ((zy2.c) v17.y(zy2.c.class)).f558892b;
        g92Var.set(44, java.lang.Integer.valueOf(R4 ? 4 : 3));
        android.content.Intent intent = new android.content.Intent(ui6.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        intent.putExtra("Retr_Msg_Id", msg.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", msg.Q0());
        int i17 = v17.f430199i;
        if (i17 == 63) {
            intent.putExtra("Retr_Msg_Type", 23);
        } else if (i17 == 88) {
            intent.putExtra("Retr_Msg_Type", 31);
        }
        intent.putExtra("scene_from", 17);
        m40.i0 i0Var = (m40.i0) i95.n0.c(m40.i0.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("share_scene", java.lang.String.valueOf(g92Var.m75939xb282bd08(44)));
        lVarArr[1] = new jz5.l("liveid", java.lang.String.valueOf(g92Var.m75945x2fec8307(0)));
        java.lang.String m75945x2fec8307 = g92Var.m75945x2fec8307(2);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        lVarArr[2] = new jz5.l("feedid", m75945x2fec8307);
        ((b92.y0) i0Var).wi(false, kz5.c1.i(lVarArr));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatingItemAppMsgFinderLiveFeed", "retransmit content.type:" + v17.f430199i);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        ((zy2.db) i95.n0.c(zy2.db.class)).getClass();
        j45.l.q(ui6.f542242d, intent, 1001, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v(R4, g92Var));
    }

    public final void p(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21904x129eb5b3 holder, r45.g92 shareObject) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObject, "shareObject");
        r45.xz3 xz3Var = (r45.xz3) shareObject.m75936x14adae67(43);
        if (xz3Var == null || (str = xz3Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        android.widget.ImageView instantDiscountMask = holder.getInstantDiscountMask();
        if (instantDiscountMask != null) {
            if (!(str.length() > 0)) {
                instantDiscountMask.setVisibility(8);
            } else {
                instantDiscountMask.setVisibility(0);
                new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f)).c(instantDiscountMask);
            }
        }
    }

    public final boolean q(yb5.d ui6, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 tag, r45.g92 shareObject, r45.nw1 nw1Var, r45.l71 l71Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        r45.nw1 nw1Var2;
        java.lang.String str;
        r45.co1 co1Var;
        r45.co1 co1Var2;
        java.lang.String str2;
        java.lang.String str3;
        r45.co1 co1Var3;
        r45.co1 co1Var4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareObject, "shareObject");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21904x129eb5b3 c21904x129eb5b3 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21904x129eb5b3) tag;
        qs5.n Wj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Wj(shareObject, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveCardState:");
        sb6.append(Wj);
        sb6.append(", liveFlag, ");
        sb6.append(nw1Var != null ? java.lang.Integer.valueOf(nw1Var.m75939xb282bd08(37)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatingItemAppMsgFinderLiveFeed", sb6.toString());
        jz5.l Ij = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Ij(nw1Var != null ? nw1Var.m75942xfb822ef2(0) : 0L);
        java.lang.Integer num = Ij != null ? (java.lang.Integer) Ij.f384366d : null;
        int ordinal = Wj.ordinal();
        if (ordinal != 0) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.x xVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.z.f287640a;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                s(shareObject, nw1Var, l71Var, c21904x129eb5b3, Wj);
                            }
                            return true;
                        }
                    }
                }
                android.view.View liveTag = c21904x129eb5b3.getLiveTag();
                if (liveTag != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(liveTag, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    liveTag.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(liveTag, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View liveEndTag = c21904x129eb5b3.getLiveEndTag();
                if (liveEndTag != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(liveEndTag, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    liveEndTag.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(liveEndTag, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View finderOlympicView = c21904x129eb5b3.getFinderOlympicView();
                if (finderOlympicView != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(finderOlympicView, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderOlympicView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(finderOlympicView, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.ImageView activityInfoIcon = c21904x129eb5b3.getActivityInfoIcon();
                if (activityInfoIcon != null) {
                    activityInfoIcon.setVisibility(8);
                }
                android.widget.TextView reasonTv = c21904x129eb5b3.getReasonTv();
                if (reasonTv != null) {
                    reasonTv.setVisibility(8);
                }
                android.widget.TextView finderBansTv = c21904x129eb5b3.getFinderBansTv();
                if (finderBansTv != null) {
                    finderBansTv.setVisibility(8);
                }
                android.widget.TextView finderDesc = c21904x129eb5b3.getFinderDesc();
                if (finderDesc != null) {
                    xVar.f(false, finderDesc, shareObject);
                }
                jz5.l Ij2 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Ij(nw1Var != null ? nw1Var.m75942xfb822ef2(0) : 0L);
                java.lang.Integer num2 = Ij2 != null ? (java.lang.Integer) Ij2.f384366d : null;
                if (pm0.v.z(num2 != null ? num2.intValue() : 0, 4)) {
                    android.view.View liveEndNewTag = c21904x129eb5b3.getLiveEndNewTag();
                    if (liveEndNewTag != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(liveEndNewTag, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveEndNewTag.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(liveEndNewTag, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View liveEndTagV3 = c21904x129eb5b3.getLiveEndTagV3();
                    if (liveEndTagV3 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(liveEndTagV3, arrayList5.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveEndTagV3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(liveEndTagV3, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    i95.m c17 = i95.n0.c(s40.w0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    str2 = "getService(...)";
                    s40.w0.g6((s40.w0) c17, c21904x129eb5b3.getLiveEndTagV3(), Wj, false, shareObject, 4, null);
                } else {
                    str2 = "getService(...)";
                    android.view.View liveEndNewTag2 = c21904x129eb5b3.getLiveEndNewTag();
                    if (liveEndNewTag2 != null) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                        arrayList6.add(0);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(liveEndNewTag2, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveEndNewTag2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(liveEndNewTag2, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View liveEndTagV32 = c21904x129eb5b3.getLiveEndTagV3();
                    if (liveEndTagV32 != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                        arrayList7.add(8);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(liveEndTagV32, arrayList7.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveEndTagV32.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(liveEndTagV32, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showEndFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    i95.m c18 = i95.n0.c(s40.w0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, str2);
                    s40.w0.g6((s40.w0) c18, c21904x129eb5b3.getLiveEndNewTag(), Wj, false, shareObject, 4, null);
                }
                if ((nw1Var == null || (co1Var4 = (r45.co1) nw1Var.m75936x14adae67(43)) == null || co1Var4.m75939xb282bd08(0) != 1) ? false : true) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w r17 = r(l71Var, shareObject);
                    i95.m c19 = i95.n0.c(vd2.i5.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, str2);
                    vd2.i5.Fb((vd2.i5) c19, r17.f287426a, c21904x129eb5b3.getFinderThumb(), r17.f287427b, null, 8, null);
                    android.widget.TextView finderBansTv2 = c21904x129eb5b3.getFinderBansTv();
                    if (finderBansTv2 != null) {
                        if (nw1Var == null || (co1Var3 = (r45.co1) nw1Var.m75936x14adae67(43)) == null || (str3 = co1Var3.m75945x2fec8307(1)) == null) {
                            str3 = "";
                        }
                        finderBansTv2.setText(str3);
                    }
                    android.widget.TextView finderBansTv3 = c21904x129eb5b3.getFinderBansTv();
                    if (finderBansTv3 != null) {
                        finderBansTv3.setVisibility(0);
                    }
                } else {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w r18 = r(l71Var, shareObject);
                    ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Di(r18.f287426a, c21904x129eb5b3.getFinderThumb(), r18.f287427b, mn2.f1.D);
                    android.widget.TextView finderBansTv4 = c21904x129eb5b3.getFinderBansTv();
                    if (finderBansTv4 != null) {
                        finderBansTv4.setVisibility(8);
                    }
                }
            } else if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).vk(nw1Var, "chat")) {
                if (pm0.v.z(num != null ? num.intValue() : 0, 2)) {
                    s(shareObject, nw1Var, l71Var, c21904x129eb5b3, Wj);
                    nw1Var2 = null;
                } else {
                    android.view.View liveTag2 = c21904x129eb5b3.getLiveTag();
                    if (liveTag2 != null) {
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                        arrayList8.add(0);
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(liveTag2, arrayList8.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveTag2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                        yj0.a.f(liveTag2, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View liveTag3 = c21904x129eb5b3.getLiveTag();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e1 = liveTag3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) liveTag3 : null;
                    if (c15315xe70278e1 != null) {
                        nw1Var2 = null;
                        android.graphics.drawable.Drawable drawable = c15315xe70278e1.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a4z, null);
                        c15315xe70278e1.f212734f = drawable;
                        c15315xe70278e1.f212733e = 6;
                        c15315xe70278e1.setBackground(drawable);
                    } else {
                        nw1Var2 = null;
                    }
                    android.view.View liveEndTag2 = c21904x129eb5b3.getLiveEndTag();
                    if (liveEndTag2 != null) {
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
                        arrayList9.add(8);
                        java.util.Collections.reverse(arrayList9);
                        yj0.a.d(liveEndTag2, arrayList9.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveEndTag2.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                        yj0.a.f(liveEndTag2, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View liveEndNewTag3 = c21904x129eb5b3.getLiveEndNewTag();
                    if (liveEndNewTag3 != null) {
                        java.util.ArrayList arrayList10 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
                        arrayList10.add(8);
                        java.util.Collections.reverse(arrayList10);
                        yj0.a.d(liveEndNewTag3, arrayList10.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveEndNewTag3.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                        yj0.a.f(liveEndNewTag3, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View liveEndTagV33 = c21904x129eb5b3.getLiveEndTagV3();
                    if (liveEndTagV33 != null) {
                        java.util.ArrayList arrayList11 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal11 = zj0.c.f554818a;
                        arrayList11.add(8);
                        java.util.Collections.reverse(arrayList11);
                        yj0.a.d(liveEndTagV33, arrayList11.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        liveEndTagV33.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                        yj0.a.f(liveEndTagV33, "com/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$Companion", "updateLiveTag$showFeedTag", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveShareObject;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveInfoResp;Lcom/tencent/mm/ui/chatting/viewitems/ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    i95.m c27 = i95.n0.c(s40.w0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                    s40.w0.g6((s40.w0) c27, c21904x129eb5b3.getLiveTag(), Wj, false, shareObject, 4, null);
                    android.widget.TextView finderDesc2 = c21904x129eb5b3.getFinderDesc();
                    if (finderDesc2 != null) {
                        xVar.f(true, finderDesc2, shareObject);
                    }
                    if ((nw1Var == null || (co1Var2 = (r45.co1) nw1Var.m75936x14adae67(43)) == null || co1Var2.m75939xb282bd08(0) != 1) ? false : true) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w r19 = r(l71Var, shareObject);
                        i95.m c28 = i95.n0.c(vd2.i5.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
                        vd2.i5.Fb((vd2.i5) c28, r19.f287426a, c21904x129eb5b3.getFinderThumb(), r19.f287427b, null, 8, null);
                        android.widget.TextView finderBansTv5 = c21904x129eb5b3.getFinderBansTv();
                        if (finderBansTv5 != null) {
                            if (nw1Var == null || (co1Var = (r45.co1) nw1Var.m75936x14adae67(43)) == null || (str = co1Var.m75945x2fec8307(1)) == null) {
                                str = "";
                            }
                            finderBansTv5.setText(str);
                        }
                        android.widget.TextView finderBansTv6 = c21904x129eb5b3.getFinderBansTv();
                        if (finderBansTv6 != null) {
                            finderBansTv6.setVisibility(0);
                        }
                    } else {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w r27 = r(l71Var, shareObject);
                        ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Di(r27.f287426a, c21904x129eb5b3.getFinderThumb(), r27.f287427b, mn2.f1.D);
                        android.widget.TextView finderBansTv7 = c21904x129eb5b3.getFinderBansTv();
                        if (finderBansTv7 != null) {
                            finderBansTv7.setVisibility(8);
                        }
                    }
                }
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                if (l71Var != null) {
                    nw1Var2 = (r45.nw1) l71Var.m75936x14adae67(1);
                }
                ((c61.l7) b6Var).cj(nw1Var2, 4);
            } else {
                s(shareObject, nw1Var, l71Var, c21904x129eb5b3, Wj);
            }
            return true;
        }
        s(shareObject, nw1Var, l71Var, c21904x129eb5b3, Wj);
        return true;
    }
}

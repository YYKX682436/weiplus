package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class g2 implements ir2.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 f188346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f188347c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f188348d;

    public g2(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var, int i18, android.view.View view) {
        this.f188345a = i17;
        this.f188346b = h2Var;
        this.f188347c = i18;
        this.f188348d = view;
    }

    @Override // ir2.u
    public void a(java.util.List dataList) {
        r45.e21 e21Var;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        int i17 = this.f188345a;
        if (i17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2 h2Var = this.f188346b;
            if (i17 < ((java.util.ArrayList) h2Var.g().f188146e.f375624d).size()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) ((java.util.ArrayList) h2Var.g().f188146e.P6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class)).get(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = abstractC14490x69736cb5.getFeedObject();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicFeedUIContract.TopicFeedViewCallback", "onClick " + i17 + " id:" + feedObject.m59251x5db1b11() + ", pos:" + i17);
                int mediaType = feedObject.getMediaType();
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = h2Var.f190493d;
                if (mediaType != 9) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_topic_type", h2Var.f188411m);
                    if (h2Var.f188411m == 7) {
                        r45.r03 r03Var = h2Var.f188413o;
                        if (r03Var != null && (e21Var = (r45.e21) r03Var.m75936x14adae67(16)) != null) {
                            intent.putExtra("key_activity_name", e21Var.m75945x2fec8307(2));
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
                            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                                str = "";
                            }
                            intent.putExtra("key_creator_finder_name", str);
                            intent.putExtra("key_activity_id", e21Var.m75942xfb822ef2(0));
                            intent.putExtra("key_activity_inner_tab_type", h2Var.f188415q);
                            intent.putExtra("key_activity_max_top_count", e21Var.m75939xb282bd08(8));
                        }
                    } else {
                        intent.putExtra("key_topic_title", h2Var.f188412n);
                    }
                    intent.putExtra("KEY_TOPIC_ID", h2Var.f188414p);
                    intent.putExtra("KEY_CLICK_FEED_ID", feedObject.m59251x5db1b11());
                    intent.putExtra("KEY_CLICK_FEED_POSITION", i17);
                    intent.putExtra("key_ref_object_id", abstractActivityC21394xb3d2c0cf.getIntent().getLongExtra("key_ref_object_id", 0L));
                    intent.putExtra("key_ref_object_dup_flag", abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("key_ref_object_dup_flag"));
                    ir2.c1 c1Var = (ir2.c1) ((jz5.n) h2Var.g().f188146e.f375632o).mo141623x754a37bb();
                    int i18 = this.f188345a;
                    c1Var.f375653a.S6(new ir2.b1(new java.util.ArrayList(), c1Var, i18, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g30(null, c1Var.f375654b.f190023a), intent, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f2(feedObject, i18, this.f188346b, abstractC14490x69736cb5, intent, this.f188348d)));
                    return;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(feedObject.m59299x6bf53a6c(), xy2.c.e(abstractActivityC21394xb3d2c0cf))) {
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    c61.ub ubVar = (c61.ub) c17;
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = h2Var.f190493d;
                    long m59251x5db1b11 = feedObject.m59251x5db1b11();
                    java.lang.String m59276x6c285d75 = feedObject.m59276x6c285d75();
                    r45.nw1 m59258xd0557130 = feedObject.m59258xd0557130();
                    if (m59258xd0557130 == null) {
                        m59258xd0557130 = new r45.nw1();
                    }
                    c61.ub.Rf(ubVar, abstractActivityC21394xb3d2c0cf2, m59251x5db1b11, m59276x6c285d75, m59258xd0557130, null, null, null, null, feedObject.m59240x7c94657b().m76829x97edf6c0(), null, null, 1776, null);
                    return;
                }
                i95.m c18 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb.s3((zy2.zb) c18, abstractC14490x69736cb5, this.f188347c, ml2.x1.f409740n, "59", null, null, 48, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(abstractActivityC21394xb3d2c0cf).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                int m75939xb282bd08 = nyVar != null ? nyVar.V6().m75939xb282bd08(5) : 0;
                ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
                java.util.List list = h2Var.g().f188146e.f375624d;
                if (list instanceof java.util.ArrayList) {
                    arrayList = (java.util.ArrayList) list;
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                    while (it.hasNext()) {
                        arrayList2.add((so2.j5) it.next());
                    }
                    arrayList = arrayList2;
                }
                jz5.l Ai = ((vd2.f1) e0Var).Ai(arrayList, abstractC14490x69736cb5);
                java.util.List list2 = (java.util.List) Ai.f384366d;
                int intValue = ((java.lang.Number) Ai.f384367e).intValue();
                r45.wk0 wk0Var = new r45.wk0();
                wk0Var.set(0, "");
                wk0Var.set(1, "");
                wk0Var.set(2, java.lang.Boolean.FALSE);
                wk0Var.set(3, java.lang.Integer.valueOf(h2Var.f188411m));
                wk0Var.set(4, -1);
                wk0Var.set(5, -1);
                r45.y74 y74Var = new r45.y74();
                y74Var.set(1, java.lang.Integer.valueOf(m75939xb282bd08));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2 = abstractC14490x69736cb5.getFeedObject();
                if (feedObject2 == null || (str2 = feedObject2.m59273x80025a04()) == null) {
                    str2 = "";
                }
                y74Var.set(2, str2);
                wk0Var.set(6, y74Var);
                ss5.e0 e0Var2 = (ss5.e0) i95.n0.c(ss5.e0.class);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                ((vd2.f1) e0Var2).Ni(context, new android.content.Intent(), list2, intValue, wk0Var, null);
            }
        }
    }
}

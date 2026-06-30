package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class g2 implements ir2.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.h2 f106813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f106814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f106815d;

    public g2(int i17, com.tencent.mm.plugin.finder.feed.h2 h2Var, int i18, android.view.View view) {
        this.f106812a = i17;
        this.f106813b = h2Var;
        this.f106814c = i18;
        this.f106815d = view;
    }

    @Override // ir2.u
    public void a(java.util.List dataList) {
        r45.e21 e21Var;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(dataList, "dataList");
        int i17 = this.f106812a;
        if (i17 >= 0) {
            com.tencent.mm.plugin.finder.feed.h2 h2Var = this.f106813b;
            if (i17 < ((java.util.ArrayList) h2Var.g().f106613e.f294091d).size()) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) ((java.util.ArrayList) h2Var.g().f106613e.P6(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class)).get(i17);
                com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed.getFeedObject();
                com.tencent.mars.xlog.Log.i("Finder.FinderTopicFeedUIContract.TopicFeedViewCallback", "onClick " + i17 + " id:" + feedObject.getId() + ", pos:" + i17);
                int mediaType = feedObject.getMediaType();
                com.tencent.mm.ui.MMActivity mMActivity = h2Var.f108960d;
                if (mediaType != 9) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_topic_type", h2Var.f106878m);
                    if (h2Var.f106878m == 7) {
                        r45.r03 r03Var = h2Var.f106880o;
                        if (r03Var != null && (e21Var = (r45.e21) r03Var.getCustom(16)) != null) {
                            intent.putExtra("key_activity_name", e21Var.getString(2));
                            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
                            if (finderContact == null || (str = finderContact.getUsername()) == null) {
                                str = "";
                            }
                            intent.putExtra("key_creator_finder_name", str);
                            intent.putExtra("key_activity_id", e21Var.getLong(0));
                            intent.putExtra("key_activity_inner_tab_type", h2Var.f106882q);
                            intent.putExtra("key_activity_max_top_count", e21Var.getInteger(8));
                        }
                    } else {
                        intent.putExtra("key_topic_title", h2Var.f106879n);
                    }
                    intent.putExtra("KEY_TOPIC_ID", h2Var.f106881p);
                    intent.putExtra("KEY_CLICK_FEED_ID", feedObject.getId());
                    intent.putExtra("KEY_CLICK_FEED_POSITION", i17);
                    intent.putExtra("key_ref_object_id", mMActivity.getIntent().getLongExtra("key_ref_object_id", 0L));
                    intent.putExtra("key_ref_object_dup_flag", mMActivity.getIntent().getStringExtra("key_ref_object_dup_flag"));
                    ir2.c1 c1Var = (ir2.c1) ((jz5.n) h2Var.g().f106613e.f294099o).getValue();
                    int i18 = this.f106812a;
                    c1Var.f294120a.S6(new ir2.b1(new java.util.ArrayList(), c1Var, i18, new com.tencent.mm.plugin.finder.feed.g30(null, c1Var.f294121b.f108490a), intent, new com.tencent.mm.plugin.finder.feed.f2(feedObject, i18, this.f106813b, baseFinderFeed, intent, this.f106815d)));
                    return;
                }
                if (com.tencent.mm.sdk.platformtools.t8.D0(feedObject.getUserName(), xy2.c.e(mMActivity))) {
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    c61.ub ubVar = (c61.ub) c17;
                    com.tencent.mm.ui.MMActivity mMActivity2 = h2Var.f108960d;
                    long id6 = feedObject.getId();
                    java.lang.String objectNonceId = feedObject.getObjectNonceId();
                    r45.nw1 liveInfo = feedObject.getLiveInfo();
                    if (liveInfo == null) {
                        liveInfo = new r45.nw1();
                    }
                    c61.ub.Rf(ubVar, mMActivity2, id6, objectNonceId, liveInfo, null, null, null, null, feedObject.getFinderObject().getSessionBuffer(), null, null, 1776, null);
                    return;
                }
                i95.m c18 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb.s3((zy2.zb) c18, baseFinderFeed, this.f106814c, ml2.x1.f328207n, "59", null, null, 48, null);
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                int integer = nyVar != null ? nyVar.V6().getInteger(5) : 0;
                ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
                java.util.List list = h2Var.g().f106613e.f294091d;
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
                jz5.l Ai = ((vd2.f1) e0Var).Ai(arrayList, baseFinderFeed);
                java.util.List list2 = (java.util.List) Ai.f302833d;
                int intValue = ((java.lang.Number) Ai.f302834e).intValue();
                r45.wk0 wk0Var = new r45.wk0();
                wk0Var.set(0, "");
                wk0Var.set(1, "");
                wk0Var.set(2, java.lang.Boolean.FALSE);
                wk0Var.set(3, java.lang.Integer.valueOf(h2Var.f106878m));
                wk0Var.set(4, -1);
                wk0Var.set(5, -1);
                r45.y74 y74Var = new r45.y74();
                y74Var.set(1, java.lang.Integer.valueOf(integer));
                com.tencent.mm.plugin.finder.storage.FinderItem feedObject2 = baseFinderFeed.getFeedObject();
                if (feedObject2 == null || (str2 = feedObject2.getNickName()) == null) {
                    str2 = "";
                }
                y74Var.set(2, str2);
                wk0Var.set(6, y74Var);
                ss5.e0 e0Var2 = (ss5.e0) i95.n0.c(ss5.e0.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                ((vd2.f1) e0Var2).Ni(context, new android.content.Intent(), list2, intValue, wk0Var, null);
            }
        }
    }
}

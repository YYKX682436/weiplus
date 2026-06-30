package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ta extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xa f109049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f109050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f109051f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f109052g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(com.tencent.mm.plugin.finder.feed.xa xaVar, so2.j5 j5Var, android.view.View view, long j17) {
        super(2);
        this.f109049d = xaVar;
        this.f109050e = j5Var;
        this.f109051f = view;
        this.f109052g = j17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String nickName;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) this.f109050e;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = intent;
        com.tencent.mm.plugin.finder.feed.xa xaVar = this.f109049d;
        xaVar.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.D0(baseFinderFeed.getFeedObject().getUserName(), xy2.c.e(xaVar.f106174d))) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.ub ubVar = (c61.ub) c17;
            com.tencent.mm.ui.MMActivity mMActivity = xaVar.f106174d;
            long id6 = baseFinderFeed.getFeedObject().getId();
            java.lang.String objectNonceId = baseFinderFeed.getFeedObject().getObjectNonceId();
            r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
            if (liveInfo == null) {
                liveInfo = new r45.nw1();
            }
            c61.ub.Rf(ubVar, mMActivity, id6, objectNonceId, liveInfo, null, null, null, null, baseFinderFeed.g0(), null, null, 1776, null);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(baseFinderFeed);
            intent2.putExtra("CURRENT_FEED_ID", baseFinderFeed.getFeedObject().getFeedObject().getId());
            intent2.putExtra("LAUNCH_WITH_ANIM", booleanValue);
            jz5.l Ai = ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ai(arrayList, baseFinderFeed);
            java.util.List list = (java.util.List) Ai.f302833d;
            int intValue = ((java.lang.Number) Ai.f302834e).intValue();
            r45.wk0 wk0Var = new r45.wk0();
            java.lang.String str = "";
            wk0Var.set(0, "");
            wk0Var.set(1, "");
            wk0Var.set(2, java.lang.Boolean.FALSE);
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            r45.y74 y74Var = new r45.y74();
            y74Var.set(1, java.lang.Integer.valueOf(xaVar.f106175e));
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed.getFeedObject();
            if (feedObject != null && (nickName = feedObject.getNickName()) != null) {
                str = nickName;
            }
            y74Var.set(2, str);
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject2 = baseFinderFeed.getFeedObject();
            y74Var.set(5, feedObject2 != null ? feedObject2.getFeedObject() : null);
            wk0Var.set(6, y74Var);
            r45.ta4 ta4Var = new r45.ta4();
            java.util.LinkedList list2 = ta4Var.getList(20);
            r45.qa4 qa4Var = new r45.qa4();
            qa4Var.set(0, "UserClick");
            qa4Var.set(1, java.lang.Long.valueOf(this.f109052g));
            list2.add(qa4Var);
            wk0Var.set(7, ta4Var);
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(xaVar.f106174d, intent2, list, intValue, wk0Var, null);
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class w6 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f102653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f102654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102655f;

    public w6(android.os.Bundle bundle, androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f102653d = bundle;
        this.f102654e = appCompatActivity;
        this.f102655f = baseFinderFeed;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f102655f;
        androidx.appcompat.app.AppCompatActivity activity = this.f102654e;
        if (i18 != -1) {
            kotlin.jvm.internal.o.g(activity, "activity");
            java.lang.Object a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
            if (e27 != null) {
                e27.a(new ec2.a(4, feed.getFeedObject().getExpectId(), feed.getFeedObject().getDupFlag()));
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", "4");
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328362m, jSONObject.toString(), null, 4, null);
            return;
        }
        android.os.Bundle bundle = this.f102653d;
        if ((bundle != null ? bundle.getInt("FinderLiveShareExtraScene") : 0) == 1) {
            db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.f490521xh));
        } else {
            db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.f490560yi));
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.Object a18 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        ec2.d e28 = zy2.ra.e2((zy2.ra) a18, 0, 1, null);
        if (e28 != null) {
            e28.a(new ec2.a(2, feed.getFeedObject().getExpectId(), feed.getFeedObject().getDupFlag()));
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", "2");
        i95.m c18 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.y6((zy2.zb) c18, ml2.z4.f328362m, jSONObject2.toString(), null, 4, null);
        kotlin.jvm.internal.o.g(feed, "feed");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.vd6 vd6Var = new r45.vd6();
        vd6Var.set(0, java.lang.Long.valueOf(feed.getFeedObject().getId()));
        vd6Var.set(28, feed.w());
        vd6Var.set(4, feed.getFeedObject().getObjectNonceId());
        r45.q25 q25Var = new r45.q25();
        q25Var.set(18, 1);
        q25Var.set(7, 1);
        vd6Var.set(3, q25Var);
        java.lang.String sessionBuffer = feed.getFeedObject().getFeedObject().getSessionBuffer();
        if (sessionBuffer == null) {
            sessionBuffer = "";
        }
        vd6Var.set(8, sessionBuffer);
        vd6Var.set(5, feed.getFeedObject().getUserName());
        vd6Var.set(10, 65);
        r45.nw1 liveInfo = feed.getFeedObject().getLiveInfo();
        vd6Var.set(19, java.lang.Long.valueOf(liveInfo != null ? liveInfo.getLong(0) : 0L));
        linkedList.add(vd6Var);
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, 65);
        new db2.y2(linkedList, qt2Var).l().H(new com.tencent.mm.plugin.finder.assist.d6(linkedList));
    }
}

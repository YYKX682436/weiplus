package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class w6 implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f184186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f184187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f184188f;

    public w6(android.os.Bundle bundle, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f184186d = bundle;
        this.f184187e = activityC0065xcd7aa112;
        this.f184188f = abstractC14490x69736cb5;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = this.f184188f;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f184187e;
        if (i18 != -1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            java.lang.Object a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
            if (e27 != null) {
                e27.a(new ec2.a(4, feed.getFeedObject().m59233x87980ca(), feed.getFeedObject().m59229xb5af1dd5()));
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", "4");
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f409895m, jSONObject.toString(), null, 4, null);
            return;
        }
        android.os.Bundle bundle = this.f184186d;
        if ((bundle != null ? bundle.getInt("FinderLiveShareExtraScene") : 0) == 1) {
            db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572054xh));
        } else {
            db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.Object a18 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        ec2.d e28 = zy2.ra.e2((zy2.ra) a18, 0, 1, null);
        if (e28 != null) {
            e28.a(new ec2.a(2, feed.getFeedObject().m59233x87980ca(), feed.getFeedObject().m59229xb5af1dd5()));
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", "2");
        i95.m c18 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.zb.y6((zy2.zb) c18, ml2.z4.f409895m, jSONObject2.toString(), null, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.vd6 vd6Var = new r45.vd6();
        vd6Var.set(0, java.lang.Long.valueOf(feed.getFeedObject().m59251x5db1b11()));
        vd6Var.set(28, feed.w());
        vd6Var.set(4, feed.getFeedObject().m59276x6c285d75());
        r45.q25 q25Var = new r45.q25();
        q25Var.set(18, 1);
        q25Var.set(7, 1);
        vd6Var.set(3, q25Var);
        java.lang.String m76829x97edf6c0 = feed.getFeedObject().getFeedObject().m76829x97edf6c0();
        if (m76829x97edf6c0 == null) {
            m76829x97edf6c0 = "";
        }
        vd6Var.set(8, m76829x97edf6c0);
        vd6Var.set(5, feed.getFeedObject().m59299x6bf53a6c());
        vd6Var.set(10, 65);
        r45.nw1 m59258xd0557130 = feed.getFeedObject().m59258xd0557130();
        vd6Var.set(19, java.lang.Long.valueOf(m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L));
        linkedList.add(vd6Var);
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, 65);
        new db2.y2(linkedList, qt2Var).l().H(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d6(linkedList));
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class t8 {
    public t8(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.f185889x0 > 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h4.f183754a.d(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.f185889x0, 14.0f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "getRecommendTvMaxWords realMaxRecommendTvWidth=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.f185889x0 + '!');
        return 0;
    }

    public final java.util.Map b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        if (c14994x9b99c079 == null) {
            return null;
        }
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(c14994x9b99c079.getFeedObject().m76784x5db1b11()));
        lVarArr[1] = new jz5.l("session_buffer", c14994x9b99c079.getFeedObject().m76829x97edf6c0());
        lVarArr[2] = new jz5.l("finder_username", c14994x9b99c079.getFeedObject().m76836x6c03c64c());
        lVarArr[3] = new jz5.l("media_type", java.lang.Integer.valueOf(c14994x9b99c079.getMediaType()));
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(c14994x9b99c079.m59264x7efe73ec());
        lVarArr[4] = new jz5.l("video_duration_time", java.lang.String.valueOf(mb4Var != null ? mb4Var.m75939xb282bd08(3) : 0));
        long j17 = c14994x9b99c079.f66939xc8a07680;
        if (j17 == 0) {
            j17 = c14994x9b99c079.m59260x51f8f5b0();
        }
        lVarArr[5] = new jz5.l("long_video_id", pm0.v.u(j17));
        lVarArr[6] = new jz5.l("feed_display_type", "1");
        return kz5.c1.k(lVarArr);
    }

    public final void c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.Object a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
        if (e27 != null) {
            ya2.b2 contact = item.getContact();
            boolean z18 = contact != null && contact.f69325xed074063 == 1;
            if (z17) {
                ec2.a aVar = new ec2.a(9, item.mo2128x1ed62e84(), item.w());
                aVar.f332483h = new ec2.c(2, z18, false, 0, 0L, 0, 60, null);
                e27.a(aVar);
            } else {
                ec2.a aVar2 = new ec2.a(9, item.mo2128x1ed62e84(), item.w());
                aVar2.f332483h = new ec2.c(1, z18, false, 0, 0L, 0, 60, null);
                e27.a(aVar2);
            }
        }
    }
}

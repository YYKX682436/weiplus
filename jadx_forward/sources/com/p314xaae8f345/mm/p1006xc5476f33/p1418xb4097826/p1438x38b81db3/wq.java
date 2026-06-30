package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class wq {
    public wq(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.Map a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5 feed) {
        java.lang.String str;
        r45.it4 it4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("drama_id", pm0.v.u(feed.f189326e));
        java.lang.Integer num = feed.f189330i;
        if (num == null || (str = num.toString()) == null) {
            str = "0";
        }
        lVarArr[1] = new jz5.l("drama_rec_reason", str);
        lVarArr[2] = new jz5.l("drama_type", feed.f189329h);
        r45.jt4 jt4Var = feed.f189325d;
        lVarArr[3] = new jz5.l("drama_tab_sessionid", pm0.v.u(jt4Var.m75942xfb822ef2(2)));
        java.lang.Long l17 = feed.f189332n;
        lVarArr[4] = new jz5.l("feed_id", pm0.v.u(l17 != null ? l17.longValue() : 0L));
        java.lang.String str2 = feed.f189333o;
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[5] = new jz5.l("drama_session_buffer", str2);
        r45.uj2 uj2Var = (r45.uj2) jt4Var.m75936x14adae67(1);
        lVarArr[6] = new jz5.l("session_buffer", (uj2Var == null || (it4Var = (r45.it4) uj2Var.m75936x14adae67(13)) == null) ? null : it4Var.m75945x2fec8307(2));
        return kz5.c1.k(lVarArr);
    }
}

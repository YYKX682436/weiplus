package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class wq {
    public wq(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.Map a(com.tencent.mm.plugin.finder.feed.model.d5 feed) {
        java.lang.String str;
        r45.it4 it4Var;
        kotlin.jvm.internal.o.g(feed, "feed");
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("drama_id", pm0.v.u(feed.f107793e));
        java.lang.Integer num = feed.f107797i;
        if (num == null || (str = num.toString()) == null) {
            str = "0";
        }
        lVarArr[1] = new jz5.l("drama_rec_reason", str);
        lVarArr[2] = new jz5.l("drama_type", feed.f107796h);
        r45.jt4 jt4Var = feed.f107792d;
        lVarArr[3] = new jz5.l("drama_tab_sessionid", pm0.v.u(jt4Var.getLong(2)));
        java.lang.Long l17 = feed.f107799n;
        lVarArr[4] = new jz5.l("feed_id", pm0.v.u(l17 != null ? l17.longValue() : 0L));
        java.lang.String str2 = feed.f107800o;
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[5] = new jz5.l("drama_session_buffer", str2);
        r45.uj2 uj2Var = (r45.uj2) jt4Var.getCustom(1);
        lVarArr[6] = new jz5.l("session_buffer", (uj2Var == null || (it4Var = (r45.it4) uj2Var.getCustom(13)) == null) ? null : it4Var.getString(2));
        return kz5.c1.k(lVarArr);
    }
}

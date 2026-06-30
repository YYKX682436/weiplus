package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class j2 {
    public j2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(wp2.b item, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String str = item.f529919r;
        java.lang.String str2 = str == null ? "" : str;
        r45.mb4 mb4Var = item.getFeedObject().m59311x25315bf4() ? (r45.mb4) kz5.n0.Z(item.getFeedObject().m59259x7dea7760()) : (r45.mb4) kz5.n0.Z(item.getFeedObject().m59264x7efe73ec());
        if (mb4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LivingConvert", "preloadCover: mediaObj is null, feedId=" + item.getFeedObject().getFeedObject().m76784x5db1b11() + ", skip preload");
            return;
        }
        if (str2.length() == 0) {
            str2 = zl2.q4.f555466a.y(mb4Var, 1);
            if (!(str2.length() > 0)) {
                if (str == null) {
                    java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(16);
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(20);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = "";
                    }
                    str = m75945x2fec8307.concat(m75945x2fec83072);
                }
                str2 = str;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mb4Var.m75945x2fec8307(1));
            java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(19);
            sb6.append(m75945x2fec83073 != null ? m75945x2fec83073 : "");
            str2 = sb6.toString();
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        g1Var.e().b(new mn2.q3(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), z17 ? g1Var.h(mn2.f1.f411501v) : g1Var.h(mn2.f1.f411486d)).a();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

@j95.b
/* loaded from: classes8.dex */
public final class la extends i95.w implements o72.a5 {
    public r45.tq0 Ai(java.lang.String sourceId) {
        r45.bq0 bq0Var;
        r45.tq0 tq0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceId, "sourceId");
        o72.r2 rc6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().rc(sourceId);
        if (rc6 == null || (bq0Var = rc6.f67640x5ab01132) == null || (tq0Var = bq0Var.f452501m) == null) {
            return null;
        }
        return tq0Var;
    }

    public java.lang.String Bi(int i17) {
        if (i17 <= 1) {
            return "";
        }
        java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.cdw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
        java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format.concat(" ");
    }

    public int wi(java.lang.String sourceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceId, "sourceId");
        o72.r2 rc6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().rc(sourceId);
        if (rc6 != null) {
            return rc6.f67643xc8a07680;
        }
        return -1;
    }
}

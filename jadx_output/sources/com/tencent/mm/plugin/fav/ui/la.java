package com.tencent.mm.plugin.fav.ui;

@j95.b
/* loaded from: classes8.dex */
public final class la extends i95.w implements o72.a5 {
    public r45.tq0 Ai(java.lang.String sourceId) {
        r45.bq0 bq0Var;
        r45.tq0 tq0Var;
        kotlin.jvm.internal.o.g(sourceId, "sourceId");
        o72.r2 rc6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().rc(sourceId);
        if (rc6 == null || (bq0Var = rc6.field_favProto) == null || (tq0Var = bq0Var.f370968m) == null) {
            return null;
        }
        return tq0Var;
    }

    public java.lang.String Bi(int i17) {
        if (i17 <= 1) {
            return "";
        }
        java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.cdw);
        kotlin.jvm.internal.o.d(r17);
        java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format.concat(" ");
    }

    public int wi(java.lang.String sourceId) {
        kotlin.jvm.internal.o.g(sourceId, "sourceId");
        o72.r2 rc6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().rc(sourceId);
        if (rc6 != null) {
            return rc6.field_id;
        }
        return -1;
    }
}

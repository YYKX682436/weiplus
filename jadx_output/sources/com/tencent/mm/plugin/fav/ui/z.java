package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final o72.r2 f101635d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct f101636e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f101637f;

    public z(o72.r2 r2Var, com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct favAddQualityStruct, java.lang.String str) {
        this.f101635d = r2Var;
        this.f101636e = favAddQualityStruct;
        this.f101637f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.util.List r37, o72.r2 r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.z.a(java.util.List, o72.r2, java.lang.String):boolean");
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        o72.r2 r2Var = this.f101635d;
        java.lang.Object[] objArr = {java.lang.Long.valueOf(r2Var.field_localId), java.lang.Thread.currentThread().getName()};
        java.lang.String str = this.f101637f;
        o72.s2.g("MicroMsg.Fav.FavAddService", str, "CopyRunnable START: localId=%d, thread=%s", objArr);
        java.util.LinkedList linkedList = r2Var.field_favProto.f370964f;
        if (linkedList.size() > 0) {
            int size = linkedList.size();
            o72.s2.d(str, "Processing data files: count=%d", java.lang.Integer.valueOf(size));
            boolean z17 = false;
            if (r2Var.field_type == 18 && r2Var.field_sourceType == 6) {
                boolean z18 = false;
                for (int i17 = 0; i17 < size; i17++) {
                    r45.gp0 gp0Var = (r45.gp0) linkedList.get(i17);
                    if (!gp0Var.B1 || !gp0Var.D1) {
                        z18 = true;
                    }
                }
                z17 = z18;
            } else if (a(linkedList, r2Var, str)) {
                z17 = true;
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavAddService", "run addfavservice copyrunable info.field_type = %d, needCheckCdn=%s", java.lang.Integer.valueOf(r2Var.field_type), java.lang.Boolean.valueOf(z17));
            o72.s2.g("MicroMsg.Fav.FavAddService", str, "File copy completed: localId=%d, needCheckCdn=%b, costTime=%dms", java.lang.Long.valueOf(r2Var.field_localId), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(currentTimeMillis2));
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.y(this, z17));
        }
    }
}

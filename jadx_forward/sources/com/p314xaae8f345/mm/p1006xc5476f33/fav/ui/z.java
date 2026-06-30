package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final o72.r2 f183168d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae f183169e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f183170f;

    public z(o72.r2 r2Var, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae c6437x6cfac3ae, java.lang.String str) {
        this.f183168d = r2Var;
        this.f183169e = c6437x6cfac3ae;
        this.f183170f = str;
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z.a(java.util.List, o72.r2, java.lang.String):boolean");
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        o72.r2 r2Var = this.f183168d;
        java.lang.Object[] objArr = {java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Thread.currentThread().getName()};
        java.lang.String str = this.f183170f;
        o72.s2.g("MicroMsg.Fav.FavAddService", str, "CopyRunnable START: localId=%d, thread=%s", objArr);
        java.util.LinkedList linkedList = r2Var.f67640x5ab01132.f452497f;
        if (linkedList.size() > 0) {
            int size = linkedList.size();
            o72.s2.d(str, "Processing data files: count=%d", java.lang.Integer.valueOf(size));
            boolean z17 = false;
            if (r2Var.f67657x2262335f == 18 && r2Var.f67651x76e81a5a == 6) {
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavAddService", "run addfavservice copyrunable info.field_type = %d, needCheckCdn=%s", java.lang.Integer.valueOf(r2Var.f67657x2262335f), java.lang.Boolean.valueOf(z17));
            o72.s2.g("MicroMsg.Fav.FavAddService", str, "File copy completed: localId=%d, needCheckCdn=%b, costTime=%dms", java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(currentTimeMillis2));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y(this, z17));
        }
    }
}

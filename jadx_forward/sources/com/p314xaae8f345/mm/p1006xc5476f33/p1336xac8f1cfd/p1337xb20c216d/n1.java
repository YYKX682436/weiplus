package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f178148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 f178149e;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1, java.util.ArrayList arrayList) {
        this.f178149e = abstractActivityC13156x6363e8e1;
        this.f178148d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1;
        int i17;
        int i18;
        int i19;
        int i27;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i28 = 0;
        while (true) {
            java.util.ArrayList arrayList2 = this.f178148d;
            int size = arrayList2.size();
            abstractActivityC13156x6363e8e1 = this.f178149e;
            if (i28 >= size) {
                break;
            }
            java.lang.String str = (java.lang.String) arrayList2.get(i28);
            ix1.j jVar = new ix1.j();
            jVar.f376861q = true;
            jVar.f376860p = 2;
            jVar.f376856l = nx1.d.q().k();
            jVar.f376844a = hx1.b.a(jVar.toString(), 18);
            abstractActivityC13156x6363e8e1.f178049z = new r45.gp0();
            abstractActivityC13156x6363e8e1.f178049z.h0(2);
            abstractActivityC13156x6363e8e1.f178049z.e0(jVar.f376844a);
            r45.gp0 gp0Var = abstractActivityC13156x6363e8e1.f178049z;
            jVar.f376858n = gp0Var;
            java.lang.String c17 = hx1.b.c(gp0Var);
            kk.j jVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.f178170a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                c17 = o72.p5.c() + "/" + (kk.k.g((str + java.lang.System.currentTimeMillis()).getBytes()) + "_HD");
            }
            if (!com.p314xaae8f345.mm.vfs.w6.j(c17)) {
                android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
                if (n07 == null || (i17 = n07.outWidth) <= 0 || (i18 = n07.outHeight) <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EditorUtil", "GetImageOptions Error");
                    c17 = null;
                } else {
                    int i29 = i17 > 1280 ? 1280 : i17;
                    int i37 = i18 <= 1280 ? i18 : 1280;
                    if (i18 >= i17) {
                        int i38 = i29;
                        i29 = i37;
                        i37 = i38;
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.d(str) > 0) {
                        int i39 = n07.outHeight;
                        i19 = n07.outWidth;
                        i27 = i39;
                    } else {
                        i19 = i37;
                        i27 = i29;
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.x(str, i27, i19, android.graphics.Bitmap.CompressFormat.JPEG, 95, c17, true);
                }
            }
            jVar.f376855s = c17;
            jVar.f376862r = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.c(c17, hx1.b.e(abstractActivityC13156x6363e8e1.f178049z));
            jVar.f376859o = com.p314xaae8f345.mm.vfs.w6.k(jVar.f376855s);
            arrayList.add(jVar);
            i28++;
        }
        android.app.ProgressDialog progressDialog = abstractActivityC13156x6363e8e1.f178048y;
        if (progressDialog == null || !progressDialog.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "user canceled");
            return;
        }
        if (nx1.d.q().e(arrayList)) {
            abstractActivityC13156x6363e8e1.f7();
        } else {
            nx1.d.q().s(arrayList, abstractActivityC13156x6363e8e1.f178036m.c(), true, true, false, true, false);
        }
        abstractActivityC13156x6363e8e1.k7(true, 100L);
        abstractActivityC13156x6363e8e1.j7(1, 0L);
    }
}

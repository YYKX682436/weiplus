package iz0;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f377575d;

    public a(long j17) {
        this.f377575d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iz0.d dVar = iz0.d.f377577a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f377575d;
        l75.k0 a17 = dVar.a();
        p75.i0 i17 = dm.ib.f319203y.i();
        i17.f434189c = "MicroMsg.TemplateBackgroundVideoInfoStorageManager";
        i17.f434190d = dm.ib.A.i(0).c(dm.ib.B.x(java.lang.Long.valueOf(currentTimeMillis - j17)));
        java.util.List<dm.ib> k17 = i17.a().k(a17, dm.ib.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundVideoInfoStorageManager", "getWorkSuccessFinish >> size: " + ((java.util.ArrayList) k17).size() + ", " + j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundStorageClearManager", "startClear >> " + java.lang.Thread.currentThread().getName() + ", size: " + ((java.util.ArrayList) k17).size() + ", " + j17);
        for (dm.ib ibVar : k17) {
            java.lang.String str = ibVar.f67021x3882660c;
            boolean g17 = com.p314xaae8f345.mm.vfs.w6.g(str, true);
            if (g17) {
                java.lang.String field_work_id = ibVar.f67036xcf7ab2c4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_work_id, "field_work_id");
                l75.k0 a18 = dVar.a();
                p75.m0 j18 = dm.ib.f319204z.j(field_work_id);
                p75.n0 n0Var = dm.ib.f319203y;
                n0Var.getClass();
                if (n0Var instanceof p75.z) {
                    throw new java.lang.IllegalArgumentException("Not support multi table delete");
                }
                java.lang.String table = n0Var.b();
                p75.h hVar = (p75.h) j18;
                java.lang.String b17 = hVar.b();
                java.lang.String[] e17 = hVar.e();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundVideoInfoStorageManager", "deleteVideoInfoByWorkTagId >> workTagId: " + field_work_id + ", result: " + (a18.mo70514xb06685ab(table, b17, e17) != -1));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundStorageClearManager", "clipBundlePath: " + str + ", workId:" + ibVar.f67036xcf7ab2c4 + ", result: " + g17);
        }
    }
}

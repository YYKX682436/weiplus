package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes5.dex */
public final class a2 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f175717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f175718b;

    public a2(long j17, yz5.a aVar) {
        this.f175717a = j17;
        this.f175718b = aVar;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).z(8, 30, 0, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c2 c2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c2.f175736a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebImagePreloadLogic", "ImageLoader net downLoad start: url = " + str);
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if ((bVar != null ? bVar.f441066c : null) != null) {
            zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
            long j17 = this.f175717a;
            int i17 = (int) (currentTimeMillis - j17);
            byte[] bArr = bVar.f441066c;
            ((yq1.z) a0Var).z(8, 31, i17, bArr != null ? bArr.length : 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c2 c2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c2.f175736a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ImageLoader net download finish: url = %s, duration = ");
            sb6.append(currentTimeMillis - j17);
            sb6.append(", size = ");
            sb6.append(bVar.f441066c != null ? r12.length : 0L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebImagePreloadLogic", sb6.toString(), str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c2 c2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c2.f175736a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebImagePreloadLogic", "ImageLoader getImage finish: url = " + str);
        yz5.a aVar = this.f175718b;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}

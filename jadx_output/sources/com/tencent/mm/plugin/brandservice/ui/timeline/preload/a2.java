package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes5.dex */
public final class a2 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f94184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f94185b;

    public a2(long j17, yz5.a aVar) {
        this.f94184a = j17;
        this.f94185b = aVar;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).z(8, 30, 0, 0);
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.c2 c2Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.c2.f94203a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebImagePreloadLogic", "ImageLoader net downLoad start: url = " + str);
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if ((bVar != null ? bVar.f359533c : null) != null) {
            zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
            long j17 = this.f94184a;
            int i17 = (int) (currentTimeMillis - j17);
            byte[] bArr = bVar.f359533c;
            ((yq1.z) a0Var).z(8, 31, i17, bArr != null ? bArr.length : 0);
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.c2 c2Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.c2.f94203a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ImageLoader net download finish: url = %s, duration = ");
            sb6.append(currentTimeMillis - j17);
            sb6.append(", size = ");
            sb6.append(bVar.f359533c != null ? r12.length : 0L);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebImagePreloadLogic", sb6.toString(), str);
        }
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.c2 c2Var2 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.c2.f94203a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebImagePreloadLogic", "ImageLoader getImage finish: url = " + str);
        yz5.a aVar = this.f94185b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}

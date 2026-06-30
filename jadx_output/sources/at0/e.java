package at0;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at0.n f13565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f13566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rs0.a f13567f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f13568g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f13569h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f13570i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f13571m;

    public e(at0.n nVar, kotlin.jvm.internal.h0 h0Var, rs0.a aVar, kotlin.jvm.internal.h0 h0Var2, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.h0 h0Var3, yz5.l lVar) {
        this.f13565d = nVar;
        this.f13566e = h0Var;
        this.f13567f = aVar;
        this.f13568g = h0Var2;
        this.f13569h = f0Var;
        this.f13570i = h0Var3;
        this.f13571m = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sight.base.b d17;
        if (this.f13565d.f13608p) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopRecord ");
        ht0.b bVar = (ht0.b) this.f13566e.f310123d;
        sb6.append(bVar != null ? bVar.getFilePath() : null);
        sb6.append(' ');
        ht0.b bVar2 = (ht0.b) this.f13566e.f310123d;
        sb6.append(bVar2 != null ? bVar2.b() : null);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewContainer", sb6.toString(), new java.lang.Object[0]);
        this.f13567f.a();
        this.f13565d.g("HighRecordStopWaitTime", java.lang.Long.valueOf(this.f13567f.f399288b.a()));
        ht0.b bVar3 = (ht0.b) this.f13566e.f310123d;
        java.lang.String filePath = bVar3 != null ? bVar3.getFilePath() : null;
        ht0.b bVar4 = (ht0.b) this.f13566e.f310123d;
        java.lang.String b17 = bVar4 != null ? bVar4.b() : null;
        if (filePath == null || b17 == null || (d17 = com.tencent.mm.plugin.sight.base.e.d(filePath, true)) == null) {
            return;
        }
        kotlin.jvm.internal.h0 h0Var = this.f13568g;
        kotlin.jvm.internal.f0 f0Var = this.f13569h;
        at0.n nVar = this.f13565d;
        kotlin.jvm.internal.h0 h0Var2 = this.f13570i;
        yz5.l lVar = this.f13571m;
        ct0.b bVar5 = (ct0.b) h0Var.f310123d;
        bVar5.f222206c = true;
        bVar5.getClass();
        bVar5.f222204a = filePath;
        ct0.b bVar6 = (ct0.b) h0Var.f310123d;
        bVar6.getClass();
        bVar6.f222205b = b17;
        ct0.b bVar7 = (ct0.b) h0Var.f310123d;
        bVar7.f222207d = 0;
        bVar7.f222208e = d17.f162382a;
        f0Var.f310116d++;
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", "record video info main: " + d17);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(985L, 169L, 1L, false);
        g0Var.idkeyStat(985L, 168L, d17.f162383b, false);
        g0Var.idkeyStat(985L, 170L, d17.f162386e, false);
        if (!(nVar.f13593a.j() && f0Var.f310116d == 2) && nVar.f13593a.j()) {
            com.tencent.mm.sdk.platformtools.u3.i((java.lang.Runnable) h0Var2.f310123d, 3000L);
            return;
        }
        if (nVar.f13593a.j() && f0Var.f310116d == 2) {
            g0Var.idkeyStat(985L, 150L, 1L, false);
        }
        com.tencent.mm.sdk.platformtools.u3.l((java.lang.Runnable) h0Var2.f310123d);
        nVar.f13608p = true;
        if (lVar != null) {
            lVar.invoke(h0Var.f310123d);
        }
    }
}

package at0;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at0.n f13572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rs0.a f13573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f13574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f13575g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f13576h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f13577i;

    public f(at0.n nVar, rs0.a aVar, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.h0 h0Var2, yz5.l lVar) {
        this.f13572d = nVar;
        this.f13573e = aVar;
        this.f13574f = h0Var;
        this.f13575g = f0Var;
        this.f13576h = h0Var2;
        this.f13577i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sight.base.b d17;
        if (this.f13572d.f13608p) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop daemonRecorder ");
        ht0.b bVar = this.f13572d.f13596d;
        sb6.append(bVar != null ? bVar.getFilePath() : null);
        sb6.append(' ');
        ht0.b bVar2 = this.f13572d.f13596d;
        sb6.append(bVar2 != null ? bVar2.b() : null);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.CameraPreviewContainer", sb6.toString(), new java.lang.Object[0]);
        this.f13573e.a();
        this.f13572d.g("LowRecordStopWaitTime", java.lang.Long.valueOf(this.f13573e.f399288b.a()));
        ht0.b bVar3 = this.f13572d.f13596d;
        java.lang.String filePath = bVar3 != null ? bVar3.getFilePath() : null;
        ht0.b bVar4 = this.f13572d.f13596d;
        java.lang.String b17 = bVar4 != null ? bVar4.b() : null;
        if (filePath == null || b17 == null || (d17 = com.tencent.mm.plugin.sight.base.e.d(filePath, true)) == null) {
            return;
        }
        kotlin.jvm.internal.h0 h0Var = this.f13574f;
        kotlin.jvm.internal.f0 f0Var = this.f13575g;
        kotlin.jvm.internal.h0 h0Var2 = this.f13576h;
        at0.n nVar = this.f13572d;
        yz5.l lVar = this.f13577i;
        ct0.b bVar5 = (ct0.b) h0Var.f310123d;
        bVar5.f222206c = true;
        bVar5.getClass();
        bVar5.f222209f = filePath;
        ct0.b bVar6 = (ct0.b) h0Var.f310123d;
        bVar6.getClass();
        bVar6.f222210g = b17;
        ct0.b bVar7 = (ct0.b) h0Var.f310123d;
        bVar7.f222211h = 0;
        bVar7.f222212i = d17.f162382a;
        f0Var.f310116d++;
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraPreviewContainer", "record video info daemon: " + d17);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(985L, 174L, 1L, false);
        g0Var.idkeyStat(985L, 173L, d17.f162383b, false);
        g0Var.idkeyStat(985L, 175L, d17.f162386e, false);
        if (f0Var.f310116d != 2) {
            com.tencent.mm.sdk.platformtools.u3.i((java.lang.Runnable) h0Var2.f310123d, 3000L);
            return;
        }
        g0Var.idkeyStat(985L, 150L, 1L, false);
        com.tencent.mm.sdk.platformtools.u3.l((java.lang.Runnable) h0Var2.f310123d);
        nVar.f13608p = true;
        if (lVar != null) {
            lVar.invoke(h0Var.f310123d);
        }
    }
}

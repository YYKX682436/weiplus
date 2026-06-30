package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService f90720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f90721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f90722f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo f90723g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f90724h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.os.ResultReceiver f90725i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f90726m;

    public h(com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService androidWxaCommLibV8SnapshotService, com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, boolean z17, com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo, boolean z18, android.os.ResultReceiver resultReceiver, yz5.a aVar) {
        this.f90720d = androidWxaCommLibV8SnapshotService;
        this.f90721e = iCommLibReader;
        this.f90722f = z17;
        this.f90723g = wxaPkgV8SnapshotInfo;
        this.f90724h = z18;
        this.f90725i = resultReceiver;
        this.f90726m = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService androidWxaCommLibV8SnapshotService = this.f90720d;
        java.util.Set set = androidWxaCommLibV8SnapshotService.f90650d;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = this.f90721e;
        set.add(iCommLibReader);
        boolean z17 = this.f90722f;
        com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = this.f90723g;
        com.tencent.mm.plugin.appbrand.v8_snapshot.l2 l2Var = com.tencent.mm.plugin.appbrand.v8_snapshot.l2.f90769a;
        androidWxaCommLibV8SnapshotService.a(this.f90725i, z17 ? l2Var.a(iCommLibReader, wxaPkgV8SnapshotInfo) : l2Var.b(iCommLibReader, wxaPkgV8SnapshotInfo, this.f90724h));
        androidWxaCommLibV8SnapshotService.f90650d.remove(iCommLibReader);
        this.f90726m.invoke();
    }
}

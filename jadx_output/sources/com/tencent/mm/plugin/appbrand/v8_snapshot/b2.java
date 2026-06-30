package com.tencent.mm.plugin.appbrand.v8_snapshot;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public final class b2 extends i95.w implements com.tencent.mm.plugin.appbrand.v8_snapshot.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.v8_snapshot.d1 f90684d;

    public b2() {
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        this.f90684d = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90760l ? com.tencent.mm.plugin.appbrand.v8_snapshot.a2.f90682d : com.tencent.mm.plugin.appbrand.v8_snapshot.v.f90831d;
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.d1
    public void Rd(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo) {
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        this.f90684d.Rd(snapshotInfo);
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.d1
    public com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo gh(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader reader, com.tencent.mm.plugin.appbrand.v8_snapshot.l3 category) {
        kotlin.jvm.internal.o.g(reader, "reader");
        kotlin.jvm.internal.o.g(category, "category");
        return this.f90684d.gh(reader, category);
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.d1
    public void u7(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo) {
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        this.f90684d.u7(snapshotInfo);
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.d1
    public com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo w5() {
        return this.f90684d.w5();
    }
}

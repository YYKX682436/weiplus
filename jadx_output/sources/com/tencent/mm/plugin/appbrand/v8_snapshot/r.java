package com.tencent.mm.plugin.appbrand.v8_snapshot;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public final class r extends i95.w implements com.tencent.mm.plugin.appbrand.v8_snapshot.e1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.v8_snapshot.e1 f90809d;

    public r() {
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a.getClass();
        this.f90809d = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90760l ? com.tencent.mm.plugin.appbrand.v8_snapshot.f3.f90706d : com.tencent.mm.plugin.appbrand.v8_snapshot.w.f90834d;
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo O5() {
        return this.f90809d.O5();
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo S4(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader reader, com.tencent.mm.plugin.appbrand.v8_snapshot.l3 category) {
        kotlin.jvm.internal.o.g(reader, "reader");
        kotlin.jvm.internal.o.g(category, "category");
        return this.f90809d.S4(reader, category);
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public void T4(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo) {
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        this.f90809d.T4(snapshotInfo);
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public boolean Z9(java.lang.String wxaPkgPath) {
        kotlin.jvm.internal.o.g(wxaPkgPath, "wxaPkgPath");
        return this.f90809d.Z9(wxaPkgPath);
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public void ki(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo) {
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        this.f90809d.ki(snapshotInfo);
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public boolean lc(int i17) {
        return this.f90809d.lc(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public boolean o7(com.tencent.mm.vfs.r6 file) {
        kotlin.jvm.internal.o.g(file, "file");
        return this.f90809d.o7(file);
    }

    @Override // com.tencent.mm.plugin.appbrand.v8_snapshot.e1
    public void w6(com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo snapshotInfo) {
        kotlin.jvm.internal.o.g(snapshotInfo, "snapshotInfo");
        this.f90809d.w6(snapshotInfo);
    }
}

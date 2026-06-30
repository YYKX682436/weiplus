package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f81034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime f81036f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.List list, java.lang.String str, com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime) {
        super(0);
        this.f81034d = list;
        this.f81035e = str;
        this.f81036f = qualitySessionRuntime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List<jz5.l> list = this.f81034d;
        java.lang.String str = this.f81035e;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime = this.f81036f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (jz5.l lVar : list) {
            java.lang.String str2 = (java.lang.String) lVar.f302834e;
            cm.f fVar = null;
            if (str2 == null || r26.n0.N(str2)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandFileOccupationReporter", "reportOccupation: prefix = [%s] got a null path", lVar.f302833d);
            } else {
                com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct weAppFileSystemTempFileLastOccupationStatStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct();
                weAppFileSystemTempFileLastOccupationStatStruct.f62263j = 0L;
                weAppFileSystemTempFileLastOccupationStatStruct.f62257d = weAppFileSystemTempFileLastOccupationStatStruct.b("AppId", str, true);
                if (com.tencent.mm.plugin.appbrand.l.e(str) != null) {
                    weAppFileSystemTempFileLastOccupationStatStruct.f62258e = r10.f305852r.pkgVersion;
                } else {
                    weAppFileSystemTempFileLastOccupationStatStruct.f62258e = qualitySessionRuntime.f88139i;
                }
                int i17 = qualitySessionRuntime.f88136f;
                if (i17 == 1) {
                    fVar = cm.f.release;
                } else if (i17 == 2) {
                    fVar = cm.f.debug;
                } else if (i17 == 3) {
                    fVar = cm.f.demo;
                }
                weAppFileSystemTempFileLastOccupationStatStruct.f62259f = fVar;
                weAppFileSystemTempFileLastOccupationStatStruct.f62260g = qualitySessionRuntime.f88137g;
                weAppFileSystemTempFileLastOccupationStatStruct.f62261h = a06.d.c(com.tencent.mm.plugin.appbrand.appstorage.l1.c(new com.tencent.mm.vfs.r6(str2)) / 1024.0d);
                weAppFileSystemTempFileLastOccupationStatStruct.f62262i = weAppFileSystemTempFileLastOccupationStatStruct.b("DirPrefix", (java.lang.String) lVar.f302833d, true);
                fVar = weAppFileSystemTempFileLastOccupationStatStruct;
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct weAppFileSystemTempFileLastOccupationStatStruct2 = (com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct) it.next();
            if (kz5.v.f(new java.lang.String[]{"tmp", "usr", "opendata", "ad"}).contains(weAppFileSystemTempFileLastOccupationStatStruct2.f62262i)) {
                if (kotlin.jvm.internal.o.b(weAppFileSystemTempFileLastOccupationStatStruct2.f62262i, "tmp")) {
                    try {
                        weAppFileSystemTempFileLastOccupationStatStruct2.f62264k = a06.d.c(com.tencent.mm.plugin.appbrand.appstorage.l1.c(new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.appbrand.jsapi.file.l2.e())) / 1024.0d);
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandFileOccupationReporter", "reportOccupation total temp folder size: " + weAppFileSystemTempFileLastOccupationStatStruct2.f62264k);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandFileOccupationReporter", "reportOccupation total temp folder get exception:" + e17);
                    }
                }
                weAppFileSystemTempFileLastOccupationStatStruct2.k();
            }
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.r2 f90811d = new com.tencent.mm.plugin.appbrand.v8_snapshot.r2();

    public r2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        java.lang.String wxaPkgPath = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(wxaPkgPath, "wxaPkgPath");
        com.tencent.mm.plugin.appbrand.v8_snapshot.s3 i17 = com.tencent.mm.plugin.appbrand.v8_snapshot.f3.f90706d.i();
        if (i17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "deleteByWxaPkgPathAllCategory, wxaPkgPath: ".concat(wxaPkgPath));
            com.tencent.mm.plugin.appbrand.v8_snapshot.q3 q3Var = new com.tencent.mm.plugin.appbrand.v8_snapshot.q3();
            q3Var.field_arch = com.tencent.mm.plugin.appbrand.v8_snapshot.s3.f90820d;
            q3Var.field_wxaPkgPath = wxaPkgPath;
            z17 = i17.delete(q3Var, "arch", "wxaPkgPath");
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}

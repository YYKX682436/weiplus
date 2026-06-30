package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class ReportStorageSizeTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.ReportStorageSizeTask> CREATOR = new com.tencent.mm.plugin.appbrand.od();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f74877f;

    public static void B(com.tencent.mm.plugin.appbrand.ReportStorageSizeTask reportStorageSizeTask) {
        java.lang.Integer valueOf;
        long j17;
        reportStorageSizeTask.getClass();
        com.tencent.mm.plugin.appbrand.appstorage.o Bi = com.tencent.mm.plugin.appbrand.app.r9.Bi();
        if (Bi == null) {
            return;
        }
        int a17 = com.tencent.mm.plugin.appbrand.appstorage.p.f76297a.a(reportStorageSizeTask.f74877f);
        if (a17 != 1) {
            oe.a aVar = (oe.a) nd.f.a(oe.a.class);
            java.lang.String str = reportStorageSizeTask.f74877f;
            valueOf = java.lang.Integer.valueOf(((com.tencent.mm.plugin.appbrand.luggage.customize.b) aVar).b(str, a17, w81.a.f443806a.a(str, gm0.j1.b().h())).K(reportStorageSizeTask.f74877f));
        } else {
            valueOf = java.lang.Integer.valueOf(Bi.K(reportStorageSizeTask.f74877f));
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[6];
        java.lang.String str2 = reportStorageSizeTask.f74877f;
        objArr[0] = str2;
        objArr[1] = "";
        objArr[2] = "";
        objArr[3] = valueOf;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.e(str2));
        com.tencent.mm.vfs.r6[] r6VarArr = null;
        com.tencent.mm.vfs.r6[] H = (r6Var.m() && r6Var.y()) ? r6Var.H(new com.tencent.mm.plugin.appbrand.appstorage.w()) : null;
        long j18 = 0;
        if (H == null || H.length <= 0) {
            j17 = 0;
        } else {
            j17 = 0;
            for (com.tencent.mm.vfs.r6 r6Var2 : H) {
                j17 += r6Var2.C();
            }
        }
        objArr[4] = java.lang.Long.valueOf(j17);
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.e(reportStorageSizeTask.f74877f));
        if (r6Var3.m() && r6Var3.y()) {
            r6VarArr = r6Var3.H(new com.tencent.mm.plugin.appbrand.appstorage.v());
        }
        if (r6VarArr != null && r6VarArr.length > 0) {
            for (com.tencent.mm.vfs.r6 r6Var4 : r6VarArr) {
                j18 += r6Var4.C();
            }
        }
        objArr[5] = java.lang.Long.valueOf(j18);
        g0Var.d(14073, objArr);
    }

    public void C(java.lang.String str) {
        this.f74877f = str;
        d();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f74877f = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f74877f);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.nd(this));
    }
}

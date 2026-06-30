package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class i extends com.p314xaae8f345.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2 f294519e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f294520f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22737x493c71f3 f294521g;

    public i(com.p314xaae8f345.mm.vfs.C22737x493c71f3 c22737x493c71f3, com.p314xaae8f345.mm.vfs.q2 q2Var) {
        this.f294521g = c22737x493c71f3;
        this.f294519e = q2Var;
        this.f294520f = java.util.Collections.singletonList(q2Var);
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public java.util.List K() {
        return this.f294520f;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public com.p314xaae8f345.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f294519e;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        android.os.Bundle bundle;
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> mo82286x32b09e = this.f294519e.mo82286x32b09e("");
        if (mo82286x32b09e == null) {
            mo82286x32b09e = java.util.Collections.emptyList();
        }
        com.p314xaae8f345.mm.vfs.x1 x1Var = null;
        int i17 = 0;
        com.p314xaae8f345.mm.vfs.x1 x1Var2 = null;
        for (com.p314xaae8f345.mm.vfs.x1 x1Var3 : mo82286x32b09e) {
            if (!x1Var3.f294769f) {
                java.lang.String str = x1Var3.f294765b;
                boolean endsWith = str.endsWith(".temp");
                long j17 = x1Var3.f294768e;
                if (endsWith) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (java.lang.System.currentTimeMillis() - j17 > 86400000) {
                        x1Var3.a();
                    } else {
                        if (x1Var != null) {
                            if (j17 > x1Var.f294768e) {
                                x1Var.a();
                            } else {
                                x1Var3.a();
                            }
                        }
                        x1Var = x1Var3;
                    }
                } else if (str.endsWith(".apk")) {
                    android.content.pm.PackageInfo packageArchiveInfo = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getPackageArchiveInfo(x1Var3.f294770g.D(x1Var3.f294764a, false), 128);
                    if (packageArchiveInfo != null) {
                        java.lang.String str2 = packageArchiveInfo.packageName;
                        if (str2 == null || str2.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)) {
                            android.content.pm.ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                                int i18 = bundle.getInt("com.tencent.mm.BuildInfo.CLIENT_VERSION");
                                int i19 = o45.wf.f424556a;
                                if (i18 <= o45.wf.f424562g) {
                                    x1Var3.a();
                                } else {
                                    if (x1Var2 != null) {
                                        if (i18 > i17) {
                                            x1Var2.a();
                                        } else {
                                            x1Var3.a();
                                        }
                                    }
                                    x1Var2 = x1Var3;
                                    i17 = i18;
                                }
                            }
                        } else {
                            x1Var3.a();
                        }
                    }
                    if (i17 != 0) {
                        x1Var3.a();
                    } else {
                        if (x1Var2 != null) {
                            if (j17 > x1Var2.f294768e) {
                                x1Var2.a();
                            } else {
                                x1Var3.a();
                            }
                        }
                        x1Var2 = x1Var3;
                    }
                }
            }
        }
        super.q(cancellationSignal);
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    /* renamed from: toString */
    public java.lang.String mo82287x9616526c() {
        return "apkClean <- " + this.f294519e;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this.f294521g;
    }
}

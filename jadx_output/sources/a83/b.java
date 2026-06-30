package a83;

/* loaded from: classes11.dex */
public final class b implements a83.e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f2254a = null;

    public b(a83.a aVar) {
    }

    @Override // a83.e
    public void a(com.tencent.mm.sdk.platformtools.f2 f2Var) {
        int i17;
        int intValue;
        if (this.f2254a == null) {
            try {
                java.util.Map c17 = wo.t.c();
                if (c17 != null) {
                    this.f2254a = (java.lang.String) c17.get("Hardware");
                }
            } catch (java.lang.Throwable unused) {
                this.f2254a = null;
            }
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        synchronized (com.tencent.mm.sdk.platformtools.e.f192545a) {
            int i18 = android.os.Build.VERSION.SDK_INT;
            try {
                i17 = android.os.Build.VERSION.PREVIEW_SDK_INT;
            } catch (java.lang.Throwable unused2) {
                i17 = 0;
            }
            boolean z17 = true;
            if (i18 < 29) {
                if (i18 + (i17 > 0 ? 1 : 0) < 29) {
                    z17 = false;
                }
            }
            if (z17) {
                java.lang.Integer[] numArr = com.tencent.mm.sdk.platformtools.e.f192545a;
                if (numArr[0] == null) {
                    try {
                        numArr[0] = java.lang.Integer.valueOf(context.getPackageManager().getPackageInfo("com.google.android.art", 1073741824).versionCode);
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AndroidVersion", th6, "Fail to call getARTVersion()", new java.lang.Object[0]);
                        com.tencent.mm.sdk.platformtools.e.f192545a[0] = 0;
                    }
                }
            }
            java.lang.Integer num = com.tencent.mm.sdk.platformtools.e.f192545a[0];
            intValue = num != null ? num.intValue() : 0;
        }
        f2Var.a("art_version", java.lang.Integer.valueOf(intValue));
        f2Var.a("cpu_model", this.f2254a);
        f2Var.a(com.tencent.soter.core.biometric.FingerprintManagerProxy.FINGERPRINT_SERVICE, android.os.Build.FINGERPRINT);
    }
}

package a83;

/* loaded from: classes11.dex */
public final class b implements a83.e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f83787a = null;

    public b(a83.a aVar) {
    }

    @Override // a83.e
    public void a(com.p314xaae8f345.mm.sdk.p2603x2137b148.f2 f2Var) {
        int i17;
        int intValue;
        if (this.f83787a == null) {
            try {
                java.util.Map c17 = wo.t.c();
                if (c17 != null) {
                    this.f83787a = (java.lang.String) c17.get("Hardware");
                }
            } catch (java.lang.Throwable unused) {
                this.f83787a = null;
            }
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        synchronized (com.p314xaae8f345.mm.sdk.p2603x2137b148.e.f274078a) {
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
                java.lang.Integer[] numArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.e.f274078a;
                if (numArr[0] == null) {
                    try {
                        numArr[0] = java.lang.Integer.valueOf(context.getPackageManager().getPackageInfo("com.google.android.art", 1073741824).versionCode);
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AndroidVersion", th6, "Fail to call getARTVersion()", new java.lang.Object[0]);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.e.f274078a[0] = 0;
                    }
                }
            }
            java.lang.Integer num = com.p314xaae8f345.mm.sdk.p2603x2137b148.e.f274078a[0];
            intValue = num != null ? num.intValue() : 0;
        }
        f2Var.a("art_version", java.lang.Integer.valueOf(intValue));
        f2Var.a("cpu_model", this.f83787a);
        f2Var.a(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.f47003xb618721a, android.os.Build.FINGERPRINT);
    }
}

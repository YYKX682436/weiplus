package uy5;

/* loaded from: classes13.dex */
public final class a implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f513554d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f513555e;

    public final java.lang.String a(android.content.pm.PackageManager packageManager) {
        java.lang.String b17;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                android.content.Context context = this.f513554d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                android.content.pm.SigningInfo signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                if (signingInfo.hasMultipleSigners()) {
                    android.content.pm.Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(apkContentsSigners, "getApkContentsSigners(...)");
                    byte[] byteArray = ((android.content.pm.Signature) kz5.z.L(apkContentsSigners)).toByteArray();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteArray, "toByteArray(...)");
                    b17 = b(byteArray);
                } else {
                    android.content.pm.Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(signingCertificateHistory, "getSigningCertificateHistory(...)");
                    byte[] byteArray2 = ((android.content.pm.Signature) kz5.z.L(signingCertificateHistory)).toByteArray();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteArray2, "toByteArray(...)");
                    b17 = b(byteArray2);
                }
            } else {
                android.content.Context context2 = this.f513554d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
                android.content.pm.Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
                boolean z17 = true;
                if (signatureArr != null) {
                    if (!(signatureArr.length == 0)) {
                        z17 = false;
                    }
                }
                if (z17) {
                    return null;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(signatureArr);
                if (kz5.z.L(signatureArr) == null) {
                    return null;
                }
                byte[] byteArray3 = ((android.content.pm.Signature) kz5.z.L(signatureArr)).toByteArray();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteArray3, "toByteArray(...)");
                b17 = b(byteArray3);
            }
            return b17;
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final java.lang.String b(byte[] bArr) {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(digest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[digest.length * 2];
        int length = digest.length;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = digest[i17] & 255;
            int i19 = i17 * 2;
            cArr2[i19] = cArr[i18 >>> 4];
            cArr2[i19 + 1] = cArr[i18 & 15];
        }
        return new java.lang.String(cArr2);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f513554d = binding.m137982x6e669035();
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(binding.m137983x3b5b91dc(), "dev.fluttercommunity.plus/package_info");
        this.f513555e = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f513554d = null;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f513555e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c28688xe8dbe4c2);
        c28688xe8dbe4c2.m138441xdf757329(null);
        this.f513555e = null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff call, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        java.lang.String str;
        java.lang.CharSequence loadLabel;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        try {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(call.f71610xbfc5d0e1, "getAll")) {
                result.mo65719xbc9fa82f();
                return;
            }
            android.content.Context context = this.f513554d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.Context context2 = this.f513554d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            java.lang.String a17 = a(packageManager);
            android.content.Context context3 = this.f513554d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context3);
            android.content.pm.PackageManager packageManager2 = context3.getPackageManager();
            android.content.Context context4 = this.f513554d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context4);
            java.lang.String packageName = context4.getPackageName();
            int i17 = android.os.Build.VERSION.SDK_INT;
            java.lang.String initiatingPackageName = i17 >= 30 ? packageManager2.getInstallSourceInfo(packageName).getInitiatingPackageName() : packageManager2.getInstallerPackageName(packageName);
            long j17 = packageInfo.firstInstallTime;
            long j18 = packageInfo.lastUpdateTime;
            java.util.HashMap hashMap = new java.util.HashMap();
            android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            java.lang.String str2 = "";
            if (applicationInfo == null || (loadLabel = applicationInfo.loadLabel(packageManager)) == null || (str = loadLabel.toString()) == null) {
                str = "";
            }
            hashMap.put("appName", str);
            android.content.Context context5 = this.f513554d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context5);
            hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, context5.getPackageName());
            java.lang.String str3 = packageInfo.versionName;
            if (str3 != null) {
                str2 = str3;
            }
            hashMap.put("version", str2);
            hashMap.put("buildNumber", java.lang.String.valueOf(i17 >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
            if (a17 != null) {
                hashMap.put("buildSignature", a17);
            }
            if (initiatingPackageName != null) {
                hashMap.put("installerStore", initiatingPackageName);
            }
            hashMap.put("installTime", java.lang.String.valueOf(j17));
            hashMap.put(dm.i4.f66874x4c6b1f55, java.lang.String.valueOf(j18));
            result.mo65720x90b54003(hashMap);
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            result.mo65718x5c4d208("Name not found", e17.getMessage(), null);
        }
    }
}

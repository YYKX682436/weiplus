package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes13.dex */
public class p0 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.p3106xb8dca993.p3107x649df65.p0 f297168f = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.p0();

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3106xb8dca993.p3107x649df65.o0 f297169a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f297170b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f297171c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f297172d = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public android.content.ServiceConnection f297173e = new com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q1(this);

    public boolean a(android.content.Context context) {
        boolean z17 = false;
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (android.os.Build.VERSION.SDK_INT < 28 ? !(packageInfo == null || packageInfo.versionCode <= 0) : !(packageInfo == null || packageInfo.getLongVersionCode() < 1)) {
                z17 = true;
            }
        } catch (java.lang.Throwable unused) {
        }
        return z17;
    }

    public final java.lang.String b(android.content.Context context, java.lang.String str) {
        android.content.pm.Signature[] signatureArr;
        if (android.text.TextUtils.isEmpty(this.f297170b)) {
            this.f297170b = context.getPackageName();
        }
        if (android.text.TextUtils.isEmpty(this.f297171c)) {
            java.lang.String str2 = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f297170b, 64).signatures;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] digest = messageDigest.digest(byteArray);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        for (byte b17 : digest) {
                            sb6.append(java.lang.Integer.toHexString((b17 & 255) | 256).substring(1, 3));
                        }
                        str2 = sb6.toString();
                    }
                } catch (java.security.NoSuchAlgorithmException unused2) {
                }
            }
            this.f297171c = str2;
        }
        java.lang.String a17 = ((com.tencent.tmsqmsp.oaid2.o0.a.C30932a) this.f297169a).a(this.f297170b, this.f297171c, str);
        return android.text.TextUtils.isEmpty(a17) ? "" : a17;
    }

    public java.lang.String a(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        synchronized (this) {
            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                try {
                } catch (java.lang.Exception unused) {
                    str2 = "";
                }
                if (this.f297169a == null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.setComponent(new android.content.ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                    intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                    try {
                        if (context.bindService(intent, this.f297173e, (context.getApplicationInfo().targetSdkVersion < 34 || android.os.Build.VERSION.SDK_INT < 34) ? 1 : 513)) {
                            synchronized (this.f297172d) {
                                try {
                                    this.f297172d.wait(3000L);
                                } catch (java.lang.Throwable unused2) {
                                }
                            }
                        }
                    } catch (java.lang.Throwable unused3) {
                    }
                    if (this.f297169a != null) {
                        str2 = b(context, str);
                    }
                    str2 = "";
                } else {
                    str2 = b(context, str);
                }
            } else {
                throw new java.lang.IllegalStateException("Cannot run on MainThread");
            }
        }
        return str2;
    }
}

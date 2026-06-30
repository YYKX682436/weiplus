package cb;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f40120a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f40121b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f40122c;

    /* renamed from: d, reason: collision with root package name */
    public int f40123d;

    /* renamed from: e, reason: collision with root package name */
    public int f40124e = 0;

    public f(android.content.Context context) {
        this.f40120a = context;
    }

    public static java.lang.String a(xa.b bVar) {
        bVar.d();
        java.lang.String str = bVar.f452754c.f452763e;
        if (str != null) {
            return str;
        }
        bVar.d();
        java.lang.String str2 = bVar.f452754c.f452760b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        java.lang.String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        java.lang.String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized void b() {
        android.content.pm.PackageInfo c17 = c(this.f40120a.getPackageName());
        if (c17 != null) {
            this.f40121b = java.lang.Integer.toString(c17.versionCode);
            this.f40122c = c17.versionName;
        }
    }

    public final android.content.pm.PackageInfo c(java.lang.String str) {
        try {
            return this.f40120a.getPackageManager().getPackageInfo(str, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 23);
            return null;
        }
    }

    public final synchronized int d() {
        int i17 = this.f40124e;
        if (i17 != 0) {
            return i17;
        }
        android.content.pm.PackageManager packageManager = this.f40120a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            android.content.Intent intent = new android.content.Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            java.util.List<android.content.pm.ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f40124e = 1;
                return 1;
            }
        }
        android.content.Intent intent2 = new android.content.Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f40124e = 2;
            return 2;
        }
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            this.f40124e = 2;
        } else {
            this.f40124e = 1;
        }
        return this.f40124e;
    }

    public final synchronized java.lang.String e() {
        if (this.f40121b == null) {
            b();
        }
        return this.f40121b;
    }
}

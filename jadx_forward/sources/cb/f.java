package cb;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f121653a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f121654b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f121655c;

    /* renamed from: d, reason: collision with root package name */
    public int f121656d;

    /* renamed from: e, reason: collision with root package name */
    public int f121657e = 0;

    public f(android.content.Context context) {
        this.f121653a = context;
    }

    public static java.lang.String a(xa.b bVar) {
        bVar.d();
        java.lang.String str = bVar.f534287c.f534296e;
        if (str != null) {
            return str;
        }
        bVar.d();
        java.lang.String str2 = bVar.f534287c.f534293b;
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
        android.content.pm.PackageInfo c17 = c(this.f121653a.getPackageName());
        if (c17 != null) {
            this.f121654b = java.lang.Integer.toString(c17.versionCode);
            this.f121655c = c17.versionName;
        }
    }

    public final android.content.pm.PackageInfo c(java.lang.String str) {
        try {
            return this.f121653a.getPackageManager().getPackageInfo(str, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 23);
            return null;
        }
    }

    public final synchronized int d() {
        int i17 = this.f121657e;
        if (i17 != 0) {
            return i17;
        }
        android.content.pm.PackageManager packageManager = this.f121653a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18606xacc9ec63()) {
            android.content.Intent intent = new android.content.Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            java.util.List<android.content.pm.ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f121657e = 1;
                return 1;
            }
        }
        android.content.Intent intent2 = new android.content.Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f121657e = 2;
            return 2;
        }
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18606xacc9ec63()) {
            this.f121657e = 2;
        } else {
            this.f121657e = 1;
        }
        return this.f121657e;
    }

    public final synchronized java.lang.String e() {
        if (this.f121654b == null) {
            b();
        }
        return this.f121654b;
    }
}

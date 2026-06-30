package com.p176xb6135e39.p177xcca8366f.gms.iid;

/* renamed from: com.google.android.gms.iid.zzaf */
/* loaded from: classes13.dex */
public final class C2056x394b65 {

    /* renamed from: zzad */
    private android.app.PendingIntent f6116x394b63;

    /* renamed from: zzah */
    private android.os.Messenger f6117x394b67;

    /* renamed from: zzcu */
    private java.util.Map<java.lang.String, java.lang.Object> f6118x394bb2 = new x.b();

    /* renamed from: zzcv */
    private android.os.Messenger f6119x394bb3;

    /* renamed from: zzcw */
    private com.p176xb6135e39.p177xcca8366f.gms.iid.C2050x1d7bb855 f6120x394bb4;
    private android.content.Context zzk;

    /* renamed from: zzco */
    private static final com.p176xb6135e39.p177xcca8366f.gms.iid.InterfaceC2060x394b69<java.lang.Boolean> f6110x394bac = com.p176xb6135e39.p177xcca8366f.gms.iid.AbstractC2059x394b68.zzw().zzd("gcm_iid_use_messenger_ipc", true);

    /* renamed from: zzcp */
    private static java.lang.String f6111x394bad = null;

    /* renamed from: zzcq */
    private static boolean f6112x394bae = false;

    /* renamed from: zzcr */
    private static int f6113x394baf = 0;

    /* renamed from: zzcs */
    private static int f6114x394bb0 = 0;

    /* renamed from: zzck */
    private static int f6109x394ba8 = 0;

    /* renamed from: zzct */
    private static android.content.BroadcastReceiver f6115x394bb1 = null;

    public C2056x394b65(android.content.Context context) {
        this.zzk = context;
    }

    private final synchronized void zzg(android.content.Intent intent) {
        if (this.f6116x394b63 == null) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f6116x394b63 = android.app.PendingIntent.getBroadcast(this.zzk, 0, intent2, 0);
        }
        intent.putExtra("app", this.f6116x394b63);
    }

    public static java.lang.String zzi(android.os.Bundle bundle) {
        if (bundle == null) {
            throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
        }
        java.lang.String string = bundle.getString("registration_id");
        if (string == null) {
            string = bundle.getString("unregistered");
        }
        if (string != null) {
            return string;
        }
        java.lang.String string2 = bundle.getString("error");
        if (string2 != null) {
            throw new java.io.IOException(string2);
        }
        new java.lang.StringBuilder(java.lang.String.valueOf(bundle).length() + 29);
        new java.lang.Throwable();
        throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
    }

    private final android.os.Bundle zzj(android.os.Bundle bundle) {
        android.os.Bundle zzk = zzk(bundle);
        if (zzk == null || !zzk.containsKey("google.messenger")) {
            return zzk;
        }
        android.os.Bundle zzk2 = zzk(bundle);
        if (zzk2 == null || !zzk2.containsKey("google.messenger")) {
            return zzk2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.os.Bundle zzk(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65.zzk(android.os.Bundle):android.os.Bundle");
    }

    public static java.lang.String zzl(android.content.Context context) {
        boolean z17;
        java.lang.String str = f6111x394bad;
        if (str != null) {
            return str;
        }
        f6113x394baf = android.os.Process.myUid();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        boolean z18 = true;
        if (!com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18606xacc9ec63()) {
            java.util.Iterator<android.content.pm.ResolveInfo> it = packageManager.queryIntentServices(new android.content.Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                if (zzd(packageManager, it.next().serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                    f6112x394bae = false;
                    z17 = true;
                    break;
                }
            }
            if (z17) {
                return f6111x394bad;
            }
        }
        java.util.Iterator<android.content.pm.ResolveInfo> it6 = packageManager.queryBroadcastReceivers(new android.content.Intent("com.google.iid.TOKEN_REQUEST"), 0).iterator();
        while (true) {
            if (!it6.hasNext()) {
                z18 = false;
                break;
            }
            if (zzd(packageManager, it6.next().activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                f6112x394bae = true;
                break;
            }
        }
        if (z18) {
            return f6111x394bad;
        }
        if (zzd(packageManager, "com.google.android.gms")) {
            f6112x394bae = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18606xacc9ec63();
        } else {
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18602x4727d397() || !zzd(packageManager, "com.google.android.gsf")) {
                return null;
            }
            f6112x394bae = false;
        }
        return f6111x394bad;
    }

    private static int zzm(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(zzl(context), 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private static synchronized java.lang.String zzv() {
        java.lang.String num;
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65.class) {
            int i17 = f6109x394ba8;
            f6109x394ba8 = i17 + 1;
            num = java.lang.Integer.toString(i17);
        }
        return num;
    }

    public final android.os.Bundle zzd(android.os.Bundle bundle, java.security.KeyPair keyPair) {
        int zzm = zzm(this.zzk);
        bundle.putString("gmsv", java.lang.Integer.toString(zzm));
        bundle.putString("osv", java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        bundle.putString("app_ver", java.lang.Integer.toString(com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.zzg(this.zzk)));
        bundle.putString("app_ver_name", com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.zzh(this.zzk));
        bundle.putString("cliv", "iid-12451000");
        bundle.putString("appid", com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.zzd(keyPair));
        if (zzm < 12000000 || !f6110x394bac.get().booleanValue()) {
            return zzj(bundle);
        }
        try {
            return (android.os.Bundle) com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19608x58e7956(new com.p176xb6135e39.p177xcca8366f.gms.iid.zzr(this.zzk).zzd(1, bundle));
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            if (android.util.Log.isLoggable("InstanceID", 3)) {
                new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 22);
            }
            if ((e17.getCause() instanceof com.p176xb6135e39.p177xcca8366f.gms.iid.C2051x394b60) && ((com.p176xb6135e39.p177xcca8366f.gms.iid.C2051x394b60) e17.getCause()).m18770x130a215f() == 4) {
                return zzj(bundle);
            }
            return null;
        }
    }

    public final void zze(android.os.Message message) {
        if (message == null) {
            return;
        }
        java.lang.Object obj = message.obj;
        if (obj instanceof android.content.Intent) {
            android.content.Intent intent = (android.content.Intent) obj;
            intent.setExtrasClassLoader(com.p176xb6135e39.p177xcca8366f.gms.iid.C2050x1d7bb855.class.getClassLoader());
            if (intent.hasExtra("google.messenger")) {
                android.os.Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof com.p176xb6135e39.p177xcca8366f.gms.iid.C2050x1d7bb855) {
                    this.f6120x394bb4 = (com.p176xb6135e39.p177xcca8366f.gms.iid.C2050x1d7bb855) parcelableExtra;
                }
                if (parcelableExtra instanceof android.os.Messenger) {
                    this.f6119x394bb3 = (android.os.Messenger) parcelableExtra;
                }
            }
            zzh((android.content.Intent) message.obj);
        }
    }

    public final void zzh(android.content.Intent intent) {
        java.lang.String str;
        if (intent == null) {
            android.util.Log.isLoggable("InstanceID", 3);
            return;
        }
        java.lang.String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action) && !"com.google.android.gms.iid.InstanceID".equals(action)) {
            if (android.util.Log.isLoggable("InstanceID", 3)) {
                java.lang.String valueOf = java.lang.String.valueOf(intent.getAction());
                if (valueOf.length() != 0) {
                    "Unexpected response ".concat(valueOf);
                    return;
                }
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("unregistered");
        }
        if (stringExtra != null) {
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (!matcher.matches()) {
                if (!android.util.Log.isLoggable("InstanceID", 3) || stringExtra.length() == 0) {
                    return;
                }
                "Unexpected response string: ".concat(stringExtra);
                return;
            }
            java.lang.String group = matcher.group(1);
            java.lang.String group2 = matcher.group(2);
            android.os.Bundle extras = intent.getExtras();
            extras.putString("registration_id", group2);
            zzd(group, (java.lang.Object) extras);
            return;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("error");
        if (stringExtra2 == null) {
            new java.lang.StringBuilder(java.lang.String.valueOf(intent.getExtras()).length() + 49);
            return;
        }
        if (android.util.Log.isLoggable("InstanceID", 3) && stringExtra2.length() != 0) {
            "Received InstanceID error ".concat(stringExtra2);
        }
        java.lang.String str2 = null;
        if (stringExtra2.startsWith("|")) {
            java.lang.String[] split = stringExtra2.split("\\|");
            if (!"ID".equals(split[1]) && stringExtra2.length() != 0) {
                "Unexpected structured response ".concat(stringExtra2);
            }
            if (split.length > 2) {
                java.lang.String str3 = split[2];
                str = split[3];
                if (str.startsWith(":")) {
                    str = str.substring(1);
                }
                str2 = str3;
            } else {
                str = "UNKNOWN";
            }
            stringExtra2 = str;
            intent.putExtra("error", stringExtra2);
        }
        if (str2 != null) {
            zzd(str2, (java.lang.Object) stringExtra2);
            return;
        }
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65.class) {
            for (java.lang.String str4 : this.f6118x394bb2.keySet()) {
                java.lang.Object obj = this.f6118x394bb2.get(str4);
                this.f6118x394bb2.put(str4, stringExtra2);
                zzd(obj, stringExtra2);
            }
        }
    }

    private static void zzd(java.lang.Object obj, java.lang.Object obj2) {
        if (obj instanceof android.os.ConditionVariable) {
            ((android.os.ConditionVariable) obj).open();
        }
        if (obj instanceof android.os.Messenger) {
            android.os.Messenger messenger = (android.os.Messenger) obj;
            android.os.Message obtain = android.os.Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (android.os.RemoteException e17) {
                new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 24);
            }
        }
    }

    public static boolean zzk(android.content.Context context) {
        if (f6111x394bad != null) {
            zzl(context);
        }
        return f6112x394bae;
    }

    private final void zzd(java.lang.String str, java.lang.Object obj) {
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65.class) {
            java.lang.Object obj2 = this.f6118x394bb2.get(str);
            this.f6118x394bb2.put(str, obj);
            zzd(obj2, obj);
        }
    }

    private static boolean zzd(android.content.pm.PackageManager packageManager, java.lang.String str) {
        try {
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            f6111x394bad = applicationInfo.packageName;
            f6114x394bb0 = applicationInfo.uid;
            return true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private static boolean zzd(android.content.pm.PackageManager packageManager, java.lang.String str, java.lang.String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return zzd(packageManager, str);
        }
        new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 56 + java.lang.String.valueOf(str2).length());
        return false;
    }
}

package com.google.android.gms.iid;

/* loaded from: classes13.dex */
public final class zzaf {
    private android.app.PendingIntent zzad;
    private android.os.Messenger zzah;
    private java.util.Map<java.lang.String, java.lang.Object> zzcu = new x.b();
    private android.os.Messenger zzcv;
    private com.google.android.gms.iid.MessengerCompat zzcw;
    private android.content.Context zzk;
    private static final com.google.android.gms.iid.zzaj<java.lang.Boolean> zzco = com.google.android.gms.iid.zzai.zzw().zzd("gcm_iid_use_messenger_ipc", true);
    private static java.lang.String zzcp = null;
    private static boolean zzcq = false;
    private static int zzcr = 0;
    private static int zzcs = 0;
    private static int zzck = 0;
    private static android.content.BroadcastReceiver zzct = null;

    public zzaf(android.content.Context context) {
        this.zzk = context;
    }

    private final synchronized void zzg(android.content.Intent intent) {
        if (this.zzad == null) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.zzad = android.app.PendingIntent.getBroadcast(this.zzk, 0, intent2, 0);
        }
        intent.putExtra("app", this.zzad);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.zzaf.zzk(android.os.Bundle):android.os.Bundle");
    }

    public static java.lang.String zzl(android.content.Context context) {
        boolean z17;
        java.lang.String str = zzcp;
        if (str != null) {
            return str;
        }
        zzcr = android.os.Process.myUid();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        boolean z18 = true;
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            java.util.Iterator<android.content.pm.ResolveInfo> it = packageManager.queryIntentServices(new android.content.Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                if (zzd(packageManager, it.next().serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                    zzcq = false;
                    z17 = true;
                    break;
                }
            }
            if (z17) {
                return zzcp;
            }
        }
        java.util.Iterator<android.content.pm.ResolveInfo> it6 = packageManager.queryBroadcastReceivers(new android.content.Intent("com.google.iid.TOKEN_REQUEST"), 0).iterator();
        while (true) {
            if (!it6.hasNext()) {
                z18 = false;
                break;
            }
            if (zzd(packageManager, it6.next().activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                zzcq = true;
                break;
            }
        }
        if (z18) {
            return zzcp;
        }
        if (zzd(packageManager, "com.google.android.gms")) {
            zzcq = com.google.android.gms.common.util.PlatformVersion.isAtLeastO();
        } else {
            if (com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop() || !zzd(packageManager, "com.google.android.gsf")) {
                return null;
            }
            zzcq = false;
        }
        return zzcp;
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
        synchronized (com.google.android.gms.iid.zzaf.class) {
            int i17 = zzck;
            zzck = i17 + 1;
            num = java.lang.Integer.toString(i17);
        }
        return num;
    }

    public final android.os.Bundle zzd(android.os.Bundle bundle, java.security.KeyPair keyPair) {
        int zzm = zzm(this.zzk);
        bundle.putString("gmsv", java.lang.Integer.toString(zzm));
        bundle.putString("osv", java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        bundle.putString("app_ver", java.lang.Integer.toString(com.google.android.gms.iid.InstanceID.zzg(this.zzk)));
        bundle.putString("app_ver_name", com.google.android.gms.iid.InstanceID.zzh(this.zzk));
        bundle.putString("cliv", "iid-12451000");
        bundle.putString("appid", com.google.android.gms.iid.InstanceID.zzd(keyPair));
        if (zzm < 12000000 || !zzco.get().booleanValue()) {
            return zzj(bundle);
        }
        try {
            return (android.os.Bundle) com.google.android.gms.tasks.Tasks.await(new com.google.android.gms.iid.zzr(this.zzk).zzd(1, bundle));
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e17) {
            if (android.util.Log.isLoggable("InstanceID", 3)) {
                new java.lang.StringBuilder(java.lang.String.valueOf(e17).length() + 22);
            }
            if ((e17.getCause() instanceof com.google.android.gms.iid.zzaa) && ((com.google.android.gms.iid.zzaa) e17.getCause()).getErrorCode() == 4) {
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
            intent.setExtrasClassLoader(com.google.android.gms.iid.MessengerCompat.class.getClassLoader());
            if (intent.hasExtra("google.messenger")) {
                android.os.Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof com.google.android.gms.iid.MessengerCompat) {
                    this.zzcw = (com.google.android.gms.iid.MessengerCompat) parcelableExtra;
                }
                if (parcelableExtra instanceof android.os.Messenger) {
                    this.zzcv = (android.os.Messenger) parcelableExtra;
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
        synchronized (com.google.android.gms.iid.zzaf.class) {
            for (java.lang.String str4 : this.zzcu.keySet()) {
                java.lang.Object obj = this.zzcu.get(str4);
                this.zzcu.put(str4, stringExtra2);
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
        if (zzcp != null) {
            zzl(context);
        }
        return zzcq;
    }

    private final void zzd(java.lang.String str, java.lang.Object obj) {
        synchronized (com.google.android.gms.iid.zzaf.class) {
            java.lang.Object obj2 = this.zzcu.get(str);
            this.zzcu.put(str, obj);
            zzd(obj2, obj);
        }
    }

    private static boolean zzd(android.content.pm.PackageManager packageManager, java.lang.String str) {
        try {
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            zzcp = applicationInfo.packageName;
            zzcs = applicationInfo.uid;
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

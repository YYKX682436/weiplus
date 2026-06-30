package com.p176xb6135e39.p177xcca8366f.gms.gcm;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.gcm.GoogleCloudMessaging */
/* loaded from: classes13.dex */
public class C2041x64a32b08 {

    /* renamed from: ERROR_MAIN_THREAD */
    public static final java.lang.String f6038xad926b79 = "MAIN_THREAD";

    /* renamed from: ERROR_SERVICE_NOT_AVAILABLE */
    public static final java.lang.String f6039x5f2af8dc = "SERVICE_NOT_AVAILABLE";

    /* renamed from: INSTANCE_ID_SCOPE */
    public static final java.lang.String f6040x967367a = "GCM";

    /* renamed from: MESSAGE_TYPE_DELETED */
    @java.lang.Deprecated
    public static final java.lang.String f6041x3d3abd4c = "deleted_messages";

    /* renamed from: MESSAGE_TYPE_MESSAGE */
    @java.lang.Deprecated
    public static final java.lang.String f6042x19bb8d3a = "gcm";

    /* renamed from: MESSAGE_TYPE_SEND_ERROR */
    @java.lang.Deprecated
    public static final java.lang.String f6043x5489583e = "send_error";

    /* renamed from: MESSAGE_TYPE_SEND_EVENT */
    @java.lang.Deprecated
    public static final java.lang.String f6044x548af8d0 = "send_event";

    /* renamed from: zzac */
    private static com.p176xb6135e39.p177xcca8366f.gms.gcm.C2041x64a32b08 f6045x394b62;

    /* renamed from: zzaf */
    private static final java.util.concurrent.atomic.AtomicInteger f6046x394b65 = new java.util.concurrent.atomic.AtomicInteger(1);

    /* renamed from: zzad */
    private android.app.PendingIntent f6047x394b63;

    /* renamed from: zzae */
    private final java.util.Map<java.lang.String, android.os.Handler> f6048x394b64 = java.util.Collections.synchronizedMap(new x.b());

    /* renamed from: zzag */
    private final java.util.concurrent.BlockingQueue<android.content.Intent> f6049x394b66 = new java.util.concurrent.LinkedBlockingQueue();

    /* renamed from: zzah */
    private final android.os.Messenger f6050x394b67 = new android.os.Messenger(new com.p176xb6135e39.p177xcca8366f.gms.gcm.zzf(this, android.os.Looper.getMainLooper()));
    private android.content.Context zzk;

    @java.lang.Deprecated
    /* renamed from: getInstance */
    public static synchronized com.p176xb6135e39.p177xcca8366f.gms.gcm.C2041x64a32b08 m18711x9cf0d20b(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.gcm.C2041x64a32b08 c2041x64a32b08;
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.gcm.C2041x64a32b08.class) {
            if (f6045x394b62 == null) {
                zze(context);
                com.p176xb6135e39.p177xcca8366f.gms.gcm.C2041x64a32b08 c2041x64a32b082 = new com.p176xb6135e39.p177xcca8366f.gms.gcm.C2041x64a32b08();
                f6045x394b62 = c2041x64a32b082;
                c2041x64a32b082.zzk = context.getApplicationContext();
            }
            c2041x64a32b08 = f6045x394b62;
        }
        return c2041x64a32b08;
    }

    @java.lang.Deprecated
    private final android.content.Intent zzd(android.os.Bundle bundle, boolean z17) {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        if (zzf(this.zzk) < 0) {
            throw new java.io.IOException("Google Play Services missing");
        }
        android.content.Intent intent = new android.content.Intent(z17 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.setPackage(com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65.zzl(this.zzk));
        zze(intent);
        int andIncrement = f6046x394b65.getAndIncrement();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(21);
        sb6.append("google.rpc");
        sb6.append(andIncrement);
        intent.putExtra("google.message_id", sb6.toString());
        intent.putExtras(bundle);
        intent.putExtra("google.messenger", this.f6050x394b67);
        android.content.Context context = this.zzk;
        if (z17) {
            context.sendBroadcast(intent);
        } else {
            context.startService(intent);
        }
        try {
            return this.f6049x394b66.poll(30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e17) {
            throw new java.io.IOException(e17.getMessage());
        }
    }

    public static int zzf(android.content.Context context) {
        java.lang.String zzl = com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65.zzl(context);
        if (zzl == null) {
            return -1;
        }
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(zzl, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private final synchronized void zzg() {
        android.app.PendingIntent pendingIntent = this.f6047x394b63;
        if (pendingIntent != null) {
            pendingIntent.cancel();
            this.f6047x394b63 = null;
        }
    }

    @java.lang.Deprecated
    /* renamed from: close */
    public void m18712x5a5ddf8() {
        f6045x394b62 = null;
        com.p176xb6135e39.p177xcca8366f.gms.gcm.zzd.zzj = null;
        zzg();
    }

    @java.lang.Deprecated
    /* renamed from: getMessageType */
    public java.lang.String m18713xa5cbeeab(android.content.Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return null;
        }
        java.lang.String stringExtra = intent.getStringExtra("message_type");
        return stringExtra != null ? stringExtra : f6042x19bb8d3a;
    }

    @java.lang.Deprecated
    /* renamed from: register */
    public synchronized java.lang.String m18714xd6dc2ea3(java.lang.String... strArr) {
        return zzd(com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65.zzk(this.zzk), strArr);
    }

    @java.lang.Deprecated
    /* renamed from: send */
    public void m18715x35cf88(java.lang.String str, java.lang.String str2, long j17, android.os.Bundle bundle) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Missing 'to'");
        }
        java.lang.String zzl = com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65.zzl(this.zzk);
        if (zzl == null) {
            throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
        }
        android.content.Intent intent = new android.content.Intent("com.google.android.gcm.intent.SEND");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        zze(intent);
        intent.setPackage(zzl);
        intent.putExtra("google.to", str);
        intent.putExtra("google.message_id", str2);
        intent.putExtra("google.ttl", java.lang.Long.toString(j17));
        int indexOf = str.indexOf(64);
        java.lang.String substring = indexOf > 0 ? str.substring(0, indexOf) : str;
        com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.m18754x9cf0d20b(this.zzk);
        intent.putExtra("google.from", com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.zzn().zze("", substring, "GCM"));
        if (!zzl.contains(".gsf")) {
            this.zzk.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        for (java.lang.String str3 : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str3);
            if (obj instanceof java.lang.String) {
                java.lang.String valueOf = java.lang.String.valueOf(str3);
                bundle2.putString(valueOf.length() != 0 ? "gcm.".concat(valueOf) : new java.lang.String("gcm."), (java.lang.String) obj);
            }
        }
        bundle2.putString("google.to", str);
        bundle2.putString("google.message_id", str2);
        com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.m18754x9cf0d20b(this.zzk).zze("GCM", "upstream", bundle2);
    }

    @java.lang.Deprecated
    /* renamed from: unregister */
    public synchronized void m18717x31d4943c() {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.m18754x9cf0d20b(this.zzk).m18757xdb1d547b();
    }

    @java.lang.Deprecated
    private final synchronized java.lang.String zzd(boolean z17, java.lang.String... strArr) {
        java.lang.String zzl = com.p176xb6135e39.p177xcca8366f.gms.iid.C2056x394b65.zzl(this.zzk);
        if (zzl == null) {
            throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
        }
        if (strArr == null || strArr.length == 0) {
            throw new java.lang.IllegalArgumentException("No senderIds");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(strArr[0]);
        for (int i17 = 1; i17 < strArr.length; i17++) {
            sb6.append(',');
            sb6.append(strArr[i17]);
        }
        java.lang.String sb7 = sb6.toString();
        android.os.Bundle bundle = new android.os.Bundle();
        if (zzl.contains(".gsf")) {
            bundle.putString("legacy.sender", sb7);
            return com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.m18754x9cf0d20b(this.zzk).m18763x75346043(sb7, "GCM", bundle);
        }
        bundle.putString("sender", sb7);
        android.content.Intent zzd = zzd(bundle, z17);
        if (zzd == null) {
            throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
        }
        java.lang.String stringExtra = zzd.getStringExtra("registration_id");
        if (stringExtra != null) {
            return stringExtra;
        }
        java.lang.String stringExtra2 = zzd.getStringExtra("error");
        if (stringExtra2 != null) {
            throw new java.io.IOException(stringExtra2);
        }
        throw new java.io.IOException("SERVICE_NOT_AVAILABLE");
    }

    public static void zze(android.content.Context context) {
        new java.lang.StringBuilder(java.lang.String.valueOf(context.getPackageName()).length() + 48);
    }

    @java.lang.Deprecated
    /* renamed from: send */
    public void m18716x35cf88(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        m18715x35cf88(str, str2, -1L, bundle);
    }

    private final synchronized void zze(android.content.Intent intent) {
        if (this.f6047x394b63 == null) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f6047x394b63 = android.app.PendingIntent.getBroadcast(this.zzk, 0, intent2, 0);
        }
        intent.putExtra("app", this.f6047x394b63);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzd(android.content.Intent intent) {
        android.os.Handler remove;
        java.lang.String stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null && intent.hasExtra("error")) {
            stringExtra = intent.getStringExtra("google.message_id");
        }
        if (stringExtra == null || (remove = this.f6048x394b64.remove(stringExtra)) == null) {
            return false;
        }
        android.os.Message obtain = android.os.Message.obtain();
        obtain.obj = intent;
        return remove.sendMessage(obtain);
    }
}

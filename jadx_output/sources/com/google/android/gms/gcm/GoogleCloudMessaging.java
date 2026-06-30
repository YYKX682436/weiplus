package com.google.android.gms.gcm;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public class GoogleCloudMessaging {
    public static final java.lang.String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final java.lang.String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final java.lang.String INSTANCE_ID_SCOPE = "GCM";

    @java.lang.Deprecated
    public static final java.lang.String MESSAGE_TYPE_DELETED = "deleted_messages";

    @java.lang.Deprecated
    public static final java.lang.String MESSAGE_TYPE_MESSAGE = "gcm";

    @java.lang.Deprecated
    public static final java.lang.String MESSAGE_TYPE_SEND_ERROR = "send_error";

    @java.lang.Deprecated
    public static final java.lang.String MESSAGE_TYPE_SEND_EVENT = "send_event";
    private static com.google.android.gms.gcm.GoogleCloudMessaging zzac;
    private static final java.util.concurrent.atomic.AtomicInteger zzaf = new java.util.concurrent.atomic.AtomicInteger(1);
    private android.app.PendingIntent zzad;
    private final java.util.Map<java.lang.String, android.os.Handler> zzae = java.util.Collections.synchronizedMap(new x.b());
    private final java.util.concurrent.BlockingQueue<android.content.Intent> zzag = new java.util.concurrent.LinkedBlockingQueue();
    private final android.os.Messenger zzah = new android.os.Messenger(new com.google.android.gms.gcm.zzf(this, android.os.Looper.getMainLooper()));
    private android.content.Context zzk;

    @java.lang.Deprecated
    public static synchronized com.google.android.gms.gcm.GoogleCloudMessaging getInstance(android.content.Context context) {
        com.google.android.gms.gcm.GoogleCloudMessaging googleCloudMessaging;
        synchronized (com.google.android.gms.gcm.GoogleCloudMessaging.class) {
            if (zzac == null) {
                zze(context);
                com.google.android.gms.gcm.GoogleCloudMessaging googleCloudMessaging2 = new com.google.android.gms.gcm.GoogleCloudMessaging();
                zzac = googleCloudMessaging2;
                googleCloudMessaging2.zzk = context.getApplicationContext();
            }
            googleCloudMessaging = zzac;
        }
        return googleCloudMessaging;
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
        intent.setPackage(com.google.android.gms.iid.zzaf.zzl(this.zzk));
        zze(intent);
        int andIncrement = zzaf.getAndIncrement();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(21);
        sb6.append("google.rpc");
        sb6.append(andIncrement);
        intent.putExtra("google.message_id", sb6.toString());
        intent.putExtras(bundle);
        intent.putExtra("google.messenger", this.zzah);
        android.content.Context context = this.zzk;
        if (z17) {
            context.sendBroadcast(intent);
        } else {
            context.startService(intent);
        }
        try {
            return this.zzag.poll(30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e17) {
            throw new java.io.IOException(e17.getMessage());
        }
    }

    public static int zzf(android.content.Context context) {
        java.lang.String zzl = com.google.android.gms.iid.zzaf.zzl(context);
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
        android.app.PendingIntent pendingIntent = this.zzad;
        if (pendingIntent != null) {
            pendingIntent.cancel();
            this.zzad = null;
        }
    }

    @java.lang.Deprecated
    public void close() {
        zzac = null;
        com.google.android.gms.gcm.zzd.zzj = null;
        zzg();
    }

    @java.lang.Deprecated
    public java.lang.String getMessageType(android.content.Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return null;
        }
        java.lang.String stringExtra = intent.getStringExtra("message_type");
        return stringExtra != null ? stringExtra : MESSAGE_TYPE_MESSAGE;
    }

    @java.lang.Deprecated
    public synchronized java.lang.String register(java.lang.String... strArr) {
        return zzd(com.google.android.gms.iid.zzaf.zzk(this.zzk), strArr);
    }

    @java.lang.Deprecated
    public void send(java.lang.String str, java.lang.String str2, long j17, android.os.Bundle bundle) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Missing 'to'");
        }
        java.lang.String zzl = com.google.android.gms.iid.zzaf.zzl(this.zzk);
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
        com.google.android.gms.iid.InstanceID.getInstance(this.zzk);
        intent.putExtra("google.from", com.google.android.gms.iid.InstanceID.zzn().zze("", substring, "GCM"));
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
        com.google.android.gms.iid.InstanceID.getInstance(this.zzk).zze("GCM", "upstream", bundle2);
    }

    @java.lang.Deprecated
    public synchronized void unregister() {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.io.IOException("MAIN_THREAD");
        }
        com.google.android.gms.iid.InstanceID.getInstance(this.zzk).deleteInstanceID();
    }

    @java.lang.Deprecated
    private final synchronized java.lang.String zzd(boolean z17, java.lang.String... strArr) {
        java.lang.String zzl = com.google.android.gms.iid.zzaf.zzl(this.zzk);
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
            return com.google.android.gms.iid.InstanceID.getInstance(this.zzk).getToken(sb7, "GCM", bundle);
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
    public void send(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        send(str, str2, -1L, bundle);
    }

    private final synchronized void zze(android.content.Intent intent) {
        if (this.zzad == null) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.zzad = android.app.PendingIntent.getBroadcast(this.zzk, 0, intent2, 0);
        }
        intent.putExtra("app", this.zzad);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzd(android.content.Intent intent) {
        android.os.Handler remove;
        java.lang.String stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null && intent.hasExtra("error")) {
            stringExtra = intent.getStringExtra("google.message_id");
        }
        if (stringExtra == null || (remove = this.zzae.remove(stringExtra)) == null) {
            return false;
        }
        android.os.Message obtain = android.os.Message.obtain();
        obtain.obj = intent;
        return remove.sendMessage(obtain);
    }
}

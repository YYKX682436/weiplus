package com.p176xb6135e39.p177xcca8366f.gms.gcm;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.gcm.GcmReceiver */
/* loaded from: classes13.dex */
public class C2039xb89de400 extends p012xc85e97e9.p090xbe0af3c9.p091x38b73479.AbstractC1111x43921d97 {
    private static boolean zzq;
    private static com.p176xb6135e39.p177xcca8366f.gms.iid.zzk zzr;
    private static com.p176xb6135e39.p177xcca8366f.gms.iid.zzk zzs;

    private final synchronized com.p176xb6135e39.p177xcca8366f.gms.iid.zzk zzd(android.content.Context context, java.lang.String str) {
        if ("com.google.android.c2dm.intent.RECEIVE".equals(str)) {
            if (zzs == null) {
                zzs = new com.p176xb6135e39.p177xcca8366f.gms.iid.zzk(context, str);
            }
            return zzs;
        }
        if (zzr == null) {
            zzr = new com.p176xb6135e39.p177xcca8366f.gms.iid.zzk(context, str);
        }
        return zzr;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.util.Log.isLoggable("GcmReceiver", 3);
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        java.lang.String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z17 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", android.util.Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18606xacc9ec63() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z17 = true;
        }
        if (z17) {
            if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
            zzd(context, intent.getAction()).zzd(intent, goAsync());
        } else {
            "com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction());
            zzd(context, intent);
            if (isOrderedBroadcast() && getResultCode() == 0) {
                setResultCode(-1);
            }
        }
    }

    private final void zzd(android.content.Context context, android.content.Intent intent) {
        android.content.pm.ServiceInfo serviceInfo;
        java.lang.String str;
        if (isOrderedBroadcast()) {
            setResultCode(500);
        }
        android.content.pm.ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
            if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
                new java.lang.StringBuilder(java.lang.String.valueOf(serviceInfo.packageName).length() + 94 + java.lang.String.valueOf(serviceInfo.name).length());
            } else {
                if (str.startsWith(".")) {
                    java.lang.String valueOf = java.lang.String.valueOf(context.getPackageName());
                    str = str.length() != 0 ? valueOf.concat(str) : new java.lang.String(valueOf);
                }
                if (android.util.Log.isLoggable("GcmReceiver", 3)) {
                    java.lang.String valueOf2 = java.lang.String.valueOf(str);
                    if (valueOf2.length() != 0) {
                        "Restricting intent to a specific service: ".concat(valueOf2);
                    }
                }
                intent.setClassName(context.getPackageName(), str);
            }
        }
        try {
            if ((context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 ? p012xc85e97e9.p090xbe0af3c9.p091x38b73479.AbstractC1111x43921d97.m7785xce72c1e(context, intent) : context.startService(intent)) == null) {
                if (isOrderedBroadcast()) {
                    setResultCode(404);
                }
            } else if (isOrderedBroadcast()) {
                setResultCode(-1);
            }
        } catch (java.lang.SecurityException unused) {
            if (isOrderedBroadcast()) {
                setResultCode(401);
            }
        }
    }
}

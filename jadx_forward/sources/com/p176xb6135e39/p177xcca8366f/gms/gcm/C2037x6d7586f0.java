package com.p176xb6135e39.p177xcca8366f.gms.gcm;

/* renamed from: com.google.android.gms.gcm.GcmNetworkManager */
/* loaded from: classes13.dex */
public class C2037x6d7586f0 {

    /* renamed from: RESULT_FAILURE */
    public static final int f6027x33bcb348 = 2;

    /* renamed from: RESULT_RESCHEDULE */
    public static final int f6028x94947f2c = 1;

    /* renamed from: RESULT_SUCCESS */
    public static final int f6029x535c1c1 = 0;
    private static com.p176xb6135e39.p177xcca8366f.gms.gcm.C2037x6d7586f0 zzg;
    private final android.content.Context zzh;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> zzi = new x.b();

    private C2037x6d7586f0(android.content.Context context) {
        this.zzh = context;
    }

    /* renamed from: getInstance */
    public static com.p176xb6135e39.p177xcca8366f.gms.gcm.C2037x6d7586f0 m18700x9cf0d20b(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.gcm.C2037x6d7586f0 c2037x6d7586f0;
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.gcm.C2037x6d7586f0.class) {
            if (zzg == null) {
                zzg = new com.p176xb6135e39.p177xcca8366f.gms.gcm.C2037x6d7586f0(context.getApplicationContext());
            }
            c2037x6d7586f0 = zzg;
        }
        return c2037x6d7586f0;
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.gcm.zzn zzd() {
        return com.p176xb6135e39.p177xcca8366f.gms.gcm.C2041x64a32b08.zzf(this.zzh) < 5000000 ? new com.p176xb6135e39.p177xcca8366f.gms.gcm.zzo() : new com.p176xb6135e39.p177xcca8366f.gms.gcm.zzm(this.zzh);
    }

    /* renamed from: cancelAllTasks */
    public void m18701xf76f6707(java.lang.Class<? extends com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf> cls) {
        android.content.ComponentName componentName = new android.content.ComponentName(this.zzh, cls);
        zze(componentName.getClassName());
        zzd().zzd(componentName);
    }

    /* renamed from: cancelTask */
    public void m18702x70920b1f(java.lang.String str, java.lang.Class<? extends com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf> cls) {
        android.content.ComponentName componentName = new android.content.ComponentName(this.zzh, cls);
        zzd(str);
        zze(componentName.getClassName());
        zzd().zzd(componentName, str);
    }

    /* renamed from: schedule */
    public synchronized void m18703xd6669297(com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5 c2046x27a9a5) {
        java.util.Map<java.lang.String, java.lang.Boolean> map;
        zze(c2046x27a9a5.m18743x66e299aa());
        if (zzd().zzd(c2046x27a9a5) && (map = this.zzi.get(c2046x27a9a5.m18743x66e299aa())) != null && map.containsKey(c2046x27a9a5.m18744xb5887064())) {
            map.put(c2046x27a9a5.m18744xb5887064(), java.lang.Boolean.TRUE);
        }
    }

    public final synchronized void zze(java.lang.String str, java.lang.String str2) {
        java.util.Map<java.lang.String, java.lang.Boolean> map = this.zzi.get(str2);
        if (map != null) {
            if ((map.remove(str) != null) && map.isEmpty()) {
                this.zzi.remove(str2);
            }
        }
    }

    public final synchronized boolean zzf(java.lang.String str) {
        return this.zzi.containsKey(str);
    }

    public static void zzd(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Must provide a valid tag.");
        }
        if (100 < str.length()) {
            throw new java.lang.IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
    }

    private final boolean zze(java.lang.String str) {
        java.util.List<android.content.pm.ResolveInfo> queryIntentServices;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(str, "GcmTaskService must not be null.");
        android.content.pm.PackageManager packageManager = this.zzh.getPackageManager();
        if (packageManager == null) {
            queryIntentServices = java.util.Collections.emptyList();
        } else {
            queryIntentServices = packageManager.queryIntentServices(str != null ? new android.content.Intent(com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.f6030x8b99b2ee).setClassName(this.zzh, str) : new android.content.Intent(com.p176xb6135e39.p177xcca8366f.gms.gcm.AbstractServiceC2040x720859bf.f6030x8b99b2ee).setPackage(this.zzh.getPackageName()), 0);
        }
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C1992x33b9c93.m18540x7aab3243(queryIntentServices)) {
            java.lang.String.valueOf(str).concat(" is not available. This may cause the task to be lost.");
            return true;
        }
        java.util.Iterator<android.content.pm.ResolveInfo> it = queryIntentServices.iterator();
        while (it.hasNext()) {
            android.content.pm.ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 118);
        sb6.append("The GcmTaskService class you provided ");
        sb6.append(str);
        sb6.append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY");
        throw new java.lang.IllegalArgumentException(sb6.toString());
    }

    public final synchronized boolean zzf(java.lang.String str, java.lang.String str2) {
        java.util.Map<java.lang.String, java.lang.Boolean> map = this.zzi.get(str2);
        if (map == null) {
            return false;
        }
        java.lang.Boolean bool = map.get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final synchronized boolean zzd(java.lang.String str, java.lang.String str2) {
        java.util.Map<java.lang.String, java.lang.Boolean> map;
        map = this.zzi.get(str2);
        if (map == null) {
            map = new x.b();
            this.zzi.put(str2, map);
        }
        return map.put(str, java.lang.Boolean.FALSE) == null;
    }
}

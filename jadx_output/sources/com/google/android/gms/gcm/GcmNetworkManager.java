package com.google.android.gms.gcm;

/* loaded from: classes13.dex */
public class GcmNetworkManager {
    public static final int RESULT_FAILURE = 2;
    public static final int RESULT_RESCHEDULE = 1;
    public static final int RESULT_SUCCESS = 0;
    private static com.google.android.gms.gcm.GcmNetworkManager zzg;
    private final android.content.Context zzh;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> zzi = new x.b();

    private GcmNetworkManager(android.content.Context context) {
        this.zzh = context;
    }

    public static com.google.android.gms.gcm.GcmNetworkManager getInstance(android.content.Context context) {
        com.google.android.gms.gcm.GcmNetworkManager gcmNetworkManager;
        synchronized (com.google.android.gms.gcm.GcmNetworkManager.class) {
            if (zzg == null) {
                zzg = new com.google.android.gms.gcm.GcmNetworkManager(context.getApplicationContext());
            }
            gcmNetworkManager = zzg;
        }
        return gcmNetworkManager;
    }

    private final com.google.android.gms.gcm.zzn zzd() {
        return com.google.android.gms.gcm.GoogleCloudMessaging.zzf(this.zzh) < 5000000 ? new com.google.android.gms.gcm.zzo() : new com.google.android.gms.gcm.zzm(this.zzh);
    }

    public void cancelAllTasks(java.lang.Class<? extends com.google.android.gms.gcm.GcmTaskService> cls) {
        android.content.ComponentName componentName = new android.content.ComponentName(this.zzh, cls);
        zze(componentName.getClassName());
        zzd().zzd(componentName);
    }

    public void cancelTask(java.lang.String str, java.lang.Class<? extends com.google.android.gms.gcm.GcmTaskService> cls) {
        android.content.ComponentName componentName = new android.content.ComponentName(this.zzh, cls);
        zzd(str);
        zze(componentName.getClassName());
        zzd().zzd(componentName, str);
    }

    public synchronized void schedule(com.google.android.gms.gcm.Task task) {
        java.util.Map<java.lang.String, java.lang.Boolean> map;
        zze(task.getServiceName());
        if (zzd().zzd(task) && (map = this.zzi.get(task.getServiceName())) != null && map.containsKey(task.getTag())) {
            map.put(task.getTag(), java.lang.Boolean.TRUE);
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
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "GcmTaskService must not be null.");
        android.content.pm.PackageManager packageManager = this.zzh.getPackageManager();
        if (packageManager == null) {
            queryIntentServices = java.util.Collections.emptyList();
        } else {
            queryIntentServices = packageManager.queryIntentServices(str != null ? new android.content.Intent(com.google.android.gms.gcm.GcmTaskService.SERVICE_ACTION_EXECUTE_TASK).setClassName(this.zzh, str) : new android.content.Intent(com.google.android.gms.gcm.GcmTaskService.SERVICE_ACTION_EXECUTE_TASK).setPackage(this.zzh.getPackageName()), 0);
        }
        if (com.google.android.gms.common.util.CollectionUtils.isEmpty(queryIntentServices)) {
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

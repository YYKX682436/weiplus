package com.google.android.gms.gcm;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public class GcmPubSub {
    private static com.google.android.gms.gcm.GcmPubSub zzn;
    private static final java.util.regex.Pattern zzp = java.util.regex.Pattern.compile("/topics/[a-zA-Z0-9-_.~%]{1,900}");
    private com.google.android.gms.iid.InstanceID zzo;

    private GcmPubSub(android.content.Context context) {
        this.zzo = com.google.android.gms.iid.InstanceID.getInstance(context);
    }

    @java.lang.Deprecated
    public static synchronized com.google.android.gms.gcm.GcmPubSub getInstance(android.content.Context context) {
        com.google.android.gms.gcm.GcmPubSub gcmPubSub;
        synchronized (com.google.android.gms.gcm.GcmPubSub.class) {
            if (zzn == null) {
                com.google.android.gms.gcm.GoogleCloudMessaging.zze(context);
                zzn = new com.google.android.gms.gcm.GcmPubSub(context);
            }
            gcmPubSub = zzn;
        }
        return gcmPubSub;
    }

    @java.lang.Deprecated
    public void subscribe(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (str == null || str.isEmpty()) {
            java.lang.String valueOf = java.lang.String.valueOf(str);
            throw new java.lang.IllegalArgumentException(valueOf.length() != 0 ? "Invalid appInstanceToken: ".concat(valueOf) : new java.lang.String("Invalid appInstanceToken: "));
        }
        if (str2 == null || !zzp.matcher(str2).matches()) {
            java.lang.String valueOf2 = java.lang.String.valueOf(str2);
            throw new java.lang.IllegalArgumentException(valueOf2.length() != 0 ? "Invalid topic name: ".concat(valueOf2) : new java.lang.String("Invalid topic name: "));
        }
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        bundle.putString("gcm.topic", str2);
        this.zzo.getToken(str, str2, bundle);
    }

    @java.lang.Deprecated
    public void unsubscribe(java.lang.String str, java.lang.String str2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("gcm.topic", str2);
        this.zzo.zzd(str, str2, bundle);
    }
}

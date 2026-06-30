package com.google.android.gms.iid;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public class InstanceIDListenerService extends com.google.android.gms.iid.zze {
    public static void zzd(android.content.Context context, com.google.android.gms.iid.zzak zzakVar) {
        zzakVar.zzx();
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }

    @Override // com.google.android.gms.iid.zze
    public void handleIntent(android.content.Intent intent) {
        android.os.Bundle bundle;
        if ("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
            java.lang.String stringExtra = intent.getStringExtra("subtype");
            if (stringExtra != null) {
                bundle = new android.os.Bundle();
                bundle.putString("subtype", stringExtra);
            } else {
                bundle = null;
            }
            com.google.android.gms.iid.InstanceID instanceID = com.google.android.gms.iid.InstanceID.getInstance(this, bundle);
            java.lang.String stringExtra2 = intent.getStringExtra("CMD");
            if (android.util.Log.isLoggable("InstanceID", 3)) {
                new java.lang.StringBuilder(java.lang.String.valueOf(stringExtra).length() + 34 + java.lang.String.valueOf(stringExtra2).length());
            }
            if ("RST".equals(stringExtra2)) {
                instanceID.zzm();
            } else {
                if (!"RST_FULL".equals(stringExtra2)) {
                    if ("SYNC".equals(stringExtra2)) {
                        com.google.android.gms.iid.InstanceID.zzn().zzi(java.lang.String.valueOf(stringExtra).concat("|T|"));
                        onTokenRefresh();
                        return;
                    }
                    return;
                }
                if (com.google.android.gms.iid.InstanceID.zzn().isEmpty()) {
                    return;
                } else {
                    com.google.android.gms.iid.InstanceID.zzn().zzx();
                }
            }
            onTokenRefresh();
        }
    }

    public void onTokenRefresh() {
    }
}

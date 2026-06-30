package com.p176xb6135e39.p177xcca8366f.gms.iid;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.iid.InstanceIDListenerService */
/* loaded from: classes13.dex */
public class ServiceC2049xd57384b1 extends com.p176xb6135e39.p177xcca8366f.gms.iid.zze {
    public static void zzd(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.iid.C2061x394b6a c2061x394b6a) {
        c2061x394b6a.zzx();
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.iid.zze
    /* renamed from: handleIntent */
    public void mo18695xa1c752e4(android.content.Intent intent) {
        android.os.Bundle bundle;
        if ("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
            java.lang.String stringExtra = intent.getStringExtra("subtype");
            if (stringExtra != null) {
                bundle = new android.os.Bundle();
                bundle.putString("subtype", stringExtra);
            } else {
                bundle = null;
            }
            com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890 m18755x9cf0d20b = com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.m18755x9cf0d20b(this, bundle);
            java.lang.String stringExtra2 = intent.getStringExtra("CMD");
            if (android.util.Log.isLoggable("InstanceID", 3)) {
                new java.lang.StringBuilder(java.lang.String.valueOf(stringExtra).length() + 34 + java.lang.String.valueOf(stringExtra2).length());
            }
            if ("RST".equals(stringExtra2)) {
                m18755x9cf0d20b.zzm();
            } else {
                if (!"RST_FULL".equals(stringExtra2)) {
                    if ("SYNC".equals(stringExtra2)) {
                        com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.zzn().zzi(java.lang.String.valueOf(stringExtra).concat("|T|"));
                        m18764x61498221();
                        return;
                    }
                    return;
                }
                if (com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.zzn().m18772x7aab3243()) {
                    return;
                } else {
                    com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.zzn().zzx();
                }
            }
            m18764x61498221();
        }
    }

    /* renamed from: onTokenRefresh */
    public void m18764x61498221() {
    }
}

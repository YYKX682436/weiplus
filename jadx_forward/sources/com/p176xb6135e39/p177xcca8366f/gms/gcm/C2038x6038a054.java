package com.p176xb6135e39.p177xcca8366f.gms.gcm;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.gcm.GcmPubSub */
/* loaded from: classes13.dex */
public class C2038x6038a054 {
    private static com.p176xb6135e39.p177xcca8366f.gms.gcm.C2038x6038a054 zzn;
    private static final java.util.regex.Pattern zzp = java.util.regex.Pattern.compile("/topics/[a-zA-Z0-9-_.~%]{1,900}");
    private com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890 zzo;

    private C2038x6038a054(android.content.Context context) {
        this.zzo = com.p176xb6135e39.p177xcca8366f.gms.iid.C2048xac95a890.m18754x9cf0d20b(context);
    }

    @java.lang.Deprecated
    /* renamed from: getInstance */
    public static synchronized com.p176xb6135e39.p177xcca8366f.gms.gcm.C2038x6038a054 m18705x9cf0d20b(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.gcm.C2038x6038a054 c2038x6038a054;
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.gcm.C2038x6038a054.class) {
            if (zzn == null) {
                com.p176xb6135e39.p177xcca8366f.gms.gcm.C2041x64a32b08.zze(context);
                zzn = new com.p176xb6135e39.p177xcca8366f.gms.gcm.C2038x6038a054(context);
            }
            c2038x6038a054 = zzn;
        }
        return c2038x6038a054;
    }

    @java.lang.Deprecated
    /* renamed from: subscribe */
    public void m18706x1eafdd4a(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
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
        this.zzo.m18763x75346043(str, str2, bundle);
    }

    @java.lang.Deprecated
    /* renamed from: unsubscribe */
    public void m18707x22c42ad1(java.lang.String str, java.lang.String str2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("gcm.topic", str2);
        this.zzo.zzd(str, str2, bundle);
    }
}

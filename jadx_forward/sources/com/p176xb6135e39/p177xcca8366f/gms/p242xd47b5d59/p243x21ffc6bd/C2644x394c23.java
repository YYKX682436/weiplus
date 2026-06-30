package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzgj */
/* loaded from: classes13.dex */
public final class C2644x394c23 {
    public static android.content.IntentFilter zza(java.lang.String str, android.net.Uri uri, int i17) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter(str);
        if (uri.getScheme() != null) {
            intentFilter.addDataScheme(uri.getScheme());
        }
        if (uri.getAuthority() != null) {
            intentFilter.addDataAuthority(uri.getAuthority(), java.lang.Integer.toString(uri.getPort()));
        }
        if (uri.getPath() != null) {
            intentFilter.addDataPath(uri.getPath(), i17);
        }
        return intentFilter;
    }

    public static android.content.IntentFilter zzc(java.lang.String str) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter(str);
        intentFilter.addDataScheme(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2474x601f1916.f7500x1dca78b8);
        intentFilter.addDataAuthority("*", null);
        return intentFilter;
    }
}

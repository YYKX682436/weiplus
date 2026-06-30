package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzgj {
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
        intentFilter.addDataScheme(com.google.android.gms.wearable.PutDataRequest.WEAR_URI_SCHEME);
        intentFilter.addDataAuthority("*", null);
        return intentFilter;
    }
}

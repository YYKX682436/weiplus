package com.google.android.gms.ads.identifier;

/* loaded from: classes7.dex */
final class zza extends java.lang.Thread {
    private final /* synthetic */ java.util.Map zzl;

    public zza(com.google.android.gms.ads.identifier.AdvertisingIdClient advertisingIdClient, java.util.Map map) {
        this.zzl = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new com.google.android.gms.ads.identifier.zzc();
        java.util.Map map = this.zzl;
        android.net.Uri.Builder buildUpon = android.net.Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (java.lang.String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (java.lang.String) map.get(str));
        }
        java.lang.String uri = buildUpon.build().toString();
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(uri).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(uri).length() + 65);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (java.io.IOException e17) {
            e = e17;
            new java.lang.StringBuilder(java.lang.String.valueOf(uri).length() + 27 + java.lang.String.valueOf(e.getMessage()).length());
        } catch (java.lang.IndexOutOfBoundsException e18) {
            new java.lang.StringBuilder(java.lang.String.valueOf(uri).length() + 32 + java.lang.String.valueOf(e18.getMessage()).length());
        } catch (java.lang.RuntimeException e19) {
            e = e19;
            new java.lang.StringBuilder(java.lang.String.valueOf(uri).length() + 27 + java.lang.String.valueOf(e.getMessage()).length());
        }
    }
}

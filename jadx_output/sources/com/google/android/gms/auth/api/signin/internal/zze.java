package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
public final class zze implements java.lang.Runnable {
    private static final com.google.android.gms.common.logging.Logger zzer = new com.google.android.gms.common.logging.Logger("RevokeAccessOperation", new java.lang.String[0]);
    private final com.google.android.gms.common.api.internal.StatusPendingResult zzes;
    private final java.lang.String zzz;

    private zze(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzz = str;
        this.zzes = new com.google.android.gms.common.api.internal.StatusPendingResult((com.google.android.gms.common.api.GoogleApiClient) null);
    }

    public static com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> zzg(java.lang.String str) {
        if (str == null) {
            return com.google.android.gms.common.api.PendingResults.immediateFailedResult(new com.google.android.gms.common.api.Status(4), null);
        }
        com.google.android.gms.auth.api.signin.internal.zze zzeVar = new com.google.android.gms.auth.api.signin.internal.zze(str);
        new java.lang.Thread(zzeVar).start();
        return zzeVar.zzes;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.Status status = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR;
        try {
            java.lang.String valueOf = java.lang.String.valueOf(this.zzz);
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new java.lang.String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
            } else {
                zzer.e("Unable to revoke access!", new java.lang.Object[0]);
            }
            com.google.android.gms.common.logging.Logger logger = zzer;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(26);
            sb6.append("Response Code: ");
            sb6.append(responseCode);
            logger.d(sb6.toString(), new java.lang.Object[0]);
        } catch (java.io.IOException e17) {
            com.google.android.gms.common.logging.Logger logger2 = zzer;
            java.lang.String valueOf2 = java.lang.String.valueOf(e17.toString());
            logger2.e(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new java.lang.String("IOException when revoking access: "), new java.lang.Object[0]);
        } catch (java.lang.Exception e18) {
            com.google.android.gms.common.logging.Logger logger3 = zzer;
            java.lang.String valueOf3 = java.lang.String.valueOf(e18.toString());
            logger3.e(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new java.lang.String("Exception when revoking access: "), new java.lang.Object[0]);
        }
        this.zzes.setResult(status);
    }
}

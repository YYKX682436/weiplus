package com.google.android.gms.iid;

/* loaded from: classes13.dex */
abstract class zzai {
    private static com.google.android.gms.iid.zzai zzcy;

    public static synchronized com.google.android.gms.iid.zzai zzw() {
        com.google.android.gms.iid.zzai zzaiVar;
        synchronized (com.google.android.gms.iid.zzai.class) {
            if (zzcy == null) {
                zzcy = new com.google.android.gms.iid.zzac();
            }
            zzaiVar = zzcy;
        }
        return zzaiVar;
    }

    public abstract com.google.android.gms.iid.zzaj<java.lang.Boolean> zzd(java.lang.String str, boolean z17);
}

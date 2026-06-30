package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes13.dex */
public abstract class zzs extends com.google.android.gms.internal.auth.zze implements com.google.android.gms.auth.api.signin.internal.zzr {
    public zzs() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.auth.zze
    public final boolean dispatchTransaction(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1) {
            zzq();
        } else {
            if (i17 != 2) {
                return false;
            }
            zzr();
        }
        return true;
    }
}

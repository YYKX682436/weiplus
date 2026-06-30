package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public abstract class zzaf extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.zzag {
    public static com.google.android.gms.common.internal.zzag zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof com.google.android.gms.common.internal.zzag ? (com.google.android.gms.common.internal.zzag) queryLocalInterface : new com.google.android.gms.common.internal.zzae(iBinder);
    }
}

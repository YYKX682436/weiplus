package com.google.android.gms.internal.firebase_messaging;

/* loaded from: classes13.dex */
public abstract class zzf extends com.google.android.gms.internal.firebase_messaging.zzb implements com.google.android.gms.internal.firebase_messaging.zze {
    public static com.google.android.gms.internal.firebase_messaging.zze zza(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
        return queryLocalInterface instanceof com.google.android.gms.internal.firebase_messaging.zze ? (com.google.android.gms.internal.firebase_messaging.zze) queryLocalInterface : new com.google.android.gms.internal.firebase_messaging.zzg(iBinder);
    }
}

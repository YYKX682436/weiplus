package com.google.android.gms.internal.firebase_messaging;

/* loaded from: classes13.dex */
public class zzc {
    private static final java.lang.ClassLoader zzd = com.google.android.gms.internal.firebase_messaging.zzc.class.getClassLoader();

    private zzc() {
    }

    public static void zza(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}

package com.google.android.gms.internal.gcm;

/* loaded from: classes13.dex */
public class zze {
    private static final java.lang.ClassLoader zzf = com.google.android.gms.internal.gcm.zze.class.getClassLoader();

    private zze() {
    }

    public static void zzd(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}

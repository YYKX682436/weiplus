package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.gcm;

/* loaded from: classes13.dex */
public class zze {
    private static final java.lang.ClassLoader zzf = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.gcm.zze.class.getClassLoader();

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

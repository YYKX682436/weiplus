package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc;

/* loaded from: classes13.dex */
public class zzc {
    private static final java.lang.ClassLoader zzd = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc.zzc.class.getClassLoader();

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

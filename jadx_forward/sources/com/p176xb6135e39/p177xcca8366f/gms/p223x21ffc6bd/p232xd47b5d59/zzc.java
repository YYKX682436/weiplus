package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59;

/* loaded from: classes13.dex */
public class zzc {
    private static final java.lang.ClassLoader zzd = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59.zzc.class.getClassLoader();

    private zzc() {
    }

    public static <T extends android.os.Parcelable> T zza(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void zza(android.os.Parcel parcel, android.os.IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
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

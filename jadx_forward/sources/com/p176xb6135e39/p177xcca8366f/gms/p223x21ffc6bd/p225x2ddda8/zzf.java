package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8;

/* loaded from: classes13.dex */
public class zzf {
    private static final java.lang.ClassLoader zzg = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8.zzf.class.getClassLoader();

    private zzf() {
    }

    public static <T extends android.os.Parcelable> T zzd(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void zzd(android.os.Parcel parcel, android.os.IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    public static void zzd(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void zzd(android.os.Parcel parcel, boolean z17) {
        parcel.writeInt(z17 ? 1 : 0);
    }

    public static boolean zzd(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }
}

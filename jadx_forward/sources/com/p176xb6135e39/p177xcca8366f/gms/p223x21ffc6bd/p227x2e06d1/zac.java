package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1;

/* loaded from: classes13.dex */
public final class zac {
    private static final java.lang.ClassLoader zaa = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zac.class.getClassLoader();

    private zac() {
    }

    public static android.os.Parcelable zaa(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (android.os.Parcelable) creator.createFromParcel(parcel);
    }

    public static void zab(android.os.Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new android.os.BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
    }

    public static void zac(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void zad(android.os.Parcel parcel, android.os.IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}

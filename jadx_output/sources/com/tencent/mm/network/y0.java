package com.tencent.mm.network;

/* loaded from: classes12.dex */
public abstract class y0 {
    public static void a(android.os.Parcel parcel, android.os.Parcelable parcelable, int i17) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i17);
        }
    }

    public static java.lang.Object b(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }
}

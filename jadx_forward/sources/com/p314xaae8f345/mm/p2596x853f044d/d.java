package com.p314xaae8f345.mm.p2596x853f044d;

/* loaded from: classes12.dex */
public class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != -33554431) {
            throw new java.lang.IllegalStateException("Version mismatch, expected: " + java.lang.Integer.toHexString(-33554431) + ", got: " + java.lang.Integer.toHexString(readInt));
        }
        com.p314xaae8f345.mm.p2596x853f044d.C20975x5e37b436 c20975x5e37b436 = new com.p314xaae8f345.mm.p2596x853f044d.C20975x5e37b436(null);
        int readInt2 = parcel.readInt();
        for (int i17 = 0; i17 < readInt2; i17++) {
            c20975x5e37b436.f273870d.add(new com.p314xaae8f345.mm.p2596x853f044d.e(parcel.readLong(), parcel.readLong(), parcel.readLong()));
        }
        int readInt3 = parcel.readInt();
        for (int i18 = 0; i18 < readInt3; i18++) {
            c20975x5e37b436.f273871e.add(new com.p314xaae8f345.mm.p2596x853f044d.f(parcel.readInt(), parcel.readString(), parcel.readString()));
        }
        return c20975x5e37b436;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p2596x853f044d.C20975x5e37b436[i17];
    }
}

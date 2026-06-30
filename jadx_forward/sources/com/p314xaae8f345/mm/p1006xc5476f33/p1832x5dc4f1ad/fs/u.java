package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs;

/* loaded from: classes5.dex */
public final class u implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        long readLong3 = parcel.readLong();
        int readInt = parcel.readInt();
        java.util.HashMap hashMap = new java.util.HashMap(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.C16435xf11ff843(readString, readLong, readLong2, readLong3, hashMap);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.C16435xf11ff843[i17];
    }
}

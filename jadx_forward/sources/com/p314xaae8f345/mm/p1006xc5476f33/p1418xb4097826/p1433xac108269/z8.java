package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class z8 implements android.os.Parcelable.Creator {
    public z8(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.C13678x881de345 c13678x881de345 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.C13678x881de345();
        c13678x881de345.f183518d = parcel.readString();
        c13678x881de345.f183519e = parcel.readString();
        c13678x881de345.f183520f = parcel.readString();
        c13678x881de345.f183521g = parcel.createByteArray();
        c13678x881de345.f183522h = parcel.readLong();
        c13678x881de345.f183523i = parcel.readInt();
        c13678x881de345.f183524m = parcel.readInt();
        return c13678x881de345;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.C13678x881de345[i17];
    }
}

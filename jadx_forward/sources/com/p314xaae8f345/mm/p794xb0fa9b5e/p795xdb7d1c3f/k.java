package com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f;

/* loaded from: classes7.dex */
public class k implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48 c10747xff81be48 = new com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48(null);
        c10747xff81be48.f149876d = parcel.readString();
        if (parcel.readInt() == 1) {
            c10747xff81be48.f149877e = com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.c.c(parcel.readString(), parcel);
        }
        return c10747xff81be48;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48[i17];
    }
}

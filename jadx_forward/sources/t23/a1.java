package t23;

/* loaded from: classes10.dex */
public class a1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b c15631xba892b3b = new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b();
        c15631xba892b3b.f219963e = parcel.readString();
        c15631xba892b3b.f219966h = parcel.readString();
        c15631xba892b3b.f219967i = parcel.readLong();
        c15631xba892b3b.f219968m = parcel.readLong();
        c15631xba892b3b.f219969n = parcel.readString();
        c15631xba892b3b.f219971p = parcel.readString();
        c15631xba892b3b.f219976u = (java.util.HashMap) parcel.readSerializable();
        c15631xba892b3b.f219957v = parcel.readInt();
        c15631xba892b3b.f219958w = parcel.readInt() != 0;
        c15631xba892b3b.f219959x = parcel.readString();
        c15631xba892b3b.f219960y = parcel.readString();
        return c15631xba892b3b;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078[i17];
    }
}

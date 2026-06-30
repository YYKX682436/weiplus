package w25;

/* loaded from: classes12.dex */
public class k implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5.C19584xa6c132d1 c19584xa6c132d1 = new com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5.C19584xa6c132d1();
        c19584xa6c132d1.f270270d = parcel.readDouble();
        c19584xa6c132d1.f270271e = parcel.readDouble();
        c19584xa6c132d1.f270272f = parcel.readInt();
        c19584xa6c132d1.f270273g = parcel.readString();
        java.lang.String readString = parcel.readString();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (readString == null) {
            readString = "";
        }
        c19584xa6c132d1.f270274h = readString;
        java.lang.String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        c19584xa6c132d1.f270275i = readString2;
        java.lang.String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        c19584xa6c132d1.f270276m = readString3;
        c19584xa6c132d1.f270277n = parcel.readInt();
        c19584xa6c132d1.f270278o = (com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011) parcel.readParcelable(com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011.class.getClassLoader());
        java.lang.String readString4 = parcel.readString();
        if (readString4 == null) {
            readString4 = "";
        }
        c19584xa6c132d1.f270279p = readString4;
        c19584xa6c132d1.f270280q = parcel.readInt() == 1;
        c19584xa6c132d1.f270281r = parcel.readString();
        c19584xa6c132d1.f270282s = parcel.readString();
        c19584xa6c132d1.f270283t = parcel.readString();
        c19584xa6c132d1.f270284u = parcel.readFloat();
        c19584xa6c132d1.f270285v = parcel.readString();
        java.lang.String readString5 = parcel.readString();
        if (readString5 == null) {
            readString5 = "";
        }
        c19584xa6c132d1.f270286w = readString5;
        java.lang.String readString6 = parcel.readString();
        c19584xa6c132d1.f270287x = readString6 != null ? readString6 : "";
        return c19584xa6c132d1;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p2470x93e71c27.p2473x714f9fb5.C19584xa6c132d1[i17];
    }
}

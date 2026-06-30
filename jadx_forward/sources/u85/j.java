package u85;

/* loaded from: classes10.dex */
public final class j implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1 c21046x5cf452f1 = new com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1(parcel.readInt());
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        c21046x5cf452f1.f275223e = readString;
        java.lang.String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        c21046x5cf452f1.f275224f = readString2;
        java.lang.String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        c21046x5cf452f1.f275225g = readString3;
        c21046x5cf452f1.f275226h = parcel.readInt();
        java.lang.String readString4 = parcel.readString();
        c21046x5cf452f1.f275227i = readString4 != null ? readString4 : "";
        c21046x5cf452f1.f275228m = parcel.readInt();
        return c21046x5cf452f1;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1[i17];
    }
}

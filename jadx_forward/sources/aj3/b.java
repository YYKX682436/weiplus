package aj3;

/* loaded from: classes14.dex */
public class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 c11143x170c3f54 = new com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54();
        java.lang.String readString = parcel.readString();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (readString == null) {
            readString = "";
        }
        c11143x170c3f54.f153145d = readString;
        java.lang.String readString2 = parcel.readString();
        c11143x170c3f54.f153146e = readString2 != null ? readString2 : "";
        c11143x170c3f54.f153147f = parcel.readInt();
        c11143x170c3f54.f153148g = parcel.readInt();
        c11143x170c3f54.f153149h = parcel.readInt();
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1882x2eefaa.C16567x2d94d91e(c11143x170c3f54);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1882x2eefaa.C16567x2d94d91e[i17];
    }
}

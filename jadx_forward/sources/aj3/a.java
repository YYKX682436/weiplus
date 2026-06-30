package aj3;

/* loaded from: classes14.dex */
public class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a = new com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a();
        java.lang.String readString = parcel.readString();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (readString == null) {
            readString = "";
        }
        c11142xe8e5c41a.f153139d = readString;
        java.lang.String readString2 = parcel.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        c11142xe8e5c41a.f153140e = readString2;
        java.lang.String readString3 = parcel.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        c11142xe8e5c41a.f153141f = readString3;
        c11142xe8e5c41a.f153142g = parcel.readInt();
        java.lang.String readString4 = parcel.readString();
        c11142xe8e5c41a.f153143h = readString4 != null ? readString4 : "";
        int readInt = parcel.readInt();
        c11142xe8e5c41a.f153144i = new java.util.ArrayList();
        for (int i17 = 0; i17 < readInt; i17++) {
            c11142xe8e5c41a.f153144i.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1882x2eefaa.C16567x2d94d91e) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1882x2eefaa.C16567x2d94d91e.class.getClassLoader())).f231028d);
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1882x2eefaa.C16566xb9f28ae4(c11142xe8e5c41a);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1882x2eefaa.C16566xb9f28ae4[i17];
    }
}

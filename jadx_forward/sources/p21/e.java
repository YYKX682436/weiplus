package p21;

/* loaded from: classes14.dex */
public class e implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a = new com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a();
        c11142xe8e5c41a.f153139d = parcel.readString();
        c11142xe8e5c41a.f153140e = parcel.readString();
        c11142xe8e5c41a.f153141f = parcel.readString();
        c11142xe8e5c41a.f153142g = parcel.readInt();
        c11142xe8e5c41a.f153143h = parcel.readString();
        int readInt = parcel.readInt();
        c11142xe8e5c41a.f153144i = new java.util.ArrayList();
        for (int i17 = 0; i17 < readInt; i17++) {
            com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54 c11143x170c3f54 = (com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54) parcel.readParcelable(com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54.class.getClassLoader());
            if (c11143x170c3f54 != null) {
                c11142xe8e5c41a.f153144i.add(c11143x170c3f54);
            }
        }
        return c11142xe8e5c41a;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a[i17];
    }
}

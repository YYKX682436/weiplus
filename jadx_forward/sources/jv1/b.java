package jv1;

/* loaded from: classes8.dex */
public class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f c13092x802fa47f = new com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f();
        c13092x802fa47f.f177044d = parcel.readInt();
        c13092x802fa47f.f177045e = parcel.readLong();
        c13092x802fa47f.f177046f = parcel.readLong();
        return c13092x802fa47f;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1319xb1dfbf22.ipc.C13092x802fa47f[i17];
    }
}

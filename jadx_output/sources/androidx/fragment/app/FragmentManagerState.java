package androidx.fragment.app;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class FragmentManagerState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentManagerState> CREATOR = new androidx.fragment.app.u1();

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f11215d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f11216e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.fragment.app.BackStackState[] f11217f;

    /* renamed from: g, reason: collision with root package name */
    public int f11218g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f11219h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f11220i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f11221m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f11222n;

    public FragmentManagerState() {
        this.f11219h = null;
        this.f11220i = new java.util.ArrayList();
        this.f11221m = new java.util.ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeTypedList(this.f11215d);
        parcel.writeStringList(this.f11216e);
        parcel.writeTypedArray(this.f11217f, i17);
        parcel.writeInt(this.f11218g);
        parcel.writeString(this.f11219h);
        parcel.writeStringList(this.f11220i);
        parcel.writeTypedList(this.f11221m);
        parcel.writeTypedList(this.f11222n);
    }

    public FragmentManagerState(android.os.Parcel parcel) {
        this.f11219h = null;
        this.f11220i = new java.util.ArrayList();
        this.f11221m = new java.util.ArrayList();
        this.f11215d = parcel.createTypedArrayList(androidx.fragment.app.FragmentState.CREATOR);
        this.f11216e = parcel.createStringArrayList();
        this.f11217f = (androidx.fragment.app.BackStackState[]) parcel.createTypedArray(androidx.fragment.app.BackStackState.CREATOR);
        this.f11218g = parcel.readInt();
        this.f11219h = parcel.readString();
        this.f11220i = parcel.createStringArrayList();
        this.f11221m = parcel.createTypedArrayList(android.os.Bundle.CREATOR);
        this.f11222n = parcel.createTypedArrayList(androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}

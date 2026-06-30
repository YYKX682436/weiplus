package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState */
/* loaded from: classes13.dex */
class C0075x7bb65b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0075x7bb65b> f101x681a0c0c = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.p();

    /* renamed from: d, reason: collision with root package name */
    public int f90868d;

    public C0075x7bb65b(android.os.Parcel parcel) {
        this.f90868d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f90868d);
    }
}

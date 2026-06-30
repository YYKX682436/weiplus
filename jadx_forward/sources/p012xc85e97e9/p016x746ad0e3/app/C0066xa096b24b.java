package p012xc85e97e9.p016x746ad0e3.app;

/* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState */
/* loaded from: classes8.dex */
class C0066xa096b24b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p012xc85e97e9.p016x746ad0e3.app.C0066xa096b24b> f94x681a0c0c = new p012xc85e97e9.p016x746ad0e3.app.d0();

    /* renamed from: d, reason: collision with root package name */
    public int f90606d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f90607e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Bundle f90608f;

    public static p012xc85e97e9.p016x746ad0e3.app.C0066xa096b24b a(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        p012xc85e97e9.p016x746ad0e3.app.C0066xa096b24b c0066xa096b24b = new p012xc85e97e9.p016x746ad0e3.app.C0066xa096b24b();
        c0066xa096b24b.f90606d = parcel.readInt();
        boolean z17 = parcel.readInt() == 1;
        c0066xa096b24b.f90607e = z17;
        if (z17) {
            c0066xa096b24b.f90608f = parcel.readBundle(classLoader);
        }
        return c0066xa096b24b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f90606d);
        parcel.writeInt(this.f90607e ? 1 : 0);
        if (this.f90607e) {
            parcel.writeBundle(this.f90608f);
        }
    }
}

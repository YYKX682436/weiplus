package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem */
/* loaded from: classes13.dex */
class C1165xc8ca1c25 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p012xc85e97e9.p103xe821e364.p104xd1075a44.C1165xc8ca1c25> f3610x681a0c0c = new p012xc85e97e9.p103xe821e364.p104xd1075a44.u3();

    /* renamed from: d, reason: collision with root package name */
    public int f93475d;

    /* renamed from: e, reason: collision with root package name */
    public int f93476e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f93477f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93478g;

    public C1165xc8ca1c25(android.os.Parcel parcel) {
        this.f93475d = parcel.readInt();
        this.f93476e = parcel.readInt();
        this.f93478g = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f93477f = iArr;
            parcel.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m8104x9616526c() {
        return "FullSpanItem{mPosition=" + this.f93475d + ", mGapDir=" + this.f93476e + ", mHasUnwantedGapAfter=" + this.f93478g + ", mGapPerSpan=" + java.util.Arrays.toString(this.f93477f) + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f93475d);
        parcel.writeInt(this.f93476e);
        parcel.writeInt(this.f93478g ? 1 : 0);
        int[] iArr = this.f93477f;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f93477f);
        }
    }
}

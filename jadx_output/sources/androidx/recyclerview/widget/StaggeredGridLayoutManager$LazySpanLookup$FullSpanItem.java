package androidx.recyclerview.widget;

/* loaded from: classes13.dex */
class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new androidx.recyclerview.widget.u3();

    /* renamed from: d, reason: collision with root package name */
    public int f11942d;

    /* renamed from: e, reason: collision with root package name */
    public int f11943e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f11944f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11945g;

    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(android.os.Parcel parcel) {
        this.f11942d = parcel.readInt();
        this.f11943e = parcel.readInt();
        this.f11945g = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f11944f = iArr;
            parcel.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "FullSpanItem{mPosition=" + this.f11942d + ", mGapDir=" + this.f11943e + ", mHasUnwantedGapAfter=" + this.f11945g + ", mGapPerSpan=" + java.util.Arrays.toString(this.f11944f) + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f11942d);
        parcel.writeInt(this.f11943e);
        parcel.writeInt(this.f11945g ? 1 : 0);
        int[] iArr = this.f11944f;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f11944f);
        }
    }
}

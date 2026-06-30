package coil.size;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/size/PixelSize;", "Lcoil/size/Size;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes10.dex */
public final /* data */ class PixelSize extends coil.size.Size {
    public static final android.os.Parcelable.Creator<coil.size.PixelSize> CREATOR = new d6.c();

    /* renamed from: d, reason: collision with root package name */
    public final int f43912d;

    /* renamed from: e, reason: collision with root package name */
    public final int f43913e;

    public PixelSize(int i17, int i18) {
        super(null);
        this.f43912d = i17;
        this.f43913e = i18;
        if (!(i17 > 0 && i18 > 0)) {
            throw new java.lang.IllegalArgumentException("width and height must be > 0.".toString());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coil.size.PixelSize)) {
            return false;
        }
        coil.size.PixelSize pixelSize = (coil.size.PixelSize) obj;
        return this.f43912d == pixelSize.f43912d && this.f43913e == pixelSize.f43913e;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f43912d) * 31) + java.lang.Integer.hashCode(this.f43913e);
    }

    public java.lang.String toString() {
        return "PixelSize(width=" + this.f43912d + ", height=" + this.f43913e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f43912d);
        out.writeInt(this.f43913e);
    }
}

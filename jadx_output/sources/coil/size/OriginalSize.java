package coil.size;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/size/OriginalSize;", "Lcoil/size/Size;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes10.dex */
public final class OriginalSize extends coil.size.Size {

    /* renamed from: d, reason: collision with root package name */
    public static final coil.size.OriginalSize f43911d = new coil.size.OriginalSize();
    public static final android.os.Parcelable.Creator<coil.size.OriginalSize> CREATOR = new d6.b();

    public OriginalSize() {
        super(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "coil.size.OriginalSize";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(1);
    }
}

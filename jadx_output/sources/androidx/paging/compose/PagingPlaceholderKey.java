package androidx.paging.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/compose/PagingPlaceholderKey;", "Landroid/os/Parcelable;", "paging-compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
final /* data */ class PagingPlaceholderKey implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.paging.compose.PagingPlaceholderKey> CREATOR = new androidx.paging.compose.k();

    /* renamed from: d, reason: collision with root package name */
    public final int f11709d;

    public PagingPlaceholderKey(int i17) {
        this.f11709d = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.paging.compose.PagingPlaceholderKey) && this.f11709d == ((androidx.paging.compose.PagingPlaceholderKey) obj).f11709d;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f11709d);
    }

    public java.lang.String toString() {
        return "PagingPlaceholderKey(index=" + this.f11709d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f11709d);
    }
}

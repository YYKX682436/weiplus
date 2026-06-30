package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "foundation_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final /* data */ class DefaultLazyKey implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.compose.foundation.lazy.layout.DefaultLazyKey> CREATOR = new androidx.compose.foundation.lazy.layout.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f10389d;

    public DefaultLazyKey(int i17) {
        this.f10389d = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.compose.foundation.lazy.layout.DefaultLazyKey) && this.f10389d == ((androidx.compose.foundation.lazy.layout.DefaultLazyKey) obj).f10389d;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f10389d);
    }

    public java.lang.String toString() {
        return "DefaultLazyKey(index=" + this.f10389d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f10389d);
    }
}

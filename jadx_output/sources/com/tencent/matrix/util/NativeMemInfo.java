package com.tencent.matrix.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/matrix/util/NativeMemInfo;", "Landroid/os/Parcelable;", "CREATOR", "oj/u", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes11.dex */
public final /* data */ class NativeMemInfo implements android.os.Parcelable {
    public static final oj.u CREATOR = new oj.u(null);

    /* renamed from: d, reason: collision with root package name */
    public final long f53105d;

    /* renamed from: e, reason: collision with root package name */
    public final long f53106e;

    /* renamed from: f, reason: collision with root package name */
    public final long f53107f;

    public NativeMemInfo(long j17, long j18, long j19) {
        this.f53105d = j17;
        this.f53106e = j18;
        this.f53107f = j19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.matrix.util.NativeMemInfo)) {
            return false;
        }
        com.tencent.matrix.util.NativeMemInfo nativeMemInfo = (com.tencent.matrix.util.NativeMemInfo) obj;
        return this.f53105d == nativeMemInfo.f53105d && this.f53106e == nativeMemInfo.f53106e && this.f53107f == nativeMemInfo.f53107f;
    }

    public int hashCode() {
        long j17 = this.f53105d;
        long j18 = this.f53106e;
        int i17 = ((((int) (j17 ^ (j17 >>> 32))) * 31) + ((int) (j18 ^ (j18 >>> 32)))) * 31;
        long j19 = this.f53107f;
        return i17 + ((int) ((j19 >>> 32) ^ j19));
    }

    public java.lang.String toString() {
        java.lang.String format = java.lang.String.format("%-21s %-21s %-21s", java.util.Arrays.copyOf(new java.lang.Object[]{"Used=" + this.f53107f + " B", "Recycled=" + this.f53106e + " B", "HeapSize=" + this.f53105d + " B"}, 3));
        kotlin.jvm.internal.o.f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeLong(this.f53105d);
        parcel.writeLong(this.f53106e);
        parcel.writeLong(this.f53107f);
    }
}

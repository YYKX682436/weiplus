package com.tencent.matrix.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/matrix/util/JavaMemInfo;", "Landroid/os/Parcelable;", "CREATOR", "oj/f", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes11.dex */
public final /* data */ class JavaMemInfo implements android.os.Parcelable {
    public static final oj.f CREATOR = new oj.f(null);

    /* renamed from: d, reason: collision with root package name */
    public final long f53089d;

    /* renamed from: e, reason: collision with root package name */
    public final long f53090e;

    /* renamed from: f, reason: collision with root package name */
    public final long f53091f;

    /* renamed from: g, reason: collision with root package name */
    public final long f53092g;

    /* renamed from: h, reason: collision with root package name */
    public final int f53093h;

    /* renamed from: i, reason: collision with root package name */
    public final int f53094i;

    public JavaMemInfo(long j17, long j18, long j19, long j27, int i17, int i18) {
        this.f53089d = j17;
        this.f53090e = j18;
        this.f53091f = j19;
        this.f53092g = j27;
        this.f53093h = i17;
        this.f53094i = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.matrix.util.JavaMemInfo)) {
            return false;
        }
        com.tencent.matrix.util.JavaMemInfo javaMemInfo = (com.tencent.matrix.util.JavaMemInfo) obj;
        return this.f53089d == javaMemInfo.f53089d && this.f53090e == javaMemInfo.f53090e && this.f53091f == javaMemInfo.f53091f && this.f53092g == javaMemInfo.f53092g && this.f53093h == javaMemInfo.f53093h && this.f53094i == javaMemInfo.f53094i;
    }

    public int hashCode() {
        long j17 = this.f53089d;
        long j18 = this.f53090e;
        int i17 = ((((int) (j17 ^ (j17 >>> 32))) * 31) + ((int) (j18 ^ (j18 >>> 32)))) * 31;
        long j19 = this.f53091f;
        int i18 = (i17 + ((int) (j19 ^ (j19 >>> 32)))) * 31;
        long j27 = this.f53092g;
        return ((((i18 + ((int) ((j27 >>> 32) ^ j27))) * 31) + this.f53093h) * 31) + this.f53094i;
    }

    public java.lang.String toString() {
        java.lang.String format = java.lang.String.format("%-21s %-21s %-21s %-21s %-21s %-21s", java.util.Arrays.copyOf(new java.lang.Object[]{"Used=" + this.f53091f + " B", "Recycled=" + this.f53090e + " B", "HeapSize=" + this.f53089d + " B", "Max=" + this.f53092g + " B", "MemClass:" + this.f53093h + " M", "LargeMemClass=" + this.f53094i + " M"}, 6));
        kotlin.jvm.internal.o.f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeLong(this.f53089d);
        parcel.writeLong(this.f53090e);
        parcel.writeLong(this.f53091f);
        parcel.writeLong(this.f53092g);
        parcel.writeInt(this.f53093h);
        parcel.writeInt(this.f53094i);
    }
}

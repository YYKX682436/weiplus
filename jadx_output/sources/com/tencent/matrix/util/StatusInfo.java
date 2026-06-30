package com.tencent.matrix.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/matrix/util/StatusInfo;", "Landroid/os/Parcelable;", "oj/h0", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes11.dex */
public final /* data */ class StatusInfo implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f53127d;

    /* renamed from: e, reason: collision with root package name */
    public final long f53128e;

    /* renamed from: f, reason: collision with root package name */
    public final long f53129f;

    /* renamed from: g, reason: collision with root package name */
    public final long f53130g;

    /* renamed from: h, reason: collision with root package name */
    public final long f53131h;

    /* renamed from: i, reason: collision with root package name */
    public final long f53132i;

    /* renamed from: m, reason: collision with root package name */
    public final int f53133m;

    /* renamed from: n, reason: collision with root package name */
    public final int f53134n;

    /* renamed from: o, reason: collision with root package name */
    public static final oj.h0 f53126o = new oj.h0(null);
    public static final android.os.Parcelable.Creator<com.tencent.matrix.util.StatusInfo> CREATOR = new oj.e0();

    public StatusInfo(java.lang.String state, long j17, long j18, long j19, long j27, long j28, int i17, int i18) {
        kotlin.jvm.internal.o.g(state, "state");
        this.f53127d = state;
        this.f53128e = j17;
        this.f53129f = j18;
        this.f53130g = j19;
        this.f53131h = j27;
        this.f53132i = j28;
        this.f53133m = i17;
        this.f53134n = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.matrix.util.StatusInfo)) {
            return false;
        }
        com.tencent.matrix.util.StatusInfo statusInfo = (com.tencent.matrix.util.StatusInfo) obj;
        return kotlin.jvm.internal.o.b(this.f53127d, statusInfo.f53127d) && this.f53128e == statusInfo.f53128e && this.f53129f == statusInfo.f53129f && this.f53130g == statusInfo.f53130g && this.f53131h == statusInfo.f53131h && this.f53132i == statusInfo.f53132i && this.f53133m == statusInfo.f53133m && this.f53134n == statusInfo.f53134n;
    }

    public int hashCode() {
        java.lang.String str = this.f53127d;
        int hashCode = str != null ? str.hashCode() : 0;
        long j17 = this.f53128e;
        int i17 = ((hashCode * 31) + ((int) (j17 ^ (j17 >>> 32)))) * 31;
        long j18 = this.f53129f;
        int i18 = (i17 + ((int) (j18 ^ (j18 >>> 32)))) * 31;
        long j19 = this.f53130g;
        int i19 = (i18 + ((int) (j19 ^ (j19 >>> 32)))) * 31;
        long j27 = this.f53131h;
        int i27 = (i19 + ((int) (j27 ^ (j27 >>> 32)))) * 31;
        long j28 = this.f53132i;
        return ((((i27 + ((int) (j28 ^ (j28 >>> 32)))) * 31) + this.f53133m) * 31) + this.f53134n;
    }

    public java.lang.String toString() {
        java.lang.String format = java.lang.String.format("%-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s", java.util.Arrays.copyOf(new java.lang.Object[]{"State=" + this.f53127d, "FDSize=" + this.f53128e, "VmSize=" + this.f53129f + " K", "VmRss=" + this.f53130g + " K", "VmSwap=" + this.f53131h + " K", "Threads=" + this.f53132i, "oom_adj=" + this.f53133m, "oom_score_adj=" + this.f53134n}, 8));
        kotlin.jvm.internal.o.f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f53127d);
        parcel.writeLong(this.f53128e);
        parcel.writeLong(this.f53129f);
        parcel.writeLong(this.f53130g);
        parcel.writeLong(this.f53131h);
        parcel.writeLong(this.f53132i);
        parcel.writeInt(this.f53133m);
        parcel.writeInt(this.f53134n);
    }
}

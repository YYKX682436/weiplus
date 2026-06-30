package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public class AppBrandPreloadProfiler implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler> CREATOR = new com.tencent.mm.plugin.appbrand.task.q();

    /* renamed from: d, reason: collision with root package name */
    public long f88978d;

    /* renamed from: e, reason: collision with root package name */
    public int f88979e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f88980f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f88981g;

    /* renamed from: h, reason: collision with root package name */
    public long f88982h;

    /* renamed from: i, reason: collision with root package name */
    public long f88983i;

    /* renamed from: m, reason: collision with root package name */
    public long f88984m;

    /* renamed from: n, reason: collision with root package name */
    public long f88985n;

    public AppBrandPreloadProfiler() {
        this.f88978d = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f88982h = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f88983i = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f88984m = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f88985n = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        long j17 = this.f88978d;
        if (j17 != com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            long j18 = this.f88982h;
            if (j18 != com.tencent.wcdb.core.Database.DictDefaultMatchValue && this.f88983i != com.tencent.wcdb.core.Database.DictDefaultMatchValue && this.f88984m != com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                return com.tencent.mm.sdk.platformtools.t8.z1("[AppBrandPreloadProfiler] process-start costs [%d]ms, trans-thread costs [%d]ms, preload component costs [%d]ms", java.lang.Long.valueOf(j18 - j17), java.lang.Long.valueOf(this.f88983i - this.f88982h), java.lang.Long.valueOf(this.f88984m - this.f88983i));
            }
        }
        return com.tencent.mm.sdk.platformtools.t8.z1("[AppBrandPreloadProfiler] in panic req = [%d]ms, process = [%d]ms, start = [%d]ms, end = [%d]ms", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f88982h), java.lang.Long.valueOf(this.f88983i), java.lang.Long.valueOf(this.f88984m));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f88978d);
        parcel.writeLong(this.f88982h);
        parcel.writeLong(this.f88983i);
        parcel.writeLong(this.f88984m);
        parcel.writeLong(this.f88985n);
        parcel.writeString(this.f88980f);
        parcel.writeString(this.f88981g);
    }

    public AppBrandPreloadProfiler(android.os.Parcel parcel) {
        this.f88978d = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f88982h = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f88983i = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f88984m = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f88985n = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f88978d = parcel.readLong();
        this.f88982h = parcel.readLong();
        this.f88983i = parcel.readLong();
        this.f88984m = parcel.readLong();
        this.f88985n = parcel.readLong();
        this.f88980f = parcel.readString();
        this.f88981g = parcel.readString();
    }
}

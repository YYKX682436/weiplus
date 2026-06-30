package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* renamed from: com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler */
/* loaded from: classes7.dex */
public class C12596x96aa9e2c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c> f35260x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.q();

    /* renamed from: d, reason: collision with root package name */
    public long f170511d;

    /* renamed from: e, reason: collision with root package name */
    public int f170512e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f170513f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f170514g;

    /* renamed from: h, reason: collision with root package name */
    public long f170515h;

    /* renamed from: i, reason: collision with root package name */
    public long f170516i;

    /* renamed from: m, reason: collision with root package name */
    public long f170517m;

    /* renamed from: n, reason: collision with root package name */
    public long f170518n;

    public C12596x96aa9e2c() {
        this.f170511d = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f170515h = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f170516i = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f170517m = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f170518n = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m52759x9616526c() {
        long j17 = this.f170511d;
        if (j17 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
            long j18 = this.f170515h;
            if (j18 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 && this.f170516i != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 && this.f170517m != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("[AppBrandPreloadProfiler] process-start costs [%d]ms, trans-thread costs [%d]ms, preload component costs [%d]ms", java.lang.Long.valueOf(j18 - j17), java.lang.Long.valueOf(this.f170516i - this.f170515h), java.lang.Long.valueOf(this.f170517m - this.f170516i));
            }
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("[AppBrandPreloadProfiler] in panic req = [%d]ms, process = [%d]ms, start = [%d]ms, end = [%d]ms", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.f170515h), java.lang.Long.valueOf(this.f170516i), java.lang.Long.valueOf(this.f170517m));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f170511d);
        parcel.writeLong(this.f170515h);
        parcel.writeLong(this.f170516i);
        parcel.writeLong(this.f170517m);
        parcel.writeLong(this.f170518n);
        parcel.writeString(this.f170513f);
        parcel.writeString(this.f170514g);
    }

    public C12596x96aa9e2c(android.os.Parcel parcel) {
        this.f170511d = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f170515h = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f170516i = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f170517m = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f170518n = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f170511d = parcel.readLong();
        this.f170515h = parcel.readLong();
        this.f170516i = parcel.readLong();
        this.f170517m = parcel.readLong();
        this.f170518n = parcel.readLong();
        this.f170513f = parcel.readString();
        this.f170514g = parcel.readString();
    }
}

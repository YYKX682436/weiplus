package com.p314xaae8f345.p552xbf8d97c1.p590x36f002;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/matrix/util/JavaMemInfo;", "Landroid/os/Parcelable;", "CREATOR", "oj/f", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.util.JavaMemInfo */
/* loaded from: classes11.dex */
public final /* data */ class C4719xe988d781 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final oj.f f20052x681a0c0c = new oj.f(null);

    /* renamed from: d, reason: collision with root package name */
    public final long f134622d;

    /* renamed from: e, reason: collision with root package name */
    public final long f134623e;

    /* renamed from: f, reason: collision with root package name */
    public final long f134624f;

    /* renamed from: g, reason: collision with root package name */
    public final long f134625g;

    /* renamed from: h, reason: collision with root package name */
    public final int f134626h;

    /* renamed from: i, reason: collision with root package name */
    public final int f134627i;

    public C4719xe988d781(long j17, long j18, long j19, long j27, int i17, int i18) {
        this.f134622d = j17;
        this.f134623e = j18;
        this.f134624f = j19;
        this.f134625g = j27;
        this.f134626h = i17;
        this.f134627i = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m41317xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4719xe988d781)) {
            return false;
        }
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4719xe988d781 c4719xe988d781 = (com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4719xe988d781) obj;
        return this.f134622d == c4719xe988d781.f134622d && this.f134623e == c4719xe988d781.f134623e && this.f134624f == c4719xe988d781.f134624f && this.f134625g == c4719xe988d781.f134625g && this.f134626h == c4719xe988d781.f134626h && this.f134627i == c4719xe988d781.f134627i;
    }

    /* renamed from: hashCode */
    public int m41318x8cdac1b() {
        long j17 = this.f134622d;
        long j18 = this.f134623e;
        int i17 = ((((int) (j17 ^ (j17 >>> 32))) * 31) + ((int) (j18 ^ (j18 >>> 32)))) * 31;
        long j19 = this.f134624f;
        int i18 = (i17 + ((int) (j19 ^ (j19 >>> 32)))) * 31;
        long j27 = this.f134625g;
        return ((((i18 + ((int) ((j27 >>> 32) ^ j27))) * 31) + this.f134626h) * 31) + this.f134627i;
    }

    /* renamed from: toString */
    public java.lang.String m41319x9616526c() {
        java.lang.String format = java.lang.String.format("%-21s %-21s %-21s %-21s %-21s %-21s", java.util.Arrays.copyOf(new java.lang.Object[]{"Used=" + this.f134624f + " B", "Recycled=" + this.f134623e + " B", "HeapSize=" + this.f134622d + " B", "Max=" + this.f134625g + " B", "MemClass:" + this.f134626h + " M", "LargeMemClass=" + this.f134627i + " M"}, 6));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeLong(this.f134622d);
        parcel.writeLong(this.f134623e);
        parcel.writeLong(this.f134624f);
        parcel.writeLong(this.f134625g);
        parcel.writeInt(this.f134626h);
        parcel.writeInt(this.f134627i);
    }
}

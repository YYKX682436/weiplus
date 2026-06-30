package com.p314xaae8f345.p552xbf8d97c1.p590x36f002;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/matrix/util/NativeMemInfo;", "Landroid/os/Parcelable;", "CREATOR", "oj/u", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.util.NativeMemInfo */
/* loaded from: classes11.dex */
public final /* data */ class C4721x2f1a0bec implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final oj.u f20054x681a0c0c = new oj.u(null);

    /* renamed from: d, reason: collision with root package name */
    public final long f134638d;

    /* renamed from: e, reason: collision with root package name */
    public final long f134639e;

    /* renamed from: f, reason: collision with root package name */
    public final long f134640f;

    public C4721x2f1a0bec(long j17, long j18, long j19) {
        this.f134638d = j17;
        this.f134639e = j18;
        this.f134640f = j19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m41325xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4721x2f1a0bec)) {
            return false;
        }
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4721x2f1a0bec c4721x2f1a0bec = (com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4721x2f1a0bec) obj;
        return this.f134638d == c4721x2f1a0bec.f134638d && this.f134639e == c4721x2f1a0bec.f134639e && this.f134640f == c4721x2f1a0bec.f134640f;
    }

    /* renamed from: hashCode */
    public int m41326x8cdac1b() {
        long j17 = this.f134638d;
        long j18 = this.f134639e;
        int i17 = ((((int) (j17 ^ (j17 >>> 32))) * 31) + ((int) (j18 ^ (j18 >>> 32)))) * 31;
        long j19 = this.f134640f;
        return i17 + ((int) ((j19 >>> 32) ^ j19));
    }

    /* renamed from: toString */
    public java.lang.String m41327x9616526c() {
        java.lang.String format = java.lang.String.format("%-21s %-21s %-21s", java.util.Arrays.copyOf(new java.lang.Object[]{"Used=" + this.f134640f + " B", "Recycled=" + this.f134639e + " B", "HeapSize=" + this.f134638d + " B"}, 3));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeLong(this.f134638d);
        parcel.writeLong(this.f134639e);
        parcel.writeLong(this.f134640f);
    }
}

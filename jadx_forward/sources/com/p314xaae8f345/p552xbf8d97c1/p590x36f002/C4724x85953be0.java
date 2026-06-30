package com.p314xaae8f345.p552xbf8d97c1.p590x36f002;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/matrix/util/StatusInfo;", "Landroid/os/Parcelable;", "oj/h0", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.util.StatusInfo */
/* loaded from: classes11.dex */
public final /* data */ class C4724x85953be0 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f134660d;

    /* renamed from: e, reason: collision with root package name */
    public final long f134661e;

    /* renamed from: f, reason: collision with root package name */
    public final long f134662f;

    /* renamed from: g, reason: collision with root package name */
    public final long f134663g;

    /* renamed from: h, reason: collision with root package name */
    public final long f134664h;

    /* renamed from: i, reason: collision with root package name */
    public final long f134665i;

    /* renamed from: m, reason: collision with root package name */
    public final int f134666m;

    /* renamed from: n, reason: collision with root package name */
    public final int f134667n;

    /* renamed from: o, reason: collision with root package name */
    public static final oj.h0 f134659o = new oj.h0(null);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4724x85953be0> f20057x681a0c0c = new oj.e0();

    public C4724x85953be0(java.lang.String state, long j17, long j18, long j19, long j27, long j28, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f134660d = state;
        this.f134661e = j17;
        this.f134662f = j18;
        this.f134663g = j19;
        this.f134664h = j27;
        this.f134665i = j28;
        this.f134666m = i17;
        this.f134667n = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m41337xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4724x85953be0)) {
            return false;
        }
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4724x85953be0 c4724x85953be0 = (com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4724x85953be0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134660d, c4724x85953be0.f134660d) && this.f134661e == c4724x85953be0.f134661e && this.f134662f == c4724x85953be0.f134662f && this.f134663g == c4724x85953be0.f134663g && this.f134664h == c4724x85953be0.f134664h && this.f134665i == c4724x85953be0.f134665i && this.f134666m == c4724x85953be0.f134666m && this.f134667n == c4724x85953be0.f134667n;
    }

    /* renamed from: hashCode */
    public int m41338x8cdac1b() {
        java.lang.String str = this.f134660d;
        int hashCode = str != null ? str.hashCode() : 0;
        long j17 = this.f134661e;
        int i17 = ((hashCode * 31) + ((int) (j17 ^ (j17 >>> 32)))) * 31;
        long j18 = this.f134662f;
        int i18 = (i17 + ((int) (j18 ^ (j18 >>> 32)))) * 31;
        long j19 = this.f134663g;
        int i19 = (i18 + ((int) (j19 ^ (j19 >>> 32)))) * 31;
        long j27 = this.f134664h;
        int i27 = (i19 + ((int) (j27 ^ (j27 >>> 32)))) * 31;
        long j28 = this.f134665i;
        return ((((i27 + ((int) (j28 ^ (j28 >>> 32)))) * 31) + this.f134666m) * 31) + this.f134667n;
    }

    /* renamed from: toString */
    public java.lang.String m41339x9616526c() {
        java.lang.String format = java.lang.String.format("%-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s", java.util.Arrays.copyOf(new java.lang.Object[]{"State=" + this.f134660d, "FDSize=" + this.f134661e, "VmSize=" + this.f134662f + " K", "VmRss=" + this.f134663g + " K", "VmSwap=" + this.f134664h + " K", "Threads=" + this.f134665i, "oom_adj=" + this.f134666m, "oom_score_adj=" + this.f134667n}, 8));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f134660d);
        parcel.writeLong(this.f134661e);
        parcel.writeLong(this.f134662f);
        parcel.writeLong(this.f134663g);
        parcel.writeLong(this.f134664h);
        parcel.writeLong(this.f134665i);
        parcel.writeInt(this.f134666m);
        parcel.writeInt(this.f134667n);
    }
}

package com.p314xaae8f345.p552xbf8d97c1.p590x36f002;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/matrix/util/SystemInfo;", "Landroid/os/Parcelable;", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.util.SystemInfo */
/* loaded from: classes11.dex */
public final /* data */ class C4725x9d1e779d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4725x9d1e779d> f20058x681a0c0c = new oj.i0();

    /* renamed from: d, reason: collision with root package name */
    public final long f134668d;

    /* renamed from: e, reason: collision with root package name */
    public final long f134669e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f134670f;

    /* renamed from: g, reason: collision with root package name */
    public final long f134671g;

    public C4725x9d1e779d(long j17, long j18, boolean z17, long j19) {
        this.f134668d = j17;
        this.f134669e = j18;
        this.f134670f = z17;
        this.f134671g = j19;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("totalMemByte", this.f134668d);
            jSONObject2.put("availMemByte", this.f134669e);
            jSONObject2.put("lowMem", this.f134670f);
            jSONObject2.put("threshold", this.f134671g);
            return jSONObject2;
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.MemoryInfoFactory", th6, "", new java.lang.Object[0]);
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m41341xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4725x9d1e779d)) {
            return false;
        }
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4725x9d1e779d c4725x9d1e779d = (com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4725x9d1e779d) obj;
        return this.f134668d == c4725x9d1e779d.f134668d && this.f134669e == c4725x9d1e779d.f134669e && this.f134670f == c4725x9d1e779d.f134670f && this.f134671g == c4725x9d1e779d.f134671g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m41342x8cdac1b() {
        long j17 = this.f134668d;
        long j18 = this.f134669e;
        int i17 = ((((int) (j17 ^ (j17 >>> 32))) * 31) + ((int) (j18 ^ (j18 >>> 32)))) * 31;
        boolean z17 = this.f134670f;
        int i18 = z17;
        if (z17 != 0) {
            i18 = 1;
        }
        long j19 = this.f134671g;
        return ((i17 + i18) * 31) + ((int) ((j19 >>> 32) ^ j19));
    }

    /* renamed from: toString */
    public java.lang.String m41343x9616526c() {
        java.lang.String format = java.lang.String.format("%-21s %-21s %-21s %-21s", java.util.Arrays.copyOf(new java.lang.Object[]{"totalMem=" + this.f134668d + " B", "availMem=" + this.f134669e + " B", "lowMemory=" + this.f134670f, "threshold=" + this.f134671g + " B"}, 4));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeLong(this.f134668d);
        parcel.writeLong(this.f134669e);
        parcel.writeByte(this.f134670f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f134671g);
    }
}

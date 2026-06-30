package com.tencent.matrix.util;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/matrix/util/SystemInfo;", "Landroid/os/Parcelable;", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes11.dex */
public final /* data */ class SystemInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.matrix.util.SystemInfo> CREATOR = new oj.i0();

    /* renamed from: d, reason: collision with root package name */
    public final long f53135d;

    /* renamed from: e, reason: collision with root package name */
    public final long f53136e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f53137f;

    /* renamed from: g, reason: collision with root package name */
    public final long f53138g;

    public SystemInfo(long j17, long j18, boolean z17, long j19) {
        this.f53135d = j17;
        this.f53136e = j18;
        this.f53137f = z17;
        this.f53138g = j19;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("totalMemByte", this.f53135d);
            jSONObject2.put("availMemByte", this.f53136e);
            jSONObject2.put("lowMem", this.f53137f);
            jSONObject2.put("threshold", this.f53138g);
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

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.matrix.util.SystemInfo)) {
            return false;
        }
        com.tencent.matrix.util.SystemInfo systemInfo = (com.tencent.matrix.util.SystemInfo) obj;
        return this.f53135d == systemInfo.f53135d && this.f53136e == systemInfo.f53136e && this.f53137f == systemInfo.f53137f && this.f53138g == systemInfo.f53138g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        long j17 = this.f53135d;
        long j18 = this.f53136e;
        int i17 = ((((int) (j17 ^ (j17 >>> 32))) * 31) + ((int) (j18 ^ (j18 >>> 32)))) * 31;
        boolean z17 = this.f53137f;
        int i18 = z17;
        if (z17 != 0) {
            i18 = 1;
        }
        long j19 = this.f53138g;
        return ((i17 + i18) * 31) + ((int) ((j19 >>> 32) ^ j19));
    }

    public java.lang.String toString() {
        java.lang.String format = java.lang.String.format("%-21s %-21s %-21s %-21s", java.util.Arrays.copyOf(new java.lang.Object[]{"totalMem=" + this.f53135d + " B", "availMem=" + this.f53136e + " B", "lowMemory=" + this.f53137f, "threshold=" + this.f53138g + " B"}, 4));
        kotlin.jvm.internal.o.f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeLong(this.f53135d);
        parcel.writeLong(this.f53136e);
        parcel.writeByte(this.f53137f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f53138g);
    }
}

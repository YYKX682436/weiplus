package com.tencent.matrix.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/matrix/util/PssInfo;", "Landroid/os/Parcelable;", "oj/y", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final /* data */ class PssInfo implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public int f53114d;

    /* renamed from: e, reason: collision with root package name */
    public int f53115e;

    /* renamed from: f, reason: collision with root package name */
    public int f53116f;

    /* renamed from: g, reason: collision with root package name */
    public int f53117g;

    /* renamed from: h, reason: collision with root package name */
    public int f53118h;

    /* renamed from: i, reason: collision with root package name */
    public int f53119i;

    /* renamed from: m, reason: collision with root package name */
    public int f53120m;

    /* renamed from: n, reason: collision with root package name */
    public int f53121n;

    /* renamed from: o, reason: collision with root package name */
    public int f53122o;

    /* renamed from: p, reason: collision with root package name */
    public int f53123p;

    /* renamed from: q, reason: collision with root package name */
    public int f53124q;

    /* renamed from: r, reason: collision with root package name */
    public int f53125r;

    /* renamed from: s, reason: collision with root package name */
    public static final oj.y f53113s = new oj.y(null);
    public static final android.os.Parcelable.Creator<com.tencent.matrix.util.PssInfo> CREATOR = new oj.w();

    public PssInfo(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49) {
        this.f53114d = i17;
        this.f53115e = i18;
        this.f53116f = i19;
        this.f53117g = i27;
        this.f53118h = i28;
        this.f53119i = i29;
        this.f53120m = i37;
        this.f53121n = i38;
        this.f53122o = i39;
        this.f53123p = i47;
        this.f53124q = i48;
        this.f53125r = i49;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("total", this.f53114d);
            jSONObject2.put("java", this.f53115e);
            jSONObject2.put("native", this.f53116f);
            jSONObject2.put("graphic", this.f53117g);
            jSONObject2.put("system", this.f53118h);
            jSONObject2.put("swap", this.f53119i);
            jSONObject2.put("code", this.f53120m);
            jSONObject2.put("stack", this.f53121n);
            jSONObject2.put("other", this.f53122o);
            jSONObject2.put("javaIncludingSwap", this.f53123p);
            jSONObject2.put("nativeIncludingSwap", this.f53124q);
            jSONObject2.put("otherIncludingSwap", this.f53125r);
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
        if (!(obj instanceof com.tencent.matrix.util.PssInfo)) {
            return false;
        }
        com.tencent.matrix.util.PssInfo pssInfo = (com.tencent.matrix.util.PssInfo) obj;
        return this.f53114d == pssInfo.f53114d && this.f53115e == pssInfo.f53115e && this.f53116f == pssInfo.f53116f && this.f53117g == pssInfo.f53117g && this.f53118h == pssInfo.f53118h && this.f53119i == pssInfo.f53119i && this.f53120m == pssInfo.f53120m && this.f53121n == pssInfo.f53121n && this.f53122o == pssInfo.f53122o && this.f53123p == pssInfo.f53123p && this.f53124q == pssInfo.f53124q && this.f53125r == pssInfo.f53125r;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f53114d * 31) + this.f53115e) * 31) + this.f53116f) * 31) + this.f53117g) * 31) + this.f53118h) * 31) + this.f53119i) * 31) + this.f53120m) * 31) + this.f53121n) * 31) + this.f53122o) * 31) + this.f53123p) * 31) + this.f53124q) * 31) + this.f53125r;
    }

    public java.lang.String toString() {
        java.lang.String format = java.lang.String.format("%-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s", java.util.Arrays.copyOf(new java.lang.Object[]{"totalPss=" + this.f53114d + " K", "Java=" + this.f53115e + " K", "Native=" + this.f53116f + " K", "Graphic=" + this.f53117g + " K", "System=" + this.f53118h + " K", "Swap=" + this.f53119i + " K", "Code=" + this.f53120m + " K", "Stack=" + this.f53121n + " K", "PrivateOther=" + this.f53122o + " K", "JavaIncludingSwap=" + this.f53123p + " K", "NativeIncludingSwap=" + this.f53124q + " K", "OtherIncludingSwap=" + this.f53125r + " K"}, 12));
        kotlin.jvm.internal.o.f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f53114d);
        parcel.writeInt(this.f53115e);
        parcel.writeInt(this.f53116f);
        parcel.writeInt(this.f53117g);
        parcel.writeInt(this.f53118h);
        parcel.writeInt(this.f53119i);
        parcel.writeInt(this.f53120m);
        parcel.writeInt(this.f53121n);
        parcel.writeInt(this.f53122o);
        parcel.writeInt(this.f53123p);
        parcel.writeInt(this.f53124q);
        parcel.writeInt(this.f53125r);
    }

    public /* synthetic */ PssInfo(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, kotlin.jvm.internal.i iVar) {
        this((i57 & 1) != 0 ? -1 : i17, (i57 & 2) != 0 ? -1 : i18, (i57 & 4) != 0 ? -1 : i19, (i57 & 8) != 0 ? -1 : i27, (i57 & 16) != 0 ? -1 : i28, (i57 & 32) != 0 ? -1 : i29, (i57 & 64) != 0 ? -1 : i37, (i57 & 128) != 0 ? -1 : i38, (i57 & 256) != 0 ? -1 : i39, (i57 & 512) != 0 ? -1 : i47, (i57 & 1024) != 0 ? -1 : i48, (i57 & 2048) == 0 ? i49 : -1);
    }
}

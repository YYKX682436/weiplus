package com.p314xaae8f345.p552xbf8d97c1.p590x36f002;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/matrix/util/PssInfo;", "Landroid/os/Parcelable;", "oj/y", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.util.PssInfo */
/* loaded from: classes12.dex */
public final /* data */ class C4723x52a73b7e implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public int f134647d;

    /* renamed from: e, reason: collision with root package name */
    public int f134648e;

    /* renamed from: f, reason: collision with root package name */
    public int f134649f;

    /* renamed from: g, reason: collision with root package name */
    public int f134650g;

    /* renamed from: h, reason: collision with root package name */
    public int f134651h;

    /* renamed from: i, reason: collision with root package name */
    public int f134652i;

    /* renamed from: m, reason: collision with root package name */
    public int f134653m;

    /* renamed from: n, reason: collision with root package name */
    public int f134654n;

    /* renamed from: o, reason: collision with root package name */
    public int f134655o;

    /* renamed from: p, reason: collision with root package name */
    public int f134656p;

    /* renamed from: q, reason: collision with root package name */
    public int f134657q;

    /* renamed from: r, reason: collision with root package name */
    public int f134658r;

    /* renamed from: s, reason: collision with root package name */
    public static final oj.y f134646s = new oj.y(null);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e> f20056x681a0c0c = new oj.w();

    public C4723x52a73b7e(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49) {
        this.f134647d = i17;
        this.f134648e = i18;
        this.f134649f = i19;
        this.f134650g = i27;
        this.f134651h = i28;
        this.f134652i = i29;
        this.f134653m = i37;
        this.f134654n = i38;
        this.f134655o = i39;
        this.f134656p = i47;
        this.f134657q = i48;
        this.f134658r = i49;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("total", this.f134647d);
            jSONObject2.put("java", this.f134648e);
            jSONObject2.put("native", this.f134649f);
            jSONObject2.put("graphic", this.f134650g);
            jSONObject2.put("system", this.f134651h);
            jSONObject2.put("swap", this.f134652i);
            jSONObject2.put("code", this.f134653m);
            jSONObject2.put("stack", this.f134654n);
            jSONObject2.put("other", this.f134655o);
            jSONObject2.put("javaIncludingSwap", this.f134656p);
            jSONObject2.put("nativeIncludingSwap", this.f134657q);
            jSONObject2.put("otherIncludingSwap", this.f134658r);
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
    public boolean m41333xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e)) {
            return false;
        }
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e c4723x52a73b7e = (com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e) obj;
        return this.f134647d == c4723x52a73b7e.f134647d && this.f134648e == c4723x52a73b7e.f134648e && this.f134649f == c4723x52a73b7e.f134649f && this.f134650g == c4723x52a73b7e.f134650g && this.f134651h == c4723x52a73b7e.f134651h && this.f134652i == c4723x52a73b7e.f134652i && this.f134653m == c4723x52a73b7e.f134653m && this.f134654n == c4723x52a73b7e.f134654n && this.f134655o == c4723x52a73b7e.f134655o && this.f134656p == c4723x52a73b7e.f134656p && this.f134657q == c4723x52a73b7e.f134657q && this.f134658r == c4723x52a73b7e.f134658r;
    }

    /* renamed from: hashCode */
    public int m41334x8cdac1b() {
        return (((((((((((((((((((((this.f134647d * 31) + this.f134648e) * 31) + this.f134649f) * 31) + this.f134650g) * 31) + this.f134651h) * 31) + this.f134652i) * 31) + this.f134653m) * 31) + this.f134654n) * 31) + this.f134655o) * 31) + this.f134656p) * 31) + this.f134657q) * 31) + this.f134658r;
    }

    /* renamed from: toString */
    public java.lang.String m41335x9616526c() {
        java.lang.String format = java.lang.String.format("%-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s %-21s", java.util.Arrays.copyOf(new java.lang.Object[]{"totalPss=" + this.f134647d + " K", "Java=" + this.f134648e + " K", "Native=" + this.f134649f + " K", "Graphic=" + this.f134650g + " K", "System=" + this.f134651h + " K", "Swap=" + this.f134652i + " K", "Code=" + this.f134653m + " K", "Stack=" + this.f134654n + " K", "PrivateOther=" + this.f134655o + " K", "JavaIncludingSwap=" + this.f134656p + " K", "NativeIncludingSwap=" + this.f134657q + " K", "OtherIncludingSwap=" + this.f134658r + " K"}, 12));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f134647d);
        parcel.writeInt(this.f134648e);
        parcel.writeInt(this.f134649f);
        parcel.writeInt(this.f134650g);
        parcel.writeInt(this.f134651h);
        parcel.writeInt(this.f134652i);
        parcel.writeInt(this.f134653m);
        parcel.writeInt(this.f134654n);
        parcel.writeInt(this.f134655o);
        parcel.writeInt(this.f134656p);
        parcel.writeInt(this.f134657q);
        parcel.writeInt(this.f134658r);
    }

    public /* synthetic */ C4723x52a73b7e(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i57 & 1) != 0 ? -1 : i17, (i57 & 2) != 0 ? -1 : i18, (i57 & 4) != 0 ? -1 : i19, (i57 & 8) != 0 ? -1 : i27, (i57 & 16) != 0 ? -1 : i28, (i57 & 32) != 0 ? -1 : i29, (i57 & 64) != 0 ? -1 : i37, (i57 & 128) != 0 ? -1 : i38, (i57 & 256) != 0 ? -1 : i39, (i57 & 512) != 0 ? -1 : i47, (i57 & 1024) != 0 ? -1 : i48, (i57 & 2048) == 0 ? i49 : -1);
    }
}

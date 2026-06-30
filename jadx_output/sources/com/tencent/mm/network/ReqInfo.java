package com.tencent.mm.network;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/network/ReqInfo;", "Landroid/os/Parcelable;", "mmkernel_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final /* data */ class ReqInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.network.ReqInfo> CREATOR = new com.tencent.mm.network.d3();

    /* renamed from: d, reason: collision with root package name */
    public final int f71934d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f71935e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71936f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71937g;

    /* renamed from: h, reason: collision with root package name */
    public final int f71938h;

    /* renamed from: i, reason: collision with root package name */
    public final int f71939i;

    /* renamed from: m, reason: collision with root package name */
    public final int f71940m;

    /* renamed from: n, reason: collision with root package name */
    public final int f71941n;

    /* renamed from: o, reason: collision with root package name */
    public final int f71942o;

    /* renamed from: p, reason: collision with root package name */
    public final int f71943p;

    /* renamed from: q, reason: collision with root package name */
    public final int f71944q;

    /* renamed from: r, reason: collision with root package name */
    public final int f71945r;

    /* renamed from: s, reason: collision with root package name */
    public final int f71946s;

    /* renamed from: t, reason: collision with root package name */
    public final int f71947t;

    /* renamed from: u, reason: collision with root package name */
    public final int f71948u;

    /* renamed from: v, reason: collision with root package name */
    public final int f71949v;

    /* renamed from: w, reason: collision with root package name */
    public final int f71950w;

    public ReqInfo(int i17, java.lang.String str, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, int i59, int i66) {
        this.f71934d = i17;
        this.f71935e = str;
        this.f71936f = i18;
        this.f71937g = i19;
        this.f71938h = i27;
        this.f71939i = i28;
        this.f71940m = i29;
        this.f71941n = i37;
        this.f71942o = i38;
        this.f71943p = i39;
        this.f71944q = i47;
        this.f71945r = i48;
        this.f71946s = i49;
        this.f71947t = i57;
        this.f71948u = i58;
        this.f71949v = i59;
        this.f71950w = i66;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.network.ReqInfo)) {
            return false;
        }
        com.tencent.mm.network.ReqInfo reqInfo = (com.tencent.mm.network.ReqInfo) obj;
        return this.f71934d == reqInfo.f71934d && kotlin.jvm.internal.o.b(this.f71935e, reqInfo.f71935e) && this.f71936f == reqInfo.f71936f && this.f71937g == reqInfo.f71937g && this.f71938h == reqInfo.f71938h && this.f71939i == reqInfo.f71939i && this.f71940m == reqInfo.f71940m && this.f71941n == reqInfo.f71941n && this.f71942o == reqInfo.f71942o && this.f71943p == reqInfo.f71943p && this.f71944q == reqInfo.f71944q && this.f71945r == reqInfo.f71945r && this.f71946s == reqInfo.f71946s && this.f71947t == reqInfo.f71947t && this.f71948u == reqInfo.f71948u && this.f71949v == reqInfo.f71949v && this.f71950w == reqInfo.f71950w;
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f71934d) * 31;
        java.lang.String str = this.f71935e;
        return ((((((((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f71936f)) * 31) + java.lang.Integer.hashCode(this.f71937g)) * 31) + java.lang.Integer.hashCode(this.f71938h)) * 31) + java.lang.Integer.hashCode(this.f71939i)) * 31) + java.lang.Integer.hashCode(this.f71940m)) * 31) + java.lang.Integer.hashCode(this.f71941n)) * 31) + java.lang.Integer.hashCode(this.f71942o)) * 31) + java.lang.Integer.hashCode(this.f71943p)) * 31) + java.lang.Integer.hashCode(this.f71944q)) * 31) + java.lang.Integer.hashCode(this.f71945r)) * 31) + java.lang.Integer.hashCode(this.f71946s)) * 31) + java.lang.Integer.hashCode(this.f71947t)) * 31) + java.lang.Integer.hashCode(this.f71948u)) * 31) + java.lang.Integer.hashCode(this.f71949v)) * 31) + java.lang.Integer.hashCode(this.f71950w);
    }

    public java.lang.String toString() {
        return "ReqInfo(type=" + this.f71934d + ", uri=" + this.f71935e + ", isKeepAlive=" + this.f71936f + ", cmdID=" + this.f71937g + ", options=" + this.f71938h + ", shortSupport=" + this.f71939i + ", isLongPolling=" + this.f71940m + ", newDNSBusinessType=" + this.f71941n + ", timeout=" + this.f71942o + ", longPollingTimeout=" + this.f71943p + ", isUserCmd=" + this.f71944q + ", mmReqRespHash=" + this.f71945r + ", newExtFlags=" + this.f71946s + ", isSingleSession=" + this.f71947t + ", useEcdh=" + this.f71948u + ", bindCellularStrategy=" + this.f71949v + ", routeInfo=" + this.f71950w + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f71934d);
        out.writeString(this.f71935e);
        out.writeInt(this.f71936f);
        out.writeInt(this.f71937g);
        out.writeInt(this.f71938h);
        out.writeInt(this.f71939i);
        out.writeInt(this.f71940m);
        out.writeInt(this.f71941n);
        out.writeInt(this.f71942o);
        out.writeInt(this.f71943p);
        out.writeInt(this.f71944q);
        out.writeInt(this.f71945r);
        out.writeInt(this.f71946s);
        out.writeInt(this.f71947t);
        out.writeInt(this.f71948u);
        out.writeInt(this.f71949v);
        out.writeInt(this.f71950w);
    }
}

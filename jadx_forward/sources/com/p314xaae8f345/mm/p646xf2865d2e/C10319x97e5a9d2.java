package com.p314xaae8f345.mm.p646xf2865d2e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/brandService/GetBizRequest;", "Landroid/os/Parcelable;", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.brandService.GetBizRequest */
/* loaded from: classes7.dex */
public final /* data */ class C10319x97e5a9d2 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p646xf2865d2e.C10319x97e5a9d2> f27776x681a0c0c = new rm.v();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f145151d;

    /* renamed from: e, reason: collision with root package name */
    public final int f145152e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f145153f;

    public C10319x97e5a9d2(boolean z17, int i17, boolean z18) {
        this.f145151d = z17;
        this.f145152e = i17;
        this.f145153f = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m43457xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p646xf2865d2e.C10319x97e5a9d2)) {
            return false;
        }
        com.p314xaae8f345.mm.p646xf2865d2e.C10319x97e5a9d2 c10319x97e5a9d2 = (com.p314xaae8f345.mm.p646xf2865d2e.C10319x97e5a9d2) obj;
        return this.f145151d == c10319x97e5a9d2.f145151d && this.f145152e == c10319x97e5a9d2.f145152e && this.f145153f == c10319x97e5a9d2.f145153f;
    }

    /* renamed from: hashCode */
    public int m43458x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f145151d) * 31) + java.lang.Integer.hashCode(this.f145152e)) * 31) + java.lang.Boolean.hashCode(this.f145153f);
    }

    /* renamed from: toString */
    public java.lang.String m43459x9616526c() {
        return "GetBizRequest(needCheckBiz=" + this.f145151d + ", bizType=" + this.f145152e + ", getAllBiz=" + this.f145153f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f145151d ? 1 : 0);
        out.writeInt(this.f145152e);
        out.writeInt(this.f145153f ? 1 : 0);
    }
}

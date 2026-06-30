package com.p314xaae8f345.mm.p646xf2865d2e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/brandService/GetBizResponse;", "Landroid/os/Parcelable;", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.brandService.GetBizResponse */
/* loaded from: classes7.dex */
public final /* data */ class C10320x67f7455e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p646xf2865d2e.C10320x67f7455e> f27777x681a0c0c = new rm.w();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f145154d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f145155e;

    /* renamed from: f, reason: collision with root package name */
    public final int f145156f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f145157g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f145158h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f145159i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f145160m;

    public C10320x67f7455e(boolean z17, java.lang.String biz, int i17, java.lang.String errorMsg, java.lang.String str, boolean z18, java.lang.String fullInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz, "biz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullInfo, "fullInfo");
        this.f145154d = z17;
        this.f145155e = biz;
        this.f145156f = i17;
        this.f145157g = errorMsg;
        this.f145158h = str;
        this.f145159i = z18;
        this.f145160m = fullInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m43461xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p646xf2865d2e.C10320x67f7455e)) {
            return false;
        }
        com.p314xaae8f345.mm.p646xf2865d2e.C10320x67f7455e c10320x67f7455e = (com.p314xaae8f345.mm.p646xf2865d2e.C10320x67f7455e) obj;
        return this.f145154d == c10320x67f7455e.f145154d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f145155e, c10320x67f7455e.f145155e) && this.f145156f == c10320x67f7455e.f145156f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f145157g, c10320x67f7455e.f145157g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f145158h, c10320x67f7455e.f145158h) && this.f145159i == c10320x67f7455e.f145159i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f145160m, c10320x67f7455e.f145160m);
    }

    /* renamed from: hashCode */
    public int m43462x8cdac1b() {
        int hashCode = ((((((java.lang.Boolean.hashCode(this.f145154d) * 31) + this.f145155e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f145156f)) * 31) + this.f145157g.hashCode()) * 31;
        java.lang.String str = this.f145158h;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f145159i)) * 31) + this.f145160m.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m43463x9616526c() {
        return "GetBizResponse(success=" + this.f145154d + ", biz=" + this.f145155e + ", interactionIdentityType=" + this.f145156f + ", errorMsg=" + this.f145157g + ", getAllBizResult=" + this.f145158h + ", initFlag=" + this.f145159i + ", fullInfo=" + this.f145160m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f145154d ? 1 : 0);
        out.writeString(this.f145155e);
        out.writeInt(this.f145156f);
        out.writeString(this.f145157g);
        out.writeString(this.f145158h);
        out.writeInt(this.f145159i ? 1 : 0);
        out.writeString(this.f145160m);
    }

    public /* synthetic */ C10320x67f7455e(boolean z17, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, boolean z18, java.lang.String str4, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, str, i17, str2, (i18 & 16) != 0 ? null : str3, (i18 & 32) != 0 ? false : z18, (i18 & 64) != 0 ? "" : str4);
    }
}

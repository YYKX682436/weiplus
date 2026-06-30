package com.tencent.mm.brandService;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/brandService/GetBizResponse;", "Landroid/os/Parcelable;", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class GetBizResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.brandService.GetBizResponse> CREATOR = new rm.w();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f63621d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f63622e;

    /* renamed from: f, reason: collision with root package name */
    public final int f63623f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f63624g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f63625h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f63626i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f63627m;

    public GetBizResponse(boolean z17, java.lang.String biz, int i17, java.lang.String errorMsg, java.lang.String str, boolean z18, java.lang.String fullInfo) {
        kotlin.jvm.internal.o.g(biz, "biz");
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        kotlin.jvm.internal.o.g(fullInfo, "fullInfo");
        this.f63621d = z17;
        this.f63622e = biz;
        this.f63623f = i17;
        this.f63624g = errorMsg;
        this.f63625h = str;
        this.f63626i = z18;
        this.f63627m = fullInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.brandService.GetBizResponse)) {
            return false;
        }
        com.tencent.mm.brandService.GetBizResponse getBizResponse = (com.tencent.mm.brandService.GetBizResponse) obj;
        return this.f63621d == getBizResponse.f63621d && kotlin.jvm.internal.o.b(this.f63622e, getBizResponse.f63622e) && this.f63623f == getBizResponse.f63623f && kotlin.jvm.internal.o.b(this.f63624g, getBizResponse.f63624g) && kotlin.jvm.internal.o.b(this.f63625h, getBizResponse.f63625h) && this.f63626i == getBizResponse.f63626i && kotlin.jvm.internal.o.b(this.f63627m, getBizResponse.f63627m);
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Boolean.hashCode(this.f63621d) * 31) + this.f63622e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f63623f)) * 31) + this.f63624g.hashCode()) * 31;
        java.lang.String str = this.f63625h;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f63626i)) * 31) + this.f63627m.hashCode();
    }

    public java.lang.String toString() {
        return "GetBizResponse(success=" + this.f63621d + ", biz=" + this.f63622e + ", interactionIdentityType=" + this.f63623f + ", errorMsg=" + this.f63624g + ", getAllBizResult=" + this.f63625h + ", initFlag=" + this.f63626i + ", fullInfo=" + this.f63627m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f63621d ? 1 : 0);
        out.writeString(this.f63622e);
        out.writeInt(this.f63623f);
        out.writeString(this.f63624g);
        out.writeString(this.f63625h);
        out.writeInt(this.f63626i ? 1 : 0);
        out.writeString(this.f63627m);
    }

    public /* synthetic */ GetBizResponse(boolean z17, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, boolean z18, java.lang.String str4, int i18, kotlin.jvm.internal.i iVar) {
        this(z17, str, i17, str2, (i18 & 16) != 0 ? null : str3, (i18 & 32) != 0 ? false : z18, (i18 & 64) != 0 ? "" : str4);
    }
}

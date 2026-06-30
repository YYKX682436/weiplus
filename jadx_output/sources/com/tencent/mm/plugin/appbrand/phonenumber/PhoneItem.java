package com.tencent.mm.plugin.appbrand.phonenumber;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "Landroid/os/Parcelable;", "vi1/m0", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class PhoneItem implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f87399d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f87400e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f87401f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f87402g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f87403h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f87404i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f87405m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f87406n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f87407o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f87408p;

    /* renamed from: q, reason: collision with root package name */
    public static final vi1.m0 f87398q = new vi1.m0(null);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem> CREATOR = new vi1.n0();

    public PhoneItem(java.lang.String mobile, java.lang.String showMobile, java.lang.String encryptedData, java.lang.String iv6, java.lang.String cloud_id, boolean z17, boolean z18, boolean z19, boolean z27, java.lang.String data) {
        kotlin.jvm.internal.o.g(mobile, "mobile");
        kotlin.jvm.internal.o.g(showMobile, "showMobile");
        kotlin.jvm.internal.o.g(encryptedData, "encryptedData");
        kotlin.jvm.internal.o.g(iv6, "iv");
        kotlin.jvm.internal.o.g(cloud_id, "cloud_id");
        kotlin.jvm.internal.o.g(data, "data");
        this.f87399d = mobile;
        this.f87400e = showMobile;
        this.f87401f = encryptedData;
        this.f87402g = iv6;
        this.f87403h = cloud_id;
        this.f87404i = z17;
        this.f87405m = z18;
        this.f87406n = z19;
        this.f87407o = z27;
        this.f87408p = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem)) {
            return super.equals(obj);
        }
        com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem = (com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) obj;
        return kotlin.jvm.internal.o.b(phoneItem.f87399d, this.f87399d) && phoneItem.f87406n == this.f87406n;
    }

    public int hashCode() {
        return (((((((((((((((((this.f87399d.hashCode() * 31) + this.f87400e.hashCode()) * 31) + this.f87401f.hashCode()) * 31) + this.f87402g.hashCode()) * 31) + this.f87403h.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f87404i)) * 31) + java.lang.Boolean.hashCode(this.f87405m)) * 31) + java.lang.Boolean.hashCode(this.f87406n)) * 31) + java.lang.Boolean.hashCode(this.f87407o)) * 31) + this.f87408p.hashCode();
    }

    public java.lang.String toString() {
        return "PhoneItem(mobile=" + this.f87399d + ", showMobile=" + this.f87400e + ", encryptedData=" + this.f87401f + ", iv=" + this.f87402g + ", cloud_id=" + this.f87403h + ", needAuth=" + this.f87404i + ", allowSendSms=" + this.f87405m + ", isWechat=" + this.f87406n + ", isCheck=" + this.f87407o + ", data=" + this.f87408p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f87399d);
        out.writeString(this.f87400e);
        out.writeString(this.f87401f);
        out.writeString(this.f87402g);
        out.writeString(this.f87403h);
        out.writeInt(this.f87404i ? 1 : 0);
        out.writeInt(this.f87405m ? 1 : 0);
        out.writeInt(this.f87406n ? 1 : 0);
        out.writeInt(this.f87407o ? 1 : 0);
        out.writeString(this.f87408p);
    }

    public /* synthetic */ PhoneItem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, boolean z18, boolean z19, boolean z27, java.lang.String str6, int i17, kotlin.jvm.internal.i iVar) {
        this(str, str2, str3, str4, (i17 & 16) != 0 ? "" : str5, (i17 & 32) != 0 ? false : z17, (i17 & 64) != 0 ? true : z18, (i17 & 128) != 0 ? false : z19, (i17 & 256) != 0 ? false : z27, (i17 & 512) != 0 ? "" : str6);
    }
}

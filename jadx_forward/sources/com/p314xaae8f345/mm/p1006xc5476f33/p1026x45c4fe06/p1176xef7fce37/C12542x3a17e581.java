package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "Landroid/os/Parcelable;", "vi1/m0", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem */
/* loaded from: classes7.dex */
public final /* data */ class C12542x3a17e581 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f168932d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f168933e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f168934f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f168935g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f168936h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f168937i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f168938m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f168939n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f168940o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f168941p;

    /* renamed from: q, reason: collision with root package name */
    public static final vi1.m0 f168931q = new vi1.m0(null);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581> f35148x681a0c0c = new vi1.n0();

    public C12542x3a17e581(java.lang.String mobile, java.lang.String showMobile, java.lang.String encryptedData, java.lang.String iv6, java.lang.String cloud_id, boolean z17, boolean z18, boolean z19, boolean z27, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mobile, "mobile");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showMobile, "showMobile");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encryptedData, "encryptedData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iv6, "iv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cloud_id, "cloud_id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f168932d = mobile;
        this.f168933e = showMobile;
        this.f168934f = encryptedData;
        this.f168935g = iv6;
        this.f168936h = cloud_id;
        this.f168937i = z17;
        this.f168938m = z18;
        this.f168939n = z19;
        this.f168940o = z27;
        this.f168941p = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52276xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581)) {
            return super.equals(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c12542x3a17e581.f168932d, this.f168932d) && c12542x3a17e581.f168939n == this.f168939n;
    }

    /* renamed from: hashCode */
    public int m52277x8cdac1b() {
        return (((((((((((((((((this.f168932d.hashCode() * 31) + this.f168933e.hashCode()) * 31) + this.f168934f.hashCode()) * 31) + this.f168935g.hashCode()) * 31) + this.f168936h.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f168937i)) * 31) + java.lang.Boolean.hashCode(this.f168938m)) * 31) + java.lang.Boolean.hashCode(this.f168939n)) * 31) + java.lang.Boolean.hashCode(this.f168940o)) * 31) + this.f168941p.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m52278x9616526c() {
        return "PhoneItem(mobile=" + this.f168932d + ", showMobile=" + this.f168933e + ", encryptedData=" + this.f168934f + ", iv=" + this.f168935g + ", cloud_id=" + this.f168936h + ", needAuth=" + this.f168937i + ", allowSendSms=" + this.f168938m + ", isWechat=" + this.f168939n + ", isCheck=" + this.f168940o + ", data=" + this.f168941p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f168932d);
        out.writeString(this.f168933e);
        out.writeString(this.f168934f);
        out.writeString(this.f168935g);
        out.writeString(this.f168936h);
        out.writeInt(this.f168937i ? 1 : 0);
        out.writeInt(this.f168938m ? 1 : 0);
        out.writeInt(this.f168939n ? 1 : 0);
        out.writeInt(this.f168940o ? 1 : 0);
        out.writeString(this.f168941p);
    }

    public /* synthetic */ C12542x3a17e581(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, boolean z18, boolean z19, boolean z27, java.lang.String str6, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, str3, str4, (i17 & 16) != 0 ? "" : str5, (i17 & 32) != 0 ? false : z17, (i17 & 64) != 0 ? true : z18, (i17 & 128) != 0 ? false : z19, (i17 & 256) != 0 ? false : z27, (i17 & 512) != 0 ? "" : str6);
    }
}

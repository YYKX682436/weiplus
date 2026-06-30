package com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/gamesharecard/LiteAppBizDataInfo;", "Landroid/os/Parcelable;", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo */
/* loaded from: classes9.dex */
public final /* data */ class C16075xd72ab138 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138> f36994x681a0c0c = new l63.j();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f223649d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f223650e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f223651f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f223652g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f223653h;

    /* renamed from: i, reason: collision with root package name */
    public final int f223654i;

    public C16075xd72ab138(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, int i17) {
        this.f223649d = str;
        this.f223650e = str2;
        this.f223651f = str3;
        this.f223652g = str4;
        this.f223653h = num;
        this.f223654i = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64924xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138 c16075xd72ab138 = (com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223649d, c16075xd72ab138.f223649d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223650e, c16075xd72ab138.f223650e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223651f, c16075xd72ab138.f223651f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223652g, c16075xd72ab138.f223652g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223653h, c16075xd72ab138.f223653h) && this.f223654i == c16075xd72ab138.f223654i;
    }

    /* renamed from: hashCode */
    public int m64925x8cdac1b() {
        java.lang.String str = this.f223649d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f223650e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f223651f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f223652g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Integer num = this.f223653h;
        return ((hashCode4 + (num != null ? num.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f223654i);
    }

    /* renamed from: toString */
    public java.lang.String m64926x9616526c() {
        return "LiteAppBizDataInfo(id=" + this.f223649d + ", path=" + this.f223650e + ", query=" + this.f223651f + ", bizData=" + this.f223652g + ", source=" + this.f223653h + ", priority=" + this.f223654i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        int intValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f223649d);
        out.writeString(this.f223650e);
        out.writeString(this.f223651f);
        out.writeString(this.f223652g);
        java.lang.Integer num = this.f223653h;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeInt(this.f223654i);
    }
}

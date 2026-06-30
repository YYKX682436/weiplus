package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$UpdateHistoryListData", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$UpdateHistoryListData */
/* loaded from: classes7.dex */
public final /* data */ class C12773xed7e2ec8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.C12773xed7e2ec8> f35313x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.p();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f172676d;

    /* renamed from: e, reason: collision with root package name */
    public final int f172677e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f172678f;

    /* renamed from: g, reason: collision with root package name */
    public final int f172679g;

    /* renamed from: h, reason: collision with root package name */
    public final int f172680h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f172681i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f172682m;

    public C12773xed7e2ec8(java.lang.String username, int i17, boolean z17, int i18, int i19, java.lang.String str, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f172676d = username;
        this.f172677e = i17;
        this.f172678f = z17;
        this.f172679g = i18;
        this.f172680h = i19;
        this.f172681i = str;
        this.f172682m = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m53380xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.C12773xed7e2ec8)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.C12773xed7e2ec8 c12773xed7e2ec8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.C12773xed7e2ec8) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f172676d, c12773xed7e2ec8.f172676d) && this.f172677e == c12773xed7e2ec8.f172677e && this.f172678f == c12773xed7e2ec8.f172678f && this.f172679g == c12773xed7e2ec8.f172679g && this.f172680h == c12773xed7e2ec8.f172680h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f172681i, c12773xed7e2ec8.f172681i) && this.f172682m == c12773xed7e2ec8.f172682m;
    }

    /* renamed from: hashCode */
    public int m53381x8cdac1b() {
        int hashCode = ((((((((this.f172676d.hashCode() * 31) + java.lang.Integer.hashCode(this.f172677e)) * 31) + java.lang.Boolean.hashCode(this.f172678f)) * 31) + java.lang.Integer.hashCode(this.f172679g)) * 31) + java.lang.Integer.hashCode(this.f172680h)) * 31;
        java.lang.String str = this.f172681i;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f172682m);
    }

    /* renamed from: toString */
    public java.lang.String m53382x9616526c() {
        return "UpdateHistoryListData(username=" + this.f172676d + ", versionType=" + this.f172677e + ", fromBackground=" + this.f172678f + ", reportScene=" + this.f172679g + ", updateReason=" + this.f172680h + ", visitingSessionId=" + this.f172681i + ", isForPreRender=" + this.f172682m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f172676d);
        out.writeInt(this.f172677e);
        out.writeInt(this.f172678f ? 1 : 0);
        out.writeInt(this.f172679g);
        out.writeInt(this.f172680h);
        out.writeString(this.f172681i);
        out.writeInt(this.f172682m ? 1 : 0);
    }
}

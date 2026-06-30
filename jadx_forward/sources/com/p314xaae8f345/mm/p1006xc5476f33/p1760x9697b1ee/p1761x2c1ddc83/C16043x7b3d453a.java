package com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.p1761x2c1ddc83;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/gamelife/conversation/GameLifeOutputDataWrapper;", "Landroid/os/Parcelable;", "CREATOR", "z53/b0", "game-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamelife.conversation.GameLifeOutputDataWrapper */
/* loaded from: classes7.dex */
public final /* data */ class C16043x7b3d453a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final z53.b0 f36976x681a0c0c = new z53.b0(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f223517d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f223518e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f223519f;

    public C16043x7b3d453a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f223517d = str;
        this.f223518e = str2;
        this.f223519f = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64860xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.p1761x2c1ddc83.C16043x7b3d453a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.p1761x2c1ddc83.C16043x7b3d453a c16043x7b3d453a = (com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.p1761x2c1ddc83.C16043x7b3d453a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223517d, c16043x7b3d453a.f223517d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223518e, c16043x7b3d453a.f223518e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223519f, c16043x7b3d453a.f223519f);
    }

    /* renamed from: hashCode */
    public int m64861x8cdac1b() {
        java.lang.String str = this.f223517d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f223518e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f223519f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m64862x9616526c() {
        return "GameLifeOutputDataWrapper(sessionId=" + this.f223517d + ", talker=" + this.f223518e + ", selfUsername=" + this.f223519f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f223517d);
        parcel.writeString(this.f223518e);
        parcel.writeString(this.f223519f);
    }
}

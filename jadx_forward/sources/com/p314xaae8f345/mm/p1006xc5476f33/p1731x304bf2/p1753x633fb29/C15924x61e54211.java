package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/game/model/LocalTabCornerSetting;", "Landroid/os/Parcelable;", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.game.model.LocalTabCornerSetting */
/* loaded from: classes8.dex */
public final /* data */ class C15924x61e54211 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211> f36938x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.u2();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f221709d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f221710e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f221711f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15923xcaadde67 f221712g;

    public C15924x61e54211(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15923xcaadde67 c15923xcaadde67) {
        this.f221709d = str;
        this.f221710e = str2;
        this.f221711f = str3;
        this.f221712g = c15923xcaadde67;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64646xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211 c15924x61e54211 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221709d, c15924x61e54211.f221709d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221710e, c15924x61e54211.f221710e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221711f, c15924x61e54211.f221711f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f221712g, c15924x61e54211.f221712g);
    }

    /* renamed from: hashCode */
    public int m64647x8cdac1b() {
        java.lang.String str = this.f221709d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f221710e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f221711f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15923xcaadde67 c15923xcaadde67 = this.f221712g;
        return hashCode3 + (c15923xcaadde67 != null ? c15923xcaadde67.m64643x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m64648x9616526c() {
        return "LocalTabCornerSetting(key=" + this.f221709d + ", iconUrl=" + this.f221710e + ", darkModeIconUrl=" + this.f221711f + ", jumpInfo=" + this.f221712g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f221709d);
        out.writeString(this.f221710e);
        out.writeString(this.f221711f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15923xcaadde67 c15923xcaadde67 = this.f221712g;
        if (c15923xcaadde67 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c15923xcaadde67.writeToParcel(out, i17);
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LivePlayGamePayLoad", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LivePlayGamePayLoad */
/* loaded from: classes8.dex */
public final /* data */ class C16058xd8b0e3d7 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16058xd8b0e3d7> f36986x681a0c0c = new j63.k();

    /* renamed from: d, reason: collision with root package name */
    public int f223562d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f223563e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f223564f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f223565g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f223566h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f223567i;

    /* renamed from: m, reason: collision with root package name */
    public int f223568m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f223569n;

    /* renamed from: o, reason: collision with root package name */
    public int f223570o;

    /* renamed from: p, reason: collision with root package name */
    public int f223571p;

    public C16058xd8b0e3d7(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, java.lang.String str6, int i19, int i27) {
        this.f223562d = i17;
        this.f223563e = str;
        this.f223564f = str2;
        this.f223565g = str3;
        this.f223566h = str4;
        this.f223567i = str5;
        this.f223568m = i18;
        this.f223569n = str6;
        this.f223570o = i19;
        this.f223571p = i27;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64896xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16058xd8b0e3d7)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16058xd8b0e3d7 c16058xd8b0e3d7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16058xd8b0e3d7) obj;
        return this.f223562d == c16058xd8b0e3d7.f223562d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223563e, c16058xd8b0e3d7.f223563e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223564f, c16058xd8b0e3d7.f223564f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223565g, c16058xd8b0e3d7.f223565g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223566h, c16058xd8b0e3d7.f223566h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223567i, c16058xd8b0e3d7.f223567i) && this.f223568m == c16058xd8b0e3d7.f223568m && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223569n, c16058xd8b0e3d7.f223569n) && this.f223570o == c16058xd8b0e3d7.f223570o && this.f223571p == c16058xd8b0e3d7.f223571p;
    }

    /* renamed from: hashCode */
    public int m64897x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f223562d) * 31;
        java.lang.String str = this.f223563e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f223564f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f223565g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f223566h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f223567i;
        int hashCode6 = (((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + java.lang.Integer.hashCode(this.f223568m)) * 31;
        java.lang.String str6 = this.f223569n;
        return ((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f223570o)) * 31) + java.lang.Integer.hashCode(this.f223571p);
    }

    /* renamed from: toString */
    public java.lang.String m64898x9616526c() {
        return "LivePlayGamePayLoad(join_team_mode=" + this.f223562d + ", title=" + this.f223563e + ", teamup_desc=" + this.f223564f + ", member_desc=" + this.f223565g + ", teamup_extra_data=" + this.f223566h + ", appid=" + this.f223567i + ", versionType=" + this.f223568m + ", path=" + this.f223569n + ", sourceId=" + this.f223570o + ", type=" + this.f223571p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f223562d);
        out.writeString(this.f223563e);
        out.writeString(this.f223564f);
        out.writeString(this.f223565g);
        out.writeString(this.f223566h);
        out.writeString(this.f223567i);
        out.writeInt(this.f223568m);
        out.writeString(this.f223569n);
        out.writeInt(this.f223570o);
        out.writeInt(this.f223571p);
    }
}

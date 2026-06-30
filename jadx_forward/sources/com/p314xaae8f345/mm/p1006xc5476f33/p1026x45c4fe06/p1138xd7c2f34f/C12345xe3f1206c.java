package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/IPCUpdateStateNotifier$UpdateStateArgsParcelized", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.IPCUpdateStateNotifier$UpdateStateArgsParcelized */
/* loaded from: classes7.dex */
public final /* data */ class C12345xe3f1206c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12345xe3f1206c> f35059x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.m7();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f165969d;

    /* renamed from: e, reason: collision with root package name */
    public final int f165970e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f165971f;

    /* renamed from: g, reason: collision with root package name */
    public final ne1.j f165972g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f165973h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f165974i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 f165975m;

    public C12345xe3f1206c(java.lang.String appId, int i17, java.lang.String str, ne1.j state, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f165969d = appId;
        this.f165970e = i17;
        this.f165971f = str;
        this.f165972g = state;
        this.f165973h = str2;
        this.f165974i = str3;
        this.f165975m = c11667xc7e59dd6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51667xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12345xe3f1206c)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12345xe3f1206c c12345xe3f1206c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12345xe3f1206c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165969d, c12345xe3f1206c.f165969d) && this.f165970e == c12345xe3f1206c.f165970e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165971f, c12345xe3f1206c.f165971f) && this.f165972g == c12345xe3f1206c.f165972g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165973h, c12345xe3f1206c.f165973h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165974i, c12345xe3f1206c.f165974i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165975m, c12345xe3f1206c.f165975m);
    }

    /* renamed from: hashCode */
    public int m51668x8cdac1b() {
        int hashCode = ((this.f165969d.hashCode() * 31) + java.lang.Integer.hashCode(this.f165970e)) * 31;
        java.lang.String str = this.f165971f;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f165972g.hashCode()) * 31;
        java.lang.String str2 = this.f165973h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f165974i;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = this.f165975m;
        return hashCode4 + (c11667xc7e59dd6 != null ? c11667xc7e59dd6.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m51669x9616526c() {
        return "UpdateStateArgsParcelized(appId=" + this.f165969d + ", intVersion=" + this.f165970e + ", stringVersion=" + this.f165971f + ", state=" + this.f165972g + ", passThroughInfo=" + this.f165973h + ", stablePassThroughInfo=" + this.f165974i + ", appPkgHolder=" + this.f165975m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f165969d);
        out.writeInt(this.f165970e);
        out.writeString(this.f165971f);
        ne1.j jVar = this.f165972g;
        out.writeInt(jVar != null ? jVar.ordinal() : -1);
        out.writeString(this.f165973h);
        out.writeString(this.f165974i);
        out.writeParcelable(this.f165975m, i17);
    }
}

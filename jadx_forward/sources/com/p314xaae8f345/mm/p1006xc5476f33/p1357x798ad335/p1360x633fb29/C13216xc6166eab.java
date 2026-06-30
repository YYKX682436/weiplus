package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/downloader/model/CloudGameAppInfoWrapper;", "Landroid/os/Parcelable;", "plugin-downloader_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper */
/* loaded from: classes8.dex */
public final /* data */ class C13216xc6166eab implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13216xc6166eab> f35450x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f178463d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f178464e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f178465f;

    /* renamed from: g, reason: collision with root package name */
    public final int f178466g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13215x104b3cc8 f178467h;

    public C13216xc6166eab(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13215x104b3cc8 appInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appInfo, "appInfo");
        this.f178463d = str;
        this.f178464e = str2;
        this.f178465f = str3;
        this.f178466g = i17;
        this.f178467h = appInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m54681xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13216xc6166eab)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13216xc6166eab c13216xc6166eab = (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13216xc6166eab) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f178463d, c13216xc6166eab.f178463d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f178464e, c13216xc6166eab.f178464e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f178465f, c13216xc6166eab.f178465f) && this.f178466g == c13216xc6166eab.f178466g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f178467h, c13216xc6166eab.f178467h);
    }

    /* renamed from: hashCode */
    public int m54682x8cdac1b() {
        java.lang.String str = this.f178463d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f178464e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f178465f;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f178466g)) * 31) + this.f178467h.m54678x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m54683x9616526c() {
        return "CloudGameAppInfoWrapper(jumpUrl=" + this.f178463d + ", gameId=" + this.f178464e + ", actId=" + this.f178465f + ", scene=" + this.f178466g + ", appInfo=" + this.f178467h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f178463d);
        out.writeString(this.f178464e);
        out.writeString(this.f178465f);
        out.writeInt(this.f178466g);
        this.f178467h.writeToParcel(out, i17);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launch/magicbrush_frame/WAMagicBrushFrameLaunchParams;", "Lcom/tencent/mm/plugin/appbrand/launch/WALaunchParams;", "CREATOR", "com/tencent/mm/plugin/appbrand/launch/magicbrush_frame/x", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams */
/* loaded from: classes7.dex */
public final class C12319xdc45d1ef extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.AbstractC12316x97adb703 {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.x f35044x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1136xbdd923b3.p1137x2011485b.x(null);

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f165787i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f165788m;

    public C12319xdc45d1ef(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        this.f165775d = parcel.readString();
        this.f165776e = parcel.readString();
        this.f165777f = parcel.readInt();
        this.f165778g = parcel.readInt();
        this.f165779h = parcel.readString();
        this.f165787i = parcel.readString();
        this.f165788m = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m51631x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WAMagicBrushFrameLaunchParams(username:");
        java.lang.String str = this.f165775d;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", appId:");
        java.lang.String str2 = this.f165776e;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(", appPath:");
        java.lang.String str3 = this.f165779h;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(", bizInstanceName:");
        java.lang.String str4 = this.f165787i;
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append(", mbServerProcessName:");
        java.lang.String str5 = this.f165788m;
        sb6.append(str5 != null ? str5 : "");
        sb6.append(')');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(this.f165775d);
        dest.writeString(this.f165776e);
        dest.writeInt(this.f165777f);
        dest.writeInt(this.f165778g);
        dest.writeString(this.f165779h);
        dest.writeString(this.f165787i);
        dest.writeString(this.f165788m);
    }
}

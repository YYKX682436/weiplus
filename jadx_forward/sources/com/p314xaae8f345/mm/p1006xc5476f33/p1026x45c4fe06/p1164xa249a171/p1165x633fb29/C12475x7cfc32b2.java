package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29;

/* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel */
/* loaded from: classes8.dex */
public class C12475x7cfc32b2 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2> f35123x681a0c0c = new bi1.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f167795d;

    /* renamed from: e, reason: collision with root package name */
    public final int f167796e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f167797f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f167798g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f167799h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f167800i;

    public C12475x7cfc32b2(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String str5;
        this.f167795d = str;
        this.f167796e = i17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            java.lang.String a17 = nf.z.a(str2);
            if (!a17.endsWith(".html")) {
                str5 = str2.replace(a17, a17.concat(".html"));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BaseAppBrandOpenMaterialModel", "fixPath, path: %s, fixedPath: %s", str2, str5);
                this.f167797f = str5;
                this.f167798g = str3;
                this.f167799h = str4;
            }
        }
        str5 = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BaseAppBrandOpenMaterialModel", "fixPath, path: %s, fixedPath: %s", str2, str5);
        this.f167797f = str5;
        this.f167798g = str3;
        this.f167799h = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52068xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2) obj;
        return this.f167796e == c12475x7cfc32b2.f167796e && this.f167795d.equals(c12475x7cfc32b2.f167795d) && this.f167797f.equals(c12475x7cfc32b2.f167797f) && java.util.Objects.equals(this.f167798g, c12475x7cfc32b2.f167798g) && this.f167799h.equals(c12475x7cfc32b2.f167799h) && java.util.Objects.equals(this.f167800i, c12475x7cfc32b2.f167800i);
    }

    /* renamed from: hashCode */
    public int m52069x8cdac1b() {
        return java.util.Objects.hash(this.f167795d, java.lang.Integer.valueOf(this.f167796e), this.f167797f, this.f167798g, this.f167799h, this.f167800i);
    }

    /* renamed from: toString */
    public java.lang.String m52070x9616526c() {
        return "AppBrandOpenMaterialModel{iconUrl='" + this.f167798g + "', functionName='" + this.f167799h + "', appName='" + this.f167800i + "', appId='" + this.f167795d + "', versionType=" + this.f167796e + ", enterPath='" + this.f167797f + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f167795d);
        parcel.writeInt(this.f167796e);
        parcel.writeString(this.f167797f);
        parcel.writeString(this.f167798g);
        parcel.writeString(this.f167799h);
        parcel.writeString(this.f167800i);
    }

    public C12475x7cfc32b2(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f167795d = readString == null ? "" : readString;
        this.f167796e = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        this.f167797f = readString2 == null ? "" : readString2;
        this.f167798g = parcel.readString();
        java.lang.String readString3 = parcel.readString();
        this.f167799h = readString3 != null ? readString3 : "";
        this.f167800i = parcel.readString();
    }
}

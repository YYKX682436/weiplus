package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp */
/* loaded from: classes7.dex */
public class C11735xd37b16d6 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11735xd37b16d6> f33518x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.h();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158454d;

    /* renamed from: e, reason: collision with root package name */
    public int f158455e;

    /* renamed from: f, reason: collision with root package name */
    public int f158456f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f158457g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f158458h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f158459i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f158460m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f158461n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f158462o;

    public C11735xd37b16d6(android.os.Parcel parcel) {
        this.f158454d = parcel.readString();
        this.f158455e = parcel.readInt();
        this.f158456f = parcel.readInt();
        this.f158457g = parcel.readString();
        this.f158458h = parcel.readString();
        this.f158459i = parcel.readString();
        this.f158460m = parcel.readString();
        this.f158461n = parcel.readString();
        this.f158462o = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m49959xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return java.util.Objects.equals(this.f158454d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11735xd37b16d6) obj).f158454d);
    }

    /* renamed from: hashCode */
    public int m49960x8cdac1b() {
        return java.util.Objects.hash(this.f158454d);
    }

    /* renamed from: toString */
    public java.lang.String m49961x9616526c() {
        return "AppBrandBackgroundRunningApp{appId='" + this.f158454d + "', versionType=" + this.f158455e + ", usage=" + this.f158456f + ", icon='" + this.f158457g + "', name='" + this.f158458h + "', username='" + this.f158459i + "', uiclass='" + this.f158460m + "', process='" + this.f158461n + "', customNotificationLogicClassName='" + this.f158462o + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158454d);
        parcel.writeInt(this.f158455e);
        parcel.writeInt(this.f158456f);
        parcel.writeString(this.f158457g);
        parcel.writeString(this.f158458h);
        parcel.writeString(this.f158459i);
        parcel.writeString(this.f158460m);
        parcel.writeString(this.f158461n);
        parcel.writeString(this.f158462o);
    }
}

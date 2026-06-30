package com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi;

/* renamed from: com.tencent.mm.plugin.aa.model.cgi.NetSceneNewAAQueryPFInfo$AALaunchItemParcel */
/* loaded from: classes9.dex */
public class C11334x8cc8d4b8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11334x8cc8d4b8> f33353x681a0c0c = new i61.l();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f153939d;

    /* renamed from: e, reason: collision with root package name */
    public long f153940e;

    public C11334x8cc8d4b8(android.os.Parcel parcel) {
        this.f153939d = parcel.readString();
        this.f153940e = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m48619x9616526c() {
        return "AALaunchItemParcel{username='" + this.f153939d + "', amount=" + this.f153940e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f153939d);
        parcel.writeLong(this.f153940e);
    }
}

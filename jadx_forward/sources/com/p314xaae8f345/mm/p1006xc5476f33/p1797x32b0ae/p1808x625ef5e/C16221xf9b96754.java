package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* renamed from: com.tencent.mm.plugin.lite.logic.MMLiteAppScheduleData */
/* loaded from: classes15.dex */
public class C16221xf9b96754 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.C16221xf9b96754> f37400x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b3();

    /* renamed from: d, reason: collision with root package name */
    public int f225414d;

    /* renamed from: e, reason: collision with root package name */
    public int f225415e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f225416f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225417g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f225418h;

    /* renamed from: i, reason: collision with root package name */
    public int f225419i;

    /* renamed from: m, reason: collision with root package name */
    public long f225420m;

    /* renamed from: n, reason: collision with root package name */
    public long f225421n;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f225414d);
        parcel.writeInt(this.f225415e);
        parcel.writeString(this.f225416f);
        parcel.writeString(this.f225417g);
        parcel.writeByte(this.f225418h ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f225419i);
        parcel.writeLong(this.f225420m);
        parcel.writeLong(this.f225421n);
    }
}

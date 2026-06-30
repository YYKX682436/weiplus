package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29;

/* renamed from: com.tencent.mm.plugin.setting.model.SwitchAccountModel */
/* loaded from: classes11.dex */
public class C17358xfe5b6e70 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17358xfe5b6e70> f37948x681a0c0c = new k14.n0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f241580d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f241581e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f241582f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f241583g;

    /* renamed from: h, reason: collision with root package name */
    public final int f241584h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f241585i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f241586m;

    public C17358xfe5b6e70(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5, java.lang.String str6) {
        this.f241580d = str;
        this.f241581e = str2;
        this.f241582f = str3;
        this.f241583g = str4;
        this.f241584h = i17;
        this.f241585i = str5;
        this.f241586m = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f241580d);
        parcel.writeString(this.f241581e);
        parcel.writeString(this.f241582f);
        parcel.writeString(this.f241583g);
        parcel.writeInt(this.f241584h);
        parcel.writeString(this.f241585i);
        parcel.writeString(this.f241586m);
    }
}

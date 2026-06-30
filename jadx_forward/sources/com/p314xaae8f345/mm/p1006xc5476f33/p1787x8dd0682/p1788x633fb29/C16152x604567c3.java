package com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.p1788x633fb29;

/* renamed from: com.tencent.mm.plugin.kidswatch.model.KidsWatchAcctInfo */
/* loaded from: classes14.dex */
public class C16152x604567c3 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.p1788x633fb29.C16152x604567c3> f37104x681a0c0c = new x83.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f224630d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f224631e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f224632f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f224633g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f224634h;

    public C16152x604567c3(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        this.f224630d = i17;
        this.f224633g = str;
        this.f224631e = str2;
        this.f224634h = str4;
        this.f224632f = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f224630d);
        parcel.writeString(this.f224633g);
        parcel.writeString(this.f224631e);
        parcel.writeString(this.f224634h);
        parcel.writeString(this.f224632f);
    }

    public C16152x604567c3(android.os.Parcel parcel) {
        this.f224630d = parcel.readInt();
        this.f224633g = parcel.readString();
        this.f224631e = parcel.readString();
        this.f224634h = parcel.readString();
        this.f224632f = parcel.readString();
    }
}

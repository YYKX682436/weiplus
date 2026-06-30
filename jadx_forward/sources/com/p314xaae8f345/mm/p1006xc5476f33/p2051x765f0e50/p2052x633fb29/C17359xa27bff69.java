package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29;

/* renamed from: com.tencent.mm.plugin.setting.model.UserAuthItemParcelable */
/* loaded from: classes8.dex */
public class C17359xa27bff69 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17359xa27bff69> f37949x681a0c0c = new k14.y0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f241587d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f241588e;

    /* renamed from: f, reason: collision with root package name */
    public int f241589f;

    /* renamed from: g, reason: collision with root package name */
    public int f241590g;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f241587d);
        parcel.writeString(this.f241588e);
        parcel.writeInt(this.f241589f);
        parcel.writeInt(this.f241590g);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29;

/* renamed from: com.tencent.mm.plugin.order.model.MallOrderDetailObject$HelpCenter */
/* loaded from: classes9.dex */
public class C16773xeeea2670 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16773xeeea2670> f37714x681a0c0c = new dp3.a();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f234310d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f234311e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f234312f;

    public C16773xeeea2670(android.os.Parcel parcel) {
        this.f234310d = parcel.readString();
        this.f234311e = parcel.readString();
        this.f234312f = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f234310d);
        parcel.writeString(this.f234311e);
        parcel.writeByte(this.f234312f ? (byte) 1 : (byte) 0);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo$IPCSetLabInfoRequest */
/* loaded from: classes7.dex */
final class C12143xbfa90314 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.C12143xbfa90314> f34387x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f162909d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f162910e;

    public C12143xbfa90314(java.lang.String str, boolean z17) {
        this.f162909d = str;
        this.f162910e = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f162909d);
        parcel.writeByte(this.f162910e ? (byte) 1 : (byte) 0);
    }

    public C12143xbfa90314(android.os.Parcel parcel) {
        this.f162909d = parcel.readString();
        this.f162910e = parcel.readByte() != 0;
    }
}

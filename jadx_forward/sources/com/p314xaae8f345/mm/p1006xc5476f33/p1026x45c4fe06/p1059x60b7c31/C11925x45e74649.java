package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiNavigateBackApplication$NavigateBackAppArgs */
/* loaded from: classes7.dex */
public final class C11925x45e74649 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11925x45e74649> f33658x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c8();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f160096d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f160097e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f160098f;

    /* renamed from: g, reason: collision with root package name */
    public final int f160099g;

    public C11925x45e74649(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f160096d = str;
        this.f160097e = str2;
        this.f160098f = str3;
        this.f160099g = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160096d);
        parcel.writeString(this.f160097e);
        parcel.writeString(this.f160098f);
        parcel.writeInt(this.f160099g);
    }

    public C11925x45e74649(android.os.Parcel parcel) {
        this.f160096d = parcel.readString();
        this.f160097e = parcel.readString();
        this.f160098f = parcel.readString();
        this.f160099g = parcel.readInt();
    }
}

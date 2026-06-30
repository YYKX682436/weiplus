package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest */
/* loaded from: classes7.dex */
final class C11947x660c2a36 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11947x660c2a36> f33676x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.he();

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f160182d;

    public C11947x660c2a36() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ie.class;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160182d);
    }

    public C11947x660c2a36(android.os.Parcel parcel) {
        this.f160182d = parcel.readString();
    }
}

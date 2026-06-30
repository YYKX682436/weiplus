package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenSingleStickerView$OpenEmojiSinglePageResult */
/* loaded from: classes7.dex */
public final class C12090xc6e2452b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12090xc6e2452b> f34144x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.p();

    /* renamed from: d, reason: collision with root package name */
    public boolean f162370d = false;

    public C12090xc6e2452b() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600
    /* renamed from: readParcel */
    public void mo50320xdc053d3f(android.os.Parcel parcel) {
        this.f162370d = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f162370d ? 1 : 0);
    }

    public C12090xc6e2452b(android.os.Parcel parcel) {
        mo50320xdc053d3f(parcel);
    }
}

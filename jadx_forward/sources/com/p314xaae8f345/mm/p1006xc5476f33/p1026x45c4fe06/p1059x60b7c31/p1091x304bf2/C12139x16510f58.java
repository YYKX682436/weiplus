package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask */
/* loaded from: classes7.dex */
class C12139x16510f58 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask$OpenGameDetailRequest */
    /* loaded from: classes7.dex */
    public static final class OpenGameDetailRequest extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58.OpenGameDetailRequest> f34330x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.d();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f162777d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f162778e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f162779f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f162780g;

        public OpenGameDetailRequest() {
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
        /* renamed from: forcePortrait */
        public boolean mo50396xd2cb8fa6() {
            return true;
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
        /* renamed from: getTaskClass */
        public java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v> mo50317x8a7a03d() {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58.class;
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
        /* renamed from: readParcel */
        public void mo50318xdc053d3f(android.os.Parcel parcel) {
            this.f162777d = parcel.readString();
            this.f162778e = parcel.readString();
            this.f162779f = parcel.readString();
            this.f162780g = parcel.readString();
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f162777d);
            parcel.writeString(this.f162778e);
            parcel.writeString(this.f162779f);
            parcel.writeString(this.f162780g);
        }

        public OpenGameDetailRequest(android.os.Parcel parcel) {
            mo50318xdc053d3f(parcel);
        }
    }

    private C12139x16510f58() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58.OpenGameDetailResult openGameDetailResult = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58.OpenGameDetailResult();
        if (!(abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58.OpenGameDetailRequest)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOpenGameDetail", "handleRequest, request not instance of OpenGameDetailRequest, finishProcess");
            openGameDetailResult.f162781d = false;
            m50420x7b736e5c(openGameDetailResult);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58.OpenGameDetailRequest openGameDetailRequest = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58.OpenGameDetailRequest) abstractC11887x3610e10c;
        java.lang.String str = openGameDetailRequest.f162777d;
        java.lang.String str2 = openGameDetailRequest.f162778e;
        java.lang.String str3 = openGameDetailRequest.f162779f;
        java.lang.String str4 = openGameDetailRequest.f162780g;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).fj(m50421x3c6fed6a(), str, str2, "waapp", str3, str4, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.c(this, openGameDetailResult));
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask$OpenGameDetailResult */
    /* loaded from: classes7.dex */
    public static final class OpenGameDetailResult extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58.OpenGameDetailResult> f34331x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.e();

        /* renamed from: d, reason: collision with root package name */
        public boolean f162781d = false;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f162782e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f162783f;

        public OpenGameDetailResult() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600
        /* renamed from: readParcel */
        public void mo50320xdc053d3f(android.os.Parcel parcel) {
            this.f162781d = parcel.readInt() == 1;
            this.f162782e = parcel.readString();
            this.f162783f = parcel.readString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f162781d ? 1 : 0);
            parcel.writeString(this.f162782e);
            parcel.writeString(this.f162783f);
        }

        public OpenGameDetailResult(android.os.Parcel parcel) {
            mo50320xdc053d3f(parcel);
        }
    }
}

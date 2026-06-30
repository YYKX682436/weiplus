package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShowUpdatableMessageSubscribeButton$ShowUpdatableMessageSubscribeButtonTask */
/* loaded from: classes4.dex */
class C12235xc84f920c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12235xc84f920c> f34778x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.m1();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f164593f;

    public C12235xc84f920c() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f164593f = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f164593f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        int i17;
        int i18;
        if (i95.n0.c(k01.x0.class) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShowUpdatableMessageSubscribeButtonTask", "IWxaUpdateableMsgService is null, err, return");
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return;
        }
        tt0.e Ai = ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).Ai(this.f164593f);
        if (Ai != null && (i18 = Ai.f66303xc4aab016) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShowUpdatableMessageSubscribeButtonTask", "shareKey:%s msgType:%d", this.f164593f, java.lang.Integer.valueOf(i18));
        } else if (Ai == null || ((i17 = Ai.f66299x9ac5f93a) != 2 && Ai.f66302xd09abf35 == 0)) {
            ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).Bi(this.f164593f, 1, 0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShowUpdatableMessageSubscribeButtonTask", "shareKey:%s btnState:%d msgState:%d ingore already process", this.f164593f, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(Ai.f66302xd09abf35));
        }
    }

    public C12235xc84f920c(android.os.Parcel parcel) {
        v(parcel);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact$GetUserDataTask */
/* loaded from: classes12.dex */
class C12067x4933c05e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12067x4933c05e> f34044x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.u();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f162022f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f162023g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f162024h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f162025i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f162026m = "";

    public C12067x4933c05e(java.lang.String str) {
        this.f162023g = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f162022f = parcel.readString();
        this.f162023g = parcel.readString();
        this.f162024h = parcel.readString();
        this.f162025i = parcel.readString();
        this.f162026m = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f162022f);
        parcel.writeString(this.f162023g);
        parcel.writeString(this.f162024h);
        parcel.writeString(this.f162025i);
        parcel.writeString(this.f162026m);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        this.f162022f = c01.z1.r();
        if (android.text.TextUtils.isEmpty(this.f162023g)) {
            return;
        }
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = this.f162023g;
        ((sg3.a) v0Var).getClass();
        this.f162024h = c01.a2.b(str);
        tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str2 = this.f162023g;
        ((sg3.a) v0Var2).getClass();
        this.f162025i = c01.a2.a(str2);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(this.f162023g);
        if (n07 != null) {
            java.lang.String c17 = n07.c();
            this.f162026m = c17;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                this.f162026m = n07.d();
            }
        }
    }

    public C12067x4933c05e(android.os.Parcel parcel) {
        v(parcel);
    }
}

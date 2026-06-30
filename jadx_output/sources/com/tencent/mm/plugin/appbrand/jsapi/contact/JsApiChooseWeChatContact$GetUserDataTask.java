package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes12.dex */
class JsApiChooseWeChatContact$GetUserDataTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact$GetUserDataTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.contact.u();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f80489f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f80490g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f80491h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f80492i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f80493m = "";

    public JsApiChooseWeChatContact$GetUserDataTask(java.lang.String str) {
        this.f80490g = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f80489f = parcel.readString();
        this.f80490g = parcel.readString();
        this.f80491h = parcel.readString();
        this.f80492i = parcel.readString();
        this.f80493m = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f80489f);
        parcel.writeString(this.f80490g);
        parcel.writeString(this.f80491h);
        parcel.writeString(this.f80492i);
        parcel.writeString(this.f80493m);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        this.f80489f = c01.z1.r();
        if (android.text.TextUtils.isEmpty(this.f80490g)) {
            return;
        }
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = this.f80490g;
        ((sg3.a) v0Var).getClass();
        this.f80491h = c01.a2.b(str);
        tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str2 = this.f80490g;
        ((sg3.a) v0Var2).getClass();
        this.f80492i = c01.a2.a(str2);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(this.f80490g);
        if (n07 != null) {
            java.lang.String c17 = n07.c();
            this.f80493m = c17;
            if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                this.f80493m = n07.d();
            }
        }
    }

    public JsApiChooseWeChatContact$GetUserDataTask(android.os.Parcel parcel) {
        v(parcel);
    }
}

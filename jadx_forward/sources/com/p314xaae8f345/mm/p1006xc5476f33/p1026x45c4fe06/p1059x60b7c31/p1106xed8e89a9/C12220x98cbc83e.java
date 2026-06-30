package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/UrlJumpToProfileRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/jsapi/profile/n0;", "getTaskClass", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljz5/f0;", "writeToParcel", "", "d", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "dataUrl", "e", "I", "c", "()I", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "f", "a", "bizInfo", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.UrlJumpToProfileRequest */
/* loaded from: classes7.dex */
public final class C12220x98cbc83e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12220x98cbc83e> f34688x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.m0();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String dataUrl;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int scene;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String bizInfo;

    public C12220x98cbc83e(java.lang.String dataUrl, int i17, java.lang.String bizInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataUrl, "dataUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizInfo, "bizInfo");
        this.dataUrl = dataUrl;
        this.scene = i17;
        this.bizInfo = bizInfo;
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.String getBizInfo() {
        return this.bizInfo;
    }

    /* renamed from: b, reason: from getter */
    public final java.lang.String getDataUrl() {
        return this.dataUrl;
    }

    /* renamed from: c, reason: from getter */
    public final int getScene() {
        return this.scene;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n0> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n0.class;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.dataUrl);
        out.writeInt(this.scene);
        out.writeString(this.bizInfo);
    }
}

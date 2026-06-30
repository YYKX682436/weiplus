package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0016J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/OpenFinderFeedRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/jsapi/channels/l1;", "getTaskClass", "", "oneShotForeground", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljz5/f0;", "writeToParcel", "describeContents", "Lorg/json/JSONObject;", "d", "Lorg/json/JSONObject;", "a", "()Lorg/json/JSONObject;", "extInfoWrapper", "<init>", "(Lorg/json/JSONObject;)V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/channels/g1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedRequest */
/* loaded from: classes7.dex */
final class C12057x94e6f9c1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.g1 f33988x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.g1(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final org.json.JSONObject extInfoWrapper;

    public C12057x94e6f9c1(org.json.JSONObject extInfoWrapper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfoWrapper, "extInfoWrapper");
        this.extInfoWrapper = extInfoWrapper;
    }

    /* renamed from: a, reason: from getter */
    public final org.json.JSONObject getExtInfoWrapper() {
        return this.extInfoWrapper;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.l1> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.l1.class;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: oneShotForeground */
    public boolean mo50401x34ca7fe3() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.extInfoWrapper.toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12057x94e6f9c1(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r4 = r4.readString()
            if (r4 == 0) goto L33
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L11
            r0.<init>(r4)     // Catch: java.lang.Exception -> L11
            goto L38
        L11:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "OpenFinderFeedRequest#<init>, create JSONObject fail for "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " since "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "MicroMsg.AppBrand.JsApiOpenChannelsActivity"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r4)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            goto L38
        L33:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L38:
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.C12057x94e6f9c1.<init>(android.os.Parcel):void");
    }
}

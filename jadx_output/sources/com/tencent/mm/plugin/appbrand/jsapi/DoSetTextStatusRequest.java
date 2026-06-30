package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0014J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/DoSetTextStatusRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/jsapi/j1;", "getTaskClass", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljz5/f0;", "writeToParcel", "describeContents", "Lcom/tencent/mm/plugin/appbrand/jsapi/SetTextStatusParams;", "d", "Lcom/tencent/mm/plugin/appbrand/jsapi/SetTextStatusParams;", "a", "()Lcom/tencent/mm/plugin/appbrand/jsapi/SetTextStatusParams;", "setTextStatusParams", "<init>", "(Lcom/tencent/mm/plugin/appbrand/jsapi/SetTextStatusParams;)V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/h1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class DoSetTextStatusRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final com.tencent.mm.plugin.appbrand.jsapi.h1 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.h1(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams setTextStatusParams;

    public DoSetTextStatusRequest(com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams setTextStatusParams) {
        kotlin.jvm.internal.o.g(setTextStatusParams, "setTextStatusParams");
        this.setTextStatusParams = setTextStatusParams;
    }

    /* renamed from: a, reason: from getter */
    public final com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams getSetTextStatusParams() {
        return this.setTextStatusParams;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.j1> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.j1.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeParcelable(this.setTextStatusParams, i17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DoSetTextStatusRequest(android.os.Parcel r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "parcel"
            kotlin.jvm.internal.o.g(r0, r1)
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.DoSetTextStatusRequest> r1 = com.tencent.mm.plugin.appbrand.jsapi.DoSetTextStatusRequest.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r0 = r0.readParcelable(r1)
            com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams r0 = (com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams) r0
            if (r0 != 0) goto L2f
            com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams r0 = new com.tencent.mm.plugin.appbrand.jsapi.SetTextStatusParams
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 32767(0x7fff, float:4.5916E-41)
            r18 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L2f:
            r1 = r19
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.DoSetTextStatusRequest.<init>(android.os.Parcel):void");
    }
}

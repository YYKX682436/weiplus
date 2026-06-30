package com.tencent.mm.plugin.appbrand.jsapi.share;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB!\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001dJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/share/ShareVideoToConversationRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/jsapi/share/g3;", "getTaskClass", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljz5/f0;", "writeToParcel", "describeContents", "", "d", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "videoPath", "e", "b", "thumbPath", "Lcom/tencent/mm/plugin/appbrand/jsapi/chattool/ChatToolParams;", "f", "Lcom/tencent/mm/plugin/appbrand/jsapi/chattool/ChatToolParams;", "a", "()Lcom/tencent/mm/plugin/appbrand/jsapi/chattool/ChatToolParams;", "chatToolParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/chattool/ChatToolParams;)V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/share/e3", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class ShareVideoToConversationRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final com.tencent.mm.plugin.appbrand.jsapi.share.e3 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.share.e3(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String videoPath;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String thumbPath;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams chatToolParams;

    public ShareVideoToConversationRequest(java.lang.String videoPath, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams chatToolParams) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(chatToolParams, "chatToolParams");
        this.videoPath = videoPath;
        this.thumbPath = str;
        this.chatToolParams = chatToolParams;
    }

    /* renamed from: a, reason: from getter */
    public final com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams getChatToolParams() {
        return this.chatToolParams;
    }

    /* renamed from: b, reason: from getter */
    public final java.lang.String getThumbPath() {
        return this.thumbPath;
    }

    /* renamed from: c, reason: from getter */
    public final java.lang.String getVideoPath() {
        return this.videoPath;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.share.g3> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.share.g3.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.videoPath);
        parcel.writeString(this.thumbPath);
        parcel.writeParcelable(this.chatToolParams, i17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShareVideoToConversationRequest(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = r4.readString()
            if (r0 != 0) goto Ld
            java.lang.String r0 = ""
        Ld:
            java.lang.String r1 = r4.readString()
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams> r2 = com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r4 = r4.readParcelable(r2)
            kotlin.jvm.internal.o.d(r4)
            com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams r4 = (com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams) r4
            r3.<init>(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.share.ShareVideoToConversationRequest.<init>(android.os.Parcel):void");
    }
}

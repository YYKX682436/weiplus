package com.tencent.mm.plugin.appbrand.jsapi.share;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000  2\u00020\u0001:\u0001!B+\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/share/ShareFileToConversationRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/jsapi/share/e2;", "getTaskClass", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljz5/f0;", "writeToParcel", "describeContents", "", "d", "Ljava/lang/String;", "()Ljava/lang/String;", com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "e", "b", "fileExt", "f", "c", com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, "Lcom/tencent/mm/plugin/appbrand/jsapi/chattool/ChatToolParams;", "g", "Lcom/tencent/mm/plugin/appbrand/jsapi/chattool/ChatToolParams;", "a", "()Lcom/tencent/mm/plugin/appbrand/jsapi/chattool/ChatToolParams;", "chatToolParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/jsapi/chattool/ChatToolParams;)V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/share/c2", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class ShareFileToConversationRequest extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest {
    public static final com.tencent.mm.plugin.appbrand.jsapi.share.c2 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.share.c2(null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String filePath;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String fileExt;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String fileName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams chatToolParams;

    public ShareFileToConversationRequest(java.lang.String filePath, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams chatToolParams) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(chatToolParams, "chatToolParams");
        this.filePath = filePath;
        this.fileExt = str;
        this.fileName = str2;
        this.chatToolParams = chatToolParams;
    }

    /* renamed from: a, reason: from getter */
    public final com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams getChatToolParams() {
        return this.chatToolParams;
    }

    /* renamed from: b, reason: from getter */
    public final java.lang.String getFileExt() {
        return this.fileExt;
    }

    /* renamed from: c, reason: from getter */
    public final java.lang.String getFileName() {
        return this.fileName;
    }

    /* renamed from: d, reason: from getter */
    public final java.lang.String getFilePath() {
        return this.filePath;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest
    public java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.share.e2> getTaskClass() {
        return com.tencent.mm.plugin.appbrand.jsapi.share.e2.class;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.filePath);
        parcel.writeString(this.fileExt);
        parcel.writeString(this.fileName);
        parcel.writeParcelable(this.chatToolParams, i17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShareFileToConversationRequest(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = r5.readString()
            if (r0 != 0) goto Ld
            java.lang.String r0 = ""
        Ld:
            java.lang.String r1 = r5.readString()
            java.lang.String r2 = r5.readString()
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams> r3 = com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            android.os.Parcelable r5 = r5.readParcelable(r3)
            kotlin.jvm.internal.o.d(r5)
            com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams r5 = (com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams) r5
            r4.<init>(r0, r1, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.share.ShareFileToConversationRequest.<init>(android.os.Parcel):void");
    }
}

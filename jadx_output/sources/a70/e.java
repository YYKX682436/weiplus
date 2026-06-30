package a70;

@j95.b
/* loaded from: classes12.dex */
public final class e extends i95.w implements b70.e {
    public com.tencent.mm.plugin.handoff.model.AbsHandOffFile Ai(r45.gp0 dataItem, java.lang.String str, com.tencent.mm.storage.f9 f9Var, java.lang.String str2) {
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        return com.tencent.mm.plugin.handoff.model.HandOffFile.Companion.b(dataItem, str, f9Var, str2);
    }

    public com.tencent.mm.plugin.handoff.model.HandOff Bi(java.lang.String liteAppBizType, java.lang.String icon, java.lang.String title, java.lang.String appId, java.lang.String page, java.lang.String query, java.lang.String url, java.lang.String extraData, java.lang.String key) {
        kotlin.jvm.internal.o.g(liteAppBizType, "liteAppBizType");
        kotlin.jvm.internal.o.g(icon, "icon");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(extraData, "extraData");
        kotlin.jvm.internal.o.g(key, "key");
        return new com.tencent.mm.plugin.handoff.model.HandOffLiteApp(liteAppBizType, icon, title, appId, page, query, url, extraData, 1, "", "", key);
    }

    public com.tencent.mm.plugin.handoff.model.AbsHandOffFile wi(java.lang.String fullPath, java.lang.String fileType, java.lang.String title, java.lang.String md52, long j17, int i17, java.lang.String svrId, java.lang.String extId, java.lang.String cdnURL, java.lang.String aesKey, java.lang.String authKey, int i18, java.lang.String appId, int i19, java.lang.String mediaId, long j18, int i27, java.lang.String from, java.lang.String to6) {
        kotlin.jvm.internal.o.g(fullPath, "fullPath");
        kotlin.jvm.internal.o.g(fileType, "fileType");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(md52, "md5");
        kotlin.jvm.internal.o.g(svrId, "svrId");
        kotlin.jvm.internal.o.g(extId, "extId");
        kotlin.jvm.internal.o.g(cdnURL, "cdnURL");
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        kotlin.jvm.internal.o.g(authKey, "authKey");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(from, "from");
        kotlin.jvm.internal.o.g(to6, "to");
        return new com.tencent.mm.plugin.handoff.model.HandOffFile(fullPath, fileType, title, md52, j17, i17, svrId, extId, cdnURL, aesKey, authKey, i18, appId, i19, mediaId, j18, i27, from, to6, null, 524288, null);
    }
}

package com.tencent.mm.feature.emoji;

/* loaded from: classes.dex */
public final class v2 {
    public v2(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel a(long j17) {
        com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel emoticonJsApiDownloadModel;
        java.util.HashMap hashMap = com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel.f66005i;
        synchronized (hashMap) {
            emoticonJsApiDownloadModel = (com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel) hashMap.get(java.lang.Long.valueOf(j17));
            if (emoticonJsApiDownloadModel == null) {
                emoticonJsApiDownloadModel = new com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel();
                emoticonJsApiDownloadModel.f66006d = j17;
                hashMap.put(java.lang.Long.valueOf(j17), emoticonJsApiDownloadModel);
            }
        }
        return emoticonJsApiDownloadModel;
    }
}

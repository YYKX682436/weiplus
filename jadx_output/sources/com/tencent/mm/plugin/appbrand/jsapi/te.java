package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
final class te implements com.tencent.mm.ipcinvoker.j {
    private te() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        dn.k kVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("appType", 0);
        int i18 = bundle.getInt("fileType", 0);
        java.lang.String key = bundle.getString("fileKey", "");
        java.lang.String string = bundle.getString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "");
        if (bundle.getBoolean("isCancel")) {
            if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelUploadTaskWithResult(key, new com.tencent.mars.cdn.CdnManager.C2CUploadResult()) == 0) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("ret", 3);
                rVar.a(bundle2);
                java.util.HashMap hashMap = i91.f.f289702a;
                kotlin.jvm.internal.o.g(key, "key");
                java.util.HashMap hashMap2 = i91.f.f289702a;
                dn.m mVar = (dn.m) hashMap2.get(key);
                if (mVar != null && (kVar = mVar.f241787f) != null) {
                    dn.g gVar = new dn.g();
                    gVar.field_finishedLength = mVar.B1;
                    dn.h hVar = new dn.h();
                    hVar.field_retCode = -10008;
                    kVar.r4(key, 0, gVar, hVar, false);
                }
                hashMap2.remove(key);
                return;
            }
            return;
        }
        byte[] byteArray = android.text.TextUtils.isEmpty(bundle.getString("fileDataKey", "")) ? bundle.getByteArray("fileData") : za1.b.f470878a.a(bundle.getString("fileDataKey"), true);
        java.lang.String string2 = bundle.getString("thumbFilePath", "");
        byte[] byteArray2 = android.text.TextUtils.isEmpty(bundle.getString("thumbFileDataKey", "")) ? bundle.getByteArray("thumbFileData") : za1.b.f470878a.a(bundle.getString("thumbFileDataKey"), true);
        boolean z17 = bundle.getBoolean("isStorageMode", true);
        bundle.getInt("snsUploadVersion", 1);
        dn.m mVar2 = new dn.m();
        mVar2.f241785d = "task_JsApiUploadToCommonCDN";
        mVar2.field_fileType = i18;
        mVar2.field_bzScene = 2;
        mVar2.field_appType = i17;
        mVar2.field_mediaId = key;
        mVar2.field_fullpath = string;
        mVar2.field_thumbpath = string2;
        mVar2.field_needStorage = z17;
        if (byteArray != null) {
            mVar2.f241792m = byteArray;
        }
        if (byteArray2 != null) {
            mVar2.f241794o = byteArray2;
        }
        mVar2.f241787f = new com.tencent.mm.plugin.appbrand.jsapi.se(this, rVar);
        if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar2)) {
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putInt("ret", 2);
            rVar.a(bundle3);
        } else {
            java.util.HashMap hashMap3 = i91.f.f289702a;
            java.lang.String field_mediaId = mVar2.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            hashMap3.put(field_mediaId, mVar2);
        }
    }
}

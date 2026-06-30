package ac4;

/* loaded from: classes4.dex */
public final class c {
    public final int a(r45.d86 imageInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        kotlin.jvm.internal.o.g(imageInfo, "imageInfo");
        java.lang.String str = imageInfo.f372239t;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCmtImageUploadMgr", "checkImageUploadFinish >> id: " + str);
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCmtImageUploadMgr", "checkImageUploadFinish localId is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 3;
        }
        kotlin.jvm.internal.o.d(str);
        if (!r26.n0.B(str, "sns_cmt_local_", false)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsCmtImageUploadMgr", "checkImageUploadFinish >> localId is no contains CMT_IMAGE_LOCAL_SUFFIX");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 1;
        }
        int parseInt = java.lang.Integer.parseInt(d(imageInfo));
        if (parseInt == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCmtImageUploadMgr", "uploading depend localMediaId can not get the media");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 3;
        }
        com.tencent.mm.plugin.sns.storage.l2 n17 = com.tencent.mm.plugin.sns.model.l4.Hj().n1(parseInt);
        try {
            com.tencent.mm.protobuf.f parseFrom = new r45.mj4().parseFrom(n17.h());
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MediaUploadInfo");
            r45.mj4 mj4Var = (r45.mj4) parseFrom;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCmtImageUploadMgr", "state " + mj4Var.f380570n + "uploadId: " + parseInt);
            if (ca4.z0.G0(mj4Var)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
                return 3;
            }
            java.lang.String str2 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), n17.e()) + ca4.z0.X(n17.e());
            if (com.tencent.mm.vfs.w6.k(str2) == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCmtImageUploadMgr", "path not exist  " + str2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
                return 3;
            }
            if (!ca4.z0.H0(mj4Var)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
                return 1;
            }
            if (mj4Var.f380566g != null) {
                java.util.LinkedList linkedList = mj4Var.f380568i;
                if (linkedList.size() > 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillInfoWithSnsMedia", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
                    java.lang.String Url = mj4Var.f380566g.f371595d;
                    kotlin.jvm.internal.o.f(Url, "Url");
                    java.lang.String Url2 = ((r45.cj4) linkedList.get(0)).f371595d;
                    kotlin.jvm.internal.o.f(Url2, "Url");
                    java.lang.String md52 = mj4Var.f380579w;
                    kotlin.jvm.internal.o.f(md52, "md5");
                    imageInfo.f372226d = Url;
                    imageInfo.f372233n = Url2;
                    imageInfo.f372240u = md52;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsCmtImageUploadMgr", "fillInfoWithSnsMedia >> url: " + Url + " thumb: " + Url2 + " md5: " + md52);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillInfoWithSnsMedia", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
                    return 2;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCmtImageUploadMgr", "upload info url is error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 3;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCmtImageUploadMgr", "parse uploadInfo error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 3;
        }
    }

    public final int b(r45.d86 imageInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaUploadServerError", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        kotlin.jvm.internal.o.g(imageInfo, "imageInfo");
        java.lang.String str = imageInfo.f372239t;
        if (str == null || str.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaUploadServerError", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 0;
        }
        kotlin.jvm.internal.o.d(str);
        if (r26.n0.B(str, "sns_cmt_local_", false)) {
            str = d(imageInfo);
        }
        int parseInt = java.lang.Integer.parseInt(str);
        if (parseInt == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaUploadServerError", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 0;
        }
        try {
            com.tencent.mm.protobuf.f parseFrom = new r45.mj4().parseFrom(com.tencent.mm.plugin.sns.model.l4.Hj().n1(parseInt).h());
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MediaUploadInfo");
            int i17 = ((r45.mj4) parseFrom).f380575s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaUploadServerError", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return i17;
        } catch (java.lang.Exception unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaUploadServerError", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 0;
        }
    }

    public final boolean c(r45.d86 imageInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertCmtImageInfoToStorage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        kotlin.jvm.internal.o.g(imageInfo, "imageInfo");
        java.lang.String str = imageInfo.f372226d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCmtImageUploadMgr", "insertCmtImageInfoToStorage >> path: " + str);
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCmtImageUploadMgr", "insertCmtImageInfoToStorage, originPath not exist");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertCmtImageInfoToStorage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return false;
        }
        imageInfo.f372226d = str;
        ca4.w0 w0Var = new ca4.w0(str, 2);
        w0Var.f40037e = 2;
        int C1 = com.tencent.mm.plugin.sns.model.l4.Hj().C1(w0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCmtImageUploadMgr", "insertCmtImageInfoToStorage >> snsMediaStorageMediaId: " + C1);
        if (C1 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCmtImageUploadMgr", "insertCmtImageInfoToStorage, originPath not exist");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertCmtImageInfoToStorage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return false;
        }
        java.lang.String mediaId = java.lang.String.valueOf(C1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("wrapMediaId", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        imageInfo.f372239t = "sns_cmt_local_".concat(mediaId);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("wrapMediaId", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        imageInfo.f372228f = w0Var.f40039g;
        imageInfo.f372229g = w0Var.f40040h;
        imageInfo.f372231i = w0Var.f40041i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uploadImageInfo", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCmtImageUploadMgr", "uploadImageInfo >> path: " + imageInfo.f372226d + " id: " + imageInfo.f372239t);
        if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCmtImageUploadMgr", "is invalid to getSnsInfoStorage");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uploadImageInfo", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime());
            sb6.append(' ');
            sb6.append(java.lang.System.currentTimeMillis());
            byte[] bytes = sb6.toString().getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            int parseInt = java.lang.Integer.parseInt(d(imageInfo));
            com.tencent.mm.plugin.sns.model.l3 l3Var = new com.tencent.mm.plugin.sns.model.l3(parseInt, g17, false, 0);
            ac4.b bVar = ac4.b.f3081a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCustomCallback", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            l3Var.f164399w = bVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCustomCallback", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCdnAppType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            l3Var.f164398v = 115;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCdnAppType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            com.tencent.mm.plugin.sns.model.l4.xj().t(parseInt, l3Var.hashCode());
            gm0.j1.n().f273288b.g(l3Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uploadImageInfo", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertCmtImageInfoToStorage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        return true;
    }

    public final java.lang.String d(r45.d86 d86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unWrapMediaId", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        kotlin.jvm.internal.o.g(d86Var, "<this>");
        java.lang.String MediaId = d86Var.f372239t;
        kotlin.jvm.internal.o.f(MediaId, "MediaId");
        java.lang.String t17 = r26.i0.t(MediaId, "sns_cmt_local_", "", false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unWrapMediaId", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        return t17;
    }
}

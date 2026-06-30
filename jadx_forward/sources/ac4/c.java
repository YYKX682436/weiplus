package ac4;

/* loaded from: classes4.dex */
public final class c {
    public final int a(r45.d86 imageInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageInfo, "imageInfo");
        java.lang.String str = imageInfo.f453772t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCmtImageUploadMgr", "checkImageUploadFinish >> id: " + str);
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCmtImageUploadMgr", "checkImageUploadFinish localId is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 3;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (!r26.n0.B(str, "sns_cmt_local_", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsCmtImageUploadMgr", "checkImageUploadFinish >> localId is no contains CMT_IMAGE_LOCAL_SUFFIX");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 1;
        }
        int parseInt = java.lang.Integer.parseInt(d(imageInfo));
        if (parseInt == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCmtImageUploadMgr", "uploading depend localMediaId can not get the media");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().n1(parseInt);
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.mj4().mo11468x92b714fd(n17.h());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MediaUploadInfo");
            r45.mj4 mj4Var = (r45.mj4) mo11468x92b714fd;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCmtImageUploadMgr", "state " + mj4Var.f462103n + "uploadId: " + parseInt);
            if (ca4.z0.G0(mj4Var)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
                return 3;
            }
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), n17.e()) + ca4.z0.X(n17.e());
            if (com.p314xaae8f345.mm.vfs.w6.k(str2) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCmtImageUploadMgr", "path not exist  " + str2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
                return 3;
            }
            if (!ca4.z0.H0(mj4Var)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
                return 1;
            }
            if (mj4Var.f462099g != null) {
                java.util.LinkedList linkedList = mj4Var.f462101i;
                if (linkedList.size() > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillInfoWithSnsMedia", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
                    java.lang.String Url = mj4Var.f462099g.f453128d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url, "Url");
                    java.lang.String Url2 = ((r45.cj4) linkedList.get(0)).f453128d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url2, "Url");
                    java.lang.String md52 = mj4Var.f462112w;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(md52, "md5");
                    imageInfo.f453759d = Url;
                    imageInfo.f453766n = Url2;
                    imageInfo.f453773u = md52;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCmtImageUploadMgr", "fillInfoWithSnsMedia >> url: " + Url + " thumb: " + Url2 + " md5: " + md52);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillInfoWithSnsMedia", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
                    return 2;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCmtImageUploadMgr", "upload info url is error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 3;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCmtImageUploadMgr", "parse uploadInfo error");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkImageUploadFinish", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 3;
        }
    }

    public final int b(r45.d86 imageInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaUploadServerError", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageInfo, "imageInfo");
        java.lang.String str = imageInfo.f453772t;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaUploadServerError", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (r26.n0.B(str, "sns_cmt_local_", false)) {
            str = d(imageInfo);
        }
        int parseInt = java.lang.Integer.parseInt(str);
        if (parseInt == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaUploadServerError", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 0;
        }
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.mj4().mo11468x92b714fd(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().n1(parseInt).h());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MediaUploadInfo");
            int i17 = ((r45.mj4) mo11468x92b714fd).f462108s;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaUploadServerError", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return i17;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaUploadServerError", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return 0;
        }
    }

    public final boolean c(r45.d86 imageInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertCmtImageInfoToStorage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageInfo, "imageInfo");
        java.lang.String str = imageInfo.f453759d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCmtImageUploadMgr", "insertCmtImageInfoToStorage >> path: " + str);
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCmtImageUploadMgr", "insertCmtImageInfoToStorage, originPath not exist");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertCmtImageInfoToStorage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return false;
        }
        imageInfo.f453759d = str;
        ca4.w0 w0Var = new ca4.w0(str, 2);
        w0Var.f121570e = 2;
        int C1 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().C1(w0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCmtImageUploadMgr", "insertCmtImageInfoToStorage >> snsMediaStorageMediaId: " + C1);
        if (C1 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCmtImageUploadMgr", "insertCmtImageInfoToStorage, originPath not exist");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertCmtImageInfoToStorage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
            return false;
        }
        java.lang.String mediaId = java.lang.String.valueOf(C1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("wrapMediaId", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        imageInfo.f453772t = "sns_cmt_local_".concat(mediaId);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("wrapMediaId", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        imageInfo.f453761f = w0Var.f121572g;
        imageInfo.f453762g = w0Var.f121573h;
        imageInfo.f453764i = w0Var.f121574i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("uploadImageInfo", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCmtImageUploadMgr", "uploadImageInfo >> path: " + imageInfo.f453759d + " id: " + imageInfo.f453772t);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCmtImageUploadMgr", "is invalid to getSnsInfoStorage");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uploadImageInfo", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(android.os.SystemClock.elapsedRealtime());
            sb6.append(' ');
            sb6.append(java.lang.System.currentTimeMillis());
            byte[] bytes = sb6.toString().getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            int parseInt = java.lang.Integer.parseInt(d(imageInfo));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l3 l3Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l3(parseInt, g17, false, 0);
            ac4.b bVar = ac4.b.f84614a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCustomCallback", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            l3Var.f245932w = bVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCustomCallback", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCdnAppType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            l3Var.f245931v = 115;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCdnAppType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().t(parseInt, l3Var.hashCode());
            gm0.j1.n().f354821b.g(l3Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uploadImageInfo", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertCmtImageInfoToStorage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        return true;
    }

    public final java.lang.String d(r45.d86 d86Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unWrapMediaId", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d86Var, "<this>");
        java.lang.String MediaId = d86Var.f453772t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MediaId, "MediaId");
        java.lang.String t17 = r26.i0.t(MediaId, "sns_cmt_local_", "", false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unWrapMediaId", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr");
        return t17;
    }
}

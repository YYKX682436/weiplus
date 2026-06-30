package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
final class y3 extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: e, reason: collision with root package name */
    private com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest f82148e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f82149f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f82150g;

    /* renamed from: h, reason: collision with root package name */
    private com.tencent.mm.ui.widget.dialog.u3 f82151h;

    /* renamed from: i, reason: collision with root package name */
    private android.content.DialogInterface.OnCancelListener f82152i;

    /* renamed from: m, reason: collision with root package name */
    int f82153m;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult f82147d = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult();

    /* renamed from: n, reason: collision with root package name */
    private int f82154n = -1;

    private y3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String N() {
        if (!android.text.TextUtils.isEmpty(this.f82150g)) {
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject b17 = com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.b(this.f82148e.f81634d, this.f82150g, null, true);
            if (b17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(b17.f76102d)) {
                return b17.f76102d;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "addThumbItem error, localId is null");
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject O(java.lang.String str, boolean z17) {
        gp.d dVar;
        if (z17) {
            try {
                str = com.tencent.mm.plugin.appbrand.jsapi.media.t7.e(str);
            } catch (java.lang.Exception e17) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "addVideoItem, remux failed, exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        try {
            dVar = new gp.d();
            dVar.setDataSource(str);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", e18);
            dVar = null;
        }
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "addVideoItem, null meta data");
            return null;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(18), 0);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(19), 0);
        int P3 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(9), 0);
        int P4 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(24), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "outputWidth:%d, outputHeight:%d, rotation:%d", java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(P2), java.lang.Integer.valueOf(P4));
        if (P4 == 90 || P4 == 270) {
            P2 = P;
            P = P2;
        }
        try {
            dVar.release();
        } catch (java.io.IOException unused) {
        }
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject appBrandLocalVideoObject = (com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject) com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.c(this.f82148e.f81634d, str, com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject.class, "mp4", false);
        if (appBrandLocalVideoObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "attachVideo error, return null");
            return null;
        }
        appBrandLocalVideoObject.f76112n = (P3 + 500) / 1000;
        appBrandLocalVideoObject.f76114p = P;
        appBrandLocalVideoObject.f76115q = P2;
        appBrandLocalVideoObject.f76113o = com.tencent.mm.vfs.w6.k(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "addVideoItem, return %s", appBrandLocalVideoObject);
        return appBrandLocalVideoObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void P() {
        /*
            r12 = this;
            java.lang.String r0 = "MicroMsg.JsApiChooseMedia"
            java.lang.String r1 = "chooseMediaFromAlbum"
            com.tencent.mars.xlog.Log.i(r0, r1)
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r0 = r12.f82148e
            boolean r1 = r0.f81645r
            boolean r2 = r0.f81639i
            r3 = 1
            r4 = 3
            if (r2 == 0) goto L13
        L11:
            r9 = r4
            goto L26
        L13:
            boolean r2 = r0.f81637g
            if (r2 == 0) goto L1c
            boolean r5 = r0.f81638h
            if (r5 == 0) goto L1c
            goto L11
        L1c:
            if (r2 == 0) goto L20
            r9 = r3
            goto L26
        L20:
            boolean r0 = r0.f81638h
            if (r0 == 0) goto L11
            r4 = 2
            goto L11
        L26:
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r0 = r12.f82148e
            boolean r0 = r0.f81639i
            if (r0 != 0) goto L36
            java.lang.String r0 = "key_can_select_video_and_pic"
            r11.putExtra(r0, r3)
        L36:
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r0 = r12.f82148e
            boolean r0 = r0.f81644q
            r0 = r0 ^ r3
            java.lang.String r2 = "key_send_raw_image"
            r11.putExtra(r2, r0)
            java.lang.String r0 = "key_force_show_raw_image_button"
            r11.putExtra(r0, r1)
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r0 = r12.f82148e
            boolean r1 = r0.f81645r
            if (r1 == 0) goto L51
            boolean r0 = r0.f81644q
            if (r0 != 0) goto L51
            r0 = r3
            goto L52
        L51:
            r0 = 0
        L52:
            java.lang.String r1 = "key_is_raw_image_button_disable"
            r11.putExtra(r1, r0)
            java.lang.String r0 = "gallery_report_tag"
            r1 = 16
            r11.putExtra(r0, r1)
            java.lang.String r0 = "album_video_max_duration"
            r1 = 86400(0x15180, float:1.21072E-40)
            r11.putExtra(r0, r1)
            java.lang.String r0 = "album_business_tag"
            java.lang.String r1 = "album_business_bubble_media_by_jsapi_choosevideo"
            r11.putExtra(r0, r1)
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r0 = r12.f82148e
            boolean r0 = r0.f81643p
            if (r0 == 0) goto L78
            java.lang.String r0 = "Gallery_LivePhoto_Need_Query"
            r11.putExtra(r0, r3)
        L78:
            java.lang.Class<d85.m0> r0 = d85.m0.class
            i95.m r0 = i95.n0.c(r0)
            d85.m0 r0 = (d85.m0) r0
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r1 = r12.f82148e
            int r1 = r1.f81646s
            d85.d1 r0 = (d85.d1) r0
            d85.f0 r0 = r0.wi(r1)
            if (r0 == 0) goto L93
            java.lang.String r1 = "album_business_by_real_scene"
            java.lang.String r0 = r0.f227176d
            r11.putExtra(r1, r0)
        L93:
            java.lang.Class<vb0.o> r0 = vb0.o.class
            i95.m r0 = i95.n0.c(r0)
            vb0.o r0 = (vb0.o) r0
            com.tencent.mm.ui.MMActivity r5 = r12.getActivityContext()
            r6 = 8
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r1 = r12.f82148e
            int r7 = r1.f81642o
            int r8 = r12.f82153m
            r10 = 0
            ub0.r r0 = (ub0.r) r0
            r0.getClass()
            com.tencent.mm.pluginsdk.ui.tools.l7.c(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.media.y3.P():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void R() {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.media.y3.R():void");
    }

    private static java.util.List<java.lang.String> S(java.util.List<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> list) {
        if (list == null || list.isEmpty()) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem : list) {
            if (galleryItem$MediaItem.getType() == 6) {
                arrayList.add(galleryItem$MediaItem.o());
            } else {
                arrayList.add(galleryItem$MediaItem.f138430e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var;
        if (android.text.TextUtils.isEmpty(this.f82150g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "mThumbFilePath is empty!");
            r6Var = null;
        } else {
            r6Var = new com.tencent.mm.vfs.r6(this.f82150g);
        }
        if (r6Var != null && r6Var.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "file is exist!, path:%s", this.f82150g);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "file == null or file not exist for path:%s!", this.f82150g);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str3 = a17.f213279f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        java.lang.String substring = (android.text.TextUtils.isEmpty(str3) || !str3.contains(".")) ? null : str3.substring(0, str3.lastIndexOf("."));
        java.lang.String K = lp0.b.K();
        if (android.text.TextUtils.isEmpty(substring)) {
            this.f82150g = com.tencent.mm.vfs.w6.i(K + ("microMsg_" + java.lang.System.currentTimeMillis()) + ".jpeg", true);
        } else if (K == null || !K.endsWith("/")) {
            this.f82150g = com.tencent.mm.vfs.w6.i(K + "/" + substring + ".jpeg", true);
        } else {
            this.f82150g = com.tencent.mm.vfs.w6.i(K + substring + ".jpeg", true);
        }
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(this.f82150g);
        java.lang.String str4 = a18.f213279f;
        if (str4 != null) {
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l18)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "file is exist for path:%s!", this.f82150g);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "file not exist for path:%s!", this.f82150g);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "create new thumb path:%s!", this.f82150g);
        android.graphics.Bitmap D = com.tencent.mm.sdk.platformtools.x.D(str, 1, -1);
        if (D == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "createVideoThumbnail bitmap fail for path:%s!", this.f82150g);
            return;
        }
        try {
            com.tencent.mm.sdk.platformtools.x.D0(D, 30, android.graphics.Bitmap.CompressFormat.JPEG, this.f82150g, true);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "saveBitmapToImage exist IOException:" + e17.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject U(java.lang.String str, boolean z17, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, boolean z18) {
        java.lang.String str2;
        if (z17 && galleryItem$MediaItem != null) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) galleryItem$MediaItem;
            if (galleryItem$LivePhotoMediaItem.G == 1) {
                str2 = galleryItem$LivePhotoMediaItem.f138430e;
            } else {
                str2 = lp0.b.K() + "microMsg." + java.lang.System.currentTimeMillis() + ".mp4";
                if (!((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).Ai(galleryItem$LivePhotoMediaItem.f138434i, str2, str, 0L).f12975a.f12960a) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "parse failed: %s", str);
                    return null;
                }
            }
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(str2, false);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(i17);
                java.lang.String str3 = a17.f213279f;
                if (str3 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
                    return O(i17, z18);
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "take live photo local failed, path:%s", str);
            }
        }
        return null;
    }

    private com.tencent.mm.plugin.mmsight.SightParams V(int i17) {
        java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        this.f82149f = com.tencent.mm.vfs.w6.i(lp0.b.K() + "microMsg." + str + ".mp4", false);
        this.f82150g = com.tencent.mm.vfs.w6.i(lp0.b.K() + "microMsg." + str + ".jpeg", true);
        int i18 = this.f82148e.f81641n;
        com.tencent.mm.plugin.mmsight.SightParams sightParams = new com.tencent.mm.plugin.mmsight.SightParams(3, 1);
        sightParams.f148818e = this.f82148e.f81640m ? 1 : 2;
        sightParams.f148817d = i17;
        if (sightParams.f148819f == null) {
            sightParams.f148819f = new com.tencent.mm.modelcontrol.VideoTransPara();
        }
        sightParams.f148819f.f71195h = i18;
        sightParams.f148826p = false;
        sightParams.a(str, this.f82149f, this.f82150g, lp0.b.K());
        return sightParams;
    }

    private void W() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "goVideo");
        getActivityContext().mmSetOnActivityResultCallback(this);
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest = this.f82148e;
        if (jsApiChooseMedia$ChooseRequest.f81635e) {
            P();
        } else {
            if (jsApiChooseMedia$ChooseRequest.f81636f) {
                R();
                return;
            }
            this.f82147d.f81647d = -2;
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "parameter is invalid, fail and finish process");
            finishProcess(this.f82147d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(java.lang.String str, java.lang.String str2) {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, false);
        this.f82149f = i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "mVideoFilePath is null");
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult = this.f82147d;
            jsApiChooseMedia$ChooseResult.f81647d = -2;
            finishProcess(jsApiChooseMedia$ChooseResult);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "mVideoFilePath:%s", this.f82149f);
        if (!b0(this.f82150g) && b0(str2)) {
            this.f82150g = com.tencent.mm.vfs.w6.i(str2, true);
        }
        f0(com.tencent.mm.R.string.f490080kc);
        ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.w3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(java.lang.String str, android.content.Intent intent) {
        boolean z17 = false;
        java.lang.String imageFile = com.tencent.mm.vfs.w6.i(str, false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(imageFile)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "picture_picturePath file is not exist! path:%s", imageFile);
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult = this.f82147d;
            jsApiChooseMedia$ChooseResult.f81647d = -2;
            finishProcess(jsApiChooseMedia$ChooseResult);
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("CropImage_Compress_Img", false);
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest = this.f82148e;
        boolean z18 = jsApiChooseMedia$ChooseRequest.f81644q;
        boolean z19 = jsApiChooseMedia$ChooseRequest.f81645r;
        boolean z27 = ((z19 ^ true) && z18) || (booleanExtra && (z19 & z18));
        boolean z28 = this.f82148e.f81645r;
        if (z27) {
            f0(com.tencent.mm.R.string.f490080kc);
        }
        if (!z27) {
            kotlin.jvm.internal.o.g(imageFile, "imageFile");
            if ((com.tencent.mm.sdk.platformtools.t8.K0(imageFile) || com.tencent.mm.compatible.util.Exif.fromFile(imageFile).getOrientationInDegree() == 0) ? false : true) {
                z17 = true;
            }
        }
        if (z17) {
            f0(com.tencent.mm.R.string.f490081kd);
        }
        ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.v3(this, imageFile, z27, z17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(java.lang.String str, java.util.List<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> list, int i17, boolean z17, java.util.ArrayList<java.lang.Boolean> arrayList, java.util.ArrayList<java.lang.String> arrayList2, java.util.ArrayList<java.lang.Long> arrayList3) {
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject appBrandLocalVideoObject;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || list == null || i17 == -1 || i17 >= list.size()) {
            appBrandLocalVideoObject = null;
        } else {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = list.get(i17);
            r1 = galleryItem$MediaItem.getType() == 6;
            appBrandLocalVideoObject = U(str, r1, galleryItem$MediaItem, z17);
        }
        arrayList.add(java.lang.Boolean.valueOf(r1));
        if (!r1 || appBrandLocalVideoObject == null) {
            arrayList2.add("");
            arrayList3.add(0L);
        } else {
            arrayList2.add(appBrandLocalVideoObject.f76102d);
            arrayList3.add(java.lang.Long.valueOf(appBrandLocalVideoObject.f76113o));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(org.json.JSONStringer jSONStringer, java.lang.String str, long j17) {
        try {
            jSONStringer.object();
            jSONStringer.key("tempFilePath");
            jSONStringer.value(str);
            jSONStringer.key("size");
            jSONStringer.value(j17);
            jSONStringer.key("fileType");
            jSONStringer.value("image");
            jSONStringer.endObject();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiChooseMedia", e17, "", new java.lang.Object[0]);
        }
    }

    private boolean a0() {
        return com.tencent.mm.sdk.platformtools.t8.w(getActivityContext()) > 200;
    }

    private static void b(org.json.JSONStringer jSONStringer, java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.Long> arrayList2) {
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "_parseImageItemToJson localIds is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "_parseImageItemToJson()");
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            a(jSONStringer, arrayList.get(i17), arrayList2.get(i17).longValue());
        }
    }

    private boolean b0(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "video thumb file path is null");
            return false;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "thumbFilePath:%s", str);
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "video thumb file is exist");
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "video thumb file is not exist");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(org.json.JSONStringer jSONStringer, java.lang.String str, long j17, java.lang.String str2, long j18, boolean z17) {
        try {
            jSONStringer.object();
            jSONStringer.key("tempFilePath");
            jSONStringer.value(str);
            jSONStringer.key("size");
            jSONStringer.value(j17);
            jSONStringer.key("fileType");
            jSONStringer.value("image");
            if (z17 && j18 > 0) {
                jSONStringer.key("isLivePhoto");
                jSONStringer.value(true);
                jSONStringer.key("livePhotoVideoPath");
                jSONStringer.value(str2);
                jSONStringer.key("livePhotoVideoFileSize");
                jSONStringer.value(j18);
            }
            jSONStringer.endObject();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiChooseMedia", e17, "", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String c0(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.Long> arrayList2, java.util.ArrayList<java.lang.String> arrayList3, java.util.ArrayList<java.lang.Long> arrayList4, java.util.ArrayList<java.lang.Boolean> arrayList5) {
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "parseMediaItemToJson localIds is null");
            return "";
        }
        org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
        try {
            jSONStringer.array();
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                c(jSONStringer, arrayList.get(i17), arrayList2.get(i17).longValue(), arrayList3.get(i17), arrayList4.get(i17).longValue(), arrayList5.get(i17).booleanValue());
            }
            jSONStringer.endArray();
            return jSONStringer.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiChooseMedia", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(org.json.JSONStringer jSONStringer, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson localId is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson()");
        try {
            jSONStringer.object();
            jSONStringer.key("tempFilePath");
            jSONStringer.value(str);
            jSONStringer.key("thumbTempFilePath");
            jSONStringer.value(str2);
            jSONStringer.key("duration");
            jSONStringer.value(i17);
            jSONStringer.key("height");
            jSONStringer.value(i18);
            jSONStringer.key("width");
            jSONStringer.value(i19);
            jSONStringer.key("size");
            jSONStringer.value(j17);
            jSONStringer.key("fileType");
            jSONStringer.value("video");
            jSONStringer.endObject();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiChooseMedia", e17, "", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String d0(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.Long> arrayList2, boolean z17) {
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "parseImageItemToJson localIds is null");
            return "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "parseImageItemToJson()");
        org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
        try {
            jSONStringer.array();
            b(jSONStringer, arrayList, arrayList2);
            jSONStringer.endArray();
            return jSONStringer.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiChooseMedia", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String e0(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson localId is null");
            return "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson()");
        org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
        try {
            jSONStringer.array();
            d(jSONStringer, str, str2, i17, i18, i19, j17);
            jSONStringer.endArray();
            return jSONStringer.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiChooseMedia", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    private void f0(int i17) {
        this.f82152i = new com.tencent.mm.plugin.appbrand.jsapi.media.x3(this);
        this.f82151h = db5.e1.Q(getActivityContext(), getString(com.tencent.mm.R.string.f490573yv), getString(i17), true, true, this.f82152i);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        this.f82148e = (com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest) appBrandProxyUIProcessTask$ProcessRequest;
        this.f82153m = 16;
        if (!a0()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "memory is not enough!");
            db5.t7.makeText(getActivityContext(), getString(com.tencent.mm.R.string.f490079kb), 1).show();
        }
        W();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v, com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == this.f82154n) {
            return;
        }
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult resultCode is canceled");
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult = this.f82147d;
            jsApiChooseMedia$ChooseResult.f81647d = 0;
            finishProcess(jsApiChooseMedia$ChooseResult);
            return;
        }
        if (-1 != i18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult resultCode is not RESULT_OK");
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult2 = this.f82147d;
            jsApiChooseMedia$ChooseResult2.f81647d = -2;
            finishProcess(jsApiChooseMedia$ChooseResult2);
            return;
        }
        if (i17 == 7) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "REQUEST_CODE_TAKE_MEDIA_CAMERA");
            if (intent == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "data is null!");
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult3 = this.f82147d;
                jsApiChooseMedia$ChooseResult3.f81647d = -2;
                finishProcess(jsApiChooseMedia$ChooseResult3);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "data is valid!");
            com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = (com.tencent.mm.plugin.mmsight.SightCaptureResult) intent.getParcelableExtra("key_req_result");
            if (sightCaptureResult == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "sight capture result is null!");
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult4 = this.f82147d;
                jsApiChooseMedia$ChooseResult4.f81647d = -2;
                finishProcess(jsApiChooseMedia$ChooseResult4);
                return;
            }
            if (sightCaptureResult.f148807e) {
                Y(sightCaptureResult.f148815p, intent);
                return;
            } else {
                X(sightCaptureResult.f148809g, sightCaptureResult.f148810h);
                return;
            }
        }
        if (i17 != 8) {
            if (i17 != 9) {
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult5 = this.f82147d;
                jsApiChooseMedia$ChooseResult5.f81647d = -2;
                finishProcess(jsApiChooseMedia$ChooseResult5);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "REQUEST_CODE_TAKE_MEDIA_MMRECORDUI");
            if (intent == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "data is null!");
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult6 = this.f82147d;
                jsApiChooseMedia$ChooseResult6.f81647d = -2;
                finishProcess(jsApiChooseMedia$ChooseResult6);
                return;
            }
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
            if (captureDataManager$CaptureVideoNormalModel == null) {
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult7 = this.f82147d;
                jsApiChooseMedia$ChooseResult7.f81647d = 0;
                finishProcess(jsApiChooseMedia$ChooseResult7);
                return;
            } else if (captureDataManager$CaptureVideoNormalModel.f155664h.booleanValue()) {
                Y(captureDataManager$CaptureVideoNormalModel.f155662f, intent);
                return;
            } else {
                X(captureDataManager$CaptureVideoNormalModel.f155661e, captureDataManager$CaptureVideoNormalModel.f155662f);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "REQUEST_CODE_TAKE_MEDIA_LOCAL");
        if (!this.f82148e.f81639i) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
            boolean booleanExtra = intent.getBooleanExtra("CropImage_Compress_Img", false);
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest = this.f82148e;
            boolean z17 = jsApiChooseMedia$ChooseRequest.f81644q;
            boolean z18 = jsApiChooseMedia$ChooseRequest.f81645r;
            boolean z19 = ((z18 ^ true) && z17) || ((z18 & z17) && booleanExtra);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "onActivityResult, fromAlbum, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f82148e.f81645r), java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(z19));
            if (stringArrayListExtra != null && stringArrayListExtra.size() > 0) {
                f0(com.tencent.mm.R.string.f490080kc);
                java.util.Set set = com.tencent.mm.plugin.appbrand.utils.s0.f90550a;
                ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.r3(this, stringArrayListExtra, z19));
                return;
            }
            java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_select_multi_pic_item");
            java.util.List S = this.f82148e.f81643p ? S(parcelableArrayListExtra) : intent.getStringArrayListExtra("CropImage_OutputPath_List");
            if (S == null || S.size() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "chosen is null,  fail");
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult8 = this.f82147d;
                jsApiChooseMedia$ChooseResult8.f81647d = -2;
                finishProcess(jsApiChooseMedia$ChooseResult8);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "onActivityResult, fromCamera = %b, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(this.f82148e.f81644q), java.lang.Boolean.valueOf(this.f82148e.f81645r), java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(z19));
            if (z19) {
                f0(com.tencent.mm.R.string.f490080kc);
            }
            boolean z27 = !z19 && com.tencent.mm.plugin.appbrand.jsapi.media.p7.f(S);
            if (z27) {
                f0(com.tencent.mm.R.string.f490081kd);
            }
            ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.t3(this, S, z19, z27, parcelableArrayListExtra));
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_video_list");
        java.util.ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("key_select_multi_pic_item");
        java.util.List S2 = this.f82148e.f81643p ? S(parcelableArrayListExtra2) : intent.getStringArrayListExtra("CropImage_OutputPath_List");
        java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("key_select_mix_media_list");
        boolean z28 = stringArrayListExtra2 != null && stringArrayListExtra2.size() > 0;
        boolean z29 = S2 != null && S2.size() > 0;
        if (stringArrayListExtra3 == null || stringArrayListExtra3.size() == 0 || this.f82148e.f81643p) {
            stringArrayListExtra3 = new java.util.ArrayList<>();
            if (z28) {
                stringArrayListExtra3.addAll(stringArrayListExtra2);
            }
            if (z29) {
                stringArrayListExtra3.addAll(S2);
            }
        }
        java.util.ArrayList<java.lang.String> arrayList = stringArrayListExtra3;
        java.util.Iterator<java.lang.String> it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "mediaPath:%s", it.next());
        }
        if (!z28 && !z29) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "none select any image or video");
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult9 = this.f82147d;
            jsApiChooseMedia$ChooseResult9.f81647d = -2;
            finishProcess(jsApiChooseMedia$ChooseResult9);
            return;
        }
        boolean booleanExtra2 = intent.getBooleanExtra("CropImage_Compress_Img", false);
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest2 = this.f82148e;
        boolean z37 = jsApiChooseMedia$ChooseRequest2.f81644q;
        boolean z38 = jsApiChooseMedia$ChooseRequest2.f81645r;
        boolean z39 = ((z38 ^ true) && z37) || ((z38 & z37) && booleanExtra2);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "onActivityResult, fromAlbum, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", java.lang.Boolean.valueOf(z37), java.lang.Boolean.valueOf(this.f82148e.f81645r), java.lang.Boolean.valueOf(booleanExtra2), java.lang.Boolean.valueOf(z39));
        if (z39 ? true : z28) {
            f0(com.tencent.mm.R.string.f490080kc);
        }
        boolean z47 = (z39 || S2 == null || !com.tencent.mm.plugin.appbrand.jsapi.media.p7.f(S2)) ? false : true;
        if (z47) {
            f0(com.tencent.mm.R.string.f490081kd);
        }
        java.util.Set set2 = com.tencent.mm.plugin.appbrand.utils.s0.f90550a;
        ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.q3(this, z28, z29, arrayList, stringArrayListExtra2, z39, S2, z47, parcelableArrayListExtra2));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void onProcessInterrupted() {
        super.onProcessInterrupted();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f82151h;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f82151h = null;
        }
    }
}

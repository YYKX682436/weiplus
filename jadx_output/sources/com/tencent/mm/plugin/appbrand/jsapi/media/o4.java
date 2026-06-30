package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes10.dex */
final class o4 extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: i, reason: collision with root package name */
    private static final int f81959i = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f81960m = 2;

    /* renamed from: d, reason: collision with root package name */
    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseRequest f81961d;

    /* renamed from: e, reason: collision with root package name */
    com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult f81962e = new com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult();

    /* renamed from: f, reason: collision with root package name */
    int f81963f = 7;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.mm.ui.widget.dialog.u3 f81964g;

    /* renamed from: h, reason: collision with root package name */
    private android.content.DialogInterface.OnCancelListener f81965h;

    private o4() {
    }

    private void A() {
        boolean z17;
        getActivityContext().mmSetOnActivityResultCallback(this);
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseRequest jsApiChooseMultiMedia$ChooseRequest = this.f81961d;
        int i17 = jsApiChooseMultiMedia$ChooseRequest.f81661r;
        int i18 = 0;
        if (i17 == 1) {
            z17 = true;
        } else if (i17 == 2) {
            z17 = false;
            r4 = 1;
        } else {
            r4 = i17 == 3 ? 2 : 3;
            z17 = false;
        }
        boolean z18 = jsApiChooseMultiMedia$ChooseRequest.f81656m;
        if (z18 && jsApiChooseMultiMedia$ChooseRequest.f81657n) {
            android.content.Intent G = G();
            G.putExtra("query_media_type", r4);
            G.putExtra("key_can_select_video_and_pic", z17);
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
            int i19 = this.f81961d.f81651e;
            int i27 = this.f81963f;
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.e(activityContext, 1, i19, i27, G);
            return;
        }
        if (jsApiChooseMultiMedia$ChooseRequest.f81657n) {
            android.content.Intent G2 = G();
            G2.putExtra("show_header_view", false);
            G2.putExtra("query_media_type", r4);
            G2.putExtra("key_can_select_video_and_pic", z17);
            vb0.o oVar2 = (vb0.o) i95.n0.c(vb0.o.class);
            com.tencent.mm.ui.MMActivity activityContext2 = getActivityContext();
            int i28 = this.f81961d.f81651e;
            int i29 = this.f81963f;
            ((ub0.r) oVar2).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.e(activityContext2, 1, i28, i29, G2);
            return;
        }
        if (!z18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "unknown scene, ignore this request");
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult jsApiChooseMultiMedia$ChooseResult = this.f81962e;
            jsApiChooseMultiMedia$ChooseResult.f81663d = -2;
            finishProcess(jsApiChooseMultiMedia$ChooseResult);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("album_business_bubble_media_by_coordinate_latitude", this.f81961d.f81653g);
        intent.putExtra("album_business_bubble_media_by_coordinate_longitude", this.f81961d.f81652f);
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseRequest jsApiChooseMultiMedia$ChooseRequest2 = this.f81961d;
        boolean z19 = jsApiChooseMultiMedia$ChooseRequest2.f81659p;
        if (z19 && !jsApiChooseMultiMedia$ChooseRequest2.f81660q) {
            i18 = 1;
        } else if (jsApiChooseMultiMedia$ChooseRequest2.f81660q && !z19) {
            i18 = 2;
        }
        intent.putExtra("KEY_SIGHT_PARAMS", z(i18));
        vb0.o oVar3 = (vb0.o) i95.n0.c(vb0.o.class);
        com.tencent.mm.ui.MMActivity activityContext3 = getActivityContext();
        ((ub0.r) oVar3).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.j(activityContext3, 2, intent, 7, i18);
    }

    private boolean B() {
        return com.tencent.mm.sdk.platformtools.t8.w(getActivityContext()) > 200;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String C(java.lang.String str, long j17, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", "image");
            jSONObject.put("tempFilePath", str);
            jSONObject.put("size", j17);
            jSONObject.put("width", i17);
            jSONObject.put("height", i18);
            jSONObject.put("orientation", str2);
            jSONObject.put("mark", str3);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "camera");
            jSONArray.put(jSONObject);
            java.lang.String jSONArray2 = jSONArray.toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "parseImageItemToJson, res: %s.", jSONArray2);
            return jSONArray2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiChooseMultiMedia", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String D(java.lang.String str, long j17, int i17, int i18, int i19, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "parseImageItemToJson()");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", "video");
            jSONObject.put("tempFilePath", str);
            jSONObject.put("size", j17);
            jSONObject.put("width", i17);
            jSONObject.put("height", i18);
            jSONObject.put("duration", i19);
            jSONObject.put("thumbTempFilePath", str2);
            jSONObject.put("mark", str3);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "camera");
            jSONArray.put(jSONObject);
            return jSONArray.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiChooseMultiMedia", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    private static java.lang.String E(java.lang.String str) {
        int[] iArr = new int[2];
        y(str, iArr, false);
        int i17 = iArr[0];
        int i18 = iArr[1];
        java.lang.String str2 = lp0.b.m() + "microMsg." + java.lang.System.currentTimeMillis() + ".mp4";
        com.tencent.mm.modelcontrol.VideoTransPara Di = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Di();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        ((h90.y) i95.n0.c(h90.y.class)).getClass();
        ls0.a1.f320792a.a(str, str2, i17, i18, Di.f71194g, Di.f71193f, Di.D, Di.E, new com.tencent.mm.plugin.appbrand.jsapi.media.n4(countDownLatch)).b();
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "latch await exception, %s.", e17.getMessage());
        }
        return str2;
    }

    private static android.graphics.Point F(int i17, int i18, int i19, int i27) {
        int i28;
        int i29;
        if (i17 <= i19 && i18 <= i27) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "calc scale, small or equal to spec size");
            return null;
        }
        int max = java.lang.Math.max(i17, i18);
        int min = java.lang.Math.min(i17, i18);
        int max2 = java.lang.Math.max(i19, i27);
        int min2 = java.lang.Math.min(i19, i27);
        if (max % 16 == 0 && java.lang.Math.abs(max - max2) < 16 && min % 16 == 0 && java.lang.Math.abs(min - min2) < 16) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "calc scale, same len divide by 16, no need scale");
            return null;
        }
        int i37 = max / 2;
        int i38 = min / 2;
        if (i37 % 16 == 0 && java.lang.Math.abs(i37 - max2) < 16 && i38 % 16 == 0 && java.lang.Math.abs(i38 - min2) < 16) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "calc scale, double ratio divide by 16");
            int i39 = i17 / 2;
            int i47 = i18 / 2;
            if (i39 % 2 != 0) {
                i39++;
            }
            if (i47 % 2 != 0) {
                i47++;
            }
            return new android.graphics.Point(i39, i47);
        }
        android.graphics.Point point = new android.graphics.Point();
        if (i17 < i18) {
            i28 = java.lang.Math.min(i19, i27);
            i29 = (int) (i18 / ((i17 * 1.0d) / i28));
        } else {
            int min3 = java.lang.Math.min(i19, i27);
            i28 = (int) (i17 / ((i18 * 1.0d) / min3));
            i29 = min3;
        }
        if (i29 % 2 != 0) {
            i29++;
        }
        if (i28 % 2 != 0) {
            i28++;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "calc scale, outputsize: %s %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
        point.x = i28;
        point.y = i29;
        return point;
    }

    private android.content.Intent G() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("album_business_tag", "album_business_bubble_media_by_coordinate");
        intent.putExtra("album_video_max_duration", this.f81961d.f81658o);
        intent.putExtra("album_business_bubble_media_by_coordinate_distance", this.f81961d.f81655i);
        intent.putExtra("album_business_bubble_media_by_coordinate_latitude", this.f81961d.f81653g);
        intent.putExtra("album_business_bubble_media_by_coordinate_longitude", this.f81961d.f81652f);
        intent.putExtra("album_business_bubble_media_by_coordinate_posname", this.f81961d.f81654h);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("send_btn_string", getString(com.tencent.mm.R.string.f490502ww));
        intent.putExtra("gallery_report_tag", 18);
        return intent;
    }

    private boolean H(java.util.List<java.lang.String> list) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            return false;
        }
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (com.tencent.mm.compatible.util.Exif.fromFile(it.next()).getOrientationInDegree() != 0) {
                return true;
            }
        }
        return false;
    }

    private void I() {
        this.f81965h = new com.tencent.mm.plugin.appbrand.jsapi.media.m4(this);
        this.f81964g = db5.e1.Q(getActivityContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490081kd), true, true, this.f81965h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String r(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject b17 = com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.b(this.f81961d.f81650d, str, null, true);
            if (b17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(b17.f76102d)) {
                return b17.f76102d;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "addThumbItem error, localId is null");
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject s(java.lang.String str, boolean z17) {
        gp.d dVar;
        if (z17) {
            try {
                str = E(str);
            } catch (java.lang.Exception e17) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, remux failed, exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        try {
            dVar = new gp.d();
            dVar.setDataSource(str);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", e18);
            dVar = null;
        }
        if (dVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, null meta data");
            return null;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(18), 0);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(19), 0);
        int P3 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(9), 0);
        if ("90".equals(dVar.extractMetadata(24)) && P > P2) {
            P2 = P;
            P = P2;
        }
        try {
            dVar.release();
        } catch (java.io.IOException unused) {
        }
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject appBrandLocalVideoObject = (com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject) com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.c(this.f81961d.f81650d, str, com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject.class, "mp4", false);
        if (appBrandLocalVideoObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "attachVideo error, return null");
            return null;
        }
        appBrandLocalVideoObject.f76112n = (P3 + 500) / 1000;
        appBrandLocalVideoObject.f76114p = P;
        appBrandLocalVideoObject.f76115q = P2;
        appBrandLocalVideoObject.f76113o = com.tencent.mm.vfs.w6.k(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, return %s", appBrandLocalVideoObject);
        return appBrandLocalVideoObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:5:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String t(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.JsApiChooseMultiMedia"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = lp0.b.m()
            r1.append(r2)
            java.lang.String r2 = "microMsg."
            r1.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r2 = ".jpg"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            java.lang.String r1 = com.tencent.mm.vfs.w6.i(r1, r2)
            r2 = 0
            android.graphics.Bitmap r3 = com.tencent.mm.graphics.e.c(r11)     // Catch: java.lang.Exception -> L2e java.lang.NullPointerException -> L42 java.lang.OutOfMemoryError -> L5a
            goto L7d
        L2e:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "doCompressImage, decode bmp e "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.mars.xlog.Log.e(r0, r3)
        L40:
            r3 = r2
            goto L7d
        L42:
            android.graphics.Bitmap r3 = com.tencent.mm.sdk.platformtools.x.J(r11, r2)     // Catch: java.lang.Exception -> L47
            goto L7d
        L47:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "doCompressImage, decode bmp npe retry, e "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.mars.xlog.Log.e(r0, r3)
            goto L40
        L5a:
            java.lang.String r3 = "doCompressImage, decode bmp oom"
            com.tencent.mars.xlog.Log.e(r0, r3)
            android.graphics.Bitmap r3 = com.tencent.mm.sdk.platformtools.x.J(r11, r2)     // Catch: java.lang.Exception -> L64 java.lang.OutOfMemoryError -> L77
            goto L7d
        L64:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "doCompressImage, decode bmp oom retry, e "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.mars.xlog.Log.e(r0, r3)
            goto L40
        L77:
            java.lang.String r3 = "doCompressImage, decode bmp oom retry, oom again"
            com.tencent.mars.xlog.Log.e(r0, r3)
            goto L40
        L7d:
            if (r3 != 0) goto L85
            java.lang.String r11 = "doCompressImage, decode bmp return null"
            com.tencent.mars.xlog.Log.e(r0, r11)
            return r2
        L85:
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r2 = java.lang.System.currentTimeMillis()
            r4 = -1
            r5 = 70
            boolean r9 = com.tencent.mm.plugin.appbrand.utils.e0.a(r1, r11, r4, r4, r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            long r5 = com.tencent.mm.vfs.w6.k(r11)
            java.lang.Long r6 = java.lang.Long.valueOf(r5)
            long r7 = com.tencent.mm.vfs.w6.k(r1)
            java.lang.Long r8 = java.lang.Long.valueOf(r7)
            r3 = r4
            r4 = r2
            r5 = r11
            r7 = r1
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8}
            java.lang.String r3 = "doCompressImage, ret = %b, cost = %d, %s (%d) -> %s (%d)"
            com.tencent.mars.xlog.Log.i(r0, r3, r2)
            if (r9 == 0) goto Lbf
            r11 = r1
        Lbf:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.media.o4.t(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String u(java.lang.String str) {
        java.lang.String str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            return "";
        }
        java.lang.String str4 = a17.f213279f;
        int lastIndexOf = str4.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str4 = str4.substring(lastIndexOf + 1);
        }
        java.lang.String substring = (android.text.TextUtils.isEmpty(str4) || !str4.contains(".")) ? null : str4.substring(0, str4.lastIndexOf("."));
        if (android.text.TextUtils.isEmpty(substring)) {
            str2 = lp0.b.m() + ("microMsg_" + java.lang.System.currentTimeMillis()) + ".jpeg";
        } else if (lp0.b.m() == null || !lp0.b.m().endsWith("/")) {
            str2 = lp0.b.m() + "/" + substring + java.lang.System.currentTimeMillis() + ".jpeg";
        } else {
            str2 = lp0.b.m() + substring + java.lang.System.currentTimeMillis() + ".jpeg";
        }
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str2);
        java.lang.String str5 = a18.f213279f;
        if (str5 != null) {
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str5, false, false);
            if (!str5.equals(l18)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        if (m18.a() ? m18.f213266a.F(m18.f213267b) : false) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "file is exist for path:%s!", str2);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "file not exist for path:%s! create it!", str2);
            android.graphics.Bitmap D = com.tencent.mm.sdk.platformtools.x.D(str, 2, -1);
            if (D == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "createVideoThumbnail bitmap fail for path:%s!", str2);
                return "";
            }
            try {
                com.tencent.mm.sdk.platformtools.x.D0(D, 80, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "saveBitmapToImage exist IOException:" + e17.getMessage());
            }
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String v(java.lang.String str) {
        int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(str).getOrientationInDegree();
        if (orientationInDegree != 0) {
            int i17 = orientationInDegree % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
            try {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(str, options);
                if (d17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "rotate image, get null bmp");
                    return str;
                }
                android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(d17, i17);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(lp0.b.m());
                sb6.append("microMsg.tmp.");
                sb6.append(java.lang.System.currentTimeMillis());
                sb6.append(je.a.d(options) ? com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG : ".png");
                java.lang.String sb7 = sb6.toString();
                try {
                    com.tencent.mm.sdk.platformtools.x.D0(w07, 80, je.a.d(options) ? android.graphics.Bitmap.CompressFormat.JPEG : android.graphics.Bitmap.CompressFormat.PNG, sb7, true);
                    if (je.a.d(options)) {
                        ya1.d.b(str, sb7);
                    }
                    return sb7;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "rotate image, exception occurred when saving | %s", e17);
                    com.tencent.mm.vfs.w6.h(sb7);
                }
            } catch (java.lang.NullPointerException | java.lang.OutOfMemoryError unused) {
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String w(long j17, double d17) {
        java.lang.String str;
        java.lang.String str2 = j17 + "";
        if (d17 < 0.0d) {
            str = str2 + "00";
        } else if (d17 <= 20.0d) {
            str = str2 + "99";
        } else if (d17 <= 40.0d) {
            str = str2 + "97";
        } else if (d17 <= 60.0d) {
            str = str2 + "95";
        } else if (d17 <= 80.0d) {
            str = str2 + "93";
        } else if (d17 <= 100.0d) {
            str = str2 + "91";
        } else if (d17 <= 120.0d) {
            str = str2 + "89";
        } else if (d17 <= 140.0d) {
            str = str2 + "87";
        } else if (d17 <= 160.0d) {
            str = str2 + "85";
        } else if (d17 <= 180.0d) {
            str = str2 + "83";
        } else if (d17 <= 200.0d) {
            str = str2 + "81";
        } else if (d17 <= 250.0d) {
            str = str2 + "76";
        } else if (d17 <= 300.0d) {
            str = str2 + "71";
        } else if (d17 <= 350.0d) {
            str = str2 + "66";
        } else if (d17 <= 400.0d) {
            str = str2 + com.tencent.maas.MJMaasVersion.BUILD_NUMBER;
        } else if (d17 <= 450.0d) {
            str = str2 + "56";
        } else if (d17 <= 500.0d) {
            str = str2 + "51";
        } else if (d17 <= 1000.0d) {
            str = str2 + "20";
        } else {
            str = str2 + com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT;
        }
        if (!this.f81961d.f81662s) {
            return str;
        }
        return j17 + "01";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData x() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_locCache", 0).getString("locStr", null);
        if (string != null) {
            java.lang.String[] split = string.split(",");
            return new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData(com.tencent.mm.sdk.platformtools.t8.P(split[0], 0) / 1000000.0f, com.tencent.mm.sdk.platformtools.t8.P(split[1], 0) / 1000000.0f);
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(67591, null);
        if (str == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "lbs location is null, no cached data!");
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "location get error!");
            return null;
        }
        try {
            java.lang.String[] split2 = str.split(",");
            java.lang.Integer.valueOf(split2[0]).intValue();
            java.lang.Integer.valueOf(split2[1]).intValue();
            return new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData(java.lang.Integer.valueOf(split2[2]).intValue() / 1000000.0f, java.lang.Integer.valueOf(split2[3]).intValue() / 1000000.0f);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "getCurrentGPSData parse value error.", e17);
            return null;
        }
    }

    private static void y(java.lang.String str, int[] iArr, boolean z17) {
        gp.d dVar = null;
        try {
            gp.d dVar2 = new gp.d();
            try {
                dVar2.setDataSource(str);
                int P = com.tencent.mm.sdk.platformtools.t8.P(dVar2.extractMetadata(18), 0);
                int P2 = com.tencent.mm.sdk.platformtools.t8.P(dVar2.extractMetadata(19), 0);
                if (z17 && "90".equals(dVar2.extractMetadata(24)) && P > P2) {
                    P2 = P;
                    P = P2;
                }
                iArr[0] = P;
                iArr[1] = P2;
                com.tencent.mm.modelcontrol.VideoTransPara Di = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Di();
                android.graphics.Point F = F(P, P2, Di.f71191d, Di.f71192e);
                if (F != null) {
                    iArr[0] = F.x;
                    iArr[1] = F.y;
                }
                int i17 = iArr[0];
                int i18 = iArr[1];
                try {
                    dVar2.release();
                } catch (java.io.IOException unused) {
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                dVar = dVar2;
                if (dVar != null) {
                    try {
                        dVar.release();
                    } catch (java.io.IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    private com.tencent.mm.plugin.mmsight.SightParams z(int i17) {
        com.tencent.mm.plugin.mmsight.SightParams sightParams = new com.tencent.mm.plugin.mmsight.SightParams(7, 1);
        sightParams.f148817d = i17;
        sightParams.f148819f.f71195h = this.f81961d.f81658o;
        return sightParams;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        this.f81961d = (com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseRequest) appBrandProxyUIProcessTask$ProcessRequest;
        if (!B()) {
            db5.t7.makeText(getActivityContext(), getString(com.tencent.mm.R.string.f490079kb), 1).show();
        }
        A();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v, com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == 0) {
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult jsApiChooseMultiMedia$ChooseResult = this.f81962e;
            jsApiChooseMultiMedia$ChooseResult.f81663d = 0;
            finishProcess(jsApiChooseMultiMedia$ChooseResult);
            return;
        }
        double doubleExtra = intent != null ? intent.getDoubleExtra("longitude", 181.0d) : 181.0d;
        double doubleExtra2 = intent != null ? intent.getDoubleExtra("latitude", 91.0d) : 91.0d;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "requestCode: %d.", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "REQUEST_CODE_GALLERY");
            if (intent == null) {
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult jsApiChooseMultiMedia$ChooseResult2 = this.f81962e;
                jsApiChooseMultiMedia$ChooseResult2.f81663d = 0;
                finishProcess(jsApiChooseMultiMedia$ChooseResult2);
                return;
            } else {
                java.util.List<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_video_list");
                boolean booleanExtra = intent.getBooleanExtra("CropImage_Compress_Img", false);
                I();
                ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.j4(this, stringArrayListExtra, doubleExtra2, doubleExtra, booleanExtra, !booleanExtra && H(stringArrayListExtra), stringArrayListExtra2));
                return;
            }
        }
        if (i17 != 2) {
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult jsApiChooseMultiMedia$ChooseResult3 = this.f81962e;
            jsApiChooseMultiMedia$ChooseResult3.f81663d = -2;
            finishProcess(jsApiChooseMultiMedia$ChooseResult3);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "REQUEST_CODE_TAKE_MEDIA_CAMERA");
        if (intent == null) {
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult jsApiChooseMultiMedia$ChooseResult4 = this.f81962e;
            jsApiChooseMultiMedia$ChooseResult4.f81663d = 0;
            finishProcess(jsApiChooseMultiMedia$ChooseResult4);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "data is valid!");
        com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = (com.tencent.mm.plugin.mmsight.SightCaptureResult) intent.getParcelableExtra("key_req_result");
        if (sightCaptureResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "sight capture result is null!");
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult jsApiChooseMultiMedia$ChooseResult5 = this.f81962e;
            jsApiChooseMultiMedia$ChooseResult5.f81663d = -2;
            finishProcess(jsApiChooseMultiMedia$ChooseResult5);
            return;
        }
        if (!sightCaptureResult.f148807e) {
            java.lang.String str = sightCaptureResult.f148809g;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "mVideoFilePath:%s", str);
                I();
                ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.l4(this, str, doubleExtra2, doubleExtra));
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "mVideoFilePath is null");
                com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult jsApiChooseMultiMedia$ChooseResult6 = this.f81962e;
                jsApiChooseMultiMedia$ChooseResult6.f81663d = -2;
                finishProcess(jsApiChooseMultiMedia$ChooseResult6);
                return;
            }
        }
        java.lang.String str2 = sightCaptureResult.f148815p;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || !com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMultiMedia", "picture_picturePath file is not exist! path:%s", str2);
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia$ChooseResult jsApiChooseMultiMedia$ChooseResult7 = this.f81962e;
            jsApiChooseMultiMedia$ChooseResult7.f81663d = -2;
            finishProcess(jsApiChooseMultiMedia$ChooseResult7);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMultiMedia", "filePath:%s", str2);
        boolean booleanExtra2 = intent.getBooleanExtra("CropImage_Compress_Img", false);
        I();
        ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.media.k4(this, booleanExtra2, str2, doubleExtra2, doubleExtra));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void onProcessInterrupted() {
        super.onProcessInterrupted();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f81964g;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f81964g = null;
        }
    }
}

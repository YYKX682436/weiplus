package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
final class o4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

    /* renamed from: i, reason: collision with root package name */
    private static final int f163492i = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f163493m = 2;

    /* renamed from: d, reason: collision with root package name */
    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12164x3187af27 f163494d;

    /* renamed from: e, reason: collision with root package name */
    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885 f163495e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885();

    /* renamed from: f, reason: collision with root package name */
    int f163496f = 7;

    /* renamed from: g, reason: collision with root package name */
    private com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f163497g;

    /* renamed from: h, reason: collision with root package name */
    private android.content.DialogInterface.OnCancelListener f163498h;

    private o4() {
    }

    private void A() {
        boolean z17;
        m50421x3c6fed6a().m78545xde66c1f2(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12164x3187af27 c12164x3187af27 = this.f163494d;
        int i17 = c12164x3187af27.f163194r;
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
        boolean z18 = c12164x3187af27.f163189m;
        if (z18 && c12164x3187af27.f163190n) {
            android.content.Intent G = G();
            G.putExtra("query_media_type", r4);
            G.putExtra("key_can_select_video_and_pic", z17);
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
            int i19 = this.f163494d.f163184e;
            int i27 = this.f163496f;
            ((ub0.r) oVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.e(m50421x3c6fed6a, 1, i19, i27, G);
            return;
        }
        if (c12164x3187af27.f163190n) {
            android.content.Intent G2 = G();
            G2.putExtra("show_header_view", false);
            G2.putExtra("query_media_type", r4);
            G2.putExtra("key_can_select_video_and_pic", z17);
            vb0.o oVar2 = (vb0.o) i95.n0.c(vb0.o.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a2 = m50421x3c6fed6a();
            int i28 = this.f163494d.f163184e;
            int i29 = this.f163496f;
            ((ub0.r) oVar2).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.e(m50421x3c6fed6a2, 1, i28, i29, G2);
            return;
        }
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "unknown scene, ignore this request");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885 c12165x963f1885 = this.f163495e;
            c12165x963f1885.f163196d = -2;
            m50420x7b736e5c(c12165x963f1885);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("album_business_bubble_media_by_coordinate_latitude", this.f163494d.f163186g);
        intent.putExtra("album_business_bubble_media_by_coordinate_longitude", this.f163494d.f163185f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12164x3187af27 c12164x3187af272 = this.f163494d;
        boolean z19 = c12164x3187af272.f163192p;
        if (z19 && !c12164x3187af272.f163193q) {
            i18 = 1;
        } else if (c12164x3187af272.f163193q && !z19) {
            i18 = 2;
        }
        intent.putExtra("KEY_SIGHT_PARAMS", z(i18));
        vb0.o oVar3 = (vb0.o) i95.n0.c(vb0.o.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a3 = m50421x3c6fed6a();
        ((ub0.r) oVar3).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.j(m50421x3c6fed6a3, 2, intent, 7, i18);
    }

    private boolean B() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w(m50421x3c6fed6a()) > 200;
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
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "camera");
            jSONArray.put(jSONObject);
            java.lang.String jSONArray2 = jSONArray.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "parseImageItemToJson, res: %s.", jSONArray2);
            return jSONArray2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiChooseMultiMedia", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String D(java.lang.String str, long j17, int i17, int i18, int i19, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "parseImageItemToJson()");
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
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "camera");
            jSONArray.put(jSONObject);
            return jSONArray.toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiChooseMultiMedia", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    private static java.lang.String E(java.lang.String str) {
        int[] iArr = new int[2];
        y(str, iArr, false);
        int i17 = iArr[0];
        int i18 = iArr[1];
        java.lang.String str2 = lp0.b.m() + "microMsg." + java.lang.System.currentTimeMillis() + ".mp4";
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d Di = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Di();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        ((h90.y) i95.n0.c(h90.y.class)).getClass();
        ls0.a1.f402325a.a(str, str2, i17, i18, Di.f152727g, Di.f152726f, Di.D, Di.E, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n4(countDownLatch)).b();
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "latch await exception, %s.", e17.getMessage());
        }
        return str2;
    }

    private static android.graphics.Point F(int i17, int i18, int i19, int i27) {
        int i28;
        int i29;
        if (i17 <= i19 && i18 <= i27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "calc scale, small or equal to spec size");
            return null;
        }
        int max = java.lang.Math.max(i17, i18);
        int min = java.lang.Math.min(i17, i18);
        int max2 = java.lang.Math.max(i19, i27);
        int min2 = java.lang.Math.min(i19, i27);
        if (max % 16 == 0 && java.lang.Math.abs(max - max2) < 16 && min % 16 == 0 && java.lang.Math.abs(min - min2) < 16) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "calc scale, same len divide by 16, no need scale");
            return null;
        }
        int i37 = max / 2;
        int i38 = min / 2;
        if (i37 % 16 == 0 && java.lang.Math.abs(i37 - max2) < 16 && i38 % 16 == 0 && java.lang.Math.abs(i38 - min2) < 16) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "calc scale, double ratio divide by 16");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "calc scale, outputsize: %s %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
        point.x = i28;
        point.y = i29;
        return point;
    }

    private android.content.Intent G() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("album_business_tag", "album_business_bubble_media_by_coordinate");
        intent.putExtra("album_video_max_duration", this.f163494d.f163191o);
        intent.putExtra("album_business_bubble_media_by_coordinate_distance", this.f163494d.f163188i);
        intent.putExtra("album_business_bubble_media_by_coordinate_latitude", this.f163494d.f163186g);
        intent.putExtra("album_business_bubble_media_by_coordinate_longitude", this.f163494d.f163185f);
        intent.putExtra("album_business_bubble_media_by_coordinate_posname", this.f163494d.f163187h);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("send_btn_string", m50423x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww));
        intent.putExtra("gallery_report_tag", 18);
        return intent;
    }

    private boolean H(java.util.List<java.lang.String> list) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return false;
        }
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(it.next()).m43592x7a249f0b() != 0) {
                return true;
            }
        }
        return false;
    }

    private void I() {
        this.f163498h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.m4(this);
        this.f163497g = db5.e1.Q(m50421x3c6fed6a(), m50423x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), m50423x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571614kd), true, true, this.f163498h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String r(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.b(this.f163494d.f163183d, str, null, true);
            if (b17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f157635d)) {
                return b17.f157635d;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "addThumbItem error, localId is null");
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55 s(java.lang.String str, boolean z17) {
        gp.d dVar;
        if (z17) {
            try {
                str = E(str);
            } catch (java.lang.Exception e17) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, remux failed, exp = %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        try {
            dVar = new gp.d();
            dVar.setDataSource(str);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", e18);
            dVar = null;
        }
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, null meta data");
            return null;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(18), 0);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(19), 0);
        int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(9), 0);
        if ("90".equals(dVar.extractMetadata(24)) && P > P2) {
            P2 = P;
            P = P2;
        }
        try {
            dVar.release();
        } catch (java.io.IOException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55 c11696x173f8d55 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.c(this.f163494d.f163183d, str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55.class, "mp4", false);
        if (c11696x173f8d55 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "attachVideo error, return null");
            return null;
        }
        c11696x173f8d55.f157645n = (P3 + 500) / 1000;
        c11696x173f8d55.f157647p = P;
        c11696x173f8d55.f157648q = P2;
        c11696x173f8d55.f157646o = com.p314xaae8f345.mm.vfs.w6.k(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "addVideoItem, return %s", c11696x173f8d55);
        return c11696x173f8d55;
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
            java.lang.String r1 = com.p314xaae8f345.mm.vfs.w6.i(r1, r2)
            r2 = 0
            android.graphics.Bitmap r3 = com.p314xaae8f345.mm.p786x600aa8b.e.c(r11)     // Catch: java.lang.Exception -> L2e java.lang.NullPointerException -> L42 java.lang.OutOfMemoryError -> L5a
            goto L7d
        L2e:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "doCompressImage, decode bmp e "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3)
        L40:
            r3 = r2
            goto L7d
        L42:
            android.graphics.Bitmap r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(r11, r2)     // Catch: java.lang.Exception -> L47
            goto L7d
        L47:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "doCompressImage, decode bmp npe retry, e "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3)
            goto L40
        L5a:
            java.lang.String r3 = "doCompressImage, decode bmp oom"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3)
            android.graphics.Bitmap r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(r11, r2)     // Catch: java.lang.Exception -> L64 java.lang.OutOfMemoryError -> L77
            goto L7d
        L64:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "doCompressImage, decode bmp oom retry, e "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3)
            goto L40
        L77:
            java.lang.String r3 = "doCompressImage, decode bmp oom retry, oom again"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3)
            goto L40
        L7d:
            if (r3 != 0) goto L85
            java.lang.String r11 = "doCompressImage, decode bmp return null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r11)
            return r2
        L85:
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r2 = java.lang.System.currentTimeMillis()
            r4 = -1
            r5 = 70
            boolean r9 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e0.a(r1, r11, r4, r4, r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r9)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            long r5 = com.p314xaae8f345.mm.vfs.w6.k(r11)
            java.lang.Long r6 = java.lang.Long.valueOf(r5)
            long r7 = com.p314xaae8f345.mm.vfs.w6.k(r1)
            java.lang.Long r8 = java.lang.Long.valueOf(r7)
            r3 = r4
            r4 = r2
            r5 = r11
            r7 = r1
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8}
            java.lang.String r3 = "doCompressImage, ret = %b, cost = %d, %s (%d) -> %s (%d)"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r3, r2)
            if (r9 == 0) goto Lbf
            r11 = r1
        Lbf:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.o4.t(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String u(java.lang.String str) {
        java.lang.String str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            return "";
        }
        java.lang.String str4 = a17.f294812f;
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
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str2);
        java.lang.String str5 = a18.f294812f;
        if (str5 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
            if (!str5.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (m18.a() ? m18.f294799a.F(m18.f294800b) : false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "file is exist for path:%s!", str2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "file not exist for path:%s! create it!", str2);
            android.graphics.Bitmap D = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D(str, 2, -1);
            if (D == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "createVideoThumbnail bitmap fail for path:%s!", str2);
                return "";
            }
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(D, 80, android.graphics.Bitmap.CompressFormat.JPEG, str2, true);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "saveBitmapToImage exist IOException:" + e17.getMessage());
            }
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String v(java.lang.String str) {
        int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str).m43592x7a249f0b();
        if (m43592x7a249f0b != 0) {
            int i17 = m43592x7a249f0b % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
            try {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(str, options);
                if (d17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "rotate image, get null bmp");
                    return str;
                }
                android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(d17, i17);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(lp0.b.m());
                sb6.append("microMsg.tmp.");
                sb6.append(java.lang.System.currentTimeMillis());
                sb6.append(je.a.d(options) ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG : ".png");
                java.lang.String sb7 = sb6.toString();
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(w07, 80, je.a.d(options) ? android.graphics.Bitmap.CompressFormat.JPEG : android.graphics.Bitmap.CompressFormat.PNG, sb7, true);
                    if (je.a.d(options)) {
                        ya1.d.b(str, sb7);
                    }
                    return sb7;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "rotate image, exception occurred when saving | %s", e17);
                    com.p314xaae8f345.mm.vfs.w6.h(sb7);
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
            str = str2 + com.p314xaae8f345.p457x3304c6.C3964x9fa34f55.f15753xdc29ea5a;
        } else if (d17 <= 450.0d) {
            str = str2 + "56";
        } else if (d17 <= 500.0d) {
            str = str2 + "51";
        } else if (d17 <= 1000.0d) {
            str = str2 + "20";
        } else {
            str = str2 + com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0;
        }
        if (!this.f163494d.f163195s) {
            return str;
        }
        return j17 + "01";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935 x() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e() + "_locCache", 0).getString("locStr", null);
        if (string != null) {
            java.lang.String[] split = string.split(",");
            return new com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[0], 0) / 1000000.0f, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], 0) / 1000000.0f);
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(67591, null);
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "lbs location is null, no cached data!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "location get error!");
            return null;
        }
        try {
            java.lang.String[] split2 = str.split(",");
            java.lang.Integer.valueOf(split2[0]).intValue();
            java.lang.Integer.valueOf(split2[1]).intValue();
            return new com.p314xaae8f345.mm.sdk.p2603x2137b148.C20989xcfc00935(java.lang.Integer.valueOf(split2[2]).intValue() / 1000000.0f, java.lang.Integer.valueOf(split2[3]).intValue() / 1000000.0f);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "getCurrentGPSData parse value error.", e17);
            return null;
        }
    }

    private static void y(java.lang.String str, int[] iArr, boolean z17) {
        gp.d dVar = null;
        try {
            gp.d dVar2 = new gp.d();
            try {
                dVar2.setDataSource(str);
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar2.extractMetadata(18), 0);
                int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar2.extractMetadata(19), 0);
                if (z17 && "90".equals(dVar2.extractMetadata(24)) && P > P2) {
                    P2 = P;
                    P = P2;
                }
                iArr[0] = P;
                iArr[1] = P2;
                com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d Di = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Di();
                android.graphics.Point F = F(P, P2, Di.f152724d, Di.f152725e);
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

    private com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 z(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(7, 1);
        c16528xd9aafd63.f230350d = i17;
        c16528xd9aafd63.f230352f.f152728h = this.f163494d.f163191o;
        return c16528xd9aafd63;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        this.f163494d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12164x3187af27) abstractC11887x3610e10c;
        if (!B()) {
            db5.t7.m123883x26a183b(m50421x3c6fed6a(), m50423x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571612kb), 1).show();
        }
        A();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v, com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885 c12165x963f1885 = this.f163495e;
            c12165x963f1885.f163196d = 0;
            m50420x7b736e5c(c12165x963f1885);
            return;
        }
        double doubleExtra = intent != null ? intent.getDoubleExtra("longitude", 181.0d) : 181.0d;
        double doubleExtra2 = intent != null ? intent.getDoubleExtra("latitude", 91.0d) : 91.0d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "requestCode: %d.", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "REQUEST_CODE_GALLERY");
            if (intent == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885 c12165x963f18852 = this.f163495e;
                c12165x963f18852.f163196d = 0;
                m50420x7b736e5c(c12165x963f18852);
                return;
            } else {
                java.util.List<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_video_list");
                boolean booleanExtra = intent.getBooleanExtra("CropImage_Compress_Img", false);
                I();
                ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.j4(this, stringArrayListExtra, doubleExtra2, doubleExtra, booleanExtra, !booleanExtra && H(stringArrayListExtra), stringArrayListExtra2));
                return;
            }
        }
        if (i17 != 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885 c12165x963f18853 = this.f163495e;
            c12165x963f18853.f163196d = -2;
            m50420x7b736e5c(c12165x963f18853);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "REQUEST_CODE_TAKE_MEDIA_CAMERA");
        if (intent == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885 c12165x963f18854 = this.f163495e;
            c12165x963f18854.f163196d = 0;
            m50420x7b736e5c(c12165x963f18854);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "data is valid!");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886 c16527xe4fc886 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886) intent.getParcelableExtra("key_req_result");
        if (c16527xe4fc886 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "sight capture result is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885 c12165x963f18855 = this.f163495e;
            c12165x963f18855.f163196d = -2;
            m50420x7b736e5c(c12165x963f18855);
            return;
        }
        if (!c16527xe4fc886.f230340e) {
            java.lang.String str = c16527xe4fc886.f230342g;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "mVideoFilePath:%s", str);
                I();
                ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l4(this, str, doubleExtra2, doubleExtra));
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "mVideoFilePath is null");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885 c12165x963f18856 = this.f163495e;
                c12165x963f18856.f163196d = -2;
                m50420x7b736e5c(c12165x963f18856);
                return;
            }
        }
        java.lang.String str2 = c16527xe4fc886.f230348p;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMultiMedia", "picture_picturePath file is not exist! path:%s", str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12165x963f1885 c12165x963f18857 = this.f163495e;
            c12165x963f18857.f163196d = -2;
            m50420x7b736e5c(c12165x963f18857);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMultiMedia", "filePath:%s", str2);
        boolean booleanExtra2 = intent.getBooleanExtra("CropImage_Compress_Img", false);
        I();
        ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.k4(this, booleanExtra2, str2, doubleExtra2, doubleExtra));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: onProcessInterrupted */
    public void mo50427x5b335c92() {
        super.mo50427x5b335c92();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f163497g;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f163497g = null;
        }
    }
}

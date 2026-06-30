package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
final class y3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

    /* renamed from: e, reason: collision with root package name */
    private com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 f163681e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f163682f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f163683g;

    /* renamed from: h, reason: collision with root package name */
    private com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f163684h;

    /* renamed from: i, reason: collision with root package name */
    private android.content.DialogInterface.OnCancelListener f163685i;

    /* renamed from: m, reason: collision with root package name */
    int f163686m;

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c f163680d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c();

    /* renamed from: n, reason: collision with root package name */
    private int f163687n = -1;

    private y3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String N() {
        if (!android.text.TextUtils.isEmpty(this.f163683g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.b(this.f163681e.f163167d, this.f163683g, null, true);
            if (b17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.f157635d)) {
                return b17.f157635d;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "addThumbItem error, localId is null");
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55 O(java.lang.String str, boolean z17) {
        gp.d dVar;
        if (z17) {
            try {
                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t7.e(str);
            } catch (java.lang.Exception e17) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "addVideoItem, remux failed, exp = %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        try {
            dVar = new gp.d();
            dVar.setDataSource(str);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", e18);
            dVar = null;
        }
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "addVideoItem, null meta data");
            return null;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(18), 0);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(19), 0);
        int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(9), 0);
        int P4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(24), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "outputWidth:%d, outputHeight:%d, rotation:%d", java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(P2), java.lang.Integer.valueOf(P4));
        if (P4 == 90 || P4 == 270) {
            P2 = P;
            P = P2;
        }
        try {
            dVar.release();
        } catch (java.io.IOException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55 c11696x173f8d55 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.c(this.f163681e.f163167d, str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55.class, "mp4", false);
        if (c11696x173f8d55 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "attachVideo error, return null");
            return null;
        }
        c11696x173f8d55.f157645n = (P3 + 500) / 1000;
        c11696x173f8d55.f157647p = P;
        c11696x173f8d55.f157648q = P2;
        c11696x173f8d55.f157646o = com.p314xaae8f345.mm.vfs.w6.k(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "addVideoItem, return %s", c11696x173f8d55);
        return c11696x173f8d55;
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r0 = r12.f163681e
            boolean r1 = r0.f163178r
            boolean r2 = r0.f163172i
            r3 = 1
            r4 = 3
            if (r2 == 0) goto L13
        L11:
            r9 = r4
            goto L26
        L13:
            boolean r2 = r0.f163170g
            if (r2 == 0) goto L1c
            boolean r5 = r0.f163171h
            if (r5 == 0) goto L1c
            goto L11
        L1c:
            if (r2 == 0) goto L20
            r9 = r3
            goto L26
        L20:
            boolean r0 = r0.f163171h
            if (r0 == 0) goto L11
            r4 = 2
            goto L11
        L26:
            android.content.Intent r11 = new android.content.Intent
            r11.<init>()
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r0 = r12.f163681e
            boolean r0 = r0.f163172i
            if (r0 != 0) goto L36
            java.lang.String r0 = "key_can_select_video_and_pic"
            r11.putExtra(r0, r3)
        L36:
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r0 = r12.f163681e
            boolean r0 = r0.f163177q
            r0 = r0 ^ r3
            java.lang.String r2 = "key_send_raw_image"
            r11.putExtra(r2, r0)
            java.lang.String r0 = "key_force_show_raw_image_button"
            r11.putExtra(r0, r1)
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r0 = r12.f163681e
            boolean r1 = r0.f163178r
            if (r1 == 0) goto L51
            boolean r0 = r0.f163177q
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
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r0 = r12.f163681e
            boolean r0 = r0.f163176p
            if (r0 == 0) goto L78
            java.lang.String r0 = "Gallery_LivePhoto_Need_Query"
            r11.putExtra(r0, r3)
        L78:
            java.lang.Class<d85.m0> r0 = d85.m0.class
            i95.m r0 = i95.n0.c(r0)
            d85.m0 r0 = (d85.m0) r0
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r1 = r12.f163681e
            int r1 = r1.f163179s
            d85.d1 r0 = (d85.d1) r0
            d85.f0 r0 = r0.wi(r1)
            if (r0 == 0) goto L93
            java.lang.String r1 = "album_business_by_real_scene"
            java.lang.String r0 = r0.f308709d
            r11.putExtra(r1, r0)
        L93:
            java.lang.Class<vb0.o> r0 = vb0.o.class
            i95.m r0 = i95.n0.c(r0)
            vb0.o r0 = (vb0.o) r0
            com.tencent.mm.ui.MMActivity r5 = r12.m50421x3c6fed6a()
            r6 = 8
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest r1 = r12.f163681e
            int r7 = r1.f163175o
            int r8 = r12.f163686m
            r10 = 0
            ub0.r r0 = (ub0.r) r0
            r0.getClass()
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.c(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3.P():void");
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y3.R():void");
    }

    private static java.util.List<java.lang.String> S(java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078> list) {
        if (list == null || list.isEmpty()) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 : list) {
            if (abstractC15633xee433078.mo63659xfb85f7b0() == 6) {
                arrayList.add(abstractC15633xee433078.o());
            } else {
                arrayList.add(abstractC15633xee433078.f219963e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var;
        if (android.text.TextUtils.isEmpty(this.f163683g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "mThumbFilePath is empty!");
            r6Var = null;
        } else {
            r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f163683g);
        }
        if (r6Var != null && r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "file is exist!, path:%s", this.f163683g);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "file == null or file not exist for path:%s!", this.f163683g);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str3 = a17.f294812f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        java.lang.String substring = (android.text.TextUtils.isEmpty(str3) || !str3.contains(".")) ? null : str3.substring(0, str3.lastIndexOf("."));
        java.lang.String K = lp0.b.K();
        if (android.text.TextUtils.isEmpty(substring)) {
            this.f163683g = com.p314xaae8f345.mm.vfs.w6.i(K + ("microMsg_" + java.lang.System.currentTimeMillis()) + ".jpeg", true);
        } else if (K == null || !K.endsWith("/")) {
            this.f163683g = com.p314xaae8f345.mm.vfs.w6.i(K + "/" + substring + ".jpeg", true);
        } else {
            this.f163683g = com.p314xaae8f345.mm.vfs.w6.i(K + substring + ".jpeg", true);
        }
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(this.f163683g);
        java.lang.String str4 = a18.f294812f;
        if (str4 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "file is exist for path:%s!", this.f163683g);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "file not exist for path:%s!", this.f163683g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "create new thumb path:%s!", this.f163683g);
        android.graphics.Bitmap D = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D(str, 1, -1);
        if (D == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "createVideoThumbnail bitmap fail for path:%s!", this.f163683g);
            return;
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(D, 30, android.graphics.Bitmap.CompressFormat.JPEG, this.f163683g, true);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "saveBitmapToImage exist IOException:" + e17.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55 U(java.lang.String str, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, boolean z18) {
        java.lang.String str2;
        if (z17 && abstractC15633xee433078 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) abstractC15633xee433078;
            if (c15632xfc4fd0d0.G == 1) {
                str2 = c15632xfc4fd0d0.f219963e;
            } else {
                str2 = lp0.b.K() + "microMsg." + java.lang.System.currentTimeMillis() + ".mp4";
                if (!((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).Ai(c15632xfc4fd0d0.f219967i, str2, str, 0L).f94508a.f94493a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "parse failed: %s", str);
                    return null;
                }
            }
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str2, false);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(i17);
                java.lang.String str3 = a17.f294812f;
                if (str3 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
                    return O(i17, z18);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "take live photo local failed, path:%s", str);
            }
        }
        return null;
    }

    private com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 V(int i17) {
        java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
        this.f163682f = com.p314xaae8f345.mm.vfs.w6.i(lp0.b.K() + "microMsg." + str + ".mp4", false);
        this.f163683g = com.p314xaae8f345.mm.vfs.w6.i(lp0.b.K() + "microMsg." + str + ".jpeg", true);
        int i18 = this.f163681e.f163174n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(3, 1);
        c16528xd9aafd63.f230351e = this.f163681e.f163173m ? 1 : 2;
        c16528xd9aafd63.f230350d = i17;
        if (c16528xd9aafd63.f230352f == null) {
            c16528xd9aafd63.f230352f = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
        }
        c16528xd9aafd63.f230352f.f152728h = i18;
        c16528xd9aafd63.f230359p = false;
        c16528xd9aafd63.a(str, this.f163682f, this.f163683g, lp0.b.K());
        return c16528xd9aafd63;
    }

    private void W() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "goVideo");
        m50421x3c6fed6a().m78545xde66c1f2(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 c12162xc2b17910 = this.f163681e;
        if (c12162xc2b17910.f163168e) {
            P();
        } else {
            if (c12162xc2b17910.f163169f) {
                R();
                return;
            }
            this.f163680d.f163180d = -2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "parameter is invalid, fail and finish process");
            m50420x7b736e5c(this.f163680d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(java.lang.String str, java.lang.String str2) {
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
        this.f163682f = i17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "mVideoFilePath is null");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c = this.f163680d;
            c12163xa32fed7c.f163180d = -2;
            m50420x7b736e5c(c12163xa32fed7c);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "mVideoFilePath:%s", this.f163682f);
        if (!b0(this.f163683g) && b0(str2)) {
            this.f163683g = com.p314xaae8f345.mm.vfs.w6.i(str2, true);
        }
        f0(com.p314xaae8f345.mm.R.C30867xcad56011.f571613kc);
        ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(java.lang.String str, android.content.Intent intent) {
        boolean z17 = false;
        java.lang.String imageFile = com.p314xaae8f345.mm.vfs.w6.i(str, false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(imageFile)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "picture_picturePath file is not exist! path:%s", imageFile);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c = this.f163680d;
            c12163xa32fed7c.f163180d = -2;
            m50420x7b736e5c(c12163xa32fed7c);
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("CropImage_Compress_Img", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 c12162xc2b17910 = this.f163681e;
        boolean z18 = c12162xc2b17910.f163177q;
        boolean z19 = c12162xc2b17910.f163178r;
        boolean z27 = ((z19 ^ true) && z18) || (booleanExtra && (z19 & z18));
        boolean z28 = this.f163681e.f163178r;
        if (z27) {
            f0(com.p314xaae8f345.mm.R.C30867xcad56011.f571613kc);
        }
        if (!z27) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageFile, "imageFile");
            if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(imageFile) || com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(imageFile).m43592x7a249f0b() == 0) ? false : true) {
                z17 = true;
            }
        }
        if (z17) {
            f0(com.p314xaae8f345.mm.R.C30867xcad56011.f571614kd);
        }
        ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.v3(this, imageFile, z27, z17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(java.lang.String str, java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078> list, int i17, boolean z17, java.util.ArrayList<java.lang.Boolean> arrayList, java.util.ArrayList<java.lang.String> arrayList2, java.util.ArrayList<java.lang.Long> arrayList3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55 c11696x173f8d55;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || list == null || i17 == -1 || i17 >= list.size()) {
            c11696x173f8d55 = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = list.get(i17);
            r1 = abstractC15633xee433078.mo63659xfb85f7b0() == 6;
            c11696x173f8d55 = U(str, r1, abstractC15633xee433078, z17);
        }
        arrayList.add(java.lang.Boolean.valueOf(r1));
        if (!r1 || c11696x173f8d55 == null) {
            arrayList2.add("");
            arrayList3.add(0L);
        } else {
            arrayList2.add(c11696x173f8d55.f157635d);
            arrayList3.add(java.lang.Long.valueOf(c11696x173f8d55.f157646o));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiChooseMedia", e17, "", new java.lang.Object[0]);
        }
    }

    private boolean a0() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w(m50421x3c6fed6a()) > 200;
    }

    private static void b(org.json.JSONStringer jSONStringer, java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.Long> arrayList2) {
        if (arrayList == null || arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "_parseImageItemToJson localIds is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "_parseImageItemToJson()");
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            a(jSONStringer, arrayList.get(i17), arrayList2.get(i17).longValue());
        }
    }

    private boolean b0(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "video thumb file path is null");
            return false;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "thumbFilePath:%s", str);
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "video thumb file is exist");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "video thumb file is not exist");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiChooseMedia", e17, "", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String c0(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.Long> arrayList2, java.util.ArrayList<java.lang.String> arrayList3, java.util.ArrayList<java.lang.Long> arrayList4, java.util.ArrayList<java.lang.Boolean> arrayList5) {
        if (arrayList == null || arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "parseMediaItemToJson localIds is null");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiChooseMedia", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(org.json.JSONStringer jSONStringer, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson localId is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson()");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiChooseMedia", e17, "", new java.lang.Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String d0(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.Long> arrayList2, boolean z17) {
        if (arrayList == null || arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "parseImageItemToJson localIds is null");
            return "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "parseImageItemToJson()");
        org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
        try {
            jSONStringer.array();
            b(jSONStringer, arrayList, arrayList2);
            jSONStringer.endArray();
            return jSONStringer.toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiChooseMedia", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String e0(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, long j17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson localId is null");
            return "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson()");
        org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
        try {
            jSONStringer.array();
            d(jSONStringer, str, str2, i17, i18, i19, j17);
            jSONStringer.endArray();
            return jSONStringer.toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiChooseMedia", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    private void f0(int i17) {
        this.f163685i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.x3(this);
        this.f163684h = db5.e1.Q(m50421x3c6fed6a(), m50423x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), m50423x2fec8307(i17), true, true, this.f163685i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        this.f163681e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910) abstractC11887x3610e10c;
        this.f163686m = 16;
        if (!a0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "memory is not enough!");
            db5.t7.m123883x26a183b(m50421x3c6fed6a(), m50423x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571612kb), 1).show();
        }
        W();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v, com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == this.f163687n) {
            return;
        }
        if (i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult resultCode is canceled");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c = this.f163680d;
            c12163xa32fed7c.f163180d = 0;
            m50420x7b736e5c(c12163xa32fed7c);
            return;
        }
        if (-1 != i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult resultCode is not RESULT_OK");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c2 = this.f163680d;
            c12163xa32fed7c2.f163180d = -2;
            m50420x7b736e5c(c12163xa32fed7c2);
            return;
        }
        if (i17 == 7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "REQUEST_CODE_TAKE_MEDIA_CAMERA");
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "data is null!");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c3 = this.f163680d;
                c12163xa32fed7c3.f163180d = -2;
                m50420x7b736e5c(c12163xa32fed7c3);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "data is valid!");
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886 c16527xe4fc886 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886) intent.getParcelableExtra("key_req_result");
            if (c16527xe4fc886 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "sight capture result is null!");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c4 = this.f163680d;
                c12163xa32fed7c4.f163180d = -2;
                m50420x7b736e5c(c12163xa32fed7c4);
                return;
            }
            if (c16527xe4fc886.f230340e) {
                Y(c16527xe4fc886.f230348p, intent);
                return;
            } else {
                X(c16527xe4fc886.f230342g, c16527xe4fc886.f230343h);
                return;
            }
        }
        if (i17 != 8) {
            if (i17 != 9) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c5 = this.f163680d;
                c12163xa32fed7c5.f163180d = -2;
                m50420x7b736e5c(c12163xa32fed7c5);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "REQUEST_CODE_TAKE_MEDIA_MMRECORDUI");
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "data is null!");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c6 = this.f163680d;
                c12163xa32fed7c6.f163180d = -2;
                m50420x7b736e5c(c12163xa32fed7c6);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
            if (c16991x15ced046 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c7 = this.f163680d;
                c12163xa32fed7c7.f163180d = 0;
                m50420x7b736e5c(c12163xa32fed7c7);
                return;
            } else if (c16991x15ced046.f237197h.booleanValue()) {
                Y(c16991x15ced046.f237195f, intent);
                return;
            } else {
                X(c16991x15ced046.f237194e, c16991x15ced046.f237195f);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "REQUEST_CODE_TAKE_MEDIA_LOCAL");
        if (!this.f163681e.f163172i) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
            boolean booleanExtra = intent.getBooleanExtra("CropImage_Compress_Img", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 c12162xc2b17910 = this.f163681e;
            boolean z17 = c12162xc2b17910.f163177q;
            boolean z18 = c12162xc2b17910.f163178r;
            boolean z19 = ((z18 ^ true) && z17) || ((z18 & z17) && booleanExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "onActivityResult, fromAlbum, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f163681e.f163178r), java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(z19));
            if (stringArrayListExtra != null && stringArrayListExtra.size() > 0) {
                f0(com.p314xaae8f345.mm.R.C30867xcad56011.f571613kc);
                java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.f172083a;
                ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r3(this, stringArrayListExtra, z19));
                return;
            }
            java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_select_multi_pic_item");
            java.util.List S = this.f163681e.f163176p ? S(parcelableArrayListExtra) : intent.getStringArrayListExtra("CropImage_OutputPath_List");
            if (S == null || S.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "chosen is null,  fail");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c8 = this.f163680d;
                c12163xa32fed7c8.f163180d = -2;
                m50420x7b736e5c(c12163xa32fed7c8);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "onActivityResult, fromCamera = %b, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(this.f163681e.f163177q), java.lang.Boolean.valueOf(this.f163681e.f163178r), java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(z19));
            if (z19) {
                f0(com.p314xaae8f345.mm.R.C30867xcad56011.f571613kc);
            }
            boolean z27 = !z19 && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p7.f(S);
            if (z27) {
                f0(com.p314xaae8f345.mm.R.C30867xcad56011.f571614kd);
            }
            ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t3(this, S, z19, z27, parcelableArrayListExtra));
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_video_list");
        java.util.ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("key_select_multi_pic_item");
        java.util.List S2 = this.f163681e.f163176p ? S(parcelableArrayListExtra2) : intent.getStringArrayListExtra("CropImage_OutputPath_List");
        java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("key_select_mix_media_list");
        boolean z28 = stringArrayListExtra2 != null && stringArrayListExtra2.size() > 0;
        boolean z29 = S2 != null && S2.size() > 0;
        if (stringArrayListExtra3 == null || stringArrayListExtra3.size() == 0 || this.f163681e.f163176p) {
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "mediaPath:%s", it.next());
        }
        if (!z28 && !z29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseMedia", "none select any image or video");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12163xa32fed7c c12163xa32fed7c9 = this.f163680d;
            c12163xa32fed7c9.f163180d = -2;
            m50420x7b736e5c(c12163xa32fed7c9);
            return;
        }
        boolean booleanExtra2 = intent.getBooleanExtra("CropImage_Compress_Img", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12162xc2b17910 c12162xc2b179102 = this.f163681e;
        boolean z37 = c12162xc2b179102.f163177q;
        boolean z38 = c12162xc2b179102.f163178r;
        boolean z39 = ((z38 ^ true) && z37) || ((z38 & z37) && booleanExtra2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMedia", "onActivityResult, fromAlbum, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", java.lang.Boolean.valueOf(z37), java.lang.Boolean.valueOf(this.f163681e.f163178r), java.lang.Boolean.valueOf(booleanExtra2), java.lang.Boolean.valueOf(z39));
        if (z39 ? true : z28) {
            f0(com.p314xaae8f345.mm.R.C30867xcad56011.f571613kc);
        }
        boolean z47 = (z39 || S2 == null || !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p7.f(S2)) ? false : true;
        if (z47) {
            f0(com.p314xaae8f345.mm.R.C30867xcad56011.f571614kd);
        }
        java.util.Set set2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.f172083a;
        ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q3(this, z28, z29, arrayList, stringArrayListExtra2, z39, S2, z47, parcelableArrayListExtra2));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: onProcessInterrupted */
    public void mo50427x5b335c92() {
        super.mo50427x5b335c92();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f163684h;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f163684h = null;
        }
    }
}

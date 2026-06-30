package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

@j95.b
/* loaded from: classes9.dex */
public class w2 extends i95.w implements gb3.j {

    /* renamed from: d, reason: collision with root package name */
    public static final pq5.i f227209d = new pq5.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.a2());

    public static void tj(java.lang.Runnable runnable) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            runnable.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        }
    }

    public static void wi(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2 w2Var, android.widget.ImageView imageView, java.lang.String str, int i17, int i18, long j17) {
        w2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19232, java.lang.Integer.valueOf(imageView == null ? 2 : 1), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18 + 1), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17), str);
    }

    public r45.jm5 Ai(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[checkCoverInfoXmlAvailable] coverInfoBase64 is null");
            return null;
        }
        r45.jm5 jm5Var = new r45.jm5();
        try {
            jm5Var.mo11468x92b714fd(android.util.Base64.decode(str, 0));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jm5Var.f459477p)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[checkCoverInfoXmlAvailable] coverInfoDetail.packet_id is null");
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[checkCoverInfoXmlAvailable] success");
            return jm5Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[checkCoverInfoXmlAvailable] parse failed ： %s ", e17.getMessage());
            return null;
        }
    }

    public void Bi(r45.wv3 wv3Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2 v2Var, int i18, int i19) {
        r45.xv3 xv3Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "get bitmap by url: %s", java.lang.Integer.valueOf(i17));
        if (wv3Var == null || (xv3Var = wv3Var.f471034g) == null) {
            return;
        }
        if (i17 != 0) {
            if (i17 == 1) {
                int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de);
                int b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 480);
                if (i18 <= 0 || i19 <= 0) {
                    fj(xv3Var.f472012f, xv3Var.f472015i, wv3Var.f471033f, b17, b18, false, v2Var);
                    return;
                } else {
                    hj(xv3Var.f472012f, xv3Var.f472015i, wv3Var.f471033f, i18, i19, false, false, 0, v2Var);
                    return;
                }
            }
            if (i17 == 2) {
                ij(xv3Var.f472013g, xv3Var.f472016m, wv3Var.f471033f, v2Var);
                return;
            }
            if (i17 == 3) {
                int dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a4y);
                fj(xv3Var.f472010d, xv3Var.f472017n, wv3Var.f471033f, (int) (dimensionPixelSize / 0.2194f), dimensionPixelSize, false, v2Var);
                return;
            }
            if (i17 == 6) {
                ij(xv3Var.f472020q, xv3Var.f472021r, wv3Var.f471033f, v2Var);
                return;
            }
            if (i17 == 7) {
                int b19 = (int) (i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de) * 1.1f);
                int i27 = (int) (b19 * 1.72f);
                if (i18 <= 0 || i19 <= 0) {
                    fj(xv3Var.f472018o, xv3Var.f472019p, wv3Var.f471033f, b19, i27, false, v2Var);
                    return;
                } else {
                    hj(xv3Var.f472018o, xv3Var.f472019p, wv3Var.f471033f, i18, i19, false, false, 0, v2Var);
                    return;
                }
            }
            if (i17 != 8) {
                if (i17 != 12) {
                    return;
                }
                int b27 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 68);
                int i28 = (int) (b27 / 0.5965f);
                if (i18 <= 0 || i19 <= 0) {
                    java.lang.String str = xv3Var.K;
                    fj(str, str, wv3Var.f471033f, b27, i28, false, v2Var);
                    return;
                } else {
                    java.lang.String str2 = xv3Var.K;
                    fj(str2, str2, wv3Var.f471033f, i18, i19, false, v2Var);
                    return;
                }
            }
        }
        ij(xv3Var.f472011e, xv3Var.f472014h, wv3Var.f471033f, v2Var);
    }

    public final android.graphics.Bitmap Di(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str) {
        boolean m17 = r6Var.m();
        boolean A = r6Var.A();
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(r6Var.u());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17)) {
            return null;
        }
        boolean equals = p17.equals(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "get from file: %s, %s, %s", java.lang.Boolean.valueOf(m17), java.lang.Boolean.valueOf(A), java.lang.Boolean.valueOf(equals));
        if (m17 && A && equals) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(r6Var.o(), null);
        }
        if (!equals) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 3);
        }
        if (!m17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 4);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ni(r45.wv3 r8, int r9, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2 r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2.Ni(r45.wv3, int, com.tencent.mm.plugin.luckymoney.model.v2, int, int):void");
    }

    public boolean Ri() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_check_coverinfo_bubble_switch, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[getOpenDoCheckCoverInfoUpdateBubbleSwitch] svrOpen is : %s", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public boolean Ui() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_lucky_money_check_coverinfo_order_switch, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[getOpenDoCheckCoverInfoUpdatePlaceOrderSwitch] svrOpen is : %s", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public final android.graphics.Bitmap Vi(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, int i17, int i18) {
        boolean m17 = r6Var.m();
        boolean A = r6Var.A();
        if (m17 && A) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.j0(r6Var.o(), i18, i17, 0.0f);
        }
        return null;
    }

    public void Zi(android.widget.ImageView imageView, int i17, int i18, r45.wv3 wv3Var, boolean z17, int i19, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        if (imageView == null || wv3Var == null || wv3Var.f471034g == null) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        imageView.setTag(com.p314xaae8f345.mm.R.id.j1c, wv3Var.f471034g.f472011e);
        imageView.setTag(com.p314xaae8f345.mm.R.id.j19, java.lang.Integer.valueOf(wv3Var.f471032e));
        Ni(wv3Var, i19, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u1(this, i17, i18, z17, imageView, elapsedRealtime, n3Var), 0, 0);
    }

    public void aj(android.widget.ImageView imageView, r45.wv3 wv3Var, gb3.i iVar, int i17, int i18, int i19) {
        if (imageView == null || wv3Var == null || wv3Var.f471034g == null) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        imageView.setTag(com.p314xaae8f345.mm.R.id.j1c, wv3Var.f471034g.f472012f);
        imageView.setTag(com.p314xaae8f345.mm.R.id.j19, java.lang.Integer.valueOf(wv3Var.f471032e));
        Ni(wv3Var, 1, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o1(this, iVar, i17, i18, i19, imageView, elapsedRealtime), i17, i18);
    }

    public void bj(android.widget.ImageView imageView, r45.wv3 wv3Var, gb3.i iVar, int i17, int i18) {
        if (imageView == null || wv3Var == null || wv3Var.f471034g == null) {
            return;
        }
        imageView.setTag(com.p314xaae8f345.mm.R.id.j1c, wv3Var.f471034g.f472018o);
        imageView.setTag(com.p314xaae8f345.mm.R.id.j19, java.lang.Integer.valueOf(wv3Var.f471032e));
        Ni(wv3Var, 7, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r1(this, iVar, i17, i18, imageView), i17, i18);
    }

    public final void cj(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        hj(str, str2, str3, 0, 0, false, false, 0, null);
    }

    public final void fj(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2 v2Var) {
        hj(str, str2, str3, 0, 0, z17, false, 0, v2Var);
    }

    public final void hj(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, boolean z17, boolean z18, int i19, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2 v2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load image: %s, %s,width :%s , height :%s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (v2Var != null) {
                v2Var.a(null, 0, str);
                return;
            }
            return;
        }
        n11.a aVar = (n11.a) f227209d.a();
        if (i18 <= 0) {
            i18 = i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        if (i17 <= 0) {
            i17 = i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        o11.f fVar = new o11.f();
        fVar.f423616g = hb3.o.Ni().Zi();
        fVar.f423619j = i17;
        fVar.f423620k = i18;
        fVar.f423629t = z17;
        fVar.f423622m = z18;
        fVar.f423623n = i19;
        fVar.f423611b = true;
        aVar.i(str, null, fVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g1(this, str3, str2, v2Var));
    }

    public final void ij(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v2 v2Var) {
        hj(str, str2, str3, 0, 0, false, false, 0, v2Var);
    }

    public void mj(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var) {
        if (imageView == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        imageView.setTag(com.p314xaae8f345.mm.R.id.j1c, str);
        fj(str, str2, str3, i18, i17, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.j2(this, imageView, w1Var));
    }

    public void nj(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, boolean z17, int i19, gb3.i iVar, int i27, int i28, int i29) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "load story view");
        if (imageView == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        imageView.setTag(com.p314xaae8f345.mm.R.id.j1c, str);
        imageView.setTag(com.p314xaae8f345.mm.R.id.j19, java.lang.Integer.valueOf(i27));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "subTypeID：%s，envelopeType：%s,index:%s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
        if (i27 > 0) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_lucky_money_envelope_load_local_photo_res_config, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[static luckymoney resource] use local：LuckyMoneyEnvelopeLocalPhotoRes - subTypeID：%s，envelopeType：%s,index:%s ", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[getStoryBitmapBySubtype] subtypeID: %s, envelopeType: %s, index：%s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
                if (i28 == 4) {
                    bitmap = Vi(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d4.c(i27), "detail_image_" + i29 + ".png"), "", i17, i18);
                } else if (i28 == 5) {
                    bitmap = Vi(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d4.c(i27), "detail_video_thumb_" + i29 + ".png"), "", i17, i18);
                } else if (i28 == 2) {
                    bitmap = Vi(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d4.b(i27), "detail.png"), "", i17, i18);
                } else {
                    java.lang.String str4 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d4.f226760d;
                    ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(58);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "[getStoryBitmapBySubtype] can't find subtype res: %s", java.lang.Integer.valueOf(i27));
                    bitmap = null;
                }
                if (bitmap == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[getStoryBitmapBySubtype] bitmap == null");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(991, 5);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[getStoryBitmapBySubtype] success");
                }
                if (bitmap != null) {
                    tj(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.k2(this, bitmap, i27, str, iVar, imageView, elapsedRealtime));
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[static luckymoney resource] use net：LuckyMoneyEnvelopeLocalPhotoRes - subTypeID：%s，envelopeType：%s,index:%s ", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
        hj(str, str2, str3, i18, i17, false, z17, i19, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m2(this, iVar, imageView, elapsedRealtime));
    }

    public void oj(android.widget.ImageView imageView, r45.wv3 wv3Var, int i17, int i18, gb3.i iVar) {
        if (imageView == null || wv3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[loadThumbView] iv == null || hbEnvelopSource == null");
            if (iVar != null) {
                iVar.mo66107x815f5438(false);
                return;
            }
            return;
        }
        r45.xv3 xv3Var = wv3Var.f471034g;
        if (xv3Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.K)) {
            imageView.setTag(com.p314xaae8f345.mm.R.id.j1c, wv3Var.f471034g.K);
            Ni(wv3Var, 12, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l1(this, iVar, i17, i18, imageView), i17, i18);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "hbEnvelopSource.sourceObject == null || thumbImageUrl is null");
            if (iVar != null) {
                iVar.mo66107x815f5438(false);
            }
        }
    }

    public boolean pj(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[needUpdateCoverInfoDetail] status_flag: %s, packet_id : %s, pay_msg_id (sendid): %s", java.lang.Integer.valueOf(i17), str2, str);
        return (i17 & 4) != 0;
    }

    public void qj(r45.nm5 nm5Var, boolean z17) {
        if (nm5Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "do preload red packet: %s", nm5Var.f463041q);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nm5Var.f463032e)) {
            cj(nm5Var.f463032e, nm5Var.f463033f, nm5Var.f463041q);
        }
        java.util.LinkedList linkedList = nm5Var.f463036i;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            r45.re6 re6Var = (r45.re6) linkedList.get(i17);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (re6Var.f466307d == 1) {
                ij(re6Var.f466308e, re6Var.f466309f, nm5Var.f463041q, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.p2(this, elapsedRealtime));
            } else {
                ij(re6Var.f466312i, re6Var.f466313m, nm5Var.f463041q, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q2(this, elapsedRealtime));
                if (z17 && (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a))) {
                    java.lang.String str = re6Var.f466308e;
                    java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237.f227334o;
                    java.lang.String str2 = "MMVideo_" + str.hashCode();
                    java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237.a(re6Var.f466308e);
                    boolean z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237.b().getInt(str2, 0) == 1;
                    boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(a17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "do story video preload: %s, %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(j17));
                    if (!j17 && !z18) {
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237.c(nm5Var.G, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.d4.f(nm5Var.G, i17))) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[static luckymoney resource] has local video，do not preload");
                            return;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237.g(str2, a17, re6Var.f466308e, re6Var.f466309f, true, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r2(this));
                    }
                }
            }
        }
    }

    public float rj(int i17, r45.wv3 wv3Var, android.view.View view, android.view.View view2, p3325xe03a0797.p3326xc267989b.y0 y0Var, int i18, int i19, android.view.View view3, int i27) {
        int i28;
        float f17;
        int b17;
        if (view == null || view2 == null || !(view2 instanceof com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0)) {
            return 0.0f;
        }
        com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0 = (com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0) view2;
        if (i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[renderEnvelopeCoverAtmosphereDynamic] coverWidth == 0, fix it");
            i28 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de);
        } else {
            i28 = i18;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) ((gb3.j) i95.n0.c(gb3.j.class))).getClass();
        float f18 = i28 * 1.6399f;
        int round = java.lang.Math.round(f18);
        int round2 = java.lang.Math.round(f18 * 1.2608f);
        layoutParams.width = round;
        layoutParams.height = round2;
        view.setLayoutParams(layoutParams);
        float f19 = i19;
        if (f19 == 0.0f) {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f226985a;
            if (round2 == 0 || view3 == null) {
                f19 = 0.0f;
            } else {
                int[] iArr = new int[2];
                view3.getLocationOnScreen(iArr);
                f19 = ((iArr[1] + view3.getHeight()) - round2) - i27;
            }
            if (f19 == 0.0f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[renderEnvelopeCoverAtmosphereDynamic] atmosphereDynamicCoverY == 0, fix it");
                int i29 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f278669b;
                if (view3 != null) {
                    f17 = i29 * 0.5f;
                    b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 48);
                } else {
                    f17 = i29 * 0.5f;
                    b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 64);
                }
                f19 = (f17 + b17) - round2;
            }
        }
        float f27 = f19;
        view.setY(f27);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a.b(wv3Var, i17, y0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f2(this, java.lang.System.currentTimeMillis(), view2, view, i17, c10389xffc30b0, wv3Var));
        return f27;
    }

    public java.lang.String sj(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[replaceBetweenTags] Util.isNullOrNil(originalString) || Util.isNullOrNil(replaceContent), return originalString");
            return str;
        }
        try {
            int indexOf = str.indexOf(str2);
            int indexOf2 = str.indexOf(str3);
            if (indexOf != -1 && indexOf2 != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "[replaceBetweenTags] contain tag， replace success");
                return new java.lang.StringBuilder(str).replace(indexOf + str2.length(), indexOf2, str4).toString();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[replaceBetweenTags] find failed : %s", th6.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[replaceBetweenTags] failed, return originalString");
        return str;
    }

    public void uj(android.view.ViewGroup viewGroup, android.view.View view, boolean z17) {
        if (viewGroup == null || view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[setAllParentsNotClip] rootView == null || targetView == null");
            return;
        }
        while (view != null && view != viewGroup) {
            view = (android.view.View) view.getParent();
            if (view instanceof android.view.ViewGroup) {
                try {
                    ((android.view.ViewGroup) view).setClipChildren(false);
                    ((android.view.ViewGroup) view).setClipToPadding(false);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[setAllParentsNotClip] while targetView error ：%s", th6.toString());
                }
            }
        }
        try {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[setAllParentsNotClip] while rootView error ：%s", th7.toString());
        }
        if (!z17 || viewGroup.getParent() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[setAllParentsNotClip] rootView.getParent() == null || !needClipRootParent,return");
        } else {
            ((android.view.ViewGroup) viewGroup.getParent()).setClipToPadding(false);
            ((android.view.ViewGroup) viewGroup.getParent()).setClipChildren(false);
        }
    }

    public void vj(r45.wv3 wv3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "trigger load envelope resources");
        if (wv3Var == null || wv3Var.f471034g == null) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        r45.xv3 xv3Var = wv3Var.f471034g;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472011e) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472014h)) {
            ij(xv3Var.f472011e, xv3Var.f472014h, wv3Var.f471033f, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s2(this, elapsedRealtime));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472013g) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472016m)) {
            ij(xv3Var.f472013g, xv3Var.f472016m, wv3Var.f471033f, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.t2(this, elapsedRealtime));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472010d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472017n)) {
            cj(xv3Var.f472010d, xv3Var.f472017n, wv3Var.f471033f);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.K)) {
            java.lang.String str = xv3Var.K;
            cj(str, str, wv3Var.f471033f);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472012f) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472015i)) {
            ij(xv3Var.f472012f, xv3Var.f472015i, wv3Var.f471033f, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.u2(this, elapsedRealtime));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472020q) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472021r)) {
            cj(xv3Var.f472020q, xv3Var.f472021r, wv3Var.f471033f);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472018o) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472019p)) {
            cj(xv3Var.f472018o, xv3Var.f472019p, wv3Var.f471033f);
        }
        p3325xe03a0797.p3326xc267989b.y0 b17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1.f295574a.b();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472025v)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3 n3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n3Var.d(wv3Var.f471032e, 3))) {
                java.lang.String str2 = xv3Var.f472025v;
                n3Var.a(str2, n3Var.c(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226996d), b17, null);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472026w)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3 n3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n3Var2.d(wv3Var.f471032e, 0))) {
                java.lang.String str3 = xv3Var.f472026w;
                n3Var2.a(str3, n3Var2.c(str3, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226995c), b17, null);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472027x)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3 n3Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n3Var3.d(wv3Var.f471032e, 1))) {
                java.lang.String str4 = xv3Var.f472027x;
                n3Var3.a(str4, n3Var3.c(str4, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226997e), b17, null);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472028y)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3 n3Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n3Var4.d(wv3Var.f471032e, 2))) {
                java.lang.String str5 = xv3Var.f472028y;
                n3Var4.a(str5, n3Var4.c(str5, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226998f), b17, null);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.A)) {
            java.lang.String str6 = xv3Var.A;
            cj(str6, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str6), wv3Var.f471033f);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.E)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.H)) {
                xv3Var.E = xv3Var.H;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3 n3Var5 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n3Var5.d(wv3Var.f471032e, 9))) {
                java.lang.String str7 = xv3Var.E;
                n3Var5.a(str7, n3Var5.c(str7, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226999g), b17, null);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.F)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.I)) {
                xv3Var.F = xv3Var.I;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3 n3Var6 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n3Var6.d(wv3Var.f471032e, 10))) {
                java.lang.String str8 = xv3Var.F;
                n3Var6.a(str8, n3Var6.c(str8, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f227000h), b17, null);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.G)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.f472009J)) {
                xv3Var.G = xv3Var.f472009J;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3 n3Var7 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n3Var7.d(wv3Var.f471032e, 11))) {
                java.lang.String str9 = xv3Var.G;
                n3Var7.a(str9, n3Var7.c(str9, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f227001i), b17, null);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.M)) {
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xv3Var.N)) {
            xv3Var.M = xv3Var.N;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3 n3Var8 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n3Var8.d(wv3Var.f471032e, 13))) {
            java.lang.String str10 = xv3Var.M;
            n3Var8.a(str10, n3Var8.c(str10, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f227002j), b17, null);
        }
    }

    public void wj(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "trigger laod envelope after receive: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 1);
        if (z17) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().s(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_STRING_SYNC, true);
        }
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5(0, "v1.0", 1));
        if (z18) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n2(this));
        }
    }

    public void xj(ot0.j jVar, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "do trigger load red packet story: %s, %s", jVar.f430072k, java.lang.Boolean.valueOf(jVar.f430076o));
        cj(jVar.f430074m, jVar.f430075n, jVar.f430072k);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f430072k) || !jVar.f430076o) {
            return;
        }
        dc3.a aVar = new dc3.a();
        aVar.f68306x645a32d = jVar.f430072k;
        boolean z17 = hb3.o.Ni().Vi().get(aVar, new java.lang.String[0]);
        if (java.lang.System.currentTimeMillis() - aVar.f68310x499140be > 86400000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "need refetch story data");
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "trigger load red packet story resource: %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        cc3.b bVar = new cc3.b();
        bVar.f295418c = new cc3.a(jVar.f430072k, false, str);
        bVar.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o2(this), true, 50L);
    }
}

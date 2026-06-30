package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static kk.j f182997a = new jt0.i(20, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.class);

    public static int a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, boolean z17) {
        java.lang.String str;
        r45.gp0 gp0Var;
        int i17;
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo msg type is %d", java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()));
        if (!z17 && c5303xc75d2f73.f135623g.f87859l > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "(!result)&&(favoriteEvent.data.errorType > FavExportLogic.KEY_FAV_PARA_NO_ERROR)");
            int i19 = c5303xc75d2f73.f135623g.f87859l;
            k(c5303xc75d2f73, i19);
            return i19;
        }
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        int i27 = c4Var.f87850c;
        boolean z18 = (i27 == 4 || i27 == 8 || i27 == 16 || i27 == 2) ? false : true;
        am.c4 c4Var2 = c5303xc75d2f73.f135623g;
        if (i27 == 14 && c4Var.f87848a.f452497f.size() > 0 && ((i18 = ((r45.gp0) c4Var2.f87848a.f452497f.getLast()).I) == 4 || i18 == 8 || i18 == 10130 || i18 == 15 || i18 == 2)) {
            z18 = false;
        }
        int i28 = c4Var2.f87850c;
        boolean z19 = (i28 == 14 || i28 == 18) ? false : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo msg type skipCheck %B", java.lang.Boolean.valueOf(z18));
        if (z18 || f9Var.M2()) {
            k(c5303xc75d2f73, 0);
            return 0;
        }
        r45.bq0 bq0Var = c4Var2.f87848a;
        if (bq0Var == null) {
            k(c5303xc75d2f73, -1);
            return -1;
        }
        if (bq0Var.f452497f == null) {
            k(c5303xc75d2f73, -1);
            return -1;
        }
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h0) ((c01.x7) i95.n0.c(c01.x7.class))).getClass();
        long h17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.h(f9Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "favMediOverTime =  %s", java.lang.Long.valueOf(h17));
        boolean z27 = java.lang.System.currentTimeMillis() - f9Var.mo78012x3fdd41df() > h17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo isOverThreeDays %B", java.lang.Boolean.valueOf(z27));
        java.lang.String str2 = null;
        if (1 <= c4Var2.f87848a.f452497f.size()) {
            r45.gp0 gp0Var2 = (r45.gp0) c4Var2.f87848a.f452497f.getLast();
            java.lang.String str3 = gp0Var2.V;
            int i29 = gp0Var2.I;
            gp0Var = gp0Var2;
            str = str3;
            i17 = i29;
        } else {
            str = "";
            gp0Var = null;
            i17 = 0;
        }
        if (gp0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavExportLogic", "dataItem is null, size:" + c4Var2.f87848a.f452497f.size());
        }
        if (z27) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
                if (f9Var.mo78013xfb85f7b0() == 43 || f9Var.mo78013xfb85f7b0() == 44 || f9Var.mo78013xfb85f7b0() == 62) {
                    wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                    java.lang.String z07 = f9Var.z0();
                    ((vf0.y1) x1Var).getClass();
                    t21.v2 h18 = t21.d3.h(z07);
                    if (h18 != null && h18.f496559x == -1) {
                        java.lang.String f17 = h18.f();
                        if (com.p314xaae8f345.mm.vfs.w6.j(f17)) {
                            str2 = f17;
                        }
                    }
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    l(c5303xc75d2f73, gp0Var, -4);
                    return -4;
                }
                ((r45.gp0) c4Var2.f87848a.f452497f.getLast()).A0(str2);
                str = str2;
            }
            if (h(f9Var, c5303xc75d2f73, str, true, z19, i17)) {
                l(c5303xc75d2f73, gp0Var, -5);
                return -5;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  isOverThreeDays true not big not expired");
        } else if (h(f9Var, c5303xc75d2f73, str, false, z19, i17)) {
            l(c5303xc75d2f73, gp0Var, -5);
            return -5;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  fav data is normal");
        l(c5303xc75d2f73, gp0Var, 0);
        return 0;
    }

    public static android.graphics.Bitmap b(java.lang.String str) {
        if (fp.h.c(8)) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D(str, 1, -1);
        }
        return null;
    }

    public static android.graphics.Bitmap c(java.lang.String str, int i17, int i18, boolean z17) {
        android.graphics.Bitmap K;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) f182997a).get(str);
        if (bitmap != null) {
            return bitmap;
        }
        if (z17 || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return null;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(str, options);
        if (d17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "bitmap recycle %s", d17);
            d17.recycle();
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.c(options.outWidth, options.outHeight) && options.outWidth > 480;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.e(options.outWidth, options.outHeight) && options.outHeight > 480;
        if (z18 || z19) {
            int i19 = options.outHeight;
            int i27 = options.outWidth;
            while (i27 * i19 > 2764800) {
                i27 >>= 1;
                i19 >>= 1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavExportLogic", "fit long picture, beg %d*%d, after %d*%d", java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight), java.lang.Integer.valueOf(java.lang.Math.max(1, i27)), java.lang.Integer.valueOf(java.lang.Math.max(1, i19)));
        }
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str);
        if (a17 != 90) {
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.C20996x490c1edf.m77704x21a6596e(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.C20996x490c1edf.m77709xef66a801(str)) {
            K = com.p314xaae8f345.mm.sdk.p2603x2137b148.C20996x490c1edf.m77707x6317a40f(str);
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(K == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "Progressive jpeg, result isNull:%b", objArr);
        } else {
            K = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K(str);
        }
        if (K == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavExportLogic", "getSuitableBmp fail, temBmp is null, filePath = " + str);
            return null;
        }
        android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(K, a17);
        if (w07.getByteCount() > 20971520) {
            return w07;
        }
        ((jt0.i) f182997a).put(str, w07);
        return w07;
    }

    public static java.lang.Integer d(int i17, r45.bq0 bq0Var) {
        if (i17 == 8) {
            return 1;
        }
        if (i17 == 5) {
            return (bq0Var == null || bq0Var.K == null) ? 3 : 2;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f5, code lost:
    
        if (r18 != 16) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(int r18, int r19, int r20, android.app.Activity r21, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 r22, android.view.View r23, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h r24, android.content.DialogInterface.OnClickListener r25, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g r26, boolean r27, int r28, r45.bq0 r29) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.e(int, int, int, android.app.Activity, androidx.fragment.app.Fragment, android.view.View, com.tencent.mm.ui.widget.snackbar.h, android.content.DialogInterface$OnClickListener, com.tencent.mm.ui.widget.snackbar.g, boolean, int, r45.bq0):void");
    }

    public static void f(int i17, int i18, int i19, android.app.Activity activity, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h hVar, android.content.DialogInterface.OnClickListener onClickListener, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g gVar) {
        e(i17, i18, i19, activity, componentCallbacksC1101xa17d4670, null, hVar, onClickListener, gVar, true, 0, null);
    }

    public static void g(int i17, int i18, android.app.Activity activity, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g gVar) {
        f(-1, i17, i18, activity, null, null, null, gVar);
    }

    public static boolean h(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, java.lang.String str, boolean z17, boolean z18, int i17) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            if (r6Var.m()) {
                if (r6Var.C() > ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).qj(i17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file is big");
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file not big");
            } else if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  not download finish ！attachFile.exists()");
                ((r45.gp0) c5303xc75d2f73.f135623g.f87848a.f452497f.getLast()).A0(null);
            }
        }
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            if (v17.f430215m > ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).qj(i17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file is big");
                return true;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.vfs.w6.j(str) && !z17) {
                if (v17.f430215m > com.p314xaae8f345.mm.vfs.w6.k(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  not download finish content.attachlen > datasize");
                    ((r45.gp0) c5303xc75d2f73.f135623g.f87848a.f452497f.getLast()).A0(null);
                }
            }
        }
        if (v17 != null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo (content == null)");
        return false;
    }

    public static void i(r45.bq0 bq0Var, int i17, java.lang.String str, boolean z17, int i18) {
        int i19;
        r45.jq0 jq0Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(i17));
        if (bq0Var == null || (jq0Var = bq0Var.f452495d) == null) {
            i19 = -1;
        } else {
            i19 = jq0Var.f459567d;
            if (i19 == 1) {
                i19 = c01.e2.G(jq0Var.f459569f) ? 23 : com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(jq0Var.f459569f) ? 22 : 21;
            } else if (i19 == 3) {
                if (i18 == 1) {
                    i19 = 24;
                } else if (i18 == 2) {
                    i19 = 25;
                } else if (i18 == 3) {
                    i19 = 26;
                }
            }
        }
        hashMap.put("fav_source", java.lang.Integer.valueOf(i19));
        hashMap.put("general_msg_type", d(i17, bq0Var));
        if (z17) {
            hashMap.put("fav_tips_clk_type", 1);
        } else {
            hashMap.put("fav_tips_clk_type", 0);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_succ_tips", str, hashMap, 32903);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavExportLogic", "reportSuccessSnackBar, eventId: " + str + ", isClickAddTag: " + z17 + ", params: " + hashMap);
    }

    public static void j(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, int i17) {
        java.util.LinkedList linkedList = c5303xc75d2f73.f135623g.f87848a.f452497f;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (linkedList == null || linkedList.size() == 0) {
            c4Var.f87859l = i17;
            return;
        }
        int i18 = c4Var.f87859l;
        if (i18 == -9) {
            return;
        }
        char c17 = (i17 > 0 || i18 > 0) ? (char) 1 : (char) 0;
        int i19 = 0;
        int i27 = 0;
        int i28 = 0;
        for (int i29 = 0; i29 < c4Var.f87848a.f452497f.size(); i29++) {
            int i37 = ((r45.gp0) c4Var.f87848a.f452497f.get(i29)).X1;
            if (i37 == 0) {
                i27++;
            } else if (i37 == 1) {
                i28++;
            } else if (i37 == 2) {
                i19++;
            }
        }
        if (c17 > 0) {
            if (i19 > 0 || i28 > 0) {
                c4Var.f87859l = -9;
                return;
            } else {
                c4Var.f87859l = i17;
                return;
            }
        }
        if (i19 <= 0) {
            if (i28 > 0) {
                if (i27 == 0) {
                    c4Var.f87859l = -4;
                    return;
                } else {
                    if (i27 > 0) {
                        c4Var.f87859l = -6;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i28 > 0) {
            c4Var.f87859l = -8;
        } else if (i27 == 0) {
            c4Var.f87859l = -5;
        } else if (i27 > 0) {
            c4Var.f87859l = -7;
        }
    }

    public static int k(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, int i17) {
        java.util.LinkedList linkedList = c5303xc75d2f73.f135623g.f87848a.f452497f;
        if (linkedList != null && linkedList.size() > 0) {
            r45.gp0 gp0Var = (r45.gp0) c5303xc75d2f73.f135623g.f87848a.f452497f.getLast();
            if (i17 <= 0) {
                if (i17 == -5) {
                    gp0Var.j0(2);
                    gp0Var.A0(null);
                } else if (i17 != -4) {
                    gp0Var.j0(0);
                } else {
                    gp0Var.j0(1);
                    gp0Var.A0(null);
                }
            }
        }
        j(c5303xc75d2f73, i17);
        return i17;
    }

    public static int l(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, r45.gp0 gp0Var, int i17) {
        if (gp0Var == null) {
            k(c5303xc75d2f73, i17);
            return i17;
        }
        if (i17 <= 0) {
            if (i17 == -5) {
                gp0Var.j0(2);
                gp0Var.A0(null);
            } else if (i17 != -4) {
                gp0Var.j0(0);
            } else {
                gp0Var.j0(1);
                gp0Var.A0(null);
            }
        }
        j(c5303xc75d2f73, i17);
        return i17;
    }
}

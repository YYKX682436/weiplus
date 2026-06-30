package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static kk.j f101464a = new jt0.i(20, com.tencent.mm.plugin.fav.ui.u1.class);

    public static int a(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, boolean z17) {
        java.lang.String str;
        r45.gp0 gp0Var;
        int i17;
        int i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo msg type is %d", java.lang.Integer.valueOf(f9Var.getType()));
        if (!z17 && doFavoriteEvent.f54090g.f6326l > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "(!result)&&(favoriteEvent.data.errorType > FavExportLogic.KEY_FAV_PARA_NO_ERROR)");
            int i19 = doFavoriteEvent.f54090g.f6326l;
            k(doFavoriteEvent, i19);
            return i19;
        }
        am.c4 c4Var = doFavoriteEvent.f54090g;
        int i27 = c4Var.f6317c;
        boolean z18 = (i27 == 4 || i27 == 8 || i27 == 16 || i27 == 2) ? false : true;
        am.c4 c4Var2 = doFavoriteEvent.f54090g;
        if (i27 == 14 && c4Var.f6315a.f370964f.size() > 0 && ((i18 = ((r45.gp0) c4Var2.f6315a.f370964f.getLast()).I) == 4 || i18 == 8 || i18 == 10130 || i18 == 15 || i18 == 2)) {
            z18 = false;
        }
        int i28 = c4Var2.f6317c;
        boolean z19 = (i28 == 14 || i28 == 18) ? false : true;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo msg type skipCheck %B", java.lang.Boolean.valueOf(z18));
        if (z18 || f9Var.M2()) {
            k(doFavoriteEvent, 0);
            return 0;
        }
        r45.bq0 bq0Var = c4Var2.f6315a;
        if (bq0Var == null) {
            k(doFavoriteEvent, -1);
            return -1;
        }
        if (bq0Var.f370964f == null) {
            k(doFavoriteEvent, -1);
            return -1;
        }
        ((com.tencent.mm.pluginsdk.model.app.h0) ((c01.x7) i95.n0.c(c01.x7.class))).getClass();
        long h17 = com.tencent.mm.ui.chatting.component.z4.h(f9Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "favMediOverTime =  %s", java.lang.Long.valueOf(h17));
        boolean z27 = java.lang.System.currentTimeMillis() - f9Var.getCreateTime() > h17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo isOverThreeDays %B", java.lang.Boolean.valueOf(z27));
        java.lang.String str2 = null;
        if (1 <= c4Var2.f6315a.f370964f.size()) {
            r45.gp0 gp0Var2 = (r45.gp0) c4Var2.f6315a.f370964f.getLast();
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
            com.tencent.mars.xlog.Log.w("MicroMsg.FavExportLogic", "dataItem is null, size:" + c4Var2.f6315a.f370964f.size());
        }
        if (z27) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str)) {
                if (f9Var.getType() == 43 || f9Var.getType() == 44 || f9Var.getType() == 62) {
                    wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                    java.lang.String z07 = f9Var.z0();
                    ((vf0.y1) x1Var).getClass();
                    t21.v2 h18 = t21.d3.h(z07);
                    if (h18 != null && h18.f415026x == -1) {
                        java.lang.String f17 = h18.f();
                        if (com.tencent.mm.vfs.w6.j(f17)) {
                            str2 = f17;
                        }
                    }
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    l(doFavoriteEvent, gp0Var, -4);
                    return -4;
                }
                ((r45.gp0) c4Var2.f6315a.f370964f.getLast()).A0(str2);
                str = str2;
            }
            if (h(f9Var, doFavoriteEvent, str, true, z19, i17)) {
                l(doFavoriteEvent, gp0Var, -5);
                return -5;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  isOverThreeDays true not big not expired");
        } else if (h(f9Var, doFavoriteEvent, str, false, z19, i17)) {
            l(doFavoriteEvent, gp0Var, -5);
            return -5;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  fav data is normal");
        l(doFavoriteEvent, gp0Var, 0);
        return 0;
    }

    public static android.graphics.Bitmap b(java.lang.String str) {
        if (fp.h.c(8)) {
            return com.tencent.mm.sdk.platformtools.x.D(str, 1, -1);
        }
        return null;
    }

    public static android.graphics.Bitmap c(java.lang.String str, int i17, int i18, boolean z17) {
        android.graphics.Bitmap K;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) f101464a).get(str);
        if (bitmap != null) {
            return bitmap;
        }
        if (z17 || !com.tencent.mm.vfs.w6.j(str)) {
            return null;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(str, options);
        if (d17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "bitmap recycle %s", d17);
            d17.recycle();
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.q2.c(options.outWidth, options.outHeight) && options.outWidth > 480;
        boolean z19 = com.tencent.mm.sdk.platformtools.q2.e(options.outWidth, options.outHeight) && options.outHeight > 480;
        if (z18 || z19) {
            int i19 = options.outHeight;
            int i27 = options.outWidth;
            while (i27 * i19 > 2764800) {
                i27 >>= 1;
                i19 >>= 1;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.FavExportLogic", "fit long picture, beg %d*%d, after %d*%d", java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight), java.lang.Integer.valueOf(java.lang.Math.max(1, i27)), java.lang.Integer.valueOf(java.lang.Math.max(1, i19)));
        }
        int a17 = com.tencent.mm.sdk.platformtools.l.a(str);
        if (a17 != 90) {
        }
        if (com.tencent.mm.sdk.platformtools.MMNativeJpeg.IsJpegFile(str) && com.tencent.mm.sdk.platformtools.MMNativeJpeg.isProgressive(str)) {
            K = com.tencent.mm.sdk.platformtools.MMNativeJpeg.decodeAsBitmap(str);
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(K == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "Progressive jpeg, result isNull:%b", objArr);
        } else {
            K = com.tencent.mm.sdk.platformtools.x.K(str);
        }
        if (K == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavExportLogic", "getSuitableBmp fail, temBmp is null, filePath = " + str);
            return null;
        }
        android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(K, a17);
        if (w07.getByteCount() > 20971520) {
            return w07;
        }
        ((jt0.i) f101464a).put(str, w07);
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
    public static void e(int r18, int r19, int r20, android.app.Activity r21, androidx.fragment.app.Fragment r22, android.view.View r23, com.tencent.mm.ui.widget.snackbar.h r24, android.content.DialogInterface.OnClickListener r25, com.tencent.mm.ui.widget.snackbar.g r26, boolean r27, int r28, r45.bq0 r29) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.u1.e(int, int, int, android.app.Activity, androidx.fragment.app.Fragment, android.view.View, com.tencent.mm.ui.widget.snackbar.h, android.content.DialogInterface$OnClickListener, com.tencent.mm.ui.widget.snackbar.g, boolean, int, r45.bq0):void");
    }

    public static void f(int i17, int i18, int i19, android.app.Activity activity, androidx.fragment.app.Fragment fragment, com.tencent.mm.ui.widget.snackbar.h hVar, android.content.DialogInterface.OnClickListener onClickListener, com.tencent.mm.ui.widget.snackbar.g gVar) {
        e(i17, i18, i19, activity, fragment, null, hVar, onClickListener, gVar, true, 0, null);
    }

    public static void g(int i17, int i18, android.app.Activity activity, com.tencent.mm.ui.widget.snackbar.g gVar) {
        f(-1, i17, i18, activity, null, null, null, gVar);
    }

    public static boolean h(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, java.lang.String str, boolean z17, boolean z18, int i17) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (r6Var.m()) {
                if (r6Var.C() > ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).qj(i17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file is big");
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file not big");
            } else if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  not download finish ！attachFile.exists()");
                ((r45.gp0) doFavoriteEvent.f54090g.f6315a.f370964f.getLast()).A0(null);
            }
        }
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            if (v17.f348682m > ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).qj(i17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file is big");
                return true;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.vfs.w6.j(str) && !z17) {
                if (v17.f348682m > com.tencent.mm.vfs.w6.k(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  not download finish content.attachlen > datasize");
                    ((r45.gp0) doFavoriteEvent.f54090g.f6315a.f370964f.getLast()).A0(null);
                }
            }
        }
        if (v17 != null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo (content == null)");
        return false;
    }

    public static void i(r45.bq0 bq0Var, int i17, java.lang.String str, boolean z17, int i18) {
        int i19;
        r45.jq0 jq0Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("card_fav_type", java.lang.Integer.valueOf(i17));
        if (bq0Var == null || (jq0Var = bq0Var.f370962d) == null) {
            i19 = -1;
        } else {
            i19 = jq0Var.f378034d;
            if (i19 == 1) {
                i19 = c01.e2.G(jq0Var.f378036f) ? 23 : com.tencent.mm.storage.z3.R4(jq0Var.f378036f) ? 22 : 21;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.FavExportLogic", "reportSuccessSnackBar, eventId: " + str + ", isClickAddTag: " + z17 + ", params: " + hashMap);
    }

    public static void j(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, int i17) {
        java.util.LinkedList linkedList = doFavoriteEvent.f54090g.f6315a.f370964f;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (linkedList == null || linkedList.size() == 0) {
            c4Var.f6326l = i17;
            return;
        }
        int i18 = c4Var.f6326l;
        if (i18 == -9) {
            return;
        }
        char c17 = (i17 > 0 || i18 > 0) ? (char) 1 : (char) 0;
        int i19 = 0;
        int i27 = 0;
        int i28 = 0;
        for (int i29 = 0; i29 < c4Var.f6315a.f370964f.size(); i29++) {
            int i37 = ((r45.gp0) c4Var.f6315a.f370964f.get(i29)).X1;
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
                c4Var.f6326l = -9;
                return;
            } else {
                c4Var.f6326l = i17;
                return;
            }
        }
        if (i19 <= 0) {
            if (i28 > 0) {
                if (i27 == 0) {
                    c4Var.f6326l = -4;
                    return;
                } else {
                    if (i27 > 0) {
                        c4Var.f6326l = -6;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i28 > 0) {
            c4Var.f6326l = -8;
        } else if (i27 == 0) {
            c4Var.f6326l = -5;
        } else if (i27 > 0) {
            c4Var.f6326l = -7;
        }
    }

    public static int k(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, int i17) {
        java.util.LinkedList linkedList = doFavoriteEvent.f54090g.f6315a.f370964f;
        if (linkedList != null && linkedList.size() > 0) {
            r45.gp0 gp0Var = (r45.gp0) doFavoriteEvent.f54090g.f6315a.f370964f.getLast();
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
        j(doFavoriteEvent, i17);
        return i17;
    }

    public static int l(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, r45.gp0 gp0Var, int i17) {
        if (gp0Var == null) {
            k(doFavoriteEvent, i17);
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
        j(doFavoriteEvent, i17);
        return i17;
    }
}

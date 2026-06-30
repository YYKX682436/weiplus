package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public abstract class n2 {
    public static java.lang.StringBuilder a(java.lang.String str, int i17) {
        int Z3 = ((v81.e) i95.n0.c(v81.e.class)).Z3(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1_");
        sb6.append(str);
        sb6.append("_");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(kk.v.a(Z3)));
        sb6.append("_");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        sb6.append("_");
        sb6.append(i17);
        return sb6;
    }

    public static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return str.startsWith("file://") ? str.replace("file://", "") : str.startsWith("delayLoadFile://") ? str.replace("delayLoadFile://", "") : str;
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            try {
                try {
                    if (!bitmap.isRecycled()) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareHelper", "saveFile(appId : %s, pageView : %s, saveFileCost : %sms)", v5Var.mo48798x74292566(), java.lang.Integer.valueOf(v5Var.hashCode()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("delay_load_img_path", "file://".concat(str));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareHelper", "notifyToRefreshImg(cost : %s)", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                        bundle.putInt("action", 2);
                        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.e.class, null);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareHelper", "save temp bitmap to file failed, . exception : %s", e17);
                    if (bitmap.isRecycled()) {
                        return;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareHelper", "bitmap recycle %s", bitmap);
                    }
                }
            } catch (java.lang.Throwable th6) {
                if (!bitmap.isRecycled()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareHelper", "bitmap recycle %s", bitmap);
                    bitmap.recycle();
                }
                throw th6;
            }
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareHelper", "bitmap recycle %s", bitmap);
        bitmap.recycle();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:80|81|14|(0)(0)|17|18|(2:19|20)|21|(0)(0)|24|25|26|27|28|(0)(0)|31|32|33|(0)(0)|36|37|38|39|40|(0)(0)|43|44|(0)|48|(0)(0)|(0)|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0081, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareHelper", "encode shareTitle error!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0051, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareHelper", "encode current html url error!");
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b A[Catch: UnsupportedEncodingException -> 0x00a0, TRY_LEAVE, TryCatch #7 {UnsupportedEncodingException -> 0x00a0, blocks: (B:44:0x0091, B:46:0x009b), top: B:43:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(java.lang.String r27, int r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, java.lang.String r37, java.lang.String r38, int r39, java.lang.String r40, int r41, int r42, java.lang.String r43) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.d(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, int, int, java.lang.String):void");
    }

    public static java.lang.String e(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, java.lang.String str, boolean z17) {
        if (bVar == null) {
            return null;
        }
        java.lang.String mo48798x74292566 = bVar.mo48798x74292566();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (!z17) {
                return null;
            }
            bVar.r3(null);
            if (bVar.mo50354x59eafec1() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareHelper", "tryToGetLocalFilePath NULL fs with appId(%s)", bVar.mo48798x74292566());
                return null;
            }
            com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5 = bVar.mo50354x59eafec1().mo49614x6665a5c5("share_" + java.lang.System.nanoTime());
            if (mo49614x6665a5c5 == null) {
                return null;
            }
            java.lang.String o17 = mo49614x6665a5c5.o();
            if (bVar.B1(ce.g.class) != null) {
                c(bVar, o17, bVar.R1());
                return o17;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("action", 1);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.e.class, null);
            bVar.u3().b(lm5.d.f401135c, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.m2(bVar, o17));
            return "delayLoadFile://" + o17;
        }
        if (str.startsWith("wxfile://")) {
            com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = bVar.mo50354x59eafec1().mo49620x1d537609(str);
            if (mo49620x1d537609 == null || !mo49620x1d537609.m()) {
                return null;
            }
            return "file://" + mo49620x1d537609.o();
        }
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            java.lang.String m49597x6a716255 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.m49597x6a716255(mo48798x74292566, "share_" + java.lang.System.nanoTime());
            android.graphics.Bitmap b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s5.b(bVar.t3(), str);
            if (b17 != null && !b17.isRecycled()) {
                try {
                    try {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(b17, 100, android.graphics.Bitmap.CompressFormat.PNG, m49597x6a716255, true);
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareHelper", "save temp bitmap to file failed, . exception : %s", e17);
                        if (!b17.isRecycled()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareHelper", "bitmap recycle %s", b17);
                        }
                    }
                    if (!b17.isRecycled()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareHelper", "bitmap recycle %s", b17);
                        b17.recycle();
                    }
                    return "file://" + m49597x6a716255;
                } catch (java.lang.Throwable th6) {
                    if (!b17.isRecycled()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareHelper", "bitmap recycle %s", b17);
                        b17.recycle();
                    }
                    throw th6;
                }
            }
        }
        return null;
    }
}

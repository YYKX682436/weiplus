package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class z extends bt3.b2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0
    public android.graphics.Bitmap a(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.e0 e0Var) {
        return i(e0Var.f236913a, e0Var.f236915c, e0Var.f236914b);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0
    public android.graphics.Bitmap b(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.d0 d0Var) {
        android.graphics.Bitmap bitmap;
        boolean f17;
        r45.gp0 gp0Var = d0Var.f236900a;
        java.lang.String str = d0Var.f236902c;
        long j17 = d0Var.f236901b;
        boolean z17 = d0Var.f236904e;
        int i17 = d0Var.f236903d;
        if (fp.i.b()) {
            java.lang.String t17 = bt3.g2.t(gp0Var, str, j17, 1);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t17) && com.p314xaae8f345.mm.vfs.w6.j(t17)) {
                jt0.i iVar = (jt0.i) this.f105746e;
                android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) iVar.get(t17);
                if (bitmap2 != null) {
                    bitmap = bitmap2;
                } else if (!z17) {
                    com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5 c10724x2c46e1f5 = new com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5();
                    ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).inJustDecodeBounds = true;
                    android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(t17, c10724x2c46e1f5);
                    if (d17 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgImgService", "bitmap recycle %s", d17);
                        d17.recycle();
                    }
                    int i18 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight;
                    int i19 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth;
                    if (i19 > i17) {
                        i18 = (i18 * i17) / i19;
                        i19 = i17;
                    }
                    int max = java.lang.Math.max(1, i19);
                    int max2 = java.lang.Math.max(1, i18);
                    if (max > i17) {
                        max2 = (((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight * i17) / ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth;
                    } else {
                        i17 = max;
                    }
                    int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(t17);
                    if (a17 != 90 && a17 != 270) {
                        int i27 = max2;
                        max2 = i17;
                        i17 = i27;
                    }
                    android.graphics.Bitmap T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(t17, i17, max2, false);
                    if (T == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgImgService", "extractThumbNail fail, temBmp is null, filePath = " + t17);
                    } else {
                        bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(T, a17);
                        iVar.put(t17, bitmap);
                    }
                }
            }
            bitmap = null;
        } else {
            bitmap = com.p314xaae8f345.mm.p786x600aa8b.e.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), com.p314xaae8f345.mm.R.C30861xcebc809e.bkr);
        }
        if (bitmap == null && !z17 && (f17 = f(gp0Var.T, str, j17))) {
            bt3.g2.O(gp0Var, str, j17, f17);
        }
        return bitmap;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.c0 c0Var) {
        e(c0Var.f236889a, c0Var.f236890b, c0Var.f236892d, c0Var.f236891c, c0Var.f236893e, c0Var.f236894f, c0Var.f236895g);
    }
}

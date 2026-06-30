package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public final class r extends bt3.b2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.w f237004f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f237005g;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.w forwardLogic) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forwardLogic, "forwardLogic");
        this.f237004f = forwardLogic;
        this.f237005g = "MicroMsg.ForwardRecordImageServiceProxy";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0
    public android.graphics.Bitmap a(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.e0 args) {
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        r45.gp0 gp0Var = args.f236913a;
        int i19 = gp0Var.I;
        if (i19 != 2 && i19 != 4) {
            return i(gp0Var, args.f236915c, args.f236914b);
        }
        java.lang.String str = gp0Var.X;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return null;
        }
        kk.j jVar = this.f105746e;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).get(str);
        if (bitmap != null) {
            return bitmap;
        }
        com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5 c10724x2c46e1f5 = new com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5();
        ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).inJustDecodeBounds = true;
        android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(str, c10724x2c46e1f5);
        java.lang.String str2 = this.f237005g;
        if (d17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "bitmap recycled %s", d17);
            d17.recycle();
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.c(((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth, ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight) && ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth > 480;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.e(((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth, ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight) && ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight > 480;
        if (z17 || z18) {
            int i27 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight;
            i17 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth;
            i18 = i27;
        } else {
            i18 = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761;
            i17 = 960;
        }
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str);
        if (a17 == 90 || a17 == 270) {
            int i28 = i17;
            i17 = i18;
            i18 = i28;
        }
        android.graphics.Bitmap T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(str, i18, i17, false);
        if (T != null) {
            android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(T, a17);
            ((jt0.i) jVar).put(str, w07);
            return w07;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "extractThumbNail fail, temBmp is null, filePath = " + str);
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0
    public android.graphics.Bitmap b(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.d0 args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        java.lang.String str = args.f236900a.V;
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.w wVar = this.f237004f;
            wVar.getClass();
            r45.gp0 dataItem = args.f236900a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dataItem, "dataItem");
            s15.h e17 = bt3.x2.e(dataItem);
            java.lang.String aj6 = ((ot.w) ((pt.l0) i95.n0.c(pt.l0.class))).aj(new zt.k("Preview", e17, 1));
            if (((java.util.HashSet) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.w.f237122c).mo141623x754a37bb()).add(aj6)) {
                if (dataItem.V != null && (!r26.n0.N(r6))) {
                    z17 = true;
                }
                if (z17) {
                    v65.i.b(wVar.f237124b, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.t(aj6, e17, dataItem, null), 1, null);
                    return null;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.ForwardRecordMsgDataLogic", aj6 + " already download");
            return null;
        }
        com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5 c10724x2c46e1f5 = new com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5();
        ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).inJustDecodeBounds = true;
        android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(str, c10724x2c46e1f5);
        java.lang.String str2 = this.f237005g;
        if (d17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "bitmap recycle %s", d17);
            d17.recycle();
        }
        int i17 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight;
        int i18 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth;
        int i19 = args.f236903d;
        if (i18 > i19) {
            i17 = (((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight * i19) / ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth;
            i18 = i19;
        }
        int max = java.lang.Math.max(1, i18);
        int max2 = java.lang.Math.max(1, i17);
        int i27 = args.f236903d;
        if (max > i27) {
            max2 = (((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight * i27) / ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth;
            max = i27;
        }
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str);
        if (a17 == 90 || a17 == 270) {
            int i28 = max;
            max = max2;
            max2 = i28;
        }
        android.graphics.Bitmap T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(str, max2, max, false);
        if (T != null) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(T, a17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "extractThumbNail fail, temBmp is null, filePath = " + str);
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.c0 args) {
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        r45.gp0 gp0Var = args.f236890b;
        int i19 = gp0Var.I;
        if (i19 != 2 && i19 != 4) {
            e(args.f236889a, gp0Var, args.f236892d, args.f236891c, args.f236893e, args.f236894f, args.f236895g);
            return;
        }
        java.lang.String str = gp0Var.X;
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            kk.j jVar = this.f105746e;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).get(str);
            if (bitmap != null) {
                args.f236889a.setImageBitmap(bitmap);
                return;
            }
            com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5 c10724x2c46e1f5 = new com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5();
            ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).inJustDecodeBounds = true;
            android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(str, c10724x2c46e1f5);
            java.lang.String str2 = this.f237005g;
            if (d17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "bitmap recycled %s", d17);
                d17.recycle();
            }
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.c(((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth, ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight) && ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth > 480;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.e(((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth, ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight) && ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight > 480;
            if (z17 || z18) {
                int i27 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight;
                i17 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth;
                i18 = i27;
            } else {
                i18 = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761;
                i17 = 960;
            }
            int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str);
            if (a17 == 90 || a17 == 270) {
                int i28 = i17;
                i17 = i18;
                i18 = i28;
            }
            android.graphics.Bitmap T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(str, i18, i17, false);
            if (T != null) {
                android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(T, a17);
                ((jt0.i) jVar).put(str, w07);
                args.f236889a.setImageBitmap(w07);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "extractThumbNail fail, temBmp is null, filePath = " + str);
                args.f236889a.setImageResource(args.f236893e);
            }
        }
    }
}

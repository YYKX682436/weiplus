package bt3;

/* loaded from: classes12.dex */
public class b2 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4 f105742a = new bt3.a2(this, 24);

    /* renamed from: b, reason: collision with root package name */
    public java.util.HashMap f105743b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public java.util.HashSet f105744c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f105745d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final kk.j f105746e = new jt0.i(10, getClass());

    public void d() {
        g();
    }

    public void e(android.widget.ImageView imageView, r45.gp0 gp0Var, java.lang.String str, long j17, int i17, int i18, int i19) {
        r45.tq0 tq0Var;
        java.lang.String str2;
        r45.xs4 xs4Var;
        r45.dp0 dp0Var;
        r45.kv2 kv2Var;
        if (imageView == null) {
            return;
        }
        if (!fp.i.b()) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bkr);
            return;
        }
        if (gp0Var == null) {
            imageView.setImageResource(i17);
            return;
        }
        int i27 = gp0Var.I;
        if (i27 != 4) {
            if (i27 == 5) {
                r45.hp0 hp0Var = gp0Var.J1;
                boolean z17 = false;
                if (hp0Var != null) {
                    tq0Var = hp0Var.f457888f;
                    r45.qp0 qp0Var = hp0Var.f457902w;
                    if (qp0Var != null && qp0Var.f465695d == 5) {
                        z17 = true;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgImgService", "webpage: get data proto item null, dataid[%s]", gp0Var.T);
                    tq0Var = null;
                }
                str2 = tq0Var != null ? tq0Var.f468203m : null;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    str2 = gp0Var.G;
                }
                j(imageView, gp0Var, str, j17, z17 ? qk.c.b(str2, 4, true) : str2, i17, i18, i19);
                return;
            }
            if (i27 != 7) {
                if (i27 == 19) {
                    r45.hp0 hp0Var2 = gp0Var.J1;
                    if (hp0Var2 != null) {
                        dp0Var = hp0Var2.f457901v;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgImgService", "appbrand: get data proto item null, dataid[%s]", gp0Var.T);
                        dp0Var = null;
                    }
                    str2 = dp0Var != null ? dp0Var.f454170g : null;
                    j(imageView, gp0Var, str, j17, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? gp0Var.G : str2, i17, i18, i19);
                    return;
                }
                if (i27 == 22) {
                    r45.hp0 hp0Var3 = gp0Var.J1;
                    if (hp0Var3 == null || (kv2Var = hp0Var3.f457904y) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(kv2Var.m75941xfb821914(7)) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.iv2) gp0Var.J1.f457904y.m75941xfb821914(7).getFirst()).m75945x2fec8307(2))) {
                        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f80119x628f1c9a, imageView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7)));
                        return;
                    } else {
                        this.f105742a.a(imageView, null, ((r45.iv2) gp0Var.J1.f457904y.m75941xfb821914(7).getFirst()).m75945x2fec8307(2), i17, i18, i19);
                        return;
                    }
                }
                if (i27 != 29) {
                    if (i27 == 36) {
                        j(imageView, gp0Var, str, j17, gp0Var.G, i17, i18, i19);
                        return;
                    }
                    if (i27 == 10) {
                        r45.hp0 hp0Var4 = gp0Var.J1;
                        if (hp0Var4 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgImgService", "good: get data proto item null, dataid[%s]", gp0Var.T);
                            return;
                        }
                        r45.aq0 aq0Var = hp0Var4.f457889g;
                        if (aq0Var != null) {
                            this.f105742a.a(imageView, null, aq0Var.f451725h, i17, i18, i19);
                            return;
                        }
                        return;
                    }
                    if (i27 == 11) {
                        r45.hp0 hp0Var5 = gp0Var.J1;
                        if (hp0Var5 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgImgService", "product: get data proto item null, dataid[%s]", gp0Var.T);
                            return;
                        }
                        r45.aq0 aq0Var2 = hp0Var5.f457889g;
                        if (aq0Var2 != null) {
                            this.f105742a.a(imageView, null, aq0Var2.f451725h, i17, i18, i19);
                            return;
                        }
                        return;
                    }
                    if (i27 == 14) {
                        r45.hp0 hp0Var6 = gp0Var.J1;
                        if (hp0Var6 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgImgService", "tv: get data proto item null, dataid[%s]", gp0Var.T);
                            return;
                        }
                        r45.mq0 mq0Var = hp0Var6.f457890h;
                        if (mq0Var != null) {
                            this.f105742a.a(imageView, null, mq0Var.f462272h, i17, i18, i19);
                            return;
                        }
                        return;
                    }
                    if (i27 != 15) {
                        if (i27 != 32) {
                            if (i27 != 33) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordMsgImgService", "attach thumb, pass data type is %d", java.lang.Integer.valueOf(i27));
                                return;
                            } else {
                                j(imageView, gp0Var, str, j17, gp0Var.G, i17, i18, i19);
                                return;
                            }
                        }
                    }
                }
            }
            java.lang.String j18 = j(imageView, gp0Var, str, j17, gp0Var.G, i17, i18, i19);
            r45.hp0 hp0Var7 = gp0Var.J1;
            if (hp0Var7 == null || (xs4Var = hp0Var7.C) == null) {
                return;
            }
            xs4Var.set(13, j18);
            return;
        }
        j(imageView, gp0Var, str, j17, gp0Var.G, i17, i18, i19);
    }

    public final boolean f(java.lang.String str, java.lang.String str2, long j17) {
        java.lang.String y17 = bt3.g2.y(str, str2, j17, true);
        java.util.HashMap hashMap = this.f105745d;
        fp.j jVar = (fp.j) hashMap.get(y17);
        if (jVar == null) {
            hashMap.put(y17, new fp.j());
            return true;
        }
        if (jVar.a() <= 30000) {
            return false;
        }
        jVar.b();
        return true;
    }

    public void g() {
        this.f105742a.b();
        this.f105743b.clear();
        this.f105744c.clear();
        this.f105742a = null;
        this.f105743b = null;
        this.f105744c = null;
    }

    public final android.graphics.Bitmap h(r45.gp0 gp0Var, java.lang.String str, long j17, boolean z17, boolean z18) {
        int i17;
        int i18;
        if (!fp.i.b()) {
            return com.p314xaae8f345.mm.p786x600aa8b.e.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), com.p314xaae8f345.mm.R.C30861xcebc809e.bkr);
        }
        java.lang.String H = z17 ? bt3.g2.H(gp0Var, str, j17, 1) : bt3.g2.t(gp0Var, str, j17, 1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(H) || !com.p314xaae8f345.mm.vfs.w6.j(H)) {
            return null;
        }
        kk.j jVar = this.f105746e;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).get(H);
        if (bitmap != null) {
            return bitmap;
        }
        if (z18) {
            return null;
        }
        com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5 c10724x2c46e1f5 = new com.p314xaae8f345.mm.p786x600aa8b.C10724x2c46e1f5();
        ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).inJustDecodeBounds = true;
        android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(H, c10724x2c46e1f5);
        if (d17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgImgService", "bitmap recycled %s", d17);
            d17.recycle();
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.c(((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth, ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight) && ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth > 480;
        boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.e(((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth, ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight) && ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight > 480;
        if (z19 || z27) {
            i17 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outHeight;
            i18 = ((android.graphics.BitmapFactory.Options) c10724x2c46e1f5).outWidth;
        } else {
            i18 = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761;
            i17 = 960;
        }
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(H);
        if (a17 != 90 && a17 != 270) {
            int i19 = i17;
            i17 = i18;
            i18 = i19;
        }
        android.graphics.Bitmap T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(H, i18, i17, false);
        if (T != null) {
            android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(T, a17);
            ((jt0.i) jVar).put(H, w07);
            return w07;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgImgService", "extractThumbNail fail, temBmp is null, filePath = " + H);
        return null;
    }

    public android.graphics.Bitmap i(r45.gp0 gp0Var, java.lang.String str, long j17) {
        boolean f17;
        android.graphics.Bitmap h17 = h(gp0Var, str, j17, true, false);
        if (h17 == null && (f17 = f(bt3.g2.F(gp0Var.T), str, j17))) {
            bt3.g2.P(gp0Var, str, j17, f17);
        }
        return h17;
    }

    public final java.lang.String j(android.widget.ImageView imageView, r45.gp0 gp0Var, java.lang.String str, long j17, java.lang.String str2, int i17, int i18, int i19) {
        java.lang.String str3 = bt3.g2.F(gp0Var.T) + "@" + java.lang.String.valueOf(j17);
        if (gp0Var.T == null) {
            return null;
        }
        java.lang.String[] strArr = (java.lang.String[]) this.f105743b.get(str3);
        if (strArr == null || strArr.length <= 0) {
            strArr = new java.lang.String[]{bt3.g2.H(gp0Var, str, j17, 1)};
            this.f105743b.put(str3, strArr);
        }
        this.f105742a.a(imageView, strArr, str2, i17, i18, i19);
        if (this.f105744c.contains(str3)) {
            return strArr[0];
        }
        this.f105744c.add(str3);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(strArr[0]);
        java.lang.String str4 = a17.f294812f;
        if (str4 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b)) && (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456945h) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456938d2))) {
            bt3.g2.P(gp0Var, str, j17, f(gp0Var.T, str, j17));
        }
        return strArr[0];
    }
}

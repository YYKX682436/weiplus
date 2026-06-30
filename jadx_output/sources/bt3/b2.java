package bt3;

/* loaded from: classes12.dex */
public class b2 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.r4 f24209a = new bt3.a2(this, 24);

    /* renamed from: b, reason: collision with root package name */
    public java.util.HashMap f24210b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public java.util.HashSet f24211c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f24212d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final kk.j f24213e = new jt0.i(10, getClass());

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
            imageView.setImageResource(com.tencent.mm.R.drawable.bkr);
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
                    tq0Var = hp0Var.f376355f;
                    r45.qp0 qp0Var = hp0Var.f376369w;
                    if (qp0Var != null && qp0Var.f384162d == 5) {
                        z17 = true;
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgImgService", "webpage: get data proto item null, dataid[%s]", gp0Var.T);
                    tq0Var = null;
                }
                str2 = tq0Var != null ? tq0Var.f386670m : null;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    str2 = gp0Var.G;
                }
                j(imageView, gp0Var, str, j17, z17 ? qk.c.b(str2, 4, true) : str2, i17, i18, i19);
                return;
            }
            if (i27 != 7) {
                if (i27 == 19) {
                    r45.hp0 hp0Var2 = gp0Var.J1;
                    if (hp0Var2 != null) {
                        dp0Var = hp0Var2.f376368v;
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgImgService", "appbrand: get data proto item null, dataid[%s]", gp0Var.T);
                        dp0Var = null;
                    }
                    str2 = dp0Var != null ? dp0Var.f372637g : null;
                    j(imageView, gp0Var, str, j17, com.tencent.mm.sdk.platformtools.t8.K0(str2) ? gp0Var.G : str2, i17, i18, i19);
                    return;
                }
                if (i27 == 22) {
                    r45.hp0 hp0Var3 = gp0Var.J1;
                    if (hp0Var3 == null || (kv2Var = hp0Var3.f376371y) == null || com.tencent.mm.sdk.platformtools.t8.L0(kv2Var.getList(7)) || com.tencent.mm.sdk.platformtools.t8.K0(((r45.iv2) gp0Var.J1.f376371y.getList(7).getFirst()).getString(2))) {
                        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_outlined_finder_icon, imageView.getContext().getResources().getColor(com.tencent.mm.R.color.f478526a7)));
                        return;
                    } else {
                        this.f24209a.a(imageView, null, ((r45.iv2) gp0Var.J1.f376371y.getList(7).getFirst()).getString(2), i17, i18, i19);
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
                            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgImgService", "good: get data proto item null, dataid[%s]", gp0Var.T);
                            return;
                        }
                        r45.aq0 aq0Var = hp0Var4.f376356g;
                        if (aq0Var != null) {
                            this.f24209a.a(imageView, null, aq0Var.f370192h, i17, i18, i19);
                            return;
                        }
                        return;
                    }
                    if (i27 == 11) {
                        r45.hp0 hp0Var5 = gp0Var.J1;
                        if (hp0Var5 == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgImgService", "product: get data proto item null, dataid[%s]", gp0Var.T);
                            return;
                        }
                        r45.aq0 aq0Var2 = hp0Var5.f376356g;
                        if (aq0Var2 != null) {
                            this.f24209a.a(imageView, null, aq0Var2.f370192h, i17, i18, i19);
                            return;
                        }
                        return;
                    }
                    if (i27 == 14) {
                        r45.hp0 hp0Var6 = gp0Var.J1;
                        if (hp0Var6 == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgImgService", "tv: get data proto item null, dataid[%s]", gp0Var.T);
                            return;
                        }
                        r45.mq0 mq0Var = hp0Var6.f376357h;
                        if (mq0Var != null) {
                            this.f24209a.a(imageView, null, mq0Var.f380739h, i17, i18, i19);
                            return;
                        }
                        return;
                    }
                    if (i27 != 15) {
                        if (i27 != 32) {
                            if (i27 != 33) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgImgService", "attach thumb, pass data type is %d", java.lang.Integer.valueOf(i27));
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
        java.util.HashMap hashMap = this.f24212d;
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
        this.f24209a.b();
        this.f24210b.clear();
        this.f24211c.clear();
        this.f24209a = null;
        this.f24210b = null;
        this.f24211c = null;
    }

    public final android.graphics.Bitmap h(r45.gp0 gp0Var, java.lang.String str, long j17, boolean z17, boolean z18) {
        int i17;
        int i18;
        if (!fp.i.b()) {
            return com.tencent.mm.graphics.e.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), com.tencent.mm.R.drawable.bkr);
        }
        java.lang.String H = z17 ? bt3.g2.H(gp0Var, str, j17, 1) : bt3.g2.t(gp0Var, str, j17, 1);
        if (com.tencent.mm.sdk.platformtools.t8.K0(H) || !com.tencent.mm.vfs.w6.j(H)) {
            return null;
        }
        kk.j jVar = this.f24213e;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).get(H);
        if (bitmap != null) {
            return bitmap;
        }
        if (z18) {
            return null;
        }
        com.tencent.mm.graphics.MMBitmapFactory$Options mMBitmapFactory$Options = new com.tencent.mm.graphics.MMBitmapFactory$Options();
        ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).inJustDecodeBounds = true;
        android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(H, mMBitmapFactory$Options);
        if (d17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgImgService", "bitmap recycled %s", d17);
            d17.recycle();
        }
        boolean z19 = com.tencent.mm.sdk.platformtools.q2.c(((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth, ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight) && ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth > 480;
        boolean z27 = com.tencent.mm.sdk.platformtools.q2.e(((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth, ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight) && ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight > 480;
        if (z19 || z27) {
            i17 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outHeight;
            i18 = ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options).outWidth;
        } else {
            i18 = com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT;
            i17 = 960;
        }
        int a17 = com.tencent.mm.sdk.platformtools.l.a(H);
        if (a17 != 90 && a17 != 270) {
            int i19 = i17;
            i17 = i18;
            i18 = i19;
        }
        android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(H, i18, i17, false);
        if (T != null) {
            android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(T, a17);
            ((jt0.i) jVar).put(H, w07);
            return w07;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgImgService", "extractThumbNail fail, temBmp is null, filePath = " + H);
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
        java.lang.String[] strArr = (java.lang.String[]) this.f24210b.get(str3);
        if (strArr == null || strArr.length <= 0) {
            strArr = new java.lang.String[]{bt3.g2.H(gp0Var, str, j17, 1)};
            this.f24210b.put(str3, strArr);
        }
        this.f24209a.a(imageView, strArr, str2, i17, i18, i19);
        if (this.f24211c.contains(str3)) {
            return strArr[0];
        }
        this.f24211c.add(str3);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(strArr[0]);
        java.lang.String str4 = a17.f213279f;
        if (str4 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b)) && (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375412h) || !com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375405d2))) {
            bt3.g2.P(gp0Var, str, j17, f(gp0Var.T, str, j17));
        }
        return strArr[0];
    }
}

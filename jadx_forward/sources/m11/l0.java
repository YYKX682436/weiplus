package m11;

/* loaded from: classes12.dex */
public class l0 extends l75.s0 implements k70.a0 {

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f404265s = {"CREATE TABLE IF NOT EXISTS ImgInfo ( id INTEGER PRIMARY KEY, msgSvrId LONG, offset INT, totalLen INT, bigImgPath TEXT, thumbImgPath TEXT )", "CREATE TABLE IF NOT EXISTS ImgInfo2 ( id INTEGER PRIMARY KEY, msgSvrId LONG, offset INT, totalLen INT, bigImgPath TEXT, thumbImgPath TEXT, createtime INT, msglocalid INT, status INT, nettimes INT, reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text, hashdthumb int DEFAULT 0, iscomplete INT DEFAULT 1, origImgMD5 TEXT, compressType INT DEFAULT 0, midImgPath TEXT, forwardType INT DEFAULT 0, hevcPath TEXT, sendImgType INT DEFAULT 0, originSourceMd5 TEXT, msgTalker TEXT )", "CREATE INDEX IF NOT EXISTS  serverImgInfoIndex ON ImgInfo2 ( msgSvrId ) ", "CREATE INDEX IF NOT EXISTS  serverImgInfoHdIndex ON ImgInfo2 ( reserved1 ) ", "CREATE INDEX IF NOT EXISTS  msgLocalIdIndex ON ImgInfo2 ( msglocalid ) ", "insert into imginfo2 (id,msgSvrId , offset , totalLen , bigImgPath , thumbImgPath) select id, msgSvrId, offset ,totallen , bigimgpath , thumbimgpath from imginfo; ", "delete from ImgInfo ; ", "CREATE INDEX IF NOT EXISTS iscomplete_index ON ImgInfo2 ( iscomplete ) ", "CREATE INDEX IF NOT EXISTS origImgMD5_index ON ImgInfo2 ( origImgMD5 ) "};

    /* renamed from: t, reason: collision with root package name */
    public static int f404266t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static int f404267u = -1;

    /* renamed from: v, reason: collision with root package name */
    public static int f404268v = -1;

    /* renamed from: w, reason: collision with root package name */
    public static long f404269w = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f404270d;

    /* renamed from: p, reason: collision with root package name */
    public final l75.k0 f404279p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.ref.SoftReference f404281r;

    /* renamed from: e, reason: collision with root package name */
    public final kk.j f404271e = new jt0.i(40, new m11.d0(this), m11.l0.class);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f404272f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f404273g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f404274h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f404275i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f404276m = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o3 f404277n = com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f404278o = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.FrameLayout.LayoutParams f404280q = new android.widget.FrameLayout.LayoutParams(-2, -2);

    public l0(l75.k0 k0Var) {
        int i17 = 0;
        this.f404270d = false;
        java.lang.String[] strArr = null;
        this.f404279p = null;
        java.util.Iterator it = m11.k0.f404259a.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((m11.j0) it.next()).f404252a;
            android.database.Cursor f17 = k0Var.f("PRAGMA table_info(" + str + ")", strArr, 2);
            int columnIndex = f17.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            int i18 = i17;
            int i19 = i18;
            int i27 = i19;
            int i28 = i27;
            int i29 = i28;
            int i37 = i29;
            int i38 = i37;
            int i39 = i38;
            int i47 = i39;
            int i48 = i47;
            int i49 = i48;
            int i57 = i49;
            while (f17.moveToNext()) {
                if (columnIndex >= 0) {
                    java.lang.String string = f17.getString(columnIndex);
                    i37 = "hashdthumb".equals(string) ? 1 : i37;
                    i38 = "iscomplete".equals(string) ? 1 : i38;
                    i27 = "origImgMD5".equals(string) ? 1 : i27;
                    i39 = "compressType".equals(string) ? 1 : i39;
                    i47 = "midImgPath".equals(string) ? 1 : i47;
                    i48 = "forwardType".equals(string) ? 1 : i48;
                    i49 = "hevcPath".equals(string) ? 1 : i49;
                    if ("originSourceMd5".equals(string)) {
                        i29 = i57;
                        i18 = 1;
                    }
                    if ("msgTalker".equals(string)) {
                        i28 = i57;
                        i19 = 1;
                    }
                }
                i57++;
            }
            f17.close();
            long F = gm0.j1.u().f354686f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            if (i19 != 0 && i27 != 0 && !"ImgInfo2".equals(str) && i28 == 22 && i29 == 23) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "error index for msg_talker, table: " + str);
                this.f404270d = true;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
                c6754x4f2fd58c.p("imginfo2_biz_drop_error_msgtalker_column");
                c6754x4f2fd58c.r(str);
                c6754x4f2fd58c.k();
            }
            if (i37 == 0) {
                k0Var.A(str, "Alter table " + str + " add hashdthumb INT DEFAULT 0");
            }
            if (i38 == 0) {
                k0Var.A(str, "Alter table " + str + " add iscomplete INT DEFAULT 1");
            }
            if (i27 == 0) {
                k0Var.A(str, "Alter table " + str + " add origImgMD5 TEXT");
            }
            if (i39 == 0) {
                k0Var.A(str, "Alter table " + str + " add compressType INT DEFAULT 0");
            }
            if (i47 == 0) {
                k0Var.A(str, "Alter table " + str + " add midImgPath TEXT");
            }
            if (i48 == 0) {
                k0Var.A(str, "Alter table " + str + " add forwardType INT DEFAULT 0");
            }
            if (i49 == 0) {
                k0Var.A(str, "Alter table " + str + " add hevcPath TEXT");
            }
            k0Var.A(str, "Alter table " + str + " add sendImgType INT DEFAULT 0");
            if (i18 == 0) {
                k0Var.A(str, "Alter table " + str + " add originSourceMd5 TEXT");
            }
            if (i19 == 0) {
                k0Var.A(str, "Alter table " + str + " add msgTalker TEXT");
            }
            if (F > 0) {
                gm0.j1.u().f354686f.w(java.lang.Long.valueOf(F));
            }
            i17 = 0;
            strArr = null;
        }
        this.f404279p = k0Var;
        M4();
    }

    public static synchronized java.lang.String W0() {
        java.lang.String b17;
        synchronized (m11.l0.class) {
            b17 = b1("");
        }
        return b17;
    }

    public static synchronized java.lang.String b1(java.lang.String str) {
        java.lang.String g17;
        synchronized (m11.l0.class) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (f404269w == currentTimeMillis) {
                try {
                    java.lang.Thread.sleep(1L);
                } catch (java.lang.InterruptedException unused) {
                }
                currentTimeMillis = java.lang.System.currentTimeMillis();
            }
            f404269w = currentTimeMillis;
            g17 = kk.k.g((str + currentTimeMillis).getBytes());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "generateMd5: %s, %s", g17, java.lang.Long.valueOf(currentTimeMillis));
        }
        return g17;
    }

    public static java.lang.String[] u1(java.lang.String str) {
        return new java.lang.String[]{"CREATE TABLE IF NOT EXISTS " + str + " ( id INTEGER PRIMARY KEY, msgSvrId LONG, offset INT, totalLen INT, bigImgPath TEXT, thumbImgPath TEXT, createtime INT, msglocalid INT, status INT, nettimes INT, reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text, hashdthumb int DEFAULT 0, iscomplete INT DEFAULT 1, origImgMD5 TEXT, compressType INT DEFAULT 0, midImgPath TEXT, forwardType INT DEFAULT 0, hevcPath TEXT, sendImgType INT DEFAULT 0, originSourceMd5 TEXT, msgTalker TEXT )", "CREATE INDEX IF NOT EXISTS " + str + "serverImgInfoIndex ON " + str + " ( msgSvrId ) ", "CREATE INDEX IF NOT EXISTS " + str + "serverImgInfoHdIndex ON " + str + " ( reserved1 ) ", "CREATE INDEX IF NOT EXISTS " + str + "msgLocalIdIndex ON " + str + " ( msglocalid ) ", "CREATE INDEX IF NOT EXISTS " + str + "iscomplete_index ON " + str + " ( iscomplete ) ", "CREATE INDEX IF NOT EXISTS " + str + "origImgMD5_index ON " + str + " ( origImgMD5 ) "};
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b4 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A4(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r24, android.widget.ImageView r25, java.lang.String r26, boolean r27, float r28, int r29, int r30, boolean r31, int r32, android.widget.ImageView r33, int r34, int r35, boolean r36, android.view.View r37) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.l0.A4(com.tencent.mm.storage.f9, android.widget.ImageView, java.lang.String, boolean, float, int, int, boolean, int, android.widget.ImageView, int, int, boolean, android.view.View):boolean");
    }

    public m11.b0 C1(java.lang.Long l17) {
        m11.b0 b0Var = new m11.b0();
        java.lang.String a17 = m11.k0.a(l17.longValue());
        android.database.Cursor E = this.f404279p.E(a17, null, "id=?", new java.lang.String[]{"" + l17}, null, null, null);
        if (E != null && E.moveToFirst()) {
            b0Var.b(E, y0(a17));
        }
        E.close();
        return b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    public boolean D0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, int i28, boolean z17) {
        java.lang.String str3;
        java.lang.String substring;
        android.graphics.BitmapFactory.Options n07;
        j15.d dVar;
        java.lang.String H;
        boolean z18;
        int i29;
        int i37;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.System.currentTimeMillis();
        java.lang.String F2 = F2(f9Var, str2, false, true, z17);
        boolean z27 = 0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(F2)) {
            return false;
        }
        if (F2.endsWith("hd")) {
            str3 = F2;
            substring = F2.substring(0, F2.length() - 2);
        } else {
            substring = F2;
            str3 = F2.concat("hd");
        }
        if (com.p314xaae8f345.mm.vfs.w6.k(str3) > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "hdThumbPath exists, return true");
            synchronized (this.f404278o) {
                java.lang.String j17 = (!android.text.TextUtils.isEmpty(str2) || f9Var == null) ? str2 : bm5.z.j(bm5.y.a(f9Var, bm5.f0.f104097i));
                if (((java.util.HashMap) this.f404278o).containsKey(j17) && !((java.lang.String) ((java.util.HashMap) this.f404278o).get(j17)).endsWith("hd")) {
                    ((java.util.HashMap) this.f404278o).put(j17, str3);
                }
            }
            return true;
        }
        float g17 = i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        android.graphics.BitmapFactory.Options n08 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(substring);
        if (n08 == null || n08.outWidth <= 0 || n08.outHeight <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(111L, 185L, 1L, false);
            if (com.p314xaae8f345.mm.vfs.w6.k(substring) > 0) {
                return false;
            }
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "createHDThumbNail old op is invaild but len is 0 need recreate[%s, %d, %d]", options, java.lang.Integer.valueOf(options.outWidth), java.lang.Integer.valueOf(options.outHeight));
            g0Var.mo68477x336bdfd8(111L, 183L, 1L, false);
            n08 = options;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (n08.outWidth == 0) {
            n08.outWidth = i19;
        }
        if (n08.outHeight == 0) {
            n08.outHeight = i27;
        }
        if (!((n08.outWidth == 0 || n08.outHeight == 0) ? false : true)) {
            try {
                dVar = new j15.d();
                java.lang.String j18 = f9Var.j();
                if (j18 == null) {
                    j18 = "";
                }
                dVar.m126728xdc93280d(j18);
                H = dVar.o().H();
            } catch (java.lang.Exception unused) {
            }
            if (H != null) {
                int length = H.length();
                int i38 = 0;
                while (true) {
                    if (i38 >= length) {
                        z18 = true;
                        break;
                    }
                    int codePointAt = H.codePointAt(i38);
                    if (!java.lang.Character.isWhitespace(codePointAt)) {
                        z18 = false;
                        break;
                    }
                    i38 += java.lang.Character.charCount(codePointAt);
                }
                if (!z18) {
                    n08.outWidth = dVar.o().I();
                    n08.outHeight = dVar.o().F();
                    if (!(n08.outWidth == 0 && n08.outHeight != 0) && (n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str)) != null) {
                        o70.f aj6 = ((v70.b0) ((xs.f1) i95.n0.c(xs.f1.class))).aj(n07.outWidth, n07.outHeight);
                        n08.outWidth = aj6.f424764a;
                        n08.outHeight = aj6.f424765b;
                    }
                }
            }
            n08.outWidth = dVar.o().q();
            n08.outHeight = dVar.o().n();
            if (!(n08.outWidth == 0 && n08.outHeight != 0)) {
                o70.f aj62 = ((v70.b0) ((xs.f1) i95.n0.c(xs.f1.class))).aj(n07.outWidth, n07.outHeight);
                n08.outWidth = aj62.f424764a;
                n08.outHeight = aj62.f424765b;
            }
        }
        int i39 = (int) (n08.outWidth * g17 * 1.25f);
        int i47 = (int) (n08.outHeight * g17 * 1.25f);
        float f17 = i39;
        float f18 = g17 * 160.0f;
        if (f17 >= f18 || i47 >= f18) {
            float f19 = i47 > i39 ? f18 / i47 : f18 / f17;
            i29 = (int) (i47 * f19);
            i37 = (int) (f17 * f19);
        } else {
            i37 = i39;
            i29 = i47;
        }
        try {
            boolean y17 = i18 == 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.y(str, i29, i37, android.graphics.Bitmap.CompressFormat.JPEG, 80, str3, true, new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(), new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(), true, i28) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.z(str, i29, i37, android.graphics.Bitmap.CompressFormat.JPEG, 80, str3, true, new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(), new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(), true, true, i28);
            java.lang.System.currentTimeMillis();
            z27 = substring;
            java.lang.String str4 = str3;
            u0(f9Var, z27, true, i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true, false, true, i17, false);
            if (y17) {
                synchronized (this.f404278o) {
                    java.lang.String j19 = (!android.text.TextUtils.isEmpty(str2) || f9Var == null) ? str2 : bm5.z.j(bm5.y.a(f9Var, bm5.f0.f104097i));
                    if (((java.util.HashMap) this.f404278o).containsKey(j19) && !((java.lang.String) ((java.util.HashMap) this.f404278o).get(j19)).endsWith("hd")) {
                        ((java.util.HashMap) this.f404278o).put(j19, str4);
                    }
                }
                zz.b bj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(str4, 3, null, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "check dup, ret:%s, hit:%s, copyRes:%s, replaceRes:%s", java.lang.Integer.valueOf(bj6.f559224a), java.lang.Boolean.valueOf(bj6.f559225b), java.lang.Boolean.valueOf(bj6.f559227d), java.lang.Long.valueOf(bj6.f559228e));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 184L, 1L, false);
            }
            return y17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 184L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "create hd thumbnail failed. %s", e17.toString());
            return z27;
        }
    }

    public java.lang.String D2(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, boolean z17) {
        return F2(f9Var, str, false, z17, false);
    }

    public final android.database.Cursor D3(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return this.f404279p.E(str, strArr, str2, strArr2, str3, str4, str5);
    }

    public java.lang.String F2(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        java.lang.String mj6;
        java.lang.String j17 = (!android.text.TextUtils.isEmpty(str) || f9Var == null) ? str : bm5.z.j(bm5.y.a(f9Var, bm5.f0.f104097i));
        java.util.Map map = this.f404278o;
        if (j17 == null || !((java.util.HashMap) map).containsKey(j17)) {
            mj6 = z17 ? j17 : ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(f9Var, str, z18);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mj6)) {
                ((java.util.HashMap) map).put(j17, mj6);
            }
        } else {
            mj6 = (java.lang.String) ((java.util.HashMap) map).get(j17);
        }
        if (f9Var != null) {
            new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var.m124847x74d37ac6(), f9Var.Q0()).m66995x9616526c();
        }
        return mj6;
    }

    public int F4(java.lang.Long l17, m11.b0 b0Var) {
        int p17;
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        if (android.text.TextUtils.isEmpty(b0Var.f404178m)) {
            b0Var.y("");
        }
        android.content.ContentValues c17 = b0Var.c();
        if (c17.size() == 0) {
            p17 = 1;
        } else {
            p17 = this.f404279p.p(m11.k0.a(l17.longValue()), c17, "id=?", new java.lang.String[]{"" + l17});
        }
        pt0.e0 e0Var = pt0.f0.f439742b1;
        if (e0Var.d() && c17.containsKey("msglocalid") && c17.containsKey("msgSvrId") && b0Var.f404180o <= 0 && b0Var.f404167b != 0) {
            java.lang.String p18 = e0Var.p(new java.lang.Throwable());
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
            c6754x4f2fd58c.p("imgInfo_check_id");
            c6754x4f2fd58c.u(p18);
            c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
            c6754x4f2fd58c.f140814j = b0Var.f404167b;
            c6754x4f2fd58c.f140813i = b0Var.f404180o;
            c6754x4f2fd58c.k();
        }
        pt0.p.G6(b0Var.f404180o, b0Var.f404178m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "update last :%d values : %s %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - valueOf.longValue()), c17.toString(), java.lang.Integer.valueOf(p17));
        if (p17 != -1) {
            b0Var.a();
            m145262xf35bbb4();
        }
        return p17;
    }

    public java.lang.String G2(java.lang.String str, m11.b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        if (b0Var.j()) {
            android.database.Cursor D3 = D3(m11.k0.b(str), new java.lang.String[]{"bigImgPath"}, "id=? and totalLen = offset", new java.lang.String[]{"" + b0Var.f404182q}, null, null, null);
            r0 = D3.moveToFirst() ? D3.getString(0) : null;
            D3.close();
        }
        return r0;
    }

    public java.lang.String J0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, byte[] bArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "save dir thumb error, thumbBuf is null");
            return null;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.p786x600aa8b.e.b(bArr, 0, bArr.length, options);
        if (options.outWidth < 0 || options.outHeight < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "Bad thumbBuf, perhaps it's not complete or damaged ??");
            return null;
        }
        java.lang.String W0 = W0();
        java.lang.String bj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.f0.f104097i, W0, "th_", "", true, true);
        com.p314xaae8f345.mm.vfs.w6.h(bj6);
        com.p314xaae8f345.mm.vfs.w6.S(bj6, bArr, 0, bArr.length);
        return "THUMBNAIL_DIRPATH://th_" + W0;
    }

    public android.graphics.Bitmap J3(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.j0(D2(f9Var, str, true), 0, 0, i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
    }

    public m11.b0 K1(java.lang.String str, long j17, long j18) {
        m11.b0 T1 = T1(str, j17);
        if (T1 == null || T1.f404166a == 0) {
            T1 = b2(str, j18);
            if (T1.f404166a == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "deleteByMsg can't find correspond imgInfo");
                return null;
            }
        }
        return T1;
    }

    public java.lang.String K3(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, byte[] bArr, int i17, android.graphics.Bitmap.CompressFormat compressFormat) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "save dir thumb error, thumbBuf is null");
            return null;
        }
        java.lang.String W0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? W0() : str;
        java.lang.String bj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.f0.f104097i, W0, "th_", "", true, true);
        try {
            int length = bArr.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(bArr);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/modelimage/ImgInfoStorage", "saveDirThumb", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;[BILandroid/graphics/Bitmap$CompressFormat;)Ljava/lang/String;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "com/tencent/mm/modelimage/ImgInfoStorage", "saveDirThumb", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;[BILandroid/graphics/Bitmap$CompressFormat;)Ljava/lang/String;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(decodeByteArray, i17, compressFormat, bj6, true);
            return "THUMBNAIL_DIRPATH://th_" + W0;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "save bitmap to image error, %s", e17);
            return O3(f9Var, bArr, true, compressFormat);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "save bitmap to image error, %s", e18);
            return O3(f9Var, bArr, true, compressFormat);
        }
    }

    public java.lang.String L0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, bm5.f0 f0Var, byte[] bArr, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "directSaveThumbBufForAppMsg save dir thumb error, thumbBuf is null");
            return null;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.p786x600aa8b.e.b(bArr, 0, bArr.length, options);
        if (options.outWidth < 0 || options.outHeight < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "directSaveThumbBufForAppMsg Bad thumbBuf, perhaps it's not complete or damaged ??");
            return null;
        }
        java.lang.String W0 = (str == null || android.text.TextUtils.isEmpty(str)) ? W0() : str;
        java.lang.String bj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, f0Var, W0, "msgth_", "", true, true);
        com.p314xaae8f345.mm.vfs.w6.h(bj6);
        com.p314xaae8f345.mm.vfs.w6.S(bj6, bArr, 0, bArr.length);
        return o1(W0);
    }

    public void M4() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = m11.k0.f404260b;
        java.util.Iterator it = m11.k0.f404259a.iterator();
        while (it.hasNext()) {
            m11.j0 j0Var = (m11.j0) it.next();
            java.util.concurrent.atomic.AtomicLong atomicLong = j0Var.f404256e;
            android.database.Cursor f17 = this.f404279p.f("SELECT max(id) FROM " + j0Var.f404252a, null, 2);
            long j17 = f17.moveToFirst() ? f17.getLong(0) : 0L;
            f17.close();
            long j18 = o4Var2.getLong("img." + j0Var.f404252a, -1L);
            if (!j0Var.f404252a.equals("ImgInfo2") || (j18 <= j17 + 100000000 && j17 <= 100000000 + j18 && j18 <= 2147483647L)) {
                o4Var = o4Var2;
            } else {
                o4Var = o4Var2;
                ((ku5.t0) ku5.t0.f394148d).h(new m11.g0(this, j17, j18), "report_error_img_id");
            }
            long max = java.lang.Math.max(j18, j17);
            synchronized (this) {
                if (max > atomicLong.get()) {
                    atomicLong.set(max);
                }
            }
            qt0.b bVar = qt0.b.f448024a;
            l75.k0 k0Var = this.f404279p;
            java.lang.String str = j0Var.f404252a;
            bVar.b(new qt0.e(k0Var, new java.lang.String[]{"CREATE INDEX IF NOT EXISTS " + str + "msgLocalIdTalkerIndex ON " + str + " ( msglocalid,msgTalker ) "}, j0Var.f404252a, "imginfo", 0));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "[updateLatestImgID] table=%s, loading new img id=%s", j0Var.f404252a, java.lang.Long.valueOf(atomicLong.get()));
            o4Var2 = o4Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0133, code lost:
    
        if (r14 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String N3(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r29, byte[] r30, int r31, android.graphics.Bitmap.CompressFormat r32, int r33, int r34, int r35, java.lang.String r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.l0.N3(com.tencent.mm.storage.f9, byte[], int, android.graphics.Bitmap$CompressFormat, int, int, int, java.lang.String, boolean):java.lang.String");
    }

    public android.graphics.Bitmap O2(long j17, java.lang.String str, int i17, int i18, int i19, boolean z17) {
        java.lang.String str2;
        if (z17) {
            str2 = "location_map_image_key_from_" + j17;
        } else {
            str2 = "location_map_image_key_to_" + j17;
        }
        kk.j jVar = this.f404271e;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).i(str2);
        if (bitmap == null || bitmap.isRecycled()) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f274597a;
            bitmap = null;
            if (str == null || str.equals("") || i17 < 0 || i18 < 0 || i19 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BitmapUtil", "createLocation fail. srcResId or maskResId is null,or width/height <0");
            } else {
                android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1));
                java.util.WeakHashMap weakHashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.t.f274510a;
                if (G != null && !G.isRecycled()) {
                    java.lang.System.currentTimeMillis();
                    android.graphics.Bitmap m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(i18, i19, android.graphics.Bitmap.Config.ARGB_8888, false);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.H0(m17);
                    android.graphics.Canvas canvas = new android.graphics.Canvas(m17);
                    G.getWidth();
                    G.getHeight();
                    canvas.drawBitmap(G, (android.graphics.Rect) null, new android.graphics.Rect(0, 0, i18, i19), new android.graphics.Paint());
                    java.lang.System.currentTimeMillis();
                    bitmap = i17 == 0 ? m17 : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.p(m17, i17);
                }
            }
            ((jt0.i) jVar).j(str2, bitmap);
        }
        return bitmap;
    }

    public java.lang.String O3(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, byte[] bArr, boolean z17, android.graphics.Bitmap.CompressFormat compressFormat) {
        return v4(f9Var, bArr, compressFormat, false, z17 ? 128 : 120, z17 ? 128 : 120);
    }

    public java.lang.String P0(java.lang.String str) {
        return ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ai(str, 1);
    }

    public m11.b0 P1(java.lang.Long l17) {
        m11.b0 C1 = C1(l17);
        if (C1.f404166a != l17.longValue()) {
            return null;
        }
        return C1;
    }

    public m11.b0 S1(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        m11.b0 T1 = T1(f9Var.Q0(), f9Var.m124847x74d37ac6());
        if (T1 == null || T1.f404166a == 0) {
            T1 = b2(f9Var.Q0(), f9Var.I0());
            if (T1.f404166a == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "deleteByMsg can't find correspond imgInfo");
                return null;
            }
        }
        return T1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0323 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String S3(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r29, byte[] r30, int r31, android.graphics.Bitmap.CompressFormat r32, int r33, float r34, int r35, java.lang.String r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.l0.S3(com.tencent.mm.storage.f9, byte[], int, android.graphics.Bitmap$CompressFormat, int, float, int, java.lang.String, boolean):java.lang.String");
    }

    public m11.b0 T1(java.lang.String str, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String b17 = m11.k0.b(str);
        if (pt0.p.B3(b17)) {
            android.database.Cursor D3 = D3(b17, null, "msglocalid=? AND msgTalker=?", new java.lang.String[]{"" + j17, str}, null, null, null);
            if (D3.moveToLast()) {
                m11.b0 b0Var = new m11.b0();
                b0Var.b(D3, y0(b17));
                arrayList.add(b0Var);
            }
            D3.close();
        } else {
            android.database.Cursor D32 = D3(b17, null, "msglocalid=?", new java.lang.String[]{"" + j17}, null, null, null);
            if (D32.moveToLast()) {
                m11.b0 b0Var2 = new m11.b0();
                b0Var2.b(D32, y0(b17));
                arrayList.add(b0Var2);
            }
            D32.close();
        }
        return arrayList.isEmpty() ? new m11.b0() : (m11.b0) arrayList.get(0);
    }

    public java.util.List V2(int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = m11.k0.f404259a.iterator();
        while (it.hasNext()) {
            android.database.Cursor d17 = this.f404279p.d(false, ((m11.j0) it.next()).f404252a, new java.lang.String[]{dm.i4.f66865x76d1ec5a, "msgSvrId", "msglocalid"}, "msgTalker IS NULL", new java.lang.String[0], null, null, null, i17 + "", c26987xeef691ab);
            while (d17.moveToNext()) {
                m11.b0 b0Var = new m11.b0();
                long j17 = d17.getLong(1);
                long j18 = d17.getLong(2);
                b0Var.u(d17.getLong(0));
                if (j17 != 0) {
                    b0Var.x(j17);
                }
                if (j18 > 0) {
                    b0Var.w(j18);
                }
                arrayList.add(b0Var);
            }
            d17.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "getNonTalkers, duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", size = " + arrayList.size());
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String V3(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r20, byte[] r21, boolean r22, android.graphics.Bitmap.CompressFormat r23, boolean r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.l0.V3(com.tencent.mm.storage.f9, byte[], boolean, android.graphics.Bitmap$CompressFormat, boolean, java.lang.String):java.lang.String");
    }

    public m11.b0 X1(long j17) {
        m11.b0 b0Var = new m11.b0();
        android.database.Cursor D3 = D3("ImgInfo2", null, "msgSvrId=?", new java.lang.String[]{"" + j17}, null, null, null);
        if (D3.moveToFirst()) {
            b0Var.b(D3, false);
        }
        D3.close();
        return b0Var;
    }

    public final java.lang.String Y2(java.lang.String str, java.lang.String str2, int i17) {
        m11.b0 h27 = h2(str, m11.c0.a(str2), i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h27.f404172g)) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, h27.f404180o);
        java.lang.String mj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).mj(Li, h27.f404172g, true);
        if (com.p314xaae8f345.mm.vfs.w6.j(mj6)) {
            return mj6;
        }
        return null;
    }

    public m11.b0 b2(java.lang.String str, long j17) {
        m11.b0 b0Var = new m11.b0();
        java.lang.String b17 = m11.k0.b(str);
        android.database.Cursor D3 = D3(b17, null, "msgSvrId=?", new java.lang.String[]{"" + j17}, null, null, null);
        if (D3.moveToFirst()) {
            b0Var.b(D3, y0(b17));
        }
        D3.close();
        return b0Var;
    }

    public android.graphics.Bitmap b3(java.lang.String str, float f17, android.content.Context context, int i17) {
        int i18;
        int i19;
        android.graphics.Bitmap bitmap = null;
        if (str == null || str.length() <= 0) {
            return null;
        }
        java.lang.String trim = str.trim();
        kk.j jVar = this.f404271e;
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) ((jt0.i) jVar).i(trim);
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            return bitmap2;
        }
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(trim, f17);
        if (a17 == null) {
            return a17;
        }
        int width = a17.getWidth();
        int height = a17.getHeight();
        if (width >= height) {
            i19 = java.lang.Math.round(f17 * 150);
            i18 = (int) ((height / width) * i19);
        } else {
            int round = java.lang.Math.round(f17 * 150);
            int i27 = (int) ((width / height) * round);
            i18 = round;
            i19 = i27;
        }
        if (i19 <= 0 || i18 <= 0 || i19 > 2048 || i18 > 2048) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "getVideoThumb, error Scale Size %d*%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 188L, 1L, false);
        } else {
            try {
                bitmap = android.graphics.Bitmap.createScaledBitmap(a17, i19, i18, true);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "getVideoThumb, Bitmap.createScaledBitmap Exception:%s", e17.getMessage());
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 188L, 1L, false);
            }
        }
        android.graphics.Bitmap p17 = i17 != -1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.p(bitmap, i17) : bitmap;
        if (a17 != p17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "[getVideoThumb] bitmap:%s", a17.toString());
            a17.recycle();
        }
        ((jt0.i) jVar).j(trim, p17);
        return p17;
    }

    public android.widget.FrameLayout.LayoutParams b5(float f17, int i17, int i18, int i19) {
        int i27;
        float f18;
        if (i17 >= 160 || i18 >= 160) {
            float f19 = 160.0f / (i18 > i17 ? i18 : i17);
            i27 = (int) ((((int) (i17 * f19)) > 0 ? r6 : 120) * f17);
            f18 = (((int) (i18 * f19)) > 0 ? r7 : 75) * f17;
        } else {
            if (i17 <= 0) {
                i17 = 120;
            }
            i27 = (int) (i17 * f17 * 1.25f);
            if (i18 <= 0) {
                i18 = 75;
            }
            f18 = i18 * f17 * 1.25f;
        }
        int i28 = (int) f18;
        float f27 = f17 * 60.0f;
        if (i27 < f27) {
            i27 = (int) f27;
        }
        if (i28 < f27) {
            i28 = (int) f27;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i27, i28);
        if (i19 == 0) {
            layoutParams.gravity = 5;
        } else if (i19 == 1) {
            layoutParams.gravity = 3;
        }
        return layoutParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m11.b0 d1(k70.h0 r37, boolean r38, long r39) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.l0.d1(k70.h0, boolean, long):m11.b0");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:1|(1:334)(1:4)|5|(4:7|(1:332)(1:11)|(1:13)|14)(1:333)|15|(1:17)(1:331)|18|(1:20)(1:330)|21|(1:23)(1:329)|24|(1:26)(1:328)|27|(1:327)(1:30)|31|(1:33)|34|(1:326)(2:39|(2:41|(3:(2:44|(1:46)(2:47|(1:49)(2:50|(1:56))))|57|(2:59|60)(1:62))(16:63|64|65|66|(1:68)(1:322)|69|70|71|72|73|(1:75)|76|(1:317)|80|(5:82|(1:315)(2:86|(1:88)(12:94|(1:314)(1:106)|107|(6:207|(12:209|(1:211)(1:304)|212|(1:303)(1:220)|221|(2:223|(1:225))|226|(2:297|298)|228|(17:233|234|236|237|238|(1:293)|242|(1:292)|(1:246)(1:291)|(1:248)(1:290)|(1:289)(1:251)|(1:288)(2:255|(1:259)(1:258))|260|261|(2:263|(4:265|(1:267)(1:286)|268|(3:270|(2:272|(6:276|(1:278)|279|(1:281)|282|(1:284)))|232)(1:285)))|287|(0)(0))(1:230)|231|232)(2:305|(5:307|228|(0)(0)|231|232)(2:308|(2:310|311)(1:(1:313))))|299|(0)(0)|231|232)(13:111|(1:206)(1:114)|(1:116)(1:205)|117|(1:119)(1:204)|120|(1:122)(5:182|(1:203)(1:191)|192|(1:194)(1:202)|(5:(2:197|(1:199)(1:200))(1:201)|124|(1:181)(3:128|(1:130)|131)|132|(2:134|135)(1:136)))|123|124|(1:126)|181|132|(0)(0))|137|(1:139)(1:180)|(1:141)(1:179)|142|(1:144)(1:178)|145|(1:147)(1:177)|(2:155|(8:159|(3:161|(1:163)(1:175)|164)(1:176)|165|(1:167)|168|(1:170)(1:174)|171|(1:173)))))|89|(1:91)(1:93)|92)|316)))|325|64|65|66|(0)(0)|69|70|71|72|73|(0)|76|(1:78)|317|80|(0)|316|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x02b6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x02ba, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "get useopt :%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(r0));
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x02b8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x02b9, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0573 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0305  */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String f1(k70.h0 r58, java.lang.String r59, boolean r60, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 r61, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 r62, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 r63, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 r64, java.lang.String r65, kk.c r66) {
        /*
            Method dump skipped, instructions count: 2474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.l0.f1(k70.h0, java.lang.String, boolean, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PString, java.lang.String, kk.c):java.lang.String");
    }

    public long f3(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, byte[] bArr, int i17, long j17, boolean z17, java.lang.String str2, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2) {
        java.lang.String str3 = "SERVERID://" + j17;
        java.lang.String g17 = kk.k.g(str3.getBytes());
        java.lang.String bj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.f0.f104097i, g17, "th_", "", true, false);
        if (bArr != null && bArr.length >= 0) {
            android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr);
            if (G == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "create decodeByteArray failed: ".concat(new java.lang.String(bArr)));
            }
            if (!z17 && G != null) {
                try {
                    android.graphics.Bitmap V = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.V(G, 120, 120, false);
                    c19767x257d7f.f38864x6ac9171 = V.getWidth();
                    c19767x257d7f2.f38864x6ac9171 = V.getHeight();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(V, 90, android.graphics.Bitmap.CompressFormat.JPEG, bj6, true);
                } catch (java.io.IOException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "create thumbnail from byte failed: " + g17 + " " + new java.lang.String(bArr));
                }
            }
        }
        m11.b0 b0Var = new m11.b0();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("")) {
            b0Var.z(0);
            b0Var.F(0);
            str3 = "";
        }
        b0Var.u(n1(str));
        b0Var.m(str3);
        b0Var.E("THUMBNAIL_DIRPATH://th_" + g17);
        c19772x1c2cd081.f38869x6ac9171 = b0Var.f404172g;
        if (z17) {
            b0Var.x(0L);
            b0Var.o(1);
        } else {
            b0Var.x(j17);
            b0Var.o(0);
        }
        b0Var.n(str2);
        b0Var.p((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        b0Var.y(str);
        long t37 = t3(str, dm.i4.f66865x76d1ec5a, b0Var);
        if (t37 != -1) {
            m145262xf35bbb4();
        }
        return t37;
    }

    public m11.b0 h2(java.lang.String str, java.lang.String str2, int i17) {
        m11.b0 b0Var = new m11.b0();
        java.lang.String b17 = m11.k0.b(str);
        android.database.Cursor E = this.f404279p.E(b17, null, "origImgMD5=? AND compressType=?", new java.lang.String[]{"" + str2, i17 + ""}, null, null, null);
        if (E.moveToFirst()) {
            b0Var.b(E, y0(b17));
        }
        E.close();
        return b0Var;
    }

    public boolean i1(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, long j17, byte[] bArr, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2) {
        java.lang.String g17 = kk.k.g(("SERVERID://" + j17).getBytes());
        java.lang.String bj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.f0.f104097i, g17, "th_", "", true, true);
        if (bArr != null) {
            android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr);
            if (G == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "create decodeByteArray failed: ".concat(new java.lang.String(bArr)));
                return false;
            }
            try {
                android.graphics.Bitmap V = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.V(G, 120, 120, false);
                c19767x257d7f.f38864x6ac9171 = V.getWidth();
                c19767x257d7f2.f38864x6ac9171 = V.getHeight();
                c19772x1c2cd081.f38869x6ac9171 = "THUMBNAIL_DIRPATH://th_" + g17;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(V, 90, android.graphics.Bitmap.CompressFormat.JPEG, bj6, true);
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "create thumbnail from byte failed: " + g17 + " " + new java.lang.String(bArr));
                return false;
            }
        }
        return true;
    }

    public java.lang.String j4(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, byte[] bArr, android.graphics.Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, int i27, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "[saveDirThumbWithCrop] save dir thumb error, thumbBuf is null");
            return null;
        }
        java.lang.String W0 = (str == null || android.text.TextUtils.isEmpty(str)) ? W0() : str;
        java.lang.String bj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, bm5.f0.f104097i, W0, "msgth_", "", true, true);
        try {
            android.graphics.Bitmap R = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.R(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr), i17, i18, i27);
            if (R != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(R, 90, compressFormat, bj6, true);
            }
            return o1(W0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(111L, 189L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "[saveDirThumbWithCrop] create thumbnail from byte failed: msgth_" + str + ", ex = " + e17.getMessage());
            return null;
        }
    }

    public java.lang.String k1() {
        return zo3.p.Ai() + "thumb/";
    }

    public m11.b0 k2(oi3.g gVar) {
        java.lang.String m75945x2fec8307 = gVar.m75945x2fec8307(gVar.f427150d + 3);
        int i17 = gVar.f427150d;
        m11.b0 T1 = T1(m75945x2fec8307, gVar.m75942xfb822ef2(i17 + 0));
        if (T1 == null || T1.f404166a == 0) {
            T1 = b2(gVar.m75945x2fec8307(i17 + 3), gVar.m75942xfb822ef2(i17 + 1));
            if (T1.f404166a == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "deleteByMsg can't find correspond imgInfo");
                return null;
            }
        }
        return T1;
    }

    public android.graphics.Bitmap m0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, float f17, boolean z17) {
        return s0(f9Var, str, false, f17, z17, false, false, -1);
    }

    public android.graphics.Bitmap n0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, boolean z17, float f17, boolean z18, boolean z19) {
        return s0(f9Var, str, z17, f17, z18, z19, false, 0);
    }

    public long n1(java.lang.String str) {
        m11.j0 c17 = m11.k0.c(str);
        long incrementAndGet = c17.f404256e.incrementAndGet();
        m11.k0.f404260b.putLong("img." + c17.f404252a, incrementAndGet);
        return incrementAndGet;
    }

    public java.lang.String o1(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("THUMBNAIL_APPMSG_DIR://msgth_");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = W0();
        }
        sb6.append(str);
        return sb6.toString();
    }

    public final java.lang.String o2(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, bm5.f0 f0Var, java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, f0Var, str, "", "");
        }
        java.lang.String trim = str.trim();
        java.lang.String str2 = "";
        if (trim.startsWith("THUMBNAIL://")) {
            try {
                trim = C1(java.lang.Long.valueOf(trim.substring(12))).f404172g;
            } catch (java.lang.NumberFormatException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "read img buf failed: " + e17.getMessage());
                return null;
            }
        } else if (trim.startsWith("THUMBNAIL_DIRPATH://")) {
            trim = trim.substring(23);
            str2 = "th_";
        }
        return ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, f0Var, trim, str2, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(r14) != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String p1(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r14) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.l0.p1(com.tencent.mm.storage.f9):java.lang.String");
    }

    public final android.graphics.Bitmap s0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, boolean z17, float f17, boolean z18, boolean z19, boolean z27, int i17) {
        return u0(f9Var, str, z17, f17, z18, z19, z27, i17, true);
    }

    public long t3(java.lang.String str, java.lang.String str2, m11.b0 b0Var) {
        java.lang.String b17 = m11.k0.b(str);
        if (android.text.TextUtils.isEmpty(b0Var.f404178m)) {
            b0Var.y("");
        }
        android.content.ContentValues c17 = b0Var.c();
        pt0.e0 e0Var = pt0.f0.f439742b1;
        if (e0Var.d() && c17.containsKey("msglocalid") && c17.containsKey("msgSvrId") && b0Var.f404180o <= 0 && b0Var.f404167b != 0) {
            java.lang.String p17 = e0Var.p(new java.lang.Throwable());
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
            c6754x4f2fd58c.p("imgInfo_check_id");
            c6754x4f2fd58c.u(p17);
            c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
            c6754x4f2fd58c.f140814j = b0Var.f404167b;
            c6754x4f2fd58c.f140813i = b0Var.f404180o;
            c6754x4f2fd58c.k();
        }
        long l17 = this.f404279p.l(b17, str2, c17);
        if (l17 != -1) {
            b0Var.a();
        }
        if (!z65.c.f551991d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "insert img,table:%s result:%d, localId:%d, msgLocalId:%d, msgSvrId:%d, hdID:%d", b17, java.lang.Long.valueOf(l17), java.lang.Long.valueOf(b0Var.f404166a), java.lang.Long.valueOf(b0Var.f404180o), java.lang.Long.valueOf(b0Var.f404167b), java.lang.Long.valueOf(b0Var.f404182q));
        }
        pt0.p.G6(b0Var.f404180o, str);
        return l17;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap u0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r15, java.lang.String r16, boolean r17, float r18, boolean r19, boolean r20, boolean r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.l0.u0(com.tencent.mm.storage.f9, java.lang.String, boolean, float, boolean, boolean, boolean, int, boolean):android.graphics.Bitmap");
    }

    public final long v3(java.lang.String str, java.lang.String str2, m11.b0 b0Var) {
        java.lang.String b17 = m11.k0.b(str);
        android.content.ContentValues c17 = b0Var.c();
        pt0.e0 e0Var = pt0.f0.f439742b1;
        if (e0Var.d() && c17.containsKey("msglocalid") && c17.containsKey("msgSvrId") && b0Var.f404180o <= 0 && b0Var.f404167b != 0) {
            java.lang.String p17 = e0Var.p(new java.lang.Throwable());
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
            c6754x4f2fd58c.p("imgInfo_check_id");
            c6754x4f2fd58c.u(p17);
            c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
            c6754x4f2fd58c.f140814j = b0Var.f404167b;
            c6754x4f2fd58c.f140813i = b0Var.f404180o;
            c6754x4f2fd58c.k();
        }
        long v17 = this.f404279p.v(b17, dm.i4.f66865x76d1ec5a, c17);
        if (v17 != -1) {
            b0Var.a();
        }
        if (!z65.c.f551991d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "insert img, table:%s result:%d, localId:%d, msgLocalId:%d, msgSvrId:%d, hdID:%d", b17, java.lang.Long.valueOf(v17), java.lang.Long.valueOf(b0Var.f404166a), java.lang.Long.valueOf(b0Var.f404180o), java.lang.Long.valueOf(b0Var.f404167b), java.lang.Long.valueOf(b0Var.f404182q));
        }
        pt0.p.G6(b0Var.f404180o, str);
        return v17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String v4(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r22, byte[] r23, android.graphics.Bitmap.CompressFormat r24, boolean r25, int r26, int r27) {
        /*
            r21 = this;
            java.lang.String r1 = "create thumbnail from byte failed: th_"
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(r23)
            java.lang.String r2 = "MicroMsg.ImgInfoStorage"
            r3 = 0
            if (r0 == 0) goto L12
            java.lang.String r0 = "save dir thumb error, thumbBuf is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0)
            return r3
        L12:
            java.lang.String r12 = W0()
            java.lang.Class<tg3.u0> r0 = tg3.u0.class
            i95.m r0 = i95.n0.c(r0)
            tg3.u0 r0 = (tg3.u0) r0
            bm5.f0 r6 = bm5.f0.f104097i
            java.lang.String r8 = "th_"
            java.lang.String r9 = ""
            r10 = 1
            r11 = 1
            r4 = r0
            k90.b r4 = (k90.b) r4
            r5 = r22
            r7 = r12
            java.lang.String r0 = r4.bj(r5, r6, r7, r8, r9, r10, r11)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r5 = ".tmp"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 0
            java.io.OutputStream r6 = com.p314xaae8f345.mm.vfs.w6.K(r4, r5)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            r7 = r23
            r6.write(r7)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            r6.flush()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            if (r25 == 0) goto L56
            android.graphics.Bitmap r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(r4, r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
            goto L5e
        L56:
            r7 = r26
            r8 = r27
            android.graphics.Bitmap r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(r4, r8, r7, r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
        L5e:
            if (r5 == 0) goto L68
            r7 = 90
            r8 = 1
            r9 = r24
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(r5, r7, r9, r0, r8)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
        L68:
            boolean r0 = com.p314xaae8f345.mm.vfs.w6.j(r4)
            if (r0 == 0) goto L71
            com.p314xaae8f345.mm.vfs.w6.h(r4)
        L71:
            r6.close()     // Catch: java.lang.Exception -> L74
        L74:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "THUMBNAIL_DIRPATH://th_"
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            return r0
        L83:
            r0 = move-exception
            r3 = r6
            goto Lc3
        L86:
            r0 = move-exception
            goto L8c
        L88:
            r0 = move-exception
            goto Lc3
        L8a:
            r0 = move-exception
            r6 = r3
        L8c:
            com.tencent.mm.plugin.report.service.g0 r13 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE     // Catch: java.lang.Throwable -> L83
            r14 = 111(0x6f, double:5.5E-322)
            r16 = 189(0xbd, double:9.34E-322)
            r18 = 1
            r20 = 0
            r13.mo68477x336bdfd8(r14, r16, r18, r20)     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L83
            r5.append(r12)     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = ", ex = "
            r5.append(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L83
            r5.append(r0)     // Catch: java.lang.Throwable -> L83
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L83
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L83
            boolean r0 = com.p314xaae8f345.mm.vfs.w6.j(r4)
            if (r0 == 0) goto Lbd
            com.p314xaae8f345.mm.vfs.w6.h(r4)
        Lbd:
            if (r6 == 0) goto Lc2
            r6.close()     // Catch: java.lang.Exception -> Lc2
        Lc2:
            return r3
        Lc3:
            boolean r1 = com.p314xaae8f345.mm.vfs.w6.j(r4)
            if (r1 == 0) goto Lcc
            com.p314xaae8f345.mm.vfs.w6.h(r4)
        Lcc:
            if (r3 == 0) goto Ld1
            r3.close()     // Catch: java.lang.Exception -> Ld1
        Ld1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.l0.v4(com.tencent.mm.storage.f9, byte[], android.graphics.Bitmap$CompressFormat, boolean, int, int):java.lang.String");
    }

    public long w3(java.lang.String str, java.lang.String str2, long j17, int i17, boolean z17, java.lang.String str3, int i18) {
        java.lang.String str4 = "SERVERID://" + j17;
        java.lang.String g17 = kk.k.g(str4.getBytes());
        m11.b0 b0Var = new m11.b0();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = str4;
        } else {
            b0Var.z(i17);
            b0Var.F(i17);
        }
        b0Var.u(n1(str));
        b0Var.m(str2);
        b0Var.E("THUMBNAIL_DIRPATH://th_" + g17);
        if (z17) {
            b0Var.x(0L);
            b0Var.o(1);
        } else {
            b0Var.x(j17);
            b0Var.o(0);
        }
        b0Var.n(str3);
        b0Var.p((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        b0Var.y(str);
        if (i18 > 0) {
            b0Var.r(i18);
        }
        return t3(str, dm.i4.f66865x76d1ec5a, b0Var);
    }

    public final boolean y0(java.lang.String str) {
        if ("ImgInfo2".equals(str)) {
            return false;
        }
        return this.f404270d;
    }

    public java.lang.String y2(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, bm5.f0 f0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String bj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(f9Var, f0Var, str, str2, str3, true, false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bj6)) {
            return null;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(bj6) ? P0(bj6) : bj6;
    }

    public boolean y4(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.widget.ImageView imageView, java.lang.String str, float f17, int i17, int i18, boolean z17, int i19, android.widget.ImageView imageView2, int i27, int i28, boolean z18, android.view.View view) {
        return A4(f9Var, imageView, str, false, f17, i17, i18, z17, i19, imageView2, i27, i28, z18, view);
    }

    public boolean z0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18, int i19) {
        java.lang.String p17 = p1(f9Var);
        if (f9Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "createHDThumbNail %s %s %s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), f9Var.z0(), p17);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17)) {
            return false;
        }
        return D0(f9Var, p17, f9Var.z0(), i17, i18, 0, 0, i19, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m11.b0 z1(long r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.String r11 = m11.k0.a(r14)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r5 = 0
            java.lang.String r6 = "reserved1=?"
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r3.<init>()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r3.append(r14)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.String r14 = ""
            r3.append(r14)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.lang.String r14 = r3.toString()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r7[r0] = r14     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r13
            r4 = r11
            android.database.Cursor r14 = r3.D3(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            if (r14 == 0) goto L46
            boolean r15 = r14.moveToFirst()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L68
            if (r15 == 0) goto L46
            m11.b0 r15 = new m11.b0     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L68
            r15.<init>()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L68
            boolean r2 = r13.y0(r11)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L68
            r15.b(r14, r2)     // Catch: java.lang.Exception -> L3f java.lang.Throwable -> L68
            r2 = r15
            goto L46
        L3f:
            r2 = move-exception
            goto L52
        L41:
            r15 = move-exception
            r12 = r2
            r2 = r15
            r15 = r12
            goto L52
        L46:
            if (r14 == 0) goto L67
            r14.close()
            goto L67
        L4c:
            r15 = move-exception
            goto L6a
        L4e:
            r14 = move-exception
            r15 = r2
            r2 = r14
            r14 = r15
        L52:
            java.lang.String r3 = "MicroMsg.ImgInfoStorage"
            java.lang.String r4 = "Exception :%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L68
            r1[r0] = r2     // Catch: java.lang.Throwable -> L68
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L68
            if (r14 == 0) goto L66
            r14.close()
        L66:
            r2 = r15
        L67:
            return r2
        L68:
            r15 = move-exception
            r2 = r14
        L6a:
            if (r2 == 0) goto L6f
            r2.close()
        L6f:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.l0.z1(long):m11.b0");
    }

    public final void z3(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.view.View view, java.lang.String str, java.lang.String str2, float f17, boolean z17, int i17) {
        java.util.Set set;
        int i18;
        m11.i0 i0Var;
        int i19;
        int hashCode = str.hashCode();
        int hashCode2 = imageView.hashCode();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f404272f;
        java.util.Iterator it = arrayList.iterator();
        do {
            boolean hasNext = it.hasNext();
            set = this.f404276m;
            if (!hasNext) {
                ((java.util.HashMap) this.f404273g).put(java.lang.Integer.valueOf(hashCode2), new java.lang.ref.WeakReference(imageView));
                int i27 = 0;
                if (imageView2 != null) {
                    i18 = imageView2.hashCode();
                    ((java.util.HashMap) this.f404274h).put(java.lang.Integer.valueOf(i18), new java.lang.ref.WeakReference(imageView2));
                } else {
                    i18 = 0;
                }
                if (view != null) {
                    i27 = view.hashCode();
                    ((java.util.HashMap) this.f404275i).put(java.lang.Integer.valueOf(i27), new java.lang.ref.WeakReference(view));
                }
                arrayList.add(new m11.i0(hashCode2, str, i18, i27));
                java.util.HashSet hashSet = (java.util.HashSet) set;
                if (hashSet.contains(java.lang.Integer.valueOf(hashCode))) {
                    return;
                }
                hashSet.add(java.lang.Integer.valueOf(hashCode));
                gm0.j1.i();
                gm0.j1.e().j(new m11.f0(this, f9Var, str, f17, z17, i17, str2));
                return;
            }
            i0Var = (m11.i0) it.next();
            i19 = i0Var.f404243a;
        } while (hashCode2 != i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "setbitmapFromUri  [%d, %s] ", java.lang.Integer.valueOf(i19), i0Var.f404244b);
        i0Var.f404244b = str;
        java.util.HashSet hashSet2 = (java.util.HashSet) set;
        if (hashSet2.contains(java.lang.Integer.valueOf(hashCode))) {
            return;
        }
        hashSet2.add(java.lang.Integer.valueOf(hashCode));
        gm0.j1.i();
        gm0.j1.e().j(new m11.f0(this, f9Var, str, f17, z17, i17, str2));
    }
}

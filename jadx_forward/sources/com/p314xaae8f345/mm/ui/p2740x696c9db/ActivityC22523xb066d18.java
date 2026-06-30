package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.ShareImgUI */
/* loaded from: classes11.dex */
public class ActivityC22523xb066d18 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f291684w = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f291685d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f291686e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Intent f291687f = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f291688g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public int f291689h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f291690i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f291691m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.net.Uri f291692n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f291693o = null;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Intent f291694p = null;

    /* renamed from: q, reason: collision with root package name */
    public boolean f291695q = false;

    /* renamed from: r, reason: collision with root package name */
    public final int f291696r = 1;

    /* renamed from: s, reason: collision with root package name */
    public final int f291697s = 2;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f291698t = new com.p314xaae8f345.mm.ui.p2740x696c9db.q9(this);

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Boolean f291699u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f291700v = false;

    /* JADX WARN: Removed duplicated region for block: B:128:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a7(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18.a7(com.tencent.mm.ui.tools.ShareImgUI, boolean):void");
    }

    public static void b7(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d18, com.p314xaae8f345.mm.ui.p2740x696c9db.y9 y9Var, java.util.ArrayList arrayList) {
        activityC22523xb066d18.getClass();
        if (y9Var != null) {
            activityC22523xb066d18.runOnUiThread(new com.p314xaae8f345.mm.ui.p2740x696c9db.t9(activityC22523xb066d18, y9Var, arrayList));
        }
    }

    public static java.lang.String c7(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d18, android.net.Uri uri) {
        android.content.Intent intent;
        activityC22523xb066d18.getClass();
        if (uri == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "uri is null!");
            return null;
        }
        java.lang.String scheme = uri.getScheme();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(scheme)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "input uri error. %s", uri);
            return null;
        }
        if (scheme.equalsIgnoreCase("file")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "getFilePath : scheme is SCHEME_FILE");
            java.lang.String path = uri.getPath();
            java.lang.String f17 = q35.e.f(path);
            if (f17 != null) {
                return f17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "[-] getFilePath : fail, safePath is null.");
            throw new java.lang.IllegalAccessException("safePath is null while process path: " + path);
        }
        if (scheme.equalsIgnoreCase("content")) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "getFilePath : scheme is SCHEME_CONTENT: " + uri.toString());
                android.database.Cursor query = activityC22523xb066d18.getContentResolver().query(uri, null, null, null, null);
                if (query == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "getFilePath : fail, cursor is null");
                    return null;
                }
                if (query.getCount() > 0 && query.moveToFirst()) {
                    java.lang.String lowerCase = uri.toString().toLowerCase();
                    if (!lowerCase.startsWith("content://com.android.contacts/contacts/as_vcard") && !lowerCase.startsWith("content://com.android.contacts/contacts/as_multi_vcard") && !lowerCase.startsWith("content://com.mediatek.calendarimporter") && (((intent = activityC22523xb066d18.f291687f) == null || !intent.getType().equals("text/x-vcalendar")) && wo.v1.f529366m.f529287l != 1)) {
                        query.close();
                        java.lang.String J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J(activityC22523xb066d18, uri);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "Util.getFilePath ret:%s", J2);
                        return J2;
                    }
                    return activityC22523xb066d18.j7(uri, query);
                }
                query.close();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "getFilePath : fail, cursor getCount is 0 or moveToFirst fail");
                return null;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShareImgUI", e17, "SCHEME_CONTENT", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "unknown scheme");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean T6() {
        if (c01.d9.h() && !gm0.m.r()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareImgUI", "not login");
        this.f291687f = getIntent();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273980j || !getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("gprs_alert", true)) {
            k7();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public void X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p pVar, android.content.Intent intent) {
        if (pVar.ordinal() != 0) {
            finish();
            db5.f.k(this);
            return;
        }
        this.f291687f = intent;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SystemShareControlBitset"), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "now permission = %d", java.lang.Integer.valueOf(P));
        if ((P & 1) > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "now allowed to share to friend");
            finish();
            return;
        }
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "android.intent.extra.TEXT");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "postLogin, text = %s", l17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
            k7();
            return;
        }
        java.lang.String format = java.lang.String.format("weixin://dl/business/systemshare/?txt=%s", java.net.URLEncoder.encode(l17));
        m7();
        c01.d9.e().q(1200, this);
        c01.d9.e().a(1200, this);
        com.p314xaae8f345.mm.p957x53236a1b.h1 h1Var = new com.p314xaae8f345.mm.p957x53236a1b.h1(format, 15, null);
        c01.d9.e().g(h1Var);
        this.f291688g.add(h1Var);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean Y6(android.content.Intent intent) {
        return true;
    }

    public final void d7(android.content.Intent intent) {
        if (intent == null || !this.f291700v) {
            return;
        }
        intent.putExtra("Result_Recevier", new com.p314xaae8f345.mm.ui.p2740x696c9db.C22521x3d056be7(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper()), this.f291690i));
    }

    public final void e7(int i17) {
        if (i17 == 1) {
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.j49, 1).show();
        } else if (i17 != 2) {
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.j4b, 1).show();
        } else {
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.j48, 1).show();
        }
    }

    public final void f7(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "dealWithTextByOldWay");
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "android.intent.extra.TEXT");
        java.lang.String l18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(intent, "android.intent.extra.SUBJECT");
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11296xa95b008d(l17));
        c11286x34a5504.f33121x993583fc = l17;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req();
        req.f32866x7fa0d2de = null;
        req.f33049x38eb0007 = c11286x34a5504;
        android.os.Bundle bundle = new android.os.Bundle();
        req.mo48427x792022dd(bundle);
        bundle.putInt(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32808x6604d593, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a);
        bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8, "com.tencent.mm.openapi");
        bundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
        android.content.Intent o76 = o7(this, com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.class);
        o76.putExtra("Select_Conv_NextStep", o7(this, com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.class).putExtras(bundle).putExtra("animation_pop_in", true));
        if (!c01.d9.h() || gm0.m.r()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareImgUI", "not logged in, jump to simple login");
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(this, new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b.class), getIntent().addFlags(67108864));
            return;
        }
        c01.d9.e().q(837, this);
        c01.d9.e().a(837, this);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(l18 + "|" + l17);
        com.p314xaae8f345.mm.p957x53236a1b.c0 c0Var = new com.p314xaae8f345.mm.p957x53236a1b.c0(5, arrayList, m78512xb8359e85());
        gm0.j1.d().g(c0Var);
        this.f291688g.add(c0Var);
        m7();
        this.f291694p = o76;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g7(java.lang.String r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18.g7(java.lang.String, android.os.Bundle):void");
    }

    public final java.lang.String h7(java.lang.String str, android.net.Uri uri, boolean z17) {
        java.io.Closeable closeable;
        if (this.f291699u == null) {
            boolean z18 = true;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_share_img_use_fileprovider_copy_path, 1) != 1) {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                if (!z65.c.a()) {
                    z18 = false;
                }
            }
            this.f291699u = java.lang.Boolean.valueOf(z18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "getShareFilePath useCopyFilePath == " + this.f291699u);
        if (!this.f291699u.booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.r(10);
            return str;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.r(17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "getShareFilePath srcPath is exists and canRead, return srcPath:" + str);
            return str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.r(11);
        java.io.InputStream inputStream = null;
        java.io.OutputStream outputStream = null;
        inputStream = null;
        try {
            java.io.InputStream openInputStream = getContentResolver().openInputStream(uri);
            try {
                if (openInputStream != null) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    java.lang.String i76 = i7(str);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i76)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "getShareFilePath tmpPath == null , use srcPath:" + str);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.r(12);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(openInputStream);
                        return str;
                    }
                    if (com.p314xaae8f345.mm.vfs.w6.j(i76)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "getShareFilePath deleteFile:" + i76);
                        com.p314xaae8f345.mm.vfs.w6.h(i76);
                    }
                    outputStream = com.p314xaae8f345.mm.vfs.w6.K(i76, false);
                    byte[] bArr = new byte[4096];
                    long j17 = 0;
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        outputStream.write(bArr);
                        j17 += read;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "getShareFilePath copy cost(ms):" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "  size(KB):" + (((float) j17) / 1024.0f));
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(i76));
                    if (r6Var.m() && r6Var.h()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "getShareFilePath tmpFile can use:" + i76);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.r(13);
                        str = i76;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareImgUI", "getShareFilePath tmpFile can not use, use srcPath:" + str);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.r(14);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareImgUI", "getShareFilePath inputStream == null, copy fail, use srcPath:" + str);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.r(15);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(openInputStream);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(outputStream);
            } catch (java.lang.Exception e17) {
                e = e17;
                inputStream = openInputStream;
                closeable = null;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShareImgUI", e, "", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "getShareFilePath copy exception, use srcPath:" + str);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.r(16);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(closeable);
                    return str;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(closeable);
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                inputStream = openInputStream;
                closeable = null;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(closeable);
                throw th;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            closeable = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
            closeable = null;
        }
        return str;
    }

    public final java.lang.String i7(java.lang.String str) {
        return zo3.p.Vi() + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(java.lang.System.currentTimeMillis() + "_" + str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e6, code lost:
    
        if (r7 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0190, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01bc, code lost:
    
        if (r7 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018e, code lost:
    
        if (r7 == null) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01de A[Catch: Exception -> 0x01fb, TRY_ENTER, TryCatch #12 {Exception -> 0x01fb, blocks: (B:68:0x0186, B:70:0x018b, B:56:0x0190, B:61:0x01b4, B:63:0x01b9, B:52:0x01de, B:54:0x01e3), top: B:6:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e3 A[Catch: Exception -> 0x01fb, TRY_LEAVE, TryCatch #12 {Exception -> 0x01fb, blocks: (B:68:0x0186, B:70:0x018b, B:56:0x0190, B:61:0x01b4, B:63:0x01b9, B:52:0x01de, B:54:0x01e3), top: B:6:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b4 A[Catch: Exception -> 0x01fb, TRY_ENTER, TryCatch #12 {Exception -> 0x01fb, blocks: (B:68:0x0186, B:70:0x018b, B:56:0x0190, B:61:0x01b4, B:63:0x01b9, B:52:0x01de, B:54:0x01e3), top: B:6:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b9 A[Catch: Exception -> 0x01fb, TRY_LEAVE, TryCatch #12 {Exception -> 0x01fb, blocks: (B:68:0x0186, B:70:0x018b, B:56:0x0190, B:61:0x01b4, B:63:0x01b9, B:52:0x01de, B:54:0x01e3), top: B:6:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0186 A[Catch: Exception -> 0x01fb, TRY_ENTER, TryCatch #12 {Exception -> 0x01fb, blocks: (B:68:0x0186, B:70:0x018b, B:56:0x0190, B:61:0x01b4, B:63:0x01b9, B:52:0x01de, B:54:0x01e3), top: B:6:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018b A[Catch: Exception -> 0x01fb, TryCatch #12 {Exception -> 0x01fb, blocks: (B:68:0x0186, B:70:0x018b, B:56:0x0190, B:61:0x01b4, B:63:0x01b9, B:52:0x01de, B:54:0x01e3), top: B:6:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f2 A[Catch: Exception -> 0x01fa, TryCatch #15 {Exception -> 0x01fa, blocks: (B:92:0x01ed, B:85:0x01f2, B:87:0x01f7), top: B:91:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f7 A[Catch: Exception -> 0x01fa, TRY_LEAVE, TryCatch #15 {Exception -> 0x01fa, blocks: (B:92:0x01ed, B:85:0x01f2, B:87:0x01f7), top: B:91:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.content.res.AssetFileDescriptor] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String j7(android.net.Uri r18, android.database.Cursor r19) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18.j7(android.net.Uri, android.database.Cursor):java.lang.String");
    }

    public final void k7() {
        android.os.Parcelable parcelable;
        android.content.Intent intent = this.f291687f;
        boolean z17 = false;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "launch : fail, intent is null");
            e7(0);
            finish();
            return;
        }
        java.lang.String action = intent.getAction();
        android.os.Bundle extras = this.f291687f.getExtras();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(action)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "launch : fail, action is null");
            e7(0);
            finish();
            return;
        }
        if (extras != null && (parcelable = extras.getParcelable("android.intent.extra.STREAM")) != null && (parcelable instanceof android.net.Uri)) {
            android.net.Uri uri = (android.net.Uri) parcelable;
            this.f291692n = uri;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W0(uri)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "launch : fail, not accepted: %s", this.f291692n);
                e7(0);
                finish();
                return;
            }
        }
        android.net.Uri uri2 = this.f291692n;
        java.lang.String str = q35.e.f441509a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e1(this, uri2)) {
            android.net.Uri uri3 = this.f291692n;
            java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(this.f291687f, "android.intent.extra.TEXT");
            if ("android.intent.action.SEND".equals(action) && uri3 == null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
                z17 = true;
            }
            if (!z17) {
                boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), android.os.Build.VERSION.SDK_INT < 33 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.fip) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.msk));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "checkPermission checkMediaStorage[%b]", java.lang.Boolean.valueOf(Di));
                if (Di) {
                    g7(action, extras);
                    return;
                }
                return;
            }
        }
        g7(action, extras);
    }

    public final int l7(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "map : mimeType is null");
            return -1;
        }
        java.lang.String lowerCase = str.toLowerCase();
        if (lowerCase.equalsIgnoreCase("image/gif")) {
            return 5;
        }
        if (lowerCase.contains("image")) {
            return 0;
        }
        return lowerCase.contains("video") ? 1 : 3;
    }

    public final void m7() {
        android.app.ProgressDialog progressDialog = this.f291685d;
        if (progressDialog == null || !progressDialog.isShowing()) {
            if (this.f291686e == null) {
                this.f291686e = new com.p314xaae8f345.mm.ui.p2740x696c9db.w9(this);
            }
            this.f291685d = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, this.f291686e);
        }
    }

    public final boolean n7() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18.class);
        if ("android.intent.action.SEND".equals(getIntent().getAction())) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f291690i)) {
                return false;
            }
            intent.putExtra("android.intent.extra.STREAM", com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(this, new com.p314xaae8f345.mm.vfs.r6(this.f291690i)));
            intent.setAction("android.intent.action.SEND");
            intent.setType(getIntent().getType());
        } else {
            if (!"android.intent.action.SEND_MULTIPLE".equals(getIntent().getAction()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f291693o)) {
                return false;
            }
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(this.f291693o.size());
            java.util.Iterator it = this.f291693o.iterator();
            while (it.hasNext()) {
                arrayList.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(this, new com.p314xaae8f345.mm.vfs.r6((java.lang.String) it.next())));
            }
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.setType(getIntent().getType());
        }
        intent.addFlags(67108864);
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(this, new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b.class).addFlags(32768).addFlags(268435456), intent);
        return true;
    }

    public final android.content.Intent o7(android.content.Context context, java.lang.Class cls) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) cls);
        p7(intent);
        return intent;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "ShareImgUI onCreate %d", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(1200, this);
        c01.d9.e().q(837, this);
        android.app.ProgressDialog progressDialog = this.f291685d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f291685d.dismiss();
        }
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "ShareImgUI onDestroy %d", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "ShareImgUI onPause %d", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "onRequestPermissionsResult requestCode[%d], grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 145) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhi), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.fic), false, new com.p314xaae8f345.mm.ui.p2740x696c9db.o9(this), new com.p314xaae8f345.mm.ui.p2740x696c9db.p9(this));
            return;
        }
        if (this.f291687f == null) {
            this.f291687f = getIntent();
        }
        android.content.Intent intent = this.f291687f;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        g7(this.f291687f.getAction(), this.f291687f.getExtras());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "ShareImgUI onResume %d", java.lang.Integer.valueOf(hashCode()));
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = str;
        objArr[3] = java.lang.Integer.valueOf(m1Var != null ? m1Var.mo808xfb85f7b0() : -1);
        objArr[4] = java.lang.Integer.valueOf(hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s, type: %d, hashCode: %d", objArr);
        if (m1Var != null) {
            this.f291688g.remove(m1Var);
        }
        android.app.ProgressDialog progressDialog = this.f291685d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f291685d.dismiss();
        }
        if (m1Var instanceof com.p314xaae8f345.mm.p957x53236a1b.h1) {
            if (i17 == 0 && i18 == 0) {
                k7();
            } else {
                finish();
            }
        }
        if (m1Var instanceof com.p314xaae8f345.mm.p957x53236a1b.c0) {
            if (i17 == 0 && i18 == 0) {
                ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                android.content.Intent intent = this.f291694p;
                if (intent == null) {
                    ec5.a aVar = new ec5.a();
                    aVar.l(this.f291690i);
                    n13.v vVar = n13.v.f415673a;
                    java.lang.String str2 = this.f291691m;
                    aVar.k(vVar.b(str2, com.p314xaae8f345.mm.vfs.w6.n(str2), com.p314xaae8f345.mm.vfs.w6.k(this.f291690i)));
                    e35.g.f329123a.a(this.f291691m, 103);
                    aVar.set(aVar.f125235d + 5, java.lang.Boolean.TRUE);
                    n13.r rVar = new n13.r();
                    rVar.f415650a = true;
                    rVar.f415653d.f415672a = 4;
                    rVar.f415661l = new n13.c0() { // from class: com.tencent.mm.ui.tools.ShareImgUI$$a
                        @Override // n13.c0
                        public final void a(android.content.Intent intent2) {
                            int i19 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18.f291684w;
                            com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18.this.p7(intent2);
                        }
                    };
                    ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(this, aVar, rVar);
                } else {
                    d7(intent);
                    try {
                        android.content.Intent intent2 = this.f291694p;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent2);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/tools/ShareImgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(this, "com/tencent/mm/ui/tools/ShareImgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (java.lang.Exception e17) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    }
                }
            } else if (m1Var.mo47948x7f0c4558() != null) {
                r45.g20 g20Var = (r45.g20) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
                if (g20Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g20Var.f456366d)) {
                    d7(this.f291694p);
                    try {
                        android.content.Intent intent3 = this.f291694p;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent3);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/ui/tools/ShareImgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(this, "com/tencent/mm/ui/tools/ShareImgUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (java.lang.Exception e18) {
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
                    }
                } else {
                    android.content.Intent intent4 = new android.content.Intent();
                    intent4.putExtra("rawUrl", g20Var.f456366d);
                    intent4.putExtra("showShare", false);
                    intent4.putExtra("show_bottom", false);
                    intent4.putExtra("needRedirect", false);
                    j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent4, null);
                }
            }
            finish();
        }
    }

    public final android.content.Intent p7(android.content.Intent intent) {
        android.os.Bundle extras;
        try {
            android.content.Intent intent2 = this.f291687f;
            if (intent2 != null) {
                android.net.Uri uri = this.f291692n;
                if (uri == null && (extras = intent2.getExtras()) != null) {
                    java.lang.Object obj = extras.get("android.intent.extra.STREAM");
                    if (obj instanceof android.net.Uri) {
                        uri = (android.net.Uri) obj;
                    }
                }
                if (uri == null) {
                    uri = this.f291687f.getData();
                }
                if (uri != null) {
                    intent.setDataAndType(uri, getContentResolver().getType(uri));
                }
                if ((this.f291687f.getFlags() & 1) == 1) {
                    intent.addFlags(1);
                }
                if ((this.f291687f.getFlags() & 2) == 2) {
                    intent.addFlags(2);
                }
                if ((this.f291687f.getFlags() & 64) == 64) {
                    intent.addFlags(64);
                }
                if ((this.f291687f.getFlags() & 128) == 128) {
                    intent.addFlags(128);
                }
            }
        } catch (java.lang.Throwable th6) {
            ap.a.a(1, "errTransitiveIntent", th6, null, th6.getMessage());
        }
        return intent;
    }
}

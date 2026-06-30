package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI */
/* loaded from: classes.dex */
public class ActivityC19314x5b64dca9 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f265156x = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f265157d;

    /* renamed from: e, reason: collision with root package name */
    public int f265158e;

    /* renamed from: f, reason: collision with root package name */
    public int f265159f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f265160g;

    /* renamed from: h, reason: collision with root package name */
    public int f265161h;

    /* renamed from: i, reason: collision with root package name */
    public int f265162i;

    /* renamed from: m, reason: collision with root package name */
    public int f265163m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f265164n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f265165o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f265166p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f265167q;

    /* renamed from: r, reason: collision with root package name */
    public android.app.ProgressDialog f265168r = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f265169s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f265170t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f265171u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f265172v = true;

    /* renamed from: w, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f265173w = null;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 activityC19314x5b64dca9, java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var;
        if (activityC19314x5b64dca9.f265163m == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "don't need thumb image");
            return;
        }
        if (android.text.TextUtils.isEmpty(activityC19314x5b64dca9.f265165o)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "thumbFilePath is empty!");
            r6Var = null;
        } else {
            r6Var = new com.p314xaae8f345.mm.vfs.r6(activityC19314x5b64dca9.f265165o);
        }
        if (r6Var != null && r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "file is exist!, path:%s", activityC19314x5b64dca9.f265165o);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "file == null or file not exist for path:%s!", activityC19314x5b64dca9.f265165o);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str3 = a17.f294812f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        java.lang.String substring = (android.text.TextUtils.isEmpty(str3) || !str3.contains(".")) ? null : str3.substring(0, str3.lastIndexOf("."));
        if (android.text.TextUtils.isEmpty(substring)) {
            activityC19314x5b64dca9.f265165o = activityC19314x5b64dca9.Y6() + ("microMsg_" + java.lang.System.currentTimeMillis()) + ".jpeg";
        } else if (activityC19314x5b64dca9.Y6() == null || !activityC19314x5b64dca9.Y6().endsWith("/")) {
            activityC19314x5b64dca9.f265165o = activityC19314x5b64dca9.Y6() + "/" + substring + ".jpeg";
        } else {
            activityC19314x5b64dca9.f265165o = activityC19314x5b64dca9.Y6() + substring + ".jpeg";
        }
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(activityC19314x5b64dca9.f265165o);
        java.lang.String str4 = a18.f294812f;
        if (str4 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "file is exist for path:%s!", activityC19314x5b64dca9.f265165o);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "file not exist for path:%s!", activityC19314x5b64dca9.f265165o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "create new thumb path:%s!", activityC19314x5b64dca9.f265165o);
        android.graphics.Bitmap D = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D(str, 1, -1);
        if (D == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "createVideoThumbnail bitmap fail for path:%s!", activityC19314x5b64dca9.f265165o);
            return;
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(android.media.ThumbnailUtils.extractThumbnail(D, uc1.w1.f76932x366c91de, 400, 2), 30, android.graphics.Bitmap.CompressFormat.JPEG, activityC19314x5b64dca9.f265165o, true);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "saveBitmapToImage exist IOException:" + e17.getMessage());
        }
    }

    public static java.lang.String U6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9 activityC19314x5b64dca9) {
        if (android.text.TextUtils.isEmpty(activityC19314x5b64dca9.f265165o)) {
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.d(activityC19314x5b64dca9.f265165o);
        d17.f264270f = activityC19314x5b64dca9.f265165o;
        d17.f264281t = true;
        d17.f264275n = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(d17);
        return d17.f264269e;
    }

    public final void V6(android.content.Intent intent) {
        java.lang.String stringExtra = getIntent().getStringExtra("key_liteapp_business_scene");
        if (stringExtra != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "liteapp business scene:%s", stringExtra);
            intent.putExtra("album_business_by_real_scene", stringExtra);
        }
    }

    public final void W6(java.lang.String str) {
        X6(str, com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a);
    }

    public final void X6(java.lang.String str, java.lang.String str2) {
        this.f265173w = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x(this);
        this.f265168r = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6d), true, true, this.f265173w);
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.f0(this, str, str2));
    }

    public final java.lang.String Y6() {
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("OpenFileChooserUI");
        if (!h07.m()) {
            h07.J();
        }
        java.lang.String o17 = h07.o();
        return !o17.endsWith("/") ? o17.concat("/") : o17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 Z6(int i17) {
        java.lang.String str = "microMsg_" + java.lang.System.currentTimeMillis();
        this.f265164n = Y6() + str + ".mp4";
        this.f265165o = Y6() + str + ".jpeg";
        int intExtra = getIntent().getIntExtra("key_pick_local_media_duration", 60);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(3, 1);
        c16528xd9aafd63.f230351e = this.f265161h != 16 ? 2 : 1;
        c16528xd9aafd63.f230350d = i17;
        if (c16528xd9aafd63.f230352f == null) {
            c16528xd9aafd63.f230352f = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
        }
        c16528xd9aafd63.f230352f.f152728h = intExtra;
        c16528xd9aafd63.a(str, this.f265164n, this.f265165o, Y6() + java.lang.String.format("%s%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "jpg"));
        return c16528xd9aafd63;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a7() {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9.a7():void");
    }

    public final boolean b7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "avaiableMem = %d", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w(this)));
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w(this) > 200;
    }

    public final boolean c7(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "video thumb file path is null");
            return false;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "thumbFilePath:%s", str);
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "video thumb file is exist");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "video thumb file is not exist");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.vfs.r6 r6Var;
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_pick_local_media_show_memory_warning", this.f265169s);
            setResult(i18, intent2);
            finish();
            return;
        }
        switch (i17) {
            case 1:
            case 3:
                dw4.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.o0(this, intent, i18));
                return;
            case 2:
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                android.content.Context applicationContext = mo55332x76847179().getApplicationContext();
                java.lang.String Y6 = Y6();
                ((ub0.r) oVar).getClass();
                java.lang.String b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(applicationContext, intent, Y6);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenFileChooserUI", "take photo, but result is null");
                    setResult(-2, intent);
                    finish();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "take photo, result[%s]", b17);
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("key_send_raw_image", this.f265160g);
                intent3.putExtra("max_select_count", this.f265157d);
                intent3.putExtra("query_source_type", this.f265158e);
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(1);
                arrayList.add(b17);
                intent3.putStringArrayListExtra("preview_image_list", arrayList);
                intent3.putExtra("preview_image", true);
                intent3.addFlags(67108864);
                j45.l.n(this, "gallery", ".ui.GalleryEntryUI", intent3, 3);
                return;
            case 4:
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
                if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "choose video failed, path is null");
                    setResult(1);
                    finish();
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_GALLERY_VIDEO");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", stringArrayListExtra.get(0));
                    if (this.f265163m == 1 && !c7(this.f265165o)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "video thumb file is not exist");
                    }
                    W6(stringArrayListExtra.get(0));
                    return;
                }
            case 5:
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(this.f265164n);
                java.lang.String str = a17.f294812f;
                if (str != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
                    W6(this.f265164n);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_VIDEO, file not exist : %s", this.f265164n);
                setResult(1);
                finish();
                return;
            case 6:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_SIGHT_VIDEO");
                if (intent != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "data is valid!");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886 c16527xe4fc886 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886) intent.getParcelableExtra("key_req_result");
                    if (c16527xe4fc886 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "sight capture result is null!");
                        setResult(1);
                        finish();
                        return;
                    }
                    java.lang.String str2 = c16527xe4fc886.f230342g;
                    this.f265164n = str2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", str2);
                    if (!c7(this.f265165o)) {
                        java.lang.String str3 = c16527xe4fc886.f230343h;
                        if (c7(str3)) {
                            this.f265165o = str3;
                        }
                    }
                    r6Var = android.text.TextUtils.isEmpty(this.f265164n) ? null : new com.p314xaae8f345.mm.vfs.r6(this.f265164n);
                    if (r6Var != null && r6Var.m()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", this.f265164n);
                        W6(this.f265164n);
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", this.f265164n);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "data is null!");
                setResult(1);
                finish();
                return;
            case 7:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_MEDIA_CAMERA");
                if (intent != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "data is valid!");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886 c16527xe4fc8862 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886) intent.getParcelableExtra("key_req_result");
                    if (c16527xe4fc8862 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "sight capture result is null!");
                        setResult(1);
                        finish();
                        return;
                    }
                    if (c16527xe4fc8862.f230340e) {
                        java.lang.String str4 = c16527xe4fc8862.f230348p;
                        android.content.Intent intent4 = new android.content.Intent();
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "picture_picturePath file is not exist! path:%s", str4);
                            intent4.putExtra("key_pick_local_pic_fail_reason", "can't get the image's filePath!");
                            setResult(1, intent4);
                            finish();
                            return;
                        }
                        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str4);
                        java.lang.String str5 = a18.f294812f;
                        if (str5 != null) {
                            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                            if (!str5.equals(l18)) {
                                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                            }
                        }
                        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
                        if (m18.a() ? m18.f294799a.F(m18.f294800b) : false) {
                            dw4.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.v(this, str4, intent4, i18));
                            return;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "picture filePath is not nil, but couldn't access the picture! The reason might be no permissions! path:%s", str4);
                        intent4.putExtra("key_pick_local_pic_fail_reason", "can't have access to the image!");
                        setResult(1, intent4);
                        finish();
                        return;
                    }
                    java.lang.String str6 = c16527xe4fc8862.f230342g;
                    this.f265164n = str6;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", str6);
                    if (!c7(this.f265165o)) {
                        java.lang.String str7 = c16527xe4fc8862.f230343h;
                        if (c7(str7)) {
                            this.f265165o = str7;
                        }
                    }
                    r6Var = android.text.TextUtils.isEmpty(this.f265164n) ? null : new com.p314xaae8f345.mm.vfs.r6(this.f265164n);
                    if (r6Var != null && r6Var.m()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", this.f265164n);
                        W6(this.f265164n);
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", this.f265164n);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "data is null!");
                setResult(1);
                finish();
                return;
            case 8:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_MEDIA_LOCAL");
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_video_list");
                if (stringArrayListExtra2 != null && stringArrayListExtra2.size() > 0) {
                    W6(stringArrayListExtra2.get(0));
                    return;
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                boolean booleanExtra = intent.getBooleanExtra("CropImage_Compress_Img", true);
                java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_select_multi_pic_item");
                if (stringArrayListExtra3 != null || parcelableArrayListExtra != null) {
                    dw4.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.w(this, parcelableArrayListExtra, booleanExtra, stringArrayListExtra3, i18));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFileChooserUI", "chosen is null");
                setResult(1);
                finish();
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onBusinessPermissionDenied */
    public void mo53824x34301f29(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "onBusinessPermissionDenied");
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).pj(d85.f0.S);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_pic_fail_reason", "onBusinessPermissionDenied");
        setResult(1, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onBusinessPermissionGranted */
    public void mo53825x600c4ed(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "onBusinessPermissionGranted!");
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).pj(d85.f0.S);
        a7();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02dc  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19314x5b64dca9.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.app.ProgressDialog progressDialog = this.f265168r;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f265168r.dismiss();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFileChooserUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 16) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh8), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.n0(this), null);
            return;
        }
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        java.lang.String Y6 = Y6();
        java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
        ((ub0.r) oVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.l(mo55332x76847179, Y6, str, 2);
    }
}

package lx;

/* loaded from: classes7.dex */
public final class i2 implements com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23173xbdb9da9, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f403332d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f403333e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f403334f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f403335g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f403336h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f403337i = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    public static final /* synthetic */ java.lang.String a(lx.i2 i2Var) {
        i2Var.getClass();
        return "MicroMsg.FlutterBizMediaPlugin";
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23173xbdb9da9
    /* renamed from: chooseMediaFromCamera */
    public void mo85133x582c0f5c(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMediaPlugin", "chooseMediaFromCamera");
        android.content.Context context = this.f403332d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        if (context instanceof p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c) {
            p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f403337i;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new lx.d2(context, this, callback, null), 2, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMediaPlugin", "chooseMediaFromCamera: context is not ComponentActivity");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("Context is not ComponentActivity")))));
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23173xbdb9da9
    /* renamed from: editPhoto */
    public void mo85134x8fee1648(java.lang.String photoId, java.lang.String path, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(photoId, "photoId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMediaPlugin", "editPhoto: photoId=" + photoId + ", path=" + path);
        android.content.Context context = this.f403332d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        android.content.Context context2 = context;
        if (!(context2 instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMediaPlugin", "editPhoto: context is not Activity");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("Context is not Activity")))));
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(path) || !com.p314xaae8f345.mm.vfs.w6.j(path)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMediaPlugin", "editPhoto: file not exist, path=".concat(path));
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("File not exist")))));
            return;
        }
        this.f403333e = callback;
        this.f403334f = photoId;
        this.f403335g = path;
        try {
            zw.a aVar = zw.a.f558018a;
            java.lang.String str = zw.a.f558019b;
            if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                com.p314xaae8f345.mm.vfs.w6.u(str);
            }
            java.lang.String str2 = str + "edit_" + photoId + '_' + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
            this.f403336h = str2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.b(path, str2);
            b17.F = 0;
            ut3.m.f512715a.f(context2, 1001, -1, -1, b17, 1, 1);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMediaPlugin", "editPhoto: exception", e17);
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(e17))));
            this.f403333e = null;
            this.f403334f = null;
            this.f403335g = null;
            this.f403336h = null;
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23173xbdb9da9
    /* renamed from: editTextCover */
    public void mo85135x16382fa0(java.lang.String prompt, java.lang.String aiPicId, long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prompt, "prompt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aiPicId, "aiPicId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMediaPlugin", "editTextCover: prompt=" + prompt + ", aiPicId=" + aiPicId + ", editScene=" + j17);
        if (aiPicId.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMediaPlugin", "editTextCover: aiPicId is empty");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("aiPicId is empty")))));
        } else {
            android.content.Context context = this.f403332d;
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Bi(context, 0, 0, prompt, aiPicId, (int) j17, true, new lx.e2(this, callback), new lx.f2(context, this, callback));
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener
    /* renamed from: onActivityResult */
    public boolean mo63506x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1001) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMediaPlugin", "handleEditPhotoResult: resultCode=" + i18);
        yz5.l lVar = this.f403333e;
        java.lang.String str = this.f403334f;
        java.lang.String str2 = this.f403335g;
        this.f403333e = null;
        this.f403334f = null;
        this.f403335g = null;
        if (lVar == null || str == null || str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMediaPlugin", "handleEditPhotoResult: callback or original data is null");
        } else if (i18 == -1) {
            try {
                java.lang.String str3 = this.f403336h;
                if ((str3 == null || !com.p314xaae8f345.mm.vfs.w6.j(str3)) && intent != null) {
                    java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
                    if (stringArrayListExtra != null && (stringArrayListExtra.isEmpty() ^ true)) {
                        str3 = stringArrayListExtra.get(0);
                    }
                    if (str3 == null) {
                        str3 = intent.getStringExtra("outputPhotoPath");
                    }
                    if (str3 == null) {
                        str3 = intent.getStringExtra("result_path");
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMediaPlugin", "editPhoto result: editedPath=" + str3 + ", outputPath=" + this.f403336h);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || !com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMediaPlugin", "editPhoto failed: edited file not exist, path=" + str3);
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("Edited file not exist")))));
                } else if (str3 != null) {
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    com.p314xaae8f345.mm.p786x600aa8b.e.d(str3, options);
                    android.graphics.Point point = new android.graphics.Point(options.outWidth, options.outHeight);
                    com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30 m43587xb5c99c46 = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str2);
                    com.p314xaae8f345.p2845xc516c4b6.biz.C23226xb46742f1 c23226xb46742f1 = new com.p314xaae8f345.p2845xc516c4b6.biz.C23226xb46742f1(str.concat("_edited"), new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str3)).o(), null, java.lang.Long.valueOf(point.x), java.lang.Long.valueOf(point.y), m43587xb5c99c46 != null ? new com.p314xaae8f345.p2845xc516c4b6.biz.C23190x983c4c70(java.lang.Double.valueOf(m43587xb5c99c46.f27815xaa2bac6c), java.lang.Double.valueOf(m43587xb5c99c46.f27817x83009af), null, null, null, null, null, null, null, null, null, 2044, null) : null, q75.g.b(s46.c.c(r26.n0.u0(str3).toString())), 4, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMediaPlugin", "editPhoto success: path=" + c23226xb46742f1.m85483xfb83cc9b() + ", width=" + c23226xb46742f1.m85486x755bd410() + ", height=" + c23226xb46742f1.m85480x1c4fb41d());
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c23226xb46742f1)));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMediaPlugin", "handleEditPhotoResult: exception", e17);
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(e17))));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMediaPlugin", "editPhoto cancelled by user");
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
        }
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403332d = binding.mo137508x19263085();
        binding.mo137502xbf77c2e1(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23173xbdb9da9.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23173xbdb9da9.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23173xbdb9da9.Companion.m85139x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f403332d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f403332d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23173xbdb9da9.Companion companion = com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23173xbdb9da9.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23173xbdb9da9.Companion.m85139x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        p3325xe03a0797.p3326xc267989b.z0.e(this.f403337i, null, 1, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f403332d = binding.mo137508x19263085();
        binding.mo137502xbf77c2e1(this);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23173xbdb9da9
    /* renamed from: selectPhoto */
    public void mo85136xbfed696(long j17, boolean z17, boolean z18, boolean z19, long j18, long j19, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        zw.o oVar = zw.o.f558069a;
        android.content.Context context = this.f403332d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        oVar.a(context, (int) j18, (int) j17, z18, z19, (int) j19, new lx.g2(this, callback), false);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.biz.InterfaceC23173xbdb9da9
    /* renamed from: uploadCommentPic */
    public void mo85137xdc18d78c(com.p314xaae8f345.p2845xc516c4b6.biz.C23235xb7425dff req, yz5.l callback) {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        lx.h2 h2Var = new lx.h2(callback);
        java.lang.Long m85567x13915170 = req.m85567x13915170();
        if (m85567x13915170 != null && ((int) m85567x13915170.longValue()) == 1) {
            gm0.b bVar = gm0.j1.b().f354778h;
            if (bVar == null || (c20976x6ba6452a2 = bVar.f354678e) == null) {
                return;
            }
            v65.i.b(c20976x6ba6452a2, null, new tr1.a(req, null), 1, null);
            return;
        }
        dn.m mVar = new dn.m();
        mVar.f69601xaca5bdda = req.m85571x75e04be9();
        java.lang.Long m85565xe7ac0c5 = req.m85565xe7ac0c5();
        mVar.f69580x454032b6 = m85565xe7ac0c5 != null ? (int) m85565xe7ac0c5.longValue() : 0;
        mVar.f323322h = 3;
        java.lang.Long m85569x5003184c = req.m85569x5003184c();
        mVar.f69592xf1ebe47b = m85569x5003184c != null ? (int) m85569x5003184c.longValue() : 0;
        mVar.f69595x6d25b0d9 = req.m85570xcb2e58ca();
        mVar.f69619xe9ed65f6 = req.m85572x4eae2065();
        mVar.N = req.m85568xef707f65();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInteractionCommentImgUploader", "uploadCommentCDNImpl taskInfo field_mediaId:" + mVar.f69601xaca5bdda);
        gm0.b bVar2 = gm0.j1.b().f354778h;
        if (bVar2 == null || (c20976x6ba6452a = bVar2.f354678e) == null) {
            return;
        }
        v65.i.b(c20976x6ba6452a, null, new tr1.b(mVar, h2Var, req, null), 1, null);
    }
}

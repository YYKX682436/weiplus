package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI */
/* loaded from: classes5.dex */
public class ActivityC19307x65cbeee9 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, ck5.e {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f265116y = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.inputmethod.InputMethodManager f265117d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f265118e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f265119f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f265120g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f265121h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f265122i;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f265125o;

    /* renamed from: p, reason: collision with root package name */
    public volatile hy4.m f265126p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f265127q;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f265130t;

    /* renamed from: m, reason: collision with root package name */
    public boolean f265123m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f265124n = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f265128r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f265129s = false;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f265131u = "";

    /* renamed from: v, reason: collision with root package name */
    public boolean f265132v = false;

    /* renamed from: w, reason: collision with root package name */
    public long f265133w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f265134x = 0;

    @Override // ck5.e
    public void R5(java.lang.String str) {
        db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.it9, com.p314xaae8f345.mm.R.C30867xcad56011.itb);
    }

    public final void T6() {
        if (!this.f265132v && this.f265118e.getText().toString().equals(this.f265131u)) {
            finish();
            return;
        }
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this, 1, true);
        k0Var.q(this.f265129s ? mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lso) : mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lsl), 17);
        k0Var.f293405n = new db5.o4() { // from class: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI$$a
            @Override // db5.o4
            /* renamed from: onCreateMMMenu */
            public final void mo887xc459429a(db5.g4 g4Var) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9.f265116y;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 activityC19307x65cbeee9 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9.this;
                g4Var.d(0, activityC19307x65cbeee9.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31), activityC19307x65cbeee9.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lsn));
                g4Var.f(1, activityC19307x65cbeee9.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lsm));
            }
        };
        k0Var.f293414s = new db5.t4() { // from class: com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI$$b
            @Override // db5.t4
            /* renamed from: onMMMenuItemSelected */
            public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9.f265116y;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 activityC19307x65cbeee9 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9.this;
                activityC19307x65cbeee9.getClass();
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    activityC19307x65cbeee9.finish();
                } else {
                    if (itemId != 1) {
                        return;
                    }
                    k0Var.u();
                }
            }
        };
        k0Var.v();
    }

    public final void U6(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateAvatarUI", "doAddAvatar appid: %s", str);
        X6();
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.x0(str, str2, str3, i17));
        this.f265133w = java.lang.System.currentTimeMillis();
    }

    public final void V6(java.lang.String str, java.lang.String str2) {
        X6();
        int intExtra = getIntent().getIntExtra("extra_edit_avatar_id", -1);
        java.lang.String str3 = this.f265121h;
        if (str2 == null) {
            str2 = "";
        }
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n1(intExtra, str3, str, str2, this.f265130t, this.f265132v));
    }

    public final boolean W6(int i17) {
        if (i17 == 1 || i17 == 2 || i17 == 7 || i17 == 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CreateAvatarUI", "isNetworkAvailable false, errType = " + i17);
            return false;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CreateAvatarUI", "isNetworkAvailable false, not connected");
        return false;
    }

    public final void X6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f265125o;
        if (u3Var == null || u3Var.isShowing()) {
            this.f265125o = db5.e1.Q(this, null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.blv), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.k(this));
        } else {
            this.f265125o.show();
        }
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        this.f265128r = true;
        boolean z17 = this.f265129s;
        hy4.l lVar = hy4.l.FAIL;
        hy4.l lVar2 = hy4.l.SUCCESS;
        if (z17) {
            if (this.f265126p != null && this.f265126p.f367705f == lVar2) {
                V6(str, this.f265127q);
                return;
            }
            if (this.f265126p != null && this.f265126p.f367705f == lVar) {
                X6();
                this.f265126p.a(this.f265120g, this.f265121h);
                return;
            } else if (this.f265126p == null) {
                V6(str, this.f265122i);
                return;
            } else {
                X6();
                return;
            }
        }
        if (!this.f265124n && this.f265126p != null && !this.f265123m) {
            if (this.f265126p.f367705f == lVar2) {
                U6(this.f265121h, str, this.f265127q, 1);
                return;
            } else if (this.f265126p.f367705f != lVar) {
                X6();
                return;
            } else {
                X6();
                this.f265126p.a(this.f265120g, this.f265121h);
                return;
            }
        }
        java.lang.String str2 = this.f265122i;
        if (str2 != null && !str2.isEmpty()) {
            U6(this.f265121h, str, this.f265122i, 1);
            return;
        }
        android.graphics.Bitmap k07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.c0(com.p314xaae8f345.mm.R.raw.f78922x61de8d17), 500, 500, false);
        java.lang.String str3 = this.f265121h;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i(k07, android.graphics.Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CreateAvatarUI", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateAvatarUI", "doAddAvatar appid: %s", str3);
        X6();
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.x0(str3, str, byteArray, 0));
        this.f265133w = java.lang.System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L7b
            android.view.View r0 = r8.getCurrentFocus()
            if (r0 == 0) goto L50
            boolean r3 = r0 instanceof android.widget.EditText
            if (r3 == 0) goto L50
            int[] r3 = new int[]{r2, r2}
            r0.getLocationInWindow(r3)
            r4 = r3[r2]
            r3 = r3[r1]
            int r5 = r0.getHeight()
            int r5 = r5 + r3
            int r6 = r0.getWidth()
            int r6 = r6 + r4
            float r7 = r9.getX()
            float r4 = (float) r4
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L51
            float r4 = r9.getX()
            float r6 = (float) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L51
            float r4 = r9.getY()
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto L51
            float r3 = r9.getY()
            float r4 = (float) r5
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L51
            android.widget.EditText r3 = r8.f265118e
            r3.setCursorVisible(r1)
        L50:
            r1 = r2
        L51:
            if (r1 == 0) goto L76
            java.lang.String r1 = "input_method"
            java.lang.Object r1 = r8.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r8.f265117d = r1
            if (r1 == 0) goto L76
            android.os.IBinder r0 = r0.getWindowToken()
            r1.hideSoftInputFromWindow(r0, r2)
            android.widget.EditText r0 = r8.f265118e
            r0.setCursorVisible(r2)
            android.view.Window r0 = r8.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.requestFocus()
        L76:
            boolean r9 = super.dispatchTouchEvent(r9)
            return r9
        L7b:
            android.view.Window r0 = r8.getWindow()
            boolean r0 = r0.superDispatchTouchEvent(r9)
            if (r0 != 0) goto L8d
            boolean r9 = r8.onTouchEvent(r9)
            if (r9 == 0) goto L8c
            goto L8d
        L8c:
            r1 = r2
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a38;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateAvatarUI", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CreateAvatarUI", "Get image from album failed");
            return;
        }
        if (i17 == 4) {
            if (intent == null) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(this, "com.tencent.mm.plugin.gallery.picker.view.ImageCropUI");
            intent2.putExtra("CropImageMode", 1);
            intent2.putExtra("CropImage_Filter", true);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            intent2.putExtra("CropImage_OutputPath", com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i(c01.z1.r() + ".crop", true, false));
            intent2.putExtra("CropImage_ImgPath", (java.lang.String) null);
            intent2.putExtra("CropImage_from_scene", 3);
            com.p314xaae8f345.mm.ui.p2740x696c9db.i1.a(this, intent, intent2, g83.a.a(), 5, null);
            return;
        }
        if (i17 == 5 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
            if (stringExtra == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CreateAvatarUI", "crop picture failed");
                return;
            }
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(stringExtra);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!a17.f294812f.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateAvatarUI", "onActivityResult(CROP_PICTURE_FOR_AVATAR)  file:%s, size:%d", stringExtra, java.lang.Long.valueOf((m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) ? m17.f294766c : 0L));
            this.f265120g = stringExtra;
            this.f265128r = false;
            this.f265123m = false;
            this.f265124n = false;
            this.f265132v = true;
            m78501x43e00957(true);
            this.f265119f.setImageBitmap(com.p314xaae8f345.mm.p786x600aa8b.e.c(stringExtra));
            if (this.f265126p == null) {
                this.f265126p = new hy4.m();
                this.f265126p.f367702c.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.j(this));
            }
            this.f265127q = null;
            this.f265126p.a(this.f265120g, this.f265121h);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        java.lang.String stringExtra = getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.h87));
        } else {
            mo54450xbf7c1df6(stringExtra);
        }
        this.f265121h = getIntent().getStringExtra("0");
        this.f265122i = getIntent().getStringExtra("default_fileid");
        this.f265129s = getIntent().getBooleanExtra("extra_is_edit_page", false);
        this.f265118e = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.kbk);
        this.f265119f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a_g);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.d(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        m78501x43e00957(false);
        this.f265118e.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.e(this));
        this.f265118e.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.f(this));
        this.f265118e.setHintTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        this.f265118e.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.g(this));
        this.f265118e.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.h(this));
        findViewById(com.p314xaae8f345.mm.R.id.bu7).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.i(this));
        if (this.f265129s) {
            this.f265131u = getIntent().getStringExtra("extra_edit_frefill_avatar_name");
            this.f265130t = getIntent().getStringExtra("extra_edit_frefill_avatar_icon");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265131u)) {
                this.f265118e.setText(this.f265131u);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265130t)) {
                getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a9h);
                n11.a.b().g(this.f265130t, this.f265119f);
            }
        }
        android.content.Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("extra_call_by_appbrand", false)) {
            return;
        }
        hy4.b.INSTANCE.d(4, "");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f265125o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(2500, this);
        gm0.j1.d().q(2785, this);
        gm0.j1.d().q(2667, this);
        gm0.j1.d().q(29251, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(2500, this);
        gm0.j1.d().a(2785, this);
        gm0.j1.d().a(2667, this);
        gm0.j1.d().a(29251, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.x0;
        hy4.b bVar = hy4.b.INSTANCE;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateAvatarUI", "onAddAvatarEnd errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f265125o;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            if (i17 == 0 && i18 == 0) {
                r45.mx4 mx4Var = ((r45.v3) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.x0) m1Var).f264708d.f152244b.f152233a).f469368d;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra(dm.i4.f66865x76d1ec5a, mx4Var.f462426d);
                intent.putExtra("nickname", mx4Var.f462427e);
                intent.putExtra("avatarurl", mx4Var.f462428f);
                setResult(-1, intent);
                finish();
            } else if (W6(i17)) {
                db5.e1.s(this, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.blo));
            } else {
                db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8c), getString(com.p314xaae8f345.mm.R.C30867xcad56011.blo));
            }
            bVar.b(6, (int) (java.lang.System.currentTimeMillis() - this.f265133w), i18);
            return;
        }
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateAvatarUI", "onGetRandomAvatarEnd errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i17 == 0 && i18 == 0) {
                r45.hm3 hm3Var = (r45.hm3) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e1) m1Var).f264380d.f152244b.f152233a;
                o11.f fVar = new o11.f();
                fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78922x61de8d17;
                fVar.f423630u = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a9h);
                fVar.f423629t = true;
                n11.a.b().h(hm3Var.f457824e, this.f265119f, fVar.a());
                this.f265124n = true;
                this.f265123m = false;
                this.f265122i = hm3Var.f457825f;
                this.f265132v = true;
                m78501x43e00957(true);
            } else if (W6(i17)) {
                db5.e1.s(this, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.blq));
            } else {
                db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8c), getString(com.p314xaae8f345.mm.R.C30867xcad56011.blq));
            }
            bVar.b(5, (int) (java.lang.System.currentTimeMillis() - this.f265134x), i18);
            return;
        }
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a1)) {
            if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateAvatarUI", "onModAvatarEnd errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f265125o;
                if (u3Var2 != null) {
                    u3Var2.dismiss();
                }
                if (i17 != 0 || i18 != 0) {
                    if (W6(i17)) {
                        db5.e1.s(this, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.lsp));
                        return;
                    } else {
                        db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8c), getString(com.p314xaae8f345.mm.R.C30867xcad56011.lsp));
                        return;
                    }
                }
                com.p314xaae8f345.mm.p944x882e457a.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n1) m1Var).f264571d;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar != null ? oVar.f152244b.f152233a : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ModAvatarResp");
                r45.mx4 mx4Var2 = ((r45.jn4) fVar2).f459503d;
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra(dm.i4.f66865x76d1ec5a, mx4Var2.f462426d);
                intent2.putExtra("nickname", mx4Var2.f462427e);
                intent2.putExtra("avatarurl", mx4Var2.f462428f);
                intent2.putExtra("desc", mx4Var2.f462429g);
                setResult(-1, intent2);
                finish();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreateAvatarUI", "onGetCreateAvatarEnd errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (this.f265126p == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CreateAvatarUI", "uploadEngine == null, multi-Thread Error, thread name = " + java.lang.Thread.currentThread().getName());
            return;
        }
        hy4.m mVar = this.f265126p;
        mVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a1 a1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a1) m1Var;
        java.lang.String str2 = a1Var.f264291f;
        boolean equals = str2.equals(mVar.f367704e);
        hy4.l lVar = hy4.l.SUCCESS;
        if (!equals) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VestImgUploadEngine", "currentPath=%s,callbackPath=%s, path updated after onSceneEnd", mVar.f367704e, str2);
        } else if (i17 == 0 && i18 == 0) {
            mVar.f367705f = lVar;
            r45.t3 t3Var = (r45.t3) a1Var.f264289d.f152244b.f152233a;
            mVar.f367702c.mo7808x76db6cb1(t3Var.f467614d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VestImgUploadEngine", "file id create success: %s", t3Var.f467614d);
        } else {
            mVar.f367705f = hy4.l.FAIL;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VestImgUploadEngine", "file id create failed: errType = %s, errCode = %s, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        }
        if (this.f265128r) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = this.f265125o;
            if (u3Var3 != null) {
                u3Var3.dismiss();
            }
            if (this.f265126p.f367705f == lVar) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var4 = this.f265125o;
            if (u3Var4 != null) {
                u3Var4.dismiss();
            }
            if (W6(i17)) {
                db5.e1.s(this, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.blo));
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var5 = this.f265125o;
            if (u3Var5 != null) {
                u3Var5.dismiss();
            }
            db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8c), getString(com.p314xaae8f345.mm.R.C30867xcad56011.blo));
        }
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.it_, com.p314xaae8f345.mm.R.C30867xcad56011.itb);
    }
}

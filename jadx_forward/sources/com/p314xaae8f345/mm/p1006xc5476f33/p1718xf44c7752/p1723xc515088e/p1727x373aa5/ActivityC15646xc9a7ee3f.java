package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5;

@db5.a(m123858x6ac9171 = 512)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/gallery/picker/view/ImageCropUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.gallery.picker.view.ImageCropUI */
/* loaded from: classes10.dex */
public final class ActivityC15646xc9a7ee3f extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public int B;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Bitmap f220006q;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f220009t;

    /* renamed from: u, reason: collision with root package name */
    public z23.h f220010u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f220011v;

    /* renamed from: w, reason: collision with root package name */
    public int f220012w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f220013x;

    /* renamed from: y, reason: collision with root package name */
    public int[] f220014y;

    /* renamed from: z, reason: collision with root package name */
    public android.graphics.Bitmap f220015z;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f219996d = jz5.h.b(new d33.h(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f219997e = jz5.h.b(new d33.l0(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f219998f = jz5.h.b(new d33.i(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f219999g = jz5.h.b(new d33.d(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f220000h = jz5.h.b(new d33.e(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f220001i = jz5.h.b(new d33.o0(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f220002m = jz5.h.b(new d33.m0(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f220003n = jz5.h.b(new d33.m(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f220004o = jz5.h.b(new d33.g(this));

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f220005p = "";

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f220007r = jz5.h.b(new d33.g0(this));

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f220008s = jz5.h.b(new d33.n0(this));
    public final yz5.q C = new d33.k0(this);
    public final yz5.q D = new d33.l(this);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (r2 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f r15) {
        /*
            java.lang.String r0 = r15.X6()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lda
            boolean r0 = r15.f220011v
            if (r0 == 0) goto L10
            goto Lda
        L10:
            r0 = 1
            r15.f220011v = r0
            r15.b7()
            e60.g1 r0 = new e60.g1
            r0.<init>()
            r1 = 100
            r0.f331235f = r1
            int r1 = com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2511xac32c159.C19941x601a367f.p()
            r0.f331234e = r1
            int r1 = com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2511xac32c159.C19941x601a367f.p()
            r0.f331233d = r1
            java.lang.String r1 = r15.Y6()
            r0.f331232c = r1
            java.lang.String r1 = "MicroMsg.AvatarCropUI"
            java.lang.String r2 = "get avatar/cover config"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout r1 = r15.V6()
            d33.t0 r1 = r1.m63699xe90535c1()
            java.lang.String r2 = r15.X6()
            boolean r2 = com.p314xaae8f345.mm.vfs.w6.j(r2)
            if (r2 == 0) goto L50
            java.lang.String r2 = r15.X6()
        L4e:
            r4 = r2
            goto L96
        L50:
            android.graphics.Bitmap r2 = r15.f220006q
            if (r2 == 0) goto L93
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class<lp0.b> r4 = lp0.b.class
            monitor-enter(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r5.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = lp0.b.D()     // Catch: java.lang.Throwable -> L90
            r5.append(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = "image_crop/"
            r5.append(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L90
            monitor-exit(r4)
            r3.append(r5)
            long r4 = java.lang.System.currentTimeMillis()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            boolean r2 = r15.a7(r3, r2, r4)
            if (r2 == 0) goto L8b
            r15.f220005p = r3
            r2 = r3
            goto L8d
        L8b:
            java.lang.String r2 = ""
        L8d:
            if (r2 != 0) goto L4e
            goto L93
        L90:
            r15 = move-exception
            monitor-exit(r4)
            throw r15
        L93:
            java.lang.String r2 = ""
            goto L4e
        L96:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r4)
            java.lang.String r2 = "MicroMsg.AvatarCropUI"
            java.lang.String r3 = "input path: "
            java.lang.String r3 = r3.concat(r4)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3)
            z23.h r2 = new z23.h
            r2.<init>(r0)
            r5 = 1
            android.graphics.Matrix r6 = r1.f307809d
            android.graphics.Matrix r0 = r1.f307808c
            r6.set(r0)
            android.graphics.Rect r3 = r1.f307811f
            int r7 = r3.top
            float r7 = (float) r7
            float r7 = -r7
            r8 = 0
            r6.postTranslate(r8, r7)
            java.util.Objects.toString(r0)
            java.util.Objects.toString(r6)
            java.util.Objects.toString(r3)
            android.graphics.Rect r7 = r1.f307811f
            android.graphics.Rect r8 = r1.f307814i
            android.graphics.Rect r9 = r1.f307813h
            r10 = 0
            r11 = 0
            d33.f r12 = new d33.f
            r12.<init>(r15)
            r13 = 128(0x80, float:1.8E-43)
            r14 = 0
            r3 = r2
            e60.i1.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.f220010u = r2
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f.T6(com.tencent.mm.plugin.gallery.picker.view.ImageCropUI):void");
    }

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f, int i17, int i18) {
        activityC15646xc9a7ee3f.getClass();
        if (i17 == 0 || i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageCropReport", "inc: 8");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1361L, 8, 1L);
            activityC15646xc9a7ee3f.setResult(-1);
            activityC15646xc9a7ee3f.finish();
            return;
        }
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(activityC15646xc9a7ee3f.X6());
        activityC15646xc9a7ee3f.f220012w = a17;
        int i19 = (a17 == 90 || a17 == 270) ? i18 : i17;
        int i27 = (a17 == 90 || a17 == 270) ? i17 : i18;
        d33.a aVar = d33.a.f307732a;
        aVar.b(4);
        aVar.c(14);
        aVar.b(13);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCropUI", "preview background");
        android.graphics.Bitmap T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(activityC15646xc9a7ee3f.X6(), i27, i19, true);
        android.widget.ImageView imageView = null;
        android.graphics.Bitmap w07 = T != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(T, activityC15646xc9a7ee3f.f220012w) : null;
        if (w07 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCropUI", "background image decode successful");
            aVar.c(20);
            aVar.b(19);
            imageView = activityC15646xc9a7ee3f.Z6();
            int width = w07.getWidth();
            int height = w07.getHeight();
            int width2 = imageView.getWidth();
            int height2 = imageView.getHeight();
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.reset();
            float f17 = width;
            float f18 = width2;
            float f19 = f17 / f18;
            float f27 = height;
            float f28 = height2;
            float f29 = f27 / f28;
            if (f19 >= f29) {
                f19 = f29;
            }
            if (width2 > height2) {
                f18 = f28;
            }
            float f37 = f18 / f17;
            float f38 = f18 / f27;
            if (f37 <= f38) {
                f37 = f38;
            }
            if (f19 < 1.0d) {
                matrix.postScale(f37, f37);
            }
            imageView.setImageMatrix(matrix);
            imageView.setImageBitmap(w07);
        }
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCropUI", "background image decode fail");
            aVar.b(8);
            activityC15646xc9a7ee3f.setResult(-1);
            activityC15646xc9a7ee3f.finish();
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d V6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d) ((jz5.n) this.f219996d).mo141623x754a37bb();
    }

    public final android.graphics.RectF W6() {
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(null);
        float dimension = a17.f278668a - mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        float f17 = a17.f278669b;
        float f18 = 2;
        float f19 = (f17 - dimension) / f18;
        int i17 = this.B;
        if (i17 != 5 && i17 != 6) {
            return new android.graphics.RectF(mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), f19, mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) + dimension, dimension + f19);
        }
        float floatExtra = getIntent().getFloatExtra("CropImage_aspect_ratio", 1.0f);
        float f27 = floatExtra > 0.0f ? (1 / floatExtra) * dimension : dimension;
        float f28 = (f17 - f27) / f18;
        return new android.graphics.RectF(mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), f28, mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) + dimension, f27 + f28);
    }

    public final java.lang.String X6() {
        return (java.lang.String) ((jz5.n) this.f220003n).mo141623x754a37bb();
    }

    public final java.lang.String Y6() {
        return (java.lang.String) ((jz5.n) this.f220007r).mo141623x754a37bb();
    }

    public final android.widget.ImageView Z6() {
        return (android.widget.ImageView) ((jz5.n) this.f219997e).mo141623x754a37bb();
    }

    public final boolean a7(java.lang.String str, android.graphics.Bitmap bitmap, boolean z17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCropUI", "saveBitmapToImage successful ");
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AvatarCropUI", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvatarCropUI", "saveBitmapToImage failed: " + e17);
            return false;
        }
    }

    public final void b7() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f220009t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f220009t = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), false, 0, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570711bk4;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        z23.h hVar = this.f220010u;
        if (hVar != null) {
            hVar.f551279d.shutdownNow();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageCropReport", "inc: 9");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1361L, (long) 9, 1L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.B = getIntent().getIntExtra("CropImage_from_scene", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCropUI", "crop image fromScene: " + this.B + ", source: " + ((java.lang.Number) ((jz5.n) this.f220008s).mo141623x754a37bb()).intValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageCropReport", "inc: 10");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1361L, (long) 10, 1L);
        mo54450xbf7c1df6("");
        jz5.g gVar = this.f220004o;
        if (((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() == 1) {
            getWindow().setFlags(201327616, 201327616);
            m78568xd7114f24();
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f566844h93);
            findViewById.setPadding(0, 0, 0, com.p314xaae8f345.mm.ui.bl.c(mo55332x76847179()));
            findViewById.post(new d33.n(findViewById, this));
            mo64405x4dab7448(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            mo64405x4dab7448(-16777216);
            m78506x1ef531b7(true, 0L);
            ((android.widget.LinearLayout) ((jz5.n) this.f219998f).mo141623x754a37bb()).setVisibility(0);
            ((android.widget.Button) ((jz5.n) this.f219999g).mo141623x754a37bb()).setOnClickListener(new d33.o(this));
            ((android.widget.Button) ((jz5.n) this.f220000h).mo141623x754a37bb()).setOnClickListener(new d33.p(this));
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f220002m).mo141623x754a37bb()).setOnClickListener(new d33.q(this));
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f220001i).mo141623x754a37bb()).setOnClickListener(new d33.r(this));
        } else {
            m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fif), new d33.s(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
            mo54448x9c8c0d33(new d33.t(this));
        }
        this.A = false;
        b7();
        int intValue = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        if (intValue == 1) {
            if (this.B == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageCropReport", "inc: 0");
                g0Var.C(1361L, 0, 1L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCropUI", "scene avatar");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageCropReport", "inc: 1");
                g0Var.C(1361L, 1, 1L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCropUI", "scene cover");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d V6 = V6();
            V6.setVisibility(0);
            V6.m63710x2dc94f8b(false);
            V6.f(W6(), ru3.o.f481298f);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String X6 = X6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(X6, "<get-imgPath>(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d.g(V6, currentTimeMillis, X6, true, null, this.D, 8, null);
            return;
        }
        if (intValue == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageCropReport", "inc: 2");
            g0Var.C(1361L, 2, 1L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCropUI", "scene background");
            android.widget.ImageView Z6 = Z6();
            Z6.post(new d33.x(Z6, this));
            return;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return;
            }
            pm0.v.K(null, new d33.a0(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageCropReport", "inc: 3");
        g0Var.C(1361L, 3, 1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCropUI", "scene emoji");
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d V62 = V6();
        V62.setVisibility(0);
        V62.m63710x2dc94f8b(false);
        V62.m63705x7b399328(ml5.k.f409965f);
        V62.j();
        pm0.v.K(null, new d33.w(this, V62));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f220006q = null;
        if (android.text.TextUtils.isEmpty(this.f220005p) || !com.p314xaae8f345.mm.vfs.w6.j(this.f220005p)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.h(this.f220005p);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity
    public void setRequestedOrientation(int i17) {
        super.setRequestedOrientation(1);
    }
}

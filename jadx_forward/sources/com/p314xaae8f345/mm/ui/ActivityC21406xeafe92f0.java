package com.p314xaae8f345.mm.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.ui.MMNewPhotoEditUI */
/* loaded from: classes10.dex */
public class ActivityC21406xeafe92f0 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements qk.i6 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f278432t = 0;

    /* renamed from: d, reason: collision with root package name */
    public qk.o9 f278433d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f278434e;

    /* renamed from: f, reason: collision with root package name */
    public long f278435f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f278436g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f278437h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f278438i;

    /* renamed from: m, reason: collision with root package name */
    public int f278439m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f278440n;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.BinderC21430x3b6e2892 f278442p;

    /* renamed from: r, reason: collision with root package name */
    public android.app.Dialog f278444r;

    /* renamed from: o, reason: collision with root package name */
    public final k55.k f278441o = new k55.k(this);

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f278443q = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f278445s = null;

    public static void T6(com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0 activityC21406xeafe92f0, java.lang.String str) {
        activityC21406xeafe92f0.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 8);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("image_path", str);
        intent.putExtra("Retr_Msg_Type", 0);
        j45.l.v(activityC21406xeafe92f0, ".ui.transmit.SelectConversationUI", intent, 1);
    }

    public static void U6(com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0 activityC21406xeafe92f0, int i17) {
        int i18 = activityC21406xeafe92f0.f278439m;
        int i19 = (i18 == 290 || i18 == 291) ? 1 : (i18 == 4 || i18 == 293) ? 2 : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(13858, java.lang.Integer.valueOf(i19), 1, 1, java.lang.Integer.valueOf(i17));
        int b17 = ((f65.r) activityC21406xeafe92f0.f278433d.b()).b();
        int e17 = ((f65.r) activityC21406xeafe92f0.f278433d.b()).e();
        int c17 = ((f65.r) activityC21406xeafe92f0.f278433d.b()).c();
        int a17 = ((f65.r) activityC21406xeafe92f0.f278433d.b()).a();
        ((f65.r) activityC21406xeafe92f0.f278433d.b()).getClass();
        um.d dVar = (um.d) com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a().c(dl.a.CROP_PHOTO);
        int i27 = (dVar != null && dVar.A3(true) > 0) ? 1 : 0;
        boolean h17 = ((f65.r) activityC21406xeafe92f0.f278433d.b()).h();
        int f17 = ((f65.r) activityC21406xeafe92f0.f278433d.b()).f();
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = java.lang.Integer.valueOf(b17);
        objArr[1] = java.lang.Integer.valueOf(e17);
        objArr[2] = java.lang.Integer.valueOf(c17);
        objArr[3] = java.lang.Integer.valueOf(a17);
        objArr[4] = java.lang.Integer.valueOf(i27);
        objArr[5] = java.lang.Integer.valueOf(f17);
        objArr[6] = java.lang.Integer.valueOf(activityC21406xeafe92f0.f278440n ? 5 : 4);
        objArr[7] = java.lang.Boolean.valueOf(h17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNewPhotoEditUI", "[reportPhotoEdit] emojiCount:%s,textCount:%s,mosaicCount:%s,penCount:%s,isCrop:%s,undoCount:%s,mSmallPreview:%s isRotaion:%s", objArr);
        java.lang.Object[] objArr2 = new java.lang.Object[11];
        objArr2[0] = 0;
        objArr2[1] = 1;
        objArr2[2] = java.lang.Integer.valueOf(b17);
        objArr2[3] = java.lang.Integer.valueOf(e17);
        objArr2[4] = java.lang.Integer.valueOf(c17);
        objArr2[5] = java.lang.Integer.valueOf(a17);
        objArr2[6] = java.lang.Integer.valueOf(i27);
        objArr2[7] = java.lang.Integer.valueOf(f17);
        objArr2[8] = 1;
        objArr2[9] = java.lang.Integer.valueOf(activityC21406xeafe92f0.f278440n ? 5 : 4);
        objArr2[10] = java.lang.Integer.valueOf(h17 ? 1 : 0);
        g0Var.d(13857, objArr2);
    }

    public static void V6(com.p314xaae8f345.mm.ui.ActivityC21406xeafe92f0 activityC21406xeafe92f0, java.lang.String str) {
        java.lang.String str2;
        activityC21406xeafe92f0.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNewPhotoEditUI", "[gotoImagePreviewUI] :%s", str);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList<java.lang.String> stringArrayListExtra = activityC21406xeafe92f0.getIntent().getStringArrayListExtra("preview_image_list");
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = activityC21406xeafe92f0.getIntent().getStringArrayListExtra("preview_select_image_list");
        int i17 = 0;
        while (true) {
            if (stringArrayListExtra == null || i17 >= stringArrayListExtra.size()) {
                break;
            }
            java.lang.String str3 = stringArrayListExtra.get(i17);
            java.lang.String str4 = activityC21406xeafe92f0.f278434e;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str4 == null) {
                str4 = "";
            }
            if (!str3.equalsIgnoreCase(str4)) {
                java.lang.String str5 = activityC21406xeafe92f0.f278436g;
                if (!str3.equalsIgnoreCase(str5 != null ? str5 : "")) {
                    arrayList.add(str3);
                    i17++;
                }
            }
            str3 = str;
            arrayList.add(str3);
            i17++;
        }
        for (int i18 = 0; stringArrayListExtra2 != null && i18 < stringArrayListExtra2.size(); i18++) {
            java.lang.String str6 = stringArrayListExtra2.get(i18);
            java.lang.String str7 = activityC21406xeafe92f0.f278434e;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str7 == null) {
                str7 = "";
            }
            if (!str6.equalsIgnoreCase(str7)) {
                java.lang.String str8 = activityC21406xeafe92f0.f278436g;
                if (str8 == null) {
                    str8 = "";
                }
                if (!str6.equalsIgnoreCase(str8)) {
                    arrayList2.add(str6);
                }
            }
            str6 = str;
            arrayList2.add(str6);
        }
        if (activityC21406xeafe92f0.f278438i) {
            str2 = null;
        } else {
            str2 = com.p314xaae8f345.mm.vfs.w6.i("wcf://temp/photoEdited_" + java.lang.System.currentTimeMillis(), true);
            com.p314xaae8f345.mm.vfs.w6.c(str, str2);
        }
        com.p314xaae8f345.mm.vfs.w6.h(activityC21406xeafe92f0.f278436g);
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("max_select_count", activityC21406xeafe92f0.getIntent().getIntExtra("max_select_count", 9));
        intent.putExtra("isPreviewPhoto", true);
        intent.putExtra("raw_photo_path", activityC21406xeafe92f0.f278434e);
        intent.putExtra("raw_photo_img_id", activityC21406xeafe92f0.f278435f);
        intent.putExtra("after_photo_edit", str);
        intent.putExtra("tmp_photo_edit", str2);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("raw_photo_path", activityC21406xeafe92f0.f278434e);
        bundle.putString("after_photo_edit", str);
        bundle.putInt("report_info_emotion_count", ((f65.r) activityC21406xeafe92f0.f278433d.b()).b());
        bundle.putInt("report_info_text_count", ((f65.r) activityC21406xeafe92f0.f278433d.b()).e());
        bundle.putInt("report_info_mosaic_count", ((f65.r) activityC21406xeafe92f0.f278433d.b()).c());
        bundle.putInt("report_info_doodle_count", ((f65.r) activityC21406xeafe92f0.f278433d.b()).a());
        ((f65.r) activityC21406xeafe92f0.f278433d.b()).getClass();
        um.d dVar = (um.d) com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2.a().c(dl.a.CROP_PHOTO);
        bundle.putBoolean("report_info_iscrop", dVar != null && dVar.A3(true) > 0);
        bundle.putInt("report_info_undo_count", ((f65.r) activityC21406xeafe92f0.f278433d.b()).f());
        bundle.putBoolean("report_info_is_rotation", ((f65.r) activityC21406xeafe92f0.f278433d.b()).h());
        intent.putExtra("report_info", bundle);
        java.lang.String stringExtra = activityC21406xeafe92f0.getIntent().getStringExtra("GalleryUI_FromUser");
        java.lang.String stringExtra2 = activityC21406xeafe92f0.getIntent().getStringExtra("GalleryUI_ToUser");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            intent.putExtra("GalleryUI_FromUser", stringExtra);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            intent.putExtra("GalleryUI_ToUser", stringExtra2);
        }
        intent.putStringArrayListExtra("preview_image_list", arrayList);
        intent.putStringArrayListExtra("preview_select_image_list", arrayList2);
        activityC21406xeafe92f0.setResult(-1, intent);
        activityC21406xeafe92f0.W6(false);
        activityC21406xeafe92f0.finish();
    }

    public final void W6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMNewPhotoEditUI", "[setProgress] isVisible:%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.f278445s = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hly), true, 0, null);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f278445s;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f278445s.dismiss();
        this.f278445s = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c7q;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.cgi);
        ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
        rj.l lVar = new rj.l();
        this.f278433d = lVar;
        qk.l9 l9Var = new qk.l9();
        int i17 = this.f278439m;
        l9Var.f445765b = (i17 == 291 || i17 == 293) ? false : true;
        l9Var.f445766c = true;
        l9Var.f445764a = qk.n9.PHOTO;
        l9Var.f445767d = this.f278434e;
        lVar.d(l9Var);
        qk.s c17 = this.f278433d.c(mo55332x76847179());
        c17.mo160420x1f31d20(this);
        frameLayout.addView(c17, new android.widget.FrameLayout.LayoutParams(-1, -1));
        c17.m160424xbe8e76ed(new com.p314xaae8f345.mm.ui.vd(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1 || i17 != 1 || intent == null) {
            if (intent == null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f278437h) && this.f278439m == 291) {
                com.p314xaae8f345.mm.vfs.w6.h(this.f278437h);
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        this.f278444r = db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574235hi3), true, false, null);
        java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
        com.p314xaae8f345.mm.ui.BinderC21430x3b6e2892 binderC21430x3b6e2892 = this.f278442p;
        binderC21430x3b6e2892.m78809x5e5eb3(stringExtra2, this.f278437h, binderC21430x3b6e2892.m78801xaa3e42b8(), stringExtra);
        android.app.Dialog dialog = this.f278444r;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (this.f278438i) {
            q75.c.f(this.f278437h, this);
        } else {
            com.p314xaae8f345.mm.vfs.w6.h(this.f278437h);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (this.f278433d.e()) {
            return;
        }
        int i17 = this.f278439m;
        if (i17 == 290 || i17 == 291) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13859, 1, 2);
        } else if (i17 == 4 || i17 == 293) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13859, 2, 2);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13859, 0, 2);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78506x1ef531b7(true, 0L);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(67108864);
        com.p314xaae8f345.mm.ui.r0.a(this, false);
        k55.k kVar = this.f278441o;
        this.f278442p = new com.p314xaae8f345.mm.ui.BinderC21430x3b6e2892(kVar);
        kVar.a(new com.p314xaae8f345.mm.ui.ud(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f278433d.f();
        this.f278441o.d();
    }

    @Override // qk.i6
    /* renamed from: onFinish */
    public void mo60944x42fe6352() {
        int i17 = this.f278439m;
        if (i17 == 290 || i17 == 291) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13859, 1, 1);
        } else if (i17 == 4 || i17 == 293) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13859, 2, 1);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13859, 0, 1);
        }
        int i18 = this.f278439m;
        if (i18 != 291 && i18 != 293) {
            W6(true);
            this.f278433d.g(new com.p314xaae8f345.mm.ui.ae(this, -1), true);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        android.view.LayoutInflater.from(mo55332x76847179);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179, 1, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        new java.util.ArrayList();
        com.p314xaae8f345.mm.ui.wd wdVar = new com.p314xaae8f345.mm.ui.wd(this);
        com.p314xaae8f345.mm.ui.zd zdVar = new com.p314xaae8f345.mm.ui.zd(this);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
            h4Var.f309914y = null;
            h4Var.f309915z = null;
        }
        arrayList.clear();
        db5.g4 g4Var = new db5.g4(mo55332x76847179);
        wdVar.mo887xc459429a(g4Var);
        if (g4Var.z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f293405n = wdVar;
            k0Var.f293414s = zdVar;
            k0Var.f293387d = null;
            k0Var.G = null;
            k0Var.v();
        }
        db5.e1.a(mo55332x768471792, null);
    }
}

package com.p314xaae8f345.mm.ui.p2741x4c58d2b0;

/* renamed from: com.tencent.mm.ui.transmit.ShareImageSelectorUI */
/* loaded from: classes12.dex */
public class ActivityC22574x21ac54af extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: m, reason: collision with root package name */
    public static int f292571m = 1;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f292572d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f292573e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f292574f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f292575g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnClickListener f292576h = new dk5.z6(this);

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f292577i = new dk5.a7(this);

    public final void T6() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.g(c5303xc75d2f73, 6, this.f292572d);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87856i = this;
        c4Var.f87860m = 52;
        c5303xc75d2f73.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11048, 3, 0, 0);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f292577i;
        if (n3Var != null) {
            n3Var.mo50307xb9e94560(0, 800L);
        }
    }

    public final void U6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8.class);
        com.p314xaae8f345.mm.ui.p2690x38b72420.i5.e();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f288322j);
        intent.putExtra("titile", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571464fu));
        intent.putExtra("list_type", 11);
        intent.putExtra("shareImage", true);
        intent.putExtra("shareImagePath", this.f292572d);
        startActivityForResult(intent, 1001);
    }

    public final void V6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_type", 0);
        intent.putExtra("sns_kemdia_path", this.f292572d);
        intent.putExtra("need_result", true);
        j45.l.n(mo55332x76847179(), "sns", ".ui.SnsUploadUI", intent, 1002);
    }

    public final void W6() {
        db5.e1.H(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.bm8), getString(com.p314xaae8f345.mm.R.C30867xcad56011.bm_), true, new dk5.c7(this), new dk5.d7(this));
    }

    public final void X6() {
        db5.e1.g(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.gus), new java.lang.String[]{getString(com.p314xaae8f345.mm.R.C30867xcad56011.bmb), getString(com.p314xaae8f345.mm.R.C30867xcad56011.bmc), getString(com.p314xaae8f345.mm.R.C30867xcad56011.bma)}, null, "", true, new dk5.e7(this), new dk5.f7(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570993cn3;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1001) {
            if (i17 != 1002) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareImageSelectorUI", "unknow result");
                return;
            } else if (i18 != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareImageSelectorUI", "user cancle");
                return;
            } else {
                dp.a.m125853x26a183b(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f572473bb2, 0).show();
                finish();
                return;
            }
        }
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShareImageSelectorUI", "user cancle");
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("Select_Contact") : null;
        if (stringArrayListExtra != null && stringArrayListExtra.size() == 1) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
            intent2.putExtra("Chat_User", stringArrayListExtra.get(0));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/transmit/ShareImageSelectorUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/transmit/ShareImageSelectorUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        W6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int intValue;
        super.onCreate(bundle);
        java.lang.Object l17 = c01.d9.b().p().l(229635, null);
        if ((l17 instanceof java.lang.Integer) && ((intValue = ((java.lang.Integer) l17).intValue()) == 0 || intValue == 1)) {
            f292571m = intValue;
        }
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.gus);
        mo54448x9c8c0d33(new dk5.b7(this));
        getIntent().getIntExtra("Select_Conv_Type", 2);
        this.f292572d = getIntent().getStringExtra("intent_extra_image_path");
        this.f292573e = findViewById(com.p314xaae8f345.mm.R.id.j8c);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.h88);
        this.f292574f = imageView;
        imageView.setOnClickListener(this.f292576h);
        this.f292575g = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.i38);
        this.f292575g.setAdapter((android.widget.ListAdapter) new dk5.h7(this));
        this.f292575g.setOnItemClickListener(this);
        if (f292571m == 1) {
            m78596x71afbec8(8);
            this.f292575g.setVisibility(8);
            this.f292574f.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
            this.f292574f.setPadding(0, 0, 0, 0);
            this.f292574f.setOnClickListener(null);
            this.f292573e.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.j_));
            X6();
        }
        java.lang.System.currentTimeMillis();
        android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(((x60.e) ((y60.f) i95.n0.c(y60.f.class))).Ai(this.f292572d), com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(this.f292572d));
        if (w07 != null && !w07.isRecycled()) {
            this.f292574f.setImageBitmap(w07);
        }
        java.lang.System.currentTimeMillis();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/ShareImageSelectorUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (i17 == 0) {
            U6();
        } else if (i17 == 1) {
            V6();
        } else if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImageSelectorUI", "unknow postion.");
        } else {
            T6();
        }
        yj0.a.h(this, "com/tencent/mm/ui/transmit/ShareImageSelectorUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (f292571m == 1) {
            X6();
        }
    }
}

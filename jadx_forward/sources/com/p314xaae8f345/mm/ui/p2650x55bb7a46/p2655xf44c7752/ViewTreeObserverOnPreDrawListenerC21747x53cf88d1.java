package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI */
/* loaded from: classes9.dex */
public class ViewTreeObserverOnPreDrawListenerC21747x53cf88d1 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements android.widget.AdapterView.OnItemClickListener, android.view.ViewTreeObserver.OnPreDrawListener, android.view.MenuItem.OnMenuItemClickListener, android.view.View.OnClickListener, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q4, ot0.f3 {
    public static final /* synthetic */ int E = 0;
    public android.view.View A;
    public android.view.View B;
    public android.view.View C;
    public android.view.View D;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f282100d;

    /* renamed from: e, reason: collision with root package name */
    public long f282101e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f282102f;

    /* renamed from: g, reason: collision with root package name */
    public int f282103g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.GridView f282104h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k2 f282105i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f282106m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f282107n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f282108o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f282109p;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f282117x;

    /* renamed from: z, reason: collision with root package name */
    public android.view.animation.Animation f282119z;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f282110q = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.m2(this);

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f282111r = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI.3
        {
            this.f39173x3fe91575 = 1036677180;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c c5568xa650f04c) {
            android.view.View childAt;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5568xa650f04c c5568xa650f04c2 = c5568xa650f04c;
            int i17 = c5568xa650f04c2.f135888g.f88479b;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1 viewTreeObserverOnPreDrawListenerC21747x53cf88d1 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1.this;
            android.widget.GridView gridView = viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282104h;
            if (gridView != null) {
                int firstVisiblePosition = gridView.getFirstVisiblePosition();
                int lastVisiblePosition = viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282104h.getLastVisiblePosition();
                if (i17 >= firstVisiblePosition && i17 <= lastVisiblePosition && (childAt = viewTreeObserverOnPreDrawListenerC21747x53cf88d1.f282104h.getChildAt(i17 - firstVisiblePosition)) != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    int i18 = iArr[0];
                    am.je jeVar = c5568xa650f04c2.f135889h;
                    jeVar.f88560a = i18;
                    jeVar.f88561b = iArr[1];
                    jeVar.f88562c = childAt.getWidth();
                    jeVar.f88563d = childAt.getHeight();
                }
            }
            return false;
        }
    };

    /* renamed from: s, reason: collision with root package name */
    public boolean f282112s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f282113t = false;

    /* renamed from: u, reason: collision with root package name */
    public long f282114u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f282115v = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q2(this);

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f282116w = null;

    /* renamed from: y, reason: collision with root package name */
    public int f282118y = -1;

    @Override // ot0.f3
    public boolean G3() {
        return false;
    }

    @Override // ot0.f3
    public boolean I6() {
        return true;
    }

    @Override // ot0.f3
    public void T3(ot0.e3 e3Var) {
    }

    public final void T6() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r4 r4Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a;
        if (!r4Var.f282866a.isEmpty() && r4Var.f282867b) {
            this.A.setEnabled(true);
            this.B.setEnabled(true);
            this.C.setEnabled(true);
            this.D.setEnabled(true);
            return;
        }
        this.A.setEnabled(false);
        this.B.setEnabled(false);
        this.C.setEnabled(false);
        this.D.setEnabled(false);
    }

    public final void U6(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73) {
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87856i = this;
        c4Var.f87860m = 45;
        c5303xc75d2f73.e();
        int i17 = c5303xc75d2f73.f135624h.f87966a;
        if (i17 == -2 || i17 > 0 || i17 > 0) {
            return;
        }
        a7();
        am.c4 c4Var2 = c5303xc75d2f73.f135623g;
        if (14 != c4Var2.f87850c) {
            return;
        }
        r45.sq0 sq0Var = c4Var2.f87849b;
        if (sq0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryGridUI", "want to report record fav, but type count is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11142, java.lang.Integer.valueOf(sq0Var.f467439d), java.lang.Integer.valueOf(c4Var2.f87849b.f467440e), java.lang.Integer.valueOf(c4Var2.f87849b.f467441f), java.lang.Integer.valueOf(c4Var2.f87849b.f467442g), java.lang.Integer.valueOf(c4Var2.f87849b.f467443h), java.lang.Integer.valueOf(c4Var2.f87849b.f467444i), java.lang.Integer.valueOf(c4Var2.f87849b.f467445m), java.lang.Integer.valueOf(c4Var2.f87849b.f467446n), java.lang.Integer.valueOf(c4Var2.f87849b.f467447o), java.lang.Integer.valueOf(c4Var2.f87849b.f467448p), java.lang.Integer.valueOf(c4Var2.f87849b.f467449q), java.lang.Integer.valueOf(c4Var2.f87849b.f467450r), java.lang.Integer.valueOf(c4Var2.f87849b.f467451s), java.lang.Integer.valueOf(c4Var2.f87849b.f467452t), java.lang.Integer.valueOf(c4Var2.f87849b.f467453u));
        }
    }

    public final void V6(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        long j17 = this.f282114u + 30000;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f282114u = currentTimeMillis;
        if (j17 < currentTimeMillis) {
            this.f282113t = c01.d9.b().E();
        }
        if (!this.f282113t) {
            db5.t7.k(mo55332x76847179(), null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(mo55332x76847179(), "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        intent.putExtra("app_msg_id", f9Var.m124847x74d37ac6());
        intent.putExtra("msg_talker", f9Var.Q0());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "enterAppMsgShow", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "enterAppMsgShow", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void W6(android.view.View view, int i17) {
        int i18;
        int i19;
        if (this.f282105i == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryGridUI", "[ImageGalleryUI] enter");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.class);
        intent.putExtra("key_biz_chat_id", this.f282101e);
        intent.putExtra("key_is_biz_chat", this.f282102f);
        intent.putExtra("intent.key.with.footer", true);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f282105i.getItem(i17);
        if (f9Var == null) {
            return;
        }
        int i27 = getResources().getConfiguration().orientation;
        int[] iArr = new int[2];
        if (view != null) {
            i18 = view.getWidth();
            i19 = view.getHeight();
            view.getLocationInWindow(iArr);
        } else {
            i18 = 0;
            i19 = 0;
        }
        intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        intent.putExtra("img_gallery_msg_id", f9Var.m124847x74d37ac6()).putExtra("img_gallery_msg_svr_id", f9Var.I0()).putExtra("img_gallery_talker", f9Var.Q0()).putExtra("img_gallery_chatroom_name", f9Var.Q0()).putExtra("img_gallery_orientation", i27);
        if (view != null) {
            intent.putExtra("img_gallery_width", i18).putExtra("img_gallery_height", i19).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]).putExtra("img_gallery_enter_from_grid", true);
        } else {
            intent.putExtra("img_gallery_back_from_grid", true);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "enterGallery", "(Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "enterGallery", "(Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.pm.PackageInfo X6(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            if (r5 == 0) goto L21
            int r1 = r5.length()
            if (r1 != 0) goto La
            goto L21
        La:
            java.lang.Class<lt.i0> r1 = lt.i0.class
            i95.m r1 = i95.n0.c(r1)
            lt.i0 r1 = (lt.i0) r1
            kt.c r1 = (kt.c) r1
            r1.getClass()
            com.tencent.mm.pluginsdk.model.app.m r5 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(r5)
            if (r5 != 0) goto L1e
            goto L21
        L1e:
            java.lang.String r5 = r5.f67386xa1e9e82c
            goto L22
        L21:
            r5 = r0
        L22:
            if (r5 != 0) goto L25
            return r0
        L25:
            r1 = 0
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            return r4
        L2f:
            r4 = move-exception
            java.lang.String r5 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "MicroMsg.GalleryGridUI"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r4, r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1.X6(android.content.Context, java.lang.String):android.content.pm.PackageInfo");
    }

    public java.lang.String Y6(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String s17;
        java.lang.String str = this.f282100d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = str == null ? "" : str;
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str);
        return (R4 && R4 && (s17 = c01.w9.s(f9Var.j())) != null && s17.length() > 0) ? s17 : str2;
    }

    public void Z6(int i17) {
        android.content.Intent intent = getIntent();
        this.f282107n = java.lang.Boolean.valueOf(intent.getIntExtra("kintent_intent_source", 0) == 1);
        this.f282100d = intent.getStringExtra("kintent_talker");
        this.f282103g = intent.getIntExtra("kintent_image_index", 0);
        this.f282102f = intent.getBooleanExtra("key_is_biz_chat", false);
        this.f282101e = getIntent().getLongExtra("key_biz_chat_id", -1L);
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571525hs));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.n2(this));
        this.f282117x = findViewById(com.p314xaae8f345.mm.R.id.jqp);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.dth);
        this.A = findViewById;
        findViewById.setOnClickListener(this);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.oio);
        this.B = findViewById2;
        findViewById2.setOnClickListener(this);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.m9n);
        this.C = findViewById3;
        findViewById3.setOnClickListener(this);
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.crz);
        this.D = findViewById4;
        findViewById4.setOnClickListener(this);
        this.f282108o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564450rq);
        this.f282109p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564416qp);
        if (i17 == 0) {
            android.widget.GridView gridView = (android.widget.GridView) findViewById(com.p314xaae8f345.mm.R.id.h9h);
            this.f282104h = gridView;
            gridView.setOnItemClickListener(this);
            this.f282104h.setNumColumns(3);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            if (this.f282102f) {
                f9Var.Y0(this.f282101e);
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k2 k2Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k2(this, f9Var, this.f282101e, this.f282100d);
            this.f282105i = k2Var;
            if (k2Var.getCount() == 0) {
                this.f282109p.setVisibility(0);
                return;
            }
            this.f282109p.setVisibility(8);
            this.f282104h.setAdapter((android.widget.ListAdapter) this.f282105i);
            int firstVisiblePosition = this.f282104h.getFirstVisiblePosition();
            int lastVisiblePosition = this.f282104h.getLastVisiblePosition();
            int i18 = this.f282103g;
            if (i18 < firstVisiblePosition || i18 > lastVisiblePosition) {
                this.f282104h.setSelection(i18);
            }
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k2 k2Var2 = this.f282105i;
            if (k2Var2 != null) {
                k2Var2.notifyDataSetChanged();
                int firstVisiblePosition2 = this.f282104h.getFirstVisiblePosition();
                int lastVisiblePosition2 = this.f282104h.getLastVisiblePosition();
                int i19 = this.f282103g;
                if (i19 < firstVisiblePosition2 || i19 > lastVisiblePosition2) {
                    this.f282104h.setSelection(i19);
                }
            }
        }
        this.f282104h.setOnScrollListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2(this));
    }

    public void a7() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a.f282867b = false;
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571525hs));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k2 k2Var = this.f282105i;
        if (k2Var == null) {
            return;
        }
        k2Var.notifyDataSetChanged();
        if (this.f282118y >= 0) {
            android.widget.GridView gridView = this.f282104h;
            gridView.setPadding(gridView.getPaddingLeft(), this.f282104h.getPaddingTop(), this.f282104h.getPaddingRight(), this.f282118y);
        }
        android.view.View view = this.f282117x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "toNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "toNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78551x8f8ecf18(0);
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fik), this);
    }

    public void b7() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r4 r4Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a;
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjy, java.lang.Integer.valueOf(r4Var.f())));
        r4Var.f282867b = true;
        if (this.f282105i == null) {
            return;
        }
        if (this.f282119z == null) {
            this.f282119z = android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559390df);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k2 k2Var = this.f282105i;
        k2Var.f282653v = false;
        k2Var.notifyDataSetChanged();
        android.view.View view = this.f282117x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "toSelectedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "toSelectedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f282117x.startAnimation(this.f282119z);
        this.A.setEnabled(false);
        this.B.setEnabled(false);
        this.C.setEnabled(false);
        this.D.setEnabled(false);
        this.f282118y = this.f282104h.getPaddingBottom();
        android.widget.GridView gridView = this.f282104h;
        gridView.setPadding(gridView.getPaddingLeft(), this.f282104h.getPaddingTop(), this.f282104h.getPaddingRight(), i65.a.h(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561456j2));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11627, 2);
        m78551x8f8ecf18(0);
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fij), this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q4
    /* renamed from: clear */
    public void mo79579x5a5b64d() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k2 k2Var = this.f282105i;
        T6();
    }

    @Override // ot0.f3
    public void f2(ot0.e3 e3Var) {
        if (e3Var == ot0.e3.del) {
            this.f282105i.q();
            this.f282105i.notifyDataSetChanged();
        }
        a7();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r4 r4Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a;
        r4Var.f282868c.clear();
        r4Var.b();
        r4Var.f282867b = false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: fromFullScreenActivity */
    public boolean mo78504x402fb154() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bk_;
    }

    @Override // ot0.f3
    public void k6(ot0.e3 e3Var) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q4
    public void l0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k2 k2Var = this.f282105i;
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjy, java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a.f())));
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a.f282867b) {
            a7();
            return;
        }
        if (this.f282107n.booleanValue()) {
            super.onBackPressed();
            return;
        }
        int i17 = this.f282103g;
        if (i17 >= 0) {
            W6(null, i17);
        }
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179;
        int i17;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r4 r4Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a;
        if (r4Var.f282866a.isEmpty()) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f282100d);
        java.util.ArrayList arrayList2 = r4Var.f282866a;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.p314xaae8f345.mm.R.id.crz) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11627, 5);
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                copyOnWriteArraySet.add(tg3.l1.a((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next()));
            }
            db5.e1.A(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.bav), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.boo), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r2(this, copyOnWriteArraySet), null);
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.dth) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 18L, 1L, true);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e2.i(mo55332x76847179(), c5303xc75d2f73, this.f282100d, arrayList2, false, false)) {
                U6(c5303xc75d2f73);
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.e.c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.c.Fav, com.p314xaae8f345.mm.ui.p2650x55bb7a46.d.Samll, (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it6.next(), 0);
                }
            } else {
                int size = arrayList2.size();
                am.c4 c4Var = c5303xc75d2f73.f135623g;
                if (size > 1) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = mo55332x76847179();
                    if (c4Var.f87859l >= 0) {
                        mo55332x76847179 = mo55332x76847179();
                        i17 = com.p314xaae8f345.mm.R.C30867xcad56011.caq;
                    } else {
                        mo55332x76847179 = mo55332x76847179();
                        i17 = com.p314xaae8f345.mm.R.C30867xcad56011.cap;
                    }
                    java.lang.String string = mo55332x76847179.getString(i17);
                    if (c4Var.f87859l >= 0) {
                        mo55332x768471792 = mo55332x76847179();
                        i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f572472bb1;
                    } else {
                        mo55332x768471792 = mo55332x76847179();
                        i18 = com.p314xaae8f345.mm.R.C30867xcad56011.hjg;
                    }
                    db5.e1.A(mo55332x768471793, string, "", mo55332x768471792.getString(i18), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.baz), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.s2(this, c5303xc75d2f73, arrayList2), null);
                } else {
                    db5.e1.i(mo55332x76847179(), c4Var.f87859l, 0);
                }
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.oio) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 19L, 1L, true);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.d(this, arrayList2, R4, this.f282100d, this);
            a7();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11627, 3);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it7.next();
                if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.M(f9Var) && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.F(f9Var)) {
                    if (!(f9Var == null ? false : f9Var.M2())) {
                        arrayList3.add(f9Var);
                    }
                }
            }
            if (arrayList3.size() != arrayList2.size()) {
                db5.e1.n(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.fjf, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l2(this, arrayList3), null);
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList3.get(0);
                if (arrayList2.size() == 1 && f9Var2 != null && f9Var2.k2()) {
                    ot0.q v17 = ot0.q.v(f9Var2.U1());
                    if (v17 != null && ez.v0.f339310a.j(java.lang.Integer.valueOf(v17.f430199i))) {
                        V6(f9Var2);
                    }
                } else {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.i(this, arrayList2);
                    a7();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f282112s = true;
        this.f282106m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        Z6(0);
        this.f282111r.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f282106m.mo50300x3fa464aa(this.f282110q);
        this.f282106m = null;
        n11.a.b().n(0);
        this.f282111r.mo48814x2efc64();
        super.onDestroy();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:141|142|143|(7:145|146|(1:181)(1:150)|(5:152|153|(2:155|(2:158|159)(1:157))|162|160)|165|166|167)|183|146|(1:148)|181|(0)|165|166|167) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x048e, code lost:
    
        if (r7 != false) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x063f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.widget.AdapterView.OnItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onItemClick(android.widget.AdapterView r45, android.view.View r46, int r47, long r48) {
        /*
            Method dump skipped, instructions count: 2956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewTreeObserverOnPreDrawListenerC21747x53cf88d1.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        if (!menuItem.getTitle().equals(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fik))) {
            a7();
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a.b();
        b7();
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        setIntent(intent);
        super.onNewIntent(intent);
        Z6(1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a.f282868c.remove(this);
        super.onPause();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r4 r4Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a;
        java.util.ArrayList arrayList = r4Var.f282868c;
        arrayList.remove(this);
        arrayList.add(this);
        if (this.f282112s) {
            if (r4Var.f282867b) {
                b7();
            } else {
                a7();
            }
        }
        this.f282106m.mo50297x7c4d7ca2(this.f282110q, 300L);
        super.onResume();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k2 k2Var = this.f282105i;
        if (k2Var != null) {
            k2Var.notifyDataSetChanged();
            if (r4Var.f282867b) {
                mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjy, java.lang.Integer.valueOf(r4Var.f())));
            }
        }
        this.f282112s = false;
        T6();
    }

    @Override // ot0.f3
    public boolean u1() {
        return false;
    }

    @Override // ot0.f3
    public void w1(android.os.Bundle bundle) {
    }
}

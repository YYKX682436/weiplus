package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerPreviewUI;", "Lcom/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI */
/* loaded from: classes4.dex */
public final class ActivityC18376x3a04fe77 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d {
    public static final /* synthetic */ int B1 = 0;
    public int A1;
    public final java.lang.String S = "MicroMsg.SnsAlbumPickerPreviewUI";
    public final jz5.g T;
    public final jz5.g U;
    public final jz5.g V;
    public final jz5.g W;
    public final jz5.g X;
    public final jz5.g Y;
    public final jz5.g Z;

    /* renamed from: l1, reason: collision with root package name */
    public int f251752l1;

    /* renamed from: p0, reason: collision with root package name */
    public final jz5.g f251753p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f251754p1;

    /* renamed from: x0, reason: collision with root package name */
    public int f251755x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f251756x1;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f251757y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f251758y1;

    /* renamed from: z1, reason: collision with root package name */
    public int f251759z1;

    public ActivityC18376x3a04fe77() {
        jz5.h.b(new td4.v0(this));
        this.T = jz5.h.b(new td4.y0(this));
        this.U = jz5.h.b(new td4.z0(this));
        this.V = jz5.h.b(new td4.u0(this));
        this.W = jz5.h.b(new td4.s0(this));
        this.X = jz5.h.b(new td4.x0(this));
        this.Y = jz5.h.b(new td4.t0(this));
        this.Z = jz5.h.b(new td4.w0(this));
        this.f251753p0 = jz5.h.b(td4.a1.f499164d);
        this.f251757y0 = "";
        this.f251754p1 = "";
        this.f251758y1 = "--/--";
        this.f251759z1 = -1;
        this.A1 = 10;
    }

    public static final /* synthetic */ java.util.ArrayList r7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18376x3a04fe77 activityC18376x3a04fe77) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMSelectedMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        java.util.ArrayList w76 = activityC18376x3a04fe77.w7();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMSelectedMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return w76;
    }

    public final void A7(java.lang.String mediaObjId, boolean z17, java.util.List mediaObjIdList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSelectData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObjId, "mediaObjId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObjIdList, "mediaObjIdList");
        if (z17) {
            if (!mediaObjIdList.contains(mediaObjId)) {
                mediaObjIdList.add(mediaObjId);
            } else if (mediaObjIdList.remove(mediaObjId)) {
                mediaObjIdList.add(mediaObjId);
            }
        } else if (mediaObjIdList.contains(mediaObjId)) {
            mediaObjIdList.remove(mediaObjId);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSelectData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c_v;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n4
    public void h6(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUpdateTitle", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMPageTitleTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.X).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMPageTitleTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (textView != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentPageTitleText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            java.lang.String str3 = this.f251758y1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentPageTitleText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            textView.setText(str3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUpdateTitle", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        super.onCreate(bundle);
        com.p314xaae8f345.mm.ui.bk.u0(this);
        m78531x8f8cf1fb();
        getWindow().addFlags(128);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handlerIntentData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        this.f251752l1 = getIntent().getIntExtra("sns_video_scene", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("sns_gallery_userName");
        if (stringExtra == null) {
            stringExtra = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringExtra, "getUsernameFromUserInfo(...)");
        }
        this.f251757y0 = stringExtra;
        getIntent().getIntExtra("sns_gallery_localId", 0);
        getIntent().getBooleanExtra("sns_gallery_is_self", false);
        this.f251755x0 = getIntent().getIntExtra("sns_gallery_position", 0);
        this.f251759z1 = getIntent().getIntExtra("sns_album_select_limit_count", 9);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("sns_album_select_mediaobj_id_list");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>();
        }
        w7().addAll(stringArrayListExtra);
        this.A1 = getIntent().getIntExtra("album_show_source_type", 10);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handlerIntentData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        m78501x43e00957(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.S, "onDestroy: ");
        getWindow().clearFlags(128);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().N(this);
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onKeyDown", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (i17 == 4 && event.getRepeatCount() == 0) {
            y7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onKeyDown", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            return true;
        }
        boolean onKeyDown = super.onKeyDown(i17, event);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onKeyDown", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return onKeyDown;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = this.f248343o;
        if (c18064xe6e1a3b3 != null) {
            r45.jj4 mo70574x2d3ab571 = c18064xe6e1a3b3.mo70574x2d3ab571();
            this.f248343o.c0(mo70574x2d3ab571 != null && mo70574x2d3ab571.f459389e == 6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        super.onStart();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initViews", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initFlipView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3(this);
        c18064xe6e1a3b3.m70789xbb45aed3(this.f251752l1);
        c18064xe6e1a3b3.m70582xc35eabfd(false);
        c18064xe6e1a3b3.m70583x9f17ba6(false);
        c18064xe6e1a3b3.m70584x9c2edd8a(false);
        c18064xe6e1a3b3.m70782xe9aedf19(false);
        c18064xe6e1a3b3.m70767x464b3146(false);
        c18064xe6e1a3b3.m70786xa143192c(getIntent().getIntExtra("key_from_scene", 0));
        c18064xe6e1a3b3.m70770x5fdf7cc0(com.p314xaae8f345.mm.p2621x8fb0427b.s7.a());
        c18064xe6e1a3b3.f247819q = this.f251757y0;
        this.f248343o = c18064xe6e1a3b3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6 Kj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Kj();
        java.lang.String str = this.f251757y0;
        Kj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsGalleryItems", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        java.util.ArrayList arrayList = (java.util.ArrayList) ((java.util.HashMap) Kj.f245689p).get(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsGalleryItems", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (this.f248335d) {
            this.f248343o.X(arrayList2, this.f251757y0, this.f251755x0, b7(), this);
        } else {
            this.f248343o.X(arrayList2, this.f251757y0, this.f251755x0, a7(), this);
        }
        this.f248343o.m70779x76fc4600(this);
        m70700xbb8aeee6(this.f248343o);
        td4.n0 n0Var = new td4.n0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateGalleryClickListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b32 = this.f248343o;
        if (c18064xe6e1a3b32 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateGalleryClickListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        } else {
            c18064xe6e1a3b32.mo70578x3219b31c().m79173x3be48126(n0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateGalleryClickListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        }
        td4.o0 o0Var = new td4.o0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGalleryPageChangeListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.G = o0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGalleryPageChangeListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initFlipView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSelectArea", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSelectTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.U).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSelectTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (textView != null) {
            textView.setOnClickListener(new td4.q0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSelectButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.ImageButton imageButton = (android.widget.ImageButton) ((jz5.n) this.T).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSelectButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (imageButton != null) {
            imageButton.setOnClickListener(new td4.r0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSelectArea", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initActionBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560696rn));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.Button v76 = v7();
        if (v76 != null) {
            v76.setText(x7(w7().size()));
            v76.setContentDescription(v7().getText());
            v76.setOnClickListener(new td4.p0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initBackButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMBackBtn", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.Y).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMBackBtn", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new td4.m0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initBackButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initActionBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViews", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        super.onStop();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n4
    public void s3(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (this.f248343o != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && i17 != 3) {
                this.f248343o.i0(str);
            }
            if (z17) {
                this.f248343o.c0(true);
            } else {
                this.f248343o.W();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    public final void s7(java.lang.String mediaObjId, java.util.List mediaObjIdList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeSelectState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObjId, "mediaObjId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObjIdList, "mediaObjIdList");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isMediaObjSelected", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        boolean contains = mediaObjIdList.contains(mediaObjId);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isMediaObjSelected", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        java.lang.String str = this.S;
        if (contains) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "changeSelectState: unselect:".concat(mediaObjId));
            z7(false);
            A7(mediaObjId, false, mediaObjIdList);
            java.lang.String x76 = x7(w7().size());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            android.widget.Button v76 = v7();
            if (v76 != null) {
                v76.setEnabled(true);
                v76.setText(x76);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        } else {
            if (mediaObjIdList.size() >= this.f251759z1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "changeSelectState: limit:" + this.f251759z1 + ", selected:" + mediaObjIdList.size());
                td4.a.f499162a.a(this, this.A1, this.f251759z1);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeSelectState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
                return;
            }
            z7(true);
            A7(mediaObjId, true, mediaObjIdList);
            java.lang.String x77 = x7(w7().size());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            android.widget.Button v77 = v7();
            if (v77 != null) {
                v77.setEnabled(true);
                v77.setText(x77);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeSelectState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    public final android.widget.RelativeLayout t7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMActionBarLayout", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) this.W).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMActionBarLayout", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return relativeLayout;
    }

    public final android.widget.RelativeLayout u7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMBottomBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) this.V).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMBottomBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return relativeLayout;
    }

    public final android.widget.Button v7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.Button button = (android.widget.Button) ((jz5.n) this.Z).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return button;
    }

    public final java.util.ArrayList w7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSelectedMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        java.util.ArrayList arrayList = (java.util.ArrayList) ((jz5.n) this.f251753p0).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSelectedMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return arrayList;
    }

    public final java.lang.String x7(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (i17 <= 0) {
            java.lang.String string = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            return string;
        }
        java.lang.String str = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww) + '(' + i17 + '/' + this.f251759z1 + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return str;
    }

    public final void y7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goBack", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.S, "goBack: selected=" + w7());
        android.content.Intent intent = new android.content.Intent();
        intent.putStringArrayListExtra("sns_album_select_mediaobj_id_list", w7());
        setResult(0, intent);
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goBack", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    public final void z7(boolean z17) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSelectButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCheckBoxSelectedResource", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCheckBoxSelectedResource", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            i17 = com.p314xaae8f345.mm.R.raw.f78847xb6f4a7d6;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCheckBoxSelectedResource", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCheckBoxSelectedResource", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            i17 = com.p314xaae8f345.mm.R.raw.f80936xc6307b2b;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSelectButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.ImageButton imageButton = (android.widget.ImageButton) ((jz5.n) this.T).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSelectButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (imageButton != null) {
            imageButton.setImageResource(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSelectButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }
}

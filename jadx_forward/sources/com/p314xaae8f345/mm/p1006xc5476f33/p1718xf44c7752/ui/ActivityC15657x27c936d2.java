package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/gallery/ui/MediaTabAlbumUI;", "Lcom/tencent/mm/plugin/gallery/ui/AlbumPreviewUI;", "<init>", "()V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI */
/* loaded from: classes10.dex */
public final class ActivityC15657x27c936d2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd {

    /* renamed from: x2, reason: collision with root package name */
    public static final /* synthetic */ int f220145x2 = 0;

    /* renamed from: u2, reason: collision with root package name */
    public final java.lang.String f220146u2 = "MicroMsg.MediaTabAlbumUI";

    /* renamed from: v2, reason: collision with root package name */
    public final jz5.g f220147v2 = jz5.h.b(e33.z4.f329098d);

    /* renamed from: w2, reason: collision with root package name */
    public final jz5.g f220148w2 = jz5.h.b(new e33.a5(this));

    @Override // com.p314xaae8f345.mm.ui.p2706xf44c7752.AbstractActivityC22408xd92d9051
    public android.view.View U6() {
        return g8();
    }

    @Override // com.p314xaae8f345.mm.ui.p2706xf44c7752.AbstractActivityC22408xd92d9051
    public void V6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f220146u2, "onPageSelected: ");
        q7();
        i33.z1 z1Var = (i33.z1) pf5.z.f435481a.a(this).a(i33.z1.class);
        android.view.Window window = activity.getWindow();
        z1Var.f369835f = window;
        if (window != null) {
            window.clearFlags(1024);
        }
        activity.getWindow().getDecorView().setFitsSystemWindows(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public boolean V7() {
        boolean V7 = super.V7();
        if (!getIntent().getBooleanExtra("key_force_hide_smart_gallery_entry", false)) {
            return V7;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f220146u2, "showSmartGalleryEntry: forceHideEntry");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public void c8(int i17) {
        super.c8(i17);
        if (i17 == 0) {
            f8(true);
        } else {
            f8(false);
        }
    }

    public final void f8(boolean z17) {
        java.lang.String str = this.f220146u2;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeVisibilityAlbumFooterWithSlideOutOfPage hide, ");
            sb6.append(this.f290218e == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            xg5.a aVar = this.f290218e;
            if (aVar != null) {
                ((b33.f) aVar).V6();
                return;
            }
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("changeVisibilityAlbumFooterWithSlideOutOfPage show, ");
        sb7.append(this.f290218e == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
        xg5.a aVar2 = this.f290218e;
        if (aVar2 != null) {
            ((b33.f) aVar2).X6();
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15671x6622f12e g8() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15671x6622f12e) ((jz5.n) this.f220147v2).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View view;
        android.view.View findViewById;
        java.lang.String str = this.f220146u2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initView: start");
        super.mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15671x6622f12e g86 = g8();
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(g86 != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumPreviewUI", "updateViewRefAboutAlbumFooterBar: %b", objArr);
        if (g86 != null) {
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f564380pn);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "updateViewRefAboutAlbumFooterBar", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "updateViewRefAboutAlbumFooterBar", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) g86.findViewById(com.p314xaae8f345.mm.R.id.je8);
            this.f220051g = textView;
            textView.setTextSize(0, i65.a.f(this, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
            this.f220051g.setOnClickListener(new e33.e1(this));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(this).a(i33.k1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        i33.k1 k1Var = (i33.k1) a17;
        xg5.a aVar = this.f290218e;
        if (aVar != null) {
            view = (android.view.View) ((jz5.n) ((b33.f) aVar).f99196f).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "<get-bottomContainer>(...)");
        } else {
            view = null;
        }
        if (view != null) {
            ((java.util.List) ((jz5.n) k1Var.f369743g).mo141623x754a37bb()).add(new i33.g1(view, 0, 2, null));
            view.getId();
            view.getVisibility();
        }
        if (com.p314xaae8f345.mm.ui.b4.c(this) && (findViewById = findViewById(com.p314xaae8f345.mm.R.id.hwa)) != null) {
            com.p314xaae8f345.mm.ui.a4.g(findViewById, true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initView: end");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public boolean k7() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPermissionOnCreate:");
        jz5.g gVar = this.f220148w2;
        sb6.append(((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f220146u2, sb6.toString());
        return ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14 = this.f220073r;
        if (c15655x4db85b14 == null || !c15655x4db85b14.f220098m) {
            super.onBackPressed();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f220146u2, "onBackPressed: handle folderView expand");
        this.f220073r.d();
        m78547xfde6309c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f220146u2, "onDestroy");
        super.onDestroy();
        dx1.g.f326022a.j("SnsPublishProcess", "selectionPageStaytime_", java.lang.Long.valueOf(mo78509x4b0ac5a2()), bx1.u.f117843e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(i33.z1.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd
    public android.widget.TextView u7() {
        android.view.View findViewById = g8().findViewById(com.p314xaae8f345.mm.R.id.kaq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.TextView) findViewById;
    }
}

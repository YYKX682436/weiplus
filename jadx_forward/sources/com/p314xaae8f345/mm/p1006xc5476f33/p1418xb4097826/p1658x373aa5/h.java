package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca f213724a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15494xd57adead f213725b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f213726c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f213727d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f213728e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f213729f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f213730g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077 f213731h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View.OnClickListener f213732i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e f213733j;

    public h(oy2.m dialog, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f213724a = container;
        android.content.Context g17 = dialog.g();
        android.view.View findViewById = container.findViewById(com.p314xaae8f345.mm.R.id.f569232pi0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f213725b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15494xd57adead) findViewById;
        this.f213727d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) container.findViewById(com.p314xaae8f345.mm.R.id.f566521g53);
        android.view.View findViewById2 = container.findViewById(com.p314xaae8f345.mm.R.id.f566522g54);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f213728e = findViewById2;
        android.view.View findViewById3 = container.findViewById(com.p314xaae8f345.mm.R.id.jun);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f213731h = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077) findViewById3;
        this.f213729f = (android.widget.ImageView) container.findViewById(com.p314xaae8f345.mm.R.id.f565289bz0);
        this.f213730g = (android.widget.ImageView) container.findViewById(com.p314xaae8f345.mm.R.id.bzj);
        um5.d dVar = new um5.d();
        android.content.res.Resources resources = g17.getResources();
        int dimensionPixelSize = resources != null ? resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db) : 0;
        android.content.res.Resources resources2 = g17.getResources();
        int dimensionPixelSize2 = resources2 != null ? resources2.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) : 0;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(dimensionPixelSize2));
        arrayList.add(java.lang.Integer.valueOf(dimensionPixelSize));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "setBlur", "(FF)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "setBlur", "(FF)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        createBitmap.eraseColor(android.graphics.Color.parseColor("#CCFDFDFD"));
        dVar.b(createBitmap);
        dVar.f510674b = dimensionPixelSize;
        dVar.f510675c = dimensionPixelSize2;
        uq5.b b17 = dVar.f510677e.f510726b.b();
        b17.d(40.0f);
        b17.e(5.0f);
        dVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.g(this));
        android.widget.ImageView imageView = this.f213730g;
        if (imageView != null) {
            imageView.setImageDrawable(new android.graphics.drawable.ColorDrawable(g17.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560030h)));
        }
        android.view.View view = this.f213728e;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRetryContainer");
            throw null;
        }
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.f(this));
        container.m63420x8e6544a(dialog);
        a();
        this.f213733j = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e(this);
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AnnounceWebViewDialogHelper", "showProgress");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15494xd57adead c15494xd57adead = this.f213725b;
        if (c15494xd57adead == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mWebViewContainer");
            throw null;
        }
        c15494xd57adead.setVisibility(4);
        android.view.View view = this.f213728e;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRetryContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f213727d;
        if (c22627xa933f8e4 != null) {
            c22627xa933f8e4.setVisibility(0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e42 = this.f213727d;
        if (c22627xa933f8e42 != null) {
            c22627xa933f8e42.d();
        }
    }
}

package oy2;

/* loaded from: classes8.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n0 f431469a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.FrameLayout f431470b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15494xd57adead f431471c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f431472d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f431473e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f431474f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f431475g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f431476h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077 f431477i;

    /* renamed from: j, reason: collision with root package name */
    public final android.content.Context f431478j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View.OnClickListener f431479k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca f431480l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f431481m;

    /* renamed from: n, reason: collision with root package name */
    public final oy2.u f431482n;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n0 dialogWrapper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialogWrapper, "dialogWrapper");
        this.f431469a = dialogWrapper;
        android.content.Context g17 = dialogWrapper.a().g();
        this.f431478j = g17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca l17 = dialogWrapper.a().l();
        this.f431480l = l17;
        android.view.View findViewById = l17.findViewById(com.p314xaae8f345.mm.R.id.bzg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f431470b = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = l17.findViewById(com.p314xaae8f345.mm.R.id.f569232pi0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f431471c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15494xd57adead) findViewById2;
        this.f431473e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) l17.findViewById(com.p314xaae8f345.mm.R.id.f566521g53);
        android.view.View findViewById3 = l17.findViewById(com.p314xaae8f345.mm.R.id.f566522g54);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f431474f = findViewById3;
        android.view.View findViewById4 = l17.findViewById(com.p314xaae8f345.mm.R.id.jun);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f431477i = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17262x2289077) findViewById4;
        this.f431475g = (android.widget.ImageView) l17.findViewById(com.p314xaae8f345.mm.R.id.f565289bz0);
        this.f431476h = (android.widget.ImageView) l17.findViewById(com.p314xaae8f345.mm.R.id.bzj);
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
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "setBlur", "(FF)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "setBlur", "(FF)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        createBitmap.eraseColor(android.graphics.Color.parseColor("#CCFDFDFD"));
        dVar.b(createBitmap);
        dVar.f510674b = dimensionPixelSize;
        dVar.f510675c = dimensionPixelSize2;
        uq5.b b17 = dVar.f510677e.f510726b.b();
        b17.d(40.0f);
        b17.e(5.0f);
        dVar.a(new oy2.y(this));
        android.widget.ImageView imageView = this.f431476h;
        if (imageView != null) {
            imageView.setImageDrawable(new android.graphics.drawable.ColorDrawable(g17.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560030h)));
        }
        android.widget.FrameLayout frameLayout = this.f431470b;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCloseView");
            throw null;
        }
        frameLayout.setOnClickListener(new oy2.v(this));
        android.view.View view = this.f431474f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRetryContainer");
            throw null;
        }
        view.setOnClickListener(new oy2.w(this));
        android.widget.FrameLayout frameLayout2 = this.f431470b;
        if (frameLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCloseView");
            throw null;
        }
        frameLayout2.setOnLongClickListener(new oy2.x(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca l18 = dialogWrapper.a().l();
        if (l18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15502x550b5136) {
            l18.m63420x8e6544a(dialogWrapper.a());
        } else if (l18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15501xbb059f5) {
            l18.m63420x8e6544a(dialogWrapper.a());
        }
        a();
        this.f431482n = new oy2.u(this);
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DialogScrollViewHelper", "showProgress");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15494xd57adead c15494xd57adead = this.f431471c;
        if (c15494xd57adead == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mWebViewContainer");
            throw null;
        }
        c15494xd57adead.setVisibility(4);
        android.view.View view = this.f431474f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRetryContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f431473e;
        if (c22627xa933f8e4 != null) {
            c22627xa933f8e4.setVisibility(0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e42 = this.f431473e;
        if (c22627xa933f8e42 != null) {
            c22627xa933f8e42.d();
        }
        this.f431480l.m63421xb79d55e9(true);
    }
}

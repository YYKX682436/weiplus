package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2144xc2a3071e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/danmuview/AdBulletScreenView;", "Landroid/widget/FrameLayout;", "Ls34/c;", "bulletInfo", "Ljz5/f0;", "setBulletScreenInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "r84/d", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView */
/* loaded from: classes4.dex */
public final class C17794x6bc92636 extends android.widget.FrameLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f245077t = 0;

    /* renamed from: d, reason: collision with root package name */
    public s34.c f245078d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2144xc2a3071e.C17793xff4d2215 f245079e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f245080f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f245081g;

    /* renamed from: h, reason: collision with root package name */
    public final int f245082h;

    /* renamed from: i, reason: collision with root package name */
    public final int f245083i;

    /* renamed from: m, reason: collision with root package name */
    public final int f245084m;

    /* renamed from: n, reason: collision with root package name */
    public final r84.f f245085n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f245086o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f245087p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Bitmap f245088q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Bitmap f245089r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Paint f245090s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17794x6bc92636(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final android.graphics.Bitmap a(android.graphics.drawable.Drawable drawable, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDrawableBitmap", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        try {
            drawable.setBounds(0, 0, getWidth(), i17);
            int width = getWidth();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/danmuview/AdBulletScreenView", "getDrawableBitmap", "(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/sns/ad/widget/danmuview/AdBulletScreenView", "getDrawableBitmap", "(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            drawable.draw(new android.graphics.Canvas(createBitmap));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDrawableBitmap", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
            return createBitmap;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdBulletScreenView", "getDrawableBitmap, exp=", th6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDrawableBitmap", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        try {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.dispatchDraw(canvas);
            if (getHeight() != 0) {
                android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if ((layoutParams != null && getHeight() == layoutParams.height) && (this.f245088q == null || this.f245089r == null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdBulletScreenView", "init mask bitmap");
                    this.f245088q = a(this.f245086o, (int) (getHeight() * 0.12f));
                    this.f245089r = a(this.f245087p, (int) (getHeight() * 0.36f));
                }
            }
            android.graphics.Bitmap bitmap = this.f245088q;
            android.graphics.Paint paint = this.f245090s;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            }
            android.graphics.Bitmap bitmap2 = this.f245088q;
            float height = bitmap2 != null ? bitmap2.getHeight() : 0;
            android.graphics.Bitmap bitmap3 = this.f245089r;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, 0.0f, height, paint);
            }
            canvas.restoreToCount(saveLayer);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdBulletScreenView", "dispatchDraw, exp=", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdBulletScreenView", "onDetachedFromWindow");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdBulletScreenView", "stopAnim");
        this.f245081g = false;
        this.f245080f = true;
        this.f245085n.removeCallbacksAndMessages(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
    }

    /* renamed from: setBulletScreenInfo */
    public final void m69581x7e6ee65e(s34.c bulletInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBulletScreenInfo", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bulletInfo, "bulletInfo");
        this.f245078d = bulletInfo;
        int a17 = bulletInfo.a();
        int i17 = this.f245082h;
        int i18 = this.f245084m;
        int i19 = (a17 * (i17 + i18)) - i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdBulletScreenView", "setBulletScreenInfo, vH=" + i19 + ", laoutParams.h=" + getLayoutParams().height);
        if (getLayoutParams().height != i19) {
            getLayoutParams().height = i19;
            this.f245088q = null;
            this.f245089r = null;
            requestLayout();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdBulletScreenView", "stopAnim");
        this.f245081g = false;
        this.f245080f = true;
        this.f245085n.removeCallbacksAndMessages(null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopAnim", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2144xc2a3071e.C17793xff4d2215 c17793xff4d2215 = this.f245079e;
        if (c17793xff4d2215 != null) {
            c17793xff4d2215.mo7960x6cab2c8d(new r84.d(bulletInfo, i17, this.f245083i, i18));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBulletScreenInfo", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17794x6bc92636(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f245082h = ca4.m0.s(25);
        this.f245083i = ca4.m0.s(100);
        this.f245084m = ca4.m0.s(3);
        this.f245085n = new r84.f(this, android.os.Looper.getMainLooper());
        this.f245086o = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.parseColor("#00FFFFFF"), android.graphics.Color.parseColor("#00FFFFFF")});
        this.f245087p = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.parseColor("#00FFFFFF"), android.graphics.Color.parseColor("#FFFFFFFF")});
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        this.f245090s = paint;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2144xc2a3071e.C17793xff4d2215 c17793xff4d2215 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2144xc2a3071e.C17793xff4d2215(context, null);
        c17793xff4d2215.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 1, false));
        this.f245079e = c17793xff4d2215;
        addView(c17793xff4d2215, new android.view.ViewGroup.LayoutParams(-1, -1));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView");
    }
}

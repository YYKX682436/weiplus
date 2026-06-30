package sj3;

/* loaded from: classes5.dex */
public final class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.u1 f490236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f490237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f490238f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f490239g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f490240h;

    public q1(sj3.u1 u1Var, android.graphics.Bitmap bitmap, int i17, int i18, java.lang.String str) {
        this.f490236d = u1Var;
        this.f490237e = bitmap;
        this.f490238f = i17;
        this.f490239g = i18;
        this.f490240h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator alpha;
        sj3.u1 u1Var = this.f490236d;
        android.widget.ImageView imageView = u1Var.f490291f;
        if (imageView != null) {
            imageView.setAlpha(1.0f);
        }
        android.graphics.Bitmap bitmap = u1Var.f490303r;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            android.graphics.Bitmap bitmap2 = u1Var.f490303r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap2);
            int height = bitmap2.getHeight();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 textureViewSurfaceTextureListenerC16577xc6e62da0 = u1Var.f490289d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textureViewSurfaceTextureListenerC16577xc6e62da0);
            int measuredWidth = textureViewSurfaceTextureListenerC16577xc6e62da0.getMeasuredWidth();
            int measuredHeight = textureViewSurfaceTextureListenerC16577xc6e62da0.getMeasuredHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(measuredHeight));
            arrayList.add(java.lang.Integer.valueOf(measuredWidth));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "drawPrevBitmap", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "drawPrevBitmap", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            int i17 = u1Var.f490304s;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
            if (i17 == 12) {
                matrix.setRotate(270.0f, width / 2.0f, height / 2.0f);
            } else if (i17 == 4) {
                matrix.setRotate(90.0f, width / 2.0f, height / 2.0f);
            }
            if (u1Var.f490305t == 16) {
                matrix.postScale(-1.0f, 1.0f);
                matrix.postTranslate(width, 0.0f);
            }
            matrix.postScale(canvas.getWidth() / height, canvas.getHeight() / width);
            android.graphics.Bitmap bitmap3 = u1Var.f490303r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap3);
            canvas.drawBitmap(bitmap3, matrix, u1Var.f490299n);
            android.widget.ImageView imageView2 = u1Var.f490291f;
            if (imageView2 != null) {
                imageView2.setImageBitmap(createBitmap);
            }
        }
        android.widget.ImageView imageView3 = u1Var.f490291f;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        android.widget.ImageView imageView4 = u1Var.f490291f;
        if (imageView4 != null) {
            imageView4.clearAnimation();
        }
        android.widget.ImageView imageView5 = u1Var.f490291f;
        if (imageView5 == null || (animate = imageView5.animate()) == null || (duration = animate.setDuration(300L)) == null || (alpha = duration.alpha(0.0f)) == null) {
            return;
        }
        alpha.setListener(new sj3.p1(this.f490236d, this.f490237e, this.f490238f, this.f490239g, this.f490240h));
    }
}

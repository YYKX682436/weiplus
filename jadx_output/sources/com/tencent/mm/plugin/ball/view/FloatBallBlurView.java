package com.tencent.mm.plugin.ball.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB!\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallBlurView;", "Landroid/widget/FrameLayout;", "", "url", "Ljz5/f0;", "setImageUrl", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "", "color", "setBottomMaskColor", "(Ljava/lang/Integer;)V", "d", "Ljz5/g;", "getBitmapTargetSize", "()I", "bitmapTargetSize", "e", "getDefaultBottomMaskColor", "defaultBottomMaskColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class FloatBallBlurView extends android.widget.FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f93459p = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g bitmapTargetSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g defaultBottomMaskColor;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f93462f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f93463g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f93464h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f93465i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f93466m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f93467n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f93468o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallBlurView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.bitmapTargetSize = jz5.h.b(new rp1.e0(this));
        this.defaultBottomMaskColor = jz5.h.b(new rp1.f0(this));
        this.f93465i = "";
        this.f93466m = true;
        d(null, 0);
    }

    public static final android.graphics.Bitmap a(com.tencent.mm.plugin.ball.view.FloatBallBlurView floatBallBlurView, java.lang.String str) {
        floatBallBlurView.getClass();
        int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(str).getOrientationInDegree();
        android.graphics.Bitmap M = com.tencent.mm.sdk.platformtools.x.M(str, floatBallBlurView.getBitmapTargetSize(), floatBallBlurView.getBitmapTargetSize(), true, null);
        if (M != null) {
            return com.tencent.mm.sdk.platformtools.x.w0(M, orientationInDegree);
        }
        return null;
    }

    private final int getBitmapTargetSize() {
        return ((java.lang.Number) this.bitmapTargetSize.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDefaultBottomMaskColor() {
        return ((java.lang.Number) this.defaultBottomMaskColor.getValue()).intValue();
    }

    public final void c(android.graphics.Bitmap bitmap, java.lang.String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            ym5.a1.f(new rp1.i0(this));
            return;
        }
        rp1.h0 h0Var = new rp1.h0(this);
        boolean z17 = true ^ (str == null || str.length() == 0);
        qp1.a aVar = qp1.a.f365680a;
        if (z17) {
            android.graphics.Bitmap bitmap2 = str == null ? null : (android.graphics.Bitmap) ((jt0.i) qp1.a.f365681b).get(str);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                h0Var.invoke(bitmap2);
                return;
            }
        }
        java.lang.System.currentTimeMillis();
        int max = java.lang.Math.max(bitmap.getWidth(), bitmap.getHeight());
        try {
            android.graphics.Bitmap W = com.tencent.mm.sdk.platformtools.x.W(bitmap, 0.1f, (int) (max <= 480 ? 15.0f : max <= 720 ? 30.0f : max <= 1080 ? 50.0f : max <= 1440 ? 70.0f : 80.0f), true, 500L);
            java.lang.System.currentTimeMillis();
            bitmap.getWidth();
            bitmap.getHeight();
            if (W == null || W.isRecycled()) {
                h0Var.invoke(null);
            } else {
                qp1.a.f365680a.a(str, W);
                h0Var.invoke(W);
            }
        } catch (java.lang.OutOfMemoryError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallBlurImageManager", e17, "blurBitmap oom", new java.lang.Object[0]);
            h0Var.invoke(null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallBlurImageManager", th6, "blurBitmap exception", new java.lang.Object[0]);
            h0Var.invoke(null);
        }
    }

    public final void d(android.util.AttributeSet attributeSet, int i17) {
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489203bo3, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483427at1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f93462f = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ofd);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f93463g = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ats);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f93464h = (android.widget.ImageView) findViewById3;
        android.widget.ImageView imageView = this.f93463g;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("mTopBlurMask");
            throw null;
        }
        imageView.setAlpha(0.0f);
        android.widget.ImageView imageView2 = this.f93464h;
        if (imageView2 != null) {
            imageView2.setAlpha(1.0f);
        } else {
            kotlin.jvm.internal.o.o("mBottomBlurMask");
            throw null;
        }
    }

    public final void e(android.graphics.Bitmap bitmap, java.lang.String str, boolean z17) {
        if (!z17) {
            c(bitmap, str);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new rp1.l0(this, bitmap, str));
    }

    public final void f() {
        java.lang.Integer num = this.f93467n;
        if (num == null) {
            android.widget.ImageView imageView = this.f93464h;
            if (imageView != null) {
                imageView.setBackgroundColor(getDefaultBottomMaskColor());
                return;
            } else {
                kotlin.jvm.internal.o.o("mBottomBlurMask");
                throw null;
            }
        }
        android.widget.ImageView imageView2 = this.f93464h;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("mBottomBlurMask");
            throw null;
        }
        kotlin.jvm.internal.o.d(num);
        imageView2.setBackgroundColor(num.intValue());
    }

    public final void setBitmap(android.graphics.Bitmap bitmap) {
        e(bitmap, null, true);
    }

    public final void setBottomMaskColor(java.lang.Integer color) {
        this.f93467n = color;
        f();
    }

    public final void setImageUrl(java.lang.String str) {
        boolean z17 = false;
        if (str == null || str.length() == 0) {
            ym5.a1.f(new rp1.i0(this));
            return;
        }
        if (!kotlin.jvm.internal.o.b(str, this.f93465i) || this.f93468o) {
            this.f93465i = str;
            if (r26.i0.y(str, "http", false) || r26.i0.A(this.f93465i, "https", false, 2, null)) {
                ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).aj(this.f93465i, null, 0, new rp1.k0(this));
                return;
            }
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(this.f93465i, false);
            if (!com.tencent.mm.vfs.w6.j(i17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallBlurView", "loadImageBitmap file not exist %s", i17);
                ym5.a1.f(new rp1.i0(this));
                return;
            }
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.tencent.mm.graphics.e.d(i17, options);
            rp1.m0 m0Var = new rp1.m0(this, i17);
            int i18 = options.outWidth;
            int i19 = options.outHeight;
            if (i18 <= 480 && i19 <= 480) {
                z17 = true;
            }
            if (z17) {
                m0Var.invoke();
            } else {
                ((ku5.t0) ku5.t0.f312615d).g(new rp1.j0(m0Var));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallBlurView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.bitmapTargetSize = jz5.h.b(new rp1.e0(this));
        this.defaultBottomMaskColor = jz5.h.b(new rp1.f0(this));
        this.f93465i = "";
        this.f93466m = true;
        d(attrs, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallBlurView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.bitmapTargetSize = jz5.h.b(new rp1.e0(this));
        this.defaultBottomMaskColor = jz5.h.b(new rp1.f0(this));
        this.f93465i = "";
        this.f93466m = true;
        d(attrs, i17);
    }
}

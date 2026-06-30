package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB!\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallBlurView;", "Landroid/widget/FrameLayout;", "", "url", "Ljz5/f0;", "setImageUrl", "Landroid/graphics/Bitmap;", "bitmap", "setBitmap", "", "color", "setBottomMaskColor", "(Ljava/lang/Integer;)V", "d", "Ljz5/g;", "getBitmapTargetSize", "()I", "bitmapTargetSize", "e", "getDefaultBottomMaskColor", "defaultBottomMaskColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.view.FloatBallBlurView */
/* loaded from: classes14.dex */
public final class C12922xc01b5b27 extends android.widget.FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f174992p = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g bitmapTargetSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g defaultBottomMaskColor;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f174995f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f174996g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f174997h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f174998i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f174999m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f175000n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f175001o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12922xc01b5b27(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.bitmapTargetSize = jz5.h.b(new rp1.e0(this));
        this.defaultBottomMaskColor = jz5.h.b(new rp1.f0(this));
        this.f174998i = "";
        this.f174999m = true;
        d(null, 0);
    }

    public static final android.graphics.Bitmap a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27 c12922xc01b5b27, java.lang.String str) {
        c12922xc01b5b27.getClass();
        int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str).m43592x7a249f0b();
        android.graphics.Bitmap M = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.M(str, c12922xc01b5b27.m54138x65275b37(), c12922xc01b5b27.m54138x65275b37(), true, null);
        if (M != null) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(M, m43592x7a249f0b);
        }
        return null;
    }

    /* renamed from: getBitmapTargetSize */
    private final int m54138x65275b37() {
        return ((java.lang.Number) this.bitmapTargetSize.mo141623x754a37bb()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getDefaultBottomMaskColor */
    public final int m54139xe9b46061() {
        return ((java.lang.Number) this.defaultBottomMaskColor.mo141623x754a37bb()).intValue();
    }

    public final void c(android.graphics.Bitmap bitmap, java.lang.String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            ym5.a1.f(new rp1.i0(this));
            return;
        }
        rp1.h0 h0Var = new rp1.h0(this);
        boolean z17 = true ^ (str == null || str.length() == 0);
        qp1.a aVar = qp1.a.f447213a;
        if (z17) {
            android.graphics.Bitmap bitmap2 = str == null ? null : (android.graphics.Bitmap) ((jt0.i) qp1.a.f447214b).get(str);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                h0Var.mo146xb9724478(bitmap2);
                return;
            }
        }
        java.lang.System.currentTimeMillis();
        int max = java.lang.Math.max(bitmap.getWidth(), bitmap.getHeight());
        try {
            android.graphics.Bitmap W = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.W(bitmap, 0.1f, (int) (max <= 480 ? 15.0f : max <= 720 ? 30.0f : max <= 1080 ? 50.0f : max <= 1440 ? 70.0f : 80.0f), true, 500L);
            java.lang.System.currentTimeMillis();
            bitmap.getWidth();
            bitmap.getHeight();
            if (W == null || W.isRecycled()) {
                h0Var.mo146xb9724478(null);
            } else {
                qp1.a.f447213a.a(str, W);
                h0Var.mo146xb9724478(W);
            }
        } catch (java.lang.OutOfMemoryError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallBlurImageManager", e17, "blurBitmap oom", new java.lang.Object[0]);
            h0Var.mo146xb9724478(null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallBlurImageManager", th6, "blurBitmap exception", new java.lang.Object[0]);
            h0Var.mo146xb9724478(null);
        }
    }

    public final void d(android.util.AttributeSet attributeSet, int i17) {
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570736bo3, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f564960at1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f174995f = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ofd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f174996g = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.ats);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f174997h = (android.widget.ImageView) findViewById3;
        android.widget.ImageView imageView = this.f174996g;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTopBlurMask");
            throw null;
        }
        imageView.setAlpha(0.0f);
        android.widget.ImageView imageView2 = this.f174997h;
        if (imageView2 != null) {
            imageView2.setAlpha(1.0f);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomBlurMask");
            throw null;
        }
    }

    public final void e(android.graphics.Bitmap bitmap, java.lang.String str, boolean z17) {
        if (!z17) {
            c(bitmap, str);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new rp1.l0(this, bitmap, str));
    }

    public final void f() {
        java.lang.Integer num = this.f175000n;
        if (num == null) {
            android.widget.ImageView imageView = this.f174997h;
            if (imageView != null) {
                imageView.setBackgroundColor(m54139xe9b46061());
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomBlurMask");
                throw null;
            }
        }
        android.widget.ImageView imageView2 = this.f174997h;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomBlurMask");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        imageView2.setBackgroundColor(num.intValue());
    }

    /* renamed from: setBitmap */
    public final void m54140x5854831(android.graphics.Bitmap bitmap) {
        e(bitmap, null, true);
    }

    /* renamed from: setBottomMaskColor */
    public final void m54141x57cdd2a(java.lang.Integer color) {
        this.f175000n = color;
        f();
    }

    /* renamed from: setImageUrl */
    public final void m54142x43560096(java.lang.String str) {
        boolean z17 = false;
        if (str == null || str.length() == 0) {
            ym5.a1.f(new rp1.i0(this));
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f174998i) || this.f175001o) {
            this.f174998i = str;
            if (r26.i0.y(str, "http", false) || r26.i0.A(this.f174998i, "https", false, 2, null)) {
                ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).aj(this.f174998i, null, 0, new rp1.k0(this));
                return;
            }
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(this.f174998i, false);
            if (!com.p314xaae8f345.mm.vfs.w6.j(i17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallBlurView", "loadImageBitmap file not exist %s", i17);
                ym5.a1.f(new rp1.i0(this));
                return;
            }
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.p314xaae8f345.mm.p786x600aa8b.e.d(i17, options);
            rp1.m0 m0Var = new rp1.m0(this, i17);
            int i18 = options.outWidth;
            int i19 = options.outHeight;
            if (i18 <= 480 && i19 <= 480) {
                z17 = true;
            }
            if (z17) {
                m0Var.mo152xb9724478();
            } else {
                ((ku5.t0) ku5.t0.f394148d).g(new rp1.j0(m0Var));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12922xc01b5b27(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.bitmapTargetSize = jz5.h.b(new rp1.e0(this));
        this.defaultBottomMaskColor = jz5.h.b(new rp1.f0(this));
        this.f174998i = "";
        this.f174999m = true;
        d(attrs, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12922xc01b5b27(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.bitmapTargetSize = jz5.h.b(new rp1.e0(this));
        this.defaultBottomMaskColor = jz5.h.b(new rp1.f0(this));
        this.f174998i = "";
        this.f174999m = true;
        d(attrs, i17);
    }
}

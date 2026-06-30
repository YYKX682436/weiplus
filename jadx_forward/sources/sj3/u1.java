package sj3;

/* loaded from: classes14.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f490286a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f490287b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f490288c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 f490289d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f490290e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f490291f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f490292g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f490293h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f490294i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.ImageView f490295j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.TextView f490296k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f490297l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f490298m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f490299n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f490300o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f490301p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Long f490302q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Bitmap f490303r;

    /* renamed from: s, reason: collision with root package name */
    public int f490304s;

    /* renamed from: t, reason: collision with root package name */
    public int f490305t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f490306u;

    public u1(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f490286a = rootView;
        this.f490290e = jz5.h.b(new sj3.o1(this));
        this.f490298m = zj3.j.g();
        this.f490293h = rootView.findViewById(com.p314xaae8f345.mm.R.id.jw7);
        this.f490287b = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.jxc);
        this.f490292g = rootView.findViewById(com.p314xaae8f345.mm.R.id.a_l);
        this.f490288c = rootView.getContext();
        this.f490289d = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0) rootView.findViewById(com.p314xaae8f345.mm.R.id.jx7);
        this.f490291f = (android.widget.ImageView) rootView.findViewById(com.p314xaae8f345.mm.R.id.jx6);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f490299n = paint;
        paint.setColor(-16777216);
        paint.setFilterBitmap(false);
        paint.setTextSize(40.0f);
        this.f490294i = rootView.findViewById(com.p314xaae8f345.mm.R.id.p7z);
        this.f490295j = (android.widget.ImageView) rootView.findViewById(com.p314xaae8f345.mm.R.id.jwk);
        this.f490296k = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.jwl);
    }

    public final boolean a(java.lang.String str, android.graphics.Bitmap bitmap, int i17, int i18) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f490301p, str) || this.f490303r == null || this.f490289d == null) {
            return false;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new sj3.q1(this, bitmap, i17, i18, str));
        return true;
    }

    public final void b(java.lang.String str) {
        ((ku5.t0) ku5.t0.f394148d).B(new sj3.r1(this, str));
    }

    public final synchronized boolean c(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (this.f490289d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkMiniVideoView", "drawAvatar view is null");
            return false;
        }
        if (this.f490306u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkMiniVideoView", "renderVideoBitmap img false cause isDoingAnimationChange");
            return false;
        }
        if (this.f490298m) {
            e().setVisibility(0);
            android.widget.TextView textView = this.f490287b;
            if (textView != null) {
                textView.setVisibility(0);
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Di(e(), userName);
            b(userName);
            return true;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 c17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 textureViewSurfaceTextureListenerC16577xc6e62da0 = this.f490289d;
        int measuredWidth = textureViewSurfaceTextureListenerC16577xc6e62da0 != null ? textureViewSurfaceTextureListenerC16577xc6e62da0.getMeasuredWidth() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 textureViewSurfaceTextureListenerC16577xc6e62da02 = this.f490289d;
        android.graphics.Bitmap Zg = c17.Zg(userName, measuredWidth, textureViewSurfaceTextureListenerC16577xc6e62da02 != null ? textureViewSurfaceTextureListenerC16577xc6e62da02.getMeasuredHeight() : 0, 1);
        if (Zg != null && Zg.getHeight() < Zg.getWidth()) {
            int height = Zg.getHeight();
            int height2 = Zg.getHeight();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height2));
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(0);
            arrayList.add(0);
            arrayList.add(Zg);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "drawAvatar", "(Ljava/lang/String;)Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "drawAvatar", "(Ljava/lang/String;)Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            Zg = createBitmap;
        }
        if (Zg != null) {
            if (!a(userName, Zg, 0, 0)) {
                d(Zg, 0, 0);
                b(userName);
                this.f490297l = false;
            }
            return true;
        }
        android.graphics.Bitmap m10969xb866ec1c = bp.b.m10969xb866ec1c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), com.p314xaae8f345.mm.R.raw.f78922x61de8d17, null);
        if (!a(userName, Zg, 0, 0)) {
            d(m10969xb866ec1c, 0, 0);
            b(userName);
            this.f490297l = false;
        }
        return true;
    }

    public final synchronized void d(android.graphics.Bitmap bitmap, int i17, int i18) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                if (this.f490298m) {
                    android.widget.ImageView e17 = e();
                    if (e17 != null) {
                        e17.setImageBitmap(bitmap);
                    }
                    return;
                }
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 textureViewSurfaceTextureListenerC16577xc6e62da0 = this.f490289d;
                if (textureViewSurfaceTextureListenerC16577xc6e62da0 == null) {
                    return;
                }
                android.graphics.Canvas lockCanvas = textureViewSurfaceTextureListenerC16577xc6e62da0.lockCanvas(null);
                if (lockCanvas == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkMiniVideoView", "getCanvasError");
                    return;
                }
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
                if (i17 == 12) {
                    matrix.setRotate(270.0f, width / 2.0f, height / 2.0f);
                } else if (i17 == 4) {
                    matrix.setRotate(90.0f, width / 2.0f, height / 2.0f);
                }
                if (i18 == 16) {
                    matrix.postScale(-1.0f, 1.0f);
                    matrix.postTranslate(width, 0.0f);
                }
                matrix.postScale(lockCanvas.getWidth() / height, lockCanvas.getHeight() / width);
                lockCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                if (!bitmap.isRecycled()) {
                    try {
                        lockCanvas.drawBitmap(bitmap, matrix, this.f490299n);
                        this.f490304s = i17;
                        this.f490305t = i18;
                        this.f490303r = bitmap;
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkMiniVideoView", "draw bitmap error");
                    }
                }
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 textureViewSurfaceTextureListenerC16577xc6e62da02 = this.f490289d;
                    if (textureViewSurfaceTextureListenerC16577xc6e62da02 != null) {
                        textureViewSurfaceTextureListenerC16577xc6e62da02.unlockCanvasAndPost(lockCanvas);
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MultiTalkMiniVideoView", e18, "drawBitmap unlockCanvasAndPost crash", new java.lang.Object[0]);
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkMiniVideoView", "DrawBitmap, bitmap is null or recycled");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(220L, 27L, 1L, false);
    }

    public final android.widget.ImageView e() {
        return (android.widget.ImageView) ((jz5.n) this.f490290e).mo141623x754a37bb();
    }

    public final void f(int i17) {
        android.view.View view = this.f490292g;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "hideView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "hideView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void g(java.lang.String str) {
        java.lang.Long valueOf;
        if (this.f490298m && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f490300o)) {
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 textureViewSurfaceTextureListenerC16577xc6e62da0 = this.f490289d;
                if (textureViewSurfaceTextureListenerC16577xc6e62da0 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
                    if (n17 != null) {
                        n17.l(textureViewSurfaceTextureListenerC16577xc6e62da0, str != null ? str : "");
                    }
                    e().setVisibility(8);
                    android.widget.TextView textView = this.f490287b;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    this.f490297l = false;
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 textureViewSurfaceTextureListenerC16577xc6e62da02 = this.f490289d;
                if (textureViewSurfaceTextureListenerC16577xc6e62da02 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n18 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
                    if (n18 != null) {
                        java.lang.String str2 = this.f490300o;
                        if (str2 == null) {
                            str2 = "";
                        }
                        n18.l(textureViewSurfaceTextureListenerC16577xc6e62da02, str2);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n19 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
                    if (n19 != null) {
                        n19.a(textureViewSurfaceTextureListenerC16577xc6e62da02, str != null ? str : "");
                    }
                    textureViewSurfaceTextureListenerC16577xc6e62da02.m67063x60d7080c(new sj3.t1(this, str));
                }
            }
        }
        if (str == null) {
            valueOf = null;
            this.f490303r = null;
            this.f490305t = -1;
            this.f490304s = -1;
        } else {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            valueOf = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
        }
        this.f490302q = valueOf;
        this.f490300o = str;
    }
}

package uj3;

/* loaded from: classes14.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f509927a;

    /* renamed from: b, reason: collision with root package name */
    public final uj3.b f509928b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a f509929c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f509930d;

    /* renamed from: e, reason: collision with root package name */
    public int f509931e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f509932f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f509933g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f509934h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Long f509935i;

    /* renamed from: j, reason: collision with root package name */
    public final android.content.Context f509936j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.ImageView f509937k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f509938l;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.RelativeLayout f509939m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f509940n;

    public z(android.widget.RelativeLayout rootView, uj3.b statusManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusManager, "statusManager");
        this.f509927a = rootView;
        this.f509928b = statusManager;
        android.content.Context context = rootView.getContext();
        this.f509936j = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c3k, rootView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
        this.f509939m = relativeLayout;
        this.f509929c = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a) relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.jx7);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f509932f = paint;
        paint.setColor(-16777216);
        paint.setFilterBitmap(true);
        paint.setTextSize(40.0f);
        this.f509930d = (android.widget.ImageView) relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.a9z);
        this.f509937k = (android.widget.ImageView) relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.p5h);
        this.f509938l = relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.p5i);
    }

    public final void a(int i17) {
        android.widget.RelativeLayout relativeLayout;
        java.lang.String str;
        uj3.b bVar = this.f509928b;
        if (bVar.b() != 0 || (relativeLayout = this.f509939m) == null) {
            return;
        }
        if (i17 != 180) {
            android.widget.RelativeLayout relativeLayout2 = this.f509927a;
            android.view.View view = this.f509938l;
            if (i17 == 0) {
                android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.removeRule(21);
                layoutParams2.removeRule(20);
                layoutParams2.removeRule(10);
                layoutParams2.removeRule(12);
                layoutParams2.addRule(10, -1);
                layoutParams2.addRule(21, -1);
                relativeLayout.setLayoutParams(layoutParams2);
                relativeLayout.requestLayout();
                if (view != null) {
                    android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
                    layoutParams4.removeRule(21);
                    layoutParams4.removeRule(20);
                    layoutParams4.removeRule(10);
                    layoutParams4.removeRule(12);
                    layoutParams4.addRule(12, -1);
                    layoutParams4.addRule(21, -1);
                    layoutParams4.setMarginEnd(sj3.i1.f490091c / 2);
                    view.setLayoutParams(layoutParams4);
                    view.requestLayout();
                }
                if (bVar.b() == 0) {
                    android.view.ViewGroup.LayoutParams layoutParams5 = relativeLayout2.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
                    layoutParams6.removeRule(21);
                    layoutParams6.removeRule(20);
                    layoutParams6.removeRule(10);
                    layoutParams6.removeRule(12);
                    layoutParams6.addRule(21, -1);
                    layoutParams6.addRule(10, -1);
                    layoutParams6.bottomMargin = 0;
                    layoutParams6.setMarginEnd(sj3.i1.f490094f);
                    relativeLayout2.setLayoutParams(layoutParams6);
                    relativeLayout2.requestLayout();
                }
            } else if (i17 == 90) {
                android.view.ViewGroup.LayoutParams layoutParams7 = relativeLayout.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) layoutParams7;
                layoutParams8.removeRule(21);
                layoutParams8.removeRule(20);
                layoutParams8.removeRule(10);
                layoutParams8.removeRule(12);
                layoutParams8.addRule(20, -1);
                layoutParams8.addRule(10, -1);
                relativeLayout.setLayoutParams(layoutParams8);
                relativeLayout.requestLayout();
                if (view != null) {
                    android.view.ViewGroup.LayoutParams layoutParams9 = view.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams9, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    android.widget.RelativeLayout.LayoutParams layoutParams10 = (android.widget.RelativeLayout.LayoutParams) layoutParams9;
                    layoutParams10.removeRule(21);
                    layoutParams10.removeRule(20);
                    layoutParams10.removeRule(10);
                    layoutParams10.removeRule(12);
                    layoutParams10.addRule(10, -1);
                    layoutParams10.addRule(21, -1);
                    layoutParams10.setMarginEnd(sj3.i1.f490091c / 2);
                    view.setLayoutParams(layoutParams10);
                    view.requestLayout();
                }
                if (bVar.b() == 0) {
                    android.view.ViewGroup.LayoutParams layoutParams11 = relativeLayout2.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams11, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    android.widget.RelativeLayout.LayoutParams layoutParams12 = (android.widget.RelativeLayout.LayoutParams) layoutParams11;
                    layoutParams12.removeRule(21);
                    layoutParams12.removeRule(20);
                    layoutParams12.removeRule(10);
                    layoutParams12.removeRule(12);
                    layoutParams12.setMarginStart(sj3.i1.f490094f);
                    layoutParams12.bottomMargin = 0;
                    layoutParams12.addRule(20, -1);
                    layoutParams12.addRule(10, -1);
                    relativeLayout2.setLayoutParams(layoutParams12);
                    relativeLayout2.requestLayout();
                }
            } else if (i17 == 270) {
                android.view.ViewGroup.LayoutParams layoutParams13 = relativeLayout.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams13, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams14 = (android.widget.RelativeLayout.LayoutParams) layoutParams13;
                layoutParams14.removeRule(21);
                layoutParams14.removeRule(20);
                layoutParams14.removeRule(10);
                layoutParams14.removeRule(12);
                layoutParams14.addRule(21, -1);
                layoutParams14.addRule(12, -1);
                relativeLayout.setLayoutParams(layoutParams14);
                relativeLayout.requestLayout();
                if (bVar.b() == 0) {
                    android.view.ViewGroup.LayoutParams layoutParams15 = relativeLayout2.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams15, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    android.widget.RelativeLayout.LayoutParams layoutParams16 = (android.widget.RelativeLayout.LayoutParams) layoutParams15;
                    layoutParams16.removeRule(21);
                    layoutParams16.removeRule(20);
                    layoutParams16.removeRule(10);
                    layoutParams16.removeRule(12);
                    layoutParams16.bottomMargin = sj3.i1.f490102n;
                    layoutParams16.addRule(21, -1);
                    layoutParams16.addRule(12, -1);
                    relativeLayout2.setLayoutParams(layoutParams16);
                    relativeLayout2.requestLayout();
                }
                if (view != null) {
                    android.view.ViewGroup.LayoutParams layoutParams17 = view.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams17, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    android.widget.RelativeLayout.LayoutParams layoutParams18 = (android.widget.RelativeLayout.LayoutParams) layoutParams17;
                    layoutParams18.removeRule(21);
                    layoutParams18.removeRule(20);
                    layoutParams18.removeRule(10);
                    layoutParams18.removeRule(12);
                    layoutParams18.addRule(12, -1);
                    layoutParams18.addRule(20, -1);
                    layoutParams18.setMarginStart(sj3.i1.f490091c / 2);
                    view.setLayoutParams(layoutParams18);
                    view.requestLayout();
                }
            }
        }
        if (this.f509931e != 1 && (str = this.f509933g) != null) {
            d(str);
        }
        if (i17 != 180) {
            android.widget.ImageView imageView = this.f509930d;
            if (imageView != null) {
                imageView.setRotation(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 - i17);
            }
            android.widget.ImageView imageView2 = this.f509937k;
            if (imageView2 == null) {
                return;
            }
            imageView2.setRotation(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 - i17);
        }
    }

    public final boolean b(java.lang.String str) {
        java.lang.Long valueOf;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectAvatarCellLayout", "changeRenderAnimation %s ", str);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509934h, str) || this.f509929c == null || this.f509931e == 0) {
            return false;
        }
        if (str == null) {
            valueOf = null;
        } else {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            valueOf = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
        }
        this.f509935i = valueOf;
        this.f509933g = str;
        this.f509934h = str;
        this.f509940n = true;
        ((ku5.t0) ku5.t0.f394148d).B(new uj3.s(this, str));
        this.f509931e = 0;
        return true;
    }

    public final boolean c(java.lang.String str, android.graphics.Bitmap bitmap, int i17, int i18, int i19) {
        java.lang.Long valueOf;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectAvatarCellLayout", "changeRenderAnimation %s and target is %s", str, java.lang.Integer.valueOf(i19));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509934h, str) || this.f509929c == null || this.f509931e == 1) {
            return false;
        }
        if (str == null) {
            valueOf = null;
        } else {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            valueOf = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
        }
        this.f509935i = valueOf;
        this.f509933g = str;
        this.f509934h = str;
        this.f509940n = true;
        ((ku5.t0) ku5.t0.f394148d).B(new uj3.v(this, bitmap, i17, i18, str));
        return true;
    }

    public final synchronized boolean d(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (this.f509929c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenProjectAvatarCellLayout", "drawAvatar view is null");
            return false;
        }
        if (this.f509940n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenProjectAvatarCellLayout", "renderVideoBitmap img false cause isDoingAnimationChange");
            return false;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Di(this.f509930d, userName);
        if (!b(userName)) {
            android.widget.ImageView imageView = this.f509930d;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = this.f509929c;
            if (c18930xb402610a != null) {
                c18930xb402610a.setVisibility(8);
            }
            ((ku5.t0) ku5.t0.f394148d).B(new uj3.w(this, userName));
        }
        return true;
    }

    public final synchronized void e(android.graphics.Bitmap bitmap, int i17, int i18, int i19) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = this.f509929c;
                if (c18930xb402610a == null) {
                    return;
                }
                android.graphics.Canvas lockCanvas = c18930xb402610a.lockCanvas(null);
                if (lockCanvas == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenProjectAvatarCellLayout", "getCanvasError");
                    return;
                }
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                int e17 = this.f509928b.e();
                if (i19 == 1) {
                    if (e17 == 90 || e17 == 270) {
                        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
                        if (i17 == 12) {
                            matrix.setRotate(-90.0f, width / 2.0f, height / 2.0f);
                        } else if (i17 == 4) {
                            matrix.setRotate(-270.0f, width / 2.0f, height / 2.0f);
                        }
                    } else {
                        int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
                        if (i17 == 12) {
                            matrix.setRotate(270.0f, width / 2.0f, height / 2.0f);
                        } else if (i17 == 4) {
                            matrix.setRotate(90.0f, width / 2.0f, height / 2.0f);
                        }
                    }
                } else if (this.f509928b.b() == 0) {
                    matrix.setRotate(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 - e17, width / 2.0f, height / 2.0f);
                }
                int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
                if (i18 == 16) {
                    matrix.postScale(-1.0f, 1.0f);
                    matrix.postTranslate(width, 0.0f);
                }
                matrix.postScale(lockCanvas.getWidth() / height, lockCanvas.getHeight() / width);
                lockCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                if (!bitmap.isRecycled()) {
                    try {
                        lockCanvas.drawBitmap(bitmap, matrix, this.f509932f);
                        this.f509931e = i19;
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenProjectAvatarCellLayout", "draw bitmap error");
                    }
                }
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a2 = this.f509929c;
                    if (c18930xb402610a2 != null) {
                        c18930xb402610a2.unlockCanvasAndPost(lockCanvas);
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScreenProjectAvatarCellLayout", e18, "drawBitmap unlockCanvasAndPost crash", new java.lang.Object[0]);
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenProjectAvatarCellLayout", "DrawBitmap, bitmap is null or recycled");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(220L, 27L, 1L, false);
    }

    public final void f() {
        uj3.b bVar = this.f509928b;
        if (bVar.e() == 90 || bVar.e() == 270) {
            int i17 = sj3.i1.f490104p;
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i17, i17);
            if (bVar.c()) {
                layoutParams.setMarginEnd(sj3.i1.f490102n);
            } else {
                layoutParams.setMarginEnd(sj3.i1.f490094f);
            }
            layoutParams.addRule(21);
            this.f509927a.setLayoutParams(layoutParams);
        }
    }
}

package bp4;

/* loaded from: classes10.dex */
public final class k0 extends yt3.a implements android.view.View.OnClickListener {
    public boolean A;
    public final ru3.o B;
    public final bp4.c0 C;
    public bp4.c0 D;
    public long E;
    public final bp4.w2 F;
    public bp4.a3 G;
    public int H;
    public final com.tencent.mm.plugin.vlog.model.c0 I;

    /* renamed from: J, reason: collision with root package name */
    public long f23209J;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropLayout f23210f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout f23211g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f23212h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f23213i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.videocomposition.play.VideoCompositionPlayView f23214m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.model.h1 f23215n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.RectF f23216o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f23217p;

    /* renamed from: q, reason: collision with root package name */
    public final jp4.a f23218q;

    /* renamed from: r, reason: collision with root package name */
    public ml5.h f23219r;

    /* renamed from: s, reason: collision with root package name */
    public long f23220s;

    /* renamed from: t, reason: collision with root package name */
    public long f23221t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.RectF f23222u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.model.u0 f23223v;

    /* renamed from: w, reason: collision with root package name */
    public int f23224w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f23225x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f23226y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.Rect f23227z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropLayout layout, com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout operationLayout, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(operationLayout, "operationLayout");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23210f = layout;
        this.f23211g = operationLayout;
        this.f23212h = layout.getContext();
        android.view.ViewParent parent = layout.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        this.f23213i = viewGroup;
        this.f23216o = new android.graphics.RectF();
        this.f23217p = new java.util.LinkedList();
        this.f23218q = new jp4.a();
        this.f23221t = -1L;
        this.f23222u = new android.graphics.RectF();
        this.f23225x = new android.widget.TextView(viewGroup.getContext());
        this.f23226y = "";
        this.f23227z = new android.graphics.Rect();
        this.B = ru3.o.f399764e;
        this.C = new bp4.j0(this, status);
        this.H = -1;
        this.I = new com.tencent.mm.plugin.vlog.model.c0();
        layout.setHasBorder(false);
        layout.setEnableScale(true);
        layout.setEnableFling(true);
        layout.setEnableTouch(true);
        layout.setEnableOverScroll(false);
        layout.setBackgroundColor(0);
        bp4.w2 w2Var = new bp4.w2(new bp4.y(this, status));
        this.F = w2Var;
        L(w2Var);
        operationLayout.showGridLine = false;
        operationLayout.setVisibility(8);
        operationLayout.setBlockOutsideTouch(true);
    }

    public static /* synthetic */ void K(bp4.k0 k0Var, boolean z17, boolean z18, boolean z19, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        if ((i17 & 4) != 0) {
            z19 = false;
        }
        if ((i17 & 8) != 0) {
            j17 = -1;
        }
        k0Var.J(z17, z18, z19, j17);
    }

    public final void A() {
        if (this.f23214m == null) {
            android.content.Context context = this.f23212h;
            kotlin.jvm.internal.o.f(context, "context");
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = new com.tencent.mm.videocomposition.play.VideoCompositionPlayView(context);
            this.f23214m = videoCompositionPlayView;
            videoCompositionPlayView.setPlayerCallback(new bp4.d0(this));
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView2 = this.f23214m;
            if (videoCompositionPlayView2 != null) {
                videoCompositionPlayView2.setPlayerProfileCallback(new bp4.e0(this));
            }
        }
    }

    public final void B() {
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = this.f23214m;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.e();
        }
    }

    public final android.graphics.Rect C() {
        android.graphics.Rect rect;
        bp4.a3 a3Var = this.G;
        if (a3Var != null) {
            bp4.w2 w2Var = (bp4.w2) a3Var;
            rect = new android.graphics.Rect();
            ((bp4.y) w2Var.f23402d).f23427a.f23210f.getVisibilityRect().round(rect);
            android.graphics.RectF rectF = w2Var.f23407i;
            rect.offset(-((int) rectF.left), -((int) rectF.top));
        } else {
            rect = null;
        }
        if (rect != null) {
            return rect;
        }
        com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropLayout multiEditCropLayout = this.f23210f;
        android.graphics.Rect contentRect = multiEditCropLayout.getContentRect();
        android.graphics.RectF visibilityRect = multiEditCropLayout.getVisibilityRect();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        visibilityRect.round(rect2);
        float width = (contentRect.width() * 1.0f) / multiEditCropLayout.getContentOriginalRect().width();
        return new android.graphics.Rect((int) ((rect2.left - contentRect.left) / width), (int) ((rect2.top - contentRect.top) / width), (int) ((rect2.width() + r0) / width), (int) ((rect2.height() + r4) / width));
    }

    public final com.tencent.mm.plugin.vlog.model.y D(java.lang.String path) {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        com.tencent.mm.plugin.vlog.model.y yVar;
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.vlog.model.u0 u0Var = this.f23223v;
        if (u0Var != null && (linkedList = u0Var.f175733g) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.vlog.model.i1) obj).f175616a, path)) {
                    break;
                }
            }
            com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) obj;
            if (i1Var != null && (yVar = i1Var.f175624i) != null) {
                return yVar;
            }
        }
        return new com.tencent.mm.plugin.vlog.model.y();
    }

    public final android.graphics.RectF E() {
        return this.f23216o;
    }

    public final void F() {
        this.f23211g.setVisibility(8);
    }

    public final void G() {
        this.f23211g.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.mm.plugin.vlog.model.y H(ym5.x2 drawingView, java.lang.String mediaPath, boolean z17) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(drawingView, "drawingView");
        kotlin.jvm.internal.o.g(mediaPath, "mediaPath");
        com.tencent.mm.plugin.vlog.model.i1 i1Var = null;
        this.G = null;
        com.tencent.mm.plugin.vlog.model.u0 u0Var = this.f23223v;
        if (u0Var != null && (linkedList = u0Var.f175733g) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.vlog.model.i1) next).f175616a, mediaPath)) {
                    i1Var = next;
                    break;
                }
            }
            i1Var = i1Var;
        }
        com.tencent.mm.plugin.vlog.model.i1 i1Var2 = i1Var;
        this.f23226y = mediaPath;
        long j17 = i1Var2 != null ? i1Var2.f175619d : 0L;
        if ((j17 != this.f23221t || z17) && i1Var2 != null) {
            this.f23221t = j17;
            com.tencent.mars.xlog.Log.i("MicroMsg.EditMultiPreviewPlugin", "onPreviewImage");
            com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropLayout multiEditCropLayout = this.f23210f;
            multiEditCropLayout.E(true);
            if (!this.A) {
                multiEditCropLayout.setEnableScale(true);
            }
            com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout.d(this.f23211g, 0, 0L, 2, null);
            int i17 = i1Var2.f175621f;
            int i18 = i1Var2.f175622g;
            android.graphics.RectF visibilityRect = multiEditCropLayout.getVisibilityRect();
            android.graphics.RectF rectF = this.f23222u;
            visibilityRect.set(rectF);
            boolean z18 = this.A;
            com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout multiEditCropOperationLayout = this.f23211g;
            if (!z18) {
                multiEditCropOperationLayout.getVisibilityRect().set(rectF);
            }
            if (0 == this.f23220s) {
                this.f23220s = j17;
            }
            long j18 = this.f23220s;
            if (j18 == j17 || j18 == 0) {
                multiEditCropOperationLayout.setStyle(this.B);
            } else {
                multiEditCropOperationLayout.setStyle(ru3.o.f399765f);
            }
            com.tencent.mm.plugin.vlog.model.y yVar = i1Var2.f175624i;
            multiEditCropLayout.setMaxScaleValue(yVar.f175789f);
            multiEditCropLayout.setMinScaleValue(yVar.f175790g);
            this.f23210f.G(drawingView, i17, i18, yVar.f175784a, ml5.k.f328430d, new bp4.f0(multiEditCropLayout.getContentRect().isEmpty()));
            if (yVar.f175788e > 0.0f) {
                ((l45.n) drawingView.getPresenter()).f316460a.getBaseBoardView().setInitScale(1 / yVar.f175788e);
            }
            multiEditCropOperationLayout.setOnOperationCallback(new bp4.g0(this, j17, i1Var2));
            multiEditCropLayout.setOnChangeListener(new bp4.h0(i1Var2, drawingView, this));
            multiEditCropLayout.setClickListener(this);
            if (!this.A) {
                multiEditCropOperationLayout.setVisibility(0);
            }
            z();
            P();
            return yVar;
        }
        return D(mediaPath);
    }

    public final void I(boolean z17) {
        K(this, z17, true, false, 0L, 12, null);
    }

    public final void J(boolean z17, boolean z18, boolean z19, long j17) {
        int i17;
        bp4.c0 c0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditMultiPreviewPlugin", "onUpdateVideo, playAfterUpdate:" + z18 + ", seekToOriginPosition:" + z19 + ", seekTo:" + j17);
        this.f23226y = "";
        A();
        this.f23221t = -1L;
        com.tencent.mm.plugin.vlog.model.u0 u0Var = this.f23223v;
        com.tencent.mm.plugin.vlog.model.h1 h1Var = u0Var != null ? u0Var.f175743t : null;
        this.f23215n = h1Var;
        if (h1Var != null) {
            h1Var.d(!z17);
        }
        com.tencent.mm.plugin.vlog.model.h1 h1Var2 = this.f23215n;
        if (h1Var2 != null) {
            for (bp4.z zVar : this.f23217p) {
                if (zVar instanceof bp4.b0) {
                    ((bp4.b0) zVar).b(h1Var2, j17, z19);
                }
            }
        }
        bp4.a3 a3Var = this.G;
        if (a3Var != null) {
            ((bp4.w2) a3Var).f23409n = false;
        }
        bp4.w2 w2Var = this.F;
        this.G = w2Var;
        com.tencent.mm.plugin.vlog.model.u0 u0Var2 = this.f23223v;
        if (u0Var2 != null) {
            new android.util.Size(u0Var2.f175736m, u0Var2.f175737n);
        }
        w2Var.f23411p = this.D;
        bp4.a3 a3Var2 = this.G;
        if (a3Var2 != null) {
            ((bp4.w2) a3Var2).f23409n = true;
        }
        bp4.i0 i0Var = new bp4.i0(this);
        com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout multiEditCropOperationLayout = this.f23211g;
        multiEditCropOperationLayout.setOnOperationCallback(i0Var);
        com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropLayout multiEditCropLayout = this.f23210f;
        multiEditCropLayout.setClickListener(this);
        bp4.a3 a3Var3 = this.G;
        multiEditCropLayout.setOnChangeListener(a3Var3 != null ? ((bp4.w2) a3Var3).f23413r : null);
        com.tencent.mm.plugin.vlog.model.h1 h1Var3 = this.f23215n;
        if (h1Var3 != null) {
            int i18 = this.H;
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogComposition", "setFpsUpperLimit:" + i18);
            if (i18 > 0) {
                h1Var3.f175604j = i18;
            }
        }
        bp4.a3 a3Var4 = this.G;
        if (a3Var4 != null) {
            com.tencent.mm.plugin.vlog.model.h1 h1Var4 = this.f23215n;
            kotlin.jvm.internal.o.d(h1Var4);
            bp4.w2 w2Var2 = (bp4.w2) a3Var4;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUpdate: playRange:");
            sb6.append(h1Var4.i());
            sb6.append(", trackList.size:");
            java.util.ArrayList arrayList = h1Var4.f175597c;
            sb6.append(arrayList.size());
            sb6.append(", playAfterUpdate:");
            sb6.append(z18);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = w2Var2.f23403e;
            com.tencent.mars.xlog.Log.i(str, sb7);
            bp4.y yVar = (bp4.y) w2Var2.f23402d;
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView a17 = yVar.a();
            android.view.ViewParent parent = a17.getParent();
            bp4.k0 k0Var = yVar.f23427a;
            if (!kotlin.jvm.internal.o.b(parent, k0Var.f23213i)) {
                android.view.ViewParent parent2 = a17.getParent();
                android.view.ViewGroup viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
                if (viewGroup != null) {
                    viewGroup.removeView(a17);
                }
                a17.setScaleX(1.0f);
                a17.setScaleY(1.0f);
                a17.setTranslationX(0.0f);
                a17.setTranslationY(0.0f);
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("videoView size width:");
                android.graphics.RectF rectF = w2Var2.f23407i;
                sb8.append(rectF.width());
                sb8.append(" height:");
                sb8.append(rectF.height());
                com.tencent.mars.xlog.Log.i(str, sb8.toString());
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams((int) rectF.width(), (int) rectF.height());
                layoutParams.topMargin = (int) rectF.top;
                layoutParams.addRule(14);
                k0Var.f23213i.addView(a17, 0, layoutParams);
            }
            if (!w2Var2.f23410o) {
                android.graphics.RectF visibilityRect = k0Var.f23210f.getVisibilityRect();
                android.graphics.RectF rectF2 = w2Var2.f23408m;
                visibilityRect.set(rectF2);
                k0Var.f23211g.getVisibilityRect().set(rectF2);
            }
            w2Var2.f23406h = h1Var4;
            w2Var2.f23405g = (com.tencent.mm.plugin.vlog.model.i1) kz5.n0.a0(arrayList, 0);
            w2Var2.a();
            if (z18 && !z19 && j17 == -1) {
                yVar.a().o(h1Var4.e());
                k0Var.f23211g.postDelayed(new bp4.t2(w2Var2), 3000L);
                i17 = 0;
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1468L, 10L);
                yVar.a().q(h1Var4.e(), z18, z19, j17);
                com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout multiEditCropOperationLayout2 = k0Var.f23211g;
                android.animation.ValueAnimator valueAnimator = multiEditCropOperationLayout2.T;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                i17 = 0;
                multiEditCropOperationLayout2.f155924y = 0;
                multiEditCropOperationLayout2.invalidate();
            }
        } else {
            i17 = 0;
        }
        if (!this.A) {
            multiEditCropOperationLayout.setVisibility(i17);
        }
        if (z18 && (c0Var = this.D) != null) {
            c0Var.resume();
        }
        z();
    }

    public final void L(bp4.z callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.LinkedList linkedList = this.f23217p;
        if (linkedList.contains(callback)) {
            return;
        }
        linkedList.add(callback);
    }

    public final void M(long j17) {
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = this.f23214m;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.j(j17);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1468L, 0L);
    }

    public final void N(long j17, long j18) {
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = this.f23214m;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.k(j17, j18);
        }
    }

    public final void O(android.graphics.RectF rect) {
        kotlin.jvm.internal.o.g(rect, "rect");
        bp4.w2 w2Var = this.F;
        w2Var.getClass();
        w2Var.f23408m.set(rect);
        this.f23222u.set(rect);
        if (this.A) {
            return;
        }
        com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout multiEditCropOperationLayout = this.f23211g;
        multiEditCropOperationLayout.getVisibilityRect().set(rect);
        multiEditCropOperationLayout.postInvalidate();
        multiEditCropOperationLayout.setVisibility(0);
    }

    public final void P() {
        bp4.a3 a3Var = this.G;
        jz5.f0 f0Var = null;
        if (a3Var != null) {
            bp4.w2 w2Var = (bp4.w2) a3Var;
            so4.g gVar = so4.g.f410776a;
            com.tencent.mm.plugin.vlog.model.i1 i1Var = w2Var.f23405g;
            ((bp4.y) w2Var.f23402d).f23427a.f23225x.setText(dp4.b.f242262a.b(gVar.a(i1Var != null ? i1Var.f175616a : null)));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            if (this.f23226y.length() > 0) {
                this.f23225x.setText(dp4.b.f242262a.b(so4.g.f410776a.a(this.f23226y)));
            }
        }
    }

    public final void Q(boolean z17, boolean z18, boolean z19) {
        int i17;
        float f17;
        bp4.w2 w2Var;
        bp4.k0 k0Var = this;
        android.content.Context context = k0Var.f23212h;
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(context);
        int i18 = h17.x;
        int i19 = h17.y;
        android.util.Size size = new android.util.Size(i18, i19);
        bp4.w2 w2Var2 = k0Var.F;
        android.graphics.RectF rect = k0Var.f23216o;
        com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout multiEditCropOperationLayout = k0Var.f23211g;
        if (!z19 || k0Var.f23223v == null) {
            float f18 = i18;
            float c17 = dq4.c.f242369a.c() * f18;
            float f19 = 0.5625f * f18;
            int h18 = i65.a.h(context, com.tencent.mm.R.dimen.f479657bu);
            int h19 = i65.a.h(context, com.tencent.mm.R.dimen.f479669c6);
            if (z18) {
                h19 = i65.a.b(context, 224) + i65.a.h(context, com.tencent.mm.R.dimen.f479704cz);
            }
            int h27 = (((com.tencent.mm.ui.bk.h(context).y - h18) - h19) - (z17 ? i65.a.h(context, com.tencent.mm.R.dimen.f479731dn) : 0)) - com.tencent.mm.ui.bl.c(context);
            com.tencent.mars.xlog.Log.i("MicroMsg.EditMultiPreviewPlugin", "maxVisibleHeight:" + c17 + " ,validHeight:" + h27);
            float f27 = (float) h27;
            float min = java.lang.Math.min(c17, 1.0f * f27);
            multiEditCropOperationLayout.setLimitMaxHeight(min);
            multiEditCropOperationLayout.setLimitMinHeight(f19);
            multiEditCropOperationLayout.b();
            if (min < c17) {
                float f28 = (1 - (min / c17)) * f18;
                i17 = 2;
                f17 = f28 / 2;
            } else {
                i17 = 2;
                f17 = 0.0f;
            }
            float f29 = h18 + ((f27 - min) / i17);
            rect.set(f17, f29, f18 - f17, min + f29);
        } else {
            float f37 = i18;
            float f38 = i19;
            float f39 = f37 / f38;
            dq4.c cVar = dq4.c.f242369a;
            float f47 = (1.0f / dq4.c.f242370b) + 0.01f;
            float c18 = 1.0f / cVar.c();
            android.graphics.RectF rectF = new android.graphics.RectF();
            multiEditCropOperationLayout.setVisibility(8);
            ju3.d0 d0Var = k0Var.f465332d;
            if (f39 <= f39) {
                com.tencent.mm.plugin.vlog.model.u0 u0Var = k0Var.f23223v;
                kotlin.jvm.internal.o.d(u0Var);
                int width = size.getWidth();
                int height = size.getHeight();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                java.util.Iterator it = u0Var.f175733g.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) it.next();
                    java.util.Iterator it6 = it;
                    com.tencent.mm.plugin.vlog.model.y yVar = i1Var.f175624i;
                    bp4.w2 w2Var3 = w2Var2;
                    float f48 = width * (i1Var.f175622g / i1Var.f175621f);
                    ju3.d0 d0Var2 = d0Var;
                    int i27 = height;
                    float f49 = (height - f48) / 2;
                    yVar.f175787d.set(0, (int) f49, width, (int) (f48 + f49));
                    int width2 = size.getWidth() * size.getHeight();
                    android.graphics.Rect rect3 = yVar.f175787d;
                    if (width2 < rect3.width() * rect3.height()) {
                        rect2.set(0, 0, size.getWidth(), size.getHeight());
                    } else {
                        rect2.set(rect3);
                    }
                    android.graphics.Matrix matrix = yVar.f175784a;
                    com.tencent.mm.plugin.vlog.model.q0.b(matrix, new android.graphics.RectF(0.0f, 0.0f, i1Var.f175621f, i1Var.f175622g), new android.graphics.RectF(rect2));
                    float a17 = com.tencent.mm.plugin.vlog.model.q0.a(matrix);
                    yVar.f175788e = a17;
                    yVar.f175789f = 5.0f * a17;
                    yVar.f175790g = a17 * 0.25f;
                    i1Var.f175627l.f397514p = true;
                    it = it6;
                    height = i27;
                    w2Var2 = w2Var3;
                    d0Var = d0Var2;
                    width = width;
                }
                w2Var = w2Var2;
                float f57 = f37 / c18;
                float f58 = (f38 - f57) / 2;
                rectF.set(0.0f, f58, f37, f57 + f58);
                rect.set(0.0f, 0.0f, f37, f38);
                multiEditCropOperationLayout.f176120p1 = false;
                ju3.c0 c0Var = ju3.c0.E1;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("PARAM_1_INT", 3);
                d0Var.w(c0Var, bundle);
                k0Var = this;
            } else {
                w2Var = w2Var2;
                if (f39 <= f47) {
                    k0Var = this;
                    com.tencent.mm.plugin.vlog.model.u0 u0Var2 = k0Var.f23223v;
                    if (u0Var2 != null) {
                        u0Var2.x(true, size);
                    }
                    float f59 = f37 / c18;
                    float f66 = (f38 - f59) / 2;
                    rectF.set(0.0f, f66, f37, f59 + f66);
                    com.tencent.mm.plugin.vlog.model.u0 u0Var3 = k0Var.f23223v;
                    if (u0Var3 != null) {
                        rect.set(u0Var3.t());
                    }
                    multiEditCropOperationLayout.f176120p1 = false;
                    ju3.c0 c0Var2 = ju3.c0.E1;
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putInt("PARAM_1_INT", 3);
                    d0Var.w(c0Var2, bundle2);
                } else {
                    k0Var = this;
                    if (f39 <= c18) {
                        com.tencent.mm.plugin.vlog.model.u0 u0Var4 = k0Var.f23223v;
                        kotlin.jvm.internal.o.d(u0Var4);
                        u0Var4.x(true, size);
                        float f67 = f37 / c18;
                        float f68 = (f38 - f67) / 2;
                        rectF.set(0.0f, f68, f37, f67 + f68);
                        com.tencent.mm.plugin.vlog.model.u0 u0Var5 = k0Var.f23223v;
                        kotlin.jvm.internal.o.d(u0Var5);
                        rect.set(u0Var5.t());
                        multiEditCropOperationLayout.f176120p1 = false;
                        ju3.c0 c0Var3 = ju3.c0.E1;
                        android.os.Bundle bundle3 = new android.os.Bundle();
                        bundle3.putInt("PARAM_1_INT", 3);
                        d0Var.w(c0Var3, bundle3);
                    } else if (f39 <= 1.7777778f) {
                        com.tencent.mm.plugin.vlog.model.u0 u0Var6 = k0Var.f23223v;
                        kotlin.jvm.internal.o.d(u0Var6);
                        u0Var6.x(true, size);
                        com.tencent.mm.plugin.vlog.model.u0 u0Var7 = k0Var.f23223v;
                        kotlin.jvm.internal.o.d(u0Var7);
                        rectF.set(u0Var7.t());
                        com.tencent.mm.plugin.vlog.model.u0 u0Var8 = k0Var.f23223v;
                        kotlin.jvm.internal.o.d(u0Var8);
                        rect.set(u0Var8.t());
                        ju3.c0 c0Var4 = ju3.c0.E1;
                        android.os.Bundle bundle4 = new android.os.Bundle();
                        bundle4.putInt("PARAM_1_INT", 3);
                        d0Var.w(c0Var4, bundle4);
                    } else {
                        com.tencent.mm.plugin.vlog.model.u0 u0Var9 = k0Var.f23223v;
                        kotlin.jvm.internal.o.d(u0Var9);
                        u0Var9.x(true, size);
                        com.tencent.mm.plugin.vlog.model.u0 u0Var10 = k0Var.f23223v;
                        kotlin.jvm.internal.o.d(u0Var10);
                        rectF.set(u0Var10.t());
                        com.tencent.mm.plugin.vlog.model.u0 u0Var11 = k0Var.f23223v;
                        kotlin.jvm.internal.o.d(u0Var11);
                        rect.set(u0Var11.t());
                        ju3.c0 c0Var5 = ju3.c0.E1;
                        android.os.Bundle bundle5 = new android.os.Bundle();
                        bundle5.putInt("PARAM_1_INT", 3);
                        d0Var.w(c0Var5, bundle5);
                    }
                }
            }
            com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropLayout multiEditCropLayout = k0Var.f23210f;
            multiEditCropLayout.setEnableTouch(true);
            multiEditCropLayout.setEnableScale(false);
            multiEditCropLayout.setEnableFling(false);
            multiEditCropLayout.setEnableScroll(false);
            multiEditCropOperationLayout.setLimitMaxHeight(rectF.height());
            multiEditCropOperationLayout.setLimitMinHeight(rectF.height());
            multiEditCropOperationLayout.getVisibilityRect().set(rectF);
            multiEditCropOperationLayout.getMaxVisibilityRect().set(rect);
            multiEditCropOperationLayout.postInvalidate();
            multiEditCropOperationLayout.showGridLine = true;
            android.graphics.Rect rect4 = k0Var.f23227z;
            rectF.round(rect4);
            rect4.offset(-((int) rect.left), -((int) rect.top));
            com.tencent.mm.plugin.vlog.model.u0 u0Var12 = k0Var.f23223v;
            kotlin.jvm.internal.o.d(u0Var12);
            kotlin.jvm.internal.o.g(rect, "maxVisibleRect");
            int i28 = 0;
            for (java.lang.Object obj : u0Var12.f175733g) {
                int i29 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.vlog.model.i1 i1Var2 = (com.tencent.mm.plugin.vlog.model.i1) obj;
                com.tencent.mm.plugin.vlog.model.y yVar2 = i1Var2.f175624i;
                if (i28 == 0) {
                    yVar2.f175787d.offset(-((int) rect.left), -((int) rect.top));
                }
                i1Var2.f175627l.f397512n.set(yVar2.f175787d);
                yVar2.f175786c.set(yVar2.f175787d);
                i28 = i29;
            }
            int i37 = com.tencent.mm.ui.widget.cropview.CropLayout.f211650l1;
            multiEditCropLayout.z(rectF, false);
            k0Var.A = true;
            multiEditCropLayout.f176117p1 = true;
            multiEditCropOperationLayout.f176118l1 = true;
            w2Var2 = w2Var;
            w2Var2.f23410o = true;
        }
        w2Var2.getClass();
        kotlin.jvm.internal.o.g(rect, "rect");
        w2Var2.f23407i.set(rect);
        com.tencent.mm.plugin.vlog.model.u0 u0Var13 = k0Var.f23223v;
        if (u0Var13 != null) {
            int width3 = (int) rect.width();
            int height2 = (int) rect.height();
            u0Var13.f175736m = width3;
            u0Var13.f175737n = height2;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ju3.d0.k(this.f465332d, ju3.c0.f301914x2, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void onDetach() {
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = this.f23214m;
        if (videoCompositionPlayView == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(videoCompositionPlayView, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        videoCompositionPlayView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(videoCompositionPlayView, "com/tencent/mm/plugin/vlog/ui/plugin/EditMultiPreviewPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // yt3.r2
    public void release() {
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = this.f23214m;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.g();
            this.f23214m = null;
        }
        this.f23217p.clear();
    }

    @Override // yt3.r2
    public void reset() {
        this.f23220s = 0L;
        this.f23210f.E(true);
    }

    public final void z() {
        dp4.b bVar = dp4.b.f242262a;
        if (com.tencent.mm.sdk.platformtools.o4.M("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_SCENE_INT_SYNC", 0) == 1) {
            android.widget.TextView textView = this.f23225x;
            android.view.ViewParent parent = textView.getParent();
            android.view.ViewGroup viewGroup = this.f23213i;
            if (kotlin.jvm.internal.o.b(parent, viewGroup)) {
                return;
            }
            textView.setTextColor(-65536);
            int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
            textView.setTextSize(dimensionPixelSize);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = ((int) this.f23216o.top) + dimensionPixelSize;
            layoutParams.rightMargin = dimensionPixelSize;
            layoutParams.addRule(10);
            layoutParams.addRule(21);
            viewGroup.addView(textView, 1, layoutParams);
        }
    }
}
